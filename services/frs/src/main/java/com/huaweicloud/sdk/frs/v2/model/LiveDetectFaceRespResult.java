package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 静默活体检测结果，LivelessDetectResult结构见表[结构格式说明表](https://support.huaweicloud.com/api-face/face_02_0102.html#face_02_0102__table112325301714)。 调用失败时无此字段。
 */
public class LiveDetectFaceRespResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alive")

    @JacksonXmlProperty(localName = "alive")

    private Boolean alive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Double confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    @JacksonXmlProperty(localName = "picture")

    private String picture;

    public LiveDetectFaceRespResult withAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }

    /**
     * 是否是活体。
     * @return alive
     */
    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public LiveDetectFaceRespResult withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，取值范围0～1。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public LiveDetectFaceRespResult withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /**
     * 检测出最大人脸的图片base64字符串。
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDetectFaceRespResult liveDetectFaceRespResult = (LiveDetectFaceRespResult) o;
        return Objects.equals(this.alive, liveDetectFaceRespResult.alive)
            && Objects.equals(this.confidence, liveDetectFaceRespResult.confidence)
            && Objects.equals(this.picture, liveDetectFaceRespResult.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alive, confidence, picture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDetectFaceRespResult {\n");
        sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
