package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowStarRocksSlowLogDetail
 */
public class ShowStarRocksSlowLogDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private String rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private String rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_date")

    private Long slowLogDate;

    public ShowStarRocksSlowLogDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：  节点ID。   **取值范围**：  只能由英文字母、数字组成，前面为UUID，后缀为no07，长度为36个字符。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowStarRocksSlowLogDetail withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：  执行次数。   **取值范围**：   不涉及。 
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowStarRocksSlowLogDetail withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**：  执行时间。   **取值范围**：   不涉及。 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ShowStarRocksSlowLogDetail withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * **参数解释**：  等待锁时间。   **取值范围**：   不涉及。 
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public ShowStarRocksSlowLogDetail withRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * **参数解释**：  结果行数量。   **取值范围**：   不涉及。 
     * @return rowsSent
     */
    public String getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
    }

    public ShowStarRocksSlowLogDetail withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * **参数解释**：  扫描的行数量。   **取值范围**：   不涉及。 
     * @return rowsExamined
     */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public ShowStarRocksSlowLogDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**：   所属数据库。   **取值范围**：   gaussdb-mysql。 
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ShowStarRocksSlowLogDetail withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * **参数解释**：  账号名称。   **取值范围**：   不涉及。 
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public ShowStarRocksSlowLogDetail withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * **参数解释**：  执行语法。   **取值范围**：   不涉及。 
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public ShowStarRocksSlowLogDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  语句类型。   **取值范围**：  - INSERT - UPDATE - SELECT - DELETE - ALTER - DROP - CREATE。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowStarRocksSlowLogDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  发生时间，UTC时间。   **取值范围**：   不涉及。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowStarRocksSlowLogDetail withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * **参数解释**：  IP地址。   **取值范围**：   不涉及。 
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public ShowStarRocksSlowLogDetail withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * **参数解释**：  日志单行序列号。   **取值范围**：   不涉及。 
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ShowStarRocksSlowLogDetail withSlowLogDate(Long slowLogDate) {
        this.slowLogDate = slowLogDate;
        return this;
    }

    /**
     * **参数解释**：  慢日志日期。   **取值范围**：   不涉及。 
     * @return slowLogDate
     */
    public Long getSlowLogDate() {
        return slowLogDate;
    }

    public void setSlowLogDate(Long slowLogDate) {
        this.slowLogDate = slowLogDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStarRocksSlowLogDetail that = (ShowStarRocksSlowLogDetail) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.time, that.time) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.rowsSent, that.rowsSent) && Objects.equals(this.rowsExamined, that.rowsExamined)
            && Objects.equals(this.database, that.database) && Objects.equals(this.users, that.users)
            && Objects.equals(this.querySample, that.querySample) && Objects.equals(this.type, that.type)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.lineNum, that.lineNum) && Objects.equals(this.slowLogDate, that.slowLogDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId,
            count,
            time,
            lockTime,
            rowsSent,
            rowsExamined,
            database,
            users,
            querySample,
            type,
            startTime,
            clientIp,
            lineNum,
            slowLogDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStarRocksSlowLogDetail {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    slowLogDate: ").append(toIndentedString(slowLogDate)).append("\n");
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
