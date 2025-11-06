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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_fire_time")

    private String nextFireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_offset")

    private Integer timeZoneOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_database")

    private String backupDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_schema_list")

    private String backupSchemaList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_table_list")

    private String backupTableList;

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
     * **参数解释**： 备份级别。 **取值范围**： cluster：集群级。 schema：模式级。 table：表级。
     * @return backupLevel
     */
    public String getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
    }

    public BackupStrategyRequest withNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }

    /**
     * **参数解释**： 下一次触发时间。 **取值范围**： 不涉及。
     * @return nextFireTime
     */
    public String getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public BackupStrategyRequest withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间。 **取值范围**： 不涉及。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public BackupStrategyRequest withTimeZoneOffset(Integer timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
        return this;
    }

    /**
     * **参数解释**： 时区偏移量。 **取值范围**： 不涉及。
     * @return timeZoneOffset
     */
    public Integer getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(Integer timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public BackupStrategyRequest withBackupDatabase(String backupDatabase) {
        this.backupDatabase = backupDatabase;
        return this;
    }

    /**
     * **参数解释**： 备份的数据库。 **取值范围**： 不涉及。
     * @return backupDatabase
     */
    public String getBackupDatabase() {
        return backupDatabase;
    }

    public void setBackupDatabase(String backupDatabase) {
        this.backupDatabase = backupDatabase;
    }

    public BackupStrategyRequest withBackupSchemaList(String backupSchemaList) {
        this.backupSchemaList = backupSchemaList;
        return this;
    }

    /**
     * **参数解释**： 备份的数据库模式列表。 **取值范围**： 不涉及。
     * @return backupSchemaList
     */
    public String getBackupSchemaList() {
        return backupSchemaList;
    }

    public void setBackupSchemaList(String backupSchemaList) {
        this.backupSchemaList = backupSchemaList;
    }

    public BackupStrategyRequest withBackupTableList(String backupTableList) {
        this.backupTableList = backupTableList;
        return this;
    }

    /**
     * **参数解释**： 备份的数据库表列表。 **取值范围**： 不涉及。
     * @return backupTableList
     */
    public String getBackupTableList() {
        return backupTableList;
    }

    public void setBackupTableList(String backupTableList) {
        this.backupTableList = backupTableList;
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
            && Objects.equals(this.backupType, that.backupType) && Objects.equals(this.backupLevel, that.backupLevel)
            && Objects.equals(this.nextFireTime, that.nextFireTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.timeZoneOffset, that.timeZoneOffset)
            && Objects.equals(this.backupDatabase, that.backupDatabase)
            && Objects.equals(this.backupSchemaList, that.backupSchemaList)
            && Objects.equals(this.backupTableList, that.backupTableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            backupStrategy,
            backupType,
            backupLevel,
            nextFireTime,
            updateTime,
            timeZoneOffset,
            backupDatabase,
            backupSchemaList,
            backupTableList);
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
        sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
        sb.append("    backupDatabase: ").append(toIndentedString(backupDatabase)).append("\n");
        sb.append("    backupSchemaList: ").append(toIndentedString(backupSchemaList)).append("\n");
        sb.append("    backupTableList: ").append(toIndentedString(backupTableList)).append("\n");
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
