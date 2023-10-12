package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频质量控制选项。
 */
public class DisplayOptionsVideoQualityOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_video_quality")

    private Integer averageVideoQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lowest_video_quality")

    private Integer lowestVideoQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "highest_video_quality")

    private Integer highestVideoQuality;

    public DisplayOptionsVideoQualityOptions withAverageVideoQuality(Integer averageVideoQuality) {
        this.averageVideoQuality = averageVideoQuality;
        return this;
    }

    /**
     * 视频平均质量。取值范围为[5-59]。默认：15。
     * minimum: 5
     * maximum: 59
     * @return averageVideoQuality
     */
    public Integer getAverageVideoQuality() {
        return averageVideoQuality;
    }

    public void setAverageVideoQuality(Integer averageVideoQuality) {
        this.averageVideoQuality = averageVideoQuality;
    }

    public DisplayOptionsVideoQualityOptions withLowestVideoQuality(Integer lowestVideoQuality) {
        this.lowestVideoQuality = lowestVideoQuality;
        return this;
    }

    /**
     * 视频最低质量。取值范围为[5-69]。默认：25。
     * minimum: 5
     * maximum: 69
     * @return lowestVideoQuality
     */
    public Integer getLowestVideoQuality() {
        return lowestVideoQuality;
    }

    public void setLowestVideoQuality(Integer lowestVideoQuality) {
        this.lowestVideoQuality = lowestVideoQuality;
    }

    public DisplayOptionsVideoQualityOptions withHighestVideoQuality(Integer highestVideoQuality) {
        this.highestVideoQuality = highestVideoQuality;
        return this;
    }

    /**
     * 视频最高质量。取值范围为[1-59]。默认：7。
     * minimum: 1
     * maximum: 59
     * @return highestVideoQuality
     */
    public Integer getHighestVideoQuality() {
        return highestVideoQuality;
    }

    public void setHighestVideoQuality(Integer highestVideoQuality) {
        this.highestVideoQuality = highestVideoQuality;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayOptionsVideoQualityOptions that = (DisplayOptionsVideoQualityOptions) obj;
        return Objects.equals(this.averageVideoQuality, that.averageVideoQuality)
            && Objects.equals(this.lowestVideoQuality, that.lowestVideoQuality)
            && Objects.equals(this.highestVideoQuality, that.highestVideoQuality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageVideoQuality, lowestVideoQuality, highestVideoQuality);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayOptionsVideoQualityOptions {\n");
        sb.append("    averageVideoQuality: ").append(toIndentedString(averageVideoQuality)).append("\n");
        sb.append("    lowestVideoQuality: ").append(toIndentedString(lowestVideoQuality)).append("\n");
        sb.append("    highestVideoQuality: ").append(toIndentedString(highestVideoQuality)).append("\n");
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
