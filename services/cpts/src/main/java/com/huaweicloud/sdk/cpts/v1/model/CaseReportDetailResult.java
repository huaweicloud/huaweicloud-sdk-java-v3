package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseReportDetailResult
 */
public class CaseReportDetailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private CaseReportDetails detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_message")

    private String errMessage;

    public CaseReportDetailResult withDetail(CaseReportDetails detail) {
        this.detail = detail;
        return this;
    }

    public CaseReportDetailResult withDetail(Consumer<CaseReportDetails> detailSetter) {
        if (this.detail == null) {
            this.detail = new CaseReportDetails();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public CaseReportDetails getDetail() {
        return detail;
    }

    public void setDetail(CaseReportDetails detail) {
        this.detail = detail;
    }

    public CaseReportDetailResult withErrMessage(String errMessage) {
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
        CaseReportDetailResult that = (CaseReportDetailResult) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.errMessage, that.errMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, errMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseReportDetailResult {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
