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
 * 备份策略。
 */
public class OpenGaussBackupStrategy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    @JacksonXmlProperty(localName = "start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    
    @JacksonXmlProperty(localName = "keep_days")
    
    private Integer keepDays;

    public OpenGaussBackupStrategy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 备份时间段。自动备份将在该时间段内触发。  取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。  - HH取值必须比hh大1。 - mm和MM取值必须相同，且取值必须为00。 取值示例：  - 08:00-09:00 - 23:00-00:00
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public OpenGaussBackupStrategy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 指定备份文件的可保存天数。  取值范围：0～732。该参数缺省或为0时，默认填写为7天。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussBackupStrategy openGaussBackupStrategy = (OpenGaussBackupStrategy) o;
        return Objects.equals(this.startTime, openGaussBackupStrategy.startTime) &&
            Objects.equals(this.keepDays, openGaussBackupStrategy.keepDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, keepDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussBackupStrategy {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

