package com.slumdog.quotes.service;
import java.util.ArrayList;
import java.util.List;

import com.slumdog.quotes.entity.Quote;;

public class QuoteService {
	public static List<Quote> quotes = new ArrayList<Quote>();
	
	public Quote addQuote(Integer id, String author, String message) throws Exception
	{
		int index = quotes.indexOf(new Quote(id));
		if (index > -1) throw new Exception ("Quote already exists.");
		Quote newQuote = new Quote(id,author,message);
		quotes.add(newQuote);
		return newQuote;
	}
	
	public Quote updateQuote(Quote q) throws Exception
	{
		int index = quotes.indexOf(q);
		if (index == -1) throw new Exception ("Quote doesn't exist.");
		Quote curQuote = quotes.get(index);
		curQuote.setAuthor(q.getAuthor());
		curQuote.setMessage(q.getMessage());
		return curQuote;
	}
	
	public Quote getQuote(Integer id) throws Exception
	{
		int index = quotes.indexOf(new Quote(id));
		if (index == -1) throw new Exception ("Quote doesn't exist.");
		return quotes.get(index);
	}
	
	public List<Quote> listQuotes()
	{
		return quotes;
	}
	
	public void removeQuote(Integer id) throws Exception
	{
		int index = quotes.indexOf(new Quote(id));
		if (index == -1) throw new Exception ("Quote doesn't exist");
		quotes.remove(index);
	}
}
