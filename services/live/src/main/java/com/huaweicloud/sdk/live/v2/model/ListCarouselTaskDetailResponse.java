package com.huaweicloud.sdk.live.v2.model;

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
public class ListCarouselTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_framerate_list")

    private List<Long> videoFramerateList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bitrate_list")

    private List<Long> videoBitrateList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_framerate_list")

    private List<Long> audioFramerateList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_bitrate_list")

    private List<Long> audioBitrateList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListCarouselTaskDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 采样开始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListCarouselTaskDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 采样结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListCarouselTaskDetailResponse withVideoFramerateList(List<Long> videoFramerateList) {
        this.videoFramerateList = videoFramerateList;
        return this;
    }

    public ListCarouselTaskDetailResponse addVideoFramerateListItem(Long videoFramerateListItem) {
        if (this.videoFramerateList == null) {
            this.videoFramerateList = new ArrayList<>();
        }
        this.videoFramerateList.add(videoFramerateListItem);
        return this;
    }

    public ListCarouselTaskDetailResponse withVideoFramerateList(Consumer<List<Long>> videoFramerateListSetter) {
        if (this.videoFramerateList == null) {
            this.videoFramerateList = new ArrayList<>();
        }
        videoFramerateListSetter.accept(this.videoFramerateList);
        return this;
    }

    /**
     * 视频帧率信息列表，单位为fps。
     * @return videoFramerateList
     */
    public List<Long> getVideoFramerateList() {
        return videoFramerateList;
    }

    public void setVideoFramerateList(List<Long> videoFramerateList) {
        this.videoFramerateList = videoFramerateList;
    }

    public ListCarouselTaskDetailResponse withVideoBitrateList(List<Long> videoBitrateList) {
        this.videoBitrateList = videoBitrateList;
        return this;
    }

    public ListCarouselTaskDetailResponse addVideoBitrateListItem(Long videoBitrateListItem) {
        if (this.videoBitrateList == null) {
            this.videoBitrateList = new ArrayList<>();
        }
        this.videoBitrateList.add(videoBitrateListItem);
        return this;
    }

    public ListCarouselTaskDetailResponse withVideoBitrateList(Consumer<List<Long>> videoBitrateListSetter) {
        if (this.videoBitrateList == null) {
            this.videoBitrateList = new ArrayList<>();
        }
        videoBitrateListSetter.accept(this.videoBitrateList);
        return this;
    }

    /**
     * 视频码率信息列表，单位为kbps。
     * @return videoBitrateList
     */
    public List<Long> getVideoBitrateList() {
        return videoBitrateList;
    }

    public void setVideoBitrateList(List<Long> videoBitrateList) {
        this.videoBitrateList = videoBitrateList;
    }

    public ListCarouselTaskDetailResponse withAudioFramerateList(List<Long> audioFramerateList) {
        this.audioFramerateList = audioFramerateList;
        return this;
    }

    public ListCarouselTaskDetailResponse addAudioFramerateListItem(Long audioFramerateListItem) {
        if (this.audioFramerateList == null) {
            this.audioFramerateList = new ArrayList<>();
        }
        this.audioFramerateList.add(audioFramerateListItem);
        return this;
    }

    public ListCarouselTaskDetailResponse withAudioFramerateList(Consumer<List<Long>> audioFramerateListSetter) {
        if (this.audioFramerateList == null) {
            this.audioFramerateList = new ArrayList<>();
        }
        audioFramerateListSetter.accept(this.audioFramerateList);
        return this;
    }

    /**
     * 音频帧率信息列表，单位为fps。
     * @return audioFramerateList
     */
    public List<Long> getAudioFramerateList() {
        return audioFramerateList;
    }

    public void setAudioFramerateList(List<Long> audioFramerateList) {
        this.audioFramerateList = audioFramerateList;
    }

    public ListCarouselTaskDetailResponse withAudioBitrateList(List<Long> audioBitrateList) {
        this.audioBitrateList = audioBitrateList;
        return this;
    }

    public ListCarouselTaskDetailResponse addAudioBitrateListItem(Long audioBitrateListItem) {
        if (this.audioBitrateList == null) {
            this.audioBitrateList = new ArrayList<>();
        }
        this.audioBitrateList.add(audioBitrateListItem);
        return this;
    }

    public ListCarouselTaskDetailResponse withAudioBitrateList(Consumer<List<Long>> audioBitrateListSetter) {
        if (this.audioBitrateList == null) {
            this.audioBitrateList = new ArrayList<>();
        }
        audioBitrateListSetter.accept(this.audioBitrateList);
        return this;
    }

    /**
     * 音频码率信息列表，单位为kbps。
     * @return audioBitrateList
     */
    public List<Long> getAudioBitrateList() {
        return audioBitrateList;
    }

    public void setAudioBitrateList(List<Long> audioBitrateList) {
        this.audioBitrateList = audioBitrateList;
    }

    public ListCarouselTaskDetailResponse withXRequestId(String xRequestId) {
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
        ListCarouselTaskDetailResponse that = (ListCarouselTaskDetailResponse) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.videoFramerateList, that.videoFramerateList)
            && Objects.equals(this.videoBitrateList, that.videoBitrateList)
            && Objects.equals(this.audioFramerateList, that.audioFramerateList)
            && Objects.equals(this.audioBitrateList, that.audioBitrateList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            videoFramerateList,
            videoBitrateList,
            audioFramerateList,
            audioBitrateList,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCarouselTaskDetailResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    videoFramerateList: ").append(toIndentedString(videoFramerateList)).append("\n");
        sb.append("    videoBitrateList: ").append(toIndentedString(videoBitrateList)).append("\n");
        sb.append("    audioFramerateList: ").append(toIndentedString(audioFramerateList)).append("\n");
        sb.append("    audioBitrateList: ").append(toIndentedString(audioBitrateList)).append("\n");
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
