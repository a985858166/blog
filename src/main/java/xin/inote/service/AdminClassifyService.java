package xin.inote.service;

import xin.inote.pojo.Classify;

import java.util.List;

public interface AdminClassifyService {
    boolean addClassify(Classify classify);
    List<Classify> listClassify();
    boolean editClassify(Classify classify);

    boolean delClassify(Classify classify);
}
