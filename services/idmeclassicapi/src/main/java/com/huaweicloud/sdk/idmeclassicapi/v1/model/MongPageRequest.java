package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MongPageRequest
 */
public class MongPageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endLastModifiedTime")

    private String endLastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmVersion")

    private Integer rdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceId")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceRdmVersion")

    private Integer sourceRdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startLastModifiedTime")

    private String startLastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetId")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetRdmVersion")

    private Integer targetRdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    public MongPageRequest withEndLastModifiedTime(String endLastModifiedTime) {
        this.endLastModifiedTime = endLastModifiedTime;
        return this;
    }

    /**
     * 结束时间。系统以数据实例的最后修改时间作为查询条件，您定义的开始时间和结束时间作为时间范围进行查询。
     * @return endLastModifiedTime
     */
    public String getEndLastModifiedTime() {
        return endLastModifiedTime;
    }

    public void setEndLastModifiedTime(String endLastModifiedTime) {
        this.endLastModifiedTime = endLastModifiedTime;
    }

    public MongPageRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MongPageRequest withRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
        return this;
    }

    /**
     * 版本号。
     * @return rdmVersion
     */
    public Integer getRdmVersion() {
        return rdmVersion;
    }

    public void setRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
    }

    public MongPageRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 关系实体源端ID。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public MongPageRequest withSourceRdmVersion(Integer sourceRdmVersion) {
        this.sourceRdmVersion = sourceRdmVersion;
        return this;
    }

    /**
     * 关系实体源端系统版本。
     * @return sourceRdmVersion
     */
    public Integer getSourceRdmVersion() {
        return sourceRdmVersion;
    }

    public void setSourceRdmVersion(Integer sourceRdmVersion) {
        this.sourceRdmVersion = sourceRdmVersion;
    }

    public MongPageRequest withStartLastModifiedTime(String startLastModifiedTime) {
        this.startLastModifiedTime = startLastModifiedTime;
        return this;
    }

    /**
     * 开始时间。系统以数据实例的最后修改时间作为查询条件，您定义的开始时间和结束时间作为时间范围进行查询。
     * @return startLastModifiedTime
     */
    public String getStartLastModifiedTime() {
        return startLastModifiedTime;
    }

    public void setStartLastModifiedTime(String startLastModifiedTime) {
        this.startLastModifiedTime = startLastModifiedTime;
    }

    public MongPageRequest withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 关系实体目标端ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public MongPageRequest withTargetRdmVersion(Integer targetRdmVersion) {
        this.targetRdmVersion = targetRdmVersion;
        return this;
    }

    /**
     * 关系实体目标端系统版本。
     * @return targetRdmVersion
     */
    public Integer getTargetRdmVersion() {
        return targetRdmVersion;
    }

    public void setTargetRdmVersion(Integer targetRdmVersion) {
        this.targetRdmVersion = targetRdmVersion;
    }

    public MongPageRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 单边不确定关系的目标端类型。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MongPageRequest that = (MongPageRequest) obj;
        return Objects.equals(this.endLastModifiedTime, that.endLastModifiedTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.rdmVersion, that.rdmVersion) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.sourceRdmVersion, that.sourceRdmVersion)
            && Objects.equals(this.startLastModifiedTime, that.startLastModifiedTime)
            && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.targetRdmVersion, that.targetRdmVersion)
            && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endLastModifiedTime,
            id,
            rdmVersion,
            sourceId,
            sourceRdmVersion,
            startLastModifiedTime,
            targetId,
            targetRdmVersion,
            targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MongPageRequest {\n");
        sb.append("    endLastModifiedTime: ").append(toIndentedString(endLastModifiedTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceRdmVersion: ").append(toIndentedString(sourceRdmVersion)).append("\n");
        sb.append("    startLastModifiedTime: ").append(toIndentedString(startLastModifiedTime)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetRdmVersion: ").append(toIndentedString(targetRdmVersion)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
