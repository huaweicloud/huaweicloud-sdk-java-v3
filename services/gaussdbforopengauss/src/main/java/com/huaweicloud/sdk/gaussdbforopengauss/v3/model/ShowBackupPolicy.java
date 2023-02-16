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
public class ShowBackupPolicy  {



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
    @JsonProperty(value="differential_priod")
    
    
    private String differentialPriod;


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

    public ShowBackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 全量备份文件可以保存的天数。
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

    

    public ShowBackupPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 全量备份时间段。自动备份将在该时间段内触发。除关闭自动备份策略外，必选。  取值范围：格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。  - HH取值必须比hh大1。 - mm和MM取值必须相同，且取值必须为00。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowBackupPolicy withPeriod(String period) {
        this.period = period;
        return this;
    }

    


    /**
     * 全量备份周期配置。自动备份将在每星期指定的天进行。  取值范围：格式为逗号隔开的数字，数字代表星期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    

    public ShowBackupPolicy withDifferentialPriod(String differentialPriod) {
        this.differentialPriod = differentialPriod;
        return this;
    }

    


    /**
     * 差量备份周期配置。自动差量备份将每隔周期分钟执行(废弃)。
     * @return differentialPriod
     */
    public String getDifferentialPriod() {
        return differentialPriod;
    }

    public void setDifferentialPriod(String differentialPriod) {
        this.differentialPriod = differentialPriod;
    }

    

    public ShowBackupPolicy withDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
        return this;
    }

    


    /**
     * 差量备份周期配置。自动差量备份将每隔周期分钟执行。
     * @return differentialPeriod
     */
    public String getDifferentialPeriod() {
        return differentialPeriod;
    }

    public void setDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
    }

    

    public ShowBackupPolicy withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    


    /**
     * 备份时备份数据上传OBS的速度，单位为MB/s。范围为0~1024MB/s，默认75MB/s，0MB/s表示不限速。
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    

    public ShowBackupPolicy withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    


    /**
     * 控制差量备份时读取磁盘上表文件差量修改页面的预取页面个数，可设置范围为1~8192，默认64。
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    

    public ShowBackupPolicy withFilesplitSize(Integer filesplitSize) {
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

    

    public ShowBackupPolicy withFileSplitSize(Integer fileSplitSize) {
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

    

    public ShowBackupPolicy withEnableStandbyBackup(Boolean enableStandbyBackup) {
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
        ShowBackupPolicy showBackupPolicy = (ShowBackupPolicy) o;
        return Objects.equals(this.keepDays, showBackupPolicy.keepDays) &&
            Objects.equals(this.startTime, showBackupPolicy.startTime) &&
            Objects.equals(this.period, showBackupPolicy.period) &&
            Objects.equals(this.differentialPriod, showBackupPolicy.differentialPriod) &&
            Objects.equals(this.differentialPeriod, showBackupPolicy.differentialPeriod) &&
            Objects.equals(this.rateLimit, showBackupPolicy.rateLimit) &&
            Objects.equals(this.prefetchBlock, showBackupPolicy.prefetchBlock) &&
            Objects.equals(this.filesplitSize, showBackupPolicy.filesplitSize) &&
            Objects.equals(this.fileSplitSize, showBackupPolicy.fileSplitSize) &&
            Objects.equals(this.enableStandbyBackup, showBackupPolicy.enableStandbyBackup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepDays, startTime, period, differentialPriod, differentialPeriod, rateLimit, prefetchBlock, filesplitSize, fileSplitSize, enableStandbyBackup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    differentialPriod: ").append(toIndentedString(differentialPriod)).append("\n");
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

