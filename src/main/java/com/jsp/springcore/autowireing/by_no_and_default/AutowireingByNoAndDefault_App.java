package com.jsp.springcore.autowireing.by_no_and_default;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;




public class AutowireingByNoAndDefault_App 
{
    public static void main( String[] args )
    {
        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("AutoWireingByDefaultAndNo.xml"));
        
        Person person = (Person)bf.getBean("person-bean");
        System.out.println(person);
        System.out.println(bf.getBean(Bike.class));
        
        
       
        
             
        
    }
}
