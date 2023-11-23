package com.huaweicloud.sdk.oa.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckItem
 */
public class CheckItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice")

    private String advice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_refresh")

    private Boolean isRefresh;

    public CheckItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 检查项ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckItem withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 检查项维度
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public CheckItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckItem withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 检查项所属云服务
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public CheckItem withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 检查项风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public CheckItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 检查项描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckItem withAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    /**
     * 建议描述
     * @return advice
     */
    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public CheckItem withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 检查结果元数据
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public CheckItem withIsRefresh(Boolean isRefresh) {
        this.isRefresh = isRefresh;
        return this;
    }

    /**
     * 是否支持触发刷新
     * @return isRefresh
     */
    public Boolean getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Boolean isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckItem that = (CheckItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dimension, that.dimension)
            && Objects.equals(this.name, that.name) && Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.description, that.description)
            && Objects.equals(this.advice, that.advice) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.isRefresh, that.isRefresh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dimension, name, serviceTypeCode, riskLevel, description, advice, metadata, isRefresh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    isRefresh: ").append(toIndentedString(isRefresh)).append("\n");
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
