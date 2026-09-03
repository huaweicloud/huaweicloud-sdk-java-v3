package com.huaweicloud.sdk.das.v3.model;

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
public class ListConnectionProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_info_list")

    private List<ProcessInfo> processInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info_list")

    private List<String> userInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_info_list")

    private List<String> dbInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_list")

    private List<String> hostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_info_list")

    private List<String> stateInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_info_list")

    private List<String> commandInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_exec_time")

    private Object sessionExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_session")

    private Long idleSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_session")

    private Long activeSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private List<ProcessSummary> summary = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_stats")

    private List<ProcessStats> userStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_stats")

    private List<ProcessStats> hostStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_stats")

    private List<ProcessStats> dbStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_version_support_message")

    private Boolean showVersionSupportMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_warn_message")

    private Boolean showWarnMessage;

    public ListConnectionProcessesResponse withProcessInfoList(List<ProcessInfo> processInfoList) {
        this.processInfoList = processInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addProcessInfoListItem(ProcessInfo processInfoListItem) {
        if (this.processInfoList == null) {
            this.processInfoList = new ArrayList<>();
        }
        this.processInfoList.add(processInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withProcessInfoList(Consumer<List<ProcessInfo>> processInfoListSetter) {
        if (this.processInfoList == null) {
            this.processInfoList = new ArrayList<>();
        }
        processInfoListSetter.accept(this.processInfoList);
        return this;
    }

    /**
     * 会话信息列表
     * @return processInfoList
     */
    public List<ProcessInfo> getProcessInfoList() {
        return processInfoList;
    }

    public void setProcessInfoList(List<ProcessInfo> processInfoList) {
        this.processInfoList = processInfoList;
    }

    public ListConnectionProcessesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 根据条件筛选的总会话数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListConnectionProcessesResponse withUserInfoList(List<String> userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addUserInfoListItem(String userInfoListItem) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        this.userInfoList.add(userInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withUserInfoList(Consumer<List<String>> userInfoListSetter) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        userInfoListSetter.accept(this.userInfoList);
        return this;
    }

    /**
     * 用户列表
     * @return userInfoList
     */
    public List<String> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<String> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public ListConnectionProcessesResponse withDbInfoList(List<String> dbInfoList) {
        this.dbInfoList = dbInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addDbInfoListItem(String dbInfoListItem) {
        if (this.dbInfoList == null) {
            this.dbInfoList = new ArrayList<>();
        }
        this.dbInfoList.add(dbInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withDbInfoList(Consumer<List<String>> dbInfoListSetter) {
        if (this.dbInfoList == null) {
            this.dbInfoList = new ArrayList<>();
        }
        dbInfoListSetter.accept(this.dbInfoList);
        return this;
    }

    /**
     * 数据库列表
     * @return dbInfoList
     */
    public List<String> getDbInfoList() {
        return dbInfoList;
    }

    public void setDbInfoList(List<String> dbInfoList) {
        this.dbInfoList = dbInfoList;
    }

    public ListConnectionProcessesResponse withHostInfoList(List<String> hostInfoList) {
        this.hostInfoList = hostInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addHostInfoListItem(String hostInfoListItem) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        this.hostInfoList.add(hostInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withHostInfoList(Consumer<List<String>> hostInfoListSetter) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        hostInfoListSetter.accept(this.hostInfoList);
        return this;
    }

    /**
     * 来源IP列表
     * @return hostInfoList
     */
    public List<String> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<String> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }

    public ListConnectionProcessesResponse withStateInfoList(List<String> stateInfoList) {
        this.stateInfoList = stateInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addStateInfoListItem(String stateInfoListItem) {
        if (this.stateInfoList == null) {
            this.stateInfoList = new ArrayList<>();
        }
        this.stateInfoList.add(stateInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withStateInfoList(Consumer<List<String>> stateInfoListSetter) {
        if (this.stateInfoList == null) {
            this.stateInfoList = new ArrayList<>();
        }
        stateInfoListSetter.accept(this.stateInfoList);
        return this;
    }

    /**
     * 状态列表
     * @return stateInfoList
     */
    public List<String> getStateInfoList() {
        return stateInfoList;
    }

    public void setStateInfoList(List<String> stateInfoList) {
        this.stateInfoList = stateInfoList;
    }

    public ListConnectionProcessesResponse withCommandInfoList(List<String> commandInfoList) {
        this.commandInfoList = commandInfoList;
        return this;
    }

    public ListConnectionProcessesResponse addCommandInfoListItem(String commandInfoListItem) {
        if (this.commandInfoList == null) {
            this.commandInfoList = new ArrayList<>();
        }
        this.commandInfoList.add(commandInfoListItem);
        return this;
    }

    public ListConnectionProcessesResponse withCommandInfoList(Consumer<List<String>> commandInfoListSetter) {
        if (this.commandInfoList == null) {
            this.commandInfoList = new ArrayList<>();
        }
        commandInfoListSetter.accept(this.commandInfoList);
        return this;
    }

    /**
     * 命令列表
     * @return commandInfoList
     */
    public List<String> getCommandInfoList() {
        return commandInfoList;
    }

    public void setCommandInfoList(List<String> commandInfoList) {
        this.commandInfoList = commandInfoList;
    }

    public ListConnectionProcessesResponse withSessionExecTime(Object sessionExecTime) {
        this.sessionExecTime = sessionExecTime;
        return this;
    }

    /**
     * 会话执行时间比例
     * @return sessionExecTime
     */
    public Object getSessionExecTime() {
        return sessionExecTime;
    }

    public void setSessionExecTime(Object sessionExecTime) {
        this.sessionExecTime = sessionExecTime;
    }

    public ListConnectionProcessesResponse withIdleSession(Long idleSession) {
        this.idleSession = idleSession;
        return this;
    }

    /**
     * 空闲会话数
     * @return idleSession
     */
    public Long getIdleSession() {
        return idleSession;
    }

    public void setIdleSession(Long idleSession) {
        this.idleSession = idleSession;
    }

    public ListConnectionProcessesResponse withActiveSession(Long activeSession) {
        this.activeSession = activeSession;
        return this;
    }

    /**
     * 运行会话数
     * @return activeSession
     */
    public Long getActiveSession() {
        return activeSession;
    }

    public void setActiveSession(Long activeSession) {
        this.activeSession = activeSession;
    }

    public ListConnectionProcessesResponse withSummary(List<ProcessSummary> summary) {
        this.summary = summary;
        return this;
    }

    public ListConnectionProcessesResponse addSummaryItem(ProcessSummary summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    public ListConnectionProcessesResponse withSummary(Consumer<List<ProcessSummary>> summarySetter) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        summarySetter.accept(this.summary);
        return this;
    }

    /**
     * 概要
     * @return summary
     */
    public List<ProcessSummary> getSummary() {
        return summary;
    }

    public void setSummary(List<ProcessSummary> summary) {
        this.summary = summary;
    }

    public ListConnectionProcessesResponse withUserStats(List<ProcessStats> userStats) {
        this.userStats = userStats;
        return this;
    }

    public ListConnectionProcessesResponse addUserStatsItem(ProcessStats userStatsItem) {
        if (this.userStats == null) {
            this.userStats = new ArrayList<>();
        }
        this.userStats.add(userStatsItem);
        return this;
    }

    public ListConnectionProcessesResponse withUserStats(Consumer<List<ProcessStats>> userStatsSetter) {
        if (this.userStats == null) {
            this.userStats = new ArrayList<>();
        }
        userStatsSetter.accept(this.userStats);
        return this;
    }

    /**
     * 按用户统计信息
     * @return userStats
     */
    public List<ProcessStats> getUserStats() {
        return userStats;
    }

    public void setUserStats(List<ProcessStats> userStats) {
        this.userStats = userStats;
    }

    public ListConnectionProcessesResponse withHostStats(List<ProcessStats> hostStats) {
        this.hostStats = hostStats;
        return this;
    }

    public ListConnectionProcessesResponse addHostStatsItem(ProcessStats hostStatsItem) {
        if (this.hostStats == null) {
            this.hostStats = new ArrayList<>();
        }
        this.hostStats.add(hostStatsItem);
        return this;
    }

    public ListConnectionProcessesResponse withHostStats(Consumer<List<ProcessStats>> hostStatsSetter) {
        if (this.hostStats == null) {
            this.hostStats = new ArrayList<>();
        }
        hostStatsSetter.accept(this.hostStats);
        return this;
    }

    /**
     * 按访问来源统计
     * @return hostStats
     */
    public List<ProcessStats> getHostStats() {
        return hostStats;
    }

    public void setHostStats(List<ProcessStats> hostStats) {
        this.hostStats = hostStats;
    }

    public ListConnectionProcessesResponse withDbStats(List<ProcessStats> dbStats) {
        this.dbStats = dbStats;
        return this;
    }

    public ListConnectionProcessesResponse addDbStatsItem(ProcessStats dbStatsItem) {
        if (this.dbStats == null) {
            this.dbStats = new ArrayList<>();
        }
        this.dbStats.add(dbStatsItem);
        return this;
    }

    public ListConnectionProcessesResponse withDbStats(Consumer<List<ProcessStats>> dbStatsSetter) {
        if (this.dbStats == null) {
            this.dbStats = new ArrayList<>();
        }
        dbStatsSetter.accept(this.dbStats);
        return this;
    }

    /**
     * 按数据库统计
     * @return dbStats
     */
    public List<ProcessStats> getDbStats() {
        return dbStats;
    }

    public void setDbStats(List<ProcessStats> dbStats) {
        this.dbStats = dbStats;
    }

    public ListConnectionProcessesResponse withShowVersionSupportMessage(Boolean showVersionSupportMessage) {
        this.showVersionSupportMessage = showVersionSupportMessage;
        return this;
    }

    /**
     * 是否显示版本支持信息
     * @return showVersionSupportMessage
     */
    public Boolean getShowVersionSupportMessage() {
        return showVersionSupportMessage;
    }

    public void setShowVersionSupportMessage(Boolean showVersionSupportMessage) {
        this.showVersionSupportMessage = showVersionSupportMessage;
    }

    public ListConnectionProcessesResponse withShowWarnMessage(Boolean showWarnMessage) {
        this.showWarnMessage = showWarnMessage;
        return this;
    }

    /**
     * 是否告警信息
     * @return showWarnMessage
     */
    public Boolean getShowWarnMessage() {
        return showWarnMessage;
    }

    public void setShowWarnMessage(Boolean showWarnMessage) {
        this.showWarnMessage = showWarnMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionProcessesResponse that = (ListConnectionProcessesResponse) obj;
        return Objects.equals(this.processInfoList, that.processInfoList) && Objects.equals(this.total, that.total)
            && Objects.equals(this.userInfoList, that.userInfoList) && Objects.equals(this.dbInfoList, that.dbInfoList)
            && Objects.equals(this.hostInfoList, that.hostInfoList)
            && Objects.equals(this.stateInfoList, that.stateInfoList)
            && Objects.equals(this.commandInfoList, that.commandInfoList)
            && Objects.equals(this.sessionExecTime, that.sessionExecTime)
            && Objects.equals(this.idleSession, that.idleSession)
            && Objects.equals(this.activeSession, that.activeSession) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.userStats, that.userStats) && Objects.equals(this.hostStats, that.hostStats)
            && Objects.equals(this.dbStats, that.dbStats)
            && Objects.equals(this.showVersionSupportMessage, that.showVersionSupportMessage)
            && Objects.equals(this.showWarnMessage, that.showWarnMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInfoList,
            total,
            userInfoList,
            dbInfoList,
            hostInfoList,
            stateInfoList,
            commandInfoList,
            sessionExecTime,
            idleSession,
            activeSession,
            summary,
            userStats,
            hostStats,
            dbStats,
            showVersionSupportMessage,
            showWarnMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionProcessesResponse {\n");
        sb.append("    processInfoList: ").append(toIndentedString(processInfoList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    userInfoList: ").append(toIndentedString(userInfoList)).append("\n");
        sb.append("    dbInfoList: ").append(toIndentedString(dbInfoList)).append("\n");
        sb.append("    hostInfoList: ").append(toIndentedString(hostInfoList)).append("\n");
        sb.append("    stateInfoList: ").append(toIndentedString(stateInfoList)).append("\n");
        sb.append("    commandInfoList: ").append(toIndentedString(commandInfoList)).append("\n");
        sb.append("    sessionExecTime: ").append(toIndentedString(sessionExecTime)).append("\n");
        sb.append("    idleSession: ").append(toIndentedString(idleSession)).append("\n");
        sb.append("    activeSession: ").append(toIndentedString(activeSession)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    userStats: ").append(toIndentedString(userStats)).append("\n");
        sb.append("    hostStats: ").append(toIndentedString(hostStats)).append("\n");
        sb.append("    dbStats: ").append(toIndentedString(dbStats)).append("\n");
        sb.append("    showVersionSupportMessage: ").append(toIndentedString(showVersionSupportMessage)).append("\n");
        sb.append("    showWarnMessage: ").append(toIndentedString(showWarnMessage)).append("\n");
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
