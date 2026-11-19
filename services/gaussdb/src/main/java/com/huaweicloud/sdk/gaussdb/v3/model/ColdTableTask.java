package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ColdTableTask
 */
public class ColdTableTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_name")

    private String partitionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_storage")

    private String targetStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent")

    private Double percent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cnt")

    private Double totalCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ColdTableTask withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**：  数据库名。  **取值范围**：  不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ColdTableTask withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**：  表名。  **取值范围**：  不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ColdTableTask withPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }

    /**
     * **参数解释**：  分区名，为空表示无分区表。  **取值范围**：  不涉及。
     * @return partitionName
     */
    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    public ColdTableTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  任务状态。  **取值范围**：  - BEGIN：开始。 - RUNNING：进行中。 - FINISH：已完成。 - FAIL：失败。 - REVOKE：回滚。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ColdTableTask withTargetStorage(String targetStorage) {
        this.targetStorage = targetStorage;
        return this;
    }

    /**
     * **参数解释**：  操作类型。  **取值范围**：  - OBS：创建冷表。 - SLICE：回迁冷表。
     * @return targetStorage
     */
    public String getTargetStorage() {
        return targetStorage;
    }

    public void setTargetStorage(String targetStorage) {
        this.targetStorage = targetStorage;
    }

    public ColdTableTask withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * **参数解释**：  任务进度百分比。  **取值范围**：  0-1。
     * @return percent
     */
    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ColdTableTask withTotalCnt(Double totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }

    /**
     * **参数解释**：  对象数。  **取值范围**：  非负数。
     * @return totalCnt
     */
    public Double getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Double totalCnt) {
        this.totalCnt = totalCnt;
    }

    public ColdTableTask withSpaceId(String spaceId) {
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

    public ColdTableTask withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：  冷表版本。  **取值范围**：  不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColdTableTask that = (ColdTableTask) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.partitionName, that.partitionName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.targetStorage, that.targetStorage) && Objects.equals(this.percent, that.percent)
            && Objects.equals(this.totalCnt, that.totalCnt) && Objects.equals(this.spaceId, that.spaceId)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dbName, tableName, partitionName, status, targetStorage, percent, totalCnt, spaceId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdTableTask {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    targetStorage: ").append(toIndentedString(targetStorage)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    totalCnt: ").append(toIndentedString(totalCnt)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
