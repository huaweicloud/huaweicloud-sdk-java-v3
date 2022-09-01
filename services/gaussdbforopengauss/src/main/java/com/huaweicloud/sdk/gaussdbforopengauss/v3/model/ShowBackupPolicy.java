package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





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
public class ShowBackupPolicy  {



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
    @JsonProperty(value="differential_priod")
    
    @JacksonXmlProperty(localName = "differential_priod")
    
    private String differentialPriod;

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
     * 差量备份周期配置。自动差量备份将每隔周期分钟执行。
     * @return differentialPriod
     */
    public String getDifferentialPriod() {
        return differentialPriod;
    }

    public void setDifferentialPriod(String differentialPriod) {
        this.differentialPriod = differentialPriod;
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
            Objects.equals(this.differentialPriod, showBackupPolicy.differentialPriod);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keepDays, startTime, period, differentialPriod);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    differentialPriod: ").append(toIndentedString(differentialPriod)).append("\n");
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

