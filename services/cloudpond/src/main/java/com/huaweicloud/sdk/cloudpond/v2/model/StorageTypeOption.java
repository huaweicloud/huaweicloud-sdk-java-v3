package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageTypeOption
 */
public class StorageTypeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_code")

    private String zoneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_capacity_step")

    private Integer expandCapacityStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_capacities")

    private List<Integer> supportedCapacities = null;

    public StorageTypeOption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储类型id，uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StorageTypeOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 售卖存储类型
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageTypeOption withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * 地区编码，表示允许在这个国家购买部署
     * @return zoneCode
     */
    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public StorageTypeOption withExpandCapacityStep(Integer expandCapacityStep) {
        this.expandCapacityStep = expandCapacityStep;
        return this;
    }

    /**
     * 步长，为0时仅可购买gears中的容量
     * @return expandCapacityStep
     */
    public Integer getExpandCapacityStep() {
        return expandCapacityStep;
    }

    public void setExpandCapacityStep(Integer expandCapacityStep) {
        this.expandCapacityStep = expandCapacityStep;
    }

    public StorageTypeOption withSupportedCapacities(List<Integer> supportedCapacities) {
        this.supportedCapacities = supportedCapacities;
        return this;
    }

    public StorageTypeOption addSupportedCapacitiesItem(Integer supportedCapacitiesItem) {
        if (this.supportedCapacities == null) {
            this.supportedCapacities = new ArrayList<>();
        }
        this.supportedCapacities.add(supportedCapacitiesItem);
        return this;
    }

    public StorageTypeOption withSupportedCapacities(Consumer<List<Integer>> supportedCapacitiesSetter) {
        if (this.supportedCapacities == null) {
            this.supportedCapacities = new ArrayList<>();
        }
        supportedCapacitiesSetter.accept(this.supportedCapacities);
        return this;
    }

    /**
     * 固定购买容量，为空时直接按步长购买
     * @return supportedCapacities
     */
    public List<Integer> getSupportedCapacities() {
        return supportedCapacities;
    }

    public void setSupportedCapacities(List<Integer> supportedCapacities) {
        this.supportedCapacities = supportedCapacities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageTypeOption that = (StorageTypeOption) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.zoneCode, that.zoneCode)
            && Objects.equals(this.expandCapacityStep, that.expandCapacityStep)
            && Objects.equals(this.supportedCapacities, that.supportedCapacities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, zoneCode, expandCapacityStep, supportedCapacities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageTypeOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
        sb.append("    expandCapacityStep: ").append(toIndentedString(expandCapacityStep)).append("\n");
        sb.append("    supportedCapacities: ").append(toIndentedString(supportedCapacities)).append("\n");
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
