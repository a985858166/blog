package xin.inote.pojo;

public class Link {
    private Integer link_id;

    private String link_name;

    private String link_url;

    public Integer getLink_id() {
        return link_id;
    }

    public void setLink_id(Integer link_id) {
        this.link_id = link_id;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name == null ? null : link_name.trim();
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url == null ? null : link_url.trim();
    }
}