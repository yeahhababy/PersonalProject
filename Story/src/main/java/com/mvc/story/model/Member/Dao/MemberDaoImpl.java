package com.mvc.story.model.Member.Dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.story.model.Member.Dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public List<MemberDto> Member_selectList() {
		return null;
	}

	@Override
	public MemberDto Member_selectOne() {
		return null;
	}

	@Override
	public int Member_insert() {
		return 0;
	}

	@Override
	public int Member_update() {
		return 0;
	}

	@Override
	public int Member_delete() {
		return 0;
	}

}
