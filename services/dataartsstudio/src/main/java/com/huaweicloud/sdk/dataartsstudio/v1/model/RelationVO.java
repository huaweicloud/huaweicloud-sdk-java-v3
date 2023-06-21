package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelationVO
 */
public class RelationVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_id")

    private Long sourceTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_id")

    private Long targetTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private RelationType sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private RelationType targetType;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<RelationMappingVO> mappings = null;

    public RelationVO withId(Long id) {
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

    public RelationVO withSourceTableId(Long sourceTableId) {
        this.sourceTableId = sourceTableId;
        return this;
    }

    /**
     * 源表id
     * @return sourceTableId
     */
    public Long getSourceTableId() {
        return sourceTableId;
    }

    public void setSourceTableId(Long sourceTableId) {
        this.sourceTableId = sourceTableId;
    }

    public RelationVO withTargetTableId(Long targetTableId) {
        this.targetTableId = targetTableId;
        return this;
    }

    /**
     * 目标表id
     * @return targetTableId
     */
    public Long getTargetTableId() {
        return targetTableId;
    }

    public void setTargetTableId(Long targetTableId) {
        this.targetTableId = targetTableId;
    }

    public RelationVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 关系名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RelationVO withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源表名称
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public RelationVO withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目的表名称
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public RelationVO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RelationVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public RelationVO withSourceType(RelationType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     * @return sourceType
     */
    public RelationType getSourceType() {
        return sourceType;
    }

    public void setSourceType(RelationType sourceType) {
        this.sourceType = sourceType;
    }

    public RelationVO withTargetType(RelationType targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     * @return targetType
     */
    public RelationType getTargetType() {
        return targetType;
    }

    public void setTargetType(RelationType targetType) {
        this.targetType = targetType;
    }

    public RelationVO withCreateBy(String createBy) {
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

    public RelationVO withUpdateBy(String updateBy) {
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

    public RelationVO withCreateTime(OffsetDateTime createTime) {
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

    public RelationVO withUpdateTime(OffsetDateTime updateTime) {
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

    public RelationVO withMappings(List<RelationMappingVO> mappings) {
        this.mappings = mappings;
        return this;
    }

    public RelationVO addMappingsItem(RelationMappingVO mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public RelationVO withMappings(Consumer<List<RelationMappingVO>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 表属性信息
     * @return mappings
     */
    public List<RelationMappingVO> getMappings() {
        return mappings;
    }

    public void setMappings(List<RelationMappingVO> mappings) {
        this.mappings = mappings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelationVO relationVO = (RelationVO) o;
        return Objects.equals(this.id, relationVO.id) && Objects.equals(this.sourceTableId, relationVO.sourceTableId)
            && Objects.equals(this.targetTableId, relationVO.targetTableId)
            && Objects.equals(this.name, relationVO.name)
            && Objects.equals(this.sourceTableName, relationVO.sourceTableName)
            && Objects.equals(this.targetTableName, relationVO.targetTableName)
            && Objects.equals(this.role, relationVO.role) && Objects.equals(this.tenantId, relationVO.tenantId)
            && Objects.equals(this.sourceType, relationVO.sourceType)
            && Objects.equals(this.targetType, relationVO.targetType)
            && Objects.equals(this.createBy, relationVO.createBy) && Objects.equals(this.updateBy, relationVO.updateBy)
            && Objects.equals(this.createTime, relationVO.createTime)
            && Objects.equals(this.updateTime, relationVO.updateTime)
            && Objects.equals(this.mappings, relationVO.mappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sourceTableId,
            targetTableId,
            name,
            sourceTableName,
            targetTableName,
            role,
            tenantId,
            sourceType,
            targetType,
            createBy,
            updateBy,
            createTime,
            updateTime,
            mappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceTableId: ").append(toIndentedString(sourceTableId)).append("\n");
        sb.append("    targetTableId: ").append(toIndentedString(targetTableId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
