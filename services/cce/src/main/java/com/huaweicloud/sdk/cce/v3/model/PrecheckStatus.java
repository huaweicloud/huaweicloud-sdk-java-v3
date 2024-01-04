package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级前检查状态
 */
public class PrecheckStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTimeStamp")

    private String expireTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterCheckStatus")

    private ClusterCheckStatus clusterCheckStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonCheckStatus")

    private AddonCheckStatus addonCheckStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeCheckStatus")

    private NodeCheckStatus nodeCheckStatus;

    public PrecheckStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 状态，取值如下 - Init: 初始化 - Running 运行中 - Success 成功 - Failed 失败 - Error 错误
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PrecheckStatus withExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }

    /**
     * 检查结果过期时间
     * @return expireTimeStamp
     */
    public String getExpireTimeStamp() {
        return expireTimeStamp;
    }

    public void setExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
    }

    public PrecheckStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息，一般是执行错误的日志信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PrecheckStatus withClusterCheckStatus(ClusterCheckStatus clusterCheckStatus) {
        this.clusterCheckStatus = clusterCheckStatus;
        return this;
    }

    public PrecheckStatus withClusterCheckStatus(Consumer<ClusterCheckStatus> clusterCheckStatusSetter) {
        if (this.clusterCheckStatus == null) {
            this.clusterCheckStatus = new ClusterCheckStatus();
            clusterCheckStatusSetter.accept(this.clusterCheckStatus);
        }

        return this;
    }

    /**
     * Get clusterCheckStatus
     * @return clusterCheckStatus
     */
    public ClusterCheckStatus getClusterCheckStatus() {
        return clusterCheckStatus;
    }

    public void setClusterCheckStatus(ClusterCheckStatus clusterCheckStatus) {
        this.clusterCheckStatus = clusterCheckStatus;
    }

    public PrecheckStatus withAddonCheckStatus(AddonCheckStatus addonCheckStatus) {
        this.addonCheckStatus = addonCheckStatus;
        return this;
    }

    public PrecheckStatus withAddonCheckStatus(Consumer<AddonCheckStatus> addonCheckStatusSetter) {
        if (this.addonCheckStatus == null) {
            this.addonCheckStatus = new AddonCheckStatus();
            addonCheckStatusSetter.accept(this.addonCheckStatus);
        }

        return this;
    }

    /**
     * Get addonCheckStatus
     * @return addonCheckStatus
     */
    public AddonCheckStatus getAddonCheckStatus() {
        return addonCheckStatus;
    }

    public void setAddonCheckStatus(AddonCheckStatus addonCheckStatus) {
        this.addonCheckStatus = addonCheckStatus;
    }

    public PrecheckStatus withNodeCheckStatus(NodeCheckStatus nodeCheckStatus) {
        this.nodeCheckStatus = nodeCheckStatus;
        return this;
    }

    public PrecheckStatus withNodeCheckStatus(Consumer<NodeCheckStatus> nodeCheckStatusSetter) {
        if (this.nodeCheckStatus == null) {
            this.nodeCheckStatus = new NodeCheckStatus();
            nodeCheckStatusSetter.accept(this.nodeCheckStatus);
        }

        return this;
    }

    /**
     * Get nodeCheckStatus
     * @return nodeCheckStatus
     */
    public NodeCheckStatus getNodeCheckStatus() {
        return nodeCheckStatus;
    }

    public void setNodeCheckStatus(NodeCheckStatus nodeCheckStatus) {
        this.nodeCheckStatus = nodeCheckStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrecheckStatus that = (PrecheckStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.expireTimeStamp, that.expireTimeStamp)
            && Objects.equals(this.message, that.message)
            && Objects.equals(this.clusterCheckStatus, that.clusterCheckStatus)
            && Objects.equals(this.addonCheckStatus, that.addonCheckStatus)
            && Objects.equals(this.nodeCheckStatus, that.nodeCheckStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, expireTimeStamp, message, clusterCheckStatus, addonCheckStatus, nodeCheckStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    expireTimeStamp: ").append(toIndentedString(expireTimeStamp)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    clusterCheckStatus: ").append(toIndentedString(clusterCheckStatus)).append("\n");
        sb.append("    addonCheckStatus: ").append(toIndentedString(addonCheckStatus)).append("\n");
        sb.append("    nodeCheckStatus: ").append(toIndentedString(nodeCheckStatus)).append("\n");
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
