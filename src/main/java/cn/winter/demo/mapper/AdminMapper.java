package cn.winter.demo.mapper;

import cn.winter.demo.pojos.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Created with IntelliJ IDEA.
 * User: zhangyingjie
 * Date: 2017/11/19
 * Time: 上午12:27
 */
@Component("adminMapper")
public interface AdminMapper {

    Admin get(@Param("id") Long id);
}
