package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMetaLockSnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_type")

    private String lockType;

    public ShowMetaLockSnapshotRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ShowMetaLockSnapshotRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 元数据锁快照ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowMetaLockSnapshotRequest withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public ShowMetaLockSnapshotRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ShowMetaLockSnapshotRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowMetaLockSnapshotRequest withLockStatus(String lockStatus) {
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

    public ShowMetaLockSnapshotRequest withLockType(String lockType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetaLockSnapshotRequest that = (ShowMetaLockSnapshotRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.threadId, that.threadId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.lockType, that.lockType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, id, threadId, dbName, tableName, lockStatus, lockType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetaLockSnapshotRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
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
