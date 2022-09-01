package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CreateComputingResourceRequestBody
 */
public class CreateComputingResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_name")

    @JacksonXmlProperty(localName = "computing_resource_name")

    private String computingResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_type")

    @JacksonXmlProperty(localName = "computing_resource_type")

    private String computingResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_count")

    @JacksonXmlProperty(localName = "cu_count")

    private Integer cuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    @JacksonXmlProperty(localName = "charging_mode")

    private Integer chargingMode;

    public CreateComputingResourceRequestBody withComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
        return this;
    }

    /**
     * 新建的计算资源名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。
     * @return computingResourceName
     */
    public String getComputingResourceName() {
        return computingResourceName;
    }

    public void setComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
    }

    public CreateComputingResourceRequestBody withComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
        return this;
    }

    /**
     * 计算资源的类型。默认为sql。
     * @return computingResourceType
     */
    public String getComputingResourceType() {
        return computingResourceType;
    }

    public void setComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
    }

    public CreateComputingResourceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 计算资源的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateComputingResourceRequestBody withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /**
     * 与计算资源绑定的最小计算单元个数。设置值当前只支持16，64，256。
     * minimum: 16
     * maximum: 512
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    public CreateComputingResourceRequestBody withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计算资源的收费模式。只能设置为“1”，表示按照CU时收费。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateComputingResourceRequestBody createComputingResourceRequestBody = (CreateComputingResourceRequestBody) o;
        return Objects.equals(this.computingResourceName, createComputingResourceRequestBody.computingResourceName)
            && Objects.equals(this.computingResourceType, createComputingResourceRequestBody.computingResourceType)
            && Objects.equals(this.description, createComputingResourceRequestBody.description)
            && Objects.equals(this.cuCount, createComputingResourceRequestBody.cuCount)
            && Objects.equals(this.chargingMode, createComputingResourceRequestBody.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceName, computingResourceType, description, cuCount, chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComputingResourceRequestBody {\n");
        sb.append("    computingResourceName: ").append(toIndentedString(computingResourceName)).append("\n");
        sb.append("    computingResourceType: ").append(toIndentedString(computingResourceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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
