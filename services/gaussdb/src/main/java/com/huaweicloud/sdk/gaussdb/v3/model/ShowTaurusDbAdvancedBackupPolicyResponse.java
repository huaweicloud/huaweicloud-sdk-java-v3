package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowTaurusDbAdvancedBackupPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_num_backup_level1")

    private Integer retentionNumBackupLevel1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<BackupPolicyInfo> policies = null;

    public ShowTaurusDbAdvancedBackupPolicyResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段开始时间。  **取值范围**：  非空，格式必须为hh:mm且有效，当前时间指UTC时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowTaurusDbAdvancedBackupPolicyResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段结束时间。  **取值范围**：  非空，格式必须为hh:mm且有效，当前时间指UTC时间。end_time必须大于begin_time。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowTaurusDbAdvancedBackupPolicyResponse withRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
        return this;
    }

    /**
     * **参数解释**：  一级备份保留数量。当一级备份开关开启时，返回此参数。  **取值范围**：  不涉及。
     * @return retentionNumBackupLevel1
     */
    public Integer getRetentionNumBackupLevel1() {
        return retentionNumBackupLevel1;
    }

    public void setRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
    }

    public ShowTaurusDbAdvancedBackupPolicyResponse withPolicies(List<BackupPolicyInfo> policies) {
        this.policies = policies;
        return this;
    }

    public ShowTaurusDbAdvancedBackupPolicyResponse addPoliciesItem(BackupPolicyInfo policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ShowTaurusDbAdvancedBackupPolicyResponse withPolicies(Consumer<List<BackupPolicyInfo>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**：  备份策略集。
     * @return policies
     */
    public List<BackupPolicyInfo> getPolicies() {
        return policies;
    }

    public void setPolicies(List<BackupPolicyInfo> policies) {
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
        ShowTaurusDbAdvancedBackupPolicyResponse that = (ShowTaurusDbAdvancedBackupPolicyResponse) obj;
        return Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.retentionNumBackupLevel1, that.retentionNumBackupLevel1)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime, endTime, retentionNumBackupLevel1, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaurusDbAdvancedBackupPolicyResponse {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    retentionNumBackupLevel1: ").append(toIndentedString(retentionNumBackupLevel1)).append("\n");
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
