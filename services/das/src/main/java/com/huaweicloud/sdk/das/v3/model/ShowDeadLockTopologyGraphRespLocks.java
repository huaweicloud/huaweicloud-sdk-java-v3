package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowDeadLockTopologyGraphRespLocks
 */
public class ShowDeadLockTopologyGraphRespLocks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_id")

    private String lockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_type")

    private String lockType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private Long spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Long pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heap_no")

    private Long heapNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private Boolean primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked_data")

    private List<ShowDeadLockTopologyGraphRespLockedData> lockedData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown")

    private Boolean unknown;

    public ShowDeadLockTopologyGraphRespLocks withLockId(String lockId) {
        this.lockId = lockId;
        return this;
    }

    /**
     * 锁节点唯一标识
     * @return lockId
     */
    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public ShowDeadLockTopologyGraphRespLocks withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务节点唯一标识
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ShowDeadLockTopologyGraphRespLocks withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名字
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public ShowDeadLockTopologyGraphRespLocks withLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }

    /**
     * 锁类型
     * @return lockType
     */
    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public ShowDeadLockTopologyGraphRespLocks withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * 锁模式
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public ShowDeadLockTopologyGraphRespLocks withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 锁状态
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public ShowDeadLockTopologyGraphRespLocks withSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * 表空间ID
     * @return spaceId
     */
    public Long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public ShowDeadLockTopologyGraphRespLocks withPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页号
     * @return pageNo
     */
    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public ShowDeadLockTopologyGraphRespLocks withHeapNo(Long heapNo) {
        this.heapNo = heapNo;
        return this;
    }

    /**
     * 堆号
     * @return heapNo
     */
    public Long getHeapNo() {
        return heapNo;
    }

    public void setHeapNo(Long heapNo) {
        this.heapNo = heapNo;
    }

    public ShowDeadLockTopologyGraphRespLocks withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 操作的表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowDeadLockTopologyGraphRespLocks withPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 是否主键索引
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public ShowDeadLockTopologyGraphRespLocks withLockedData(List<ShowDeadLockTopologyGraphRespLockedData> lockedData) {
        this.lockedData = lockedData;
        return this;
    }

    public ShowDeadLockTopologyGraphRespLocks addLockedDataItem(
        ShowDeadLockTopologyGraphRespLockedData lockedDataItem) {
        if (this.lockedData == null) {
            this.lockedData = new ArrayList<>();
        }
        this.lockedData.add(lockedDataItem);
        return this;
    }

    public ShowDeadLockTopologyGraphRespLocks withLockedData(
        Consumer<List<ShowDeadLockTopologyGraphRespLockedData>> lockedDataSetter) {
        if (this.lockedData == null) {
            this.lockedData = new ArrayList<>();
        }
        lockedDataSetter.accept(this.lockedData);
        return this;
    }

    /**
     * 锁定的字段数据
     * @return lockedData
     */
    public List<ShowDeadLockTopologyGraphRespLockedData> getLockedData() {
        return lockedData;
    }

    public void setLockedData(List<ShowDeadLockTopologyGraphRespLockedData> lockedData) {
        this.lockedData = lockedData;
    }

    public ShowDeadLockTopologyGraphRespLocks withUnknown(Boolean unknown) {
        this.unknown = unknown;
        return this;
    }

    /**
     * 是否未知锁
     * @return unknown
     */
    public Boolean getUnknown() {
        return unknown;
    }

    public void setUnknown(Boolean unknown) {
        this.unknown = unknown;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyGraphRespLocks that = (ShowDeadLockTopologyGraphRespLocks) obj;
        return Objects.equals(this.lockId, that.lockId) && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.indexName, that.indexName) && Objects.equals(this.lockType, that.lockType)
            && Objects.equals(this.lockMode, that.lockMode) && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.spaceId, that.spaceId) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.heapNo, that.heapNo) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.lockedData, that.lockedData)
            && Objects.equals(this.unknown, that.unknown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockId,
            transactionId,
            indexName,
            lockType,
            lockMode,
            lockStatus,
            spaceId,
            pageNo,
            heapNo,
            tableName,
            primaryKey,
            lockedData,
            unknown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyGraphRespLocks {\n");
        sb.append("    lockId: ").append(toIndentedString(lockId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    heapNo: ").append(toIndentedString(heapNo)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    lockedData: ").append(toIndentedString(lockedData)).append("\n");
        sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
