package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按需资源包。
 */
public class ResourcePackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Map<String, String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_value")

    private Integer periodValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measurement_name")

    private String measurementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    public ResourcePackage withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResourcePackage withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    public ResourcePackage putDescriptionItem(String key, String descriptionItem) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        this.description.put(key, descriptionItem);
        return this;
    }

    public ResourcePackage withDescription(Consumer<Map<String, String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 产品描述<语言，各语言对应的产品名>。
     * @return description
     */
    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public ResourcePackage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 产品状态，normal/onSell：正常、sellout：售空、abandon：下线。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResourcePackage withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型，MONTH：月。
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ResourcePackage withPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
        return this;
    }

    /**
     * 数量，单位:月。
     * @return periodValue
     */
    public Integer getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
    }

    public ResourcePackage withMeasurementName(String measurementName) {
        this.measurementName = measurementName;
        return this;
    }

    /**
     * 资源包单位，hour：小时。
     * @return measurementName
     */
    public String getMeasurementName() {
        return measurementName;
    }

    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    public ResourcePackage withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 资源包总量。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePackage that = (ResourcePackage) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodValue, that.periodValue)
            && Objects.equals(this.measurementName, that.measurementName)
            && Objects.equals(this.threshold, that.threshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, description, status, periodType, periodValue, measurementName, threshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePackage {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodValue: ").append(toIndentedString(periodValue)).append("\n");
        sb.append("    measurementName: ").append(toIndentedString(measurementName)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
