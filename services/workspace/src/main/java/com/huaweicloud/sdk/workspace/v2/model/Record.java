package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Record
 */
public class Record {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_mac")

    private String terminalMac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_name")

    private String terminalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_ip")

    private String terminalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_version")

    private String clientVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_type")

    private String terminalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ip")

    private String desktopIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_start_time")

    private String connectionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_setup_time")

    private String connectionSetupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_end_time")

    private String connectionEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reconnect")

    private Boolean isReconnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_failure_reason")

    private String connectionFailureReason;

    public Record withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 计算机名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public Record withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Record withTerminalMac(String terminalMac) {
        this.terminalMac = terminalMac;
        return this;
    }

    /**
     * 终端MAC地址。
     * @return terminalMac
     */
    public String getTerminalMac() {
        return terminalMac;
    }

    public void setTerminalMac(String terminalMac) {
        this.terminalMac = terminalMac;
    }

    public Record withTerminalName(String terminalName) {
        this.terminalName = terminalName;
        return this;
    }

    /**
     * 终端名称。
     * @return terminalName
     */
    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public Record withTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
        return this;
    }

    /**
     * 终端IP。
     * @return terminalIp
     */
    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public Record withClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * AccessClient版本。
     * @return clientVersion
     */
    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public Record withTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }

    /**
     * 终端系统类型。
     * @return terminalType
     */
    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public Record withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * AccessAgent版本。
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Record withDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
        return this;
    }

    /**
     * 桌面IP。
     * @return desktopIp
     */
    public String getDesktopIp() {
        return desktopIp;
    }

    public void setDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
    }

    public Record withConnectionStartTime(String connectionStartTime) {
        this.connectionStartTime = connectionStartTime;
        return this;
    }

    /**
     * 开始连接时间。
     * @return connectionStartTime
     */
    public String getConnectionStartTime() {
        return connectionStartTime;
    }

    public void setConnectionStartTime(String connectionStartTime) {
        this.connectionStartTime = connectionStartTime;
    }

    public Record withConnectionSetupTime(String connectionSetupTime) {
        this.connectionSetupTime = connectionSetupTime;
        return this;
    }

    /**
     * 建立连接时间。
     * @return connectionSetupTime
     */
    public String getConnectionSetupTime() {
        return connectionSetupTime;
    }

    public void setConnectionSetupTime(String connectionSetupTime) {
        this.connectionSetupTime = connectionSetupTime;
    }

    public Record withConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
        return this;
    }

    /**
     * 结束连接时间。
     * @return connectionEndTime
     */
    public String getConnectionEndTime() {
        return connectionEndTime;
    }

    public void setConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
    }

    public Record withIsReconnect(Boolean isReconnect) {
        this.isReconnect = isReconnect;
        return this;
    }

    /**
     * 是否重连。
     * @return isReconnect
     */
    public Boolean getIsReconnect() {
        return isReconnect;
    }

    public void setIsReconnect(Boolean isReconnect) {
        this.isReconnect = isReconnect;
    }

    public Record withConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
        return this;
    }

    /**
     * 连接失败原因。
     * @return connectionFailureReason
     */
    public String getConnectionFailureReason() {
        return connectionFailureReason;
    }

    public void setConnectionFailureReason(String connectionFailureReason) {
        this.connectionFailureReason = connectionFailureReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Record record = (Record) o;
        return Objects.equals(this.computerName, record.computerName) && Objects.equals(this.userName, record.userName)
            && Objects.equals(this.terminalMac, record.terminalMac)
            && Objects.equals(this.terminalName, record.terminalName)
            && Objects.equals(this.terminalIp, record.terminalIp)
            && Objects.equals(this.clientVersion, record.clientVersion)
            && Objects.equals(this.terminalType, record.terminalType)
            && Objects.equals(this.agentVersion, record.agentVersion)
            && Objects.equals(this.desktopIp, record.desktopIp)
            && Objects.equals(this.connectionStartTime, record.connectionStartTime)
            && Objects.equals(this.connectionSetupTime, record.connectionSetupTime)
            && Objects.equals(this.connectionEndTime, record.connectionEndTime)
            && Objects.equals(this.isReconnect, record.isReconnect)
            && Objects.equals(this.connectionFailureReason, record.connectionFailureReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName,
            userName,
            terminalMac,
            terminalName,
            terminalIp,
            clientVersion,
            terminalType,
            agentVersion,
            desktopIp,
            connectionStartTime,
            connectionSetupTime,
            connectionEndTime,
            isReconnect,
            connectionFailureReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Record {\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    terminalMac: ").append(toIndentedString(terminalMac)).append("\n");
        sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
        sb.append("    terminalIp: ").append(toIndentedString(terminalIp)).append("\n");
        sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
        sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    desktopIp: ").append(toIndentedString(desktopIp)).append("\n");
        sb.append("    connectionStartTime: ").append(toIndentedString(connectionStartTime)).append("\n");
        sb.append("    connectionSetupTime: ").append(toIndentedString(connectionSetupTime)).append("\n");
        sb.append("    connectionEndTime: ").append(toIndentedString(connectionEndTime)).append("\n");
        sb.append("    isReconnect: ").append(toIndentedString(isReconnect)).append("\n");
        sb.append("    connectionFailureReason: ").append(toIndentedString(connectionFailureReason)).append("\n");
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
