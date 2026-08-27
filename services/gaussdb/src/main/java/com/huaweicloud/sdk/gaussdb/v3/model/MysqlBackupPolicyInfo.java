package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MysqlBackupPolicyInfo
 */
public class MysqlBackupPolicyInfo {

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

    private List<PolicyInfo> policies = null;

    public MysqlBackupPolicyInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段开始时间。  **约束限制**：  不涉及。  **取值范围**：  非空，格式必须为hh:mm且有效，当前时间指UTC时间。  **默认取值**：  不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public MysqlBackupPolicyInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  备份时间段结束时间。  **约束限制**：  end_time必须大于begin_time。  **取值范围**：  非空，格式必须为hh:mm且有效，当前时间指UTC时间。  **默认取值**：  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public MysqlBackupPolicyInfo withRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
        return this;
    }

    /**
     * **参数解释**：  一级备份保留数量。  **约束限制**：  当一级备份开关开启时，该参数必传。反之，不能传。  **取值范围**：  - 0：不保留一级备份。 - 1：保留1个一级备份。  **默认取值**：  0。
     * @return retentionNumBackupLevel1
     */
    public Integer getRetentionNumBackupLevel1() {
        return retentionNumBackupLevel1;
    }

    public void setRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
    }

    public MysqlBackupPolicyInfo withPolicies(List<PolicyInfo> policies) {
        this.policies = policies;
        return this;
    }

    public MysqlBackupPolicyInfo addPoliciesItem(PolicyInfo policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public MysqlBackupPolicyInfo withPolicies(Consumer<List<PolicyInfo>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**：  备份策略集。  **约束限制**：  不涉及。
     * @return policies
     */
    public List<PolicyInfo> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PolicyInfo> policies) {
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
        MysqlBackupPolicyInfo that = (MysqlBackupPolicyInfo) obj;
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
        sb.append("class MysqlBackupPolicyInfo {\n");
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
