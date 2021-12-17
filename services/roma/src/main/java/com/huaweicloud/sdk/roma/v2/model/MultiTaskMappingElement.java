package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** MultiTaskMappingElement */
public class MultiTaskMappingElement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table")

    private String sourceTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table")

    private String targetTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private Long updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_percent")

    private Long mappingPercent;

    /** 映射状态 - AUTO (自动映射) - MANUAL (手工新增) - ADD (自动新增) - UPDATE (更新) - DELETE (删除) - USING (使用中) */
    public static final class StatusEnum {

        /** Enum AUTO for value: "AUTO" */
        public static final StatusEnum AUTO = new StatusEnum("AUTO");

        /** Enum MANUAL for value: "MANUAL" */
        public static final StatusEnum MANUAL = new StatusEnum("MANUAL");

        /** Enum ADD for value: "ADD" */
        public static final StatusEnum ADD = new StatusEnum("ADD");

        /** Enum UPDATE for value: "UPDATE" */
        public static final StatusEnum UPDATE = new StatusEnum("UPDATE");

        /** Enum DELETE for value: "DELETE" */
        public static final StatusEnum DELETE = new StatusEnum("DELETE");

        /** Enum USING for value: "USING" */
        public static final StatusEnum USING = new StatusEnum("USING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("AUTO", AUTO);
            map.put("MANUAL", MANUAL);
            map.put("ADD", ADD);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("USING", USING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_columns")

    private List<MultiTaskColumnInfo> sourceColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_columns")

    private List<MultiTaskColumnInfo> targetColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private List<MappingInfo> mapping = null;

    public MultiTaskMappingElement withId(String id) {
        this.id = id;
        return this;
    }

    /** 映射唯一ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MultiTaskMappingElement withSourceTable(String sourceTable) {
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

    public MultiTaskMappingElement withTargetTable(String targetTable) {
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

    public MultiTaskMappingElement withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /** 上次修改时间 minimum: 1 maximum: -8446744073709551617
     * 
     * @return updatedTime */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public MultiTaskMappingElement withMappingPercent(Long mappingPercent) {
        this.mappingPercent = mappingPercent;
        return this;
    }

    /** 匹配度 minimum: 0 maximum: 100
     * 
     * @return mappingPercent */
    public Long getMappingPercent() {
        return mappingPercent;
    }

    public void setMappingPercent(Long mappingPercent) {
        this.mappingPercent = mappingPercent;
    }

    public MultiTaskMappingElement withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 映射状态 - AUTO (自动映射) - MANUAL (手工新增) - ADD (自动新增) - UPDATE (更新) - DELETE (删除) - USING (使用中)
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public MultiTaskMappingElement withSourceColumns(List<MultiTaskColumnInfo> sourceColumns) {
        this.sourceColumns = sourceColumns;
        return this;
    }

    public MultiTaskMappingElement addSourceColumnsItem(MultiTaskColumnInfo sourceColumnsItem) {
        if (this.sourceColumns == null) {
            this.sourceColumns = new ArrayList<>();
        }
        this.sourceColumns.add(sourceColumnsItem);
        return this;
    }

    public MultiTaskMappingElement withSourceColumns(Consumer<List<MultiTaskColumnInfo>> sourceColumnsSetter) {
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

    public MultiTaskMappingElement withTargetColumns(List<MultiTaskColumnInfo> targetColumns) {
        this.targetColumns = targetColumns;
        return this;
    }

    public MultiTaskMappingElement addTargetColumnsItem(MultiTaskColumnInfo targetColumnsItem) {
        if (this.targetColumns == null) {
            this.targetColumns = new ArrayList<>();
        }
        this.targetColumns.add(targetColumnsItem);
        return this;
    }

    public MultiTaskMappingElement withTargetColumns(Consumer<List<MultiTaskColumnInfo>> targetColumnsSetter) {
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

    public MultiTaskMappingElement withMapping(List<MappingInfo> mapping) {
        this.mapping = mapping;
        return this;
    }

    public MultiTaskMappingElement addMappingItem(MappingInfo mappingItem) {
        if (this.mapping == null) {
            this.mapping = new ArrayList<>();
        }
        this.mapping.add(mappingItem);
        return this;
    }

    public MultiTaskMappingElement withMapping(Consumer<List<MappingInfo>> mappingSetter) {
        if (this.mapping == null) {
            this.mapping = new ArrayList<>();
        }
        mappingSetter.accept(this.mapping);
        return this;
    }

    /** 字段映射列表
     * 
     * @return mapping */
    public List<MappingInfo> getMapping() {
        return mapping;
    }

    public void setMapping(List<MappingInfo> mapping) {
        this.mapping = mapping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskMappingElement multiTaskMappingElement = (MultiTaskMappingElement) o;
        return Objects.equals(this.id, multiTaskMappingElement.id)
            && Objects.equals(this.sourceTable, multiTaskMappingElement.sourceTable)
            && Objects.equals(this.targetTable, multiTaskMappingElement.targetTable)
            && Objects.equals(this.updatedTime, multiTaskMappingElement.updatedTime)
            && Objects.equals(this.mappingPercent, multiTaskMappingElement.mappingPercent)
            && Objects.equals(this.status, multiTaskMappingElement.status)
            && Objects.equals(this.sourceColumns, multiTaskMappingElement.sourceColumns)
            && Objects.equals(this.targetColumns, multiTaskMappingElement.targetColumns)
            && Objects.equals(this.mapping, multiTaskMappingElement.mapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sourceTable,
            targetTable,
            updatedTime,
            mappingPercent,
            status,
            sourceColumns,
            targetColumns,
            mapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskMappingElement {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
        sb.append("    targetTable: ").append(toIndentedString(targetTable)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    mappingPercent: ").append(toIndentedString(mappingPercent)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sourceColumns: ").append(toIndentedString(sourceColumns)).append("\n");
        sb.append("    targetColumns: ").append(toIndentedString(targetColumns)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
