package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** MultiTaskMappingCreateBody */
public class MultiTaskMappingCreateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_info")

    private MultiTaskInitElementExtInfo extInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_columns")

    private List<MultiTaskColumnInfo> sourceColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_columns")

    private List<MultiTaskColumnInfo> targetColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table")

    private String sourceTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table")

    private String targetTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_columns")

    private List<MappingInfo> mappingColumns = null;

    public MultiTaskMappingCreateBody withExtInfo(MultiTaskInitElementExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public MultiTaskMappingCreateBody withExtInfo(Consumer<MultiTaskInitElementExtInfo> extInfoSetter) {
        if (this.extInfo == null) {
            this.extInfo = new MultiTaskInitElementExtInfo();
            extInfoSetter.accept(this.extInfo);
        }

        return this;
    }

    /** Get extInfo
     * 
     * @return extInfo */
    public MultiTaskInitElementExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(MultiTaskInitElementExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public MultiTaskMappingCreateBody withSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
        return this;
    }

    /** 源端数据源ID
     * 
     * @return sourceDatasourceId */
    public String getSourceDatasourceId() {
        return sourceDatasourceId;
    }

    public void setSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
    }

    public MultiTaskMappingCreateBody withTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
        return this;
    }

    /** 目标端数据源ID
     * 
     * @return targetDatasourceId */
    public String getTargetDatasourceId() {
        return targetDatasourceId;
    }

    public void setTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
    }

    public MultiTaskMappingCreateBody withSourceColumns(List<MultiTaskColumnInfo> sourceColumns) {
        this.sourceColumns = sourceColumns;
        return this;
    }

    public MultiTaskMappingCreateBody addSourceColumnsItem(MultiTaskColumnInfo sourceColumnsItem) {
        if (this.sourceColumns == null) {
            this.sourceColumns = new ArrayList<>();
        }
        this.sourceColumns.add(sourceColumnsItem);
        return this;
    }

    public MultiTaskMappingCreateBody withSourceColumns(Consumer<List<MultiTaskColumnInfo>> sourceColumnsSetter) {
        if (this.sourceColumns == null) {
            this.sourceColumns = new ArrayList<>();
        }
        sourceColumnsSetter.accept(this.sourceColumns);
        return this;
    }

    /** 源端字段列表
     * 
     * @return sourceColumns */
    public List<MultiTaskColumnInfo> getSourceColumns() {
        return sourceColumns;
    }

    public void setSourceColumns(List<MultiTaskColumnInfo> sourceColumns) {
        this.sourceColumns = sourceColumns;
    }

    public MultiTaskMappingCreateBody withTargetColumns(List<MultiTaskColumnInfo> targetColumns) {
        this.targetColumns = targetColumns;
        return this;
    }

    public MultiTaskMappingCreateBody addTargetColumnsItem(MultiTaskColumnInfo targetColumnsItem) {
        if (this.targetColumns == null) {
            this.targetColumns = new ArrayList<>();
        }
        this.targetColumns.add(targetColumnsItem);
        return this;
    }

    public MultiTaskMappingCreateBody withTargetColumns(Consumer<List<MultiTaskColumnInfo>> targetColumnsSetter) {
        if (this.targetColumns == null) {
            this.targetColumns = new ArrayList<>();
        }
        targetColumnsSetter.accept(this.targetColumns);
        return this;
    }

    /** 目标端字段列表
     * 
     * @return targetColumns */
    public List<MultiTaskColumnInfo> getTargetColumns() {
        return targetColumns;
    }

    public void setTargetColumns(List<MultiTaskColumnInfo> targetColumns) {
        this.targetColumns = targetColumns;
    }

    public MultiTaskMappingCreateBody withSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
        return this;
    }

    /** 源表名
     * 
     * @return sourceTable */
    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public MultiTaskMappingCreateBody withTargetTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }

    /** 目标表名
     * 
     * @return targetTable */
    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    public MultiTaskMappingCreateBody withMappingColumns(List<MappingInfo> mappingColumns) {
        this.mappingColumns = mappingColumns;
        return this;
    }

    public MultiTaskMappingCreateBody addMappingColumnsItem(MappingInfo mappingColumnsItem) {
        if (this.mappingColumns == null) {
            this.mappingColumns = new ArrayList<>();
        }
        this.mappingColumns.add(mappingColumnsItem);
        return this;
    }

    public MultiTaskMappingCreateBody withMappingColumns(Consumer<List<MappingInfo>> mappingColumnsSetter) {
        if (this.mappingColumns == null) {
            this.mappingColumns = new ArrayList<>();
        }
        mappingColumnsSetter.accept(this.mappingColumns);
        return this;
    }

    /** 字段映射列表
     * 
     * @return mappingColumns */
    public List<MappingInfo> getMappingColumns() {
        return mappingColumns;
    }

    public void setMappingColumns(List<MappingInfo> mappingColumns) {
        this.mappingColumns = mappingColumns;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskMappingCreateBody multiTaskMappingCreateBody = (MultiTaskMappingCreateBody) o;
        return Objects.equals(this.extInfo, multiTaskMappingCreateBody.extInfo)
            && Objects.equals(this.sourceDatasourceId, multiTaskMappingCreateBody.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, multiTaskMappingCreateBody.targetDatasourceId)
            && Objects.equals(this.sourceColumns, multiTaskMappingCreateBody.sourceColumns)
            && Objects.equals(this.targetColumns, multiTaskMappingCreateBody.targetColumns)
            && Objects.equals(this.sourceTable, multiTaskMappingCreateBody.sourceTable)
            && Objects.equals(this.targetTable, multiTaskMappingCreateBody.targetTable)
            && Objects.equals(this.mappingColumns, multiTaskMappingCreateBody.mappingColumns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extInfo,
            sourceDatasourceId,
            targetDatasourceId,
            sourceColumns,
            targetColumns,
            sourceTable,
            targetTable,
            mappingColumns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskMappingCreateBody {\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    sourceColumns: ").append(toIndentedString(sourceColumns)).append("\n");
        sb.append("    targetColumns: ").append(toIndentedString(targetColumns)).append("\n");
        sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
        sb.append("    targetTable: ").append(toIndentedString(targetTable)).append("\n");
        sb.append("    mappingColumns: ").append(toIndentedString(mappingColumns)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
