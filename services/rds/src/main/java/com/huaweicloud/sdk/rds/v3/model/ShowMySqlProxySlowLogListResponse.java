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
public class ShowMySqlProxySlowLogListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<ProxySlowLogDetail> slowLogList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_column")

    private List<String> slowLogColumn = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_query_time")

    private String slowLogQueryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_slow_log_enabled")

    private String ltsSlowLogEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_switch_lts_slow_log")

    private Boolean supportSwitchLtsSlowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    public ShowMySqlProxySlowLogListResponse withSlowLogList(List<ProxySlowLogDetail> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ShowMySqlProxySlowLogListResponse addSlowLogListItem(ProxySlowLogDetail slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ShowMySqlProxySlowLogListResponse withSlowLogList(Consumer<List<ProxySlowLogDetail>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * **参数解释**：  数据库代理慢日志信息列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return slowLogList
     */
    public List<ProxySlowLogDetail> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<ProxySlowLogDetail> slowLogList) {
        this.slowLogList = slowLogList;
    }

    public ShowMySqlProxySlowLogListResponse withSlowLogColumn(List<String> slowLogColumn) {
        this.slowLogColumn = slowLogColumn;
        return this;
    }

    public ShowMySqlProxySlowLogListResponse addSlowLogColumnItem(String slowLogColumnItem) {
        if (this.slowLogColumn == null) {
            this.slowLogColumn = new ArrayList<>();
        }
        this.slowLogColumn.add(slowLogColumnItem);
        return this;
    }

    public ShowMySqlProxySlowLogListResponse withSlowLogColumn(Consumer<List<String>> slowLogColumnSetter) {
        if (this.slowLogColumn == null) {
            this.slowLogColumn = new ArrayList<>();
        }
        slowLogColumnSetter.accept(this.slowLogColumn);
        return this;
    }

    /**
     * **参数解释**：  慢日志展示列表，该字段定义slow_log_list返回哪些字段信息，line_num字段一定返回。  **约束限制**：  不涉及。  **取值范围**：  - source_ip：客户端IP。 - desc_ip：后端数据库IP回。 - user：数据库用户。 - reaction_time：响应时长，单位ms。 - trace_id：SQL执行跟踪ID。 - sql：执行语句。 - start_time：SQL语句执行开始时间，毫秒级时间戳。 - end_time：SQL语句执行结束时间，毫秒级时间戳。 - database：数据库名称，默认不返回。 - log_time：日志上报时间，毫秒级时间戳，默认不返回。  **默认取值**：  不涉及。
     * @return slowLogColumn
     */
    public List<String> getSlowLogColumn() {
        return slowLogColumn;
    }

    public void setSlowLogColumn(List<String> slowLogColumn) {
        this.slowLogColumn = slowLogColumn;
    }

    public ShowMySqlProxySlowLogListResponse withSlowLogQueryTime(String slowLogQueryTime) {
        this.slowLogQueryTime = slowLogQueryTime;
        return this;
    }

    /**
     * **参数解释**：  慢日志阈值，单位ms。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return slowLogQueryTime
     */
    public String getSlowLogQueryTime() {
        return slowLogQueryTime;
    }

    public void setSlowLogQueryTime(String slowLogQueryTime) {
        this.slowLogQueryTime = slowLogQueryTime;
    }

    public ShowMySqlProxySlowLogListResponse withLtsSlowLogEnabled(String ltsSlowLogEnabled) {
        this.ltsSlowLogEnabled = ltsSlowLogEnabled;
        return this;
    }

    /**
     * **参数解释**：  慢日志上报开关状态。  **约束限制**：  不涉及。  **取值范围**：  - on：开启。 - off：关闭。  **默认取值**：  不涉及。
     * @return ltsSlowLogEnabled
     */
    public String getLtsSlowLogEnabled() {
        return ltsSlowLogEnabled;
    }

    public void setLtsSlowLogEnabled(String ltsSlowLogEnabled) {
        this.ltsSlowLogEnabled = ltsSlowLogEnabled;
    }

    public ShowMySqlProxySlowLogListResponse withSupportSwitchLtsSlowLog(Boolean supportSwitchLtsSlowLog) {
        this.supportSwitchLtsSlowLog = supportSwitchLtsSlowLog;
        return this;
    }

    /**
     * **参数解释**：  数据库代理版本是否支持慢日志上报。  **约束限制**：  不涉及。  **取值范围**：  - true：支持。 - false：不支持。  **默认取值**：  不涉及。
     * @return supportSwitchLtsSlowLog
     */
    public Boolean getSupportSwitchLtsSlowLog() {
        return supportSwitchLtsSlowLog;
    }

    public void setSupportSwitchLtsSlowLog(Boolean supportSwitchLtsSlowLog) {
        this.supportSwitchLtsSlowLog = supportSwitchLtsSlowLog;
    }

    public ShowMySqlProxySlowLogListResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  每次查询到的慢日志数量。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMySqlProxySlowLogListResponse that = (ShowMySqlProxySlowLogListResponse) obj;
        return Objects.equals(this.slowLogList, that.slowLogList)
            && Objects.equals(this.slowLogColumn, that.slowLogColumn)
            && Objects.equals(this.slowLogQueryTime, that.slowLogQueryTime)
            && Objects.equals(this.ltsSlowLogEnabled, that.ltsSlowLogEnabled)
            && Objects.equals(this.supportSwitchLtsSlowLog, that.supportSwitchLtsSlowLog)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(slowLogList, slowLogColumn, slowLogQueryTime, ltsSlowLogEnabled, supportSwitchLtsSlowLog, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMySqlProxySlowLogListResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
        sb.append("    slowLogColumn: ").append(toIndentedString(slowLogColumn)).append("\n");
        sb.append("    slowLogQueryTime: ").append(toIndentedString(slowLogQueryTime)).append("\n");
        sb.append("    ltsSlowLogEnabled: ").append(toIndentedString(ltsSlowLogEnabled)).append("\n");
        sb.append("    supportSwitchLtsSlowLog: ").append(toIndentedString(supportSwitchLtsSlowLog)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
