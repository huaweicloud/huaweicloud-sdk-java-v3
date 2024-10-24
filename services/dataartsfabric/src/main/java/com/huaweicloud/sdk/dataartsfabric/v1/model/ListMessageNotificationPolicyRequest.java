package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMessageNotificationPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    private String messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_pattern")

    private String namePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_type")

    private String notifyType;

    public ListMessageNotificationPolicyRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Workspace的ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListMessageNotificationPolicyRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0，默认为0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListMessageNotificationPolicyRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定每一页返回的最大条目数，取值范围[1,100]，默认为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMessageNotificationPolicyRequest withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消息类型。job:任务执行结果消息。
     * @return messageType
     */
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public ListMessageNotificationPolicyRequest withNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * 名称样式。支持模糊匹配，区分大小写
     * @return namePattern
     */
    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    public ListMessageNotificationPolicyRequest withNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }

    /**
     * 消息类型。SUCCESS:成功通知；FAILED：失败通知
     * @return notifyType
     */
    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMessageNotificationPolicyRequest that = (ListMessageNotificationPolicyRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.messageType, that.messageType)
            && Objects.equals(this.namePattern, that.namePattern) && Objects.equals(this.notifyType, that.notifyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, offset, limit, messageType, namePattern, notifyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageNotificationPolicyRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
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
