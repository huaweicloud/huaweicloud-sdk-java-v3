package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 虚拟机列表
 */
public class InstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_mode")

    private String sellMode;

    public InstanceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 弹性云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性云服务器id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceInfo withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public InstanceInfo withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 弹性云服务器规格
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public InstanceInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性云服务器状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceInfo withSellMode(String sellMode) {
        this.sellMode = sellMode;
        return this;
    }

    /**
     * 销售模型，枚举值 spot：竞价实例 onDemand：按需实例
     * @return sellMode
     */
    public String getSellMode() {
        return sellMode;
    }

    public void setSellMode(String sellMode) {
        this.sellMode = sellMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceInfo instanceInfo = (InstanceInfo) o;
        return Objects.equals(this.name, instanceInfo.name) && Objects.equals(this.id, instanceInfo.id)
            && Objects.equals(this.availabilityZoneId, instanceInfo.availabilityZoneId)
            && Objects.equals(this.flavorId, instanceInfo.flavorId) && Objects.equals(this.status, instanceInfo.status)
            && Objects.equals(this.sellMode, instanceInfo.sellMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, availabilityZoneId, flavorId, status, sellMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sellMode: ").append(toIndentedString(sellMode)).append("\n");
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
