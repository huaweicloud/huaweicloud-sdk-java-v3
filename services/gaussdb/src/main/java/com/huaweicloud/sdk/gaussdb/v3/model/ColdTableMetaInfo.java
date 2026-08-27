package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 冷表元信息
 */
public class ColdTableMetaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dd_id")

    private String ddId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_name")

    private String partitionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retained_time")

    private Long retainedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Float dataSize;

    public ColdTableMetaInfo withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * **参数解释**：  表空间ID。  **取值范围**：  不涉及。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public ColdTableMetaInfo withDdId(String ddId) {
        this.ddId = ddId;
        return this;
    }

    /**
     * **参数解释**：  表ID。  **取值范围**：  不涉及。
     * @return ddId
     */
    public String getDdId() {
        return ddId;
    }

    public void setDdId(String ddId) {
        this.ddId = ddId;
    }

    public ColdTableMetaInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**：  冷表库名。  **取值范围**：  不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ColdTableMetaInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**：  冷表表名。  **取值范围**：  不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ColdTableMetaInfo withPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }

    /**
     * **参数解释**：  冷表分区名。  **取值范围**：  不涉及。
     * @return partitionName
     */
    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    public ColdTableMetaInfo withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * **参数解释**：  冷表有效周期（秒）。  **取值范围**：  ≥0。
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public ColdTableMetaInfo withRetainedTime(Long retainedTime) {
        this.retainedTime = retainedTime;
        return this;
    }

    /**
     * **参数解释**：  冷表已保留时间（秒）。  **取值范围**：  ≥0。
     * @return retainedTime
     */
    public Long getRetainedTime() {
        return retainedTime;
    }

    public void setRetainedTime(Long retainedTime) {
        this.retainedTime = retainedTime;
    }

    public ColdTableMetaInfo withDataSize(Float dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * **参数解释**：  冷表数据量大小（MB）。  **取值范围**：  ≥0。
     * @return dataSize
     */
    public Float getDataSize() {
        return dataSize;
    }

    public void setDataSize(Float dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColdTableMetaInfo that = (ColdTableMetaInfo) obj;
        return Objects.equals(this.spaceId, that.spaceId) && Objects.equals(this.ddId, that.ddId)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.partitionName, that.partitionName)
            && Objects.equals(this.expirationTime, that.expirationTime)
            && Objects.equals(this.retainedTime, that.retainedTime) && Objects.equals(this.dataSize, that.dataSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(spaceId, ddId, databaseName, tableName, partitionName, expirationTime, retainedTime, dataSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdTableMetaInfo {\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    ddId: ").append(toIndentedString(ddId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    retainedTime: ").append(toIndentedString(retainedTime)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
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
