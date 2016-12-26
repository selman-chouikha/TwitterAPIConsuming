package com.twitter.web.api;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.model.CustomDate;
import com.twitter.model.Tweet;
import com.twitter.model.TwitterUser;
import com.twitter.repository.TwitterUserRepository;


@RestController
@RequestMapping("/")
public class TwitterTestController {
	
	private TwitterUserRepository twitterUserRepository;
	private Twitter twitter;
	private Calendar calendar = Calendar.getInstance();
	
	
	@Autowired
	public TwitterTestController(TwitterUserRepository twitterUserRepository) {
		this.twitterUserRepository = twitterUserRepository;
	}
	
	public Twitter connectTwitter() {
		String consumerKey = "uWiZKK8TsT7Xxq5aRz9nxv00o"; // The application's consumer key
		String consumerSecret = "075olTUi7qTbAVtvBG1azDNO1dSbaXGjdoYwvI8rZGowkM6isE"; // The application's consumer secret
		String accessToken = "296444126-ukjdyxHKt6Tbwz7ix9bPrvOFCzPA5gTbK9mCKXa2"; // The access token granted after OAuth authorization
		String accessTokenSecret = "f61mJfhf3bdO8YEKK7xDTHjZ8QUCKZkGg3BAyOx2GDkuE"; // The access token secret granted after OAuth authorization
		Twitter twitter = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		return twitter;
	}
	public void saveUser(TwitterProfile twitterProfile ) {
		TwitterUser user;
		calendar.setTime(twitterProfile.getCreatedDate());
		CustomDate customDate = new CustomDate(calendar.get(Calendar.DAY_OF_MONTH) ,calendar.get(Calendar.MONTH),calendar.get(Calendar.YEAR),Time.valueOf(calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)));
		user = new TwitterUser(twitterProfile.getId(),
				twitterProfile.getName(),
				twitterProfile.getScreenName(),
				twitterProfile.getDescription(),
				twitterProfile.getLocation(),
				twitterProfile.getUrl(),
				customDate);
		twitterUserRepository.save(user);	
	}
	public void saveTweets(Twitter twitter, Long id) {
		List<org.springframework.social.twitter.api.Tweet> tweetList = twitter.timelineOperations().getUserTimeline();
		
		for(org.springframework.social.twitter.api.Tweet tweet : tweetList) {
			
			tweet.getFromUserId();
			tweet.getCreatedAt();
			tweet.isRetweet();
			tweet.getFavoriteCount();
			tweet.hasMedia();
			tweet.getText();
			tweet.getEntities().getMedia().get(0).getMediaSecureUrl();
		}
		
	}
	@RequestMapping(value = "{id}")
	public String getUser(@PathVariable long id) {
		twitter = connectTwitter();
		TwitterProfile twitterProfile = twitter.userOperations().getUserProfile(id);
		saveUser(twitterProfile);
		
		return twitterProfile.getScreenName();
	}
	
	@RequestMapping("all")
	public List<TwitterUser> getAll() {
		return twitterUserRepository.findAll();
	}

}
