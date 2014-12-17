package com.slumdog.quotes.service;

import com.slumdog.quotes.entity.Quote;

import java.util.ArrayList;
import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name="quoteapi",version="1",description="API for managing quotes")
public class QuoteServiceAPI {
	public static List<Quote> quotes = new ArrayList<Quote>();
	
	//@ApiMethod(name="add")
	//public Quote addQuote()
	
}
