package com.jsp.springcore.autowireing.by_constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AutowireingByConstructor_App 
{
    public static void main( String[] args )
    {
        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("AutoWireingByConstructor.xml"));
        
        Person person = bf.getBean(Person.class);
        System.out.println(person);
        System.out.println(person.getBike());
        
        
    }
}
