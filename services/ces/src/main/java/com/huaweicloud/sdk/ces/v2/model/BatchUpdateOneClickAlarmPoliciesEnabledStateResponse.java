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
public class BatchUpdateOneClickAlarmPoliciesEnabledStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_policy_ids")

    private List<String> alarmPolicyIds = null;

    public BatchUpdateOneClickAlarmPoliciesEnabledStateResponse withAlarmPolicyIds(List<String> alarmPolicyIds) {
        this.alarmPolicyIds = alarmPolicyIds;
        return this;
    }

    public BatchUpdateOneClickAlarmPoliciesEnabledStateResponse addAlarmPolicyIdsItem(String alarmPolicyIdsItem) {
        if (this.alarmPolicyIds == null) {
            this.alarmPolicyIds = new ArrayList<>();
        }
        this.alarmPolicyIds.add(alarmPolicyIdsItem);
        return this;
    }

    public BatchUpdateOneClickAlarmPoliciesEnabledStateResponse withAlarmPolicyIds(
        Consumer<List<String>> alarmPolicyIdsSetter) {
        if (this.alarmPolicyIds == null) {
            this.alarmPolicyIds = new ArrayList<>();
        }
        alarmPolicyIdsSetter.accept(this.alarmPolicyIds);
        return this;
    }

    /**
     * 成功启停的告警规则策略ID列表
     * @return alarmPolicyIds
     */
    public List<String> getAlarmPolicyIds() {
        return alarmPolicyIds;
    }

    public void setAlarmPolicyIds(List<String> alarmPolicyIds) {
        this.alarmPolicyIds = alarmPolicyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateOneClickAlarmPoliciesEnabledStateResponse that =
            (BatchUpdateOneClickAlarmPoliciesEnabledStateResponse) obj;
        return Objects.equals(this.alarmPolicyIds, that.alarmPolicyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmPolicyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateOneClickAlarmPoliciesEnabledStateResponse {\n");
        sb.append("    alarmPolicyIds: ").append(toIndentedString(alarmPolicyIds)).append("\n");
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
