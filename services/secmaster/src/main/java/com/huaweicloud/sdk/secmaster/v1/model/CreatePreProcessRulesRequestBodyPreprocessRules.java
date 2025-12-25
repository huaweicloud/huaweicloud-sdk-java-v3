package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreatePreProcessRulesRequestBodyPreprocessRules
 */
public class CreatePreProcessRulesRequestBodyPreprocessRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapper_id")

    private String mapperId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapper_type_id")

    private String mapperTypeId;

    /**
     * 预处理选项: drop-丢弃
     */
    public static final class ActionEnum {

        /**
         * Enum DROP for value: "drop"
         */
        public static final ActionEnum DROP = new ActionEnum("drop");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("drop", DROP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    public CreatePreProcessRulesRequestBodyPreprocessRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePreProcessRulesRequestBodyPreprocessRules withMapperId(String mapperId) {
        this.mapperId = mapperId;
        return this;
    }

    /**
     * 映射id
     * @return mapperId
     */
    public String getMapperId() {
        return mapperId;
    }

    public void setMapperId(String mapperId) {
        this.mapperId = mapperId;
    }

    public CreatePreProcessRulesRequestBodyPreprocessRules withMapperTypeId(String mapperTypeId) {
        this.mapperTypeId = mapperTypeId;
        return this;
    }

    /**
     * 映射id
     * @return mapperTypeId
     */
    public String getMapperTypeId() {
        return mapperTypeId;
    }

    public void setMapperTypeId(String mapperTypeId) {
        this.mapperTypeId = mapperTypeId;
    }

    public CreatePreProcessRulesRequestBodyPreprocessRules withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 预处理选项: drop-丢弃
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public CreatePreProcessRulesRequestBodyPreprocessRules withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePreProcessRulesRequestBodyPreprocessRules that = (CreatePreProcessRulesRequestBodyPreprocessRules) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.mapperId, that.mapperId)
            && Objects.equals(this.mapperTypeId, that.mapperTypeId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mapperId, mapperTypeId, action, expression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePreProcessRulesRequestBodyPreprocessRules {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mapperId: ").append(toIndentedString(mapperId)).append("\n");
        sb.append("    mapperTypeId: ").append(toIndentedString(mapperTypeId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
