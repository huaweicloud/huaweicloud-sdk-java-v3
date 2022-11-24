package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_detail")

    private ShowStreamJobDetailJob jobDetail;

    public ShowFlinkJobResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowFlinkJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowFlinkJobResponse withJobDetail(ShowStreamJobDetailJob jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }

    public ShowFlinkJobResponse withJobDetail(Consumer<ShowStreamJobDetailJob> jobDetailSetter) {
        if (this.jobDetail == null) {
            this.jobDetail = new ShowStreamJobDetailJob();
            jobDetailSetter.accept(this.jobDetail);
        }

        return this;
    }

    /**
     * Get jobDetail
     * @return jobDetail
     */
    public ShowStreamJobDetailJob getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(ShowStreamJobDetailJob jobDetail) {
        this.jobDetail = jobDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFlinkJobResponse showFlinkJobResponse = (ShowFlinkJobResponse) o;
        return Objects.equals(this.isSuccess, showFlinkJobResponse.isSuccess)
            && Objects.equals(this.message, showFlinkJobResponse.message)
            && Objects.equals(this.jobDetail, showFlinkJobResponse.jobDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkJobResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobDetail: ").append(toIndentedString(jobDetail)).append("\n");
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
