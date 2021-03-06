package it.polito.bigdata.hadoop;

import java.io.*;

public class DateIncome implements org.apache.hadoop.io.Writable {
	
	private String date;
	private float income;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	
	@Override
	public void readFields(DataInput in) throws IOException{
		income = in.readFloat();
		date = in.readUTF();
	}
	
	@Override
	public void write(DataOutput out) throws IOException{
		out.writeFloat(income);
		out.writeUTF(date);
	}
	
	public String toString() {
		String formattedString = new String("date: " + date + " income: " + income);
		return formattedString;
	}
	
}