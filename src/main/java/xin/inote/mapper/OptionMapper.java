package xin.inote.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.inote.pojo.Option;
import xin.inote.pojo.OptionExample;

public interface OptionMapper {
    long countByExample(OptionExample example);

    int deleteByExample(OptionExample example);

    int insert(Option record);

    int insertSelective(Option record);

    List<Option> selectByExample(OptionExample example);

    int updateByExampleSelective(@Param("record") Option record, @Param("example") OptionExample example);

    int updateByExample(@Param("record") Option record, @Param("example") OptionExample example);
}