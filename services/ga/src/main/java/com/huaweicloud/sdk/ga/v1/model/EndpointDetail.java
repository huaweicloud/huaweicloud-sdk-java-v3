package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端节点实例。
 */
public class EndpointDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group_id")

    private String endpointGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private EndpointType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ConfigStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    /**
     * 终端的健康状态，取值： - INITIAL：初始 - HEALTHY：正常 - UNHEALTHY：异常 - NO_MONITOR：未监控
     */
    public static final class HealthStateEnum {

        /**
         * Enum INITIAL for value: "INITIAL"
         */
        public static final HealthStateEnum INITIAL = new HealthStateEnum("INITIAL");

        /**
         * Enum HEALTHY for value: "HEALTHY"
         */
        public static final HealthStateEnum HEALTHY = new HealthStateEnum("HEALTHY");

        /**
         * Enum UNHEALTHY for value: "UNHEALTHY"
         */
        public static final HealthStateEnum UNHEALTHY = new HealthStateEnum("UNHEALTHY");

        /**
         * Enum NO_MONITOR for value: "NO_MONITOR"
         */
        public static final HealthStateEnum NO_MONITOR = new HealthStateEnum("NO_MONITOR");

        private static final Map<String, HealthStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HealthStateEnum> createStaticFields() {
            Map<String, HealthStateEnum> map = new HashMap<>();
            map.put("INITIAL", INITIAL);
            map.put("HEALTHY", HEALTHY);
            map.put("UNHEALTHY", UNHEALTHY);
            map.put("NO_MONITOR", NO_MONITOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HealthStateEnum(String value) {
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
        public static HealthStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HealthStateEnum(value));
        }

        public static HealthStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HealthStateEnum) {
                return this.value.equals(((HealthStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_state")

    private HealthStateEnum healthState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_info")

    private FrozenInfo frozenInfo;

    public EndpointDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EndpointDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 对应后端资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EndpointDetail withEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }

    /**
     * 终端节点组ID。
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return endpointGroupId;
    }

    public void setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
    }

    public EndpointDetail withResourceType(EndpointType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public EndpointType getResourceType() {
        return resourceType;
    }

    public void setResourceType(EndpointType resourceType) {
        this.resourceType = resourceType;
    }

    public EndpointDetail withStatus(ConfigStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ConfigStatus getStatus() {
        return status;
    }

    public void setStatus(ConfigStatus status) {
        this.status = status;
    }

    public EndpointDetail withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 终端节点权重。
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public EndpointDetail withHealthState(HealthStateEnum healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * 终端的健康状态，取值： - INITIAL：初始 - HEALTHY：正常 - UNHEALTHY：异常 - NO_MONITOR：未监控
     * @return healthState
     */
    public HealthStateEnum getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthStateEnum healthState) {
        this.healthState = healthState;
    }

    public EndpointDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EndpointDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EndpointDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public EndpointDetail withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public EndpointDetail withFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
        return this;
    }

    public EndpointDetail withFrozenInfo(Consumer<FrozenInfo> frozenInfoSetter) {
        if (this.frozenInfo == null) {
            this.frozenInfo = new FrozenInfo();
            frozenInfoSetter.accept(this.frozenInfo);
        }

        return this;
    }

    /**
     * Get frozenInfo
     * @return frozenInfo
     */
    public FrozenInfo getFrozenInfo() {
        return frozenInfo;
    }

    public void setFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointDetail that = (EndpointDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.endpointGroupId, that.endpointGroupId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.healthState, that.healthState)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.frozenInfo, that.frozenInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            endpointGroupId,
            resourceType,
            status,
            weight,
            healthState,
            createdAt,
            updatedAt,
            domainId,
            ipAddress,
            frozenInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    frozenInfo: ").append(toIndentedString(frozenInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
