package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份策略信息。
 */
public class UpdateBackupOffsitePolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_auto_backup")

    private Boolean openAutoBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_incremental_backup")

    private Boolean openIncrementalBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    public UpdateBackupOffsitePolicyInfo withOpenAutoBackup(Boolean openAutoBackup) {
        this.openAutoBackup = openAutoBackup;
        return this;
    }

    /**
     * 是否开启跨区域全量备份。 - true：开启跨区域全量备份。 - false：关闭跨区域全量备份。
     * @return openAutoBackup
     */
    public Boolean getOpenAutoBackup() {
        return openAutoBackup;
    }

    public void setOpenAutoBackup(Boolean openAutoBackup) {
        this.openAutoBackup = openAutoBackup;
    }

    public UpdateBackupOffsitePolicyInfo withOpenIncrementalBackup(Boolean openIncrementalBackup) {
        this.openIncrementalBackup = openIncrementalBackup;
        return this;
    }

    /**
     * 是否开启跨区域增量备份。 - true：开启跨区域增量备份，当open_auto_backup开启时才可以开启。 - false：关闭跨区域增量备份。
     * @return openIncrementalBackup
     */
    public Boolean getOpenIncrementalBackup() {
        return openIncrementalBackup;
    }

    public void setOpenIncrementalBackup(Boolean openIncrementalBackup) {
        this.openIncrementalBackup = openIncrementalBackup;
    }

    public UpdateBackupOffsitePolicyInfo withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 设置跨区域备份策略的目标project ID。    租户在某一Region下的project ID。                              获取方法请参见[获取项目ID](https://support.huaweicloud.com/api-taurusdb/taurusdb_10_0004.html)。
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public UpdateBackupOffsitePolicyInfo withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 设置跨区域备份策略的目标区域。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public UpdateBackupOffsitePolicyInfo withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 指定已生成的备份文件可以保存的天数。  取值范围：1～1825。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBackupOffsitePolicyInfo that = (UpdateBackupOffsitePolicyInfo) obj;
        return Objects.equals(this.openAutoBackup, that.openAutoBackup)
            && Objects.equals(this.openIncrementalBackup, that.openIncrementalBackup)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.keepDays, that.keepDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openAutoBackup, openIncrementalBackup, destinationProjectId, destinationRegion, keepDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackupOffsitePolicyInfo {\n");
        sb.append("    openAutoBackup: ").append(toIndentedString(openAutoBackup)).append("\n");
        sb.append("    openIncrementalBackup: ").append(toIndentedString(openIncrementalBackup)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
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
