package com.example.demo;

import com.example.designMode.Strategy.CaseHandler;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CaseHandler caseHandler;

	@Test
	void test() throws Exception{
		caseHandler.getCaseStatus();
	}

	@Test
	public void test2() throws Exception{
		caseHandler.getYiBanCaseStatus();
	}

}
