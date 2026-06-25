package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订单关联的资源信息。
 */
public class OrderDetailItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beginTimestamp")

    private String beginTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public OrderDetailItem withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**：资源的ID，取值自资源详情的metadata.name字段。 **取值范围**：不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public OrderDetailItem withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：订单关联的资源变更动作类型。 **取值范围**：可选值如下： - createPool：创建资源池。 - deletePool：删除资源池。 - createNode：创建节点。 - deleteNode：删除节点，主要是包周期节点退订场景。 - renew：续费。 - toPeriodic：转包周期。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public OrderDetailItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：订单关联资源的变更状态。 **取值范围**：可选值如下： - processing：处理中，资源正在处理中。 - succeed：成功，资源处理成功。 - failed：失败，资源处理失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetailItem withBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }

    /**
     * **参数解释**：资源开始变更时间戳，形如1744285793000，单位毫秒。 **取值范围**：不涉及。
     * @return beginTimestamp
     */
    public String getBeginTimestamp() {
        return beginTimestamp;
    }

    public void setBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
    }

    public OrderDetailItem withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释**：资源变更最后更新时间戳，形如1744285793000，单位毫秒。 **取值范围**：不涉及。
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public OrderDetailItem withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：资源变更的执行信息，如失败原因。 **取值范围**：不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderDetailItem that = (OrderDetailItem) obj;
        return Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.action, that.action)
            && Objects.equals(this.status, that.status) && Objects.equals(this.beginTimestamp, that.beginTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, action, status, beginTimestamp, updateTimestamp, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDetailItem {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTimestamp: ").append(toIndentedString(beginTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
