package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Top IO信息
 */
public class TopIoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    /**
     * 线程分类标识，取值：业务（worker）和后台（background）。需将GUC参数\"enable_thread_pool\"设置为on
     */
    public static final class ThreadTypeEnum {

        /**
         * Enum WORKER for value: "worker"
         */
        public static final ThreadTypeEnum WORKER = new ThreadTypeEnum("worker");

        /**
         * Enum BACKGROUND for value: "background"
         */
        public static final ThreadTypeEnum BACKGROUND = new ThreadTypeEnum("background");

        private static final Map<String, ThreadTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ThreadTypeEnum> createStaticFields() {
            Map<String, ThreadTypeEnum> map = new HashMap<>();
            map.put("worker", WORKER);
            map.put("background", BACKGROUND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ThreadTypeEnum(String value) {
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
        public static ThreadTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ThreadTypeEnum(value));
        }

        public static ThreadTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ThreadTypeEnum) {
                return this.value.equals(((ThreadTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_type")

    private ThreadTypeEnum threadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_read_rate")

    private Integer diskReadRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_write_rate")

    private Integer diskWriteRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_sql_id")

    private String uniqueSqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_start")

    private Long sqlStart;

    public TopIoInfo withThreadId(String threadId) {
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

    public TopIoInfo withThreadType(ThreadTypeEnum threadType) {
        this.threadType = threadType;
        return this;
    }

    /**
     * 线程分类标识，取值：业务（worker）和后台（background）。需将GUC参数\"enable_thread_pool\"设置为on
     * @return threadType
     */
    public ThreadTypeEnum getThreadType() {
        return threadType;
    }

    public void setThreadType(ThreadTypeEnum threadType) {
        this.threadType = threadType;
    }

    public TopIoInfo withDiskReadRate(Integer diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }

    /**
     * 从磁盘读取数据速率, 单位：KB/s
     * @return diskReadRate
     */
    public Integer getDiskReadRate() {
        return diskReadRate;
    }

    public void setDiskReadRate(Integer diskReadRate) {
        this.diskReadRate = diskReadRate;
    }

    public TopIoInfo withDiskWriteRate(Integer diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }

    /**
     * 写入磁盘数据速率, 单位：KB/s
     * @return diskWriteRate
     */
    public Integer getDiskWriteRate() {
        return diskWriteRate;
    }

    public void setDiskWriteRate(Integer diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
    }

    public TopIoInfo withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public TopIoInfo withUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * SQL ID
     * @return uniqueSqlId
     */
    public String getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public TopIoInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TopIoInfo withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端IP
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public TopIoInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TopIoInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TopIoInfo withSqlStart(Long sqlStart) {
        this.sqlStart = sqlStart;
        return this;
    }

    /**
     * 语句开始时间
     * @return sqlStart
     */
    public Long getSqlStart() {
        return sqlStart;
    }

    public void setSqlStart(Long sqlStart) {
        this.sqlStart = sqlStart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopIoInfo that = (TopIoInfo) obj;
        return Objects.equals(this.threadId, that.threadId) && Objects.equals(this.threadType, that.threadType)
            && Objects.equals(this.diskReadRate, that.diskReadRate)
            && Objects.equals(this.diskWriteRate, that.diskWriteRate) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.sqlStart, that.sqlStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threadId,
            threadType,
            diskReadRate,
            diskWriteRate,
            sessionId,
            uniqueSqlId,
            databaseName,
            clientIp,
            userName,
            state,
            sqlStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopIoInfo {\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    threadType: ").append(toIndentedString(threadType)).append("\n");
        sb.append("    diskReadRate: ").append(toIndentedString(diskReadRate)).append("\n");
        sb.append("    diskWriteRate: ").append(toIndentedString(diskWriteRate)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sqlStart: ").append(toIndentedString(sqlStart)).append("\n");
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
