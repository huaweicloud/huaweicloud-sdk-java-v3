package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListFlinkJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private String isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

    private FlinkJobList jobList;

    public ListFlinkJobsResponse withIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 参数解释:  执行请求是否成功。“true”表示请求执行成功 示例: true 约束限制:  无 取值范围: true,false 默认取值: 无
     * @return isSuccess
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListFlinkJobsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 参数解释:  系统提示信息，执行成功时，信息可能为空 示例: success 约束限制:  无 取值范围: 无 默认取值: 无
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListFlinkJobsResponse withJobList(FlinkJobList jobList) {
        this.jobList = jobList;
        return this;
    }

    public ListFlinkJobsResponse withJobList(Consumer<FlinkJobList> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new FlinkJobList();
            jobListSetter.accept(this.jobList);
        }

        return this;
    }

    /**
     * Get jobList
     * @return jobList
     */
    public FlinkJobList getJobList() {
        return jobList;
    }

    public void setJobList(FlinkJobList jobList) {
        this.jobList = jobList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobsResponse that = (ListFlinkJobsResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobList, that.jobList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
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
