package com.twitter.view;

import org.springframework.boot.autoconfigure.web.ErrorController;

public class ErrorPageController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "error";
	}

}
