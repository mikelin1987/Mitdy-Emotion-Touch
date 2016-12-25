package com.mitdy.et.test.memcached;

import org.junit.Test;

import com.mitdy.core.util.MemcachedUtils;
import com.mitdy.et.test.base.BaseTest;

public class MemcachedTest extends BaseTest {

    @Test
    public void testMemcachedSpring() {
        boolean result1 = MemcachedUtils.add("key1", "value1");
        System.out.println("result1: " + result1);

        System.out.println(MemcachedUtils.get("key1"));
    }

}
