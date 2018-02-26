package com.tiaa.admissioncontrollertest;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.CoreMatchers.is;

import com.pluralsight.admission.controller.Student;

public class mokitoStudent {
	   @Mock
	    private Student daoMock;
//	    @InjectMocks
//	    private CustomerService service;
//	    @Before
//	    public void setUp() throws Exception {
//	        MockitoAnnotations.initMocks(this);
//	    }
	     @Test
	        public void testAddCustomer_returnsNewCustomer() {
	    	 MockitoAnnotations.initMocks(this);
	            when(daoMock.getStudentMobile());
	            Student customer = new Student();
	           // customer.setStudentMobile(222);		// mokito or dummy value
	            //assertThat(customer.getStudentMobile(), is(notNullValue());
	            assertThat(customer.getStudentMobile(), is(notNullValue()));
	        }
	
}
