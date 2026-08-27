package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改同区域备份策略请求体。
 */
public class UpdateTaurusBackupPolicyRequest {

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

    private List<Policy> policies = null;

    public UpdateTaurusBackupPolicyRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段开始时间。  **约束限制**：  不涉及。  **取值范围**：  格式必须为hh:mm且有效，h为0~23的数字，m为0~59的数字，当前时间指UTC时间。  **默认取值**：  不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public UpdateTaurusBackupPolicyRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段结束时间。  **约束限制**：  end_time必须大于begin_time。  **取值范围**：  格式必须为hh:mm且有效，h为0~23的数字，m为0~59的数字，当前时间指UTC时间。  **默认取值**：  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public UpdateTaurusBackupPolicyRequest withRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
        return this;
    }

    /**
     * **参数解释**：  一级备份保留数量。  **约束限制**：  当一级备份开关开启时，该参数必传。反之，不能传。  **取值范围**：  - 0：不保留一级备份。 - 1：一级备份保留数量，单位为个。  **默认取值**：  0。
     * @return retentionNumBackupLevel1
     */
    public Integer getRetentionNumBackupLevel1() {
        return retentionNumBackupLevel1;
    }

    public void setRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
    }

    public UpdateTaurusBackupPolicyRequest withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public UpdateTaurusBackupPolicyRequest addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public UpdateTaurusBackupPolicyRequest withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**：  备份策略集，包含备份周期、保留天数和策略类型等配置信息，详见Policy数据结构。  **约束限制**：  不涉及。
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
        UpdateTaurusBackupPolicyRequest that = (UpdateTaurusBackupPolicyRequest) obj;
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
        sb.append("class UpdateTaurusBackupPolicyRequest {\n");
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
