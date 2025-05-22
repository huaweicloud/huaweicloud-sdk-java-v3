package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点池自动伸缩相关配置
 */
public class NodePoolNodeAutoscaling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNodeCount")

    private Integer minNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNodeCount")

    private Integer maxNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownCooldownTime")

    private Integer scaleDownCooldownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownUnneededTime")

    private Integer scaleDownUnneededTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownUtilizationThreshold")

    private Float scaleDownUtilizationThreshold;

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

    public NodePoolNodeAutoscaling withScaleDownUnneededTime(Integer scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    /**
     * **参数解释**： 缩容非必要时间。单位为分钟，该参数用于指定在确定可以进行缩容操作之前，节点处于不需要状态的持续时间。 当节点在指定的这段时间内一直处于不需要的状态时，autoscaler 插件才会考虑对其进行缩容操作。 这样可以避免因资源的短暂波动而频繁触发缩容，增强系统的稳定性。如果未设置该参数，autoscaler 插件插件会使用默认的时间阈值。 **约束限制**： 不涉及 **取值范围**： 0-2147483647。 > 注意：如果传值为-1，代表取值为空。  **默认取值**： 默认为空
     * minimum: 0
     * maximum: 2147483647
     * @return scaleDownUnneededTime
     */
    public Integer getScaleDownUnneededTime() {
        return scaleDownUnneededTime;
    }

    public void setScaleDownUnneededTime(Integer scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
    }

    public NodePoolNodeAutoscaling withScaleDownUtilizationThreshold(Float scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    /**
     * **参数解释**： 缩容利用率阈值。运行在该节点上的所有 Pod 的 CPU 或内存总和除以该节点相应的可分配资源， 当该比值低于此阈值时，该节点可被考虑进行缩容。例如，设置为 0.3 表示当资源利用率低于 30% 时， 会触发缩容操作的评估。如果未设置该参数，autoscaler 插件会使用默认的利用率阈值。 **约束限制**： 不涉及 **取值范围**： 0-1。 > 注意：如果传值为-1，代表取值为空。  **默认取值**： 默认为空
     * minimum: 0
     * maximum: 1
     * @return scaleDownUtilizationThreshold
     */
    public Float getScaleDownUtilizationThreshold() {
        return scaleDownUtilizationThreshold;
    }

    public void setScaleDownUtilizationThreshold(Float scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolNodeAutoscaling that = (NodePoolNodeAutoscaling) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.minNodeCount, that.minNodeCount)
            && Objects.equals(this.maxNodeCount, that.maxNodeCount)
            && Objects.equals(this.scaleDownCooldownTime, that.scaleDownCooldownTime)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.scaleDownUnneededTime, that.scaleDownUnneededTime)
            && Objects.equals(this.scaleDownUtilizationThreshold, that.scaleDownUtilizationThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable,
            minNodeCount,
            maxNodeCount,
            scaleDownCooldownTime,
            priority,
            scaleDownUnneededTime,
            scaleDownUtilizationThreshold);
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
        sb.append("    scaleDownUnneededTime: ").append(toIndentedString(scaleDownUnneededTime)).append("\n");
        sb.append("    scaleDownUtilizationThreshold: ")
            .append(toIndentedString(scaleDownUtilizationThreshold))
            .append("\n");
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
