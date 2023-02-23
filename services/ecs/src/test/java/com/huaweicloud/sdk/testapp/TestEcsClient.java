package com.huaweicloud.sdk.testapp;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.ecs.v2.EcsClient;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TestEcsClient {

    static public class TestClass {

        ServerImage image;

        public ServerImage getImage() {
            return image;
        }

        public void setImage(ServerImage image) {
            this.image = image;
        }

        public TestClass withImage(ServerImage image) {
            this.image = image;
            return this;
        }
    }


    @Before
    public void init() {
        EcsClient.newBuilder()
                .withCredential(new BasicCredentials().withProjectId("11")
                        .withAk("11")
                        .withSk("11"))
                .withEndpoints(Arrays.asList("11"))
                .build();
    }

    @Test
    public void testClientCustomizeJson() {
        String strJson = "{\"image\":\"\"}";
        TestClass testClassRet = JsonUtils.toObject(strJson, TestClass.class);
        Assert.assertNull(testClassRet.getImage());
    }

    @Test
    public void testClientCustomizeStdJson() {
        TestClass testClass = new TestClass().withImage(new ServerImage().withId("idtest"));
        String json = JsonUtils.toJSON(testClass);

        TestClass testClassRet = JsonUtils.toObject(json, TestClass.class);
        Assert.assertNotNull(testClassRet.getImage());
        Assert.assertEquals(testClassRet.getImage().getId(), "idtest");
    }

    @Test
    public void testClientCustomizeStdNullJson() {

        String strJson = "{\"image\":{\"id\": null}}";
        TestClass testClassRet = JsonUtils.toObject(strJson, TestClass.class);
        Assert.assertNotNull(testClassRet.getImage());
        Assert.assertNull(testClassRet.getImage().getId());
    }

    @Test
    public void testClientCustomizeStdNull2Json() {
        TestClass testClass = new TestClass().withImage(new ServerImage().withId(null));
        String json = JsonUtils.toJSON(testClass);
        TestClass testClassRet = JsonUtils.toObject(json, TestClass.class);
        Assert.assertNotNull(testClassRet.getImage());
        Assert.assertNull(testClassRet.getImage().getId());
    }

    @Test
    public void testClientCustomizeStdNull3Json() {
        TestClass testClass = new TestClass().withImage(null);
        String json = JsonUtils.toJSON(testClass);
        TestClass testClassRet = JsonUtils.toObject(json, TestClass.class);
        Assert.assertNull(testClassRet.getImage());
    }

}
