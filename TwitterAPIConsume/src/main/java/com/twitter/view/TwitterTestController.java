package com.twitter.view;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TwitterTestController {
	
	@RequestMapping(value = "{id}")
	public String getUser(@PathVariable long id) {
		
		String consumerKey = "uWiZKK8TsT7Xxq5aRz9nxv00o"; // The application's consumer key
		String consumerSecret = "075olTUi7qTbAVtvBG1azDNO1dSbaXGjdoYwvI8rZGowkM6isE"; // The application's consumer secret
		String accessToken = "296444126-ukjdyxHKt6Tbwz7ix9bPrvOFCzPA5gTbK9mCKXa2"; // The access token granted after OAuth authorization
		String accessTokenSecret = "f61mJfhf3bdO8YEKK7xDTHjZ8QUCKZkGg3BAyOx2GDkuE"; // The access token secret granted after OAuth authorization
		Twitter twitter = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
	
	return twitter.userOperations().getUserProfile(id).getScreenName();
	}

}
