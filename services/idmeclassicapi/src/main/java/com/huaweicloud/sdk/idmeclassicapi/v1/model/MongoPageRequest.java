package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MongoPageRequest
 */
public class MongoPageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startLastModifiedTime")

    private String startLastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endLastModifiedTime")

    private String endLastModifiedTime;

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
    @JsonProperty(value = "targetId")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetRdmVersion")

    private Integer targetRdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    public MongoPageRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  数据实例ID，用于指定待查询历史版本的数据实例。 获取方法请参见[分页查询实例 - ShowFindUsingPost](https://support.huaweicloud.com/api-idme/ShowFindUsingPost.html)。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MongoPageRequest withStartLastModifiedTime(String startLastModifiedTime) {
        this.startLastModifiedTime = startLastModifiedTime;
        return this;
    }

    /**
     * **参数解释：**  开始时间，用于指定查询时间区间的起始点。系统以数据实例的最后修改时间作为查询条件。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return startLastModifiedTime
     */
    public String getStartLastModifiedTime() {
        return startLastModifiedTime;
    }

    public void setStartLastModifiedTime(String startLastModifiedTime) {
        this.startLastModifiedTime = startLastModifiedTime;
    }

    public MongoPageRequest withEndLastModifiedTime(String endLastModifiedTime) {
        this.endLastModifiedTime = endLastModifiedTime;
        return this;
    }

    /**
     * **参数解释：**  结束时间，用于指定查询时间区间的结束点。系统以数据实例的最后修改时间作为查询条件。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return endLastModifiedTime
     */
    public String getEndLastModifiedTime() {
        return endLastModifiedTime;
    }

    public void setEndLastModifiedTime(String endLastModifiedTime) {
        this.endLastModifiedTime = endLastModifiedTime;
    }

    public MongoPageRequest withRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
        return this;
    }

    /**
     * **参数解释：**  系统版本号，用于指定查询特定版本的历史记录。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return rdmVersion
     */
    public Integer getRdmVersion() {
        return rdmVersion;
    }

    public void setRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
    }

    public MongoPageRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：**  关系实体源端ID，用于查询关系实体的历史版本信息。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public MongoPageRequest withSourceRdmVersion(Integer sourceRdmVersion) {
        this.sourceRdmVersion = sourceRdmVersion;
        return this;
    }

    /**
     * **参数解释：**  关系实体源端系统版本，用于指定源端实例的特定版本。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return sourceRdmVersion
     */
    public Integer getSourceRdmVersion() {
        return sourceRdmVersion;
    }

    public void setSourceRdmVersion(Integer sourceRdmVersion) {
        this.sourceRdmVersion = sourceRdmVersion;
    }

    public MongoPageRequest withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释：**  关系实体目标端ID，用于查询关系实体的历史版本信息。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public MongoPageRequest withTargetRdmVersion(Integer targetRdmVersion) {
        this.targetRdmVersion = targetRdmVersion;
        return this;
    }

    /**
     * **参数解释：**  关系实体目标端系统版本，用于指定目标端实例的特定版本。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return targetRdmVersion
     */
    public Integer getTargetRdmVersion() {
        return targetRdmVersion;
    }

    public void setTargetRdmVersion(Integer targetRdmVersion) {
        this.targetRdmVersion = targetRdmVersion;
    }

    public MongoPageRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：**  单边不确定关系的目标端类型，用于指定关系实体的目标端模型类型。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
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
        MongoPageRequest that = (MongoPageRequest) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.startLastModifiedTime, that.startLastModifiedTime)
            && Objects.equals(this.endLastModifiedTime, that.endLastModifiedTime)
            && Objects.equals(this.rdmVersion, that.rdmVersion) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.sourceRdmVersion, that.sourceRdmVersion)
            && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.targetRdmVersion, that.targetRdmVersion)
            && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            startLastModifiedTime,
            endLastModifiedTime,
            rdmVersion,
            sourceId,
            sourceRdmVersion,
            targetId,
            targetRdmVersion,
            targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MongoPageRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startLastModifiedTime: ").append(toIndentedString(startLastModifiedTime)).append("\n");
        sb.append("    endLastModifiedTime: ").append(toIndentedString(endLastModifiedTime)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceRdmVersion: ").append(toIndentedString(sourceRdmVersion)).append("\n");
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
