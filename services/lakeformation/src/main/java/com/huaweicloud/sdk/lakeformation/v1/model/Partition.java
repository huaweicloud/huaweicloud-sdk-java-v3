package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分区信息
 */
public class Partition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values")

    private List<String> partitionValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private OffsetDateTime lastAccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_descriptor")

    private StorageDescriptor storageDescriptor;

    public Partition withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public Partition withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Partition withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名字
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Partition withPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    public Partition addPartitionValuesItem(String partitionValuesItem) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        this.partitionValues.add(partitionValuesItem);
        return this;
    }

    public Partition withPartitionValues(Consumer<List<String>> partitionValuesSetter) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        partitionValuesSetter.accept(this.partitionValues);
        return this;
    }

    /**
     * 分区值的列表
     * @return partitionValues
     */
    public List<String> getPartitionValues() {
        return partitionValues;
    }

    public void setPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
    }

    public Partition withCreateTime(OffsetDateTime createTime) {
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

    public Partition withLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最后访问时间
     * @return lastAccessTime
     */
    public OffsetDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public Partition withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Partition putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public Partition withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数表
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Partition withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    public Partition withStorageDescriptor(Consumer<StorageDescriptor> storageDescriptorSetter) {
        if (this.storageDescriptor == null) {
            this.storageDescriptor = new StorageDescriptor();
            storageDescriptorSetter.accept(this.storageDescriptor);
        }

        return this;
    }

    /**
     * Get storageDescriptor
     * @return storageDescriptor
     */
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partition partition = (Partition) o;
        return Objects.equals(this.catalogName, partition.catalogName)
            && Objects.equals(this.databaseName, partition.databaseName)
            && Objects.equals(this.tableName, partition.tableName)
            && Objects.equals(this.partitionValues, partition.partitionValues)
            && Objects.equals(this.createTime, partition.createTime)
            && Objects.equals(this.lastAccessTime, partition.lastAccessTime)
            && Objects.equals(this.parameters, partition.parameters)
            && Objects.equals(this.storageDescriptor, partition.storageDescriptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            databaseName,
            tableName,
            partitionValues,
            createTime,
            lastAccessTime,
            parameters,
            storageDescriptor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partition {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    partitionValues: ").append(toIndentedString(partitionValues)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    storageDescriptor: ").append(toIndentedString(storageDescriptor)).append("\n");
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
