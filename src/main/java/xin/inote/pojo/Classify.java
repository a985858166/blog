package xin.inote.pojo;

public class Classify {
    private Integer classify_id;

    private String classify_name;

    private Integer classify_top;

    private String classify_url;

    public Integer getClassify_id() {
        return classify_id;
    }

    public void setClassify_id(Integer classify_id) {
        this.classify_id = classify_id;
    }

    public String getClassify_name() {
        return classify_name;
    }

    public void setClassify_name(String classify_name) {
        this.classify_name = classify_name == null ? null : classify_name.trim();
    }

    public Integer getClassify_top() {
        return classify_top;
    }

    public void setClassify_top(Integer classify_top) {
        this.classify_top = classify_top;
    }

    public String getClassify_url() {
        return classify_url;
    }

    public void setClassify_url(String classify_url) {
        this.classify_url = classify_url == null ? null : classify_url.trim();
    }
}