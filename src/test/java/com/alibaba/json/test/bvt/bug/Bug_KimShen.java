package com.alibaba.json.test.bvt.bug;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_KimShen extends TestCase {

    public void test_0() throws Exception {
        String text = JSON.toJSONString(new Entity());
        JSON.parseObject(text, Entity.class);
    }

    public static class Entity {

        private Set<Object> value = new HashSet<Object>();

        public Set<Object> getValue() {
            return value;
        }

        public void setValue(Set<Object> value) {
            this.value = value;
        }

    }
}
