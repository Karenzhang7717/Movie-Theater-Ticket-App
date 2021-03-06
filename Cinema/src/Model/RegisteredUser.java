package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Control.DBController;

public class RegisteredUser extends User {
	
	public int registerUser(RegisteredUser user) {
		int num=0;
		int uid =  (int) (Math.random() * (10000 - 999) + 1);
		String sql="insert into registered_user(uid,uname,upassword,uaddress,uemail,upaiddate,ucard)values("+
		uid+",'"+user.getName()+"','"+user.getPwd()+"','"+user.getAddress()+"','"+user.getEmail()+"',now(),'"+user.getCreditCard()+"')";
		System.out.println(sql);
		DBController db = new DBController();
		num = db.insertToTable(sql);
		return num;
	}
	
	
	public User login(String username,String password) {
		String sql="select * from registered_user where uname='"+username+"' and upassword='"+password+"'";
		return queryUser(sql);
	}
	
	public User getUserById(String userId) {
		String sql="select * from registered_user where uid='"+userId+"'";
		return queryUser(sql);
	}

	private User queryUser(String sql) {
		DBController db = new DBController();
		ResultSet rs = db.readFromTable(sql);
		try {
			if(rs.next()) {
			   User user = new RegisteredUser();
			  user.setUserId(rs.getInt("uid"));
			  user.setCreditCard(rs.getString("ucard"));
			  user.setName(rs.getString("uname"));
			  user.setPwd(rs.getString("upassword"));
			  user.setEmail(rs.getString("uemail"));
			  return user;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private boolean paidAnnual() {
		return true;
	}

	public boolean refund() {
		double price = AppSeting.movie.getPrice();
		String creditCard = AppSeting.user.getCreditCard();

		DBController db = new DBController();
		String sql = "update bankaccount set balance=balance+" + price + " where acard="+creditCard;
		System.out.println(sql);
		int num = db.insertToTable(sql);
		if (num == -1) {
			return false;
		
		}
		String sql2 = "delete from ticket where ticketid=" + AppSeting.ticket.getTicketId();
		System.out.println(sql2);
		num = db.insertToTable(sql2);
		if (num == -1) {
			return false;
		
		}
		return true;
	}
	
	
	@Override
	public boolean checkUserInfo(String username, String card, String pwd, String email) {
		
			if (!username.equals(AppSeting.user.getName())||!pwd.equals(AppSeting.user.getPwd())||(!card.equals(AppSeting.user.getCreditCard() + ""))||!email.equals(AppSeting.user.getEmail())) {
			
				return false;
			}
			return true;
		

}
	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getRefund(int receiptId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getUserInformation() {
		// TODO Auto-generated method stub
	}
}
