package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListLoginRecordsNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_type")

    private String terminalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_network_rtt")

    private Integer minNetworkRtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_network_rtt")

    private Integer maxNetworkRtt;

    public ListLoginRecordsNewRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询的起始时间。指定该参数后，返回的结果为此时间之后的所有登录记录。时间格式如：“2016-08-20T21:11Z”。终止时间不为空时，起始时间为必填参数。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListLoginRecordsNewRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询的终止时间。指定该参数后，返回的结果为此时间之前的所有登录记录。时间格式如：“2016-08-20T21:11Z”。起始时间不为空时，终止时间为必填参数。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListLoginRecordsNewRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 登录桌面的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListLoginRecordsNewRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 计算机名（操作系统信息中可见）。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ListLoginRecordsNewRequest withTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }

    /**
     * 登录桌面的终端系统类型，当前支持：WI（云桌面客户端）。
     * @return terminalType
     */
    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public ListLoginRecordsNewRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListLoginRecordsNewRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回登录记录数量限制,取值范围0-1000。如果不指定，默认为20。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLoginRecordsNewRequest withMinNetworkRtt(Integer minNetworkRtt) {
        this.minNetworkRtt = minNetworkRtt;
        return this;
    }

    /**
     * 查询端到端时延的最小值
     * minimum: 0
     * maximum: 10000
     * @return minNetworkRtt
     */
    public Integer getMinNetworkRtt() {
        return minNetworkRtt;
    }

    public void setMinNetworkRtt(Integer minNetworkRtt) {
        this.minNetworkRtt = minNetworkRtt;
    }

    public ListLoginRecordsNewRequest withMaxNetworkRtt(Integer maxNetworkRtt) {
        this.maxNetworkRtt = maxNetworkRtt;
        return this;
    }

    /**
     * 查询端到端时延的最大值
     * minimum: 0
     * maximum: 10000
     * @return maxNetworkRtt
     */
    public Integer getMaxNetworkRtt() {
        return maxNetworkRtt;
    }

    public void setMaxNetworkRtt(Integer maxNetworkRtt) {
        this.maxNetworkRtt = maxNetworkRtt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLoginRecordsNewRequest that = (ListLoginRecordsNewRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.terminalType, that.terminalType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.minNetworkRtt, that.minNetworkRtt)
            && Objects.equals(this.maxNetworkRtt, that.maxNetworkRtt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            userName,
            computerName,
            terminalType,
            offset,
            limit,
            minNetworkRtt,
            maxNetworkRtt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoginRecordsNewRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    minNetworkRtt: ").append(toIndentedString(minNetworkRtt)).append("\n");
        sb.append("    maxNetworkRtt: ").append(toIndentedString(maxNetworkRtt)).append("\n");
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
