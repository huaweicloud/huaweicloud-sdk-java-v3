package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TransferRuleBody
 */
public class TransferRuleBody {

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
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    public TransferRuleBody withForwardProtocol(String forwardProtocol) {
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

    public TransferRuleBody withForwardPort(Integer forwardPort) {
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

    public TransferRuleBody withSourcePort(Integer sourcePort) {
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

    public TransferRuleBody withSourceIp(String sourceIp) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferRuleBody that = (TransferRuleBody) obj;
        return Objects.equals(this.forwardProtocol, that.forwardProtocol)
            && Objects.equals(this.forwardPort, that.forwardPort) && Objects.equals(this.sourcePort, that.sourcePort)
            && Objects.equals(this.sourceIp, that.sourceIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forwardProtocol, forwardPort, sourcePort, sourceIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferRuleBody {\n");
        sb.append("    forwardProtocol: ").append(toIndentedString(forwardProtocol)).append("\n");
        sb.append("    forwardPort: ").append(toIndentedString(forwardPort)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
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
