package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 素材文字图层配置。
 */
public class TextLayerConfig {

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

    public TextLayerConfig withTextContext(String textContext) {
        this.textContext = textContext;
        return this;
    }

    /**
     * **参数解释**： 文字图层的文本，内容需做Base64编码。  示例：若想添加文字水印“测试文字水印”，那么text_context的值为：5rWL6K+V5paH5a2X5rC05Y2w **约束限制**： 不涉及。 **取值范围**： 字符长度0-1024位。 **默认取值**： 不涉及。
     * @return textContext
     */
    public String getTextContext() {
        return textContext;
    }

    public void setTextContext(String textContext) {
        this.textContext = textContext;
    }

    public TextLayerConfig withFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }

    /**
     * 字体。当前支持的字体请参考[服务支持的字体](metastudio_02_0041.xml) **约束限制**： 不涉及。 **取值范围**： 字符长度0-64位
     * @return fontName
     */
    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public TextLayerConfig withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * **参数解释**： 字体大小（像素）。接口的取值范围为0-120，实际业务使用的取值范围要求为4-120，请以业务实际使用要求为准。  **约束限制**： 不涉及。
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

    public TextLayerConfig withFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * **参数解释**： 字体颜色。RGB颜色值。  **约束限制**： 不涉及。 **取值范围**： 字符长度0-16位
     * @return fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextLayerConfig that = (TextLayerConfig) obj;
        return Objects.equals(this.textContext, that.textContext) && Objects.equals(this.fontName, that.fontName)
            && Objects.equals(this.fontSize, that.fontSize) && Objects.equals(this.fontColor, that.fontColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textContext, fontName, fontSize, fontColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextLayerConfig {\n");
        sb.append("    textContext: ").append(toIndentedString(textContext)).append("\n");
        sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
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
