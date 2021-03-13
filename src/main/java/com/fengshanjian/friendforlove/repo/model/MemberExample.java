package com.fengshanjian.friendforlove.repo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNull() {
            addCriterion("marriage-status is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNotNull() {
            addCriterion("marriage-status is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusEqualTo(String value) {
            addCriterion("marriage-status =", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotEqualTo(String value) {
            addCriterion("marriage-status <>", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThan(String value) {
            addCriterion("marriage-status >", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marriage-status >=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThan(String value) {
            addCriterion("marriage-status <", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThanOrEqualTo(String value) {
            addCriterion("marriage-status <=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLike(String value) {
            addCriterion("marriage-status like", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotLike(String value) {
            addCriterion("marriage-status not like", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIn(List<String> values) {
            addCriterion("marriage-status in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotIn(List<String> values) {
            addCriterion("marriage-status not in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusBetween(String value1, String value2) {
            addCriterion("marriage-status between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotBetween(String value1, String value2) {
            addCriterion("marriage-status not between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andHousingIsNull() {
            addCriterion("housing is null");
            return (Criteria) this;
        }

        public Criteria andHousingIsNotNull() {
            addCriterion("housing is not null");
            return (Criteria) this;
        }

        public Criteria andHousingEqualTo(String value) {
            addCriterion("housing =", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotEqualTo(String value) {
            addCriterion("housing <>", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingGreaterThan(String value) {
            addCriterion("housing >", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingGreaterThanOrEqualTo(String value) {
            addCriterion("housing >=", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLessThan(String value) {
            addCriterion("housing <", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLessThanOrEqualTo(String value) {
            addCriterion("housing <=", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLike(String value) {
            addCriterion("housing like", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotLike(String value) {
            addCriterion("housing not like", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingIn(List<String> values) {
            addCriterion("housing in", values, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotIn(List<String> values) {
            addCriterion("housing not in", values, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingBetween(String value1, String value2) {
            addCriterion("housing between", value1, value2, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotBetween(String value1, String value2) {
            addCriterion("housing not between", value1, value2, "housing");
            return (Criteria) this;
        }

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageIsNull() {
            addCriterion("sla-marriage is null");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageIsNotNull() {
            addCriterion("sla-marriage is not null");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageEqualTo(String value) {
            addCriterion("sla-marriage =", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageNotEqualTo(String value) {
            addCriterion("sla-marriage <>", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageGreaterThan(String value) {
            addCriterion("sla-marriage >", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("sla-marriage >=", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageLessThan(String value) {
            addCriterion("sla-marriage <", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageLessThanOrEqualTo(String value) {
            addCriterion("sla-marriage <=", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageLike(String value) {
            addCriterion("sla-marriage like", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageNotLike(String value) {
            addCriterion("sla-marriage not like", value, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageIn(List<String> values) {
            addCriterion("sla-marriage in", values, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageNotIn(List<String> values) {
            addCriterion("sla-marriage not in", values, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageBetween(String value1, String value2) {
            addCriterion("sla-marriage between", value1, value2, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andSlaMarriageNotBetween(String value1, String value2) {
            addCriterion("sla-marriage not between", value1, value2, "slaMarriage");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNull() {
            addCriterion("household-registration is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNotNull() {
            addCriterion("household-registration is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationEqualTo(String value) {
            addCriterion("household-registration =", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotEqualTo(String value) {
            addCriterion("household-registration <>", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThan(String value) {
            addCriterion("household-registration >", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("household-registration >=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThan(String value) {
            addCriterion("household-registration <", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThanOrEqualTo(String value) {
            addCriterion("household-registration <=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLike(String value) {
            addCriterion("household-registration like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotLike(String value) {
            addCriterion("household-registration not like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIn(List<String> values) {
            addCriterion("household-registration in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotIn(List<String> values) {
            addCriterion("household-registration not in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationBetween(String value1, String value2) {
            addCriterion("household-registration between", value1, value2, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotBetween(String value1, String value2) {
            addCriterion("household-registration not between", value1, value2, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andChildrenIsNull() {
            addCriterion("children is null");
            return (Criteria) this;
        }

        public Criteria andChildrenIsNotNull() {
            addCriterion("children is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenEqualTo(String value) {
            addCriterion("children =", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotEqualTo(String value) {
            addCriterion("children <>", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenGreaterThan(String value) {
            addCriterion("children >", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("children >=", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLessThan(String value) {
            addCriterion("children <", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLessThanOrEqualTo(String value) {
            addCriterion("children <=", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenLike(String value) {
            addCriterion("children like", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotLike(String value) {
            addCriterion("children not like", value, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenIn(List<String> values) {
            addCriterion("children in", values, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotIn(List<String> values) {
            addCriterion("children not in", values, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenBetween(String value1, String value2) {
            addCriterion("children between", value1, value2, "children");
            return (Criteria) this;
        }

        public Criteria andChildrenNotBetween(String value1, String value2) {
            addCriterion("children not between", value1, value2, "children");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAlbumIsNull() {
            addCriterion("album is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIsNotNull() {
            addCriterion("album is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumEqualTo(String value) {
            addCriterion("album =", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotEqualTo(String value) {
            addCriterion("album <>", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumGreaterThan(String value) {
            addCriterion("album >", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumGreaterThanOrEqualTo(String value) {
            addCriterion("album >=", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLessThan(String value) {
            addCriterion("album <", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLessThanOrEqualTo(String value) {
            addCriterion("album <=", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLike(String value) {
            addCriterion("album like", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotLike(String value) {
            addCriterion("album not like", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumIn(List<String> values) {
            addCriterion("album in", values, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotIn(List<String> values) {
            addCriterion("album not in", values, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumBetween(String value1, String value2) {
            addCriterion("album between", value1, value2, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotBetween(String value1, String value2) {
            addCriterion("album not between", value1, value2, "album");
            return (Criteria) this;
        }

        public Criteria andJobLocationIsNull() {
            addCriterion("job-location is null");
            return (Criteria) this;
        }

        public Criteria andJobLocationIsNotNull() {
            addCriterion("job-location is not null");
            return (Criteria) this;
        }

        public Criteria andJobLocationEqualTo(String value) {
            addCriterion("job-location =", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationNotEqualTo(String value) {
            addCriterion("job-location <>", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationGreaterThan(String value) {
            addCriterion("job-location >", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationGreaterThanOrEqualTo(String value) {
            addCriterion("job-location >=", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationLessThan(String value) {
            addCriterion("job-location <", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationLessThanOrEqualTo(String value) {
            addCriterion("job-location <=", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationLike(String value) {
            addCriterion("job-location like", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationNotLike(String value) {
            addCriterion("job-location not like", value, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationIn(List<String> values) {
            addCriterion("job-location in", values, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationNotIn(List<String> values) {
            addCriterion("job-location not in", values, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationBetween(String value1, String value2) {
            addCriterion("job-location between", value1, value2, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andJobLocationNotBetween(String value1, String value2) {
            addCriterion("job-location not between", value1, value2, "jobLocation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job-type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job-type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("job-type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("job-type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(String value) {
            addCriterion("job-type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job-type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(String value) {
            addCriterion("job-type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(String value) {
            addCriterion("job-type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("job-type like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("job-type not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("job-type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("job-type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("job-type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("job-type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andFatherIsNull() {
            addCriterion("father is null");
            return (Criteria) this;
        }

        public Criteria andFatherIsNotNull() {
            addCriterion("father is not null");
            return (Criteria) this;
        }

        public Criteria andFatherEqualTo(String value) {
            addCriterion("father =", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotEqualTo(String value) {
            addCriterion("father <>", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThan(String value) {
            addCriterion("father >", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThanOrEqualTo(String value) {
            addCriterion("father >=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThan(String value) {
            addCriterion("father <", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThanOrEqualTo(String value) {
            addCriterion("father <=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLike(String value) {
            addCriterion("father like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotLike(String value) {
            addCriterion("father not like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherIn(List<String> values) {
            addCriterion("father in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotIn(List<String> values) {
            addCriterion("father not in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherBetween(String value1, String value2) {
            addCriterion("father between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotBetween(String value1, String value2) {
            addCriterion("father not between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andMotherIsNull() {
            addCriterion("mother is null");
            return (Criteria) this;
        }

        public Criteria andMotherIsNotNull() {
            addCriterion("mother is not null");
            return (Criteria) this;
        }

        public Criteria andMotherEqualTo(String value) {
            addCriterion("mother =", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotEqualTo(String value) {
            addCriterion("mother <>", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThan(String value) {
            addCriterion("mother >", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThanOrEqualTo(String value) {
            addCriterion("mother >=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThan(String value) {
            addCriterion("mother <", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThanOrEqualTo(String value) {
            addCriterion("mother <=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLike(String value) {
            addCriterion("mother like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotLike(String value) {
            addCriterion("mother not like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherIn(List<String> values) {
            addCriterion("mother in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotIn(List<String> values) {
            addCriterion("mother not in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherBetween(String value1, String value2) {
            addCriterion("mother between", value1, value2, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotBetween(String value1, String value2) {
            addCriterion("mother not between", value1, value2, "mother");
            return (Criteria) this;
        }

        public Criteria andBrotherIsNull() {
            addCriterion("brother is null");
            return (Criteria) this;
        }

        public Criteria andBrotherIsNotNull() {
            addCriterion("brother is not null");
            return (Criteria) this;
        }

        public Criteria andBrotherEqualTo(String value) {
            addCriterion("brother =", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherNotEqualTo(String value) {
            addCriterion("brother <>", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherGreaterThan(String value) {
            addCriterion("brother >", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherGreaterThanOrEqualTo(String value) {
            addCriterion("brother >=", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherLessThan(String value) {
            addCriterion("brother <", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherLessThanOrEqualTo(String value) {
            addCriterion("brother <=", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherLike(String value) {
            addCriterion("brother like", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherNotLike(String value) {
            addCriterion("brother not like", value, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherIn(List<String> values) {
            addCriterion("brother in", values, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherNotIn(List<String> values) {
            addCriterion("brother not in", values, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherBetween(String value1, String value2) {
            addCriterion("brother between", value1, value2, "brother");
            return (Criteria) this;
        }

        public Criteria andBrotherNotBetween(String value1, String value2) {
            addCriterion("brother not between", value1, value2, "brother");
            return (Criteria) this;
        }

        public Criteria andLivingStatusIsNull() {
            addCriterion("living-status is null");
            return (Criteria) this;
        }

        public Criteria andLivingStatusIsNotNull() {
            addCriterion("living-status is not null");
            return (Criteria) this;
        }

        public Criteria andLivingStatusEqualTo(String value) {
            addCriterion("living-status =", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusNotEqualTo(String value) {
            addCriterion("living-status <>", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusGreaterThan(String value) {
            addCriterion("living-status >", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("living-status >=", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusLessThan(String value) {
            addCriterion("living-status <", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusLessThanOrEqualTo(String value) {
            addCriterion("living-status <=", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusLike(String value) {
            addCriterion("living-status like", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusNotLike(String value) {
            addCriterion("living-status not like", value, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusIn(List<String> values) {
            addCriterion("living-status in", values, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusNotIn(List<String> values) {
            addCriterion("living-status not in", values, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusBetween(String value1, String value2) {
            addCriterion("living-status between", value1, value2, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andLivingStatusNotBetween(String value1, String value2) {
            addCriterion("living-status not between", value1, value2, "livingStatus");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNull() {
            addCriterion("job-level is null");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNotNull() {
            addCriterion("job-level is not null");
            return (Criteria) this;
        }

        public Criteria andJobLevelEqualTo(String value) {
            addCriterion("job-level =", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotEqualTo(String value) {
            addCriterion("job-level <>", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThan(String value) {
            addCriterion("job-level >", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThanOrEqualTo(String value) {
            addCriterion("job-level >=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThan(String value) {
            addCriterion("job-level <", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThanOrEqualTo(String value) {
            addCriterion("job-level <=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLike(String value) {
            addCriterion("job-level like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotLike(String value) {
            addCriterion("job-level not like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelIn(List<String> values) {
            addCriterion("job-level in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotIn(List<String> values) {
            addCriterion("job-level not in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelBetween(String value1, String value2) {
            addCriterion("job-level between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotBetween(String value1, String value2) {
            addCriterion("job-level not between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andHousingLocationIsNull() {
            addCriterion("housing-location is null");
            return (Criteria) this;
        }

        public Criteria andHousingLocationIsNotNull() {
            addCriterion("housing-location is not null");
            return (Criteria) this;
        }

        public Criteria andHousingLocationEqualTo(String value) {
            addCriterion("housing-location =", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationNotEqualTo(String value) {
            addCriterion("housing-location <>", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationGreaterThan(String value) {
            addCriterion("housing-location >", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("housing-location >=", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationLessThan(String value) {
            addCriterion("housing-location <", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationLessThanOrEqualTo(String value) {
            addCriterion("housing-location <=", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationLike(String value) {
            addCriterion("housing-location like", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationNotLike(String value) {
            addCriterion("housing-location not like", value, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationIn(List<String> values) {
            addCriterion("housing-location in", values, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationNotIn(List<String> values) {
            addCriterion("housing-location not in", values, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationBetween(String value1, String value2) {
            addCriterion("housing-location between", value1, value2, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andHousingLocationNotBetween(String value1, String value2) {
            addCriterion("housing-location not between", value1, value2, "housingLocation");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job-name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job-name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job-name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job-name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job-name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job-name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job-name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job-name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job-name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job-name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job-name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job-name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job-name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job-name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("blood is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("blood is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(String value) {
            addCriterion("blood =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(String value) {
            addCriterion("blood <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(String value) {
            addCriterion("blood >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(String value) {
            addCriterion("blood >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(String value) {
            addCriterion("blood <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(String value) {
            addCriterion("blood <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLike(String value) {
            addCriterion("blood like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotLike(String value) {
            addCriterion("blood not like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<String> values) {
            addCriterion("blood in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<String> values) {
            addCriterion("blood not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(String value1, String value2) {
            addCriterion("blood between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(String value1, String value2) {
            addCriterion("blood not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeIsNull() {
            addCriterion("marriage-type is null");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeIsNotNull() {
            addCriterion("marriage-type is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeEqualTo(String value) {
            addCriterion("marriage-type =", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeNotEqualTo(String value) {
            addCriterion("marriage-type <>", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeGreaterThan(String value) {
            addCriterion("marriage-type >", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("marriage-type >=", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeLessThan(String value) {
            addCriterion("marriage-type <", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeLessThanOrEqualTo(String value) {
            addCriterion("marriage-type <=", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeLike(String value) {
            addCriterion("marriage-type like", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeNotLike(String value) {
            addCriterion("marriage-type not like", value, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeIn(List<String> values) {
            addCriterion("marriage-type in", values, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeNotIn(List<String> values) {
            addCriterion("marriage-type not in", values, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeBetween(String value1, String value2) {
            addCriterion("marriage-type between", value1, value2, "marriageType");
            return (Criteria) this;
        }

        public Criteria andMarriageTypeNotBetween(String value1, String value2) {
            addCriterion("marriage-type not between", value1, value2, "marriageType");
            return (Criteria) this;
        }

        public Criteria andPetIsNull() {
            addCriterion("pet is null");
            return (Criteria) this;
        }

        public Criteria andPetIsNotNull() {
            addCriterion("pet is not null");
            return (Criteria) this;
        }

        public Criteria andPetEqualTo(String value) {
            addCriterion("pet =", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetNotEqualTo(String value) {
            addCriterion("pet <>", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetGreaterThan(String value) {
            addCriterion("pet >", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetGreaterThanOrEqualTo(String value) {
            addCriterion("pet >=", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetLessThan(String value) {
            addCriterion("pet <", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetLessThanOrEqualTo(String value) {
            addCriterion("pet <=", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetLike(String value) {
            addCriterion("pet like", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetNotLike(String value) {
            addCriterion("pet not like", value, "pet");
            return (Criteria) this;
        }

        public Criteria andPetIn(List<String> values) {
            addCriterion("pet in", values, "pet");
            return (Criteria) this;
        }

        public Criteria andPetNotIn(List<String> values) {
            addCriterion("pet not in", values, "pet");
            return (Criteria) this;
        }

        public Criteria andPetBetween(String value1, String value2) {
            addCriterion("pet between", value1, value2, "pet");
            return (Criteria) this;
        }

        public Criteria andPetNotBetween(String value1, String value2) {
            addCriterion("pet not between", value1, value2, "pet");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}