package com.exe.service.impl;

import com.exe.dao.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exe.service.TestService;
import com.exe.vo.TestVO;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDAO TestDAO;
    @Override
    public List<TestVO> getTestValue(TestVO testVO) {
        return TestDAO.getTestValue(testVO);
    }
}
