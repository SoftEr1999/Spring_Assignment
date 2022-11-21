package com.spring.agent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("agentconfig.xml");

    	
    	
    	 agentDao dao=(agentDao)context.getBean("adao");  
    	 
    	 
    	 /* Code for Insertion */
    	    int status=dao.saveAgent(new agent(103,"Isha","59 sft.","59%"));  
    	    System.out.println(status);  
    	    
    	 
    	 /* Code for Updation */
    	    int status1=dao.updateAgent(new agent(103,"Isha Gaur","59 sft.","59%")); 
    	    System.out.println(status1); 
    	      
    	     /* Code for Deletion */     
    	    agent a=new agent(); 
    	    a.setId(103); 
    	    int status2=dao.deleteAgent(a); 
    	    System.out.println(status2);  
    }
}
