package com.huaweicloud.sdk.core;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;



public class TestStrictCheck {


    public static class TestBean {

        @JsonProperty("value_boolean")
        Boolean valueBoolean;

        @JsonProperty("value_integer")
        Integer valueInteger;

        @JsonProperty("value_long")
        Long valueLong;

        @JsonProperty("value_double")
        Double valueDouble;

        @JsonProperty("value_float")
        Float valueFloat;

        @JsonProperty("value_string")
        String valueString;

        public Boolean getValueBoolean() {
            return valueBoolean;
        }

        public TestBean setValueBoolean(Boolean valueBoolean) {
            this.valueBoolean = valueBoolean;
            return this;
        }

        public Integer getValueInteger() {
            return valueInteger;
        }

        public TestBean setValueInteger(Integer valueInteger) {
            this.valueInteger = valueInteger;
            return this;
        }

        public Long getValueLong() {
            return valueLong;
        }

        public TestBean setValueLong(Long valueLong) {
            this.valueLong = valueLong;
            return this;
        }

        public Double getValueDouble() {
            return valueDouble;
        }

        public TestBean setValueDouble(Double valueDouble) {
            this.valueDouble = valueDouble;
            return this;
        }

        public Float getValueFloat() {
            return valueFloat;
        }

        public TestBean setValueFloat(Float valueFloat) {
            this.valueFloat = valueFloat;
            return this;
        }

        public String getValueString() {
            return valueString;
        }

        public TestBean setValueString(String valueString) {
            this.valueString = valueString;
            return this;
        }
    }

    @Test
    public void testBoolean() {

        String jsonNormal = "{\"value_boolean\":true}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals(true, testBean.getValueBoolean());
        String jsonNormalFalse = "{\"value_boolean\":false}";
        TestBean testBeanFalse = JsonUtils.toObject(jsonNormalFalse, TestBean.class);
        Assert.assertEquals(false, testBeanFalse.getValueBoolean());
        String jsonNormalNull = "{\"value_boolean\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueBoolean());
        String jsonNormalNull2 = "{\"value_integer\":123}";
        TestBean testBeanNull2 = JsonUtils.toObject(jsonNormalNull2, TestBean.class);
        Assert.assertEquals(null, testBeanNull2.getValueBoolean());

    }

    @Test(expected = SdkException.class)
    public void testBooleanAbnormal() {

        String jsonAbnormal = "{\"value_boolean\":\"true\"}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test
    public void testInteger() {

        String jsonNormal = "{\"value_integer\":123}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals(Integer.valueOf(123), testBean.getValueInteger());
        String jsonNormalNull = "{\"value_integer\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueInteger());

    }

    @Test(expected = SdkException.class)
    public void testIntegerAbnormal() {

        String jsonAbnormal = "{\"value_integer\":\"123\"}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test
    public void testLong() {

        String jsonNormal = "{\"value_long\":1234567890}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals(Long.valueOf(1234567890), testBean.getValueLong());
        String jsonNormalNull = "{\"value_long\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueLong());

    }

    @Test(expected = SdkException.class)
    public void testLongAbnormal() {

        String jsonAbnormal = "{\"value_long\":\"1234567890\"}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test
    public void testDouble() {

        String jsonNormal = "{\"value_double\":12345.6789}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals(Double.valueOf(12345.6789), testBean.getValueDouble());
        String jsonNormalNull = "{\"value_double\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueDouble());

    }

    @Test(expected = SdkException.class)
    public void testDoubleAbnormal() {

        String jsonAbnormal = "{\"value_double\":\"12345.6789\"}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test
    public void testFloat() {

        String jsonNormal = "{\"value_float\":12.67}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals(Float.valueOf((float) 12.67), testBean.getValueFloat());
        String jsonNormalNull = "{\"value_float\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueFloat());

    }

    @Test(expected = SdkException.class)
    public void testFloatAbnormal() {

        String jsonAbnormal = "{\"value_float\":\"12.67\"}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test
    public void testString() {

        String jsonNormal = "{\"value_string\":\"true\"}";
        TestBean testBean = JsonUtils.toObject(jsonNormal, TestBean.class);
        Assert.assertEquals("true", testBean.getValueString());
        String jsonNormalNull = "{\"value_string\":null}";
        TestBean testBeanNull = JsonUtils.toObject(jsonNormalNull, TestBean.class);
        Assert.assertEquals(null, testBeanNull.getValueString());
        String jsonNormalEmpty = "{\"value_string\":\"\"}";
        TestBean testBeanEmpty = JsonUtils.toObject(jsonNormalEmpty, TestBean.class);
        Assert.assertEquals("", testBeanEmpty.getValueString());

    }

    @Test(expected = SdkException.class)
    public void testStringAbnormalBoolean() {

        String jsonAbnormal = "{\"value_string\":true}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test(expected = SdkException.class)
    public void testStringAbnormalInteger() {

        String jsonAbnormal = "{\"value_string\":123}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

    @Test(expected = SdkException.class)
    public void testStringAbnormalFloat() {

        String jsonAbnormal = "{\"value_string\":1.2}";
        JsonUtils.toObject(jsonAbnormal, TestBean.class);

    }

}
