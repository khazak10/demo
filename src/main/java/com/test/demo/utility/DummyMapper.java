package com.test.demo.utility;

import org.springframework.stereotype.Component;
import com.test.demo.model.dto.Pojo;

@Component("DummyMapper")
public class DummyMapper implements Mapper {

    @Override
    public Object mappToEntity(Pojo pojo) {
        // TODO Auto-generated method stub
        return null;
    }

}
