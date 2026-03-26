package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Endpoint的类型。 **约束限制**：不涉及。 **取值范围**：   - service：Service EP，代表一个可接收Service请求资源组；   - ray：RayCluter on k8s的EP，代表一个Ray集群；   - inference：推理的EP，代表一个推理函数实例；   - job：Job EP，代表一个可接收Job请求资源组；   - ray_service：RayService on k8s的EP，代表一个RayService。   - sql：SQL EP，代表一个可接收SQL请求资源组。   - container_job：容器类型job的EP，代表一个可接收容器类型Job请求的资源组。   - notebook：Notebook EP，代表一个notebook运行资源组。 **默认取值**：不涉及。
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

    /**
     * Enum RAY_SERVICE for value: "ray_service"
     */
    public static final EndpointType RAY_SERVICE = new EndpointType("ray_service");

    /**
     * Enum SQL for value: "sql"
     */
    public static final EndpointType SQL = new EndpointType("sql");

    /**
     * Enum CONTAINER_JOB for value: "container_job"
     */
    public static final EndpointType CONTAINER_JOB = new EndpointType("container_job");

    /**
     * Enum NOTEBOOK for value: "notebook"
     */
    public static final EndpointType NOTEBOOK = new EndpointType("notebook");

    private static final Map<String, EndpointType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EndpointType> createStaticFields() {
        Map<String, EndpointType> map = new HashMap<>();
        map.put("service", SERVICE);
        map.put("ray", RAY);
        map.put("inference", INFERENCE);
        map.put("job", JOB);
        map.put("ray_service", RAY_SERVICE);
        map.put("sql", SQL);
        map.put("container_job", CONTAINER_JOB);
        map.put("notebook", NOTEBOOK);
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
