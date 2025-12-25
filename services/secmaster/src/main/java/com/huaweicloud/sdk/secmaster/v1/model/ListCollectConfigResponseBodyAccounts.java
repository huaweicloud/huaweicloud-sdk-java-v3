package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ListCollectConfigResponseBodyAccounts
 */
public class ListCollectConfigResponseBodyAccounts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_log_date")

    private BigDecimal lastLogDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_count")

    private String logCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_msg")

    private String sinkMsg;

    public ListCollectConfigResponseBodyAccounts withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账号ID
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ListCollectConfigResponseBodyAccounts withLastLogDate(BigDecimal lastLogDate) {
        this.lastLogDate = lastLogDate;
        return this;
    }

    /**
     * 最近接入时间
     * minimum: 0
     * maximum: 4.9E+12
     * @return lastLogDate
     */
    public BigDecimal getLastLogDate() {
        return lastLogDate;
    }

    public void setLastLogDate(BigDecimal lastLogDate) {
        this.lastLogDate = lastLogDate;
    }

    public ListCollectConfigResponseBodyAccounts withLogCount(String logCount) {
        this.logCount = logCount;
        return this;
    }

    /**
     * 最近一小时接入数量
     * @return logCount
     */
    public String getLogCount() {
        return logCount;
    }

    public void setLogCount(String logCount) {
        this.logCount = logCount;
    }

    public ListCollectConfigResponseBodyAccounts withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 账号名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCollectConfigResponseBodyAccounts withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 接入状态
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public ListCollectConfigResponseBodyAccounts withSinkMsg(String sinkMsg) {
        this.sinkMsg = sinkMsg;
        return this;
    }

    /**
     * 错误信息
     * @return sinkMsg
     */
    public String getSinkMsg() {
        return sinkMsg;
    }

    public void setSinkMsg(String sinkMsg) {
        this.sinkMsg = sinkMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyAccounts that = (ListCollectConfigResponseBodyAccounts) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.lastLogDate, that.lastLogDate)
            && Objects.equals(this.logCount, that.logCount) && Objects.equals(this.name, that.name)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.sinkMsg, that.sinkMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, lastLogDate, logCount, name, processStatus, sinkMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyAccounts {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    lastLogDate: ").append(toIndentedString(lastLogDate)).append("\n");
        sb.append("    logCount: ").append(toIndentedString(logCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    sinkMsg: ").append(toIndentedString(sinkMsg)).append("\n");
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
