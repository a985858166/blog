package xin.inote.pojo;

import java.util.ArrayList;
import java.util.List;

public class LinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkExample() {
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

        public Criteria andLink_idIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLink_idIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLink_idEqualTo(Integer value) {
            addCriterion("link_id =", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idNotEqualTo(Integer value) {
            addCriterion("link_id <>", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idGreaterThan(Integer value) {
            addCriterion("link_id >", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_id >=", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idLessThan(Integer value) {
            addCriterion("link_id <", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idLessThanOrEqualTo(Integer value) {
            addCriterion("link_id <=", value, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idIn(List<Integer> values) {
            addCriterion("link_id in", values, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idNotIn(List<Integer> values) {
            addCriterion("link_id not in", values, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idBetween(Integer value1, Integer value2) {
            addCriterion("link_id between", value1, value2, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_idNotBetween(Integer value1, Integer value2) {
            addCriterion("link_id not between", value1, value2, "link_id");
            return (Criteria) this;
        }

        public Criteria andLink_nameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLink_nameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLink_nameEqualTo(String value) {
            addCriterion("link_name =", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameGreaterThan(String value) {
            addCriterion("link_name >", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameLessThan(String value) {
            addCriterion("link_name <", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameLike(String value) {
            addCriterion("link_name like", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameNotLike(String value) {
            addCriterion("link_name not like", value, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameIn(List<String> values) {
            addCriterion("link_name in", values, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_nameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "link_name");
            return (Criteria) this;
        }

        public Criteria andLink_urlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLink_urlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLink_urlEqualTo(String value) {
            addCriterion("link_url =", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlGreaterThan(String value) {
            addCriterion("link_url >", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlLessThan(String value) {
            addCriterion("link_url <", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlLike(String value) {
            addCriterion("link_url like", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlNotLike(String value) {
            addCriterion("link_url not like", value, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlIn(List<String> values) {
            addCriterion("link_url in", values, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "link_url");
            return (Criteria) this;
        }

        public Criteria andLink_urlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "link_url");
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