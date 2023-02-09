package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobSuccessRatioResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ratio")

    private Double successRatio;

    public ShowJobSuccessRatioResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 任务成功构建次数
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ShowJobSuccessRatioResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 任务构建总次数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowJobSuccessRatioResponse withSuccessRatio(Double successRatio) {
        this.successRatio = successRatio;
        return this;
    }

    /**
     * 任务成功率,精确到小数点后两位
     * @return successRatio
     */
    public Double getSuccessRatio() {
        return successRatio;
    }

    public void setSuccessRatio(Double successRatio) {
        this.successRatio = successRatio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobSuccessRatioResponse showJobSuccessRatioResponse = (ShowJobSuccessRatioResponse) o;
        return Objects.equals(this.successCount, showJobSuccessRatioResponse.successCount)
            && Objects.equals(this.totalCount, showJobSuccessRatioResponse.totalCount)
            && Objects.equals(this.successRatio, showJobSuccessRatioResponse.successRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successCount, totalCount, successRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobSuccessRatioResponse {\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
