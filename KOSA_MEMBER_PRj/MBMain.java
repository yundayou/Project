package com.team5.myapp;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.team5.myapp.hr.model.MBVO;
import com.team5.myapp.hr.model.gHistoryVO;
import com.team5.myapp.hr.service.IMBService;

public class MBMain {

	public static void main(String[] args) {
		AbstractApplicationContext context
							= new GenericXmlApplicationContext("spring/application-config.xml");
		IMBService mbService = context.getBean("MBService", IMBService.class);
//		
//		System.out.println("== 멤버 수 조회");
//		System.out.println(mbService.getMBCount());
//		System.out.println("-- 5조 멤버 수 조회");
//		System.out.println(mbService.getMBCount(5));
//		
//		System.out.println("== 1번 멤버의 정보 조회");
//		System.out.println(mbService.getMBInfo(1));
//		
//		System.out.println("== 사원 전체 정보 조회");
//		for(MBVO mb : mbService.getMBList()) {
//			System.out.println(mb);
//		}
//		
//		System.out.println("== 새로운 사원 정보를 입력합니다.");
//		MBVO mb = new MBVO();
//		mb.setMemberId(100);
//		mb.setFirstName("Test");
//		mb.setLastName("Testee");
//		mb.setEmail("Test@naver.com");
//		mb.setPhoneNumber("02-000-0000");
//		mb.setJobId("ST");
//		mb.setManagerId(1);
//		mb.setGroupId(5);
//		mb.setRoleId(null);
//		
//		try {
//			mbService.insertMB(mb);
//			System.out.println("insert ok");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("== 신규 사원 정보를 조회");
//		MBVO mb100 = mbService.getMBInfo(100);
//		System.out.println(mb100);
//		
//		System.out.println("== 신규 사원의 전화번호를 수정");
//		mb100.setPhoneNumber("02-268-2052");
//		mbService.updateMB(mb100);
//		
//		System.out.println("== 신규 사원의 수정된 정보를 조회");
//		mb100 = mbService.getMBInfo(100);
//		System.out.println(mb100);
//		
//		System.out.println("== 신규 사원의 정보를 삭제합니다.");
//		mbService.deleteMB(100, mb100.getEmail());
//		System.out.println("삭제 완료.");
//		
//		System.out.println("== 모든 조번호와 조이름 정보를 출력");
//		for(Map<String, Object> group : mbService.getAllGroupId()) {
//			System.out.println(group);
//		}
//		
//		System.out.println("== 모든 직무아이디와 직무 타이틀을 출력");
//		for(Map<String, Object> job : mbService.getAllJobId()) {
//			System.out.println(job);
//		}
//		
//		System.out.println("== 모든 매니저번호와 매니저이름을 출력");
//		for(Map<String, Object> manager : mbService.getAllManagerId()) {
//			System.out.println(manager);
//		}
//		
//		System.out.println("== 그룹 변경 이력 조회");
//		for(gHistoryVO g : mbService.getGroupHistoryList()) {
//			System.out.println(g);
//		}
//	
//		System.out.println("== 특정 멤버(17)에 대해 그룹 변경 이력 조회");
//		for(gHistoryVO g : mbService.getGroupHistory(17)) {
//			System.out.println(g);
//		}
		
		
		context.close();
	}
	
	

}
