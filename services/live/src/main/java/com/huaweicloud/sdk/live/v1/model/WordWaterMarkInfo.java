package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WordWaterMarkInfo
 */
public class WordWaterMarkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_color")

    private String fontColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_size")

    private Integer fontSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font")

    private String font;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shadow_color")

    private String shadowColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private WatermarkLocation location;

    public WordWaterMarkInfo withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 水印文字内容，必填 字幕内容1-64 type为1或2时必填，type为0时非必填
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public WordWaterMarkInfo withFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * 参数校验：首位为#、除#外为6位或8位，每位字符由 0-9、a~f、A~F 组成【务必校验，错误时转码默认白色】
     * @return fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public WordWaterMarkInfo withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 字体大小
     * minimum: 4
     * maximum: 72
     * @return fontSize
     */
    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public WordWaterMarkInfo withFont(String font) {
        this.font = font;
        return this;
    }

    /**
     * 字体，缺省值 空，可选值：harmonyRegular（鸿蒙）、douyu2.0（斗鱼追光体）
     * @return font
     */
    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public WordWaterMarkInfo withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区，【取值参考 UTC-1200 至 UTC+1200，前三位UTC，第四位+或-，五六位表示小时，七八位固定00】
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public WordWaterMarkInfo withShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    /**
     * 缺省值 none，参数校验：首位为#、除#外为6位或8位，每位字符由 0-9、a~f、A~F 组成【务必校验，错误时转码默认黑色】
     * @return shadowColor
     */
    public String getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    public WordWaterMarkInfo withLocation(WatermarkLocation location) {
        this.location = location;
        return this;
    }

    public WordWaterMarkInfo withLocation(Consumer<WatermarkLocation> locationSetter) {
        if (this.location == null) {
            this.location = new WatermarkLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public WatermarkLocation getLocation() {
        return location;
    }

    public void setLocation(WatermarkLocation location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WordWaterMarkInfo that = (WordWaterMarkInfo) obj;
        return Objects.equals(this.format, that.format) && Objects.equals(this.fontColor, that.fontColor)
            && Objects.equals(this.fontSize, that.fontSize) && Objects.equals(this.font, that.font)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.shadowColor, that.shadowColor)
            && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, fontColor, fontSize, font, timeZone, shadowColor, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordWaterMarkInfo {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    font: ").append(toIndentedString(font)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    shadowColor: ").append(toIndentedString(shadowColor)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
