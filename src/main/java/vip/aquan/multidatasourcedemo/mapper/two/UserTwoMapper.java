package vip.aquan.multidatasourcedemo.mapper.two;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.aquan.multidatasourcedemo.entity.User;

@DS("two")
public interface UserTwoMapper extends BaseMapper<User> {
}




