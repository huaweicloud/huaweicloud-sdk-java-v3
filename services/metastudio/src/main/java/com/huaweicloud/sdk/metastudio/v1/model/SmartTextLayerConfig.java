package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 素材视频图层配置。
 */
public class SmartTextLayerConfig {

    /**
     * 文本类型。 * DYNAMIC: 动态文本，需要进行关键字替换。 * STATIC: 静态文本。
     */
    public static final class TextTypeEnum {

        /**
         * Enum DYNAMIC for value: "DYNAMIC"
         */
        public static final TextTypeEnum DYNAMIC = new TextTypeEnum("DYNAMIC");

        /**
         * Enum STATIC for value: "STATIC"
         */
        public static final TextTypeEnum STATIC = new TextTypeEnum("STATIC");

        private static final Map<String, TextTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TextTypeEnum> createStaticFields() {
            Map<String, TextTypeEnum> map = new HashMap<>();
            map.put("DYNAMIC", DYNAMIC);
            map.put("STATIC", STATIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TextTypeEnum(String value) {
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
        public static TextTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TextTypeEnum(value));
        }

        public static TextTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TextTypeEnum) {
                return this.value.equals(((TextTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_type")

    private TextTypeEnum textType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_context")

    private String textContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_name")

    private String fontName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_size")

    private Integer fontSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_color")

    private String fontColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_duration")

    private Integer displayDuration;

    public SmartTextLayerConfig withTextType(TextTypeEnum textType) {
        this.textType = textType;
        return this;
    }

    /**
     * 文本类型。 * DYNAMIC: 动态文本，需要进行关键字替换。 * STATIC: 静态文本。
     * @return textType
     */
    public TextTypeEnum getTextType() {
        return textType;
    }

    public void setTextType(TextTypeEnum textType) {
        this.textType = textType;
    }

    public SmartTextLayerConfig withTextContext(String textContext) {
        this.textContext = textContext;
        return this;
    }

    /**
     * 文本。
     * @return textContext
     */
    public String getTextContext() {
        return textContext;
    }

    public void setTextContext(String textContext) {
        this.textContext = textContext;
    }

    public SmartTextLayerConfig withFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }

    /**
     * 字体。当前支持的字体： * HarmonyOS_Sans_SC_Black：鸿蒙粗体 * HarmonyOS_Sans_SC_Regular：鸿蒙常规 * HarmonyOS_Sans_SC_Thin：鸿蒙细体 * fzyouh：方正瘦体
     * @return fontName
     */
    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public SmartTextLayerConfig withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 字体大小（像素）。  取值范围：[4, 120]
     * minimum: 0
     * maximum: 120
     * @return fontSize
     */
    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public SmartTextLayerConfig withFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * 字体颜色。RGB颜色值。
     * @return fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public SmartTextLayerConfig withDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
        return this;
    }

    /**
     * 文本显示时长。单位s * 0 显示时长规则：若携带reply_texts，reply_audios，与播放语音内容时长保持一致； 未携带场景，与匹配的关键词语音内容时长保持一致
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
        SmartTextLayerConfig that = (SmartTextLayerConfig) obj;
        return Objects.equals(this.textType, that.textType) && Objects.equals(this.textContext, that.textContext)
            && Objects.equals(this.fontName, that.fontName) && Objects.equals(this.fontSize, that.fontSize)
            && Objects.equals(this.fontColor, that.fontColor)
            && Objects.equals(this.displayDuration, that.displayDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textType, textContext, fontName, fontSize, fontColor, displayDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTextLayerConfig {\n");
        sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
        sb.append("    textContext: ").append(toIndentedString(textContext)).append("\n");
        sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
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
