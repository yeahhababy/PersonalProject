package com.mvc.story.model.Member.Dao;

import java.util.List;

import com.mvc.story.model.Member.Dto.MemberDto;

public interface MemberDao {

	String NAMESPACE="member.";
	
	public List<MemberDto> Member_selectList();
	
	public MemberDto Member_selectOne();
	
	public int Member_insert();
	
	public int Member_update();
	
	public int Member_delete();
}
