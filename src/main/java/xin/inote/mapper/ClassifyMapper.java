package xin.inote.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.inote.pojo.Classify;
import xin.inote.pojo.ClassifyExample;

public interface ClassifyMapper {
    long countByExample(ClassifyExample example);

    int deleteByExample(ClassifyExample example);

    int insert(Classify record);

    int insertSelective(Classify record);

    List<Classify> selectByExample(ClassifyExample example);

    int updateByExampleSelective(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByExample(@Param("record") Classify record, @Param("example") ClassifyExample example);
}