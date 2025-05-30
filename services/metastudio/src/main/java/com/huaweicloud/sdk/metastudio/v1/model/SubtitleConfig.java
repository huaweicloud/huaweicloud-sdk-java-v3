package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 字幕配置。
 */
public class SubtitleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "h")

    private Integer h;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "w")

    private Integer w;

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
    @JsonProperty(value = "stroke_color")

    private String strokeColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stroke_thickness")

    private Float strokeThickness;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opacity")

    private Float opacity;

    public SubtitleConfig withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * **参数解释**： 字幕框左下角像素点坐标。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * minimum: 0
     * maximum: 1920
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public SubtitleConfig withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * **参数解释**： 字幕框左下角像素点坐标。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * minimum: 0
     * maximum: 1920
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public SubtitleConfig withH(Integer h) {
        this.h = h;
        return this;
    }

    /**
     * **参数解释**： 字幕框高度。 **约束限制**： 参数h用于方便前端计算字幕框左上角坐标，后台不使用该参数。
     * minimum: 0
     * maximum: 1920
     * @return h
     */
    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public SubtitleConfig withW(Integer w) {
        this.w = w;
        return this;
    }

    /**
     * **参数解释**： 字幕框宽度。 **约束限制**： * 字幕框宽度固定为屏幕宽度的80% * 参数w用于方便前端计算字幕框左上角坐标，后台不使用该参数
     * minimum: 0
     * maximum: 1920
     * @return w
     */
    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public SubtitleConfig withFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }

    /**
     * **参数解释**： 字体。当前支持的字体请参考[服务支持的字体](metastudio_02_0041.xml) **约束限制**： 不涉及。 **取值范围**： 字符长度0-64位
     * @return fontName
     */
    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public SubtitleConfig withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * **参数解释**： 字体大小。接口的取值范围为0-120，实际业务使用的取值范围要求为24-120，请以业务实际使用要求为准。 **约束限制**： 不涉及。
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

    public SubtitleConfig withFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * **参数解释**： 字幕字体颜色的RGB颜色值。 **约束限制**： 无 **取值范围**： 字符长度0-7位，固定长度
     * @return fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public SubtitleConfig withStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    /**
     * **参数解释**： 字幕字体描边颜色的RGB颜色值。 **约束限制**： 无 **取值范围**： 字符长度0-7位，固定长度
     * @return strokeColor
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public SubtitleConfig withStrokeThickness(Float strokeThickness) {
        this.strokeThickness = strokeThickness;
        return this;
    }

    /**
     * **参数解释**： 字幕字体描边粗细像素值。 **约束限制**： 无 **取值范围**： 0-50
     * minimum: 0
     * maximum: 5E+1
     * @return strokeThickness
     */
    public Float getStrokeThickness() {
        return strokeThickness;
    }

    public void setStrokeThickness(Float strokeThickness) {
        this.strokeThickness = strokeThickness;
    }

    public SubtitleConfig withOpacity(Float opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * **参数解释**： 字幕字体不透明度，0表示完全透明，1表示完全不透明。默认1。 **约束限制**： 无 **取值范围**： 0-1
     * minimum: 0
     * maximum: 1
     * @return opacity
     */
    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtitleConfig that = (SubtitleConfig) obj;
        return Objects.equals(this.dx, that.dx) && Objects.equals(this.dy, that.dy) && Objects.equals(this.h, that.h)
            && Objects.equals(this.w, that.w) && Objects.equals(this.fontName, that.fontName)
            && Objects.equals(this.fontSize, that.fontSize) && Objects.equals(this.fontColor, that.fontColor)
            && Objects.equals(this.strokeColor, that.strokeColor)
            && Objects.equals(this.strokeThickness, that.strokeThickness) && Objects.equals(this.opacity, that.opacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, h, w, fontName, fontSize, fontColor, strokeColor, strokeThickness, opacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleConfig {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    h: ").append(toIndentedString(h)).append("\n");
        sb.append("    w: ").append(toIndentedString(w)).append("\n");
        sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
        sb.append("    strokeColor: ").append(toIndentedString(strokeColor)).append("\n");
        sb.append("    strokeThickness: ").append(toIndentedString(strokeThickness)).append("\n");
        sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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
