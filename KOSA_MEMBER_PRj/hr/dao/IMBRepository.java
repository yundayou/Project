package com.team5.myapp.hr.dao;

import java.util.List;
import java.util.Map;

import com.team5.myapp.hr.model.MBVO;
import com.team5.myapp.hr.model.gHistoryVO;

public interface IMBRepository {
	// 전체 협회원 수 조회
	int getMBCount();
	// 그룹별 학생 수 조회
	int getMBCount(int groupid);
	// 협회원 전체 리스트
	List<MBVO> getMBList();
	// 협회원 전체 조 변경 내역 리스트
	List<gHistoryVO> getGroupHistoryList();
	// 멤버번호의 멤버 한명 반환
	MBVO getMBInfo(int memid);
	// 멤버 업데이트
	void updateMB(MBVO mb);
	// 신규 멤버 삽입
	void insertMB(MBVO mb);
	// 특정 멤버의 조 변경 내역 조회
	List<gHistoryVO> getGroupHistory(int memid);
	// 특정 멤버의 조 변경 내역 삭제
	void deleteGroupHistory(int memid);
	// 멤버번호의 멤버 한명 삭제
	void deleteMB(int memid, String email);
	// 모든 조 정보 반환
	List<Map<String, Object>> getAllGroupId();
	// 모든 매니저 정보 반환
	List<Map<String, Object>> getAllManagerId();
	// 모든 job 정보 반환
	List<Map<String,Object>> getAllJobId();

}
