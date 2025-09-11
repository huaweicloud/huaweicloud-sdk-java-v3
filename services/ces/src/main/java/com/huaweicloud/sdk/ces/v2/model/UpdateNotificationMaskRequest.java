package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNotificationMaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_id")

    private String notificationMaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNotificationMasksRequestBody body;

    public UpdateNotificationMaskRequest withNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
        return this;
    }

    /**
     * **参数解释**： 屏蔽规则ID。    **约束限制**： 不涉及。 **取值范围**： 只能包含字母、数字，长度为[1,64]个字符。           **默认取值**： 不涉及。 
     * @return notificationMaskId
     */
    public String getNotificationMaskId() {
        return notificationMaskId;
    }

    public void setNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
    }

    public UpdateNotificationMaskRequest withBody(UpdateNotificationMasksRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNotificationMaskRequest withBody(Consumer<UpdateNotificationMasksRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNotificationMasksRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateNotificationMasksRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNotificationMasksRequestBody body) {
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
        UpdateNotificationMaskRequest that = (UpdateNotificationMaskRequest) obj;
        return Objects.equals(this.notificationMaskId, that.notificationMaskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationMaskRequest {\n");
        sb.append("    notificationMaskId: ").append(toIndentedString(notificationMaskId)).append("\n");
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
