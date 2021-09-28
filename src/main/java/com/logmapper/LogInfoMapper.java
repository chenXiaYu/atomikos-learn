package com.logmapper;

import com.domain.LogInfo;
import org.apache.ibatis.annotations.Insert;


public interface LogInfoMapper {

    @Insert("insert into log(createTime,content) values(#{createTime},#{content})")
    int add(LogInfo logInfo);
}
