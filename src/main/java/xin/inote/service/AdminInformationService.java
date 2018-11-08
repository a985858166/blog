package xin.inote.service;

import xin.inote.pojo.Option;

import java.util.List;

public interface AdminInformationService {
    public boolean setInformation(String blogName,String blogDomain);
    public List<Option> getInformation();
    public String getName();
    boolean setAdmin(String blogUserName, String blogNewPwd);
}
