package com.exe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.exe.vo.TestVO;

import java.util.List;

@Repository
public class TestDAO {

    @Autowired
    private org.apache.ibatis.session.SqlSession SqlSession;

    public List<TestVO> getTestValue(TestVO testVO){
        return SqlSession.selectList("com.hee.heechart.getTestValue", testVO);
    }
}
