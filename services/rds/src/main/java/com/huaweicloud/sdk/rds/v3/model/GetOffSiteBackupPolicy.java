package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 备份策略对象，包括备份类型、备份保留天数、目标区域ID和目标project ID。 */
public class GetOffSiteBackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    private String backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    public GetOffSiteBackupPolicy withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /** 指定备份的类型。取值如下： - auto：自动全量备份。 - incremental：自动增量备份。 - manual：手动备份，仅SQL Server返回该备份类型 。
     * 
     * @return backupType */
    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public GetOffSiteBackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /** 备份文件可以保存的天数。
     * 
     * @return keepDays */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public GetOffSiteBackupPolicy withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /** 设置跨区域备份策略的目标区域ID。
     * 
     * @return destinationRegion */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public GetOffSiteBackupPolicy withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /** 设置跨区域备份策略的目标project ID。
     * 
     * @return destinationProjectId */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOffSiteBackupPolicy getOffSiteBackupPolicy = (GetOffSiteBackupPolicy) o;
        return Objects.equals(this.backupType, getOffSiteBackupPolicy.backupType)
            && Objects.equals(this.keepDays, getOffSiteBackupPolicy.keepDays)
            && Objects.equals(this.destinationRegion, getOffSiteBackupPolicy.destinationRegion)
            && Objects.equals(this.destinationProjectId, getOffSiteBackupPolicy.destinationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupType, keepDays, destinationRegion, destinationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOffSiteBackupPolicy {\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
