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
     * **参数解释**： 背景类型。 **约束限制**： 不涉及。 **取值范围**： * IMAGE：图片背景，指定图片用作分身数字人背景。 * COLOR：纯色背景，指定颜色RGB值作为分身数字人背景。  **默认取值**： 不涉及
     */
    public static final class BackgroundTypeEnum {

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final BackgroundTypeEnum IMAGE = new BackgroundTypeEnum("IMAGE");

        /**
         * Enum COLOR for value: "COLOR"
         */
        public static final BackgroundTypeEnum COLOR = new BackgroundTypeEnum("COLOR");

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
            map.put("COLOR", COLOR);
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
    @JsonProperty(value = "background_config")

    private String backgroundConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_color_config")

    private String backgroundColorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_asset_id")

    private String backgroundAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_image_config")

    private BackgroundImageConfig backgroundImageConfig;

    public BackgroundConfigInfo withBackgroundType(BackgroundTypeEnum backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }

    /**
     * **参数解释**： 背景类型。 **约束限制**： 不涉及。 **取值范围**： * IMAGE：图片背景，指定图片用作分身数字人背景。 * COLOR：纯色背景，指定颜色RGB值作为分身数字人背景。  **默认取值**： 不涉及
     * @return backgroundType
     */
    public BackgroundTypeEnum getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(BackgroundTypeEnum backgroundType) {
        this.backgroundType = backgroundType;
    }

    public BackgroundConfigInfo withBackgroundConfig(String backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    /**
     * **参数解释**： 背景文件的URL。 **约束限制**： * 仅直播支持外部URL，其他业务通过资产库查询获取，不支持外部URL。 * background_type=IMAGE时需要填写。  **取值范围**： 字符长度1-2048位 **默认取值**： 不涉及。
     * @return backgroundConfig
     */
    public String getBackgroundConfig() {
        return backgroundConfig;
    }

    public void setBackgroundConfig(String backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
    }

    public BackgroundConfigInfo withBackgroundColorConfig(String backgroundColorConfig) {
        this.backgroundColorConfig = backgroundColorConfig;
        return this;
    }

    /**
     * **参数解释**： 纯色背景的RGB颜色值。 **约束限制**： background_type=COLOR时需要填写。 **取值范围**： 字符长度0-16位
     * @return backgroundColorConfig
     */
    public String getBackgroundColorConfig() {
        return backgroundColorConfig;
    }

    public void setBackgroundColorConfig(String backgroundColorConfig) {
        this.backgroundColorConfig = backgroundColorConfig;
    }

    public BackgroundConfigInfo withBackgroundAssetId(String backgroundAssetId) {
        this.backgroundAssetId = backgroundAssetId;
        return this;
    }

    /**
     * **参数解释**： 背景资产ID。 > 背景是背景图片时，填图片资产ID。  **约束限制**： 不涉及 **取值范围**： 字符长度0-64位 **默认取值**： 不涉及
     * @return backgroundAssetId
     */
    public String getBackgroundAssetId() {
        return backgroundAssetId;
    }

    public void setBackgroundAssetId(String backgroundAssetId) {
        this.backgroundAssetId = backgroundAssetId;
    }

    public BackgroundConfigInfo withBackgroundImageConfig(BackgroundImageConfig backgroundImageConfig) {
        this.backgroundImageConfig = backgroundImageConfig;
        return this;
    }

    public BackgroundConfigInfo withBackgroundImageConfig(Consumer<BackgroundImageConfig> backgroundImageConfigSetter) {
        if (this.backgroundImageConfig == null) {
            this.backgroundImageConfig = new BackgroundImageConfig();
            backgroundImageConfigSetter.accept(this.backgroundImageConfig);
        }

        return this;
    }

    /**
     * Get backgroundImageConfig
     * @return backgroundImageConfig
     */
    public BackgroundImageConfig getBackgroundImageConfig() {
        return backgroundImageConfig;
    }

    public void setBackgroundImageConfig(BackgroundImageConfig backgroundImageConfig) {
        this.backgroundImageConfig = backgroundImageConfig;
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
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.backgroundColorConfig, that.backgroundColorConfig)
            && Objects.equals(this.backgroundAssetId, that.backgroundAssetId)
            && Objects.equals(this.backgroundImageConfig, that.backgroundImageConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(backgroundType, backgroundConfig, backgroundColorConfig, backgroundAssetId, backgroundImageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundConfigInfo {\n");
        sb.append("    backgroundType: ").append(toIndentedString(backgroundType)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    backgroundColorConfig: ").append(toIndentedString(backgroundColorConfig)).append("\n");
        sb.append("    backgroundAssetId: ").append(toIndentedString(backgroundAssetId)).append("\n");
        sb.append("    backgroundImageConfig: ").append(toIndentedString(backgroundImageConfig)).append("\n");
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
