package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangingTheDelayThresholdRequestBody
 */
public class ChangingTheDelayThresholdRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_threshold_in_kilobytes")

    private Integer delayThresholdInKilobytes;

    public ChangingTheDelayThresholdRequestBody withDelayThresholdInKilobytes(Integer delayThresholdInKilobytes) {
        this.delayThresholdInKilobytes = delayThresholdInKilobytes;
        return this;
    }

    /**
     * 延时阈值（单位：KB），取值范围为0~10485760。
     * @return delayThresholdInKilobytes
     */
    public Integer getDelayThresholdInKilobytes() {
        return delayThresholdInKilobytes;
    }

    public void setDelayThresholdInKilobytes(Integer delayThresholdInKilobytes) {
        this.delayThresholdInKilobytes = delayThresholdInKilobytes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangingTheDelayThresholdRequestBody changingTheDelayThresholdRequestBody =
            (ChangingTheDelayThresholdRequestBody) o;
        return Objects.equals(this.delayThresholdInKilobytes,
            changingTheDelayThresholdRequestBody.delayThresholdInKilobytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delayThresholdInKilobytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangingTheDelayThresholdRequestBody {\n");
        sb.append("    delayThresholdInKilobytes: ").append(toIndentedString(delayThresholdInKilobytes)).append("\n");
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
