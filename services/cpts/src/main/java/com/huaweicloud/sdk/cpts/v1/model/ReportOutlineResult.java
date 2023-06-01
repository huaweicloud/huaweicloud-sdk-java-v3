package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportOutlineResult
 */
public class ReportOutlineResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_message")

    private Object errMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outline")

    private ReportOutline outline;

    public ReportOutlineResult withErrMessage(Object errMessage) {
        this.errMessage = errMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errMessage
     */
    public Object getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(Object errMessage) {
        this.errMessage = errMessage;
    }

    public ReportOutlineResult withOutline(ReportOutline outline) {
        this.outline = outline;
        return this;
    }

    public ReportOutlineResult withOutline(Consumer<ReportOutline> outlineSetter) {
        if (this.outline == null) {
            this.outline = new ReportOutline();
            outlineSetter.accept(this.outline);
        }

        return this;
    }

    /**
     * Get outline
     * @return outline
     */
    public ReportOutline getOutline() {
        return outline;
    }

    public void setOutline(ReportOutline outline) {
        this.outline = outline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportOutlineResult reportOutlineResult = (ReportOutlineResult) o;
        return Objects.equals(this.errMessage, reportOutlineResult.errMessage)
            && Objects.equals(this.outline, reportOutlineResult.outline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errMessage, outline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportOutlineResult {\n");
        sb.append("    errMessage: ").append(toIndentedString(errMessage)).append("\n");
        sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
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
