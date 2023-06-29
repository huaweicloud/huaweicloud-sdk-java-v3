package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseReportSummary
 */
public class CaseReportSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_aw_info_list")

    private List<CaseAwInfo> caseAwInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_message")

    private String errMessage;

    public CaseReportSummary withCaseAwInfoList(List<CaseAwInfo> caseAwInfoList) {
        this.caseAwInfoList = caseAwInfoList;
        return this;
    }

    public CaseReportSummary addCaseAwInfoListItem(CaseAwInfo caseAwInfoListItem) {
        if (this.caseAwInfoList == null) {
            this.caseAwInfoList = new ArrayList<>();
        }
        this.caseAwInfoList.add(caseAwInfoListItem);
        return this;
    }

    public CaseReportSummary withCaseAwInfoList(Consumer<List<CaseAwInfo>> caseAwInfoListSetter) {
        if (this.caseAwInfoList == null) {
            this.caseAwInfoList = new ArrayList<>();
        }
        caseAwInfoListSetter.accept(this.caseAwInfoList);
        return this;
    }

    /**
     * 用例和aw信息视图
     * @return caseAwInfoList
     */
    public List<CaseAwInfo> getCaseAwInfoList() {
        return caseAwInfoList;
    }

    public void setCaseAwInfoList(List<CaseAwInfo> caseAwInfoList) {
        this.caseAwInfoList = caseAwInfoList;
    }

    public CaseReportSummary withErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errMessage
     */
    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseReportSummary that = (CaseReportSummary) obj;
        return Objects.equals(this.caseAwInfoList, that.caseAwInfoList)
            && Objects.equals(this.errMessage, that.errMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseAwInfoList, errMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseReportSummary {\n");
        sb.append("    caseAwInfoList: ").append(toIndentedString(caseAwInfoList)).append("\n");
        sb.append("    errMessage: ").append(toIndentedString(errMessage)).append("\n");
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
