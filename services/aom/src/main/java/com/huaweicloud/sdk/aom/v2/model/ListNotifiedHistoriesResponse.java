package com.huaweicloud.sdk.aom.v2.model;

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
public class ListNotifiedHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sn")

    private String eventSn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifications")

    private List<Notifications> notifications = null;

    public ListNotifiedHistoriesResponse withEventSn(String eventSn) {
        this.eventSn = eventSn;
        return this;
    }

    /**
     * 告警流水号
     * @return eventSn
     */
    public String getEventSn() {
        return eventSn;
    }

    public void setEventSn(String eventSn) {
        this.eventSn = eventSn;
    }

    public ListNotifiedHistoriesResponse withNotifications(List<Notifications> notifications) {
        this.notifications = notifications;
        return this;
    }

    public ListNotifiedHistoriesResponse addNotificationsItem(Notifications notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public ListNotifiedHistoriesResponse withNotifications(Consumer<List<Notifications>> notificationsSetter) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    /**
     * 通知结果
     * @return notifications
     */
    public List<Notifications> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notifications> notifications) {
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
        ListNotifiedHistoriesResponse that = (ListNotifiedHistoriesResponse) obj;
        return Objects.equals(this.eventSn, that.eventSn) && Objects.equals(this.notifications, that.notifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSn, notifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifiedHistoriesResponse {\n");
        sb.append("    eventSn: ").append(toIndentedString(eventSn)).append("\n");
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
