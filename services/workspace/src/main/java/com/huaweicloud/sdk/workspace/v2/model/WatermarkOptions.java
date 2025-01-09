package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * WatermarkOptions
 */
public class WatermarkOptions {

    /**
     * 展示方式。取值为：FIXED：固定位置。RANDOM：随机运动。
     */
    public static final class ShowStyleEnum {

        /**
         * Enum FIXED for value: "FIXED"
         */
        public static final ShowStyleEnum FIXED = new ShowStyleEnum("FIXED");

        /**
         * Enum RANDOM for value: "RANDOM"
         */
        public static final ShowStyleEnum RANDOM = new ShowStyleEnum("RANDOM");

        private static final Map<String, ShowStyleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShowStyleEnum> createStaticFields() {
            Map<String, ShowStyleEnum> map = new HashMap<>();
            map.put("FIXED", FIXED);
            map.put("RANDOM", RANDOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShowStyleEnum(String value) {
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
        public static ShowStyleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ShowStyleEnum(value));
        }

        public static ShowStyleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ShowStyleEnum) {
                return this.value.equals(((ShowStyleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_style")

    private ShowStyleEnum showStyle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_size")

    private Integer fontSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opacity_setting")

    private String opacitySetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_item_count")

    private Integer contentItemCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_format")

    private String displayFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lean")

    private Integer lean;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_customized")

    private String contentCustomized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_color")

    private String contentColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_security_access")

    private Boolean watermarkSecurityAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_extend_info_switch")

    private Boolean userExtendInfoSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_extend_info")

    private String userExtendInfo;

    public WatermarkOptions withShowStyle(ShowStyleEnum showStyle) {
        this.showStyle = showStyle;
        return this;
    }

    /**
     * 展示方式。取值为：FIXED：固定位置。RANDOM：随机运动。
     * @return showStyle
     */
    public ShowStyleEnum getShowStyle() {
        return showStyle;
    }

    public void setShowStyle(ShowStyleEnum showStyle) {
        this.showStyle = showStyle;
    }

    public WatermarkOptions withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 颜色。格式：RRGGBB。默认：2a2a2a
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public WatermarkOptions withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 字体大小。取值范围为[1-200]。默认：30。
     * minimum: 1
     * maximum: 200
     * @return fontSize
     */
    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public WatermarkOptions withOpacitySetting(String opacitySetting) {
        this.opacitySetting = opacitySetting;
        return this;
    }

    /**
     * 不透明度（%）。取值范围为[0-100]。默认：\"12.5\"。
     * @return opacitySetting
     */
    public String getOpacitySetting() {
        return opacitySetting;
    }

    public void setOpacitySetting(String opacitySetting) {
        this.opacitySetting = opacitySetting;
    }

    public WatermarkOptions withContentItemCount(Integer contentItemCount) {
        this.contentItemCount = contentItemCount;
        return this;
    }

    /**
     * 条目数量。取值范围为[1-30]。默认：1。
     * minimum: 1
     * maximum: 30
     * @return contentItemCount
     */
    public Integer getContentItemCount() {
        return contentItemCount;
    }

    public void setContentItemCount(Integer contentItemCount) {
        this.contentItemCount = contentItemCount;
    }

    public WatermarkOptions withDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
        return this;
    }

    /**
     * 水印内容显示格式。
     * @return displayFormat
     */
    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public WatermarkOptions withLean(Integer lean) {
        this.lean = lean;
        return this;
    }

    /**
     * 倾斜度。取值范围为[-90-90]。默认：-45。
     * minimum: -90
     * maximum: 90
     * @return lean
     */
    public Integer getLean() {
        return lean;
    }

    public void setLean(Integer lean) {
        this.lean = lean;
    }

    public WatermarkOptions withContentCustomized(String contentCustomized) {
        this.contentCustomized = contentCustomized;
        return this;
    }

    /**
     * 自定义内容。内容不得带有类似'>'的特殊字符。
     * @return contentCustomized
     */
    public String getContentCustomized() {
        return contentCustomized;
    }

    public void setContentCustomized(String contentCustomized) {
        this.contentCustomized = contentCustomized;
    }

    public WatermarkOptions withContentColor(String contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    /**
     * 内容颜色。
     * @return contentColor
     */
    public String getContentColor() {
        return contentColor;
    }

    public void setContentColor(String contentColor) {
        this.contentColor = contentColor;
    }

    public WatermarkOptions withWatermarkSecurityAccess(Boolean watermarkSecurityAccess) {
        this.watermarkSecurityAccess = watermarkSecurityAccess;
        return this;
    }

    /**
     * 安全优先开关。
     * @return watermarkSecurityAccess
     */
    public Boolean getWatermarkSecurityAccess() {
        return watermarkSecurityAccess;
    }

    public void setWatermarkSecurityAccess(Boolean watermarkSecurityAccess) {
        this.watermarkSecurityAccess = watermarkSecurityAccess;
    }

    public WatermarkOptions withUserExtendInfoSwitch(Boolean userExtendInfoSwitch) {
        this.userExtendInfoSwitch = userExtendInfoSwitch;
        return this;
    }

    /**
     * 用户扩展信息开关。false：表示关闭。true：表示开启。
     * @return userExtendInfoSwitch
     */
    public Boolean getUserExtendInfoSwitch() {
        return userExtendInfoSwitch;
    }

    public void setUserExtendInfoSwitch(Boolean userExtendInfoSwitch) {
        this.userExtendInfoSwitch = userExtendInfoSwitch;
    }

    public WatermarkOptions withUserExtendInfo(String userExtendInfo) {
        this.userExtendInfo = userExtendInfo;
        return this;
    }

    /**
     * 用户扩展信息。
     * @return userExtendInfo
     */
    public String getUserExtendInfo() {
        return userExtendInfo;
    }

    public void setUserExtendInfo(String userExtendInfo) {
        this.userExtendInfo = userExtendInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatermarkOptions that = (WatermarkOptions) obj;
        return Objects.equals(this.showStyle, that.showStyle) && Objects.equals(this.color, that.color)
            && Objects.equals(this.fontSize, that.fontSize) && Objects.equals(this.opacitySetting, that.opacitySetting)
            && Objects.equals(this.contentItemCount, that.contentItemCount)
            && Objects.equals(this.displayFormat, that.displayFormat) && Objects.equals(this.lean, that.lean)
            && Objects.equals(this.contentCustomized, that.contentCustomized)
            && Objects.equals(this.contentColor, that.contentColor)
            && Objects.equals(this.watermarkSecurityAccess, that.watermarkSecurityAccess)
            && Objects.equals(this.userExtendInfoSwitch, that.userExtendInfoSwitch)
            && Objects.equals(this.userExtendInfo, that.userExtendInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showStyle,
            color,
            fontSize,
            opacitySetting,
            contentItemCount,
            displayFormat,
            lean,
            contentCustomized,
            contentColor,
            watermarkSecurityAccess,
            userExtendInfoSwitch,
            userExtendInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkOptions {\n");
        sb.append("    showStyle: ").append(toIndentedString(showStyle)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    opacitySetting: ").append(toIndentedString(opacitySetting)).append("\n");
        sb.append("    contentItemCount: ").append(toIndentedString(contentItemCount)).append("\n");
        sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
        sb.append("    lean: ").append(toIndentedString(lean)).append("\n");
        sb.append("    contentCustomized: ").append(toIndentedString(contentCustomized)).append("\n");
        sb.append("    contentColor: ").append(toIndentedString(contentColor)).append("\n");
        sb.append("    watermarkSecurityAccess: ").append(toIndentedString(watermarkSecurityAccess)).append("\n");
        sb.append("    userExtendInfoSwitch: ").append(toIndentedString(userExtendInfoSwitch)).append("\n");
        sb.append("    userExtendInfo: ").append(toIndentedString(userExtendInfo)).append("\n");
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
