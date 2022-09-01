package com.huaweicloud.sdk.res.v1.model;

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
public class ShowResDatasourceWorkDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    @JacksonXmlProperty(localName = "error_count")

    private ErrorCount errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_struct")

    @JacksonXmlProperty(localName = "data_struct")

    private DataStruct dataStruct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_samples")

    @JacksonXmlProperty(localName = "error_samples")

    private List<ErrorSample> errorSamples = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspect_result")

    @JacksonXmlProperty(localName = "inspect_result")

    private List<InspectResult> inspectResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_rate")

    @JacksonXmlProperty(localName = "legal_rate")

    private Double legalRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspect_rst_generated_time")

    @JacksonXmlProperty(localName = "inspect_rst_generated_time")

    private String inspectRstGeneratedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "final_report")

    @JacksonXmlProperty(localName = "final_report")

    private FinalReport finalReport;

    public ShowResDatasourceWorkDetailResponse withErrorCount(ErrorCount errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    public ShowResDatasourceWorkDetailResponse withErrorCount(Consumer<ErrorCount> errorCountSetter) {
        if (this.errorCount == null) {
            this.errorCount = new ErrorCount();
            errorCountSetter.accept(this.errorCount);
        }

        return this;
    }

    /**
     * Get errorCount
     * @return errorCount
     */
    public ErrorCount getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(ErrorCount errorCount) {
        this.errorCount = errorCount;
    }

    public ShowResDatasourceWorkDetailResponse withDataStruct(DataStruct dataStruct) {
        this.dataStruct = dataStruct;
        return this;
    }

    public ShowResDatasourceWorkDetailResponse withDataStruct(Consumer<DataStruct> dataStructSetter) {
        if (this.dataStruct == null) {
            this.dataStruct = new DataStruct();
            dataStructSetter.accept(this.dataStruct);
        }

        return this;
    }

    /**
     * Get dataStruct
     * @return dataStruct
     */
    public DataStruct getDataStruct() {
        return dataStruct;
    }

    public void setDataStruct(DataStruct dataStruct) {
        this.dataStruct = dataStruct;
    }

    public ShowResDatasourceWorkDetailResponse withErrorSamples(List<ErrorSample> errorSamples) {
        this.errorSamples = errorSamples;
        return this;
    }

    public ShowResDatasourceWorkDetailResponse addErrorSamplesItem(ErrorSample errorSamplesItem) {
        if (this.errorSamples == null) {
            this.errorSamples = new ArrayList<>();
        }
        this.errorSamples.add(errorSamplesItem);
        return this;
    }

    public ShowResDatasourceWorkDetailResponse withErrorSamples(Consumer<List<ErrorSample>> errorSamplesSetter) {
        if (this.errorSamples == null) {
            this.errorSamples = new ArrayList<>();
        }
        errorSamplesSetter.accept(this.errorSamples);
        return this;
    }

    /**
     * 错误样例(请求类型为DATA_INSPECTION时返回)。
     * @return errorSamples
     */
    public List<ErrorSample> getErrorSamples() {
        return errorSamples;
    }

    public void setErrorSamples(List<ErrorSample> errorSamples) {
        this.errorSamples = errorSamples;
    }

    public ShowResDatasourceWorkDetailResponse withInspectResult(List<InspectResult> inspectResult) {
        this.inspectResult = inspectResult;
        return this;
    }

    public ShowResDatasourceWorkDetailResponse addInspectResultItem(InspectResult inspectResultItem) {
        if (this.inspectResult == null) {
            this.inspectResult = new ArrayList<>();
        }
        this.inspectResult.add(inspectResultItem);
        return this;
    }

    public ShowResDatasourceWorkDetailResponse withInspectResult(Consumer<List<InspectResult>> inspectResultSetter) {
        if (this.inspectResult == null) {
            this.inspectResult = new ArrayList<>();
        }
        inspectResultSetter.accept(this.inspectResult);
        return this;
    }

    /**
     * 数据检测结果(请求类型为DATA_INSPECTION时返回)。
     * @return inspectResult
     */
    public List<InspectResult> getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(List<InspectResult> inspectResult) {
        this.inspectResult = inspectResult;
    }

    public ShowResDatasourceWorkDetailResponse withIsSuccess(Boolean isSuccess) {
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

    public ShowResDatasourceWorkDetailResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowResDatasourceWorkDetailResponse withLegalRate(Double legalRate) {
        this.legalRate = legalRate;
        return this;
    }

    /**
     * 合法率(请求类型为DATA_INSPECTION时返回)。
     * @return legalRate
     */
    public Double getLegalRate() {
        return legalRate;
    }

    public void setLegalRate(Double legalRate) {
        this.legalRate = legalRate;
    }

    public ShowResDatasourceWorkDetailResponse withInspectRstGeneratedTime(String inspectRstGeneratedTime) {
        this.inspectRstGeneratedTime = inspectRstGeneratedTime;
        return this;
    }

    /**
     * 检测结果生成时间(请求类型为DATA_INSPECTION时返回)。
     * @return inspectRstGeneratedTime
     */
    public String getInspectRstGeneratedTime() {
        return inspectRstGeneratedTime;
    }

    public void setInspectRstGeneratedTime(String inspectRstGeneratedTime) {
        this.inspectRstGeneratedTime = inspectRstGeneratedTime;
    }

    public ShowResDatasourceWorkDetailResponse withFinalReport(FinalReport finalReport) {
        this.finalReport = finalReport;
        return this;
    }

    public ShowResDatasourceWorkDetailResponse withFinalReport(Consumer<FinalReport> finalReportSetter) {
        if (this.finalReport == null) {
            this.finalReport = new FinalReport();
            finalReportSetter.accept(this.finalReport);
        }

        return this;
    }

    /**
     * Get finalReport
     * @return finalReport
     */
    public FinalReport getFinalReport() {
        return finalReport;
    }

    public void setFinalReport(FinalReport finalReport) {
        this.finalReport = finalReport;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResDatasourceWorkDetailResponse showResDatasourceWorkDetailResponse =
            (ShowResDatasourceWorkDetailResponse) o;
        return Objects.equals(this.errorCount, showResDatasourceWorkDetailResponse.errorCount)
            && Objects.equals(this.dataStruct, showResDatasourceWorkDetailResponse.dataStruct)
            && Objects.equals(this.errorSamples, showResDatasourceWorkDetailResponse.errorSamples)
            && Objects.equals(this.inspectResult, showResDatasourceWorkDetailResponse.inspectResult)
            && Objects.equals(this.isSuccess, showResDatasourceWorkDetailResponse.isSuccess)
            && Objects.equals(this.message, showResDatasourceWorkDetailResponse.message)
            && Objects.equals(this.legalRate, showResDatasourceWorkDetailResponse.legalRate)
            && Objects.equals(this.inspectRstGeneratedTime, showResDatasourceWorkDetailResponse.inspectRstGeneratedTime)
            && Objects.equals(this.finalReport, showResDatasourceWorkDetailResponse.finalReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCount,
            dataStruct,
            errorSamples,
            inspectResult,
            isSuccess,
            message,
            legalRate,
            inspectRstGeneratedTime,
            finalReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResDatasourceWorkDetailResponse {\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    dataStruct: ").append(toIndentedString(dataStruct)).append("\n");
        sb.append("    errorSamples: ").append(toIndentedString(errorSamples)).append("\n");
        sb.append("    inspectResult: ").append(toIndentedString(inspectResult)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    legalRate: ").append(toIndentedString(legalRate)).append("\n");
        sb.append("    inspectRstGeneratedTime: ").append(toIndentedString(inspectRstGeneratedTime)).append("\n");
        sb.append("    finalReport: ").append(toIndentedString(finalReport)).append("\n");
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
