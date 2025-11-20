package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNotificationSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_setting_id")

    private String notificationSettingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNotificationSettingReqBody body;

    public UpdateNotificationSettingRequest withNotificationSettingId(String notificationSettingId) {
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

    public UpdateNotificationSettingRequest withBody(UpdateNotificationSettingReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateNotificationSettingRequest withBody(Consumer<UpdateNotificationSettingReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNotificationSettingReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateNotificationSettingReqBody getBody() {
        return body;
    }

    public void setBody(UpdateNotificationSettingReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNotificationSettingRequest that = (UpdateNotificationSettingRequest) obj;
        return Objects.equals(this.notificationSettingId, that.notificationSettingId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationSettingId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationSettingRequest {\n");
        sb.append("    notificationSettingId: ").append(toIndentedString(notificationSettingId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
