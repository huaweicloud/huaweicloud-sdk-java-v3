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
public class ListSingleStreamDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_framerate")

    private List<StreamDetail> videoFramerate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bitrate")

    private List<StreamDetail> videoBitrate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_framerate")

    private List<StreamDetail> audioFramerate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSingleStreamDetailResponse withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public ListSingleStreamDetailResponse withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListSingleStreamDetailResponse withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public ListSingleStreamDetailResponse withVideoFramerate(List<StreamDetail> videoFramerate) {
        this.videoFramerate = videoFramerate;
        return this;
    }

    public ListSingleStreamDetailResponse addVideoFramerateItem(StreamDetail videoFramerateItem) {
        if (this.videoFramerate == null) {
            this.videoFramerate = new ArrayList<>();
        }
        this.videoFramerate.add(videoFramerateItem);
        return this;
    }

    public ListSingleStreamDetailResponse withVideoFramerate(Consumer<List<StreamDetail>> videoFramerateSetter) {
        if (this.videoFramerate == null) {
            this.videoFramerate = new ArrayList<>();
        }
        videoFramerateSetter.accept(this.videoFramerate);
        return this;
    }

    /**
     * 展示流视频帧率情况，帧率单位为fps。  如果出现断流则会出现多个时间段流信息，如： ``` \"video_framerate\": [     {       \"start_time\": \"2022-02-04T07:00:00Z\",       \"end_time\": \"2022-02-04T07:00:02Z\",       \"data_list\": [         21,         22       ]     },     {       \"start_time\": \"2022-02-04T07:00:05Z\",       \"end_time\": \"2022-02-04T07:00:07Z\",       \"data_list\": [         13,         34,         21       ]     }   ] 
     * @return videoFramerate
     */
    public List<StreamDetail> getVideoFramerate() {
        return videoFramerate;
    }

    public void setVideoFramerate(List<StreamDetail> videoFramerate) {
        this.videoFramerate = videoFramerate;
    }

    public ListSingleStreamDetailResponse withVideoBitrate(List<StreamDetail> videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }

    public ListSingleStreamDetailResponse addVideoBitrateItem(StreamDetail videoBitrateItem) {
        if (this.videoBitrate == null) {
            this.videoBitrate = new ArrayList<>();
        }
        this.videoBitrate.add(videoBitrateItem);
        return this;
    }

    public ListSingleStreamDetailResponse withVideoBitrate(Consumer<List<StreamDetail>> videoBitrateSetter) {
        if (this.videoBitrate == null) {
            this.videoBitrate = new ArrayList<>();
        }
        videoBitrateSetter.accept(this.videoBitrate);
        return this;
    }

    /**
     * 展示流视频码率情况，码率单位为Kbps。  如果出现断流则会出现多个时间段流信息，如： ``` \"video_bitrate\": [     {       \"start_time\": \"2022-02-04T07:00:00Z\",       \"end_time\": \"2022-02-04T07:00:02Z\",       \"data_list\": [         1326,         1268,         775       ]     },     {       \"start_time\": \"2022-02-04T07:00:05Z\",       \"end_time\": \"2022-02-04T07:00:07Z\",       \"data_list\": [         1021,         2022       ]     }   ] 
     * @return videoBitrate
     */
    public List<StreamDetail> getVideoBitrate() {
        return videoBitrate;
    }

    public void setVideoBitrate(List<StreamDetail> videoBitrate) {
        this.videoBitrate = videoBitrate;
    }

    public ListSingleStreamDetailResponse withAudioFramerate(List<StreamDetail> audioFramerate) {
        this.audioFramerate = audioFramerate;
        return this;
    }

    public ListSingleStreamDetailResponse addAudioFramerateItem(StreamDetail audioFramerateItem) {
        if (this.audioFramerate == null) {
            this.audioFramerate = new ArrayList<>();
        }
        this.audioFramerate.add(audioFramerateItem);
        return this;
    }

    public ListSingleStreamDetailResponse withAudioFramerate(Consumer<List<StreamDetail>> audioFramerateSetter) {
        if (this.audioFramerate == null) {
            this.audioFramerate = new ArrayList<>();
        }
        audioFramerateSetter.accept(this.audioFramerate);
        return this;
    }

    /**
     * 展示流音频帧率情况，帧率单位为fps。  如果出现断流则会出现多个时间段流信息，如： ``` \"audio_framerate\": [     {       \"start_time\": \"2022-02-04T07:00:00Z\",       \"end_time\": \"2022-02-04T07:00:02Z\",       \"data_list\": [         10,         17       ]     },     {       \"start_time\": \"2022-02-04T07:00:05Z\",       \"end_time\": \"2022-02-04T07:00:06Z\",       \"data_list\": [         31,         33       ]     }   ] 
     * @return audioFramerate
     */
    public List<StreamDetail> getAudioFramerate() {
        return audioFramerate;
    }

    public void setAudioFramerate(List<StreamDetail> audioFramerate) {
        this.audioFramerate = audioFramerate;
    }

    public ListSingleStreamDetailResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSingleStreamDetailResponse listSingleStreamDetailResponse = (ListSingleStreamDetailResponse) o;
        return Objects.equals(this.publishDomain, listSingleStreamDetailResponse.publishDomain)
            && Objects.equals(this.app, listSingleStreamDetailResponse.app)
            && Objects.equals(this.stream, listSingleStreamDetailResponse.stream)
            && Objects.equals(this.videoFramerate, listSingleStreamDetailResponse.videoFramerate)
            && Objects.equals(this.videoBitrate, listSingleStreamDetailResponse.videoBitrate)
            && Objects.equals(this.audioFramerate, listSingleStreamDetailResponse.audioFramerate)
            && Objects.equals(this.xRequestId, listSingleStreamDetailResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, videoFramerate, videoBitrate, audioFramerate, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSingleStreamDetailResponse {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    videoFramerate: ").append(toIndentedString(videoFramerate)).append("\n");
        sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
        sb.append("    audioFramerate: ").append(toIndentedString(audioFramerate)).append("\n");
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
