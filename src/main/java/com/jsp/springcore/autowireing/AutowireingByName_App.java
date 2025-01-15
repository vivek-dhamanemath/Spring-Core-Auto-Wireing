package com.jsp.springcore.autowireing;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AutowireingByName_App 
{
    public static void main( String[] args )
    {
        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("AutoWireingByName.xml"));
        
        Person person = bf.getBean(Person.class);
        System.out.println(person);
        System.out.println(person.getBike());
        
        
    }
}
