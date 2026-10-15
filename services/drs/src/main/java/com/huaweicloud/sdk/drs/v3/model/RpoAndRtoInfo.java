package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RPO和RTO信息体
 */
public class RpoAndRtoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_point")

    private String checkPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private String delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gtid_set")

    private String gtidSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public RpoAndRtoInfo withCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }

    /**
     * **参数解释**：  数据复制的检查点位置，标识已同步数据的Binlog位置。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  数据同步延迟时间。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  全局事务ID集合（Global Transaction Identifier），用于标识已执行的事务。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  RPO或RTO的统计时间点，格式为\"yyyy-MM-dd HH:mm:ss\"。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RpoAndRtoInfo that = (RpoAndRtoInfo) obj;
        return Objects.equals(this.checkPoint, that.checkPoint) && Objects.equals(this.delay, that.delay)
            && Objects.equals(this.gtidSet, that.gtidSet) && Objects.equals(this.time, that.time);
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
