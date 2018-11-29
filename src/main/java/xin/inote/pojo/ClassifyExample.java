package xin.inote.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassifyExample() {
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

        public Criteria andClassify_idIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassify_idIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassify_idEqualTo(Integer value) {
            addCriterion("classify_id =", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idNotEqualTo(Integer value) {
            addCriterion("classify_id <>", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idGreaterThan(Integer value) {
            addCriterion("classify_id >", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_id >=", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idLessThan(Integer value) {
            addCriterion("classify_id <", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idLessThanOrEqualTo(Integer value) {
            addCriterion("classify_id <=", value, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idIn(List<Integer> values) {
            addCriterion("classify_id in", values, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idNotIn(List<Integer> values) {
            addCriterion("classify_id not in", values, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idBetween(Integer value1, Integer value2) {
            addCriterion("classify_id between", value1, value2, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_idNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_id not between", value1, value2, "classify_id");
            return (Criteria) this;
        }

        public Criteria andClassify_nameIsNull() {
            addCriterion("classify_name is null");
            return (Criteria) this;
        }

        public Criteria andClassify_nameIsNotNull() {
            addCriterion("classify_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassify_nameEqualTo(String value) {
            addCriterion("classify_name =", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameNotEqualTo(String value) {
            addCriterion("classify_name <>", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameGreaterThan(String value) {
            addCriterion("classify_name >", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameGreaterThanOrEqualTo(String value) {
            addCriterion("classify_name >=", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameLessThan(String value) {
            addCriterion("classify_name <", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameLessThanOrEqualTo(String value) {
            addCriterion("classify_name <=", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameLike(String value) {
            addCriterion("classify_name like", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameNotLike(String value) {
            addCriterion("classify_name not like", value, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameIn(List<String> values) {
            addCriterion("classify_name in", values, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameNotIn(List<String> values) {
            addCriterion("classify_name not in", values, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameBetween(String value1, String value2) {
            addCriterion("classify_name between", value1, value2, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_nameNotBetween(String value1, String value2) {
            addCriterion("classify_name not between", value1, value2, "classify_name");
            return (Criteria) this;
        }

        public Criteria andClassify_topIsNull() {
            addCriterion("classify_top is null");
            return (Criteria) this;
        }

        public Criteria andClassify_topIsNotNull() {
            addCriterion("classify_top is not null");
            return (Criteria) this;
        }

        public Criteria andClassify_topEqualTo(Integer value) {
            addCriterion("classify_top =", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topNotEqualTo(Integer value) {
            addCriterion("classify_top <>", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topGreaterThan(Integer value) {
            addCriterion("classify_top >", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_top >=", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topLessThan(Integer value) {
            addCriterion("classify_top <", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topLessThanOrEqualTo(Integer value) {
            addCriterion("classify_top <=", value, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topIn(List<Integer> values) {
            addCriterion("classify_top in", values, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topNotIn(List<Integer> values) {
            addCriterion("classify_top not in", values, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topBetween(Integer value1, Integer value2) {
            addCriterion("classify_top between", value1, value2, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_topNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_top not between", value1, value2, "classify_top");
            return (Criteria) this;
        }

        public Criteria andClassify_urlIsNull() {
            addCriterion("classify_url is null");
            return (Criteria) this;
        }

        public Criteria andClassify_urlIsNotNull() {
            addCriterion("classify_url is not null");
            return (Criteria) this;
        }

        public Criteria andClassify_urlEqualTo(String value) {
            addCriterion("classify_url =", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlNotEqualTo(String value) {
            addCriterion("classify_url <>", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlGreaterThan(String value) {
            addCriterion("classify_url >", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlGreaterThanOrEqualTo(String value) {
            addCriterion("classify_url >=", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlLessThan(String value) {
            addCriterion("classify_url <", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlLessThanOrEqualTo(String value) {
            addCriterion("classify_url <=", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlLike(String value) {
            addCriterion("classify_url like", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlNotLike(String value) {
            addCriterion("classify_url not like", value, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlIn(List<String> values) {
            addCriterion("classify_url in", values, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlNotIn(List<String> values) {
            addCriterion("classify_url not in", values, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlBetween(String value1, String value2) {
            addCriterion("classify_url between", value1, value2, "classify_url");
            return (Criteria) this;
        }

        public Criteria andClassify_urlNotBetween(String value1, String value2) {
            addCriterion("classify_url not between", value1, value2, "classify_url");
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