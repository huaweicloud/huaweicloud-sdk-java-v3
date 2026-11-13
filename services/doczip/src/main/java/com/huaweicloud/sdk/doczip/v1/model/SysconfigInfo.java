package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 系统设置信息
 */
public class SysconfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_family")

    private String fontFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_size")

    private String fontSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_height")

    private String lineHeight;

    public SysconfigInfo withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * **参数解释**： 默认字体。 **约束限制**： 不涉及。 **取值范围**： [1-32]个字符。 **默认取值**： 不涉及。
     * @return fontFamily
     */
    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public SysconfigInfo withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * **参数解释**： 字体大小。 **约束限制**： 不涉及。 **取值范围**： [1-10]个字符。 **默认取值**： 不涉及。
     * @return fontSize
     */
    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public SysconfigInfo withLineHeight(String lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    /**
     * **参数解释**： 行间距。 **约束限制**： 不涉及。 **取值范围**： [1-10]个字符。 **默认取值**： 不涉及。
     * @return lineHeight
     */
    public String getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(String lineHeight) {
        this.lineHeight = lineHeight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SysconfigInfo that = (SysconfigInfo) obj;
        return Objects.equals(this.fontFamily, that.fontFamily) && Objects.equals(this.fontSize, that.fontSize)
            && Objects.equals(this.lineHeight, that.lineHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontFamily, fontSize, lineHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SysconfigInfo {\n");
        sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    lineHeight: ").append(toIndentedString(lineHeight)).append("\n");
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
