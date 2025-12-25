package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 扩容/添加空闲节点操作请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ResizeClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out")

    private ScaleOut scaleOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_node_only")

    private Boolean createNodeOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_for_killing")

    private Integer waitingForKilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_redistribute")

    private Boolean autoRedistribute;

    public ResizeClusterRequestBody withScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
        return this;
    }

    public ResizeClusterRequestBody withScaleOut(Consumer<ScaleOut> scaleOutSetter) {
        if (this.scaleOut == null) {
            this.scaleOut = new ScaleOut();
            scaleOutSetter.accept(this.scaleOut);
        }

        return this;
    }

    /**
     * Get scaleOut
     * @return scaleOut
     */
    public ScaleOut getScaleOut() {
        return scaleOut;
    }

    public void setScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
    }

    public ResizeClusterRequestBody withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名字，扩容到逻辑集群时，需要填写。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public ResizeClusterRequestBody withCreateNodeOnly(Boolean createNodeOnly) {
        this.createNodeOnly = createNodeOnly;
        return this;
    }

    /**
     * **参数解释**： 当前是否仅添加空闲节点。 **约束限制**： 不涉及。 **取值范围**： true：仅添加节点，如需扩容则需要单独操作 false：添加节点并扩容集群 **默认取值**： false
     * @return createNodeOnly
     */
    public Boolean getCreateNodeOnly() {
        return createNodeOnly;
    }

    public void setCreateNodeOnly(Boolean createNodeOnly) {
        this.createNodeOnly = createNodeOnly;
    }

    public ResizeClusterRequestBody withWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
        return this;
    }

    /**
     * **参数解释**： 自动查杀作业等待时间。 **约束限制**： guestAgent插件版本8.2.1及以上才支持。 **取值范围**： 30~1200 **默认取值**： 0，即不限制。
     * @return waitingForKilling
     */
    public Integer getWaitingForKilling() {
        return waitingForKilling;
    }

    public void setWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
    }

    public ResizeClusterRequestBody withAutoRedistribute(Boolean autoRedistribute) {
        this.autoRedistribute = autoRedistribute;
        return this;
    }

    /**
     * **参数解释**： 扩容完成后是否自动启动重分布，默认是。如果设置为false，扩容后不进行重分布，此时集群任务信息处于“待重分布”状态，无法进行其他操作。 **约束限制**： 不涉及。 **取值范围**： - true：扩容后立即重分布。 - false：扩容后不进行重分布，此时集群任务信息处于“待重分布”状态。  **默认取值**： true
     * @return autoRedistribute
     */
    public Boolean getAutoRedistribute() {
        return autoRedistribute;
    }

    public void setAutoRedistribute(Boolean autoRedistribute) {
        this.autoRedistribute = autoRedistribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterRequestBody that = (ResizeClusterRequestBody) obj;
        return Objects.equals(this.scaleOut, that.scaleOut)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.createNodeOnly, that.createNodeOnly)
            && Objects.equals(this.waitingForKilling, that.waitingForKilling)
            && Objects.equals(this.autoRedistribute, that.autoRedistribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scaleOut, logicalClusterName, createNodeOnly, waitingForKilling, autoRedistribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterRequestBody {\n");
        sb.append("    scaleOut: ").append(toIndentedString(scaleOut)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    createNodeOnly: ").append(toIndentedString(createNodeOnly)).append("\n");
        sb.append("    waitingForKilling: ").append(toIndentedString(waitingForKilling)).append("\n");
        sb.append("    autoRedistribute: ").append(toIndentedString(autoRedistribute)).append("\n");
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
