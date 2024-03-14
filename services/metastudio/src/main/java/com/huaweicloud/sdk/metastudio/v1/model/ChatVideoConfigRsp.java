package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChatVideoConfigRsp
 */
public class ChatVideoConfigRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    public ChatVideoConfigRsp withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度。  单位：像素。  最小值320，最大值2560。 > * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280四种分辨率。
     * minimum: 0
     * maximum: 3840
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ChatVideoConfigRsp withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度。  单位：像素。  最小值320，最大值2560。 > * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280四种分辨率。
     * minimum: 0
     * maximum: 3840
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatVideoConfigRsp that = (ChatVideoConfigRsp) obj;
        return Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatVideoConfigRsp {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
