package org.simpleframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @author venvo
 * @date 2021-03-15 15:25
 * @description
 * @modified By
 * @version: jdk1.8
 */
public class ClassUtilTest {


    @DisplayName("提取目标类方法：extractPackageClassTest")
    @Test
    public void extractPackageClassTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.venvo.entity");
        System.out.println(classSet);
        System.out.println("classSet.size()==" + classSet.size());
        Assertions.assertEquals(4, classSet.size());
    }
}
