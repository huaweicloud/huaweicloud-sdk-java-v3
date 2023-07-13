package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端节点组实例。
 */
public class EndpointGroupDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ConfigStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_dial_percentage")

    private Integer trafficDialPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<Id> listeners = null;

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
    @JsonProperty(value = "frozen_info")

    private FrozenInfo frozenInfo;

    public EndpointGroupDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EndpointGroupDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 终端节点组名称，取值范围：1~64个字符之间，只能由数字、字母、中划线和中文组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EndpointGroupDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 终端节点组描述信息，取值范围：0~255个字符之间，禁止输入字符：<>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EndpointGroupDetail withStatus(ConfigStatus status) {
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

    public EndpointGroupDetail withTrafficDialPercentage(Integer trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
        return this;
    }

    /**
     * 流量拨分到此组的百分比。
     * minimum: 0
     * maximum: 100
     * @return trafficDialPercentage
     */
    public Integer getTrafficDialPercentage() {
        return trafficDialPercentage;
    }

    public void setTrafficDialPercentage(Integer trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
    }

    public EndpointGroupDetail withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 终端节点组所属区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public EndpointGroupDetail withListeners(List<Id> listeners) {
        this.listeners = listeners;
        return this;
    }

    public EndpointGroupDetail addListenersItem(Id listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public EndpointGroupDetail withListeners(Consumer<List<Id>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 关联监听器列表。
     * @return listeners
     */
    public List<Id> getListeners() {
        return listeners;
    }

    public void setListeners(List<Id> listeners) {
        this.listeners = listeners;
    }

    public EndpointGroupDetail withCreatedAt(OffsetDateTime createdAt) {
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

    public EndpointGroupDetail withUpdatedAt(OffsetDateTime updatedAt) {
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

    public EndpointGroupDetail withDomainId(String domainId) {
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

    public EndpointGroupDetail withFrozenInfo(FrozenInfo frozenInfo) {
        this.frozenInfo = frozenInfo;
        return this;
    }

    public EndpointGroupDetail withFrozenInfo(Consumer<FrozenInfo> frozenInfoSetter) {
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
        EndpointGroupDetail that = (EndpointGroupDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.trafficDialPercentage, that.trafficDialPercentage)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.listeners, that.listeners)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.frozenInfo, that.frozenInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            trafficDialPercentage,
            regionId,
            listeners,
            createdAt,
            updatedAt,
            domainId,
            frozenInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointGroupDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trafficDialPercentage: ").append(toIndentedString(trafficDialPercentage)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
