package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RpoAndRTO信息体
 */
public class RpoAndRtoInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_point")
    
    private String checkPoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    
    private String delay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gtid_set")
    
    private String gtidSet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;

    public RpoAndRtoInfo withCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }

    


    /**
     * 检查点
     * @return checkPoint
     */
    public String getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
    }

    public RpoAndRtoInfo withDelay(String delay) {
        this.delay = delay;
        return this;
    }

    


    /**
     * 延迟
     * @return delay
     */
    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public RpoAndRtoInfo withGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
        return this;
    }

    


    /**
     * gtid集合
     * @return gtidSet
     */
    public String getGtidSet() {
        return gtidSet;
    }

    public void setGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
    }

    public RpoAndRtoInfo withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 当前时间 ，格式为“yyyy-MM-dd HH:mm:ss”
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RpoAndRtoInfo rpoAndRtoInfo = (RpoAndRtoInfo) o;
        return Objects.equals(this.checkPoint, rpoAndRtoInfo.checkPoint) &&
            Objects.equals(this.delay, rpoAndRtoInfo.delay) &&
            Objects.equals(this.gtidSet, rpoAndRtoInfo.gtidSet) &&
            Objects.equals(this.time, rpoAndRtoInfo.time);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkPoint, delay, gtidSet, time);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RpoAndRtoInfo {\n");
        sb.append("    checkPoint: ").append(toIndentedString(checkPoint)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    gtidSet: ").append(toIndentedString(gtidSet)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

