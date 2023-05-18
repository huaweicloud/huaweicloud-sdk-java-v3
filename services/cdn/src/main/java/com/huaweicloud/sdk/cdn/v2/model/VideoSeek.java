package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频拖拽配置。
 */
public class VideoSeek {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_video_seek")

    private Boolean enableVideoSeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_flv_by_time_seek")

    private Boolean enableFlvByTimeSeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_parameter")

    private String startParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_parameter")

    private String endParameter;

    public VideoSeek withEnableVideoSeek(Boolean enableVideoSeek) {
        this.enableVideoSeek = enableVideoSeek;
        return this;
    }

    /**
     * 视频拖拽开关（true：开启，false：关闭）  > 当本字段设置为“false”时，查询域名配置接口将不会返回视频拖拽配置信息。
     * @return enableVideoSeek
     */
    public Boolean getEnableVideoSeek() {
        return enableVideoSeek;
    }

    public void setEnableVideoSeek(Boolean enableVideoSeek) {
        this.enableVideoSeek = enableVideoSeek;
    }

    public VideoSeek withEnableFlvByTimeSeek(Boolean enableFlvByTimeSeek) {
        this.enableFlvByTimeSeek = enableFlvByTimeSeek;
        return this;
    }

    /**
     * flv时间拖拽开关（true：开启，false：关闭）。
     * @return enableFlvByTimeSeek
     */
    public Boolean getEnableFlvByTimeSeek() {
        return enableFlvByTimeSeek;
    }

    public void setEnableFlvByTimeSeek(Boolean enableFlvByTimeSeek) {
        this.enableFlvByTimeSeek = enableFlvByTimeSeek;
    }

    public VideoSeek withStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    /**
     * 自定义用户请求URL中视频播放的开始参数，支持使用数字0-9、字符a-z、A-Z，及\"_\"，长度≤64个字符。
     * @return startParameter
     */
    public String getStartParameter() {
        return startParameter;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

    public VideoSeek withEndParameter(String endParameter) {
        this.endParameter = endParameter;
        return this;
    }

    /**
     * 自定义用户请求URL中视频播放的结束参数，支持使用数字0-9、字符a-z、A-Z，及\"_\"，长度≤64个字符。
     * @return endParameter
     */
    public String getEndParameter() {
        return endParameter;
    }

    public void setEndParameter(String endParameter) {
        this.endParameter = endParameter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSeek videoSeek = (VideoSeek) o;
        return Objects.equals(this.enableVideoSeek, videoSeek.enableVideoSeek)
            && Objects.equals(this.enableFlvByTimeSeek, videoSeek.enableFlvByTimeSeek)
            && Objects.equals(this.startParameter, videoSeek.startParameter)
            && Objects.equals(this.endParameter, videoSeek.endParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableVideoSeek, enableFlvByTimeSeek, startParameter, endParameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSeek {\n");
        sb.append("    enableVideoSeek: ").append(toIndentedString(enableVideoSeek)).append("\n");
        sb.append("    enableFlvByTimeSeek: ").append(toIndentedString(enableFlvByTimeSeek)).append("\n");
        sb.append("    startParameter: ").append(toIndentedString(startParameter)).append("\n");
        sb.append("    endParameter: ").append(toIndentedString(endParameter)).append("\n");
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
