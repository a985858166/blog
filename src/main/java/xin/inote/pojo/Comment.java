package xin.inote.pojo;

import java.util.Date;

public class Comment {
    private Integer comment_id;

    private Integer comment_article_id;

    private String comment_author_name;

    private String comment_author_url;

    private String comment_author_email;

    private Date comment_author_date;

    private Integer comment_user_id;

    private String comment_author_content;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getComment_article_id() {
        return comment_article_id;
    }

    public void setComment_article_id(Integer comment_article_id) {
        this.comment_article_id = comment_article_id;
    }

    public String getComment_author_name() {
        return comment_author_name;
    }

    public void setComment_author_name(String comment_author_name) {
        this.comment_author_name = comment_author_name == null ? null : comment_author_name.trim();
    }

    public String getComment_author_url() {
        return comment_author_url;
    }

    public void setComment_author_url(String comment_author_url) {
        this.comment_author_url = comment_author_url == null ? null : comment_author_url.trim();
    }

    public String getComment_author_email() {
        return comment_author_email;
    }

    public void setComment_author_email(String comment_author_email) {
        this.comment_author_email = comment_author_email == null ? null : comment_author_email.trim();
    }

    public Date getComment_author_date() {
        return comment_author_date;
    }

    public void setComment_author_date(Date comment_author_date) {
        this.comment_author_date = comment_author_date;
    }

    public Integer getComment_user_id() {
        return comment_user_id;
    }

    public void setComment_user_id(Integer comment_user_id) {
        this.comment_user_id = comment_user_id;
    }

    public String getComment_author_content() {
        return comment_author_content;
    }

    public void setComment_author_content(String comment_author_content) {
        this.comment_author_content = comment_author_content == null ? null : comment_author_content.trim();
    }
}