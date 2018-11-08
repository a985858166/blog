package xin.inote.service;

import xin.inote.pojo.Option;

import java.util.List;

public interface InformationService {
    public boolean setInformation(String blogName,String blogDomain);
    public List<Option> getInformation();
    public String getName();
}
