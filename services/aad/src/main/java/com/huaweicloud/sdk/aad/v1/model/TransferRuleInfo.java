package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TransferRuleInfo
 */
public class TransferRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_protocol")

    private String forwardProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_port")

    private Integer forwardPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private Integer sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_method")

    private String lbMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public TransferRuleInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 转发规则名ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public TransferRuleInfo withForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }

    /**
     * 转发协议，tcp或udp
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return forwardProtocol;
    }

    public void setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
    }

    public TransferRuleInfo withForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }

    /**
     * 转发端口
     * minimum: 1
     * maximum: 65536
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return forwardPort;
    }

    public void setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
    }

    public TransferRuleInfo withSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源站端口
     * minimum: 1
     * maximum: 65536
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
    }

    public TransferRuleInfo withLbMethod(String lbMethod) {
        this.lbMethod = lbMethod;
        return this;
    }

    /**
     * LVS转发规则
     * @return lbMethod
     */
    public String getLbMethod() {
        return lbMethod;
    }

    public void setLbMethod(String lbMethod) {
        this.lbMethod = lbMethod;
    }

    public TransferRuleInfo withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 源站IP，多个IP用逗号隔开，限制20个IP
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public TransferRuleInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 源站状态 1 正常，2 异常
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferRuleInfo that = (TransferRuleInfo) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.forwardProtocol, that.forwardProtocol)
            && Objects.equals(this.forwardPort, that.forwardPort) && Objects.equals(this.sourcePort, that.sourcePort)
            && Objects.equals(this.lbMethod, that.lbMethod) && Objects.equals(this.sourceIp, that.sourceIp)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, forwardProtocol, forwardPort, sourcePort, lbMethod, sourceIp, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferRuleInfo {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    forwardProtocol: ").append(toIndentedString(forwardProtocol)).append("\n");
        sb.append("    forwardPort: ").append(toIndentedString(forwardPort)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    lbMethod: ").append(toIndentedString(lbMethod)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
