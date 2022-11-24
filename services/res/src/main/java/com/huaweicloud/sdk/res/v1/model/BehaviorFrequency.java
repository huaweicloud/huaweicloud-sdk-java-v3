package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BehaviorFrequency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_type")

    private String behaviorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_limit")

    private Integer lowerLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper_limit")

    private Integer upperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    public BehaviorFrequency withBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }

    /**
     * 行为类型： - view，曝光 - click，点击 - collect，收藏 - uncollect，取消收藏 - search_click，搜索后点击 - comment，评论 - share，分享 - like，点赞 - dislike，点衰 - grade，评分 - consume，消费 - use，观看视频/听音乐/阅读 - download，下载 - tip，打赏 - subscribe，关注
     * @return behaviorType
     */
    public String getBehaviorType() {
        return behaviorType;
    }

    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

    public BehaviorFrequency withLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    /**
     * 最小次数。
     * minimum: 1
     * @return lowerLimit
     */
    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public BehaviorFrequency withUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    /**
     * 最大次数。
     * minimum: 1
     * @return upperLimit
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public BehaviorFrequency withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 时间区间。
     * minimum: 1
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BehaviorFrequency behaviorFrequency = (BehaviorFrequency) o;
        return Objects.equals(this.behaviorType, behaviorFrequency.behaviorType)
            && Objects.equals(this.lowerLimit, behaviorFrequency.lowerLimit)
            && Objects.equals(this.upperLimit, behaviorFrequency.upperLimit)
            && Objects.equals(this.timeInterval, behaviorFrequency.timeInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(behaviorType, lowerLimit, upperLimit, timeInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BehaviorFrequency {\n");
        sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
        sb.append("    lowerLimit: ").append(toIndentedString(lowerLimit)).append("\n");
        sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
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
