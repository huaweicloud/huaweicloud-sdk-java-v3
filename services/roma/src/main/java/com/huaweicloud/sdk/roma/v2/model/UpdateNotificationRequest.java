package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNotificationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_id")

    private Long notificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNotificationRequestBody body;

    public UpdateNotificationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateNotificationRequest withNotificationId(Long notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * 订阅管理ID
     * minimum: 0
     * maximum: 99999999999999999
     * @return notificationId
     */
    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public UpdateNotificationRequest withBody(UpdateNotificationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNotificationRequest withBody(Consumer<UpdateNotificationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNotificationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateNotificationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNotificationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNotificationRequest updateNotificationRequest = (UpdateNotificationRequest) o;
        return Objects.equals(this.instanceId, updateNotificationRequest.instanceId)
            && Objects.equals(this.notificationId, updateNotificationRequest.notificationId)
            && Objects.equals(this.body, updateNotificationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, notificationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
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
