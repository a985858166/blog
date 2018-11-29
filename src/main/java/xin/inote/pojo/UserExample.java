package xin.inote.pojo;

import java.util.ArrayList;
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_usernameIsNull() {
            addCriterion("user_username is null");
            return (Criteria) this;
        }

        public Criteria andUser_usernameIsNotNull() {
            addCriterion("user_username is not null");
            return (Criteria) this;
        }

        public Criteria andUser_usernameEqualTo(String value) {
            addCriterion("user_username =", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameNotEqualTo(String value) {
            addCriterion("user_username <>", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameGreaterThan(String value) {
            addCriterion("user_username >", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_username >=", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameLessThan(String value) {
            addCriterion("user_username <", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameLessThanOrEqualTo(String value) {
            addCriterion("user_username <=", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameLike(String value) {
            addCriterion("user_username like", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameNotLike(String value) {
            addCriterion("user_username not like", value, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameIn(List<String> values) {
            addCriterion("user_username in", values, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameNotIn(List<String> values) {
            addCriterion("user_username not in", values, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameBetween(String value1, String value2) {
            addCriterion("user_username between", value1, value2, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_usernameNotBetween(String value1, String value2) {
            addCriterion("user_username not between", value1, value2, "user_username");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_saltIsNull() {
            addCriterion("user_salt is null");
            return (Criteria) this;
        }

        public Criteria andUser_saltIsNotNull() {
            addCriterion("user_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUser_saltEqualTo(String value) {
            addCriterion("user_salt =", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltNotEqualTo(String value) {
            addCriterion("user_salt <>", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltGreaterThan(String value) {
            addCriterion("user_salt >", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltGreaterThanOrEqualTo(String value) {
            addCriterion("user_salt >=", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltLessThan(String value) {
            addCriterion("user_salt <", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltLessThanOrEqualTo(String value) {
            addCriterion("user_salt <=", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltLike(String value) {
            addCriterion("user_salt like", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltNotLike(String value) {
            addCriterion("user_salt not like", value, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltIn(List<String> values) {
            addCriterion("user_salt in", values, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltNotIn(List<String> values) {
            addCriterion("user_salt not in", values, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltBetween(String value1, String value2) {
            addCriterion("user_salt between", value1, value2, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_saltNotBetween(String value1, String value2) {
            addCriterion("user_salt not between", value1, value2, "user_salt");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberIsNull() {
            addCriterion("user_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberIsNotNull() {
            addCriterion("user_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberEqualTo(String value) {
            addCriterion("user_phone_number =", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberNotEqualTo(String value) {
            addCriterion("user_phone_number <>", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberGreaterThan(String value) {
            addCriterion("user_phone_number >", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_number >=", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberLessThan(String value) {
            addCriterion("user_phone_number <", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberLessThanOrEqualTo(String value) {
            addCriterion("user_phone_number <=", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberLike(String value) {
            addCriterion("user_phone_number like", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberNotLike(String value) {
            addCriterion("user_phone_number not like", value, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberIn(List<String> values) {
            addCriterion("user_phone_number in", values, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberNotIn(List<String> values) {
            addCriterion("user_phone_number not in", values, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberBetween(String value1, String value2) {
            addCriterion("user_phone_number between", value1, value2, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_phone_numberNotBetween(String value1, String value2) {
            addCriterion("user_phone_number not between", value1, value2, "user_phone_number");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUser_emailEqualTo(String value) {
            addCriterion("user_email =", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThan(String value) {
            addCriterion("user_email >", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThan(String value) {
            addCriterion("user_email <", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLike(String value) {
            addCriterion("user_email like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotLike(String value) {
            addCriterion("user_email not like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailIn(List<String> values) {
            addCriterion("user_email in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "user_email");
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