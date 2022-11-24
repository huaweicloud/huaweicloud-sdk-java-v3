package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HttpQueryCfwAccessControllerLogsResponseDTODataRecords
 */
public class HttpQueryCfwAccessControllerLogsResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_time")

    private Integer hitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private String srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private String dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作0：permit,1：deny
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withHitTime(Integer hitTime) {
        this.hitTime = hitTime;
        return this;
    }

    /**
     * 命中时间
     * @return hitTime
     */
    public Integer getHitTime() {
        return hitTime;
    }

    public void setHitTime(Integer hitTime) {
        this.hitTime = hitTime;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 文档ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withSrcPort(String srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * @return srcPort
     */
    public String getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(String srcPort) {
        this.srcPort = srcPort;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * 目的IP
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * @return dstPort
     */
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6,UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HttpQueryCfwAccessControllerLogsResponseDTODataRecords withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用协议
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpQueryCfwAccessControllerLogsResponseDTODataRecords httpQueryCfwAccessControllerLogsResponseDTODataRecords =
            (HttpQueryCfwAccessControllerLogsResponseDTODataRecords) o;
        return Objects.equals(this.action, httpQueryCfwAccessControllerLogsResponseDTODataRecords.action)
            && Objects.equals(this.ruleName, httpQueryCfwAccessControllerLogsResponseDTODataRecords.ruleName)
            && Objects.equals(this.ruleId, httpQueryCfwAccessControllerLogsResponseDTODataRecords.ruleId)
            && Objects.equals(this.hitTime, httpQueryCfwAccessControllerLogsResponseDTODataRecords.hitTime)
            && Objects.equals(this.logId, httpQueryCfwAccessControllerLogsResponseDTODataRecords.logId)
            && Objects.equals(this.srcIp, httpQueryCfwAccessControllerLogsResponseDTODataRecords.srcIp)
            && Objects.equals(this.srcPort, httpQueryCfwAccessControllerLogsResponseDTODataRecords.srcPort)
            && Objects.equals(this.dstIp, httpQueryCfwAccessControllerLogsResponseDTODataRecords.dstIp)
            && Objects.equals(this.dstPort, httpQueryCfwAccessControllerLogsResponseDTODataRecords.dstPort)
            && Objects.equals(this.protocol, httpQueryCfwAccessControllerLogsResponseDTODataRecords.protocol)
            && Objects.equals(this.app, httpQueryCfwAccessControllerLogsResponseDTODataRecords.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, ruleName, ruleId, hitTime, logId, srcIp, srcPort, dstIp, dstPort, protocol, app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwAccessControllerLogsResponseDTODataRecords {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    hitTime: ").append(toIndentedString(hitTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
