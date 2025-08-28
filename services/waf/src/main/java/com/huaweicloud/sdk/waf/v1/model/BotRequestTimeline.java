package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 特定时间点的请求趋势数据 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class BotRequestTimeline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datetime")

    private Long datetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_request_count")

    private Integer normalRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "known_bot_matched_count")

    private Integer knownBotMatchedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_matched_count")

    private Integer transparentMatchedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_matched_count")

    private Integer behaviorMatchedCount;

    public BotRequestTimeline withDatetime(Long datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * **参数解释：** 时间点（如2023-10-01 00:00:00） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return datetime
     */
    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public BotRequestTimeline withNormalRequestCount(Integer normalRequestCount) {
        this.normalRequestCount = normalRequestCount;
        return this;
    }

    /**
     * **参数解释：** 该时间点的正常请求数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return normalRequestCount
     */
    public Integer getNormalRequestCount() {
        return normalRequestCount;
    }

    public void setNormalRequestCount(Integer normalRequestCount) {
        this.normalRequestCount = normalRequestCount;
    }

    public BotRequestTimeline withKnownBotMatchedCount(Integer knownBotMatchedCount) {
        this.knownBotMatchedCount = knownBotMatchedCount;
        return this;
    }

    /**
     * **参数解释：** 该时间点匹配已知bot的请求数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return knownBotMatchedCount
     */
    public Integer getKnownBotMatchedCount() {
        return knownBotMatchedCount;
    }

    public void setKnownBotMatchedCount(Integer knownBotMatchedCount) {
        this.knownBotMatchedCount = knownBotMatchedCount;
    }

    public BotRequestTimeline withTransparentMatchedCount(Integer transparentMatchedCount) {
        this.transparentMatchedCount = transparentMatchedCount;
        return this;
    }

    /**
     * **参数解释：** 该时间点透明检测的请求数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return transparentMatchedCount
     */
    public Integer getTransparentMatchedCount() {
        return transparentMatchedCount;
    }

    public void setTransparentMatchedCount(Integer transparentMatchedCount) {
        this.transparentMatchedCount = transparentMatchedCount;
    }

    public BotRequestTimeline withBehaviorMatchedCount(Integer behaviorMatchedCount) {
        this.behaviorMatchedCount = behaviorMatchedCount;
        return this;
    }

    /**
     * **参数解释：** 该时间点行为检测的请求数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return behaviorMatchedCount
     */
    public Integer getBehaviorMatchedCount() {
        return behaviorMatchedCount;
    }

    public void setBehaviorMatchedCount(Integer behaviorMatchedCount) {
        this.behaviorMatchedCount = behaviorMatchedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BotRequestTimeline that = (BotRequestTimeline) obj;
        return Objects.equals(this.datetime, that.datetime)
            && Objects.equals(this.normalRequestCount, that.normalRequestCount)
            && Objects.equals(this.knownBotMatchedCount, that.knownBotMatchedCount)
            && Objects.equals(this.transparentMatchedCount, that.transparentMatchedCount)
            && Objects.equals(this.behaviorMatchedCount, that.behaviorMatchedCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(datetime, normalRequestCount, knownBotMatchedCount, transparentMatchedCount, behaviorMatchedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotRequestTimeline {\n");
        sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
        sb.append("    normalRequestCount: ").append(toIndentedString(normalRequestCount)).append("\n");
        sb.append("    knownBotMatchedCount: ").append(toIndentedString(knownBotMatchedCount)).append("\n");
        sb.append("    transparentMatchedCount: ").append(toIndentedString(transparentMatchedCount)).append("\n");
        sb.append("    behaviorMatchedCount: ").append(toIndentedString(behaviorMatchedCount)).append("\n");
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
