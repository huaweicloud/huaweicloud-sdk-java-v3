package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ContentCompareResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    private String compareTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_overview")

    private List<ContentCompareResultOverview> contentCompareOverview = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_overview_count")

    private Integer contentCompareOverviewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_details")

    private List<ContentCompareResultDetails> contentCompareDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_diffs")

    private List<ContentCompareResultDiffs> contentCompareDiffs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ContentCompareResult withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    /** 内容对比的任务id。
     * 
     * @return compareTaskId */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public ContentCompareResult withContentCompareOverview(List<ContentCompareResultOverview> contentCompareOverview) {
        this.contentCompareOverview = contentCompareOverview;
        return this;
    }

    public ContentCompareResult addContentCompareOverviewItem(ContentCompareResultOverview contentCompareOverviewItem) {
        if (this.contentCompareOverview == null) {
            this.contentCompareOverview = new ArrayList<>();
        }
        this.contentCompareOverview.add(contentCompareOverviewItem);
        return this;
    }

    public ContentCompareResult withContentCompareOverview(
        Consumer<List<ContentCompareResultOverview>> contentCompareOverviewSetter) {
        if (this.contentCompareOverview == null) {
            this.contentCompareOverview = new ArrayList<>();
        }
        contentCompareOverviewSetter.accept(this.contentCompareOverview);
        return this;
    }

    /** 内容对比结果概览。
     * 
     * @return contentCompareOverview */
    public List<ContentCompareResultOverview> getContentCompareOverview() {
        return contentCompareOverview;
    }

    public void setContentCompareOverview(List<ContentCompareResultOverview> contentCompareOverview) {
        this.contentCompareOverview = contentCompareOverview;
    }

    public ContentCompareResult withContentCompareOverviewCount(Integer contentCompareOverviewCount) {
        this.contentCompareOverviewCount = contentCompareOverviewCount;
        return this;
    }

    /** 内容对比结果概览总数。
     * 
     * @return contentCompareOverviewCount */
    public Integer getContentCompareOverviewCount() {
        return contentCompareOverviewCount;
    }

    public void setContentCompareOverviewCount(Integer contentCompareOverviewCount) {
        this.contentCompareOverviewCount = contentCompareOverviewCount;
    }

    public ContentCompareResult withContentCompareDetails(List<ContentCompareResultDetails> contentCompareDetails) {
        this.contentCompareDetails = contentCompareDetails;
        return this;
    }

    public ContentCompareResult addContentCompareDetailsItem(ContentCompareResultDetails contentCompareDetailsItem) {
        if (this.contentCompareDetails == null) {
            this.contentCompareDetails = new ArrayList<>();
        }
        this.contentCompareDetails.add(contentCompareDetailsItem);
        return this;
    }

    public ContentCompareResult withContentCompareDetails(
        Consumer<List<ContentCompareResultDetails>> contentCompareDetailsSetter) {
        if (this.contentCompareDetails == null) {
            this.contentCompareDetails = new ArrayList<>();
        }
        contentCompareDetailsSetter.accept(this.contentCompareDetails);
        return this;
    }

    /** 内容对比结果详情。
     * 
     * @return contentCompareDetails */
    public List<ContentCompareResultDetails> getContentCompareDetails() {
        return contentCompareDetails;
    }

    public void setContentCompareDetails(List<ContentCompareResultDetails> contentCompareDetails) {
        this.contentCompareDetails = contentCompareDetails;
    }

    public ContentCompareResult withContentCompareDiffs(List<ContentCompareResultDiffs> contentCompareDiffs) {
        this.contentCompareDiffs = contentCompareDiffs;
        return this;
    }

    public ContentCompareResult addContentCompareDiffsItem(ContentCompareResultDiffs contentCompareDiffsItem) {
        if (this.contentCompareDiffs == null) {
            this.contentCompareDiffs = new ArrayList<>();
        }
        this.contentCompareDiffs.add(contentCompareDiffsItem);
        return this;
    }

    public ContentCompareResult withContentCompareDiffs(
        Consumer<List<ContentCompareResultDiffs>> contentCompareDiffsSetter) {
        if (this.contentCompareDiffs == null) {
            this.contentCompareDiffs = new ArrayList<>();
        }
        contentCompareDiffsSetter.accept(this.contentCompareDiffs);
        return this;
    }

    /** 内容对比结果差异。
     * 
     * @return contentCompareDiffs */
    public List<ContentCompareResultDiffs> getContentCompareDiffs() {
        return contentCompareDiffs;
    }

    public void setContentCompareDiffs(List<ContentCompareResultDiffs> contentCompareDiffs) {
        this.contentCompareDiffs = contentCompareDiffs;
    }

    public ContentCompareResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码。
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ContentCompareResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /** 错误信息。
     * 
     * @return errorMsg */
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
        ContentCompareResult contentCompareResult = (ContentCompareResult) o;
        return Objects.equals(this.compareTaskId, contentCompareResult.compareTaskId)
            && Objects.equals(this.contentCompareOverview, contentCompareResult.contentCompareOverview)
            && Objects.equals(this.contentCompareOverviewCount, contentCompareResult.contentCompareOverviewCount)
            && Objects.equals(this.contentCompareDetails, contentCompareResult.contentCompareDetails)
            && Objects.equals(this.contentCompareDiffs, contentCompareResult.contentCompareDiffs)
            && Objects.equals(this.errorCode, contentCompareResult.errorCode)
            && Objects.equals(this.errorMsg, contentCompareResult.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId,
            contentCompareOverview,
            contentCompareOverviewCount,
            contentCompareDetails,
            contentCompareDiffs,
            errorCode,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareResult {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    contentCompareOverview: ").append(toIndentedString(contentCompareOverview)).append("\n");
        sb.append("    contentCompareOverviewCount: ")
            .append(toIndentedString(contentCompareOverviewCount))
            .append("\n");
        sb.append("    contentCompareDetails: ").append(toIndentedString(contentCompareDetails)).append("\n");
        sb.append("    contentCompareDiffs: ").append(toIndentedString(contentCompareDiffs)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
