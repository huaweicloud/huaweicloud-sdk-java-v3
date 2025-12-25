package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchUpdateOneClickAlarmPoliciesEnabledStateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_id")

    private String oneClickAlarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchEnableAlarmPoliciesRequestBody body;

    public BatchUpdateOneClickAlarmPoliciesEnabledStateRequest withOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
        return this;
    }

    /**
     * **参数解释** 一键告警ID **约束限制** 不涉及 **取值范围** 长度为1到64字符，只能包含字母数字 **默认取值** 不涉及 
     * @return oneClickAlarmId
     */
    public String getOneClickAlarmId() {
        return oneClickAlarmId;
    }

    public void setOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
    }

    public BatchUpdateOneClickAlarmPoliciesEnabledStateRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释** 告警规则ID **约束限制** 不涉及 **取值范围** 以al开头，后跟22个数字或字母。 **默认取值** 不涉及 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public BatchUpdateOneClickAlarmPoliciesEnabledStateRequest withBody(BatchEnableAlarmPoliciesRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateOneClickAlarmPoliciesEnabledStateRequest withBody(
        Consumer<BatchEnableAlarmPoliciesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchEnableAlarmPoliciesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchEnableAlarmPoliciesRequestBody getBody() {
        return body;
    }

    public void setBody(BatchEnableAlarmPoliciesRequestBody body) {
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
        BatchUpdateOneClickAlarmPoliciesEnabledStateRequest that =
            (BatchUpdateOneClickAlarmPoliciesEnabledStateRequest) obj;
        return Objects.equals(this.oneClickAlarmId, that.oneClickAlarmId) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmId, alarmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateOneClickAlarmPoliciesEnabledStateRequest {\n");
        sb.append("    oneClickAlarmId: ").append(toIndentedString(oneClickAlarmId)).append("\n");
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
