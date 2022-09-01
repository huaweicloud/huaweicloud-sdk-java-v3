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
public class CompareTaskListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CompareTaskList")

    @JacksonXmlProperty(localName = "CompareTaskList")

    private List<CompareTaskList> compareTaskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_list_count")

    @JacksonXmlProperty(localName = "compare_task_list_count")

    private Integer compareTaskListCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    public CompareTaskListResult withCompareTaskList(List<CompareTaskList> compareTaskList) {
        this.compareTaskList = compareTaskList;
        return this;
    }

    public CompareTaskListResult addCompareTaskListItem(CompareTaskList compareTaskListItem) {
        if (this.compareTaskList == null) {
            this.compareTaskList = new ArrayList<>();
        }
        this.compareTaskList.add(compareTaskListItem);
        return this;
    }

    public CompareTaskListResult withCompareTaskList(Consumer<List<CompareTaskList>> compareTaskListSetter) {
        if (this.compareTaskList == null) {
            this.compareTaskList = new ArrayList<>();
        }
        compareTaskListSetter.accept(this.compareTaskList);
        return this;
    }

    /**
     * 对比任务列表。
     * @return compareTaskList
     */
    public List<CompareTaskList> getCompareTaskList() {
        return compareTaskList;
    }

    public void setCompareTaskList(List<CompareTaskList> compareTaskList) {
        this.compareTaskList = compareTaskList;
    }

    public CompareTaskListResult withCompareTaskListCount(Integer compareTaskListCount) {
        this.compareTaskListCount = compareTaskListCount;
        return this;
    }

    /**
     * 对比任务列表总数。
     * @return compareTaskListCount
     */
    public Integer getCompareTaskListCount() {
        return compareTaskListCount;
    }

    public void setCompareTaskListCount(Integer compareTaskListCount) {
        this.compareTaskListCount = compareTaskListCount;
    }

    public CompareTaskListResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public CompareTaskListResult withErrorCode(String errorCode) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareTaskListResult compareTaskListResult = (CompareTaskListResult) o;
        return Objects.equals(this.compareTaskList, compareTaskListResult.compareTaskList)
            && Objects.equals(this.compareTaskListCount, compareTaskListResult.compareTaskListCount)
            && Objects.equals(this.errorMsg, compareTaskListResult.errorMsg)
            && Objects.equals(this.errorCode, compareTaskListResult.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskList, compareTaskListCount, errorMsg, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareTaskListResult {\n");
        sb.append("    compareTaskList: ").append(toIndentedString(compareTaskList)).append("\n");
        sb.append("    compareTaskListCount: ").append(toIndentedString(compareTaskListCount)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
