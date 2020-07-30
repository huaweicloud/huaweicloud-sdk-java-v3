package com.huaweicloud.sdk.core;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;


public class TestDateTime {


    public static class DataBean {

        @JsonProperty("created_at")
        OffsetDateTime createdAt;

        public OffsetDateTime  getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(OffsetDateTime  createdAt) {
            this.createdAt = createdAt;
        }
    }

    @Test
    public void testDateTime() {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2020-07-27T07:15:45Z");
        String json1 = "{\"created_at\":\"2020-07-27T07:15:45Z\"}";
        DataBean dataBean1 = JsonUtils.toObject(json1, DataBean.class);
        System.out.println(dataBean1.getCreatedAt().toString());
        Assert.assertEquals(dataBean1.getCreatedAt(), offsetDateTime);

        String json2 = "{\"created_at\":\"2020-07-27T07:15:45\"}";
        DataBean dataBean2 = JsonUtils.toObject(json2, DataBean.class);
        System.out.println(dataBean2.getCreatedAt().toString());
        Assert.assertEquals(dataBean2.getCreatedAt(), offsetDateTime);

        String json3 = "{\"created_at\":\"2020-07-27 07:15:45\"}";
        DataBean dataBean3 = JsonUtils.toObject(json3, DataBean.class);
        System.out.println(dataBean3.getCreatedAt().toString());
        Assert.assertEquals(dataBean3.getCreatedAt(), offsetDateTime);


        String json4 = "{\"created_at\":\"2020-07-27T15:15:45+08:00\"}";
        DataBean dataBean4 = JsonUtils.toObject(json4, DataBean.class);
        System.out.println(dataBean4.getCreatedAt().toString());
        Assert.assertEquals(dataBean4.getCreatedAt().withOffsetSameInstant(ZoneOffset.UTC), offsetDateTime);
    }

}
