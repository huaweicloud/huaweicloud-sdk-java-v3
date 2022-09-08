package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 模板视频信息
 */
public class VideoTemplateInfo {

    /**
     * 画质。
     */
    public static final class QualityEnum {

        /**
         * Enum FULL_HD for value: "FULL_HD"
         */
        public static final QualityEnum FULL_HD = new QualityEnum("FULL_HD");

        /**
         * Enum HD for value: "HD"
         */
        public static final QualityEnum HD = new QualityEnum("HD");

        /**
         * Enum SD for value: "SD"
         */
        public static final QualityEnum SD = new QualityEnum("SD");

        /**
         * Enum FLUENT for value: "FLUENT"
         */
        public static final QualityEnum FLUENT = new QualityEnum("FLUENT");

        /**
         * Enum AD for value: "AD"
         */
        public static final QualityEnum AD = new QualityEnum("AD");

        /**
         * Enum _2K for value: "2K"
         */
        public static final QualityEnum _2K = new QualityEnum("2K");

        /**
         * Enum _4K for value: "4K"
         */
        public static final QualityEnum _4K = new QualityEnum("4K");

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final QualityEnum UNKNOW = new QualityEnum("UNKNOW");

        private static final Map<String, QualityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QualityEnum> createStaticFields() {
            Map<String, QualityEnum> map = new HashMap<>();
            map.put("FULL_HD", FULL_HD);
            map.put("HD", HD);
            map.put("SD", SD);
            map.put("FLUENT", FLUENT);
            map.put("AD", AD);
            map.put("2K", _2K);
            map.put("4K", _4K);
            map.put("UNKNOW", UNKNOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QualityEnum(String value) {
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
        public static QualityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QualityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QualityEnum(value);
            }
            return result;
        }

        public static QualityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QualityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QualityEnum) {
                return this.value.equals(((QualityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private QualityEnum quality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    public VideoTemplateInfo withQuality(QualityEnum quality) {
        this.quality = quality;
        return this;
    }

    /**
     * 画质。
     * @return quality
     */
    public QualityEnum getQuality() {
        return quality;
    }

    public void setQuality(QualityEnum quality) {
        this.quality = quality;
    }

    public VideoTemplateInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度。
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoTemplateInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度。
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoTemplateInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 码率。
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public VideoTemplateInfo withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率（默认为1，1代表自适应，单位是帧每秒）。
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTemplateInfo videoTemplateInfo = (VideoTemplateInfo) o;
        return Objects.equals(this.quality, videoTemplateInfo.quality)
            && Objects.equals(this.width, videoTemplateInfo.width)
            && Objects.equals(this.height, videoTemplateInfo.height)
            && Objects.equals(this.bitrate, videoTemplateInfo.bitrate)
            && Objects.equals(this.frameRate, videoTemplateInfo.frameRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quality, width, height, bitrate, frameRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTemplateInfo {\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
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
