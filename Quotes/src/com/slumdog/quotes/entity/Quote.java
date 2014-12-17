package com.slumdog.quotes.entity;

public class Quote {
	Integer id;
	String message;
	String author; 
	
	public Quote() {
		super();
	}
	
	public Quote(Integer id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
	}
	
	public Quote(Integer id) {
		super();
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quote other = (Quote) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", message=" + message + ", author="
				+ author + "]";
	}
}
