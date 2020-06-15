package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BackupPlan;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * BackupPolicy
 */
public class BackupPolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_type")
    
    private String backupType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="save_days")
    
    private Integer saveDays;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="periodical_backup_plan")
    
    private BackupPlan periodicalBackupPlan = null;

    public BackupPolicy withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    


    /**
     * 备份类型。 - auto：自动备份 - manual：手动备份 
     * @return backupType
     */
    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public BackupPolicy withSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
        return this;
    }

    


    /**
     * 当backup_type设置为manual时，该参数为必填。 保留天数，单位：天，取值范围：1-7。 
     * @return saveDays
     */
    public Integer getSaveDays() {
        return saveDays;
    }

    public void setSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
    }

    public BackupPolicy withPeriodicalBackupPlan(BackupPlan periodicalBackupPlan) {
        this.periodicalBackupPlan = periodicalBackupPlan;
        return this;
    }

    public BackupPolicy withPeriodicalBackupPlan(Consumer<BackupPlan> periodicalBackupPlanSetter) {
        if(this.periodicalBackupPlan == null ){
            this.periodicalBackupPlan = new BackupPlan();
        }
        periodicalBackupPlanSetter.accept(this.periodicalBackupPlan);
        return this;
    }


    /**
     * Get periodicalBackupPlan
     * @return periodicalBackupPlan
     */
    public BackupPlan getPeriodicalBackupPlan() {
        return periodicalBackupPlan;
    }

    public void setPeriodicalBackupPlan(BackupPlan periodicalBackupPlan) {
        this.periodicalBackupPlan = periodicalBackupPlan;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPolicy backupPolicy = (BackupPolicy) o;
        return Objects.equals(this.backupType, backupPolicy.backupType) &&
            Objects.equals(this.saveDays, backupPolicy.saveDays) &&
            Objects.equals(this.periodicalBackupPlan, backupPolicy.periodicalBackupPlan);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupType, saveDays, periodicalBackupPlan);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicy {\n");
            sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
            sb.append("    saveDays: ").append(toIndentedString(saveDays)).append("\n");
            sb.append("    periodicalBackupPlan: ").append(toIndentedString(periodicalBackupPlan)).append("\n");
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

