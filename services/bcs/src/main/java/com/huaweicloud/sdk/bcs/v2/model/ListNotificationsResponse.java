package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNotificationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifications")

    private List<NotificationList> notifications = null;

    public ListNotificationsResponse withNotifications(List<NotificationList> notifications) {
        this.notifications = notifications;
        return this;
    }

    public ListNotificationsResponse addNotificationsItem(NotificationList notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public ListNotificationsResponse withNotifications(Consumer<List<NotificationList>> notificationsSetter) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    /**
     * 通知列表
     * @return notifications
     */
    public List<NotificationList> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationList> notifications) {
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
        ListNotificationsResponse that = (ListNotificationsResponse) obj;
        return Objects.equals(this.notifications, that.notifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationsResponse {\n");
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
