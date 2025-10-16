package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchEnableAlarmPoliciesRequestBody
 */
public class BatchEnableAlarmPoliciesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_policy_ids")

    private List<String> alarmPolicyIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retain_when_all_disabled")

    private Boolean retainWhenAllDisabled;

    public BatchEnableAlarmPoliciesRequestBody withAlarmPolicyIds(List<String> alarmPolicyIds) {
        this.alarmPolicyIds = alarmPolicyIds;
        return this;
    }

    public BatchEnableAlarmPoliciesRequestBody addAlarmPolicyIdsItem(String alarmPolicyIdsItem) {
        if (this.alarmPolicyIds == null) {
            this.alarmPolicyIds = new ArrayList<>();
        }
        this.alarmPolicyIds.add(alarmPolicyIdsItem);
        return this;
    }

    public BatchEnableAlarmPoliciesRequestBody withAlarmPolicyIds(Consumer<List<String>> alarmPolicyIdsSetter) {
        if (this.alarmPolicyIds == null) {
            this.alarmPolicyIds = new ArrayList<>();
        }
        alarmPolicyIdsSetter.accept(this.alarmPolicyIds);
        return this;
    }

    /**
     * 需要批量启停的告警规则策略的ID列表
     * @return alarmPolicyIds
     */
    public List<String> getAlarmPolicyIds() {
        return alarmPolicyIds;
    }

    public void setAlarmPolicyIds(List<String> alarmPolicyIds) {
        this.alarmPolicyIds = alarmPolicyIds;
    }

    public BatchEnableAlarmPoliciesRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用告警策略。true:开启，false：关闭。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BatchEnableAlarmPoliciesRequestBody withRetainWhenAllDisabled(Boolean retainWhenAllDisabled) {
        this.retainWhenAllDisabled = retainWhenAllDisabled;
        return this;
    }

    /**
     * 告警中的策略全部被停用时是否保留策略信息。true:保留；false:删除。
     * @return retainWhenAllDisabled
     */
    public Boolean getRetainWhenAllDisabled() {
        return retainWhenAllDisabled;
    }

    public void setRetainWhenAllDisabled(Boolean retainWhenAllDisabled) {
        this.retainWhenAllDisabled = retainWhenAllDisabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchEnableAlarmPoliciesRequestBody that = (BatchEnableAlarmPoliciesRequestBody) obj;
        return Objects.equals(this.alarmPolicyIds, that.alarmPolicyIds) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.retainWhenAllDisabled, that.retainWhenAllDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmPolicyIds, enabled, retainWhenAllDisabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchEnableAlarmPoliciesRequestBody {\n");
        sb.append("    alarmPolicyIds: ").append(toIndentedString(alarmPolicyIds)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    retainWhenAllDisabled: ").append(toIndentedString(retainWhenAllDisabled)).append("\n");
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
