package com.zeroten.common.util;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty("123", null), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123", ""), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123", "1", "12"), true);
    }

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(CheckUtils.isEmpty(new Object[]{null, null}), true);
        Assert.assertEquals(CheckUtils.isEmpty(new Object[]{null, ""}), true);
        Assert.assertEquals(CheckUtils.isEmpty(new Object[]{"", ""}), true);
        Assert.assertEquals(CheckUtils.isEmpty(new Object[]{"123", 123, 'a'}), true);
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(CheckUtils.equals("123", null), false);
        Assert.assertEquals(CheckUtils.equals("", null), false);
        Assert.assertEquals(CheckUtils.equals("", ""), true);
        Assert.assertEquals(CheckUtils.equals("123", "123"), true);

        System.out.println("========================");

        Assert.assertEquals(CheckUtils.equals(123, null), false);
        Assert.assertEquals(CheckUtils.equals(123, 12), false);
        Assert.assertEquals(CheckUtils.equals(123, 123), true);
    }
}
