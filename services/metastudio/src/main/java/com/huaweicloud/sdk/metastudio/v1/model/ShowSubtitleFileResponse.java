package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSubtitleFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_state")

    private String jobState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_file_info")

    private List<SubtitleFileDetail> subtitleFileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowSubtitleFileResponse withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * 字幕文件所有任务状态。 * GENERATING：字幕文件任务生成中。 * GENERATED：字幕文件生成结束。
     * @return jobState
     */
    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public ShowSubtitleFileResponse withSubtitleFileInfo(List<SubtitleFileDetail> subtitleFileInfo) {
        this.subtitleFileInfo = subtitleFileInfo;
        return this;
    }

    public ShowSubtitleFileResponse addSubtitleFileInfoItem(SubtitleFileDetail subtitleFileInfoItem) {
        if (this.subtitleFileInfo == null) {
            this.subtitleFileInfo = new ArrayList<>();
        }
        this.subtitleFileInfo.add(subtitleFileInfoItem);
        return this;
    }

    public ShowSubtitleFileResponse withSubtitleFileInfo(Consumer<List<SubtitleFileDetail>> subtitleFileInfoSetter) {
        if (this.subtitleFileInfo == null) {
            this.subtitleFileInfo = new ArrayList<>();
        }
        subtitleFileInfoSetter.accept(this.subtitleFileInfo);
        return this;
    }

    /**
     * 字幕文件列表。
     * @return subtitleFileInfo
     */
    public List<SubtitleFileDetail> getSubtitleFileInfo() {
        return subtitleFileInfo;
    }

    public void setSubtitleFileInfo(List<SubtitleFileDetail> subtitleFileInfo) {
        this.subtitleFileInfo = subtitleFileInfo;
    }

    public ShowSubtitleFileResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubtitleFileResponse that = (ShowSubtitleFileResponse) obj;
        return Objects.equals(this.jobState, that.jobState)
            && Objects.equals(this.subtitleFileInfo, that.subtitleFileInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobState, subtitleFileInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubtitleFileResponse {\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    subtitleFileInfo: ").append(toIndentedString(subtitleFileInfo)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
