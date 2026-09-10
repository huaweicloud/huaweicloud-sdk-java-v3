package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class QueryAutoSqlLimitingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Integer cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_sessions")

    private Integer activeSessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_allow")

    private Integer sessionAllow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private List<String> user = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private List<String> db = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clear_time")

    private Integer clearTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_keyword")

    private Boolean isKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retain_sql_rule")

    private Boolean retainSqlRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kill_session_switch")

    private Boolean killSessionSwitch;

    public QueryAutoSqlLimitingResponse withCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * 限流策略CPU利用率。
     * @return cpuUsage
     */
    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public QueryAutoSqlLimitingResponse withActiveSessions(Integer activeSessions) {
        this.activeSessions = activeSessions;
        return this;
    }

    /**
     * 限流策略活跃会话数。
     * @return activeSessions
     */
    public Integer getActiveSessions() {
        return activeSessions;
    }

    public void setActiveSessions(Integer activeSessions) {
        this.activeSessions = activeSessions;
    }

    public QueryAutoSqlLimitingResponse withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 限流策略CPU利用率和活跃会话数的关联关系。取值范围：and、or。
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public QueryAutoSqlLimitingResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 限流策略满足限流条件的事件持续时间（分钟）。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public QueryAutoSqlLimitingResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 自治限流规则每天生效开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryAutoSqlLimitingResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 自治限流规则每天生效结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryAutoSqlLimitingResponse withSessionAllow(Integer sessionAllow) {
        this.sessionAllow = sessionAllow;
        return this;
    }

    /**
     * 允许的会话数。
     * @return sessionAllow
     */
    public Integer getSessionAllow() {
        return sessionAllow;
    }

    public void setSessionAllow(Integer sessionAllow) {
        this.sessionAllow = sessionAllow;
    }

    public QueryAutoSqlLimitingResponse withUser(List<String> user) {
        this.user = user;
        return this;
    }

    public QueryAutoSqlLimitingResponse addUserItem(String userItem) {
        if (this.user == null) {
            this.user = new ArrayList<>();
        }
        this.user.add(userItem);
        return this;
    }

    public QueryAutoSqlLimitingResponse withUser(Consumer<List<String>> userSetter) {
        if (this.user == null) {
            this.user = new ArrayList<>();
        }
        userSetter.accept(this.user);
        return this;
    }

    /**
     * 限流规则适用的用户列表。
     * @return user
     */
    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public QueryAutoSqlLimitingResponse withDb(List<String> db) {
        this.db = db;
        return this;
    }

    public QueryAutoSqlLimitingResponse addDbItem(String dbItem) {
        if (this.db == null) {
            this.db = new ArrayList<>();
        }
        this.db.add(dbItem);
        return this;
    }

    public QueryAutoSqlLimitingResponse withDb(Consumer<List<String>> dbSetter) {
        if (this.db == null) {
            this.db = new ArrayList<>();
        }
        dbSetter.accept(this.db);
        return this;
    }

    /**
     * 限流规则适用的数据库列表。
     * @return db
     */
    public List<String> getDb() {
        return db;
    }

    public void setDb(List<String> db) {
        this.db = db;
    }

    public QueryAutoSqlLimitingResponse withClearTime(Integer clearTime) {
        this.clearTime = clearTime;
        return this;
    }

    /**
     * 每次最大限流时长（分钟）。
     * @return clearTime
     */
    public Integer getClearTime() {
        return clearTime;
    }

    public void setClearTime(Integer clearTime) {
        this.clearTime = clearTime;
    }

    public QueryAutoSqlLimitingResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用自治限流规则。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public QueryAutoSqlLimitingResponse withIsKeyword(Boolean isKeyword) {
        this.isKeyword = isKeyword;
        return this;
    }

    /**
     * 是否为关键字限流。
     * @return isKeyword
     */
    public Boolean getIsKeyword() {
        return isKeyword;
    }

    public void setIsKeyword(Boolean isKeyword) {
        this.isKeyword = isKeyword;
    }

    public QueryAutoSqlLimitingResponse withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * 最大并发数。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public QueryAutoSqlLimitingResponse withRetainSqlRule(Boolean retainSqlRule) {
        this.retainSqlRule = retainSqlRule;
        return this;
    }

    /**
     * 是否保留SQL限流规则。
     * @return retainSqlRule
     */
    public Boolean getRetainSqlRule() {
        return retainSqlRule;
    }

    public void setRetainSqlRule(Boolean retainSqlRule) {
        this.retainSqlRule = retainSqlRule;
    }

    public QueryAutoSqlLimitingResponse withKillSessionSwitch(Boolean killSessionSwitch) {
        this.killSessionSwitch = killSessionSwitch;
        return this;
    }

    /**
     * 是否开启kill会话开关。
     * @return killSessionSwitch
     */
    public Boolean getKillSessionSwitch() {
        return killSessionSwitch;
    }

    public void setKillSessionSwitch(Boolean killSessionSwitch) {
        this.killSessionSwitch = killSessionSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryAutoSqlLimitingResponse that = (QueryAutoSqlLimitingResponse) obj;
        return Objects.equals(this.cpuUsage, that.cpuUsage) && Objects.equals(this.activeSessions, that.activeSessions)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.sessionAllow, that.sessionAllow) && Objects.equals(this.user, that.user)
            && Objects.equals(this.db, that.db) && Objects.equals(this.clearTime, that.clearTime)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.isKeyword, that.isKeyword)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.retainSqlRule, that.retainSqlRule)
            && Objects.equals(this.killSessionSwitch, that.killSessionSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUsage,
            activeSessions,
            condition,
            duration,
            startTime,
            endTime,
            sessionAllow,
            user,
            db,
            clearTime,
            enable,
            isKeyword,
            maxConcurrency,
            retainSqlRule,
            killSessionSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAutoSqlLimitingResponse {\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    activeSessions: ").append(toIndentedString(activeSessions)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sessionAllow: ").append(toIndentedString(sessionAllow)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    clearTime: ").append(toIndentedString(clearTime)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    isKeyword: ").append(toIndentedString(isKeyword)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    retainSqlRule: ").append(toIndentedString(retainSqlRule)).append("\n");
        sb.append("    killSessionSwitch: ").append(toIndentedString(killSessionSwitch)).append("\n");
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
