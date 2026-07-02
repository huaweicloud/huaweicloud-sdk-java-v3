package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LockRootCause
 */
public class LockRootCause {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked_pid")

    private Long lockedPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked_sql")

    private String lockedSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_seconds")

    private Long waitSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_db")

    private String lockDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_table")

    private String lockTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_index")

    private String lockIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_data")

    private String lockData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_pid")

    private Long blockerPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_state")

    private String blockerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_age")

    private Integer blockerAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_rows_locked")

    private Long blockerRowsLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_rows_modified")

    private Long blockerRowsModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_current_sql")

    private List<String> blockerCurrentSql = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_host")

    private String blockerHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_command")

    private String blockerCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocker_thread_id")

    private Long blockerThreadId;

    public LockRootCause withLockedPid(Long lockedPid) {
        this.lockedPid = lockedPid;
        return this;
    }

    /**
     * **参数解释**： 被锁会话ID。 **取值范围**： 不涉及。 
     * @return lockedPid
     */
    public Long getLockedPid() {
        return lockedPid;
    }

    public void setLockedPid(Long lockedPid) {
        this.lockedPid = lockedPid;
    }

    public LockRootCause withLockedSql(String lockedSql) {
        this.lockedSql = lockedSql;
        return this;
    }

    /**
     * **参数解释**： 被锁会话当前执行的SQL。 **取值范围**： 不涉及。 
     * @return lockedSql
     */
    public String getLockedSql() {
        return lockedSql;
    }

    public void setLockedSql(String lockedSql) {
        this.lockedSql = lockedSql;
    }

    public LockRootCause withWaitSeconds(Long waitSeconds) {
        this.waitSeconds = waitSeconds;
        return this;
    }

    /**
     * **参数解释**： 等待持续时间（秒）。 **取值范围**： 不涉及。 
     * @return waitSeconds
     */
    public Long getWaitSeconds() {
        return waitSeconds;
    }

    public void setWaitSeconds(Long waitSeconds) {
        this.waitSeconds = waitSeconds;
    }

    public LockRootCause withLockDb(String lockDb) {
        this.lockDb = lockDb;
        return this;
    }

    /**
     * **参数解释**： 锁所在数据库。 **取值范围**： 不涉及。 
     * @return lockDb
     */
    public String getLockDb() {
        return lockDb;
    }

    public void setLockDb(String lockDb) {
        this.lockDb = lockDb;
    }

    public LockRootCause withLockTable(String lockTable) {
        this.lockTable = lockTable;
        return this;
    }

    /**
     * **参数解释**： 锁所在表。 **取值范围**： 不涉及。 
     * @return lockTable
     */
    public String getLockTable() {
        return lockTable;
    }

    public void setLockTable(String lockTable) {
        this.lockTable = lockTable;
    }

