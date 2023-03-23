package com.zhoujf.maven;

import org.junit.Test;

/**
 * ClassName: TestHelloMaven
 * Package: com.zhoujf.maven
 * Description:
 *
 * @Author: ZhouJF
 * @Create: 2023/2/23 - 7:37 PM
 */
public class TestHelloMaven {
    @Test
    public void testHelloMaven(){
        HelloMaven helloMaven = new HelloMaven();
        helloMaven.hello("Maven hhh");
    }
}
