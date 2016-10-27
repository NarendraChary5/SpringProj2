package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import beans.Flipkart;

public class ClientApp {

	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/cfg/applicationContext.xml"));
		Flipkart bean=factory.getBean("flipkart",Flipkart.class);
		bean.purchase(new String[]{"Book","Shirt"});
	}
}