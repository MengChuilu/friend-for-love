package com.fengshanjian.friendforlove.repo.dao;

import com.fengshanjian.friendforlove.repo.model.Member;
import com.fengshanjian.friendforlove.repo.model.MemberExample;
import com.fengshanjian.friendforlove.repo.model.MemberWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(MemberWithBLOBs record);

    int insertSelective(MemberWithBLOBs record);

    List<MemberWithBLOBs> selectByExampleWithBLOBs(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    MemberWithBLOBs selectByPrimaryKey(Integer memberid);

    int updateByExampleSelective(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(MemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberWithBLOBs record);

    int updateByPrimaryKey(Member record);
}