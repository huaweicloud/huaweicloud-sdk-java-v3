package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class FlavorSpotOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longest_spot_duration_hours")

    private Integer longestSpotDurationHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "largest_spot_duration_count")

    private Integer largestSpotDurationCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interruption_policy")

    private String interruptionPolicy;

    public FlavorSpotOptions withLongestSpotDurationHours(Integer longestSpotDurationHours) {
        this.longestSpotDurationHours = longestSpotDurationHours;
        return this;
    }

    /**
     * 购买的竞价实例时长
     * @return longestSpotDurationHours
     */
    public Integer getLongestSpotDurationHours() {
        return longestSpotDurationHours;
    }

    public void setLongestSpotDurationHours(Integer longestSpotDurationHours) {
        this.longestSpotDurationHours = longestSpotDurationHours;
    }

    public FlavorSpotOptions withLargestSpotDurationCount(Integer largestSpotDurationCount) {
        this.largestSpotDurationCount = largestSpotDurationCount;
        return this;
    }

    /**
     * 购买的“竞价实例时长”的个数。
     * @return largestSpotDurationCount
     */
    public Integer getLargestSpotDurationCount() {
        return largestSpotDurationCount;
    }

    public void setLargestSpotDurationCount(Integer largestSpotDurationCount) {
        this.largestSpotDurationCount = largestSpotDurationCount;
    }

    public FlavorSpotOptions withInterruptionPolicy(String interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    /**
     * 竞价实例中断策略。  - immediate：立即释放 - delay：延迟释放
     * @return interruptionPolicy
     */
    public String getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(String interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorSpotOptions flavorSpotOptions = (FlavorSpotOptions) o;
        return Objects.equals(this.longestSpotDurationHours, flavorSpotOptions.longestSpotDurationHours)
            && Objects.equals(this.largestSpotDurationCount, flavorSpotOptions.largestSpotDurationCount)
            && Objects.equals(this.interruptionPolicy, flavorSpotOptions.interruptionPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longestSpotDurationHours, largestSpotDurationCount, interruptionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorSpotOptions {\n");
        sb.append("    longestSpotDurationHours: ").append(toIndentedString(longestSpotDurationHours)).append("\n");
        sb.append("    largestSpotDurationCount: ").append(toIndentedString(largestSpotDurationCount)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
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