    public LockRootCause withLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
        return this;
    }

    /**
     * **参数解释**： 锁所在索引。 **取值范围**： 不涉及。 
     * @return lockIndex
     */
    public String getLockIndex() {
        return lockIndex;
    }

    public void setLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
    }

    public LockRootCause withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * **参数解释**： 锁模式。 **取值范围**： - IX：表级排他锁。 - X,REC_NOT_GAP：排他记录锁。 - X,GAP：间隙锁。 - X：行级排他锁。 
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public LockRootCause withLockData(String lockData) {
        this.lockData = lockData;
        return this;
    }

    /**
     * **参数解释**： 锁住的具体数据行的标识。 **取值范围**： 不涉及。 
     * @return lockData
     */
    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData;
    }

    public LockRootCause withBlockerPid(Long blockerPid) {
        this.blockerPid = blockerPid;
        return this;
    }

    /**
     * **参数解释**： 阻塞源会话ID。 **取值范围**： 不涉及。 
     * @return blockerPid
     */
    public Long getBlockerPid() {
        return blockerPid;
    }

    public void setBlockerPid(Long blockerPid) {
        this.blockerPid = blockerPid;
    }

    public LockRootCause withBlockerState(String blockerState) {
        this.blockerState = blockerState;
        return this;
    }

    /**
     * **参数解释**： 阻塞源事务状态。 **取值范围**： - RUNNING：运行中。 - LOCK WAIT：锁等待。 - ROLLING BACK：回滚中。 - COMMITTING：提交中。 
     * @return blockerState
     */
    public String getBlockerState() {
        return blockerState;
    }

    public void setBlockerState(String blockerState) {
        this.blockerState = blockerState;
    }

    public LockRootCause withBlockerAge(Integer blockerAge) {
        this.blockerAge = blockerAge;
        return this;
    }

    /**
     * **参数解释**： 阻塞源事务持续时间（秒）。 **取值范围**： 不涉及。 
     * @return blockerAge
     */
    public Integer getBlockerAge() {
        return blockerAge;
    }

    public void setBlockerAge(Integer blockerAge) {
        this.blockerAge = blockerAge;
    }

    public LockRootCause withBlockerRowsLocked(Long blockerRowsLocked) {
        this.blockerRowsLocked = blockerRowsLocked;
        return this;
    }

    /**
     * **参数解释**： 阻塞源锁定的行数。 **取值范围**： 不涉及。 
     * @return blockerRowsLocked
     */
    public Long getBlockerRowsLocked() {
        return blockerRowsLocked;
    }

    public void setBlockerRowsLocked(Long blockerRowsLocked) {
        this.blockerRowsLocked = blockerRowsLocked;
    }

    public LockRootCause withBlockerRowsModified(Long blockerRowsModified) {
        this.blockerRowsModified = blockerRowsModified;
        return this;
    }

    /**
     * **参数解释**： 阻塞源修改的行数。 **取值范围**： 不涉及。 
     * @return blockerRowsModified
     */
    public Long getBlockerRowsModified() {
        return blockerRowsModified;
    }

    public void setBlockerRowsModified(Long blockerRowsModified) {
        this.blockerRowsModified = blockerRowsModified;
    }

    public LockRootCause withBlockerCurrentSql(List<String> blockerCurrentSql) {
        this.blockerCurrentSql = blockerCurrentSql;
        return this;
    }

    public LockRootCause addBlockerCurrentSqlItem(String blockerCurrentSqlItem) {
        if (this.blockerCurrentSql == null) {
            this.blockerCurrentSql = new ArrayList<>();
        }
        this.blockerCurrentSql.add(blockerCurrentSqlItem);
        return this;
    }

    public LockRootCause withBlockerCurrentSql(Consumer<List<String>> blockerCurrentSqlSetter) {
        if (this.blockerCurrentSql == null) {
            this.blockerCurrentSql = new ArrayList<>();
        }
        blockerCurrentSqlSetter.accept(this.blockerCurrentSql);
        return this;
    }

    /**
     * **参数解释**： 阻塞源当前执行的SQL列表。 
     * @return blockerCurrentSql
     */
    public List<String> getBlockerCurrentSql() {
        return blockerCurrentSql;
    }

    public void setBlockerCurrentSql(List<String> blockerCurrentSql) {
        this.blockerCurrentSql = blockerCurrentSql;
    }

    public LockRootCause withBlockerHost(String blockerHost) {
        this.blockerHost = blockerHost;
        return this;
    }

    /**
     * **参数解释**： 阻塞源主机。 **取值范围**： 不涉及。 
     * @return blockerHost
     */
    public String getBlockerHost() {
        return blockerHost;
    }

    public void setBlockerHost(String blockerHost) {
        this.blockerHost = blockerHost;
    }

    public LockRootCause withBlockerCommand(String blockerCommand) {
        this.blockerCommand = blockerCommand;
        return this;
    }

    /**
     * **参数解释**： 阻塞源命令。 **取值范围**： 不涉及。 
     * @return blockerCommand
     */
    public String getBlockerCommand() {
        return blockerCommand;
    }

    public void setBlockerCommand(String blockerCommand) {
        this.blockerCommand = blockerCommand;
    }

    public LockRootCause withBlockerThreadId(Long blockerThreadId) {
        this.blockerThreadId = blockerThreadId;
        return this;
    }

    /**
     * **参数解释**： 阻塞源线程ID。 **取值范围**： 不涉及。 
     * @return blockerThreadId
     */
    public Long getBlockerThreadId() {
        return blockerThreadId;
    }

    public void setBlockerThreadId(Long blockerThreadId) {
        this.blockerThreadId = blockerThreadId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LockRootCause that = (LockRootCause) obj;
        return Objects.equals(this.lockedPid, that.lockedPid) && Objects.equals(this.lockedSql, that.lockedSql)
            && Objects.equals(this.waitSeconds, that.waitSeconds) && Objects.equals(this.lockDb, that.lockDb)
            && Objects.equals(this.lockTable, that.lockTable) && Objects.equals(this.lockIndex, that.lockIndex)
            && Objects.equals(this.lockMode, that.lockMode) && Objects.equals(this.lockData, that.lockData)
            && Objects.equals(this.blockerPid, that.blockerPid) && Objects.equals(this.blockerState, that.blockerState)
            && Objects.equals(this.blockerAge, that.blockerAge)
            && Objects.equals(this.blockerRowsLocked, that.blockerRowsLocked)
            && Objects.equals(this.blockerRowsModified, that.blockerRowsModified)
            && Objects.equals(this.blockerCurrentSql, that.blockerCurrentSql)
            && Objects.equals(this.blockerHost, that.blockerHost)
            && Objects.equals(this.blockerCommand, that.blockerCommand)
            && Objects.equals(this.blockerThreadId, that.blockerThreadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockedPid,
            lockedSql,
            waitSeconds,
            lockDb,
            lockTable,
            lockIndex,
            lockMode,
            lockData,
            blockerPid,
            blockerState,
            blockerAge,
            blockerRowsLocked,
            blockerRowsModified,
            blockerCurrentSql,
            blockerHost,
            blockerCommand,
            blockerThreadId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockRootCause {\n");
        sb.append("    lockedPid: ").append(toIndentedString(lockedPid)).append("\n");
        sb.append("    lockedSql: ").append(toIndentedString(lockedSql)).append("\n");
        sb.append("    waitSeconds: ").append(toIndentedString(waitSeconds)).append("\n");
        sb.append("    lockDb: ").append(toIndentedString(lockDb)).append("\n");
        sb.append("    lockTable: ").append(toIndentedString(lockTable)).append("\n");
        sb.append("    lockIndex: ").append(toIndentedString(lockIndex)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    lockData: ").append(toIndentedString(lockData)).append("\n");
        sb.append("    blockerPid: ").append(toIndentedString(blockerPid)).append("\n");
        sb.append("    blockerState: ").append(toIndentedString(blockerState)).append("\n");
        sb.append("    blockerAge: ").append(toIndentedString(blockerAge)).append("\n");
        sb.append("    blockerRowsLocked: ").append(toIndentedString(blockerRowsLocked)).append("\n");
        sb.append("    blockerRowsModified: ").append(toIndentedString(blockerRowsModified)).append("\n");
        sb.append("    blockerCurrentSql: ").append(toIndentedString(blockerCurrentSql)).append("\n");
        sb.append("    blockerHost: ").append(toIndentedString(blockerHost)).append("\n");
        sb.append("    blockerCommand: ").append(toIndentedString(blockerCommand)).append("\n");
        sb.append("    blockerThreadId: ").append(toIndentedString(blockerThreadId)).append("\n");
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
