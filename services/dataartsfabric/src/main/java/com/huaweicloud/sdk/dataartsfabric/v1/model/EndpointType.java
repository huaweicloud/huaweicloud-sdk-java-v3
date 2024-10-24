package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Endpoint的类型  - service：Service EP，代表一个可接收Service请求资源组  - ray：Ray on k8s的EP，代表一个Ray集群  - inference：推理的EP，代表一个推理函数实例  - job：Job EP，代表一个可接收Job请求资源组
 */
public class EndpointType {

    /**
     * Enum SERVICE for value: "service"
     */
    public static final EndpointType SERVICE = new EndpointType("service");

    /**
     * Enum RAY for value: "ray"
     */
    public static final EndpointType RAY = new EndpointType("ray");

    /**
     * Enum INFERENCE for value: "inference"
     */
    public static final EndpointType INFERENCE = new EndpointType("inference");

    /**
     * Enum JOB for value: "job"
     */
    public static final EndpointType JOB = new EndpointType("job");

    private static final Map<String, EndpointType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EndpointType> createStaticFields() {
        Map<String, EndpointType> map = new HashMap<>();
        map.put("service", SERVICE);
        map.put("ray", RAY);
        map.put("inference", INFERENCE);
        map.put("job", JOB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EndpointType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EndpointType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointType(value));
    }

    public static EndpointType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EndpointType) {
            return this.value.equals(((EndpointType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
