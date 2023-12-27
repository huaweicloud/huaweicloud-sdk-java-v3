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
 * 背景配置。
 */
public class BackgroundConfigInfo {

    /**
     * 背景类型。 - IMAGE：图片，用于3D数字人演示素材讲解模式的图片或分身数字背景图片 - IMAGE_2D：图片，用于3D数字人主播播报模式的2D场景背景图片 - VIDEO：视频 - AUDIO：音频 > * 分身数字人视频制作仅支持IMAGE
     */
    public static final class BackgroundTypeEnum {

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final BackgroundTypeEnum IMAGE = new BackgroundTypeEnum("IMAGE");

        /**
         * Enum IMAGE_2D for value: "IMAGE_2D"
         */
        public static final BackgroundTypeEnum IMAGE_2D = new BackgroundTypeEnum("IMAGE_2D");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final BackgroundTypeEnum VIDEO = new BackgroundTypeEnum("VIDEO");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final BackgroundTypeEnum AUDIO = new BackgroundTypeEnum("AUDIO");

        private static final Map<String, BackgroundTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackgroundTypeEnum> createStaticFields() {
            Map<String, BackgroundTypeEnum> map = new HashMap<>();
            map.put("IMAGE", IMAGE);
            map.put("IMAGE_2D", IMAGE_2D);
            map.put("VIDEO", VIDEO);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackgroundTypeEnum(String value) {
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
        public static BackgroundTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackgroundTypeEnum(value));
        }

        public static BackgroundTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackgroundTypeEnum) {
                return this.value.equals(((BackgroundTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_type")

    private BackgroundTypeEnum backgroundType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_title")

    private String backgroundTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_position_2d")

    private HumanPosition2D humanPosition2d;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_size_2d")

    private HumanSize2D humanSize2d;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_cover_url")

    private String backgroundCoverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_config")

    private String backgroundConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_asset_id")

    private String backgroundAssetId;

    public BackgroundConfigInfo withBackgroundType(BackgroundTypeEnum backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }

    /**
     * 背景类型。 - IMAGE：图片，用于3D数字人演示素材讲解模式的图片或分身数字背景图片 - IMAGE_2D：图片，用于3D数字人主播播报模式的2D场景背景图片 - VIDEO：视频 - AUDIO：音频 > * 分身数字人视频制作仅支持IMAGE
     * @return backgroundType
     */
    public BackgroundTypeEnum getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(BackgroundTypeEnum backgroundType) {
        this.backgroundType = backgroundType;
    }

    public BackgroundConfigInfo withBackgroundTitle(String backgroundTitle) {
        this.backgroundTitle = backgroundTitle;
        return this;
    }

    /**
     * 背景标题。 > * 分身数字人视频制作此参数不生效。
     * @return backgroundTitle
     */
    public String getBackgroundTitle() {
        return backgroundTitle;
    }

    public void setBackgroundTitle(String backgroundTitle) {
        this.backgroundTitle = backgroundTitle;
    }

    public BackgroundConfigInfo withHumanPosition2d(HumanPosition2D humanPosition2d) {
        this.humanPosition2d = humanPosition2d;
        return this;
    }

    public BackgroundConfigInfo withHumanPosition2d(Consumer<HumanPosition2D> humanPosition2dSetter) {
        if (this.humanPosition2d == null) {
            this.humanPosition2d = new HumanPosition2D();
            humanPosition2dSetter.accept(this.humanPosition2d);
        }

        return this;
    }

    /**
     * Get humanPosition2d
     * @return humanPosition2d
     */
    public HumanPosition2D getHumanPosition2d() {
        return humanPosition2d;
    }

    public void setHumanPosition2d(HumanPosition2D humanPosition2d) {
        this.humanPosition2d = humanPosition2d;
    }

    public BackgroundConfigInfo withHumanSize2d(HumanSize2D humanSize2d) {
        this.humanSize2d = humanSize2d;
        return this;
    }

    public BackgroundConfigInfo withHumanSize2d(Consumer<HumanSize2D> humanSize2dSetter) {
        if (this.humanSize2d == null) {
            this.humanSize2d = new HumanSize2D();
            humanSize2dSetter.accept(this.humanSize2d);
        }

        return this;
    }

    /**
     * Get humanSize2d
     * @return humanSize2d
     */
    public HumanSize2D getHumanSize2d() {
        return humanSize2d;
    }

    public void setHumanSize2d(HumanSize2D humanSize2d) {
        this.humanSize2d = humanSize2d;
    }

    public BackgroundConfigInfo withBackgroundCoverUrl(String backgroundCoverUrl) {
        this.backgroundCoverUrl = backgroundCoverUrl;
        return this;
    }

    /**
     * 视频文件封面图片的下载URL。  演示素材为视频时有效。 > * 分身数字人视频制作此参数不生效。
     * @return backgroundCoverUrl
     */
    public String getBackgroundCoverUrl() {
        return backgroundCoverUrl;
    }

    public void setBackgroundCoverUrl(String backgroundCoverUrl) {
        this.backgroundCoverUrl = backgroundCoverUrl;
    }

    public BackgroundConfigInfo withBackgroundConfig(String backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    /**
     * 背景文件的URL。 > * 通过资产库查询获取，不支持外部URL。
     * @return backgroundConfig
     */
    public String getBackgroundConfig() {
        return backgroundConfig;
    }

    public void setBackgroundConfig(String backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
    }

    public BackgroundConfigInfo withBackgroundAssetId(String backgroundAssetId) {
        this.backgroundAssetId = backgroundAssetId;
        return this;
    }

    /**
     * 背景资产ID。 > * 背景是背景图片时，填图片资产ID。
     * @return backgroundAssetId
     */
    public String getBackgroundAssetId() {
        return backgroundAssetId;
    }

    public void setBackgroundAssetId(String backgroundAssetId) {
        this.backgroundAssetId = backgroundAssetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackgroundConfigInfo that = (BackgroundConfigInfo) obj;
        return Objects.equals(this.backgroundType, that.backgroundType)
            && Objects.equals(this.backgroundTitle, that.backgroundTitle)
            && Objects.equals(this.humanPosition2d, that.humanPosition2d)
            && Objects.equals(this.humanSize2d, that.humanSize2d)
            && Objects.equals(this.backgroundCoverUrl, that.backgroundCoverUrl)
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.backgroundAssetId, that.backgroundAssetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundType,
            backgroundTitle,
            humanPosition2d,
            humanSize2d,
            backgroundCoverUrl,
            backgroundConfig,
            backgroundAssetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundConfigInfo {\n");
        sb.append("    backgroundType: ").append(toIndentedString(backgroundType)).append("\n");
        sb.append("    backgroundTitle: ").append(toIndentedString(backgroundTitle)).append("\n");
        sb.append("    humanPosition2d: ").append(toIndentedString(humanPosition2d)).append("\n");
        sb.append("    humanSize2d: ").append(toIndentedString(humanSize2d)).append("\n");
        sb.append("    backgroundCoverUrl: ").append(toIndentedString(backgroundCoverUrl)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    backgroundAssetId: ").append(toIndentedString(backgroundAssetId)).append("\n");
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
