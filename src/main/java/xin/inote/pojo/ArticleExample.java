package xin.inote.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticle_idIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_idIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_idEqualTo(Integer value) {
            addCriterion("article_id =", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThan(Integer value) {
            addCriterion("article_id >", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThan(Integer value) {
            addCriterion("article_id <", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idIn(List<Integer> values) {
            addCriterion("article_id in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idIsNull() {
            addCriterion("article_user_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idIsNotNull() {
            addCriterion("article_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idEqualTo(Integer value) {
            addCriterion("article_user_id =", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idNotEqualTo(Integer value) {
            addCriterion("article_user_id <>", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idGreaterThan(Integer value) {
            addCriterion("article_user_id >", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_user_id >=", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idLessThan(Integer value) {
            addCriterion("article_user_id <", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("article_user_id <=", value, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idIn(List<Integer> values) {
            addCriterion("article_user_id in", values, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idNotIn(List<Integer> values) {
            addCriterion("article_user_id not in", values, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idBetween(Integer value1, Integer value2) {
            addCriterion("article_user_id between", value1, value2, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("article_user_id not between", value1, value2, "article_user_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idIsNull() {
            addCriterion("article_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idIsNotNull() {
            addCriterion("article_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idEqualTo(Integer value) {
            addCriterion("article_classify_id =", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idNotEqualTo(Integer value) {
            addCriterion("article_classify_id <>", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idGreaterThan(Integer value) {
            addCriterion("article_classify_id >", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_classify_id >=", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idLessThan(Integer value) {
            addCriterion("article_classify_id <", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idLessThanOrEqualTo(Integer value) {
            addCriterion("article_classify_id <=", value, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idIn(List<Integer> values) {
            addCriterion("article_classify_id in", values, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idNotIn(List<Integer> values) {
            addCriterion("article_classify_id not in", values, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idBetween(Integer value1, Integer value2) {
            addCriterion("article_classify_id between", value1, value2, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_classify_idNotBetween(Integer value1, Integer value2) {
            addCriterion("article_classify_id not between", value1, value2, "article_classify_id");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_titleEqualTo(String value) {
            addCriterion("article_title =", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleGreaterThan(String value) {
            addCriterion("article_title >", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLessThan(String value) {
            addCriterion("article_title <", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLike(String value) {
            addCriterion("article_title like", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotLike(String value) {
            addCriterion("article_title not like", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIn(List<String> values) {
            addCriterion("article_title in", values, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_dateIsNull() {
            addCriterion("article_date is null");
            return (Criteria) this;
        }

        public Criteria andArticle_dateIsNotNull() {
            addCriterion("article_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_dateEqualTo(Date value) {
            addCriterion("article_date =", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateNotEqualTo(Date value) {
            addCriterion("article_date <>", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateGreaterThan(Date value) {
            addCriterion("article_date >", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_date >=", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateLessThan(Date value) {
            addCriterion("article_date <", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateLessThanOrEqualTo(Date value) {
            addCriterion("article_date <=", value, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateIn(List<Date> values) {
            addCriterion("article_date in", values, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateNotIn(List<Date> values) {
            addCriterion("article_date not in", values, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateBetween(Date value1, Date value2) {
            addCriterion("article_date between", value1, value2, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_dateNotBetween(Date value1, Date value2) {
            addCriterion("article_date not between", value1, value2, "article_date");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIsNull() {
            addCriterion("article_status is null");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIsNotNull() {
            addCriterion("article_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_statusEqualTo(Integer value) {
            addCriterion("article_status =", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotEqualTo(Integer value) {
            addCriterion("article_status <>", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusGreaterThan(Integer value) {
            addCriterion("article_status >", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_status >=", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusLessThan(Integer value) {
            addCriterion("article_status <", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusLessThanOrEqualTo(Integer value) {
            addCriterion("article_status <=", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIn(List<Integer> values) {
            addCriterion("article_status in", values, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotIn(List<Integer> values) {
            addCriterion("article_status not in", values, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusBetween(Integer value1, Integer value2) {
            addCriterion("article_status between", value1, value2, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("article_status not between", value1, value2, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_urlIsNull() {
            addCriterion("article_url is null");
            return (Criteria) this;
        }

        public Criteria andArticle_urlIsNotNull() {
            addCriterion("article_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_urlEqualTo(String value) {
            addCriterion("article_url =", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlNotEqualTo(String value) {
            addCriterion("article_url <>", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlGreaterThan(String value) {
            addCriterion("article_url >", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlGreaterThanOrEqualTo(String value) {
            addCriterion("article_url >=", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlLessThan(String value) {
            addCriterion("article_url <", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlLessThanOrEqualTo(String value) {
            addCriterion("article_url <=", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlLike(String value) {
            addCriterion("article_url like", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlNotLike(String value) {
            addCriterion("article_url not like", value, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlIn(List<String> values) {
            addCriterion("article_url in", values, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlNotIn(List<String> values) {
            addCriterion("article_url not in", values, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlBetween(String value1, String value2) {
            addCriterion("article_url between", value1, value2, "article_url");
            return (Criteria) this;
        }

        public Criteria andArticle_urlNotBetween(String value1, String value2) {
            addCriterion("article_url not between", value1, value2, "article_url");
            return (Criteria) this;
        }

        public Criteria andVisitorsIsNull() {
            addCriterion("visitors is null");
            return (Criteria) this;
        }

        public Criteria andVisitorsIsNotNull() {
            addCriterion("visitors is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorsEqualTo(Integer value) {
            addCriterion("visitors =", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsNotEqualTo(Integer value) {
            addCriterion("visitors <>", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsGreaterThan(Integer value) {
            addCriterion("visitors >", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitors >=", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsLessThan(Integer value) {
            addCriterion("visitors <", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsLessThanOrEqualTo(Integer value) {
            addCriterion("visitors <=", value, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsIn(List<Integer> values) {
            addCriterion("visitors in", values, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsNotIn(List<Integer> values) {
            addCriterion("visitors not in", values, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsBetween(Integer value1, Integer value2) {
            addCriterion("visitors between", value1, value2, "visitors");
            return (Criteria) this;
        }

        public Criteria andVisitorsNotBetween(Integer value1, Integer value2) {
            addCriterion("visitors not between", value1, value2, "visitors");
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