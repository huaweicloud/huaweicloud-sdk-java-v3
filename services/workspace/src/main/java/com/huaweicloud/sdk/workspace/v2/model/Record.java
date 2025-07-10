package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Record
 */
public class Record {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_rtt")

    private Integer networkRtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e2e_rtt")

    private Integer e2eRtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    public Record withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id，不对外展示。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Record withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 桌面sid。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Record withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务id。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

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

    public Record withNetworkRtt(Integer networkRtt) {
        this.networkRtt = networkRtt;
        return this;
    }

    /**
     * 网络时延ms。
     * @return networkRtt
     */
    public Integer getNetworkRtt() {
        return networkRtt;
    }

    public void setNetworkRtt(Integer networkRtt) {
        this.networkRtt = networkRtt;
    }

    public Record withE2eRtt(Integer e2eRtt) {
        this.e2eRtt = e2eRtt;
        return this;
    }

    /**
     * 端到端时延 ms。
     * @return e2eRtt
     */
    public Integer getE2eRtt() {
        return e2eRtt;
    }

    public void setE2eRtt(Integer e2eRtt) {
        this.e2eRtt = e2eRtt;
    }

    public Record withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 客户端源ip
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public Record withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 客户端出网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Record that = (Record) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.computerName, that.computerName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.terminalMac, that.terminalMac)
            && Objects.equals(this.terminalName, that.terminalName) && Objects.equals(this.terminalIp, that.terminalIp)
            && Objects.equals(this.clientVersion, that.clientVersion)
            && Objects.equals(this.terminalType, that.terminalType)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.desktopIp, that.desktopIp)
            && Objects.equals(this.connectionStartTime, that.connectionStartTime)
            && Objects.equals(this.connectionSetupTime, that.connectionSetupTime)
            && Objects.equals(this.connectionEndTime, that.connectionEndTime)
            && Objects.equals(this.isReconnect, that.isReconnect)
            && Objects.equals(this.connectionFailureReason, that.connectionFailureReason)
            && Objects.equals(this.networkRtt, that.networkRtt) && Objects.equals(this.e2eRtt, that.e2eRtt)
            && Objects.equals(this.sourceIp, that.sourceIp) && Objects.equals(this.publicIp, that.publicIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            sid,
            transactionId,
            computerName,
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
            connectionFailureReason,
            networkRtt,
            e2eRtt,
            sourceIp,
            publicIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Record {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
        sb.append("    networkRtt: ").append(toIndentedString(networkRtt)).append("\n");
        sb.append("    e2eRtt: ").append(toIndentedString(e2eRtt)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
