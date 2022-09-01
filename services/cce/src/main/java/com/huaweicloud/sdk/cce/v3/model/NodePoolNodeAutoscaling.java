package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 节点池自动伸缩相关配置
 */
public class NodePoolNodeAutoscaling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    @JacksonXmlProperty(localName = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNodeCount")

    @JacksonXmlProperty(localName = "minNodeCount")

    private Integer minNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNodeCount")

    @JacksonXmlProperty(localName = "maxNodeCount")

    private Integer maxNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownCooldownTime")

    @JacksonXmlProperty(localName = "scaleDownCooldownTime")

    private Integer scaleDownCooldownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    @JacksonXmlProperty(localName = "priority")

    private Integer priority;

    public NodePoolNodeAutoscaling withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启自动扩缩容
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public NodePoolNodeAutoscaling withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * 若开启自动扩缩容，最小能缩容的节点个数。不可大于集群规格所允许的节点上限
     * minimum: 0
     * @return minNodeCount
     */
    public Integer getMinNodeCount() {
        return minNodeCount;
    }

    public void setMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
    }

    public NodePoolNodeAutoscaling withMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    /**
     * 若开启自动扩缩容，最大能扩容的节点个数，应大于等于 minNodeCount，且不超过集群规格对应的节点数量上限。
     * minimum: 0
     * @return maxNodeCount
     */
    public Integer getMaxNodeCount() {
        return maxNodeCount;
    }

    public void setMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    public NodePoolNodeAutoscaling withScaleDownCooldownTime(Integer scaleDownCooldownTime) {
        this.scaleDownCooldownTime = scaleDownCooldownTime;
        return this;
    }

    /**
     * 节点保留时间，单位为分钟，扩容出来的节点在这个时间内不会被缩掉
     * minimum: 0
     * maximum: 2147483647
     * @return scaleDownCooldownTime
     */
    public Integer getScaleDownCooldownTime() {
        return scaleDownCooldownTime;
    }

    public void setScaleDownCooldownTime(Integer scaleDownCooldownTime) {
        this.scaleDownCooldownTime = scaleDownCooldownTime;
    }

    public NodePoolNodeAutoscaling withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 节点池权重，更高的权重在扩容时拥有更高的优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePoolNodeAutoscaling nodePoolNodeAutoscaling = (NodePoolNodeAutoscaling) o;
        return Objects.equals(this.enable, nodePoolNodeAutoscaling.enable)
            && Objects.equals(this.minNodeCount, nodePoolNodeAutoscaling.minNodeCount)
            && Objects.equals(this.maxNodeCount, nodePoolNodeAutoscaling.maxNodeCount)
            && Objects.equals(this.scaleDownCooldownTime, nodePoolNodeAutoscaling.scaleDownCooldownTime)
            && Objects.equals(this.priority, nodePoolNodeAutoscaling.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, minNodeCount, maxNodeCount, scaleDownCooldownTime, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolNodeAutoscaling {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    minNodeCount: ").append(toIndentedString(minNodeCount)).append("\n");
        sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
        sb.append("    scaleDownCooldownTime: ").append(toIndentedString(scaleDownCooldownTime)).append("\n");
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
