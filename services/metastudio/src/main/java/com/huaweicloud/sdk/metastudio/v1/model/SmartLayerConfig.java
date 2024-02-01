package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 智能图层配置。
 */
public class SmartLayerConfig {

    /**
     * 图层类型。 - IMAGE： 素材图片图层 - VIDEO： 素材视频图层
     */
    public static final class LayerTypeEnum {

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final LayerTypeEnum IMAGE = new LayerTypeEnum("IMAGE");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final LayerTypeEnum VIDEO = new LayerTypeEnum("VIDEO");

        private static final Map<String, LayerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LayerTypeEnum> createStaticFields() {
            Map<String, LayerTypeEnum> map = new HashMap<>();
            map.put("IMAGE", IMAGE);
            map.put("VIDEO", VIDEO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LayerTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LayerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LayerTypeEnum(value));
        }

        public static LayerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LayerTypeEnum) {
                return this.value.equals(((LayerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_type")

    private LayerTypeEnum layerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private LayerPositionConfig position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private LayerSizeConfig size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_config")

    private SmartImageLayerConfig imageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private SmartVideoLayerConfig videoConfig;

    public SmartLayerConfig withLayerType(LayerTypeEnum layerType) {
        this.layerType = layerType;
        return this;
    }

    /**
     * 图层类型。 - IMAGE： 素材图片图层 - VIDEO： 素材视频图层
     * @return layerType
     */
    public LayerTypeEnum getLayerType() {
        return layerType;
    }

    public void setLayerType(LayerTypeEnum layerType) {
        this.layerType = layerType;
    }

    public SmartLayerConfig withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 图层所需资产的资产id，外部资产信息无需填写
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public SmartLayerConfig withPosition(LayerPositionConfig position) {
        this.position = position;
        return this;
    }

    public SmartLayerConfig withPosition(Consumer<LayerPositionConfig> positionSetter) {
        if (this.position == null) {
            this.position = new LayerPositionConfig();
            positionSetter.accept(this.position);
        }

        return this;
    }

    /**
     * Get position
     * @return position
     */
    public LayerPositionConfig getPosition() {
        return position;
    }

    public void setPosition(LayerPositionConfig position) {
        this.position = position;
    }

    public SmartLayerConfig withSize(LayerSizeConfig size) {
        this.size = size;
        return this;
    }

    public SmartLayerConfig withSize(Consumer<LayerSizeConfig> sizeSetter) {
        if (this.size == null) {
            this.size = new LayerSizeConfig();
            sizeSetter.accept(this.size);
        }

        return this;
    }

    /**
     * Get size
     * @return size
     */
    public LayerSizeConfig getSize() {
        return size;
    }

    public void setSize(LayerSizeConfig size) {
        this.size = size;
    }

    public SmartLayerConfig withImageConfig(SmartImageLayerConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }

    public SmartLayerConfig withImageConfig(Consumer<SmartImageLayerConfig> imageConfigSetter) {
        if (this.imageConfig == null) {
            this.imageConfig = new SmartImageLayerConfig();
            imageConfigSetter.accept(this.imageConfig);
        }

        return this;
    }

    /**
     * Get imageConfig
     * @return imageConfig
     */
    public SmartImageLayerConfig getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(SmartImageLayerConfig imageConfig) {
        this.imageConfig = imageConfig;
    }

    public SmartLayerConfig withVideoConfig(SmartVideoLayerConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public SmartLayerConfig withVideoConfig(Consumer<SmartVideoLayerConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new SmartVideoLayerConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public SmartVideoLayerConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(SmartVideoLayerConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartLayerConfig that = (SmartLayerConfig) obj;
        return Objects.equals(this.layerType, that.layerType) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.position, that.position) && Objects.equals(this.size, that.size)
            && Objects.equals(this.imageConfig, that.imageConfig) && Objects.equals(this.videoConfig, that.videoConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layerType, assetId, position, size, imageConfig, videoConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartLayerConfig {\n");
        sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    imageConfig: ").append(toIndentedString(imageConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
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
