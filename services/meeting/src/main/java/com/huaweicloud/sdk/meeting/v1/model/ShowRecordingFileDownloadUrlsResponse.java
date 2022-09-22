package com.huaweicloud.sdk.meeting.v1.model;

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
public class ShowRecordingFileDownloadUrlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordUrls")

    private List<RecordDownloadInfoBO> recordUrls = null;

    public ShowRecordingFileDownloadUrlsResponse withRecordUrls(List<RecordDownloadInfoBO> recordUrls) {
        this.recordUrls = recordUrls;
        return this;
    }

    public ShowRecordingFileDownloadUrlsResponse addRecordUrlsItem(RecordDownloadInfoBO recordUrlsItem) {
        if (this.recordUrls == null) {
            this.recordUrls = new ArrayList<>();
        }
        this.recordUrls.add(recordUrlsItem);
        return this;
    }

    public ShowRecordingFileDownloadUrlsResponse withRecordUrls(Consumer<List<RecordDownloadInfoBO>> recordUrlsSetter) {
        if (this.recordUrls == null) {
            this.recordUrls = new ArrayList<>();
        }
        recordUrlsSetter.accept(this.recordUrls);
        return this;
    }

    /**
     * 录制文件下载链接。
     * @return recordUrls
     */
    public List<RecordDownloadInfoBO> getRecordUrls() {
        return recordUrls;
    }

    public void setRecordUrls(List<RecordDownloadInfoBO> recordUrls) {
        this.recordUrls = recordUrls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRecordingFileDownloadUrlsResponse showRecordingFileDownloadUrlsResponse =
            (ShowRecordingFileDownloadUrlsResponse) o;
        return Objects.equals(this.recordUrls, showRecordingFileDownloadUrlsResponse.recordUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecordingFileDownloadUrlsResponse {\n");
        sb.append("    recordUrls: ").append(toIndentedString(recordUrls)).append("\n");
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
