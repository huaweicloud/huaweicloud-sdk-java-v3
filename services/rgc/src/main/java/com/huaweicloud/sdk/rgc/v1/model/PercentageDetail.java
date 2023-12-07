package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Landing Zone设置的进度信息。
 */
public class PercentageDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_name")

    private String percentageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_status")

    private String percentageStatus;

    public PercentageDetail withPercentageName(String percentageName) {
        this.percentageName = percentageName;
        return this;
    }

    /**
     * 进度名称。
     * @return percentageName
     */
    public String getPercentageName() {
        return percentageName;
    }

    public void setPercentageName(String percentageName) {
        this.percentageName = percentageName;
    }

    public PercentageDetail withPercentageStatus(String percentageStatus) {
        this.percentageStatus = percentageStatus;
        return this;
    }

    /**
     * 进度状态。
     * @return percentageStatus
     */
    public String getPercentageStatus() {
        return percentageStatus;
    }

    public void setPercentageStatus(String percentageStatus) {
        this.percentageStatus = percentageStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PercentageDetail that = (PercentageDetail) obj;
        return Objects.equals(this.percentageName, that.percentageName)
            && Objects.equals(this.percentageStatus, that.percentageStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentageName, percentageStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PercentageDetail {\n");
        sb.append("    percentageName: ").append(toIndentedString(percentageName)).append("\n");
        sb.append("    percentageStatus: ").append(toIndentedString(percentageStatus)).append("\n");
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
