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
 * 自动备份策略
 */
public class MysqlBackupStrategy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    @JacksonXmlProperty(localName = "start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    
    @JacksonXmlProperty(localName = "keep_days")
    
    private String keepDays;

    public MysqlBackupStrategy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 自动备份开始时间段。自动备份将在该时间一个小时内触发。  取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。  1. HH取值必须比hh大1。 2. mm和MM取值必须相同，且取值必须为00。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public MysqlBackupStrategy withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 自动备份保留天数，取值范围：1-732
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
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
        MysqlBackupStrategy mysqlBackupStrategy = (MysqlBackupStrategy) o;
        return Objects.equals(this.startTime, mysqlBackupStrategy.startTime) &&
            Objects.equals(this.keepDays, mysqlBackupStrategy.keepDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, keepDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlBackupStrategy {\n");
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

