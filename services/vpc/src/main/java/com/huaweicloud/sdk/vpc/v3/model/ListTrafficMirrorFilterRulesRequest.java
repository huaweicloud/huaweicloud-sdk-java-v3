package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTrafficMirrorFilterRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_id")

    private String trafficMirrorFilterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

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
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    public ListTrafficMirrorFilterRulesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 使用规则ID过滤或排序
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListTrafficMirrorFilterRulesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 使用规则描述过滤
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListTrafficMirrorFilterRulesRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * 使用筛选条件ID过滤
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    public ListTrafficMirrorFilterRulesRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 使用规则方向过滤
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListTrafficMirrorFilterRulesRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 使用规则协议过滤
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListTrafficMirrorFilterRulesRequest withSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }

    /**
     * 使用规则源网段过滤
     * @return sourceCidrBlock
     */
    public String getSourceCidrBlock() {
        return sourceCidrBlock;
    }

    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    public ListTrafficMirrorFilterRulesRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * 使用规则目的网段过滤
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public ListTrafficMirrorFilterRulesRequest withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * 使用规则源端口范围过滤
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return sourcePortRange;
    }

    public void setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    public ListTrafficMirrorFilterRulesRequest withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * 使用规则目的端口范围过滤
     * @return destinationPortRange
     */
    public String getDestinationPortRange() {
        return destinationPortRange;
    }

    public void setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    public ListTrafficMirrorFilterRulesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 使用规则action过滤
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListTrafficMirrorFilterRulesRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 使用规则优先级过滤
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrafficMirrorFilterRulesRequest that = (ListTrafficMirrorFilterRulesRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sourceCidrBlock, that.sourceCidrBlock)
            && Objects.equals(this.destinationCidrBlock, that.destinationCidrBlock)
            && Objects.equals(this.sourcePortRange, that.sourcePortRange)
            && Objects.equals(this.destinationPortRange, that.destinationPortRange)
            && Objects.equals(this.action, that.action) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            trafficMirrorFilterId,
            direction,
            protocol,
            sourceCidrBlock,
            destinationCidrBlock,
            sourcePortRange,
            destinationPortRange,
            action,
            priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrafficMirrorFilterRulesRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourceCidrBlock: ").append(toIndentedString(sourceCidrBlock)).append("\n");
        sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
        sb.append("    sourcePortRange: ").append(toIndentedString(sourcePortRange)).append("\n");
        sb.append("    destinationPortRange: ").append(toIndentedString(destinationPortRange)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
