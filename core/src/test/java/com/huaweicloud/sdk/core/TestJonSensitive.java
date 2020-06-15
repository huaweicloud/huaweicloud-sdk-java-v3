package com.huaweicloud.sdk.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.huaweicloud.sdk.core.json.JsonSensitive;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestJonSensitive {

    @Test
    public void testHideSensitive() throws JsonProcessingException {
        DataBean data = new DataBean();
        data.setPwd("hide me");
        data.setNormal("normal");
        Assert.assertEquals("{\"pwd\":\"hide me\",\"normal\":\"normal\"}",
            JsonUtils.getDefaultMapper().writeValueAsString(data));
        Assert.assertEquals("{\"pwd\":\"******\",\"normal\":\"normal\"}",
            JsonUtils.getSecureMapperWithoutSensitive().writeValueAsString(data));

        data.setPwd(null);
        Assert.assertEquals("{\"pwd\":null,\"normal\":\"normal\"}",
            JsonUtils.getSecureMapperWithoutSensitive().writeValueAsString(data));
    }

    public static class DataBean {
        @JsonSensitive
        String pwd;
        String normal;

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getNormal() {
            return normal;
        }

        public void setNormal(String normal) {
            this.normal = normal;
        }
    }
}
