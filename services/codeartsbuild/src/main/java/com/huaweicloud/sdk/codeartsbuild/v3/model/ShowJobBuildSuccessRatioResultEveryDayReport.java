package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowJobBuildSuccessRatioResultEveryDayReport
 */
public class ShowJobBuildSuccessRatioResultEveryDayReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ratio")

    private Integer successRatio;

    public ShowJobBuildSuccessRatioResultEveryDayReport withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ShowJobBuildSuccessRatioResultEveryDayReport withSuccessRatio(Integer successRatio) {
        this.successRatio = successRatio;
        return this;
    }

    /**
     * 成功率
     * @return successRatio
     */
    public Integer getSuccessRatio() {
        return successRatio;
    }

    public void setSuccessRatio(Integer successRatio) {
        this.successRatio = successRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobBuildSuccessRatioResultEveryDayReport that = (ShowJobBuildSuccessRatioResultEveryDayReport) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.successRatio, that.successRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, successRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobBuildSuccessRatioResultEveryDayReport {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    successRatio: ").append(toIndentedString(successRatio)).append("\n");
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
