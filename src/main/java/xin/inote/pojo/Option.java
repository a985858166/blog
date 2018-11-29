package xin.inote.pojo;

public class Option {
    private Integer option_id;

    private String option_name;

    private String option_value;

    public Integer getOption_id() {
        return option_id;
    }

    public void setOption_id(Integer option_id) {
        this.option_id = option_id;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name == null ? null : option_name.trim();
    }

    public String getOption_value() {
        return option_value;
    }

    public void setOption_value(String option_value) {
        this.option_value = option_value == null ? null : option_value.trim();
    }
}