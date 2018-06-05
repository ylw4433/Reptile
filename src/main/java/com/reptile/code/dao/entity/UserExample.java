package com.reptile.code.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNull() {
            addCriterion("identitycard is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNotNull() {
            addCriterion("identitycard is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardEqualTo(String value) {
            addCriterion("identitycard =", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotEqualTo(String value) {
            addCriterion("identitycard <>", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThan(String value) {
            addCriterion("identitycard >", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("identitycard >=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThan(String value) {
            addCriterion("identitycard <", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThanOrEqualTo(String value) {
            addCriterion("identitycard <=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLike(String value) {
            addCriterion("identitycard like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotLike(String value) {
            addCriterion("identitycard not like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIn(List<String> values) {
            addCriterion("identitycard in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotIn(List<String> values) {
            addCriterion("identitycard not in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardBetween(String value1, String value2) {
            addCriterion("identitycard between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotBetween(String value1, String value2) {
            addCriterion("identitycard not between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatdataIsNull() {
            addCriterion("creatdata is null");
            return (Criteria) this;
        }

        public Criteria andCreatdataIsNotNull() {
            addCriterion("creatdata is not null");
            return (Criteria) this;
        }

        public Criteria andCreatdataEqualTo(Date value) {
            addCriterion("creatdata =", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataNotEqualTo(Date value) {
            addCriterion("creatdata <>", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataGreaterThan(Date value) {
            addCriterion("creatdata >", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataGreaterThanOrEqualTo(Date value) {
            addCriterion("creatdata >=", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataLessThan(Date value) {
            addCriterion("creatdata <", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataLessThanOrEqualTo(Date value) {
            addCriterion("creatdata <=", value, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataIn(List<Date> values) {
            addCriterion("creatdata in", values, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataNotIn(List<Date> values) {
            addCriterion("creatdata not in", values, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataBetween(Date value1, Date value2) {
            addCriterion("creatdata between", value1, value2, "creatdata");
            return (Criteria) this;
        }

        public Criteria andCreatdataNotBetween(Date value1, Date value2) {
            addCriterion("creatdata not between", value1, value2, "creatdata");
            return (Criteria) this;
        }

        public Criteria andUpdataIsNull() {
            addCriterion("updata is null");
            return (Criteria) this;
        }

        public Criteria andUpdataIsNotNull() {
            addCriterion("updata is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataEqualTo(Date value) {
            addCriterion("updata =", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataNotEqualTo(Date value) {
            addCriterion("updata <>", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataGreaterThan(Date value) {
            addCriterion("updata >", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataGreaterThanOrEqualTo(Date value) {
            addCriterion("updata >=", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataLessThan(Date value) {
            addCriterion("updata <", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataLessThanOrEqualTo(Date value) {
            addCriterion("updata <=", value, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataIn(List<Date> values) {
            addCriterion("updata in", values, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataNotIn(List<Date> values) {
            addCriterion("updata not in", values, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataBetween(Date value1, Date value2) {
            addCriterion("updata between", value1, value2, "updata");
            return (Criteria) this;
        }

        public Criteria andUpdataNotBetween(Date value1, Date value2) {
            addCriterion("updata not between", value1, value2, "updata");
            return (Criteria) this;
        }

        public Criteria andReverse1IsNull() {
            addCriterion("reverse1 is null");
            return (Criteria) this;
        }

        public Criteria andReverse1IsNotNull() {
            addCriterion("reverse1 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse1EqualTo(String value) {
            addCriterion("reverse1 =", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotEqualTo(String value) {
            addCriterion("reverse1 <>", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThan(String value) {
            addCriterion("reverse1 >", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThanOrEqualTo(String value) {
            addCriterion("reverse1 >=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThan(String value) {
            addCriterion("reverse1 <", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThanOrEqualTo(String value) {
            addCriterion("reverse1 <=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1Like(String value) {
            addCriterion("reverse1 like", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotLike(String value) {
            addCriterion("reverse1 not like", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1In(List<String> values) {
            addCriterion("reverse1 in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotIn(List<String> values) {
            addCriterion("reverse1 not in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1Between(String value1, String value2) {
            addCriterion("reverse1 between", value1, value2, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotBetween(String value1, String value2) {
            addCriterion("reverse1 not between", value1, value2, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse2IsNull() {
            addCriterion("reverse2 is null");
            return (Criteria) this;
        }

        public Criteria andReverse2IsNotNull() {
            addCriterion("reverse2 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse2EqualTo(String value) {
            addCriterion("reverse2 =", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotEqualTo(String value) {
            addCriterion("reverse2 <>", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2GreaterThan(String value) {
            addCriterion("reverse2 >", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2GreaterThanOrEqualTo(String value) {
            addCriterion("reverse2 >=", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2LessThan(String value) {
            addCriterion("reverse2 <", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2LessThanOrEqualTo(String value) {
            addCriterion("reverse2 <=", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2Like(String value) {
            addCriterion("reverse2 like", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotLike(String value) {
            addCriterion("reverse2 not like", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2In(List<String> values) {
            addCriterion("reverse2 in", values, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotIn(List<String> values) {
            addCriterion("reverse2 not in", values, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2Between(String value1, String value2) {
            addCriterion("reverse2 between", value1, value2, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotBetween(String value1, String value2) {
            addCriterion("reverse2 not between", value1, value2, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse3IsNull() {
            addCriterion("reverse3 is null");
            return (Criteria) this;
        }

        public Criteria andReverse3IsNotNull() {
            addCriterion("reverse3 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse3EqualTo(String value) {
            addCriterion("reverse3 =", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotEqualTo(String value) {
            addCriterion("reverse3 <>", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3GreaterThan(String value) {
            addCriterion("reverse3 >", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3GreaterThanOrEqualTo(String value) {
            addCriterion("reverse3 >=", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3LessThan(String value) {
            addCriterion("reverse3 <", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3LessThanOrEqualTo(String value) {
            addCriterion("reverse3 <=", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3Like(String value) {
            addCriterion("reverse3 like", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotLike(String value) {
            addCriterion("reverse3 not like", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3In(List<String> values) {
            addCriterion("reverse3 in", values, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotIn(List<String> values) {
            addCriterion("reverse3 not in", values, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3Between(String value1, String value2) {
            addCriterion("reverse3 between", value1, value2, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotBetween(String value1, String value2) {
            addCriterion("reverse3 not between", value1, value2, "reverse3");
            return (Criteria) this;
        }

        public Criteria andUseridLikeInsensitive(String value) {
            addCriterion("upper(userid) like", value.toUpperCase(), "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLikeInsensitive(String value) {
            addCriterion("upper(identitycard) like", value.toUpperCase(), "identitycard");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(state) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andReverse1LikeInsensitive(String value) {
            addCriterion("upper(reverse1) like", value.toUpperCase(), "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse2LikeInsensitive(String value) {
            addCriterion("upper(reverse2) like", value.toUpperCase(), "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse3LikeInsensitive(String value) {
            addCriterion("upper(reverse3) like", value.toUpperCase(), "reverse3");
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