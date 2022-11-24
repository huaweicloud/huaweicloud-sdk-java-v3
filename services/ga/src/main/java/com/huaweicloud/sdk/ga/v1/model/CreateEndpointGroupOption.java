package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建终端节点组的详细信息。
 */
public class CreateEndpointGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_dial_percentage")

    private Integer trafficDialPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<Id> listeners = null;

    public CreateEndpointGroupOption withName(String name) {
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

    public CreateEndpointGroupOption withDescription(String description) {
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

    public CreateEndpointGroupOption withTrafficDialPercentage(Integer trafficDialPercentage) {
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

    public CreateEndpointGroupOption withRegionId(String regionId) {
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

    public CreateEndpointGroupOption withListeners(List<Id> listeners) {
        this.listeners = listeners;
        return this;
    }

    public CreateEndpointGroupOption addListenersItem(Id listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public CreateEndpointGroupOption withListeners(Consumer<List<Id>> listenersSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEndpointGroupOption createEndpointGroupOption = (CreateEndpointGroupOption) o;
        return Objects.equals(this.name, createEndpointGroupOption.name)
            && Objects.equals(this.description, createEndpointGroupOption.description)
            && Objects.equals(this.trafficDialPercentage, createEndpointGroupOption.trafficDialPercentage)
            && Objects.equals(this.regionId, createEndpointGroupOption.regionId)
            && Objects.equals(this.listeners, createEndpointGroupOption.listeners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, trafficDialPercentage, regionId, listeners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    trafficDialPercentage: ").append(toIndentedString(trafficDialPercentage)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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
