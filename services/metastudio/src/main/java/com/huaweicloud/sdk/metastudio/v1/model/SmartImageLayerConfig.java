package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 素材图片图层配置。
 */
public class SmartImageLayerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_duration")

    private Integer displayDuration;

    public SmartImageLayerConfig withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 图片文件的URL。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SmartImageLayerConfig withDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
        return this;
    }

    /**
     * **参数解释**： 图片显示时长，单位s。  显示时长规则为，若携带reply_texts、reply_audios，则与播放语音内容时长保持一致。若未携带，则与匹配的关键词语音内容时长保持一致。
     * minimum: 0
     * maximum: 3600
     * @return displayDuration
     */
    public Integer getDisplayDuration() {
        return displayDuration;
    }

    public void setDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartImageLayerConfig that = (SmartImageLayerConfig) obj;
        return Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.displayDuration, that.displayDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, displayDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartImageLayerConfig {\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    displayDuration: ").append(toIndentedString(displayDuration)).append("\n");
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
