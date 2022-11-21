package com.spring.agent;

import org.springframework.jdbc.core.JdbcTemplate;


public class agentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveAgent(agent e){  
	    String query="insert into agent values('"+e.getId()+"','"+e.getName()+"','"+e.getArea()+"','"+e.getAgentCommision()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateAgent(agent e){  
	    String query="update agent set name='"+e.getName()+"',area='"+e.getArea()+"',areacommision='"+e.getAgentCommision()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteAgent(agent e){  
	    String query="delete from agent where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  


}
