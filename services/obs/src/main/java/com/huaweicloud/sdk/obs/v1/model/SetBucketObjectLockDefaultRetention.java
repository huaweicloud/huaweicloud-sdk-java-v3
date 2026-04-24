package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 桶级WORM策略的容器，DefaultRetention是Mode、Days、Years的父节点。 如果有Rule容器则必选 
 */
@JacksonXmlRootElement(localName = "DefaultRetention")
public class SetBucketObjectLockDefaultRetention {

    /**
     * 参数解释： 桶的WORM保护策略。 约束限制： 不涉及 取值范围： COMPLIANCE：合规模式。 默认取值： 不涉及 
     */
    public static final class ModeEnum {

        /**
         * Enum COMPLIANCE for value: "COMPLIANCE"
         */
        public static final ModeEnum COMPLIANCE = new ModeEnum("COMPLIANCE");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("COMPLIANCE", COMPLIANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Mode")

    @JacksonXmlProperty(localName = "Mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Days")

    @JacksonXmlProperty(localName = "Days")

    private Integer days;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Years")

    @JacksonXmlProperty(localName = "Years")

    private Integer years;

    public SetBucketObjectLockDefaultRetention withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 参数解释： 桶的WORM保护策略。 约束限制： 不涉及 取值范围： COMPLIANCE：合规模式。 默认取值： 不涉及 
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public SetBucketObjectLockDefaultRetention withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * 参数解释： 保护天数。单位：天。 约束限制： Days和Years只能有一个不为0，并且在规定取值范围内。 取值范围： 1~36500 默认取值： 不涉及 
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public SetBucketObjectLockDefaultRetention withYears(Integer years) {
        this.years = years;
        return this;
    }

    /**
     * 参数解释： 默认的保护年数，单位：年。 约束限制： 一年实际上视为保护365天，不考虑闰年。 Days和Years只能有一个不为0，并且在规定取值范围内。 取值范围： 1~100 默认取值： 不涉及 
     * @return years
     */
    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketObjectLockDefaultRetention that = (SetBucketObjectLockDefaultRetention) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.days, that.days)
            && Objects.equals(this.years, that.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, days, years);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketObjectLockDefaultRetention {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    years: ").append(toIndentedString(years)).append("\n");
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
