package com.huaweicloud.sdk.testapp;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.ecs.v2.EcsClient;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEcsClient {

    static public class TestClass {

        ServerImage image;

        public ServerImage getImage() {
            return image;
        }

        public void setImage(ServerImage image) {
            this.image = image;
        }
    }


    @Before
    public void init() {
        EcsClient.newBuilder()
            .withCredential(new BasicCredentials().withProjectId("11")
                .withAk("11")
                .withSk("11"))
            .withEndpoint("11")
            .build();
    }

    @Test
    public void testClientCustomizeJson() {
        String strJson = "{\"image\":\"\"}";
        TestClass testClassRet = JsonUtils.toObject(strJson, TestClass.class);
        Assert.assertNull(testClassRet.getImage());
    }
}
