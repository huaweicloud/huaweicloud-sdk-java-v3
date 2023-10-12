package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class UpdateTrafficMirrorFilterRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethertype")

    private String ethertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cidr_block")

    private String sourceCidrBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_cidr_block")

    private String destinationCidrBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port_range")

    private String sourcePortRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_port_range")

    private String destinationPortRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public UpdateTrafficMirrorFilterRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：流量镜像筛选规则的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTrafficMirrorFilterRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 功能说明：镜像流量的协议类型 取值范围：TCP、UDP、ICMP、ICMPV6、ALL
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public UpdateTrafficMirrorFilterRuleOption withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    /**
     * 功能说明：镜像流量的地址协议版本 取值范围：IPv4，IPv6
     * @return ethertype
     */
    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    public UpdateTrafficMirrorFilterRuleOption withSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }

    /**
     * 功能说明：镜像流量的源网段
     * @return sourceCidrBlock
     */
    public String getSourceCidrBlock() {
        return sourceCidrBlock;
    }

    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleOption withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * 功能说明：镜像流量的目的网段
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleOption withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * 功能说明：流量源端口范围 取值范围：1~65535 格式：80-200
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return sourcePortRange;
    }

    public void setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    public UpdateTrafficMirrorFilterRuleOption withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * 功能说明：流量目的端口范围 取值范围：1~65535 格式：80-200
     * @return destinationPortRange
     */
    public String getDestinationPortRange() {
        return destinationPortRange;
    }

    public void setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    public UpdateTrafficMirrorFilterRuleOption withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 功能说明：镜像规则优先级 取值范围：1~65535，数字越小，优先级越高
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public UpdateTrafficMirrorFilterRuleOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 功能说明：镜像策略 取值范围：accept（采集）、reject（不采集）
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorFilterRuleOption that = (UpdateTrafficMirrorFilterRuleOption) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.ethertype, that.ethertype)
            && Objects.equals(this.sourceCidrBlock, that.sourceCidrBlock)
            && Objects.equals(this.destinationCidrBlock, that.destinationCidrBlock)
            && Objects.equals(this.sourcePortRange, that.sourcePortRange)
            && Objects.equals(this.destinationPortRange, that.destinationPortRange)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            protocol,
            ethertype,
            sourceCidrBlock,
            destinationCidrBlock,
            sourcePortRange,
            destinationPortRange,
            priority,
            action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorFilterRuleOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    sourceCidrBlock: ").append(toIndentedString(sourceCidrBlock)).append("\n");
        sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
        sb.append("    sourcePortRange: ").append(toIndentedString(sourcePortRange)).append("\n");
        sb.append("    destinationPortRange: ").append(toIndentedString(destinationPortRange)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
