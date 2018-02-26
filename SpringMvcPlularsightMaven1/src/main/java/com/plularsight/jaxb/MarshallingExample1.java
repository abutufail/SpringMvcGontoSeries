package com.plularsight.jaxb;


import com.pluralsight.admission.controller.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
//import java.math.BigDecimal;
//import java.util.Arrays;
 //ddd
/**
 * Simple JAXB marshalling example.
 */
public class MarshallingExample1 {

    public static void main(String[] args) throws JAXBException {
        Student purchaseOSrder = createPurchaseOrder();

        // Create the JAXB context
        JAXBContext context = JAXBContext.newInstance(Student.class);

        // Create a marshaller
        Marshaller marshaller = context.createMarshaller();

        // To make the XML easier to read for humans, specify that we want it to be formatted
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Create a JAXB element wrapper
        QName rootElementName = new QName(null, "item1");
        JAXBElement<Student> rootElement =
                new JAXBElement<>(rootElementName, Student.class, purchaseOSrder);

        // Marshal and output to the console
        marshaller.marshal(rootElement, System.out);
    }

    private static Student createPurchaseOrder() {
    	//Student student = new Student();
    	
    	List<Student> student = new LinkedList<Student>();
    	
    
    	
    	
        Student item1 = new Student();

      
        item1.setStudentName("abu");
        item1.setStudentHobby("music");
        Student item2 = new Student();

        item2.setStudentName("abd");
        item2.setStudentHobby("riding");

       

   

        return item1;
    }
}
