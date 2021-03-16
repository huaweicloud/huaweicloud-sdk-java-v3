package com.huaweicloud.sdk.das.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例空间信息。数据来源于文件系统。已用空间包含数据空间、日志空间和其他空间，其他空间包括引擎产生的临时文件等。
 */
public class InstanceSpaceInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_size")
    
    private Long totalSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_size")
    
    private Long usedSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_size")
    
    private Long dataSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_size")
    
    private Long logSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avg_daily_growth")
    
    private Long avgDailyGrowth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_result_time")
    
    private Long lastResultTime;

    public InstanceSpaceInfo withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    


    /**
     * 实例总空间，已字节为单位。GaussDB(for MySQL)不会返回总空间
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    

    public InstanceSpaceInfo withUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    


    /**
     * 已使用空间，已字节为单位
     * @return usedSize
     */
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    

    public InstanceSpaceInfo withDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    


    /**
     * 数据空间，已字节为单位
     * @return dataSize
     */
    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    

    public InstanceSpaceInfo withLogSize(Long logSize) {
        this.logSize = logSize;
        return this;
    }

    


    /**
     * 日志空间，已字节为单位
     * @return logSize
     */
    public Long getLogSize() {
        return logSize;
    }

    public void setLogSize(Long logSize) {
        this.logSize = logSize;
    }

    

    public InstanceSpaceInfo withAvgDailyGrowth(Long avgDailyGrowth) {
        this.avgDailyGrowth = avgDailyGrowth;
        return this;
    }

    


    /**
     * 近七日的数据平均日增长量，已字节为单位
     * @return avgDailyGrowth
     */
    public Long getAvgDailyGrowth() {
        return avgDailyGrowth;
    }

    public void setAvgDailyGrowth(Long avgDailyGrowth) {
        this.avgDailyGrowth = avgDailyGrowth;
    }

    

    public InstanceSpaceInfo withLastResultTime(Long lastResultTime) {
        this.lastResultTime = lastResultTime;
        return this;
    }

    


    /**
     * 最后一次分析的结果时间，毫秒单位时间戳
     * @return lastResultTime
     */
    public Long getLastResultTime() {
        return lastResultTime;
    }

    public void setLastResultTime(Long lastResultTime) {
        this.lastResultTime = lastResultTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceSpaceInfo instanceSpaceInfo = (InstanceSpaceInfo) o;
        return Objects.equals(this.totalSize, instanceSpaceInfo.totalSize) &&
            Objects.equals(this.usedSize, instanceSpaceInfo.usedSize) &&
            Objects.equals(this.dataSize, instanceSpaceInfo.dataSize) &&
            Objects.equals(this.logSize, instanceSpaceInfo.logSize) &&
            Objects.equals(this.avgDailyGrowth, instanceSpaceInfo.avgDailyGrowth) &&
            Objects.equals(this.lastResultTime, instanceSpaceInfo.lastResultTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalSize, usedSize, dataSize, logSize, avgDailyGrowth, lastResultTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSpaceInfo {\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    logSize: ").append(toIndentedString(logSize)).append("\n");
        sb.append("    avgDailyGrowth: ").append(toIndentedString(avgDailyGrowth)).append("\n");
        sb.append("    lastResultTime: ").append(toIndentedString(lastResultTime)).append("\n");
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

