package com.huaweicloud.sdk.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.utils.JsonUtils;

public class TestMapQueryParameters {
    TestRequest request;

    public static class TestRequest {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "p1")
        private String p1;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "p2")
        private Map<String, String> p2;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "p3")
        private Map<String, List<String>> p3;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "p4")
        private Map<String, Map<String, String>> p4;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "p5")
        private List<String> p5;

        public String getP1() {
            return p1;
        }

        public void setP1(String p1) {
            this.p1 = p1;
        }

        public Map<String, String> getP2() {
            return p2;
        }

        public void setP2(Map<String, String> p2) {
            this.p2 = p2;
        }

        public Map<String, List<String>> getP3() {
            return p3;
        }

        public void setP3(Map<String, List<String>> p3) {
            this.p3 = p3;
        }

        public Map<String, Map<String, String>> getP4() {
            return p4;
        }

        public void setP4(Map<String, Map<String, String>> p4) {
            this.p4 = p4;
        }

        public List<String> getP5() {
            return p5;
        }

        public void setP5(List<String> p5) {
            this.p5 = p5;
        }

        public TestRequest withP1(String p1) {
            this.p1 = p1;
            return this;
        }

        public TestRequest withP2(Map<String, String> p2) {
            this.p2 = p2;
            return this;
        }

        public TestRequest withP3(Map<String, List<String>> p3) {
            this.p3 = p3;
            return this;
        }

        public TestRequest withP4(Map<String, Map<String, String>> p4) {
            this.p4 = p4;
            return this;
        }

        public TestRequest withP5(List<String> p5) {
            this.p5 = p5;
            return this;
        }
    }

    public static class TestResponse {
    }

    private static HttpRequestDef<TestRequest, TestResponse> genFortest() {
        // basic
        HttpRequestDef.Builder<TestRequest, TestResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, TestRequest.class, TestResponse.class)
                .withUri("/v1/test");

        // requests
        builder.withRequestField("p1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TestRequest::getP1, TestRequest::setP1)
        );
        builder.withRequestField("p2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Map.class,
            f -> f.withMarshaller(TestRequest::getP2, TestRequest::setP2)
        );
        builder.withRequestField("p3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Map.class,
            f -> f.withMarshaller(TestRequest::getP3, TestRequest::setP3)
        );
        builder.withRequestField("p4",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Map.class,
            f -> f.withMarshaller(TestRequest::getP4, TestRequest::setP4)
        );
        builder.withRequestField("p5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(TestRequest::getP5, TestRequest::setP5)
        );

        // response
        return builder.build();
    }

    private <ReqT, ResT> HttpRequest buildRequest(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {
        HttpRequest.HttpRequestBuilder httpRequestBuilder = HttpRequest.newBuilder();
        httpRequestBuilder.withMethod(reqDef.getMethod())
            .withContentType(reqDef.getContentType())
            .withEndpoint("https://ecs.cn-north-1.myhuaweicloud.com")
            .withPath(reqDef.getUri());

        for (Field<ReqT, ?> field : reqDef.getRequestFields()) {
            Optional<?> reqValueOption = field.readValue(request);
            if (reqValueOption.isPresent()) {
                Object reqValue = reqValueOption.get();
                if (field.getLocation() == LocationType.Header) {
                    httpRequestBuilder.addHeader(field.getName(), reqValue.toString());
                } else if (field.getLocation() == LocationType.Query) {
                    if (reqValue instanceof Collection) {
                        httpRequestBuilder.addQueryParam(field.getName(), buildCollectionQueryParams(reqValue));
                    } else if (reqValue instanceof Map) {
                        Map<String, List<String>> params = buildMapQueryParamsLoop(field.getName(), (Map) reqValue);
                        for (Map.Entry entry : params.entrySet()) {
                            httpRequestBuilder.addQueryParam((String) entry.getKey(), (List<String>) entry.getValue());
                        }
                    } else {
                        httpRequestBuilder.addQueryParam(
                            field.getName(), buildStringQueryParams(reqValue));
                    }
                } else if (field.getLocation() == LocationType.Path) {
                    httpRequestBuilder.addPathParam(field.getName(), reqValue.toString());
                } else if (field.getLocation() == LocationType.Body) {
                    httpRequestBuilder.withBodyAsString(JsonUtils.toJSON(reqValue));
                }
            }
        }

        HttpRequest httpRequest = httpRequestBuilder.build();

        return httpRequest;
    }

    private List<String> buildStringQueryParams(Object reqValue) {
        return Arrays.asList(reqValue.toString());
    }

    private List<String> buildCollectionQueryParams(Object reqValue) {
        return ((List<Object>) reqValue).stream().map(Object::toString).collect(Collectors.toList());
    }

    private Map<String, List<String>> buildMapQueryParamsLoop(String key, Map reqValue) {
        Map<String, List<String>> result = new HashMap<>();
        Stack<Map<String, List<String>>> stack = new Stack<>();

        reqValue.forEach((k, v) -> stack.push(buildMapQueryParams(key, k.toString(), v)));

        while (!stack.isEmpty()) {
            Map<String, List<String>> temp = stack.pop();
            temp.forEach(result::put);
        }

        return result;
    }

    private Map<String, List<String>> buildMapQueryParams(String key, String entryKey, Object entryValue) {
        Map<String, List<String>> res = new HashMap<>();
        if (entryValue instanceof Map) {
            ((Map<?, ?>) entryValue).forEach((k, v) -> {
                res.putAll(buildMapQueryParams(key + "[" + entryKey + "]", k.toString(), v));
            });
        } else if (entryValue instanceof Collection) {
            res.put(key + "[" + entryKey + "]", buildCollectionQueryParams(entryValue));
        } else {
            res.put(key + "[" + entryKey + "]", buildStringQueryParams(entryValue));
        }
        return res;
    }

    @Before
    public void init() {
        String map1 = "p1";

        Map<String, String> map2 = new HashMap<>();
        map2.put("id", "p2");

        Map<String, List<String>> map3 = new LinkedHashMap<>();
        List<String> list31 = Arrays.asList("p31", "p32");
        map3.put("id1", list31);
        List<String> list32 = Arrays.asList("p33", "p34");
        map3.put("id2", list32);
        map3.put("id3", Collections.emptyList());

        Map<String, Map<String, String>> map4 = new HashMap<>();
        Map<String, String> map41 = new HashMap<>();
        map41.put("id1", "p41");
        map41.put("id2", "p42");
        map4.put("id", map41);

        List<String> map5 = Arrays.asList("p51", "p52");

        request = new TestRequest()
            .withP1(map1)
            .withP2(map2)
            .withP3(map3)
            .withP4(map4)
            .withP5(map5)
        ;
    }

    @Test
    public void buildQuery() {
        HttpRequest httpRequest = buildRequest(request, genFortest());
        // 当类型为 Map<String, List<Object>> 时，由于堆栈先进后出，此处参数的顺序为逆序
        Assert.assertEquals("p1=p1&p2[id]=p2&p3[id3]&p3[id2]=p33&p3[id2]=p34&p3[id1]=p31&p3[id1]=p32"
            + "&p4[id][id1]=p41&p4[id][id2]=p42&p5=p51&p5=p52", httpRequest.getQueryParamsString());
    }
}
