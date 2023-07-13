package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScaleOutPolicyRsp
 */
public class ScaleOutPolicyRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_spec")

    private NodeSpecDto nodeSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private Integer nodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_nodes")

    private Integer maxNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_nodes")

    private Integer minNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_times")

    private Integer scalingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_enable")

    private Boolean scalingEnable;

    public ScaleOutPolicyRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScaleOutPolicyRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScaleOutPolicyRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScaleOutPolicyRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ScaleOutPolicyRsp withNodeSpec(NodeSpecDto nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public ScaleOutPolicyRsp withNodeSpec(Consumer<NodeSpecDto> nodeSpecSetter) {
        if (this.nodeSpec == null) {
            this.nodeSpec = new NodeSpecDto();
            nodeSpecSetter.accept(this.nodeSpec);
        }

        return this;
    }

    /**
     * Get nodeSpec
     * @return nodeSpec
     */
    public NodeSpecDto getNodeSpec() {
        return nodeSpec;
    }

    public void setNodeSpec(NodeSpecDto nodeSpec) {
        this.nodeSpec = nodeSpec;
    }

    public ScaleOutPolicyRsp withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ScaleOutPolicyRsp withNodes(Integer nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 节点数量
     * @return nodes
     */
    public Integer getNodes() {
        return nodes;
    }

    public void setNodes(Integer nodes) {
        this.nodes = nodes;
    }

    public ScaleOutPolicyRsp withMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * 扩容节点数上限
     * @return maxNodes
     */
    public Integer getMaxNodes() {
        return maxNodes;
    }

    public void setMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
    }

    public ScaleOutPolicyRsp withMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * 扩容节点数下限
     * @return minNodes
     */
    public Integer getMinNodes() {
        return minNodes;
    }

    public void setMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
    }

    public ScaleOutPolicyRsp withScalingTimes(Integer scalingTimes) {
        this.scalingTimes = scalingTimes;
        return this;
    }

    /**
     * 伸缩次数
     * @return scalingTimes
     */
    public Integer getScalingTimes() {
        return scalingTimes;
    }

    public void setScalingTimes(Integer scalingTimes) {
        this.scalingTimes = scalingTimes;
    }

    public ScaleOutPolicyRsp withScalingEnable(Boolean scalingEnable) {
        this.scalingEnable = scalingEnable;
        return this;
    }

    /**
     * 是否开启自动扩容
     * @return scalingEnable
     */
    public Boolean getScalingEnable() {
        return scalingEnable;
    }

    public void setScalingEnable(Boolean scalingEnable) {
        this.scalingEnable = scalingEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleOutPolicyRsp that = (ScaleOutPolicyRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.nodeSpec, that.nodeSpec)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.maxNodes, that.maxNodes) && Objects.equals(this.minNodes, that.minNodes)
            && Objects.equals(this.scalingTimes, that.scalingTimes)
            && Objects.equals(this.scalingEnable, that.scalingEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            createTime,
            nodeSpec,
            availabilityZone,
            nodes,
            maxNodes,
            minNodes,
            scalingTimes,
            scalingEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleOutPolicyRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    maxNodes: ").append(toIndentedString(maxNodes)).append("\n");
        sb.append("    minNodes: ").append(toIndentedString(minNodes)).append("\n");
        sb.append("    scalingTimes: ").append(toIndentedString(scalingTimes)).append("\n");
        sb.append("    scalingEnable: ").append(toIndentedString(scalingEnable)).append("\n");
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
