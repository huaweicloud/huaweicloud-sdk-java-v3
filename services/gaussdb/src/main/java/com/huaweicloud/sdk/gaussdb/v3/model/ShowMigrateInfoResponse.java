package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMigrateInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_id")

    private String rdsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_status")

    private String rdsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_name")

    private String rdsInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drs_job_id")

    private String drsJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drs_status")

    private String drsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_readwrite_mode")

    private String rdsReadwriteMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taurus_readwrite_mode")

    private String taurusReadwriteMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_direction")

    private String migrationDirection;

    public ShowMigrateInfoResponse withRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }

    /**
     * **参数解释**：  源实例ID。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return rdsInstanceId;
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
    }

    public ShowMigrateInfoResponse withRdsStatus(String rdsStatus) {
        this.rdsStatus = rdsStatus;
        return this;
    }

    /**
     * **参数解释**：  源实例状态。  **取值范围**：  不涉及。
     * @return rdsStatus
     */
    public String getRdsStatus() {
        return rdsStatus;
    }

    public void setRdsStatus(String rdsStatus) {
        this.rdsStatus = rdsStatus;
    }

    public ShowMigrateInfoResponse withRdsInstanceName(String rdsInstanceName) {
        this.rdsInstanceName = rdsInstanceName;
        return this;
    }

    /**
     * **参数解释**：  源实例名称。  **取值范围**：  不涉及。
     * @return rdsInstanceName
     */
    public String getRdsInstanceName() {
        return rdsInstanceName;
    }

    public void setRdsInstanceName(String rdsInstanceName) {
        this.rdsInstanceName = rdsInstanceName;
    }

    public ShowMigrateInfoResponse withDrsJobId(String drsJobId) {
        this.drsJobId = drsJobId;
        return this;
    }

    /**
     * **参数解释**：  迁移任务ID。  **取值范围**：  不涉及。
     * @return drsJobId
     */
    public String getDrsJobId() {
        return drsJobId;
    }

    public void setDrsJobId(String drsJobId) {
        this.drsJobId = drsJobId;
    }

    public ShowMigrateInfoResponse withDrsStatus(String drsStatus) {
        this.drsStatus = drsStatus;
        return this;
    }

    /**
     * **参数解释**：  迁移任务状态。  **取值范围**：  不涉及。
     * @return drsStatus
     */
    public String getDrsStatus() {
        return drsStatus;
    }

    public void setDrsStatus(String drsStatus) {
        this.drsStatus = drsStatus;
    }

    public ShowMigrateInfoResponse withRdsReadwriteMode(String rdsReadwriteMode) {
        this.rdsReadwriteMode = rdsReadwriteMode;
        return this;
    }

    /**
     * **参数解释**：  源实例读写状态。  **取值范围**：  - ON：读写状态。 - OFF：只读状态。
     * @return rdsReadwriteMode
     */
    public String getRdsReadwriteMode() {
        return rdsReadwriteMode;
    }

    public void setRdsReadwriteMode(String rdsReadwriteMode) {
        this.rdsReadwriteMode = rdsReadwriteMode;
    }

    public ShowMigrateInfoResponse withTaurusReadwriteMode(String taurusReadwriteMode) {
        this.taurusReadwriteMode = taurusReadwriteMode;
        return this;
    }

    /**
     * **参数解释**：  目标实例读写状态。  **取值范围**：  - ON：读写状态。 - OFF：只读状态。
     * @return taurusReadwriteMode
     */
    public String getTaurusReadwriteMode() {
        return taurusReadwriteMode;
    }

    public void setTaurusReadwriteMode(String taurusReadwriteMode) {
        this.taurusReadwriteMode = taurusReadwriteMode;
    }

    public ShowMigrateInfoResponse withMigrationDirection(String migrationDirection) {
        this.migrationDirection = migrationDirection;
        return this;
    }

    /**
     * **参数解释**：G  迁移方向。  **取值范围**：  - up：源实例到TaurusDB实例。 - down：TaurusDB实例到源实例。
     * @return migrationDirection
     */
    public String getMigrationDirection() {
        return migrationDirection;
    }

    public void setMigrationDirection(String migrationDirection) {
        this.migrationDirection = migrationDirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrateInfoResponse that = (ShowMigrateInfoResponse) obj;
        return Objects.equals(this.rdsInstanceId, that.rdsInstanceId) && Objects.equals(this.rdsStatus, that.rdsStatus)
            && Objects.equals(this.rdsInstanceName, that.rdsInstanceName)
            && Objects.equals(this.drsJobId, that.drsJobId) && Objects.equals(this.drsStatus, that.drsStatus)
            && Objects.equals(this.rdsReadwriteMode, that.rdsReadwriteMode)
            && Objects.equals(this.taurusReadwriteMode, that.taurusReadwriteMode)
            && Objects.equals(this.migrationDirection, that.migrationDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdsInstanceId,
            rdsStatus,
            rdsInstanceName,
            drsJobId,
            drsStatus,
            rdsReadwriteMode,
            taurusReadwriteMode,
            migrationDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrateInfoResponse {\n");
        sb.append("    rdsInstanceId: ").append(toIndentedString(rdsInstanceId)).append("\n");
        sb.append("    rdsStatus: ").append(toIndentedString(rdsStatus)).append("\n");
        sb.append("    rdsInstanceName: ").append(toIndentedString(rdsInstanceName)).append("\n");
        sb.append("    drsJobId: ").append(toIndentedString(drsJobId)).append("\n");
        sb.append("    drsStatus: ").append(toIndentedString(drsStatus)).append("\n");
        sb.append("    rdsReadwriteMode: ").append(toIndentedString(rdsReadwriteMode)).append("\n");
        sb.append("    taurusReadwriteMode: ").append(toIndentedString(taurusReadwriteMode)).append("\n");
        sb.append("    migrationDirection: ").append(toIndentedString(migrationDirection)).append("\n");
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
