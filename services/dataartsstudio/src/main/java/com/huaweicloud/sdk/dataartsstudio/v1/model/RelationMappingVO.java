package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * RelationMappingVO
 */
public class RelationMappingVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_field_id")

    private String sourceFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_field_id")

    private String targetFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_field_name")

    private String sourceFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_field_name")

    private String targetFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public RelationMappingVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RelationMappingVO withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 关系ID，填写String类型替代Long类型。
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public RelationMappingVO withSourceFieldId(String sourceFieldId) {
        this.sourceFieldId = sourceFieldId;
        return this;
    }

    /**
     * 源字段ID，填写String类型替代Long类型。
     * @return sourceFieldId
     */
    public String getSourceFieldId() {
        return sourceFieldId;
    }

    public void setSourceFieldId(String sourceFieldId) {
        this.sourceFieldId = sourceFieldId;
    }

    public RelationMappingVO withTargetFieldId(String targetFieldId) {
        this.targetFieldId = targetFieldId;
        return this;
    }

    /**
     * 目标字段ID，填写String类型替代Long类型。
     * @return targetFieldId
     */
    public String getTargetFieldId() {
        return targetFieldId;
    }

    public void setTargetFieldId(String targetFieldId) {
        this.targetFieldId = targetFieldId;
    }

    public RelationMappingVO withSourceFieldName(String sourceFieldName) {
        this.sourceFieldName = sourceFieldName;
        return this;
    }

    /**
     * 源表名称。
     * @return sourceFieldName
     */
    public String getSourceFieldName() {
        return sourceFieldName;
    }

    public void setSourceFieldName(String sourceFieldName) {
        this.sourceFieldName = sourceFieldName;
    }

    public RelationMappingVO withTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
        return this;
    }

    /**
     * 目的表名称。
     * @return targetFieldName
     */
    public String getTargetFieldName() {
        return targetFieldName;
    }

    public void setTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
    }

    public RelationMappingVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public RelationMappingVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public RelationMappingVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public RelationMappingVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationMappingVO that = (RelationMappingVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.relationId, that.relationId)
            && Objects.equals(this.sourceFieldId, that.sourceFieldId)
            && Objects.equals(this.targetFieldId, that.targetFieldId)
            && Objects.equals(this.sourceFieldName, that.sourceFieldName)
            && Objects.equals(this.targetFieldName, that.targetFieldName)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            relationId,
            sourceFieldId,
            targetFieldId,
            sourceFieldName,
            targetFieldName,
            createBy,
            updateBy,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationMappingVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    sourceFieldId: ").append(toIndentedString(sourceFieldId)).append("\n");
        sb.append("    targetFieldId: ").append(toIndentedString(targetFieldId)).append("\n");
        sb.append("    sourceFieldName: ").append(toIndentedString(sourceFieldName)).append("\n");
        sb.append("    targetFieldName: ").append(toIndentedString(targetFieldName)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
