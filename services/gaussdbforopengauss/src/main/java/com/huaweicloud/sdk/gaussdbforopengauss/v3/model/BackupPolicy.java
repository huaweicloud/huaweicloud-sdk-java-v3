package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 备份策略信息。
 */
public class BackupPolicy  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="differential_period")
    

    private String differentialPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rate_limit")
    

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="prefetch_block")
    

    private Integer prefetchBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filesplit_size")
    

    private Integer filesplitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_split_size")
    

    private Integer fileSplitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_standby_backup")
    

    private Boolean enableStandbyBackup;

    public BackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 备份文件可以保存的天数。  取值范围：1-732天。
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
     * 备份时间段。自动备份将在该时间段内触发。  取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。  HH取值必须比hh大1，mm和MM取值必须相同，且取值必须为00。  取值示例：  21:00-22:00
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
     * 全量备份周期配置。自动全量备份将在每星期指定的天进行。取值范围：格式为逗号隔开的数字，数字代表星期。取值示例：1,2,3,4则表示备份周期配置为星期一、星期二、星期三和星期四。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    

    public BackupPolicy withDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
        return this;
    }

    


    /**
     * 差异备份间隔时间配置。每次自动差异备份的间隔时间。  取值范围：15、30、60、180、360、720、1440。单位：分钟。  取值示例：30
     * @return differentialPeriod
     */
    public String getDifferentialPeriod() {
        return differentialPeriod;
    }

    public void setDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
    }

    

    public BackupPolicy withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    


    /**
     * 备份限速  取值范围：0 ~ 1024
     * minimum: 0
     * maximum: 1024
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    

    public BackupPolicy withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    


    /**
     * 控制差量备份时读取磁盘上表文件差量修改页面的预取页面个数。当差量修改页面非常集中时（如数据导入场景），可以适当调大该值；当差量修改页面非常分散时（如随机更新），可以适当调小该值。  取值范围：1 ~ 8192
     * minimum: 1
     * maximum: 8192
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    

    public BackupPolicy withFilesplitSize(Integer filesplitSize) {
        this.filesplitSize = filesplitSize;
        return this;
    }

    


    /**
     * 废弃。
     * minimum: 0
     * maximum: 1024
     * @return filesplitSize
     */
    public Integer getFilesplitSize() {
        return filesplitSize;
    }

    public void setFilesplitSize(Integer filesplitSize) {
        this.filesplitSize = filesplitSize;
    }

    

    public BackupPolicy withFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
        return this;
    }

    


    /**
     * 全量、差量备份时产生的备份文件会根据分片大小进行拆分，可设置范围为0~1024GB，设置需为4的倍数，默认4GB，0GB表示不限制大小。  取值范围：0 ~ 1024
     * minimum: 0
     * maximum: 1024
     * @return fileSplitSize
     */
    public Integer getFileSplitSize() {
        return fileSplitSize;
    }

    public void setFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
    }

    

    public BackupPolicy withEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
        return this;
    }

    


    /**
     * 是否启用备机备份。  取值范围：true|false
     * @return enableStandbyBackup
     */
    public Boolean getEnableStandbyBackup() {
        return enableStandbyBackup;
    }

    public void setEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
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
            Objects.equals(this.differentialPeriod, backupPolicy.differentialPeriod) &&
            Objects.equals(this.rateLimit, backupPolicy.rateLimit) &&
            Objects.equals(this.prefetchBlock, backupPolicy.prefetchBlock) &&
            Objects.equals(this.filesplitSize, backupPolicy.filesplitSize) &&
            Objects.equals(this.fileSplitSize, backupPolicy.fileSplitSize) &&
            Objects.equals(this.enableStandbyBackup, backupPolicy.enableStandbyBackup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepDays, startTime, period, differentialPeriod, rateLimit, prefetchBlock, filesplitSize, fileSplitSize, enableStandbyBackup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    differentialPeriod: ").append(toIndentedString(differentialPeriod)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    prefetchBlock: ").append(toIndentedString(prefetchBlock)).append("\n");
        sb.append("    filesplitSize: ").append(toIndentedString(filesplitSize)).append("\n");
        sb.append("    fileSplitSize: ").append(toIndentedString(fileSplitSize)).append("\n");
        sb.append("    enableStandbyBackup: ").append(toIndentedString(enableStandbyBackup)).append("\n");
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

