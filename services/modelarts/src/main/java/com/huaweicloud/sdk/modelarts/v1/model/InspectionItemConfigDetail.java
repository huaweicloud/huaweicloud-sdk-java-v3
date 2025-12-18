package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：巡检压测用例信息。 **取值范围**：不涉及。
 */
public class InspectionItemConfigDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_time")

    private Long intervalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private InspectionItemType itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times")

    private Integer times;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_param")

    private InspectionItemExternalParam externalParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_type")

    private InspectionType inspectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category")

    private InspectionItemCategory itemCategory;

    public InspectionItemConfigDetail withIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }

    /**
     * **参数解释**：执行轮次时间间隔。 **取值范围**：[0,100000]。
     * minimum: 0
     * maximum: 100000
     * @return intervalTime
     */
    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public InspectionItemConfigDetail withItemType(InspectionItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Get itemType
     * @return itemType
     */
    public InspectionItemType getItemType() {
        return itemType;
    }

    public void setItemType(InspectionItemType itemType) {
        this.itemType = itemType;
    }

    public InspectionItemConfigDetail withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * **参数解释**：执行轮次。 **取值范围**：[0,100]。
     * minimum: 0
     * maximum: 100
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public InspectionItemConfigDetail withExternalParam(InspectionItemExternalParam externalParam) {
        this.externalParam = externalParam;
        return this;
    }

    public InspectionItemConfigDetail withExternalParam(Consumer<InspectionItemExternalParam> externalParamSetter) {
        if (this.externalParam == null) {
            this.externalParam = new InspectionItemExternalParam();
            externalParamSetter.accept(this.externalParam);
        }

        return this;
    }

    /**
     * Get externalParam
     * @return externalParam
     */
    public InspectionItemExternalParam getExternalParam() {
        return externalParam;
    }

    public void setExternalParam(InspectionItemExternalParam externalParam) {
        this.externalParam = externalParam;
    }

    public InspectionItemConfigDetail withInspectionType(InspectionType inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    /**
     * Get inspectionType
     * @return inspectionType
     */
    public InspectionType getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionType inspectionType) {
        this.inspectionType = inspectionType;
    }

    public InspectionItemConfigDetail withItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
        return this;
    }

    /**
     * Get itemCategory
     * @return itemCategory
     */
    public InspectionItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionItemConfigDetail that = (InspectionItemConfigDetail) obj;
        return Objects.equals(this.intervalTime, that.intervalTime) && Objects.equals(this.itemType, that.itemType)
            && Objects.equals(this.times, that.times) && Objects.equals(this.externalParam, that.externalParam)
            && Objects.equals(this.inspectionType, that.inspectionType)
            && Objects.equals(this.itemCategory, that.itemCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalTime, itemType, times, externalParam, inspectionType, itemCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionItemConfigDetail {\n");
        sb.append("    intervalTime: ").append(toIndentedString(intervalTime)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    externalParam: ").append(toIndentedString(externalParam)).append("\n");
        sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
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
