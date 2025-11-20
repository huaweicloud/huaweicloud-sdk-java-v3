package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNotificationSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_setting_id")

    private String notificationSettingId;

    public DeleteNotificationSettingRequest withNotificationSettingId(String notificationSettingId) {
        this.notificationSettingId = notificationSettingId;
        return this;
    }

    /**
     * 消息通知配置的唯一标识符。
     * @return notificationSettingId
     */
    public String getNotificationSettingId() {
        return notificationSettingId;
    }

    public void setNotificationSettingId(String notificationSettingId) {
        this.notificationSettingId = notificationSettingId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNotificationSettingRequest that = (DeleteNotificationSettingRequest) obj;
        return Objects.equals(this.notificationSettingId, that.notificationSettingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationSettingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNotificationSettingRequest {\n");
        sb.append("    notificationSettingId: ").append(toIndentedString(notificationSettingId)).append("\n");
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
