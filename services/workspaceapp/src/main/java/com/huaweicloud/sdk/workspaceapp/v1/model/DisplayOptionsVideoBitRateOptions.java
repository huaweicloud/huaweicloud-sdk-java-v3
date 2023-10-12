package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频码率控制选项。
 */
public class DisplayOptionsVideoBitRateOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_video_bit_rate")

    private Integer averageVideoBitRate;

    public DisplayOptionsVideoBitRateOptions withAverageVideoBitRate(Integer averageVideoBitRate) {
        this.averageVideoBitRate = averageVideoBitRate;
        return this;
    }

    /**
     * 视频平均码率（Kbps）。取值范围为[256-100000]。默认：18000。
     * minimum: 256
     * maximum: 100000
     * @return averageVideoBitRate
     */
    public Integer getAverageVideoBitRate() {
        return averageVideoBitRate;
    }

    public void setAverageVideoBitRate(Integer averageVideoBitRate) {
        this.averageVideoBitRate = averageVideoBitRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayOptionsVideoBitRateOptions that = (DisplayOptionsVideoBitRateOptions) obj;
        return Objects.equals(this.averageVideoBitRate, that.averageVideoBitRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageVideoBitRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayOptionsVideoBitRateOptions {\n");
        sb.append("    averageVideoBitRate: ").append(toIndentedString(averageVideoBitRate)).append("\n");
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
