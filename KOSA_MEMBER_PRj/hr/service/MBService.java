package com.team5.myapp.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team5.myapp.hr.dao.IMBRepository;
import com.team5.myapp.hr.model.MBVO;
import com.team5.myapp.hr.model.gHistoryVO;

@Service
public class MBService implements IMBService {
	
	@Autowired
	IMBRepository mbRepository;

	@Override
	public int getMBCount() {
		return mbRepository.getMBCount();
	}

	@Override
	public int getMBCount(int groupid) {
		return mbRepository.getMBCount(groupid);
	}

	@Override
	public List<MBVO> getMBList() {
		return mbRepository.getMBList();
	}

	@Override
	public List<gHistoryVO> getGroupHistoryList() {
		return mbRepository.getGroupHistoryList();
	}

	@Override
	public MBVO getMBInfo(int memid) {
		return mbRepository.getMBInfo(memid);
	}

	@Override
	public void updateMB(MBVO mb) {
		mbRepository.updateMB(mb);
	}

	@Override
	public void insertMB(MBVO mb) {
		mbRepository.insertMB(mb);

	}

	@Override
	public List<gHistoryVO> getGroupHistory(int memid) {
		return mbRepository.getGroupHistory(memid);
	}

	@Override
	@Transactional
	public void deleteMB(int memid, String email) {
		mbRepository.deleteGroupHistory(memid);
		mbRepository.deleteMB(memid, email);
	}

	@Override
	public List<Map<String, Object>> getAllGroupId() {
		return mbRepository.getAllGroupId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return mbRepository.getAllManagerId();
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		return mbRepository.getAllJobId();
	}

}
