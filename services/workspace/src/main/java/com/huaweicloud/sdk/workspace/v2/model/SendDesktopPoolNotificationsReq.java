package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发送桌面池消息通知请求体
 */
public class SendDesktopPoolNotificationsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifications")

    private String notifications;

    public SendDesktopPoolNotificationsReq withNotifications(String notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * 消息通知内容
     * @return notifications
     */
    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendDesktopPoolNotificationsReq that = (SendDesktopPoolNotificationsReq) obj;
        return Objects.equals(this.notifications, that.notifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendDesktopPoolNotificationsReq {\n");
        sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
