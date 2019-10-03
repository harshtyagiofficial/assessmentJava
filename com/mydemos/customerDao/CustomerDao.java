package com.mydemos.customerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mydemos.dbutil.Dbconn;
import com.mydemos.pojo.Customer;

public class CustomerDao {
	
	public int generateSequence() {
		
		
		try {
			Connection con = Dbconn.getConnection();
			
			String sql = "select customerSeq.nextval from dual";
			PreparedStatement stat = con.prepareStatement(sql);
			ResultSet seq = stat.executeQuery();
			
			if (seq.next()) {
				return (seq.getInt(1));
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		
		
		
		
	}
	
	public String saveCustomer(Customer customer) {
		
		String custId="";
		try {
			Connection con = Dbconn.getConnection();
			String sql = "INSERT INTO customer VALUES (?,?,?,?)";
			PreparedStatement stat = con.prepareStatement(sql);
			
			int seqNum = generateSequence();
			
			if (seqNum<=9) {
				custId+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"00"+seqNum;
			customer.setCustId(custId);
			}
			else if(seqNum<=99 && seqNum>=10) {
				custId+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"0"+seqNum;
				customer.setCustId(custId);
			}
			
			
			stat.setString(1, customer.getCustName());
			stat.setString(2,  customer.getCustLastName());
			stat.setString(3, customer.getCustId());
			stat.setString(4, customer.getAddress());
			
			int res = stat.executeUpdate();
			if(res > 0) {
				System.out.println("Customer Saved Successfully");
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "Customer Not Saved";
	}
	
	
	
		
}
	
	

