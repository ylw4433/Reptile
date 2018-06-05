package com.reptile.code.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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

        public Criteria andIssueidIsNull() {
            addCriterion("issueid is null");
            return (Criteria) this;
        }

        public Criteria andIssueidIsNotNull() {
            addCriterion("issueid is not null");
            return (Criteria) this;
        }

        public Criteria andIssueidEqualTo(String value) {
            addCriterion("issueid =", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotEqualTo(String value) {
            addCriterion("issueid <>", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThan(String value) {
            addCriterion("issueid >", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThanOrEqualTo(String value) {
            addCriterion("issueid >=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThan(String value) {
            addCriterion("issueid <", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThanOrEqualTo(String value) {
            addCriterion("issueid <=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLike(String value) {
            addCriterion("issueid like", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotLike(String value) {
            addCriterion("issueid not like", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidIn(List<String> values) {
            addCriterion("issueid in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotIn(List<String> values) {
            addCriterion("issueid not in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidBetween(String value1, String value2) {
            addCriterion("issueid between", value1, value2, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotBetween(String value1, String value2) {
            addCriterion("issueid not between", value1, value2, "issueid");
            return (Criteria) this;
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

        public Criteria andIssueclassifyIsNull() {
            addCriterion("issueclassify is null");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyIsNotNull() {
            addCriterion("issueclassify is not null");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyEqualTo(String value) {
            addCriterion("issueclassify =", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyNotEqualTo(String value) {
            addCriterion("issueclassify <>", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyGreaterThan(String value) {
            addCriterion("issueclassify >", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("issueclassify >=", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyLessThan(String value) {
            addCriterion("issueclassify <", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyLessThanOrEqualTo(String value) {
            addCriterion("issueclassify <=", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyLike(String value) {
            addCriterion("issueclassify like", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyNotLike(String value) {
            addCriterion("issueclassify not like", value, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyIn(List<String> values) {
            addCriterion("issueclassify in", values, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyNotIn(List<String> values) {
            addCriterion("issueclassify not in", values, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyBetween(String value1, String value2) {
            addCriterion("issueclassify between", value1, value2, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyNotBetween(String value1, String value2) {
            addCriterion("issueclassify not between", value1, value2, "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineIsNull() {
            addCriterion("issueheadline is null");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineIsNotNull() {
            addCriterion("issueheadline is not null");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineEqualTo(String value) {
            addCriterion("issueheadline =", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineNotEqualTo(String value) {
            addCriterion("issueheadline <>", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineGreaterThan(String value) {
            addCriterion("issueheadline >", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineGreaterThanOrEqualTo(String value) {
            addCriterion("issueheadline >=", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineLessThan(String value) {
            addCriterion("issueheadline <", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineLessThanOrEqualTo(String value) {
            addCriterion("issueheadline <=", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineLike(String value) {
            addCriterion("issueheadline like", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineNotLike(String value) {
            addCriterion("issueheadline not like", value, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineIn(List<String> values) {
            addCriterion("issueheadline in", values, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineNotIn(List<String> values) {
            addCriterion("issueheadline not in", values, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineBetween(String value1, String value2) {
            addCriterion("issueheadline between", value1, value2, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineNotBetween(String value1, String value2) {
            addCriterion("issueheadline not between", value1, value2, "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeIsNull() {
            addCriterion("issuedescribe is null");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeIsNotNull() {
            addCriterion("issuedescribe is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeEqualTo(String value) {
            addCriterion("issuedescribe =", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeNotEqualTo(String value) {
            addCriterion("issuedescribe <>", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeGreaterThan(String value) {
            addCriterion("issuedescribe >", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeGreaterThanOrEqualTo(String value) {
            addCriterion("issuedescribe >=", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeLessThan(String value) {
            addCriterion("issuedescribe <", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeLessThanOrEqualTo(String value) {
            addCriterion("issuedescribe <=", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeLike(String value) {
            addCriterion("issuedescribe like", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeNotLike(String value) {
            addCriterion("issuedescribe not like", value, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeIn(List<String> values) {
            addCriterion("issuedescribe in", values, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeNotIn(List<String> values) {
            addCriterion("issuedescribe not in", values, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeBetween(String value1, String value2) {
            addCriterion("issuedescribe between", value1, value2, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeNotBetween(String value1, String value2) {
            addCriterion("issuedescribe not between", value1, value2, "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNull() {
            addCriterion("startdata is null");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNotNull() {
            addCriterion("startdata is not null");
            return (Criteria) this;
        }

        public Criteria andStartdataEqualTo(Date value) {
            addCriterion("startdata =", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotEqualTo(Date value) {
            addCriterion("startdata <>", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThan(Date value) {
            addCriterion("startdata >", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThanOrEqualTo(Date value) {
            addCriterion("startdata >=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThan(Date value) {
            addCriterion("startdata <", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThanOrEqualTo(Date value) {
            addCriterion("startdata <=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataIn(List<Date> values) {
            addCriterion("startdata in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotIn(List<Date> values) {
            addCriterion("startdata not in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataBetween(Date value1, Date value2) {
            addCriterion("startdata between", value1, value2, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotBetween(Date value1, Date value2) {
            addCriterion("startdata not between", value1, value2, "startdata");
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

        public Criteria andIssuerankIsNull() {
            addCriterion("issuerank is null");
            return (Criteria) this;
        }

        public Criteria andIssuerankIsNotNull() {
            addCriterion("issuerank is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerankEqualTo(String value) {
            addCriterion("issuerank =", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankNotEqualTo(String value) {
            addCriterion("issuerank <>", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankGreaterThan(String value) {
            addCriterion("issuerank >", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankGreaterThanOrEqualTo(String value) {
            addCriterion("issuerank >=", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankLessThan(String value) {
            addCriterion("issuerank <", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankLessThanOrEqualTo(String value) {
            addCriterion("issuerank <=", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankLike(String value) {
            addCriterion("issuerank like", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankNotLike(String value) {
            addCriterion("issuerank not like", value, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankIn(List<String> values) {
            addCriterion("issuerank in", values, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankNotIn(List<String> values) {
            addCriterion("issuerank not in", values, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankBetween(String value1, String value2) {
            addCriterion("issuerank between", value1, value2, "issuerank");
            return (Criteria) this;
        }

        public Criteria andIssuerankNotBetween(String value1, String value2) {
            addCriterion("issuerank not between", value1, value2, "issuerank");
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

        public Criteria andIssueidLikeInsensitive(String value) {
            addCriterion("upper(issueid) like", value.toUpperCase(), "issueid");
            return (Criteria) this;
        }

        public Criteria andUseridLikeInsensitive(String value) {
            addCriterion("upper(userid) like", value.toUpperCase(), "userid");
            return (Criteria) this;
        }

        public Criteria andIssueclassifyLikeInsensitive(String value) {
            addCriterion("upper(issueclassify) like", value.toUpperCase(), "issueclassify");
            return (Criteria) this;
        }

        public Criteria andIssueheadlineLikeInsensitive(String value) {
            addCriterion("upper(issueheadline) like", value.toUpperCase(), "issueheadline");
            return (Criteria) this;
        }

        public Criteria andIssuedescribeLikeInsensitive(String value) {
            addCriterion("upper(issuedescribe) like", value.toUpperCase(), "issuedescribe");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(state) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andIssuerankLikeInsensitive(String value) {
            addCriterion("upper(issuerank) like", value.toUpperCase(), "issuerank");
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