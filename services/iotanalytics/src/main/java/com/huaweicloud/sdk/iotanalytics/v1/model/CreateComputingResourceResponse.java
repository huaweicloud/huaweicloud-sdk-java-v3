package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateComputingResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    private String computingResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_name")

    private String computingResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_type")

    private String computingResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_count")

    private Integer cuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    public CreateComputingResourceResponse withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 新增计算资源ID。
     * @return computingResourceId
     */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    public CreateComputingResourceResponse withComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
        return this;
    }

    /**
     * 新增计算资源名称。
     * @return computingResourceName
     */
    public String getComputingResourceName() {
        return computingResourceName;
    }

    public void setComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
    }

    public CreateComputingResourceResponse withComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
        return this;
    }

    /**
     * 计算资源的类型。目前支持：sql。如果不指定，默认为sql。
     * @return computingResourceType
     */
    public String getComputingResourceType() {
        return computingResourceType;
    }

    public void setComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
    }

    public CreateComputingResourceResponse withDescription(String description) {
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

    public CreateComputingResourceResponse withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /**
     * 与计算资源绑定的最小计算单元个数。设置值当前只支持16，64，256。
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    public CreateComputingResourceResponse withChargingMode(Integer chargingMode) {
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

    public CreateComputingResourceResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建计算资源时间。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateComputingResourceResponse that = (CreateComputingResourceResponse) obj;
        return Objects.equals(this.computingResourceId, that.computingResourceId)
            && Objects.equals(this.computingResourceName, that.computingResourceName)
            && Objects.equals(this.computingResourceType, that.computingResourceType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.cuCount, that.cuCount)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.createdTime, that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceId,
            computingResourceName,
            computingResourceType,
            description,
            cuCount,
            chargingMode,
            createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComputingResourceResponse {\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
        sb.append("    computingResourceName: ").append(toIndentedString(computingResourceName)).append("\n");
        sb.append("    computingResourceType: ").append(toIndentedString(computingResourceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
