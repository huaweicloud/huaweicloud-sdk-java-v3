package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class TestHttpRequestDef {

    public class TestRequest {
        private String id;
        private String body;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

    public static class InnerResponse {
        private String ires;
        private String jres;

        public String getIres() {
            return ires;
        }

        public void setIres(String ires) {
            this.ires = ires;
        }

        public String getJres() {
            return jres;
        }

        public void setJres(String jres) {
            this.jres = jres;
        }
    }

    public static class TestResponse {
        private String jobId;
        private List<InnerResponse> body;

        public String getJobId() {
            return jobId;
        }

        public void setJobId(String jobId) {
            this.jobId = jobId;
        }

        public List<InnerResponse> getBody() {
            return body;
        }

        public void setBody(List<InnerResponse> body) {
            this.body = body;
        }
    }

    @Test
    public void testHttpRequestDef() throws IllegalAccessException, InstantiationException {
        HttpRequestDef.Builder<TestRequest, TestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TestRequest.class, TestResponse.class)
                .withUri("/v2.1/{project_id}/servers")
                .withContentType("application/json;charset=UTF-8");

        builder.withResponseField("body", LocationType.Body, FieldExistence.NULL_IGNORE, List.class,
            f -> f.withMarshaller(TestResponse::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(InnerResponse.class));

        HttpRequestDef<TestRequest, TestResponse> requestDef = builder.build();
        requestDef.getResponseType();

        String result = "[{\"ires\": \"1\", \"jres\": \"2\"}, {\"ires\": \"2\", \"jres\": \"3\"}]";
        Assert.assertEquals(requestDef.hasResponseField("body"), true);
        if (requestDef.hasResponseField("body")) {
            Field<TestResponse, ?> responseField = requestDef.getResponseField("body");
            Object obj;
            if (responseField.getFieldType().isAssignableFrom(List.class)) {
                obj = JsonUtils.toListObject(result, responseField.getInnerContainerType());
            } else if (responseField.getFieldType().isAssignableFrom(Map.class)) {
                obj = JsonUtils.toMapObject(result, responseField.getInnerContainerType());
            } else {
                obj = result;
            }

            TestResponse response = requestDef.getResponseType().newInstance();

            responseField.writeValueSafe(response, obj, responseField.getFieldType());
            Assert.assertEquals(response.getBody().size(), 2);
        }
    }
}
