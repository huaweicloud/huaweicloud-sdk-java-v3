package com.huaweicloud.sdk.ces.v2.model;

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
public class UpdateAlarmNotificationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enabled")

    private Boolean notificationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notifications")

    private List<NotificationResp> alarmNotifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_notifications")

    private List<NotificationResp> okNotifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_begin_time")

    private String notificationBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_end_time")

    private String notificationEndTime;

    public UpdateAlarmNotificationsResponse withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否开启告警通知。     **取值范围**： 布尔值。 - true:开启。 - false:关闭。 
     * @return notificationEnabled
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public UpdateAlarmNotificationsResponse withAlarmNotifications(List<NotificationResp> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public UpdateAlarmNotificationsResponse addAlarmNotificationsItem(NotificationResp alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public UpdateAlarmNotificationsResponse withAlarmNotifications(
        Consumer<List<NotificationResp>> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        alarmNotificationsSetter.accept(this.alarmNotifications);
        return this;
    }

    /**
     * **参数解释**： 触发告警时，通知组/主题订阅的信息。 
     * @return alarmNotifications
     */
    public List<NotificationResp> getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(List<NotificationResp> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public UpdateAlarmNotificationsResponse withOkNotifications(List<NotificationResp> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public UpdateAlarmNotificationsResponse addOkNotificationsItem(NotificationResp okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public UpdateAlarmNotificationsResponse withOkNotifications(
        Consumer<List<NotificationResp>> okNotificationsSetter) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        okNotificationsSetter.accept(this.okNotifications);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。 
     * @return okNotifications
     */
    public List<NotificationResp> getOkNotifications() {
        return okNotifications;
    }

    public void setOkNotifications(List<NotificationResp> okNotifications) {
        this.okNotifications = okNotifications;
    }

    public UpdateAlarmNotificationsResponse withNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知开启时间。    **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return notificationBeginTime
     */
    public String getNotificationBeginTime() {
        return notificationBeginTime;
    }

    public void setNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
    }

    public UpdateAlarmNotificationsResponse withNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知关闭时间。    **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return notificationEndTime
     */
    public String getNotificationEndTime() {
        return notificationEndTime;
    }

    public void setNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlarmNotificationsResponse that = (UpdateAlarmNotificationsResponse) obj;
        return Objects.equals(this.notificationEnabled, that.notificationEnabled)
            && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.okNotifications, that.okNotifications)
            && Objects.equals(this.notificationBeginTime, that.notificationBeginTime)
            && Objects.equals(this.notificationEndTime, that.notificationEndTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(notificationEnabled, alarmNotifications, okNotifications, notificationBeginTime, notificationEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmNotificationsResponse {\n");
        sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    okNotifications: ").append(toIndentedString(okNotifications)).append("\n");
        sb.append("    notificationBeginTime: ").append(toIndentedString(notificationBeginTime)).append("\n");
        sb.append("    notificationEndTime: ").append(toIndentedString(notificationEndTime)).append("\n");
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
