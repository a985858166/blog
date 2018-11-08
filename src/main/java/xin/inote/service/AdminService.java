package xin.inote.service;

public interface AdminService {
    boolean setAdmin(String blogUserName, String blogNewPwd);
    String getNotece();
    boolean setNotice(String notice);
}
