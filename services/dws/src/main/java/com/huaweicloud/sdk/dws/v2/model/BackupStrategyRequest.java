package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 备份策略请求信息。 **取值范围**： 不涉及。
 */
public class BackupStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private String backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    private String backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_level")

    private String backupLevel;

    public BackupStrategyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID。 **取值范围**： 不涉及。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public BackupStrategyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**： 策略名称。添加备份策略时为必选字段。策略名称在4位到92位之间，必须以字母开头，不区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他特殊字符，并且名称唯一。 **取值范围**： 不涉及。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public BackupStrategyRequest withBackupStrategy(String backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    /**
     * **参数解释**： 执行策略。添加备份策略时为必选字段。符合Cron表达式格式。 **取值范围**： 不涉及。
     * @return backupStrategy
     */
    public String getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(String backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public BackupStrategyRequest withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * **参数解释**： 备份类型。 **取值范围**： full：全量。 increment：增量。
     * @return backupType
     */
    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public BackupStrategyRequest withBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }

    /**
     * **参数解释**： 备份级别。 **取值范围**： cluster：集群级。
     * @return backupLevel
     */
    public String getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupStrategyRequest that = (BackupStrategyRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.backupType, that.backupType) && Objects.equals(this.backupLevel, that.backupLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, policyName, backupStrategy, backupType, backupLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupStrategyRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
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
