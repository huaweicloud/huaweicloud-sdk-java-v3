package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoProcess
 */
public class VideoProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_count")

    private Integer hlsInitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_interval")

    private Integer hlsInitInterval;

    public VideoProcess withHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
        return this;
    }

    /**
     * 需要单独设置时长的HLS起始分片数量。 取值范围：[0,10]，默认值为：0 与hls_init_interval配合使用，设置前面hls_init_count个HLS分片时长。为0表示不单独配置时长。 
     * minimum: 0
     * maximum: 10
     * @return hlsInitCount
     */
    public Integer getHlsInitCount() {
        return hlsInitCount;
    }

    public void setHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
    }

    public VideoProcess withHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
        return this;
    }

    /**
     * 表示前面hls_init_count个HLS分片的时长。 取值范围：[2,10] ，默认值为：5 hls_init_count不为0时，该字段才起作用。 
     * minimum: 2
     * maximum: 10
     * @return hlsInitInterval
     */
    public Integer getHlsInitInterval() {
        return hlsInitInterval;
    }

    public void setHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoProcess that = (VideoProcess) obj;
        return Objects.equals(this.hlsInitCount, that.hlsInitCount)
            && Objects.equals(this.hlsInitInterval, that.hlsInitInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsInitCount, hlsInitInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoProcess {\n");
        sb.append("    hlsInitCount: ").append(toIndentedString(hlsInitCount)).append("\n");
        sb.append("    hlsInitInterval: ").append(toIndentedString(hlsInitInterval)).append("\n");
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
