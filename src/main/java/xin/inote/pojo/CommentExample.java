package xin.inote.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(Integer value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(Integer value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<Integer> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idIsNull() {
            addCriterion("comment_article_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_article_idIsNotNull() {
            addCriterion("comment_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_article_idEqualTo(Integer value) {
            addCriterion("comment_article_id =", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idNotEqualTo(Integer value) {
            addCriterion("comment_article_id <>", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idGreaterThan(Integer value) {
            addCriterion("comment_article_id >", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_article_id >=", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idLessThan(Integer value) {
            addCriterion("comment_article_id <", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_article_id <=", value, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idIn(List<Integer> values) {
            addCriterion("comment_article_id in", values, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idNotIn(List<Integer> values) {
            addCriterion("comment_article_id not in", values, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_article_id between", value1, value2, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_article_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_article_id not between", value1, value2, "comment_article_id");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameIsNull() {
            addCriterion("comment_author_name is null");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameIsNotNull() {
            addCriterion("comment_author_name is not null");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameEqualTo(String value) {
            addCriterion("comment_author_name =", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameNotEqualTo(String value) {
            addCriterion("comment_author_name <>", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameGreaterThan(String value) {
            addCriterion("comment_author_name >", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_name >=", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameLessThan(String value) {
            addCriterion("comment_author_name <", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameLessThanOrEqualTo(String value) {
            addCriterion("comment_author_name <=", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameLike(String value) {
            addCriterion("comment_author_name like", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameNotLike(String value) {
            addCriterion("comment_author_name not like", value, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameIn(List<String> values) {
            addCriterion("comment_author_name in", values, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameNotIn(List<String> values) {
            addCriterion("comment_author_name not in", values, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameBetween(String value1, String value2) {
            addCriterion("comment_author_name between", value1, value2, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_nameNotBetween(String value1, String value2) {
            addCriterion("comment_author_name not between", value1, value2, "comment_author_name");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlIsNull() {
            addCriterion("comment_author_url is null");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlIsNotNull() {
            addCriterion("comment_author_url is not null");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlEqualTo(String value) {
            addCriterion("comment_author_url =", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlNotEqualTo(String value) {
            addCriterion("comment_author_url <>", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlGreaterThan(String value) {
            addCriterion("comment_author_url >", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_url >=", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlLessThan(String value) {
            addCriterion("comment_author_url <", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlLessThanOrEqualTo(String value) {
            addCriterion("comment_author_url <=", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlLike(String value) {
            addCriterion("comment_author_url like", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlNotLike(String value) {
            addCriterion("comment_author_url not like", value, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlIn(List<String> values) {
            addCriterion("comment_author_url in", values, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlNotIn(List<String> values) {
            addCriterion("comment_author_url not in", values, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlBetween(String value1, String value2) {
            addCriterion("comment_author_url between", value1, value2, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_urlNotBetween(String value1, String value2) {
            addCriterion("comment_author_url not between", value1, value2, "comment_author_url");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailIsNull() {
            addCriterion("comment_author_email is null");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailIsNotNull() {
            addCriterion("comment_author_email is not null");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailEqualTo(String value) {
            addCriterion("comment_author_email =", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailNotEqualTo(String value) {
            addCriterion("comment_author_email <>", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailGreaterThan(String value) {
            addCriterion("comment_author_email >", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_email >=", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailLessThan(String value) {
            addCriterion("comment_author_email <", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailLessThanOrEqualTo(String value) {
            addCriterion("comment_author_email <=", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailLike(String value) {
            addCriterion("comment_author_email like", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailNotLike(String value) {
            addCriterion("comment_author_email not like", value, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailIn(List<String> values) {
            addCriterion("comment_author_email in", values, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailNotIn(List<String> values) {
            addCriterion("comment_author_email not in", values, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailBetween(String value1, String value2) {
            addCriterion("comment_author_email between", value1, value2, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_emailNotBetween(String value1, String value2) {
            addCriterion("comment_author_email not between", value1, value2, "comment_author_email");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateIsNull() {
            addCriterion("comment_author_date is null");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateIsNotNull() {
            addCriterion("comment_author_date is not null");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateEqualTo(Date value) {
            addCriterion("comment_author_date =", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateNotEqualTo(Date value) {
            addCriterion("comment_author_date <>", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateGreaterThan(Date value) {
            addCriterion("comment_author_date >", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_author_date >=", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateLessThan(Date value) {
            addCriterion("comment_author_date <", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateLessThanOrEqualTo(Date value) {
            addCriterion("comment_author_date <=", value, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateIn(List<Date> values) {
            addCriterion("comment_author_date in", values, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateNotIn(List<Date> values) {
            addCriterion("comment_author_date not in", values, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateBetween(Date value1, Date value2) {
            addCriterion("comment_author_date between", value1, value2, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_author_dateNotBetween(Date value1, Date value2) {
            addCriterion("comment_author_date not between", value1, value2, "comment_author_date");
            return (Criteria) this;
        }

        public Criteria andComment_user_idIsNull() {
            addCriterion("comment_user_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_user_idIsNotNull() {
            addCriterion("comment_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_user_idEqualTo(Integer value) {
            addCriterion("comment_user_id =", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idNotEqualTo(Integer value) {
            addCriterion("comment_user_id <>", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idGreaterThan(Integer value) {
            addCriterion("comment_user_id >", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id >=", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idLessThan(Integer value) {
            addCriterion("comment_user_id <", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id <=", value, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idIn(List<Integer> values) {
            addCriterion("comment_user_id in", values, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idNotIn(List<Integer> values) {
            addCriterion("comment_user_id not in", values, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id between", value1, value2, "comment_user_id");
            return (Criteria) this;
        }

        public Criteria andComment_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id not between", value1, value2, "comment_user_id");
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