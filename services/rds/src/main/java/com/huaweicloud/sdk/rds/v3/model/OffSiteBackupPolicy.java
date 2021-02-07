package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 跨区域备份策略信息。
 */
public class OffSiteBackupPolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    
    private Integer keepDays;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_type")
    
    private Object backupType = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_region")
    
    private String destinationRegion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_project_id")
    
    private String destinationProjectId;

    public OffSiteBackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 指定已生成的备份文件可以保存的天数。  取值范围：0～1825。保存天数设置为0时，表示关闭跨区域备份策略。  注意： 关闭备份策略后，备份任务将立即停止，如果有增量备份，所有增量备份任务将立即删除，使用增量备份的相关操作可能失败，相关操作不限于下载、复制、恢复、重建等，请谨慎操作。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public OffSiteBackupPolicy withBackupType(Object backupType) {
        this.backupType = backupType;
        return this;
    }

    


    /**
     * 备份类型，取值： - SQL Server仅支持设置为“all” - “auto”: 自动全量备份 - “incremental”: 自动增量备份 - “manual“: 手动备份，仅SQL Server返回该备份类型 - “all”: 同时设置自动全量和自动增量备份。MySQL: 同时设置自动全量和自动增量备份。SQL Server: 同时设置自动全量、自动增量备份和手动备份。
     * @return backupType
     */
    public Object getBackupType() {
        return backupType;
    }

    public void setBackupType(Object backupType) {
        this.backupType = backupType;
    }

    public OffSiteBackupPolicy withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    


    /**
     * 目标区域ID。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public OffSiteBackupPolicy withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return destinationProjectId
     */
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
        OffSiteBackupPolicy offSiteBackupPolicy = (OffSiteBackupPolicy) o;
        return Objects.equals(this.keepDays, offSiteBackupPolicy.keepDays) &&
            Objects.equals(this.backupType, offSiteBackupPolicy.backupType) &&
            Objects.equals(this.destinationRegion, offSiteBackupPolicy.destinationRegion) &&
            Objects.equals(this.destinationProjectId, offSiteBackupPolicy.destinationProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepDays, backupType, destinationRegion, destinationProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffSiteBackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
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

