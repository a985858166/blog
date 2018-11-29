package xin.inote.pojo;

import java.util.ArrayList;
import java.util.List;

public class OptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptionExample() {
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

        public Criteria andOption_idIsNull() {
            addCriterion("option_id is null");
            return (Criteria) this;
        }

        public Criteria andOption_idIsNotNull() {
            addCriterion("option_id is not null");
            return (Criteria) this;
        }

        public Criteria andOption_idEqualTo(Integer value) {
            addCriterion("option_id =", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idNotEqualTo(Integer value) {
            addCriterion("option_id <>", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idGreaterThan(Integer value) {
            addCriterion("option_id >", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_id >=", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idLessThan(Integer value) {
            addCriterion("option_id <", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idLessThanOrEqualTo(Integer value) {
            addCriterion("option_id <=", value, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idIn(List<Integer> values) {
            addCriterion("option_id in", values, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idNotIn(List<Integer> values) {
            addCriterion("option_id not in", values, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idBetween(Integer value1, Integer value2) {
            addCriterion("option_id between", value1, value2, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_idNotBetween(Integer value1, Integer value2) {
            addCriterion("option_id not between", value1, value2, "option_id");
            return (Criteria) this;
        }

        public Criteria andOption_nameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
        }

        public Criteria andOption_nameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        public Criteria andOption_nameEqualTo(String value) {
            addCriterion("option_name =", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotEqualTo(String value) {
            addCriterion("option_name <>", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameGreaterThan(String value) {
            addCriterion("option_name >", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameGreaterThanOrEqualTo(String value) {
            addCriterion("option_name >=", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameLessThan(String value) {
            addCriterion("option_name <", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameLessThanOrEqualTo(String value) {
            addCriterion("option_name <=", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameLike(String value) {
            addCriterion("option_name like", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotLike(String value) {
            addCriterion("option_name not like", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameIn(List<String> values) {
            addCriterion("option_name in", values, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotIn(List<String> values) {
            addCriterion("option_name not in", values, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameBetween(String value1, String value2) {
            addCriterion("option_name between", value1, value2, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotBetween(String value1, String value2) {
            addCriterion("option_name not between", value1, value2, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_valueIsNull() {
            addCriterion("option_value is null");
            return (Criteria) this;
        }

        public Criteria andOption_valueIsNotNull() {
            addCriterion("option_value is not null");
            return (Criteria) this;
        }

        public Criteria andOption_valueEqualTo(String value) {
            addCriterion("option_value =", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueNotEqualTo(String value) {
            addCriterion("option_value <>", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueGreaterThan(String value) {
            addCriterion("option_value >", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueGreaterThanOrEqualTo(String value) {
            addCriterion("option_value >=", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueLessThan(String value) {
            addCriterion("option_value <", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueLessThanOrEqualTo(String value) {
            addCriterion("option_value <=", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueLike(String value) {
            addCriterion("option_value like", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueNotLike(String value) {
            addCriterion("option_value not like", value, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueIn(List<String> values) {
            addCriterion("option_value in", values, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueNotIn(List<String> values) {
            addCriterion("option_value not in", values, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueBetween(String value1, String value2) {
            addCriterion("option_value between", value1, value2, "option_value");
            return (Criteria) this;
        }

        public Criteria andOption_valueNotBetween(String value1, String value2) {
            addCriterion("option_value not between", value1, value2, "option_value");
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