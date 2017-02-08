package com.tieto.praj.dao;

import java.math.BigInteger;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tieto.praj.bean.Emp;

public class Empdao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save1(Emp p) {
		String sql = "insert into tcashuser(mobile_no,amount,date,comment) values(" + p.getMob_no() + ","
				+ p.getAmount() + ",CURRENT_TIMESTAMP(),'" + p.getComm() + "')";

		return template.update(sql);

	}

	public int save2(Emp p) {

		int number = p.getAmount();
		// int result = Integer.parseInt(number);
		BigInteger p2 = p.getMob_no();
		// submit(p);

		String sql1 = "update tcashuser set amount=amount+" + number + " where mobile_no='" + p2 + "'";

		return template.update(sql1);

	}

	public boolean save(Emp p) {
		BigInteger n = p.getMob_no();
		/*
		 * if(n==0){ save1(p); return false;
		 * 
		 * }
		 */
		boolean mob = false;

		int count = template.queryForInt("select count(*) from tcashuser " + " where mobile_no = ?", n);
		if (count == 1) {
			mob = true;
			save2(p);

		} else {
			save1(p);
		}
		return mob;
	}
}

