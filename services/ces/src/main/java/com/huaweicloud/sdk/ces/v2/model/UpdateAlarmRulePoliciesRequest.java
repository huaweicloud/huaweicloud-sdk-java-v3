package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlarmRulePoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAlarmRulePoliciesReqBodyV2 body;

    public UpdateAlarmRulePoliciesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则ID。 **约束限制**： 不涉及。 **取值范围**： 以al开头，只能由大写字母、小写字母、数字组成，且长度为24个字符。           **默认取值**： 不涉及。 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateAlarmRulePoliciesRequest withBody(UpdateAlarmRulePoliciesReqBodyV2 body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmRulePoliciesRequest withBody(Consumer<UpdateAlarmRulePoliciesReqBodyV2> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAlarmRulePoliciesReqBodyV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAlarmRulePoliciesReqBodyV2 getBody() {
        return body;
    }

    public void setBody(UpdateAlarmRulePoliciesReqBodyV2 body) {
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
        UpdateAlarmRulePoliciesRequest that = (UpdateAlarmRulePoliciesRequest) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmRulePoliciesRequest {\n");
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
