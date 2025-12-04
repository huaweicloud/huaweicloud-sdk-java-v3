package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateAnticrawlerRuleTypeResponse extends SdkResponse {

    /**
     * **参数解释：** JS脚本反爬虫规则类型 **约束限制：** 不涉及 **取值范围：**  - anticrawler_except_url: 防护所有路径模式，在该模式下，查询的JS脚本反爬虫规则为排除的防护路径规则  - anticrawler_specific_url: 防护指定路径模式，在该模式下，查询的JS脚本反爬虫规则为指定要防护的路径规则  **默认取值：** anticrawler_except_url
     */
    public static final class AnticrawlerTypeEnum {

        /**
         * Enum ANTICRAWLER_EXCEPT_URL for value: "anticrawler_except_url"
         */
        public static final AnticrawlerTypeEnum ANTICRAWLER_EXCEPT_URL =
            new AnticrawlerTypeEnum("anticrawler_except_url");

        /**
         * Enum ANTICRAWLER_SPECIFIC_URL for value: "anticrawler_specific_url"
         */
        public static final AnticrawlerTypeEnum ANTICRAWLER_SPECIFIC_URL =
            new AnticrawlerTypeEnum("anticrawler_specific_url");

        private static final Map<String, AnticrawlerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AnticrawlerTypeEnum> createStaticFields() {
            Map<String, AnticrawlerTypeEnum> map = new HashMap<>();
            map.put("anticrawler_except_url", ANTICRAWLER_EXCEPT_URL);
            map.put("anticrawler_specific_url", ANTICRAWLER_SPECIFIC_URL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AnticrawlerTypeEnum(String value) {
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
        public static AnticrawlerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AnticrawlerTypeEnum(value));
        }

        public static AnticrawlerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AnticrawlerTypeEnum) {
                return this.value.equals(((AnticrawlerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anticrawler_type")

    private AnticrawlerTypeEnum anticrawlerType;

    public UpdateAnticrawlerRuleTypeResponse withAnticrawlerType(AnticrawlerTypeEnum anticrawlerType) {
        this.anticrawlerType = anticrawlerType;
        return this;
    }

    /**
     * **参数解释：** JS脚本反爬虫规则类型 **约束限制：** 不涉及 **取值范围：**  - anticrawler_except_url: 防护所有路径模式，在该模式下，查询的JS脚本反爬虫规则为排除的防护路径规则  - anticrawler_specific_url: 防护指定路径模式，在该模式下，查询的JS脚本反爬虫规则为指定要防护的路径规则  **默认取值：** anticrawler_except_url
     * @return anticrawlerType
     */
    public AnticrawlerTypeEnum getAnticrawlerType() {
        return anticrawlerType;
    }

    public void setAnticrawlerType(AnticrawlerTypeEnum anticrawlerType) {
        this.anticrawlerType = anticrawlerType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAnticrawlerRuleTypeResponse that = (UpdateAnticrawlerRuleTypeResponse) obj;
        return Objects.equals(this.anticrawlerType, that.anticrawlerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anticrawlerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnticrawlerRuleTypeResponse {\n");
        sb.append("    anticrawlerType: ").append(toIndentedString(anticrawlerType)).append("\n");
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
