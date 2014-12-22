package com.slumdog.quotes.service;

import com.slumdog.quotes.entity.Quote;

import java.util.ArrayList;
import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.NotFoundException;

@Api(name="quoteapi",version="1",description="API for managing quotes")
public class QuoteServiceAPI {
	public static List<Quote> quotes = new ArrayList<Quote>();
	
	@ApiMethod(name="add")
	public Quote addQuote(@Named("id") Integer id, @Named("author") String author, @Named("message") String message) throws NotFoundException
	{
		int index = quotes.indexOf(new Quote(id));
		if (index > -1) throw new NotFoundException("Quote already exists.");
		Quote newQuote = new Quote(id,author,message);
		quotes.add(newQuote);
		
		return newQuote;
	}
	
	@ApiMethod(name="update")
	public Quote updateQuote(Quote q) throws NotFoundException
	{
		int index = quotes.indexOf(q);
		if (index == -1) throw new NotFoundException("Quote doesn't exist.");
		Quote curQuote = quotes.get(index);
		curQuote.setAuthor(q.getAuthor());
		curQuote.setMessage(q.getMessage());
		return curQuote;
	}
	
	@ApiMethod(name="getQuote")
	public Quote getQuote(@Named("id") Integer id) throws NotFoundException
	{
		int index = quotes.indexOf(new Quote(id));
		if (index == -1) throw new NotFoundException("Quote doesn't exist");
		return quotes.get(index);
	}
	
	@ApiMethod(name="list")
	public List<Quote> getQuotes()
	{
		return quotes;
	}
	
	@ApiMethod(name="remove")
	public void removeQuote(@Named("id") Integer id) throws NotFoundException
	{
		int index = quotes.indexOf(new Quote(id));
		if (index == -1) throw new NotFoundException("Quote doesn't exist.");
		quotes.remove(index);
	}	
}
