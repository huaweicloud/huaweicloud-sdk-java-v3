package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAnticrawlerRuleRequestBody
 */
public class UpdateAnticrawlerRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<AnticrawlerCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** JS脚本反爬虫规则类型 **约束限制：** 不涉及 **取值范围：**  - anticrawler_except_url: 防护所有路径模式，在该模式下，查询的JS脚本反爬虫规则为排除的防护路径规则  - anticrawler_specific_url: 防护指定路径模式，在该模式下，查询的JS脚本反爬虫规则为指定要防护的路径规则  **默认取值：** anticrawler_except_url
     */
    public static final class TypeEnum {

        /**
         * Enum ANTICRAWLER_EXCEPT_URL for value: "anticrawler_except_url"
         */
        public static final TypeEnum ANTICRAWLER_EXCEPT_URL = new TypeEnum("anticrawler_except_url");

        /**
         * Enum ANTICRAWLER_SPECIFIC_URL for value: "anticrawler_specific_url"
         */
        public static final TypeEnum ANTICRAWLER_SPECIFIC_URL = new TypeEnum("anticrawler_specific_url");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("anticrawler_except_url", ANTICRAWLER_EXCEPT_URL);
            map.put("anticrawler_specific_url", ANTICRAWLER_SPECIFIC_URL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public UpdateAnticrawlerRuleRequestBody withConditions(List<AnticrawlerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateAnticrawlerRuleRequestBody addConditionsItem(AnticrawlerCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateAnticrawlerRuleRequestBody withConditions(Consumer<List<AnticrawlerCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 匹配条件列表
     * @return conditions
     */
    public List<AnticrawlerCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<AnticrawlerCondition> conditions) {
        this.conditions = conditions;
    }

    public UpdateAnticrawlerRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAnticrawlerRuleRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** JS脚本反爬虫规则类型 **约束限制：** 不涉及 **取值范围：**  - anticrawler_except_url: 防护所有路径模式，在该模式下，查询的JS脚本反爬虫规则为排除的防护路径规则  - anticrawler_specific_url: 防护指定路径模式，在该模式下，查询的JS脚本反爬虫规则为指定要防护的路径规则  **默认取值：** anticrawler_except_url
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateAnticrawlerRuleRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 执行该规则的优先级，值越小，优先级越高，值相同时，规则创建时间早，优先级越高。取值范围：65535。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAnticrawlerRuleRequestBody that = (UpdateAnticrawlerRuleRequestBody) obj;
        return Objects.equals(this.conditions, that.conditions) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions, name, type, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnticrawlerRuleRequestBody {\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
