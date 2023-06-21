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

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private Long relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_field_id")

    private Long sourceFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_field_id")

    private Long targetFieldId;

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

    public RelationMappingVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 编码
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RelationMappingVO withRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 关系id
     * @return relationId
     */
    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public RelationMappingVO withSourceFieldId(Long sourceFieldId) {
        this.sourceFieldId = sourceFieldId;
        return this;
    }

    /**
     * 源字段id
     * @return sourceFieldId
     */
    public Long getSourceFieldId() {
        return sourceFieldId;
    }

    public void setSourceFieldId(Long sourceFieldId) {
        this.sourceFieldId = sourceFieldId;
    }

    public RelationMappingVO withTargetFieldId(Long targetFieldId) {
        this.targetFieldId = targetFieldId;
        return this;
    }

    /**
     * 目标字段id
     * @return targetFieldId
     */
    public Long getTargetFieldId() {
        return targetFieldId;
    }

    public void setTargetFieldId(Long targetFieldId) {
        this.targetFieldId = targetFieldId;
    }

    public RelationMappingVO withSourceFieldName(String sourceFieldName) {
        this.sourceFieldName = sourceFieldName;
        return this;
    }

    /**
     * 源表名称
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
     * 目的表名称
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
     * 创建人
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
     * 更新人
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
     * 创建时间
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
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelationMappingVO relationMappingVO = (RelationMappingVO) o;
        return Objects.equals(this.id, relationMappingVO.id)
            && Objects.equals(this.relationId, relationMappingVO.relationId)
            && Objects.equals(this.sourceFieldId, relationMappingVO.sourceFieldId)
            && Objects.equals(this.targetFieldId, relationMappingVO.targetFieldId)
            && Objects.equals(this.sourceFieldName, relationMappingVO.sourceFieldName)
            && Objects.equals(this.targetFieldName, relationMappingVO.targetFieldName)
            && Objects.equals(this.createBy, relationMappingVO.createBy)
            && Objects.equals(this.updateBy, relationMappingVO.updateBy)
            && Objects.equals(this.createTime, relationMappingVO.createTime)
            && Objects.equals(this.updateTime, relationMappingVO.updateTime);
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
