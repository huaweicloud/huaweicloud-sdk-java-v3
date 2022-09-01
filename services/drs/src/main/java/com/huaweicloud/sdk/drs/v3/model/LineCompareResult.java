package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class LineCompareResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    @JacksonXmlProperty(localName = "compare_task_id")

    private String compareTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_overview")

    @JacksonXmlProperty(localName = "line_compare_overview")

    private List<LineCompareResultOverview> lineCompareOverview = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_overview_count")

    @JacksonXmlProperty(localName = "line_compare_overview_count")

    private Integer lineCompareOverviewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_details")

    @JacksonXmlProperty(localName = "line_compare_details")

    private List<LineCompareResultDetails> lineCompareDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    public LineCompareResult withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    /**
     * 行对比任务的id。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public LineCompareResult withLineCompareOverview(List<LineCompareResultOverview> lineCompareOverview) {
        this.lineCompareOverview = lineCompareOverview;
        return this;
    }

    public LineCompareResult addLineCompareOverviewItem(LineCompareResultOverview lineCompareOverviewItem) {
        if (this.lineCompareOverview == null) {
            this.lineCompareOverview = new ArrayList<>();
        }
        this.lineCompareOverview.add(lineCompareOverviewItem);
        return this;
    }

    public LineCompareResult withLineCompareOverview(
        Consumer<List<LineCompareResultOverview>> lineCompareOverviewSetter) {
        if (this.lineCompareOverview == null) {
            this.lineCompareOverview = new ArrayList<>();
        }
        lineCompareOverviewSetter.accept(this.lineCompareOverview);
        return this;
    }

    /**
     * 行对比结果概览。
     * @return lineCompareOverview
     */
    public List<LineCompareResultOverview> getLineCompareOverview() {
        return lineCompareOverview;
    }

    public void setLineCompareOverview(List<LineCompareResultOverview> lineCompareOverview) {
        this.lineCompareOverview = lineCompareOverview;
    }

    public LineCompareResult withLineCompareOverviewCount(Integer lineCompareOverviewCount) {
        this.lineCompareOverviewCount = lineCompareOverviewCount;
        return this;
    }

    /**
     * 行对比结果概览总数。
     * @return lineCompareOverviewCount
     */
    public Integer getLineCompareOverviewCount() {
        return lineCompareOverviewCount;
    }

    public void setLineCompareOverviewCount(Integer lineCompareOverviewCount) {
        this.lineCompareOverviewCount = lineCompareOverviewCount;
    }

    public LineCompareResult withLineCompareDetails(List<LineCompareResultDetails> lineCompareDetails) {
        this.lineCompareDetails = lineCompareDetails;
        return this;
    }

    public LineCompareResult addLineCompareDetailsItem(LineCompareResultDetails lineCompareDetailsItem) {
        if (this.lineCompareDetails == null) {
            this.lineCompareDetails = new ArrayList<>();
        }
        this.lineCompareDetails.add(lineCompareDetailsItem);
        return this;
    }

    public LineCompareResult withLineCompareDetails(Consumer<List<LineCompareResultDetails>> lineCompareDetailsSetter) {
        if (this.lineCompareDetails == null) {
            this.lineCompareDetails = new ArrayList<>();
        }
        lineCompareDetailsSetter.accept(this.lineCompareDetails);
        return this;
    }

    /**
     * 行对比结果详情。
     * @return lineCompareDetails
     */
    public List<LineCompareResultDetails> getLineCompareDetails() {
        return lineCompareDetails;
    }

    public void setLineCompareDetails(List<LineCompareResultDetails> lineCompareDetails) {
        this.lineCompareDetails = lineCompareDetails;
    }

    public LineCompareResult withErrorCode(String errorCode) {
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

    public LineCompareResult withErrorMsg(String errorMsg) {
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
        LineCompareResult lineCompareResult = (LineCompareResult) o;
        return Objects.equals(this.compareTaskId, lineCompareResult.compareTaskId)
            && Objects.equals(this.lineCompareOverview, lineCompareResult.lineCompareOverview)
            && Objects.equals(this.lineCompareOverviewCount, lineCompareResult.lineCompareOverviewCount)
            && Objects.equals(this.lineCompareDetails, lineCompareResult.lineCompareDetails)
            && Objects.equals(this.errorCode, lineCompareResult.errorCode)
            && Objects.equals(this.errorMsg, lineCompareResult.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId,
            lineCompareOverview,
            lineCompareOverviewCount,
            lineCompareDetails,
            errorCode,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineCompareResult {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    lineCompareOverview: ").append(toIndentedString(lineCompareOverview)).append("\n");
        sb.append("    lineCompareOverviewCount: ").append(toIndentedString(lineCompareOverviewCount)).append("\n");
        sb.append("    lineCompareDetails: ").append(toIndentedString(lineCompareDetails)).append("\n");
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
