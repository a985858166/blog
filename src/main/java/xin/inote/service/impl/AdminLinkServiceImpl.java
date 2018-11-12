package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.LinkMapper;
import xin.inote.pojo.Link;
import xin.inote.pojo.LinkExample;
import xin.inote.service.AdminLinkService;

import java.util.List;

@Service
public class AdminLinkServiceImpl implements AdminLinkService {
    @Autowired
    LinkMapper linkMapper;
    @Override
    public List<Link> listLink() {
        LinkExample linkExample = new LinkExample();

        return linkMapper.selectByExample(linkExample);
    }
    @Override
    public boolean editLink(Link link) {
        LinkExample example = new LinkExample();
        example.or().andLink_idEqualTo(link.getLink_id());
        if (linkMapper.updateByExampleSelective(link,example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delLink(Link link) {
        LinkExample example = new LinkExample();
        example.or().andLink_idEqualTo(link.getLink_id());
        if (linkMapper.deleteByExample(example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addLink(Link link) {
        if (linkMapper.insertSelective(link)>0){
            return true;
        }
        return false;
    }
}
