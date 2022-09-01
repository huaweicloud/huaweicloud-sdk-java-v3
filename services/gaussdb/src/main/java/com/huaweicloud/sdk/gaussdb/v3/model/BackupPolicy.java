package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 备份策略信息。
 */
public class BackupPolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    
    @JacksonXmlProperty(localName = "keep_days")
    
    private Integer keepDays;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    @JacksonXmlProperty(localName = "start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    @JacksonXmlProperty(localName = "period")
    
    private String period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_num_backup_level1")
    
    @JacksonXmlProperty(localName = "retention_num_backup_level1")
    
    private Integer retentionNumBackupLevel1;

    public BackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 指定已生成的备份文件可以保存的天数。取值范围：1～732。
     * minimum: 1
     * maximum: 732
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    

    public BackupPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 备份时间段。自动备份将在该时间段内触发。 取值范围：格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public BackupPolicy withPeriod(String period) {
        this.period = period;
        return this;
    }

    


    /**
     * 备份周期配置。自动备份将在每星期指定的天进行。 取值范围：格式为逗号隔开的数字，数字代表星期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    

    public BackupPolicy withRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
        return this;
    }

    


    /**
     * 1级备份保留数量。当一级备份开关开启时，返回此参数。
     * @return retentionNumBackupLevel1
     */
    public Integer getRetentionNumBackupLevel1() {
        return retentionNumBackupLevel1;
    }

    public void setRetentionNumBackupLevel1(Integer retentionNumBackupLevel1) {
        this.retentionNumBackupLevel1 = retentionNumBackupLevel1;
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
        return Objects.equals(this.keepDays, backupPolicy.keepDays) &&
            Objects.equals(this.startTime, backupPolicy.startTime) &&
            Objects.equals(this.period, backupPolicy.period) &&
            Objects.equals(this.retentionNumBackupLevel1, backupPolicy.retentionNumBackupLevel1);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepDays, startTime, period, retentionNumBackupLevel1);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    retentionNumBackupLevel1: ").append(toIndentedString(retentionNumBackupLevel1)).append("\n");
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

