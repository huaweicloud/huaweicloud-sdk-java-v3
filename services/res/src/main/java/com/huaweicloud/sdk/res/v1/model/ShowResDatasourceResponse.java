package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResDatasourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private Datasources datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<Jobs> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ShowResDatasourceResponse withDatasource(Datasources datasource) {
        this.datasource = datasource;
        return this;
    }

    public ShowResDatasourceResponse withDatasource(Consumer<Datasources> datasourceSetter) {
        if (this.datasource == null) {
            this.datasource = new Datasources();
            datasourceSetter.accept(this.datasource);
        }

        return this;
    }

    /**
     * Get datasource
     * @return datasource
     */
    public Datasources getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasources datasource) {
        this.datasource = datasource;
    }

    public ShowResDatasourceResponse withJobs(List<Jobs> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowResDatasourceResponse addJobsItem(Jobs jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ShowResDatasourceResponse withJobs(Consumer<List<Jobs>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 数据源相关任务详情。
     * @return jobs
     */
    public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }

    public ShowResDatasourceResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowResDatasourceResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息（请求成功时，不返回此字段）。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowResDatasourceResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码（请求成功时，不返回此字段）。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResDatasourceResponse showResDatasourceResponse = (ShowResDatasourceResponse) o;
        return Objects.equals(this.datasource, showResDatasourceResponse.datasource)
            && Objects.equals(this.jobs, showResDatasourceResponse.jobs)
            && Objects.equals(this.isSuccess, showResDatasourceResponse.isSuccess)
            && Objects.equals(this.message, showResDatasourceResponse.message)
            && Objects.equals(this.errorCode, showResDatasourceResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasource, jobs, isSuccess, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResDatasourceResponse {\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
