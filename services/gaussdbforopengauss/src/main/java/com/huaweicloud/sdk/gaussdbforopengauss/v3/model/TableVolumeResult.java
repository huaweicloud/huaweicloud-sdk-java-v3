package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TableVolumeResult
 */
public class TableVolumeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private String tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_owner")

    private String tableOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_part_type")

    private Boolean isPartType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_hash_cluster_key")

    private Boolean isHashClusterKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuples")

    private String tuples;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_size")

    private String averageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ratio")

    private String maxRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ratio")

    private String minRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skew_size")

    private String skewSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skew_ratio")

    private String skewRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skew_stddev")

    private String skewStddev;

    public TableVolumeResult withTableSize(String tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * **参数解释**: 表的大小。 **取值范围**: 不涉及。 
     * @return tableSize
     */
    public String getTableSize() {
        return tableSize;
    }

    public void setTableSize(String tableSize) {
        this.tableSize = tableSize;
    }

    public TableVolumeResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 表ID。 **取值范围**: 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TableVolumeResult withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**: 表名称。 **取值范围**: 不涉及。 
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableVolumeResult withTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
        return this;
    }

    /**
     * **参数解释**: 表所属用户名称。 **取值范围**: 不涉及。 
     * @return tableOwner
     */
    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    public TableVolumeResult withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**: schema名称。 **取值范围**: 不涉及。 
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public TableVolumeResult withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TableVolumeResult withIsPartType(Boolean isPartType) {
        this.isPartType = isPartType;
        return this;
    }

    /**
     * **参数解释**: 表或者索引是否具有分区表的性质。 **取值范围**: 不涉及。 
     * @return isPartType
     */
    public Boolean getIsPartType() {
        return isPartType;
    }

    public void setIsPartType(Boolean isPartType) {
        this.isPartType = isPartType;
    }

    public TableVolumeResult withIsHashClusterKey(Boolean isHashClusterKey) {
        this.isHashClusterKey = isHashClusterKey;
        return this;
    }

    /**
     * **参数解释**: 是否包含hash分区列信息。 **取值范围**: 不涉及。 
     * @return isHashClusterKey
     */
    public Boolean getIsHashClusterKey() {
        return isHashClusterKey;
    }

    public void setIsHashClusterKey(Boolean isHashClusterKey) {
        this.isHashClusterKey = isHashClusterKey;
    }

    public TableVolumeResult withTuples(String tuples) {
        this.tuples = tuples;
        return this;
    }

    /**
     * **参数解释**: 表中行的数目。 **取值范围**: 不涉及。 
     * @return tuples
     */
    public String getTuples() {
        return tuples;
    }

    public void setTuples(String tuples) {
        this.tuples = tuples;
    }

    public TableVolumeResult withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 **取值范围**: 不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TableVolumeResult withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 修改时间。 **取值范围**: 不涉及。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TableVolumeResult withAverageSize(String averageSize) {
        this.averageSize = averageSize;
        return this;
    }

    /**
     * **参数解释**: 表大小平均值(totalsize/DN个数，该值为平均分布的理想情况下，表在各DN占用空间大小)。 **取值范围**: 不涉及。 
     * @return averageSize
     */
    public String getAverageSize() {
        return averageSize;
    }

    public void setAverageSize(String averageSize) {
        this.averageSize = averageSize;
    }

    public TableVolumeResult withMaxRatio(String maxRatio) {
        this.maxRatio = maxRatio;
        return this;
    }

    /**
     * **参数解释**: 单DN表大小最大值占比（表在各DN占用空间的最大值/totalsize）。 **取值范围**: 不涉及。 
     * @return maxRatio
     */
    public String getMaxRatio() {
        return maxRatio;
    }

    public void setMaxRatio(String maxRatio) {
        this.maxRatio = maxRatio;
    }

    public TableVolumeResult withMinRatio(String minRatio) {
        this.minRatio = minRatio;
        return this;
    }

    /**
     * **参数解释**: 单DN表大小最小值占比（表在各DN占用空间的最小值/totalsize）。 **取值范围**: 不涉及。 
     * @return minRatio
     */
    public String getMinRatio() {
        return minRatio;
    }

    public void setMinRatio(String minRatio) {
        this.minRatio = minRatio;
    }

    public TableVolumeResult withSkewSize(String skewSize) {
        this.skewSize = skewSize;
        return this;
    }

    /**
     * **参数解释**: 表分布倾斜值（单DN表大小最大值 - 单DN表大小最小值）。 **取值范围**: 不涉及。 
     * @return skewSize
     */
    public String getSkewSize() {
        return skewSize;
    }

    public void setSkewSize(String skewSize) {
        this.skewSize = skewSize;
    }

    public TableVolumeResult withSkewRatio(String skewRatio) {
        this.skewRatio = skewRatio;
        return this;
    }

    /**
     * **参数解释**: 表分布倾斜率（skewsize/totalsize）。 **取值范围**: 不涉及。 
     * @return skewRatio
     */
    public String getSkewRatio() {
        return skewRatio;
    }

    public void setSkewRatio(String skewRatio) {
        this.skewRatio = skewRatio;
    }

    public TableVolumeResult withSkewStddev(String skewStddev) {
        this.skewStddev = skewStddev;
        return this;
    }

    /**
     * **参数解释**: 表分布标准方差（在表大小一定的情况下，该值越大表明表的整体分布情况越倾斜）。。 **取值范围**: 不涉及。 
     * @return skewStddev
     */
    public String getSkewStddev() {
        return skewStddev;
    }

    public void setSkewStddev(String skewStddev) {
        this.skewStddev = skewStddev;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableVolumeResult that = (TableVolumeResult) obj;
        return Objects.equals(this.tableSize, that.tableSize) && Objects.equals(this.id, that.id)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableOwner, that.tableOwner)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.isPartType, that.isPartType)
            && Objects.equals(this.isHashClusterKey, that.isHashClusterKey) && Objects.equals(this.tuples, that.tuples)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.averageSize, that.averageSize) && Objects.equals(this.maxRatio, that.maxRatio)
            && Objects.equals(this.minRatio, that.minRatio) && Objects.equals(this.skewSize, that.skewSize)
            && Objects.equals(this.skewRatio, that.skewRatio) && Objects.equals(this.skewStddev, that.skewStddev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableSize,
            id,
            tableName,
            tableOwner,
            schemaName,
            databaseName,
            isPartType,
            isHashClusterKey,
            tuples,
            createTime,
            updateTime,
            averageSize,
            maxRatio,
            minRatio,
            skewSize,
            skewRatio,
            skewStddev);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableVolumeResult {\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableOwner: ").append(toIndentedString(tableOwner)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    isPartType: ").append(toIndentedString(isPartType)).append("\n");
        sb.append("    isHashClusterKey: ").append(toIndentedString(isHashClusterKey)).append("\n");
        sb.append("    tuples: ").append(toIndentedString(tuples)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    averageSize: ").append(toIndentedString(averageSize)).append("\n");
        sb.append("    maxRatio: ").append(toIndentedString(maxRatio)).append("\n");
        sb.append("    minRatio: ").append(toIndentedString(minRatio)).append("\n");
        sb.append("    skewSize: ").append(toIndentedString(skewSize)).append("\n");
        sb.append("    skewRatio: ").append(toIndentedString(skewRatio)).append("\n");
        sb.append("    skewStddev: ").append(toIndentedString(skewStddev)).append("\n");
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
