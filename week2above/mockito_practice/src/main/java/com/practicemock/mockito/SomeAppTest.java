package com.practicemock.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;



import com.practicemockdb.dao.DatabaseDAO;
import com.practicemocknetwork.dao.NetworkDAO;
import com.practicemockservice.RecordService;

@RunWith(MockitoJUnitRunner.class)

public class SomeAppTest {
	
	 @InjectMocks
	 RecordService recordService;
	 
	 @Mock
	 DatabaseDAO databaseMock;
	 
	 @Mock
	 NetworkDAO networkMock;
	 
	 @Test
	 public void saveTest() {
		 boolean saved = recordService.save("temp.txt");
		 assertEquals(true, saved);
		 
		 verify(databaseMock, times(1)).save("temp.txt");
		 verify(networkMock, times(1)).save("temp.txt");
		 
	 }
	 
	 
	


}