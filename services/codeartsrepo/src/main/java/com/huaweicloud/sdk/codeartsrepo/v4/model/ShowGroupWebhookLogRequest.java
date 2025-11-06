package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowGroupWebhookLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private Integer hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private Integer logId;

    public ShowGroupWebhookLogRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public ShowGroupWebhookLogRequest withHookId(Integer hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * **参数解释：**  Webhook id。
     * minimum: 1
     * maximum: 2147483647
     * @return hookId
     */
    public Integer getHookId() {
        return hookId;
    }

    public void setHookId(Integer hookId) {
        this.hookId = hookId;
    }

    public ShowGroupWebhookLogRequest withLogId(Integer logId) {
        this.logId = logId;
        return this;
    }

    /**
     * **参数解释：**  Webhook 日志id。
     * minimum: 1
     * maximum: 2147483647
     * @return logId
     */
    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupWebhookLogRequest that = (ShowGroupWebhookLogRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.logId, that.logId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, hookId, logId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupWebhookLogRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
