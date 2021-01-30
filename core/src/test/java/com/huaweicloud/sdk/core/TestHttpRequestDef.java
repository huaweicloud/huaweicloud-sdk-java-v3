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
import java.util.Objects;

public class TestHttpRequestDef {

    public static class TestRequest {
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

    public static class TestNoBodyRequest {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public InnerResponse withIres(String ires) {
            this.ires = ires;
            return this;
        }

        public String getJres() {
            return jres;
        }

        public void setJres(String jres) {
            this.jres = jres;
        }

        public InnerResponse withJres(String jres) {
            this.jres = jres;
            return this;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InnerResponse) {
                return ires.equals(((InnerResponse) obj).ires) && jres.equals(((InnerResponse) obj).jres);
            } else {
                return false;
            }

        }

        @Override
        public int hashCode() {
            return Objects.hash(ires, jres);
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

    public static HttpRequestDef<TestRequest, TestResponse> buildHttpRequestDef() {
        HttpRequestDef.Builder<TestRequest, TestResponse> builder =
                HttpRequestDef.builder(HttpMethod.GET, TestRequest.class, TestResponse.class)
                        .withName("Test")
                        .withUri("/v2.1/{project_id}/servers")
                        .withContentType("application/json;charset=UTF-8");

        builder.withResponseField("body", LocationType.Body, FieldExistence.NULL_IGNORE, List.class,
            f -> f.withMarshaller(TestResponse::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(InnerResponse.class));

        HttpRequestDef<TestRequest, TestResponse> requestDef = builder.build();
        return requestDef;
    }


    public static class TestUploadDownloadRequest extends SdkStreamRequest {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public static class TestUploadDownloadResponse extends SdkStreamResponse {

    }

    public static final HttpRequestDef<TestUploadDownloadRequest, TestUploadDownloadResponse>
        buildTestUploadDownloadRequestDef() {
        HttpRequestDef.Builder<TestUploadDownloadRequest, TestUploadDownloadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST,
                TestUploadDownloadRequest.class,
                    TestUploadDownloadResponse.class)
                    .withName("TestUploadDownload")
                    .withUri("/uploaddownload")
                    .withContentType("application/octet-stream");
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TestUploadDownloadRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        return builder.build();
    }

    public static HttpRequestDef<TestNoBodyRequest, TestResponse> buildHttpRequestNoRequestBodyDef() {
        HttpRequestDef.Builder<TestNoBodyRequest, TestResponse> builder =
                HttpRequestDef.builder(HttpMethod.PUT, TestNoBodyRequest.class, TestResponse.class)
                        .withName("TestNoBody")
                        .withUri("/v2.1/{project_id}/servers")
                        .withContentType("application/json;charset=UTF-8");

        builder.withResponseField("body", LocationType.Body, FieldExistence.NULL_IGNORE, List.class,
            f -> f.withMarshaller(TestResponse::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(InnerResponse.class));

        HttpRequestDef<TestNoBodyRequest, TestResponse> requestDef = builder.build();
        return requestDef;
    }

    @Test
    public void testHttpRequestDef() throws IllegalAccessException, InstantiationException {

        HttpRequestDef<TestRequest, TestResponse> requestDef = buildHttpRequestDef();
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
