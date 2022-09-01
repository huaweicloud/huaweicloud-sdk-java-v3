package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportFlinkJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mapping")

    @JacksonXmlProperty(localName = "job_mapping")

    private List<ImportRspJob> jobMapping = null;

    public ImportFlinkJobResponse withIsSuccess(Boolean isSuccess) {
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

    public ImportFlinkJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ImportFlinkJobResponse withJobMapping(List<ImportRspJob> jobMapping) {
        this.jobMapping = jobMapping;
        return this;
    }

    public ImportFlinkJobResponse addJobMappingItem(ImportRspJob jobMappingItem) {
        if (this.jobMapping == null) {
            this.jobMapping = new ArrayList<>();
        }
        this.jobMapping.add(jobMappingItem);
        return this;
    }

    public ImportFlinkJobResponse withJobMapping(Consumer<List<ImportRspJob>> jobMappingSetter) {
        if (this.jobMapping == null) {
            this.jobMapping = new ArrayList<>();
        }
        jobMappingSetter.accept(this.jobMapping);
        return this;
    }

    /**
     * 作业导入结果。
     * @return jobMapping
     */
    public List<ImportRspJob> getJobMapping() {
        return jobMapping;
    }

    public void setJobMapping(List<ImportRspJob> jobMapping) {
        this.jobMapping = jobMapping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportFlinkJobResponse importFlinkJobResponse = (ImportFlinkJobResponse) o;
        return Objects.equals(this.isSuccess, importFlinkJobResponse.isSuccess)
            && Objects.equals(this.message, importFlinkJobResponse.message)
            && Objects.equals(this.jobMapping, importFlinkJobResponse.jobMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFlinkJobResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobMapping: ").append(toIndentedString(jobMapping)).append("\n");
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
