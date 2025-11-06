package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlarmActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAlarmActionRequestBody body;

    public UpdateAlarmActionRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则ID， **约束限制**： 不涉及。 **取值范围**： 以al开头，后跟22位由字母或数字组成的字符串。长度为24个字符。 **默认取值**： 不涉及。 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateAlarmActionRequest withBody(UpdateAlarmActionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmActionRequest withBody(Consumer<UpdateAlarmActionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAlarmActionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAlarmActionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAlarmActionRequestBody body) {
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
        UpdateAlarmActionRequest that = (UpdateAlarmActionRequest) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmActionRequest {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
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
