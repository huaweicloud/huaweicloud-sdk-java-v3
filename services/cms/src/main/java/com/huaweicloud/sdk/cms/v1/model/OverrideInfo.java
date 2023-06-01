package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例的详细信息
 */
public class OverrideInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_price")

    private Double spotPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weighted_capacity")

    private Double weightedCapacity;

    public OverrideInfo withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区ID
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public OverrideInfo withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 实例规格ID
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public OverrideInfo withSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * 用户愿意为竞价实例每小时支付的最高价格
     * @return spotPrice
     */
    public Double getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
    }

    public OverrideInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。数值越小，优先级越高，优先购买。 取值范围：0到Integer.MAX_VALUE 默认值是Integer.MAX_VALUE
     * minimum: 0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public OverrideInfo withWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    /**
     * 实例规格的权重。取值越高，单台实例满足计算力需求的能力越大，所需的实例数量越小。 取值范围：大于0 可以根据指定实例规格的计算力和集群单节点最低计算力得出权重值。 假设单节点最低计算力为8vcpu、60GB，则8vcpu、60GB的实例规格权重可设置为1，16vcpu、120GB的实例规格权重可设置为2
     * minimum: 1
     * maximum: 5E+2
     * @return weightedCapacity
     */
    public Double getWeightedCapacity() {
        return weightedCapacity;
    }

    public void setWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverrideInfo overrideInfo = (OverrideInfo) o;
        return Objects.equals(this.availabilityZoneId, overrideInfo.availabilityZoneId)
            && Objects.equals(this.flavorId, overrideInfo.flavorId)
            && Objects.equals(this.spotPrice, overrideInfo.spotPrice)
            && Objects.equals(this.priority, overrideInfo.priority)
            && Objects.equals(this.weightedCapacity, overrideInfo.weightedCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneId, flavorId, spotPrice, priority, weightedCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverrideInfo {\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    weightedCapacity: ").append(toIndentedString(weightedCapacity)).append("\n");
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
