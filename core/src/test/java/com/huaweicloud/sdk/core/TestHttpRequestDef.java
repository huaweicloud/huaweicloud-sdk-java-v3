package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import com.huaweicloud.sdk.core.utils.JsonUtils;

import net.minidev.json.annotate.JsonIgnore;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

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
        HttpRequestDef.Builder<TestRequest, TestResponse> builder = HttpRequestDef.builder(HttpMethod.GET,
            TestRequest.class, TestResponse.class)
            .withName("Test")
            .withUri("/v2.1/{project_id}/servers")
            .withContentType("application/json;charset=UTF-8");

        builder.withResponseField("body", LocationType.Body, FieldExistence.NULL_IGNORE, List.class,
            f -> f.withMarshaller(TestResponse::getBody, TestResponse::setBody)
                .withInnerContainerType(InnerResponse.class));

        return builder.build();
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

    public static class TestFormDataBodyBody implements SdkFormDataBody {

        private FormDataFilePart uploadFile;

        private String uuid = null;

        public String getUuid() {
            return this.uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public FormDataFilePart getUploadFile() {
            return uploadFile;
        }

        public TestFormDataBodyBody withUploadFile(InputStream inputstream, String filename) {
            uploadFile = new FormDataFilePart(inputstream, filename);
            return this;
        }

        public TestFormDataBodyBody withUploadFile(InputStream inputstream, String filename, String contentType) {
            uploadFile = new FormDataFilePart(inputstream, filename).withContentType(contentType);
            return this;
        }

        public TestFormDataBodyBody withUploadFile(InputStream inputstream, String filename,
            Map<String, String> headers) {
            uploadFile = new FormDataFilePart(inputstream, filename).withHeaders(headers);
            return this;
        }

        public TestFormDataBodyBody withUploadFile(FormDataFilePart uploadFile) {
            this.uploadFile = uploadFile;
            return this;
        }

        @Override
        public Map<String, FormDataPart> buildFormData() {
            return new LinkedHashMap<String, FormDataPart>() {
                {
                    put("uuid", new FormDataPart<>(uuid));
                    put("uploadFile", uploadFile);
                }
            };
        }
    }

    public static class TestFormDataRequest {

        @JsonIgnore
        private TestFormDataBodyBody body;

        public TestFormDataBodyBody getBody() {
            return body;
        }

        public TestFormDataRequest withBody(TestFormDataBodyBody body) {
            this.body = body;
            return this;
        }

        public TestFormDataRequest withBody(Consumer<TestFormDataBodyBody> consumer) {
            if (body == null) {
                body = new TestFormDataBodyBody();
            }
            consumer.accept(body);
            return this;
        }
    }

    public static class TestFormDataResponse extends SdkStreamResponse {

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

    public static final HttpRequestDef<TestFormDataRequest, TestFormDataResponse> buildTestFormDataRequestDef() {
        HttpRequestDef.Builder<TestFormDataRequest, TestFormDataResponse> builder = HttpRequestDef.builder(
            HttpMethod.POST, TestFormDataRequest.class, TestFormDataResponse.class)
            .withName("TestFormData")
            .withUri("/upload-formdata")
            .withContentType("multipart/form-data");

        builder.withRequestField("body", LocationType.Body, FieldExistence.NON_NULL_NON_EMPTY,
            TestFormDataBodyBody.class, f -> f.withMarshaller(TestFormDataRequest::getBody, null));

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

    public static class TestCustomAuthorizationRequest {
        private String authorization;

        public TestCustomAuthorizationRequest withAuthorization(String auth) {
            authorization = auth;
            return this;
        }

        public String getAuthorization() {
            return authorization;
        }

        public void setAuthorization(String authorization) {
            this.authorization = authorization;
        }
    }

    public static class TestCustomAuthorizationResponse {
        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static HttpRequestDef<TestCustomAuthorizationRequest, TestCustomAuthorizationResponse>
        buildTestCustomizedAuthorizationRequestDef() {
        // basic
        HttpRequestDef.Builder<TestCustomAuthorizationRequest, TestCustomAuthorizationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, TestCustomAuthorizationRequest.class, TestCustomAuthorizationResponse.class)
            .withName("TestCustomizeAuthorization")
            .withUri("/v3/oidc/authorization")
            .withContentType("application/json");

        // requests
        builder.withRequestField("Authorization", LocationType.Header, FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(TestCustomAuthorizationRequest::getAuthorization,
                TestCustomAuthorizationRequest::setAuthorization));

        // response
        builder.withResponseField("token", LocationType.Header, FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TestCustomAuthorizationResponse::getToken,
                TestCustomAuthorizationResponse::setToken));
        return builder.build();
    }

    @Test
    public void testHttpRequestDef() throws IllegalAccessException, InstantiationException {

        HttpRequestDef<TestRequest, TestResponse> requestDef = buildHttpRequestDef();
        requestDef.getResponseType();

        String result = "[{\"ires\": \"1\", \"jres\": \"2\"}, {\"ires\": \"2\", \"jres\": \"3\"}]";
        Assert.assertTrue(requestDef.hasResponseField("body"));
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
