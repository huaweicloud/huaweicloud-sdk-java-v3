package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频规格
 */
public class VideoSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_rate")

    private Integer codeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private Integer fps;

    public VideoSpec withCodeRate(Integer codeRate) {
        this.codeRate = codeRate;
        return this;
    }

    /**
     * 码率，单位kbps，值范围0-10000，需要是100的倍数
     * @return codeRate
     */
    public Integer getCodeRate() {
        return codeRate;
    }

    public void setCodeRate(Integer codeRate) {
        this.codeRate = codeRate;
    }

    public VideoSpec withFps(Integer fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 帧率，单位fps，可选 30 ,60
     * @return fps
     */
    public Integer getFps() {
        return fps;
    }

    public void setFps(Integer fps) {
        this.fps = fps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoSpec that = (VideoSpec) obj;
        return Objects.equals(this.codeRate, that.codeRate) && Objects.equals(this.fps, that.fps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRate, fps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSpec {\n");
        sb.append("    codeRate: ").append(toIndentedString(codeRate)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
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
