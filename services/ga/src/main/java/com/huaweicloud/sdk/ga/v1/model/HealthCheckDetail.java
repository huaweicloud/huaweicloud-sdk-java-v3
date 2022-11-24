package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 健康检查实例。
 */
public class HealthCheckDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group_id")

    private String endpointGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private HealthCheckProtocol protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ConfigStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

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
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_info")

    private FrozenInfo frozenInfo;

    public HealthCheckDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 健康检查ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HealthCheckDetail withEndpointGroupId(String endpointGroupId) {
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

    public HealthCheckDetail withProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public HealthCheckProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol;
    }

    public HealthCheckDetail withStatus(ConfigStatus status) {
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

    public HealthCheckDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 健康检查的端口。
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HealthCheckDetail withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 健康检查的时间间隔，单位为秒。
     * minimum: 1
     * maximum: 60
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public HealthCheckDetail withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 健康检查的超时时间，单位为秒。建议该值小于interval的值。
     * minimum: 1
     * maximum: 60
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public HealthCheckDetail withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * 最大重试次数。将终端节点的状态从“健康”设置为“不健康”或从“不健康”设置为“健康”所需的连续健康检查次数。
     * minimum: 1
     * maximum: 10
     * @return maxRetries
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public HealthCheckDetail withCreatedAt(OffsetDateTime createdAt) {
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

    public HealthCheckDetail withUpdatedAt(OffsetDateTime updatedAt) {
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

    public HealthCheckDetail withDomainId(String domainId) {
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

    public HealthCheckDetail withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启健康检查。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public HealthCheckDetail withFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
        return this;
    }

    public HealthCheckDetail withFrozenInfo(Consumer<FrozenInfo> frozenInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCheckDetail healthCheckDetail = (HealthCheckDetail) o;
        return Objects.equals(this.id, healthCheckDetail.id)
            && Objects.equals(this.endpointGroupId, healthCheckDetail.endpointGroupId)
            && Objects.equals(this.protocol, healthCheckDetail.protocol)
            && Objects.equals(this.status, healthCheckDetail.status)
            && Objects.equals(this.port, healthCheckDetail.port)
            && Objects.equals(this.interval, healthCheckDetail.interval)
            && Objects.equals(this.timeout, healthCheckDetail.timeout)
            && Objects.equals(this.maxRetries, healthCheckDetail.maxRetries)
            && Objects.equals(this.createdAt, healthCheckDetail.createdAt)
            && Objects.equals(this.updatedAt, healthCheckDetail.updatedAt)
            && Objects.equals(this.domainId, healthCheckDetail.domainId)
            && Objects.equals(this.enabled, healthCheckDetail.enabled)
            && Objects.equals(this.frozenInfo, healthCheckDetail.frozenInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            endpointGroupId,
            protocol,
            status,
            port,
            interval,
            timeout,
            maxRetries,
            createdAt,
            updatedAt,
            domainId,
            enabled,
            frozenInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCheckDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
