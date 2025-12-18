package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPackageProductsRequest {

    /**
     * **参数解释**： 参数表示用户的语言/所在区域。根据 locale 参数，系统会返回适合该语言/区域的套餐包名称。 **约束限制：** 不涉及 **取值范围**： - zh-cn: 显示中文名称，例如：“Autopilot 通用型 1,000 核时CPU月包” - en-us: 显示英文名称，例如：“Autopilot General Computing 1,000 vCPU-hours CPU monthly package”  **默认取值：** zh-cn
     */
    public static final class LocaleEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final LocaleEnum ZH_CN = new LocaleEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final LocaleEnum EN_US = new LocaleEnum("en-us");

        private static final Map<String, LocaleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocaleEnum> createStaticFields() {
            Map<String, LocaleEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocaleEnum(String value) {
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
        public static LocaleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocaleEnum(value));
        }

        public static LocaleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocaleEnum) {
                return this.value.equals(((LocaleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private LocaleEnum locale;

    public ListPackageProductsRequest withLocale(LocaleEnum locale) {
        this.locale = locale;
        return this;
    }

    /**
     * **参数解释**： 参数表示用户的语言/所在区域。根据 locale 参数，系统会返回适合该语言/区域的套餐包名称。 **约束限制：** 不涉及 **取值范围**： - zh-cn: 显示中文名称，例如：“Autopilot 通用型 1,000 核时CPU月包” - en-us: 显示英文名称，例如：“Autopilot General Computing 1,000 vCPU-hours CPU monthly package”  **默认取值：** zh-cn
     * @return locale
     */
    public LocaleEnum getLocale() {
        return locale;
    }

    public void setLocale(LocaleEnum locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPackageProductsRequest that = (ListPackageProductsRequest) obj;
        return Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPackageProductsRequest {\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
