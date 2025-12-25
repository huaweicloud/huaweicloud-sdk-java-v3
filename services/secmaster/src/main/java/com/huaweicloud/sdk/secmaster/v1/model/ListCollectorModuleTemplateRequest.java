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
 * Request Object
 */
public class ListCollectorModuleTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**: 解析类型 - FILTER 过滤 - INPUT 输入 - OUTPUT 输出  **约束限制** 不涉及 **取值范围**: - FILTER - INPUT - OUTPUT  **默认值** 不涉及
     */
    public static final class ParserTypeEnum {

        /**
         * Enum FILTER for value: "FILTER"
         */
        public static final ParserTypeEnum FILTER = new ParserTypeEnum("FILTER");

        /**
         * Enum INPUT for value: "INPUT"
         */
        public static final ParserTypeEnum INPUT = new ParserTypeEnum("INPUT");

        /**
         * Enum OUTPUT for value: "OUTPUT"
         */
        public static final ParserTypeEnum OUTPUT = new ParserTypeEnum("OUTPUT");

        private static final Map<String, ParserTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ParserTypeEnum> createStaticFields() {
            Map<String, ParserTypeEnum> map = new HashMap<>();
            map.put("FILTER", FILTER);
            map.put("INPUT", INPUT);
            map.put("OUTPUT", OUTPUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ParserTypeEnum(String value) {
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
        public static ParserTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ParserTypeEnum(value));
        }

        public static ParserTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ParserTypeEnum) {
                return this.value.equals(((ParserTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_type")

    private ParserTypeEnum parserType;

    public ListCollectorModuleTemplateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListCollectorModuleTemplateRequest withParserType(ParserTypeEnum parserType) {
        this.parserType = parserType;
        return this;
    }

    /**
     * **参数解释**: 解析类型 - FILTER 过滤 - INPUT 输入 - OUTPUT 输出  **约束限制** 不涉及 **取值范围**: - FILTER - INPUT - OUTPUT  **默认值** 不涉及
     * @return parserType
     */
    public ParserTypeEnum getParserType() {
        return parserType;
    }

    public void setParserType(ParserTypeEnum parserType) {
        this.parserType = parserType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectorModuleTemplateRequest that = (ListCollectorModuleTemplateRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.parserType, that.parserType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, parserType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectorModuleTemplateRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    parserType: ").append(toIndentedString(parserType)).append("\n");
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
