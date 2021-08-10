package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class DetectLiveByUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video-result")

    private LiveDetectRespVideoresult videoResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning-list")

    private List<WarningList> warningList = null;

    public DetectLiveByUrlResponse withVideoResult(LiveDetectRespVideoresult videoResult) {
        this.videoResult = videoResult;
        return this;
    }

    public DetectLiveByUrlResponse withVideoResult(Consumer<LiveDetectRespVideoresult> videoResultSetter) {
        if (this.videoResult == null) {
            this.videoResult = new LiveDetectRespVideoresult();
            videoResultSetter.accept(this.videoResult);
        }

        return this;
    }

    /** Get videoResult
     * 
     * @return videoResult */
    public LiveDetectRespVideoresult getVideoResult() {
        return videoResult;
    }

    public void setVideoResult(LiveDetectRespVideoresult videoResult) {
        this.videoResult = videoResult;
    }

    public DetectLiveByUrlResponse withWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
        return this;
    }

    public DetectLiveByUrlResponse addWarningListItem(WarningList warningListItem) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        this.warningList.add(warningListItem);
        return this;
    }

    public DetectLiveByUrlResponse withWarningList(Consumer<List<WarningList>> warningListSetter) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        warningListSetter.accept(this.warningList);
        return this;
    }

    /** 警告信息列表，WarningList结构见[WarningList](zh-cn_topic_0146322261.xml)。 调用失败时无此字段
     * 
     * @return warningList */
    public List<WarningList> getWarningList() {
        return warningList;
    }

    public void setWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetectLiveByUrlResponse detectLiveByUrlResponse = (DetectLiveByUrlResponse) o;
        return Objects.equals(this.videoResult, detectLiveByUrlResponse.videoResult)
            && Objects.equals(this.warningList, detectLiveByUrlResponse.warningList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoResult, warningList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveByUrlResponse {\n");
        sb.append("    videoResult: ").append(toIndentedString(videoResult)).append("\n");
        sb.append("    warningList: ").append(toIndentedString(warningList)).append("\n");
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
