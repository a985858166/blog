package xin.inote.pojo;

import java.util.Date;

public class Article {
    private Integer article_id;

    private Integer article_user_id;

    private Integer article_classify_id;

    private String article_title;

    private Date article_date;

    private Integer article_status;

    private String article_url;

    private Integer visitors;

    private String article_content;

    private Classify classify;

    private Long commentNum;

    private User user;

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getArticle_user_id() {
        return article_user_id;
    }

    public void setArticle_user_id(Integer article_user_id) {
        this.article_user_id = article_user_id;
    }

    public Integer getArticle_classify_id() {
        return article_classify_id;
    }

    public void setArticle_classify_id(Integer article_classify_id) {
        this.article_classify_id = article_classify_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title == null ? null : article_title.trim();
    }

    public Date getArticle_date() {
        return article_date;
    }

    public void setArticle_date(Date article_date) {
        this.article_date = article_date;
    }

    public Integer getArticle_status() {
        return article_status;
    }

    public void setArticle_status(Integer article_status) {
        this.article_status = article_status;
    }

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url == null ? null : article_url.trim();
    }

    public Integer getVisitors() {
        return visitors;
    }

    public void setVisitors(Integer visitors) {
        this.visitors = visitors;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content == null ? null : article_content.trim();
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Long getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Long commentNum) {
        this.commentNum = commentNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}