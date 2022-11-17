package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleServiceDto
 */
public class RuleServiceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_id")

    private String serviceSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_name")

    private String serviceSetName;

    public RuleServiceDto withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 服务输入类型，0为手动输入类型，1为自动输入类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public RuleServiceDto withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public RuleServiceDto withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源端口
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public RuleServiceDto withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public RuleServiceDto withServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
        return this;
    }

    /**
     * 服务组id，手动类型为空，自动类型为非空
     * @return serviceSetId
     */
    public String getServiceSetId() {
        return serviceSetId;
    }

    public void setServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
    }

    public RuleServiceDto withServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
        return this;
    }

    /**
     * 服务组名称
     * @return serviceSetName
     */
    public String getServiceSetName() {
        return serviceSetName;
    }

    public void setServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleServiceDto ruleServiceDto = (RuleServiceDto) o;
        return Objects.equals(this.type, ruleServiceDto.type) && Objects.equals(this.protocol, ruleServiceDto.protocol)
            && Objects.equals(this.sourcePort, ruleServiceDto.sourcePort)
            && Objects.equals(this.destPort, ruleServiceDto.destPort)
            && Objects.equals(this.serviceSetId, ruleServiceDto.serviceSetId)
            && Objects.equals(this.serviceSetName, ruleServiceDto.serviceSetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, protocol, sourcePort, destPort, serviceSetId, serviceSetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleServiceDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    serviceSetId: ").append(toIndentedString(serviceSetId)).append("\n");
        sb.append("    serviceSetName: ").append(toIndentedString(serviceSetName)).append("\n");
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
