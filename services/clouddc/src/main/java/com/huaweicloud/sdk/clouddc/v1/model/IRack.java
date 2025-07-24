package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IRack
 */
public class IRack {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc")

    private String dc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power")

    private String power;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_status")

    private String orderStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cloud_based")

    private String isCloudBased;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private Integer operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_effect")

    private Integer freezeEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    public IRack withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 机柜ID，资源的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IRack withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 机柜名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IRack withDc(String dc) {
        this.dc = dc;
        return this;
    }

    /**
     * 机房名称
     * @return dc
     */
    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public IRack withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public IRack withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 机柜位置
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public IRack withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 机柜尺寸
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public IRack withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 机柜U位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public IRack withPower(String power) {
        this.power = power;
        return this;
    }

    /**
     * 机柜额定功率
     * @return power
     */
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public IRack withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IRack withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public IRack addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public IRack withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public IRack withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * 订单状态
     * @return orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public IRack withIsCloudBased(String isCloudBased) {
        this.isCloudBased = isCloudBased;
        return this;
    }

    /**
     * 是否云化纳管柜
     * @return isCloudBased
     */
    public String getIsCloudBased() {
        return isCloudBased;
    }

    public void setIsCloudBased(String isCloudBased) {
        this.isCloudBased = isCloudBased;
    }

    public IRack withOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * 操作状态
     * @return operationStatus
     */
    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public IRack withFreezeEffect(Integer freezeEffect) {
        this.freezeEffect = freezeEffect;
        return this;
    }

    /**
     * 冻结效果
     * @return freezeEffect
     */
    public Integer getFreezeEffect() {
        return freezeEffect;
    }

    public void setFreezeEffect(Integer freezeEffect) {
        this.freezeEffect = freezeEffect;
    }

    public IRack withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 冻结场景
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IRack that = (IRack) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.dc, that.dc) && Objects.equals(this.region, that.region)
            && Objects.equals(this.location, that.location) && Objects.equals(this.size, that.size)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.power, that.power)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.orderStatus, that.orderStatus)
            && Objects.equals(this.isCloudBased, that.isCloudBased)
            && Objects.equals(this.operationStatus, that.operationStatus)
            && Objects.equals(this.freezeEffect, that.freezeEffect) && Objects.equals(this.scene, that.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            dc,
            region,
            location,
            size,
            unit,
            power,
            description,
            tags,
            orderStatus,
            isCloudBased,
            operationStatus,
            freezeEffect,
            scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IRack {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dc: ").append(toIndentedString(dc)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    isCloudBased: ").append(toIndentedString(isCloudBased)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    freezeEffect: ").append(toIndentedString(freezeEffect)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
