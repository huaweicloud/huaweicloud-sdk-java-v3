package com.huaweicloud.sdk.rds.v3.model;

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
public class ListUpdateBackupEnhancePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_backup_retention_days")

    private String manualBackupRetentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<Policy> policies = null;

    public ListUpdateBackupEnhancePolicyResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 备份时间段开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListUpdateBackupEnhancePolicyResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 备份时间段结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListUpdateBackupEnhancePolicyResponse withManualBackupRetentionDays(String manualBackupRetentionDays) {
        this.manualBackupRetentionDays = manualBackupRetentionDays;
        return this;
    }

    /**
     * 手动备份保留时长
     * @return manualBackupRetentionDays
     */
    public String getManualBackupRetentionDays() {
        return manualBackupRetentionDays;
    }

    public void setManualBackupRetentionDays(String manualBackupRetentionDays) {
        this.manualBackupRetentionDays = manualBackupRetentionDays;
    }

    public ListUpdateBackupEnhancePolicyResponse withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 高频备份的频率
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public ListUpdateBackupEnhancePolicyResponse withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public ListUpdateBackupEnhancePolicyResponse addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListUpdateBackupEnhancePolicyResponse withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 备份策略集
     * @return policies
     */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUpdateBackupEnhancePolicyResponse that = (ListUpdateBackupEnhancePolicyResponse) obj;
        return Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.manualBackupRetentionDays, that.manualBackupRetentionDays)
            && Objects.equals(this.frequency, that.frequency) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime, endTime, manualBackupRetentionDays, frequency, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpdateBackupEnhancePolicyResponse {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    manualBackupRetentionDays: ").append(toIndentedString(manualBackupRetentionDays)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
