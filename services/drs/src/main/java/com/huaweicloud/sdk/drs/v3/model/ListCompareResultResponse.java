package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCompareResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_level_compare_results")

    @JacksonXmlProperty(localName = "object_level_compare_results")

    private ObjectCompareResult objectLevelCompareResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_results")

    @JacksonXmlProperty(localName = "line_compare_results")

    private LineCompareResult lineCompareResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_results")

    @JacksonXmlProperty(localName = "content_compare_results")

    private ContentCompareResult contentCompareResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_list_results")

    @JacksonXmlProperty(localName = "compare_task_list_results")

    private CompareTaskListResult compareTaskListResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    public ListCompareResultResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListCompareResultResponse withObjectLevelCompareResults(ObjectCompareResult objectLevelCompareResults) {
        this.objectLevelCompareResults = objectLevelCompareResults;
        return this;
    }

    public ListCompareResultResponse withObjectLevelCompareResults(
        Consumer<ObjectCompareResult> objectLevelCompareResultsSetter) {
        if (this.objectLevelCompareResults == null) {
            this.objectLevelCompareResults = new ObjectCompareResult();
            objectLevelCompareResultsSetter.accept(this.objectLevelCompareResults);
        }

        return this;
    }

    /**
     * Get objectLevelCompareResults
     * @return objectLevelCompareResults
     */
    public ObjectCompareResult getObjectLevelCompareResults() {
        return objectLevelCompareResults;
    }

    public void setObjectLevelCompareResults(ObjectCompareResult objectLevelCompareResults) {
        this.objectLevelCompareResults = objectLevelCompareResults;
    }

    public ListCompareResultResponse withLineCompareResults(LineCompareResult lineCompareResults) {
        this.lineCompareResults = lineCompareResults;
        return this;
    }

    public ListCompareResultResponse withLineCompareResults(Consumer<LineCompareResult> lineCompareResultsSetter) {
        if (this.lineCompareResults == null) {
            this.lineCompareResults = new LineCompareResult();
            lineCompareResultsSetter.accept(this.lineCompareResults);
        }

        return this;
    }

    /**
     * Get lineCompareResults
     * @return lineCompareResults
     */
    public LineCompareResult getLineCompareResults() {
        return lineCompareResults;
    }

    public void setLineCompareResults(LineCompareResult lineCompareResults) {
        this.lineCompareResults = lineCompareResults;
    }

    public ListCompareResultResponse withContentCompareResults(ContentCompareResult contentCompareResults) {
        this.contentCompareResults = contentCompareResults;
        return this;
    }

    public ListCompareResultResponse withContentCompareResults(
        Consumer<ContentCompareResult> contentCompareResultsSetter) {
        if (this.contentCompareResults == null) {
            this.contentCompareResults = new ContentCompareResult();
            contentCompareResultsSetter.accept(this.contentCompareResults);
        }

        return this;
    }

    /**
     * Get contentCompareResults
     * @return contentCompareResults
     */
    public ContentCompareResult getContentCompareResults() {
        return contentCompareResults;
    }

    public void setContentCompareResults(ContentCompareResult contentCompareResults) {
        this.contentCompareResults = contentCompareResults;
    }

    public ListCompareResultResponse withCompareTaskListResults(CompareTaskListResult compareTaskListResults) {
        this.compareTaskListResults = compareTaskListResults;
        return this;
    }

    public ListCompareResultResponse withCompareTaskListResults(
        Consumer<CompareTaskListResult> compareTaskListResultsSetter) {
        if (this.compareTaskListResults == null) {
            this.compareTaskListResults = new CompareTaskListResult();
            compareTaskListResultsSetter.accept(this.compareTaskListResults);
        }

        return this;
    }

    /**
     * Get compareTaskListResults
     * @return compareTaskListResults
     */
    public CompareTaskListResult getCompareTaskListResults() {
        return compareTaskListResults;
    }

    public void setCompareTaskListResults(CompareTaskListResult compareTaskListResults) {
        this.compareTaskListResults = compareTaskListResults;
    }

    public ListCompareResultResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListCompareResultResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCompareResultResponse listCompareResultResponse = (ListCompareResultResponse) o;
        return Objects.equals(this.jobId, listCompareResultResponse.jobId)
            && Objects.equals(this.objectLevelCompareResults, listCompareResultResponse.objectLevelCompareResults)
            && Objects.equals(this.lineCompareResults, listCompareResultResponse.lineCompareResults)
            && Objects.equals(this.contentCompareResults, listCompareResultResponse.contentCompareResults)
            && Objects.equals(this.compareTaskListResults, listCompareResultResponse.compareTaskListResults)
            && Objects.equals(this.errorCode, listCompareResultResponse.errorCode)
            && Objects.equals(this.errorMsg, listCompareResultResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            objectLevelCompareResults,
            lineCompareResults,
            contentCompareResults,
            compareTaskListResults,
            errorCode,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCompareResultResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareResults: ").append(toIndentedString(objectLevelCompareResults)).append("\n");
        sb.append("    lineCompareResults: ").append(toIndentedString(lineCompareResults)).append("\n");
        sb.append("    contentCompareResults: ").append(toIndentedString(contentCompareResults)).append("\n");
        sb.append("    compareTaskListResults: ").append(toIndentedString(compareTaskListResults)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
