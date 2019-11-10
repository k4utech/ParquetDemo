package com.singhkis.parquet;

import org.apache.avro.Schema;

public class UserRankBackUp implements org.apache.avro.specific.SpecificRecord{
	
	
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserRank\",\"namespace\":\"com.singhkis.parquet\",\"fields\":[{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"rank\",\"type\":\"int\"}]}");
	
	private int userId;
	private int rank;
	
	
	public UserRankBackUp(int userId, int rank) {
		super();
		this.userId = userId;
		this.rank = rank;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	@SuppressWarnings(value="unchecked")
	public void put(int field$, java.lang.Object value$) {
	   switch (field$) {
	   case 0: userId = (java.lang.Integer)value$; break;
	   case 1: rank = (java.lang.Integer)value$; break;
	   default: throw new org.apache.avro.AvroRuntimeException("Bad index");
	  }
	}

	@Override
	public java.lang.Object get(int field$) {
	  switch (field$) {
	  case 0: return userId;
	  case 1: return rank;
	  default: throw new org.apache.avro.AvroRuntimeException("Bad index");
	  }
	}
	
	
	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}

	@Override
	public String toString() {
		return "UserRank [userId=" + userId + ", rank=" + rank + "]";
	}
	
	
}
