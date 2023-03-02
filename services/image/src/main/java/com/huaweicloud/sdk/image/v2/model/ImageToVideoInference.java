package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图像合成视频服务推理参数
 */
public class ImageToVideoInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_config")

    private ImageToVideoInfo imageConfig;

    public ImageToVideoInference withImageConfig(ImageToVideoInfo imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }

    public ImageToVideoInference withImageConfig(Consumer<ImageToVideoInfo> imageConfigSetter) {
        if (this.imageConfig == null) {
            this.imageConfig = new ImageToVideoInfo();
            imageConfigSetter.accept(this.imageConfig);
        }

        return this;
    }

    /**
     * Get imageConfig
     * @return imageConfig
     */
    public ImageToVideoInfo getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(ImageToVideoInfo imageConfig) {
        this.imageConfig = imageConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageToVideoInference imageToVideoInference = (ImageToVideoInference) o;
        return Objects.equals(this.imageConfig, imageToVideoInference.imageConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageToVideoInference {\n");
        sb.append("    imageConfig: ").append(toIndentedString(imageConfig)).append("\n");
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
