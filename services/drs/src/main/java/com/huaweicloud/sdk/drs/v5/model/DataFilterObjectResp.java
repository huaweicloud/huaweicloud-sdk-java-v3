package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据过滤对象信息
 */
public class DataFilterObjectResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    private Long batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_alias_name")

    private String objectAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    /**
     * 标记该对象是否启用数据过滤。
     */
    public static final class IsDataFilterEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsDataFilterEnum TRUE = new IsDataFilterEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsDataFilterEnum FALSE = new IsDataFilterEnum("false");

        private static final Map<String, IsDataFilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsDataFilterEnum> createStaticFields() {
            Map<String, IsDataFilterEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsDataFilterEnum(String value) {
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
        public static IsDataFilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsDataFilterEnum(value));
        }

        public static IsDataFilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsDataFilterEnum) {
                return this.value.equals(((IsDataFilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_data_filter")

    private IsDataFilterEnum isDataFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_filter_type")

    private String dataFilterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_condition")

    private String filterCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_synchronized")

    private Boolean isSynchronized;

    public DataFilterObjectResp withBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 数据过滤对象信息批次ID，与父级DataFilterRuleResp的batch_id关联，用于追溯对象归属的批次
     * @return batchId
     */
    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public DataFilterObjectResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据过滤对象的唯一标识符，由对象层级结构（库名、表名、对象类型等）组合生成
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataFilterObjectResp withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父级过滤对象的标识符，用于表示对象之间的层级归属关系（如列归属于表、表归属于库）。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DataFilterObjectResp withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 数据过滤对象的名称，按object_type不同可为库名、表名或列名。
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DataFilterObjectResp withObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
        return this;
    }

    /**
     * 数据过滤对象的映射名称（别名），在目标端数据库对象名与源端不一致时使用。
     * @return objectAliasName
     */
    public String getObjectAliasName() {
        return objectAliasName;
    }

    public void setObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
    }

    public DataFilterObjectResp withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 数据过滤对象的层级类型，标识当前过滤规则粒度级别。
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public DataFilterObjectResp withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据过滤对象所属的数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DataFilterObjectResp withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 数据过滤对象所属的schema名。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DataFilterObjectResp withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据过滤对象所属的表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DataFilterObjectResp withIsDataFilter(IsDataFilterEnum isDataFilter) {
        this.isDataFilter = isDataFilter;
        return this;
    }

    /**
     * 标记该对象是否启用数据过滤。
     * @return isDataFilter
     */
    public IsDataFilterEnum getIsDataFilter() {
        return isDataFilter;
    }

    public void setIsDataFilter(IsDataFilterEnum isDataFilter) {
        this.isDataFilter = isDataFilter;
    }

    public DataFilterObjectResp withDataFilterType(String dataFilterType) {
        this.dataFilterType = dataFilterType;
        return this;
    }

    /**
     * 数据过滤的类型，标识使用的过滤策略。
     * @return dataFilterType
     */
    public String getDataFilterType() {
        return dataFilterType;
    }

    public void setDataFilterType(String dataFilterType) {
        this.dataFilterType = dataFilterType;
    }

    public DataFilterObjectResp withFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }

    /**
     * 数据过滤条件
     * @return filterCondition
     */
    public String getFilterCondition() {
        return filterCondition;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public DataFilterObjectResp withIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
        return this;
    }

    /**
     * 数据过滤条件是否已同步
     * @return isSynchronized
     */
    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilterObjectResp that = (DataFilterObjectResp) obj;
        return Objects.equals(this.batchId, that.batchId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectAliasName, that.objectAliasName)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.isDataFilter, that.isDataFilter)
            && Objects.equals(this.dataFilterType, that.dataFilterType)
            && Objects.equals(this.filterCondition, that.filterCondition)
            && Objects.equals(this.isSynchronized, that.isSynchronized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId,
            id,
            parentId,
            objectName,
            objectAliasName,
            objectType,
            dbName,
            schemaName,
            tableName,
            isDataFilter,
            dataFilterType,
            filterCondition,
            isSynchronized);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilterObjectResp {\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectAliasName: ").append(toIndentedString(objectAliasName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    isDataFilter: ").append(toIndentedString(isDataFilter)).append("\n");
        sb.append("    dataFilterType: ").append(toIndentedString(dataFilterType)).append("\n");
        sb.append("    filterCondition: ").append(toIndentedString(filterCondition)).append("\n");
        sb.append("    isSynchronized: ").append(toIndentedString(isSynchronized)).append("\n");
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
