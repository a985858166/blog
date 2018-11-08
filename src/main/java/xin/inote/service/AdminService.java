package xin.inote.service;

import xin.inote.pojo.Link;

import java.util.List;

public interface AdminService {
    boolean setAdmin(String blogUserName, String blogNewPwd);
    String getNotece();
    boolean setNotice(String notice);
    List<Link> getLink();
    boolean addLink(Link link);
    boolean delLink(Link link);
    boolean editLink(Link link);
}
