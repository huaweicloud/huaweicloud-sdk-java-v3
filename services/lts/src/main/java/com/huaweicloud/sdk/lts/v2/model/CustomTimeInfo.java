package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomTimeInfo
 */
public class CustomTimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_format")

    private String timeFormat;

    public CustomTimeInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否开启自定义时间字段。 **取值范围：** - true - fasle
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CustomTimeInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 从demoField中选取的作为日志系统时间的字段名称。 **取值范围：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CustomTimeInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 从demoField中选取的作为日志系统时间的字段内容示例。 **取值范围：** 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomTimeInfo withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * **参数解释：** 用于解析字段为时间类型的时间格式参数。 **取值范围：** 不涉及。   
     * @return timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTimeInfo that = (CustomTimeInfo) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value) && Objects.equals(this.timeFormat, that.timeFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, key, value, timeFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomTimeInfo {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
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
