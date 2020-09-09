package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 自动备份策略。
 */
public class BackupStrategy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_days")
    
    private Integer keepDays;

    public BackupStrategy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 备份时间段。自动备份将在该时间段内触发。  取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。  HH取值必须比hh大1。 mm和MM取值必须相同，且取值必须为00、15、30或45。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BackupStrategy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    


    /**
     * 指定备份文件的可保存天数。  取值范围：0～732。该参数缺省，或取值为0，表示关闭自动备份策略。如果需要延长保留时间请联系客服人员申请，自动备份最长可以保留2562天。  说明：SQL Server的HA实例不支持关闭自动备份策略。
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
        BackupStrategy backupStrategy = (BackupStrategy) o;
        return Objects.equals(this.startTime, backupStrategy.startTime) &&
            Objects.equals(this.keepDays, backupStrategy.keepDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, keepDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupStrategy {\n");
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

