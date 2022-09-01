package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportInfo
 */
public class ReportInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokens")

    @JacksonXmlProperty(localName = "brokens")

    private ReportbrokensInfo brokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    @JacksonXmlProperty(localName = "details")

    private ReportdetailsInfo details;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outline")

    @JacksonXmlProperty(localName = "outline")

    private ReportoutlineInfo outline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtproportion")

    @JacksonXmlProperty(localName = "rtproportion")

    private String rtproportion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskInfo")

    @JacksonXmlProperty(localName = "taskInfo")

    private ReportTaskInfo taskInfo;

    public ReportInfo withBrokens(ReportbrokensInfo brokens) {
        this.brokens = brokens;
        return this;
    }

    public ReportInfo withBrokens(Consumer<ReportbrokensInfo> brokensSetter) {
        if (this.brokens == null) {
            this.brokens = new ReportbrokensInfo();
            brokensSetter.accept(this.brokens);
        }

        return this;
    }

    /**
     * Get brokens
     * @return brokens
     */
    public ReportbrokensInfo getBrokens() {
        return brokens;
    }

    public void setBrokens(ReportbrokensInfo brokens) {
        this.brokens = brokens;
    }

    public ReportInfo withDetails(ReportdetailsInfo details) {
        this.details = details;
        return this;
    }

    public ReportInfo withDetails(Consumer<ReportdetailsInfo> detailsSetter) {
        if (this.details == null) {
            this.details = new ReportdetailsInfo();
            detailsSetter.accept(this.details);
        }

        return this;
    }

    /**
     * Get details
     * @return details
     */
    public ReportdetailsInfo getDetails() {
        return details;
    }

    public void setDetails(ReportdetailsInfo details) {
        this.details = details;
    }

    public ReportInfo withOutline(ReportoutlineInfo outline) {
        this.outline = outline;
        return this;
    }

    public ReportInfo withOutline(Consumer<ReportoutlineInfo> outlineSetter) {
        if (this.outline == null) {
            this.outline = new ReportoutlineInfo();
            outlineSetter.accept(this.outline);
        }

        return this;
    }

    /**
     * Get outline
     * @return outline
     */
    public ReportoutlineInfo getOutline() {
        return outline;
    }

    public void setOutline(ReportoutlineInfo outline) {
        this.outline = outline;
    }

    public ReportInfo withRtproportion(String rtproportion) {
        this.rtproportion = rtproportion;
        return this;
    }

    /**
     * 响应时间分布
     * @return rtproportion
     */
    public String getRtproportion() {
        return rtproportion;
    }

    public void setRtproportion(String rtproportion) {
        this.rtproportion = rtproportion;
    }

    public ReportInfo withTaskInfo(ReportTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public ReportInfo withTaskInfo(Consumer<ReportTaskInfo> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new ReportTaskInfo();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public ReportTaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(ReportTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportInfo reportInfo = (ReportInfo) o;
        return Objects.equals(this.brokens, reportInfo.brokens) && Objects.equals(this.details, reportInfo.details)
            && Objects.equals(this.outline, reportInfo.outline)
            && Objects.equals(this.rtproportion, reportInfo.rtproportion)
            && Objects.equals(this.taskInfo, reportInfo.taskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokens, details, outline, rtproportion, taskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportInfo {\n");
        sb.append("    brokens: ").append(toIndentedString(brokens)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
        sb.append("    rtproportion: ").append(toIndentedString(rtproportion)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
