package xin.inote.service;

import xin.inote.pojo.Link;

import java.util.List;

public interface AdminLinkService {
    List<Link> listLink();
    boolean addLink(Link link);
    boolean delLink(Link link);
    boolean editLink(Link link);
}
