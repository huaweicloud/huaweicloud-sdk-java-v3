package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableMappingVO
 */
public class TableMappingVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_id")

    private Long targetTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_model_id")

    private Long srcModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_model_name")

    private String srcModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_text")

    private String viewText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<TableMappingDetailVO> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_tables")

    private List<MappingSourceTableVO> sourceTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_fields")

    private List<MappingSourceFieldVO> sourceFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    public TableMappingVO withId(Long id) {
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

    public TableMappingVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableMappingVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TableMappingVO withTargetTableId(Long targetTableId) {
        this.targetTableId = targetTableId;
        return this;
    }

    /**
     * 目的表id
     * @return targetTableId
     */
    public Long getTargetTableId() {
        return targetTableId;
    }

    public void setTargetTableId(Long targetTableId) {
        this.targetTableId = targetTableId;
    }

    public TableMappingVO withSrcModelId(Long srcModelId) {
        this.srcModelId = srcModelId;
        return this;
    }

    /**
     * 来源表所属模型id
     * @return srcModelId
     */
    public Long getSrcModelId() {
        return srcModelId;
    }

    public void setSrcModelId(Long srcModelId) {
        this.srcModelId = srcModelId;
    }

    public TableMappingVO withSrcModelName(String srcModelName) {
        this.srcModelName = srcModelName;
        return this;
    }

    /**
     * 来源模型名称
     * @return srcModelName
     */
    public String getSrcModelName() {
        return srcModelName;
    }

    public void setSrcModelName(String srcModelName) {
        this.srcModelName = srcModelName;
    }

    public TableMappingVO withViewText(String viewText) {
        this.viewText = viewText;
        return this;
    }

    /**
     * 采集的视图来源，dws视图逆向使用
     * @return viewText
     */
    public String getViewText() {
        return viewText;
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;
    }

    public TableMappingVO withTargetTableName(String targetTableName) {
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

    public TableMappingVO withDetails(List<TableMappingDetailVO> details) {
        this.details = details;
        return this;
    }

    public TableMappingVO addDetailsItem(TableMappingDetailVO detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public TableMappingVO withDetails(Consumer<List<TableMappingDetailVO>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 详情
     * @return details
     */
    public List<TableMappingDetailVO> getDetails() {
        return details;
    }

    public void setDetails(List<TableMappingDetailVO> details) {
        this.details = details;
    }

    public TableMappingVO withSourceTables(List<MappingSourceTableVO> sourceTables) {
        this.sourceTables = sourceTables;
        return this;
    }

    public TableMappingVO addSourceTablesItem(MappingSourceTableVO sourceTablesItem) {
        if (this.sourceTables == null) {
            this.sourceTables = new ArrayList<>();
        }
        this.sourceTables.add(sourceTablesItem);
        return this;
    }

    public TableMappingVO withSourceTables(Consumer<List<MappingSourceTableVO>> sourceTablesSetter) {
        if (this.sourceTables == null) {
            this.sourceTables = new ArrayList<>();
        }
        sourceTablesSetter.accept(this.sourceTables);
        return this;
    }

    /**
     * 映射的表信息
     * @return sourceTables
     */
    public List<MappingSourceTableVO> getSourceTables() {
        return sourceTables;
    }

    public void setSourceTables(List<MappingSourceTableVO> sourceTables) {
        this.sourceTables = sourceTables;
    }

    public TableMappingVO withSourceFields(List<MappingSourceFieldVO> sourceFields) {
        this.sourceFields = sourceFields;
        return this;
    }

    public TableMappingVO addSourceFieldsItem(MappingSourceFieldVO sourceFieldsItem) {
        if (this.sourceFields == null) {
            this.sourceFields = new ArrayList<>();
        }
        this.sourceFields.add(sourceFieldsItem);
        return this;
    }

    public TableMappingVO withSourceFields(Consumer<List<MappingSourceFieldVO>> sourceFieldsSetter) {
        if (this.sourceFields == null) {
            this.sourceFields = new ArrayList<>();
        }
        sourceFieldsSetter.accept(this.sourceFields);
        return this;
    }

    /**
     * 映射的字段信息
     * @return sourceFields
     */
    public List<MappingSourceFieldVO> getSourceFields() {
        return sourceFields;
    }

    public void setSourceFields(List<MappingSourceFieldVO> sourceFields) {
        this.sourceFields = sourceFields;
    }

    public TableMappingVO withCreateTime(OffsetDateTime createTime) {
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

    public TableMappingVO withUpdateTime(OffsetDateTime updateTime) {
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

    public TableMappingVO withCreateBy(String createBy) {
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

    public TableMappingVO withUpdateBy(String updateBy) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableMappingVO tableMappingVO = (TableMappingVO) o;
        return Objects.equals(this.id, tableMappingVO.id) && Objects.equals(this.name, tableMappingVO.name)
            && Objects.equals(this.description, tableMappingVO.description)
            && Objects.equals(this.targetTableId, tableMappingVO.targetTableId)
            && Objects.equals(this.srcModelId, tableMappingVO.srcModelId)
            && Objects.equals(this.srcModelName, tableMappingVO.srcModelName)
            && Objects.equals(this.viewText, tableMappingVO.viewText)
            && Objects.equals(this.targetTableName, tableMappingVO.targetTableName)
            && Objects.equals(this.details, tableMappingVO.details)
            && Objects.equals(this.sourceTables, tableMappingVO.sourceTables)
            && Objects.equals(this.sourceFields, tableMappingVO.sourceFields)
            && Objects.equals(this.createTime, tableMappingVO.createTime)
            && Objects.equals(this.updateTime, tableMappingVO.updateTime)
            && Objects.equals(this.createBy, tableMappingVO.createBy)
            && Objects.equals(this.updateBy, tableMappingVO.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            targetTableId,
            srcModelId,
            srcModelName,
            viewText,
            targetTableName,
            details,
            sourceTables,
            sourceFields,
            createTime,
            updateTime,
            createBy,
            updateBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableMappingVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetTableId: ").append(toIndentedString(targetTableId)).append("\n");
        sb.append("    srcModelId: ").append(toIndentedString(srcModelId)).append("\n");
        sb.append("    srcModelName: ").append(toIndentedString(srcModelName)).append("\n");
        sb.append("    viewText: ").append(toIndentedString(viewText)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    sourceTables: ").append(toIndentedString(sourceTables)).append("\n");
        sb.append("    sourceFields: ").append(toIndentedString(sourceFields)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
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
