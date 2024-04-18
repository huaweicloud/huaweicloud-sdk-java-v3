package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分身数字人推理预处理眼神矫正信息。
 */
public class InferenceEyeCorrectionMarkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eye_correction_start_time")

    private String eyeCorrectionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eye_correction_end_time")

    private String eyeCorrectionEndTime;

    public InferenceEyeCorrectionMarkInfo withEyeCorrectionStartTime(String eyeCorrectionStartTime) {
        this.eyeCorrectionStartTime = eyeCorrectionStartTime;
        return this;
    }

    /**
     * 选取推理数据预处理眼神矫正起始时间。格式：“HH:MM:SS.mmm”。
     * @return eyeCorrectionStartTime
     */
    public String getEyeCorrectionStartTime() {
        return eyeCorrectionStartTime;
    }

    public void setEyeCorrectionStartTime(String eyeCorrectionStartTime) {
        this.eyeCorrectionStartTime = eyeCorrectionStartTime;
    }

    public InferenceEyeCorrectionMarkInfo withEyeCorrectionEndTime(String eyeCorrectionEndTime) {
        this.eyeCorrectionEndTime = eyeCorrectionEndTime;
        return this;
    }

    /**
     * 选取推理数据预处理眼神矫正结束时间。格式：“HH:MM:SS.mmm”。
     * @return eyeCorrectionEndTime
     */
    public String getEyeCorrectionEndTime() {
        return eyeCorrectionEndTime;
    }

    public void setEyeCorrectionEndTime(String eyeCorrectionEndTime) {
        this.eyeCorrectionEndTime = eyeCorrectionEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferenceEyeCorrectionMarkInfo that = (InferenceEyeCorrectionMarkInfo) obj;
        return Objects.equals(this.eyeCorrectionStartTime, that.eyeCorrectionStartTime)
            && Objects.equals(this.eyeCorrectionEndTime, that.eyeCorrectionEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyeCorrectionStartTime, eyeCorrectionEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferenceEyeCorrectionMarkInfo {\n");
        sb.append("    eyeCorrectionStartTime: ").append(toIndentedString(eyeCorrectionStartTime)).append("\n");
        sb.append("    eyeCorrectionEndTime: ").append(toIndentedString(eyeCorrectionEndTime)).append("\n");
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
