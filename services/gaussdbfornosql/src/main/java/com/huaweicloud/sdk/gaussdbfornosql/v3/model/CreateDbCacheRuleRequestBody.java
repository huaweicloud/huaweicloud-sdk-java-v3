package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDbCacheRuleRequestBody
 */
public class CreateDbCacheRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbcache_mapping_id")

    private String dbcacheMappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_schema")

    private String sourceDbSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_table")

    private String sourceDbTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database")

    private String targetDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_columns")

    private List<String> keyColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_columns")

    private List<String> valueColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private String ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_separator")

    private String keySeparator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_separator")

    private String valueSeparator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_prefix")

    private String keyPrefix;

    public CreateDbCacheRuleRequestBody withDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
        return this;
    }

    /**
     * 内存加速映射ID。
     * @return dbcacheMappingId
     */
    public String getDbcacheMappingId() {
        return dbcacheMappingId;
    }

    public void setDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
    }

    public CreateDbCacheRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 内存加速规则名称。不超过256字符，需要确保在当前映射下唯一。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDbCacheRuleRequestBody withSourceDbSchema(String sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
        return this;
    }

    /**
     * 源端数据库。
     * @return sourceDbSchema
     */
    public String getSourceDbSchema() {
        return sourceDbSchema;
    }

    public void setSourceDbSchema(String sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
    }

    public CreateDbCacheRuleRequestBody withSourceDbTable(String sourceDbTable) {
        this.sourceDbTable = sourceDbTable;
        return this;
    }

    /**
     * 源端数据表。
     * @return sourceDbTable
     */
    public String getSourceDbTable() {
        return sourceDbTable;
    }

    public void setSourceDbTable(String sourceDbTable) {
        this.sourceDbTable = sourceDbTable;
    }

    public CreateDbCacheRuleRequestBody withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 目标数据存储类型。 取值为： hash。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public CreateDbCacheRuleRequestBody withTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * 目标数据库。取值范围： [0-999]。
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return targetDatabase;
    }

    public void setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    public CreateDbCacheRuleRequestBody withKeyColumns(List<String> keyColumns) {
        this.keyColumns = keyColumns;
        return this;
    }

    public CreateDbCacheRuleRequestBody addKeyColumnsItem(String keyColumnsItem) {
        if (this.keyColumns == null) {
            this.keyColumns = new ArrayList<>();
        }
        this.keyColumns.add(keyColumnsItem);
        return this;
    }

    public CreateDbCacheRuleRequestBody withKeyColumns(Consumer<List<String>> keyColumnsSetter) {
        if (this.keyColumns == null) {
            this.keyColumns = new ArrayList<>();
        }
        keyColumnsSetter.accept(this.keyColumns);
        return this;
    }

    /**
     * 映射的key使用的column列表。
     * @return keyColumns
     */
    public List<String> getKeyColumns() {
        return keyColumns;
    }

    public void setKeyColumns(List<String> keyColumns) {
        this.keyColumns = keyColumns;
    }

    public CreateDbCacheRuleRequestBody withValueColumns(List<String> valueColumns) {
        this.valueColumns = valueColumns;
        return this;
    }

    public CreateDbCacheRuleRequestBody addValueColumnsItem(String valueColumnsItem) {
        if (this.valueColumns == null) {
            this.valueColumns = new ArrayList<>();
        }
        this.valueColumns.add(valueColumnsItem);
        return this;
    }

    public CreateDbCacheRuleRequestBody withValueColumns(Consumer<List<String>> valueColumnsSetter) {
        if (this.valueColumns == null) {
            this.valueColumns = new ArrayList<>();
        }
        valueColumnsSetter.accept(this.valueColumns);
        return this;
    }

    /**
     * 映射的value使用的column列表。
     * @return valueColumns
     */
    public List<String> getValueColumns() {
        return valueColumns;
    }

    public void setValueColumns(List<String> valueColumns) {
        this.valueColumns = valueColumns;
    }

    public CreateDbCacheRuleRequestBody withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * key的生存时间。单位:ms。不传该值，默认取2592000000，表示30天。
     * @return ttl
     */
    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public CreateDbCacheRuleRequestBody withKeySeparator(String keySeparator) {
        this.keySeparator = keySeparator;
        return this;
    }

    /**
     * 映射的key分隔符。只允许一个字符。
     * @return keySeparator
     */
    public String getKeySeparator() {
        return keySeparator;
    }

    public void setKeySeparator(String keySeparator) {
        this.keySeparator = keySeparator;
    }

    public CreateDbCacheRuleRequestBody withValueSeparator(String valueSeparator) {
        this.valueSeparator = valueSeparator;
        return this;
    }

    /**
     * 映射的value分隔符。只允许一个字符。
     * @return valueSeparator
     */
    public String getValueSeparator() {
        return valueSeparator;
    }

    public void setValueSeparator(String valueSeparator) {
        this.valueSeparator = valueSeparator;
    }

    public CreateDbCacheRuleRequestBody withKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }

    /**
     * 键前缀。最长限制1024字符。需确保key_prefix和target_database在当前映射下唯一。
     * @return keyPrefix
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDbCacheRuleRequestBody that = (CreateDbCacheRuleRequestBody) obj;
        return Objects.equals(this.dbcacheMappingId, that.dbcacheMappingId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sourceDbSchema, that.sourceDbSchema)
            && Objects.equals(this.sourceDbTable, that.sourceDbTable)
            && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.targetDatabase, that.targetDatabase)
            && Objects.equals(this.keyColumns, that.keyColumns) && Objects.equals(this.valueColumns, that.valueColumns)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.keySeparator, that.keySeparator)
            && Objects.equals(this.valueSeparator, that.valueSeparator)
            && Objects.equals(this.keyPrefix, that.keyPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbcacheMappingId,
            name,
            sourceDbSchema,
            sourceDbTable,
            storageType,
            targetDatabase,
            keyColumns,
            valueColumns,
            ttl,
            keySeparator,
            valueSeparator,
            keyPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDbCacheRuleRequestBody {\n");
        sb.append("    dbcacheMappingId: ").append(toIndentedString(dbcacheMappingId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceDbSchema: ").append(toIndentedString(sourceDbSchema)).append("\n");
        sb.append("    sourceDbTable: ").append(toIndentedString(sourceDbTable)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    targetDatabase: ").append(toIndentedString(targetDatabase)).append("\n");
        sb.append("    keyColumns: ").append(toIndentedString(keyColumns)).append("\n");
        sb.append("    valueColumns: ").append(toIndentedString(valueColumns)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    keySeparator: ").append(toIndentedString(keySeparator)).append("\n");
        sb.append("    valueSeparator: ").append(toIndentedString(valueSeparator)).append("\n");
        sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
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
