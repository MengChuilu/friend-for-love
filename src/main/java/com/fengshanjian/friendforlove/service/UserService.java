package com.fengshanjian.friendforlove.service;

import com.fengshanjian.friendforlove.repo.dao.MemberMapper;
import com.fengshanjian.friendforlove.repo.model.Member;
import com.fengshanjian.friendforlove.repo.model.MemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public MemberMapper mapper;

    public Member getUserInfoByOpenId(String openId) {
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        List<Member> members = mapper.selectByExample(example);
        if (members == null || members.size() != 1) {
            return null;
        }

        return members.get(0);
    }
}
