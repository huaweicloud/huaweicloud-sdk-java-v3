package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RetryUpgradeTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_mode")

    private String retryMode;

    public RetryUpgradeTaskRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 待重试的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RetryUpgradeTaskRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 待重试的任务ID。
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public RetryUpgradeTaskRequest withRetryMode(String retryMode) {
        this.retryMode = retryMode;
        return this;
    }

    /**
     * 当该参数不为空时，终止该任务的影响。当前仅支持abort。
     * @return retryMode
     */
    public String getRetryMode() {
        return retryMode;
    }

    public void setRetryMode(String retryMode) {
        this.retryMode = retryMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryUpgradeTaskRequest that = (RetryUpgradeTaskRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.retryMode, that.retryMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, actionId, retryMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryUpgradeTaskRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    retryMode: ").append(toIndentedString(retryMode)).append("\n");
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
