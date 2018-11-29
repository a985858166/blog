package xin.inote.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.inote.pojo.Link;
import xin.inote.pojo.LinkExample;

public interface LinkMapper {
    long countByExample(LinkExample example);

    int deleteByExample(LinkExample example);

    int insert(Link record);

    int insertSelective(Link record);

    List<Link> selectByExample(LinkExample example);

    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);
}