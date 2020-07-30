package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Notification;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NotificationConfigReq
 */
public class NotificationConfigReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notifications")
    
    private List<Notification> notifications = null;
    
    public NotificationConfigReq withNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    
    public NotificationConfigReq addNotificationsItem(Notification notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public NotificationConfigReq withNotifications(Consumer<List<Notification>> notificationsSetter) {
        if(this.notifications == null ){
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    /**
     * 事件通知模板信息 
     * @return notifications
     */
    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationConfigReq notificationConfigReq = (NotificationConfigReq) o;
        return Objects.equals(this.notifications, notificationConfigReq.notifications);
    }
    @Override
    public int hashCode() {
        return Objects.hash(notifications);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationConfigReq {\n");
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

