package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * QaFlowHitNodeVo
 */
public class QaFlowHitNodeVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    /**
     * - TEXT:  - RICH_TEXT:  - FLOW:  - QA_PAIR:  
     */
    public static final class AnswerTypeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final AnswerTypeEnum TEXT = new AnswerTypeEnum("TEXT");

        /**
         * Enum RICH_TEXT for value: "RICH_TEXT"
         */
        public static final AnswerTypeEnum RICH_TEXT = new AnswerTypeEnum("RICH_TEXT");

        /**
         * Enum FLOW for value: "FLOW"
         */
        public static final AnswerTypeEnum FLOW = new AnswerTypeEnum("FLOW");

        /**
         * Enum QA_PAIR for value: "QA_PAIR"
         */
        public static final AnswerTypeEnum QA_PAIR = new AnswerTypeEnum("QA_PAIR");

        private static final Map<String, AnswerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AnswerTypeEnum> createStaticFields() {
            Map<String, AnswerTypeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("RICH_TEXT", RICH_TEXT);
            map.put("FLOW", FLOW);
            map.put("QA_PAIR", QA_PAIR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AnswerTypeEnum(String value) {
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
        public static AnswerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AnswerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AnswerTypeEnum(value);
            }
            return result;
        }

        public static AnswerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AnswerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AnswerTypeEnum) {
                return this.value.equals(((AnswerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_type")

    private AnswerTypeEnum answerType;

    public QaFlowHitNodeVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QaFlowHitNodeVo withName(String name) {
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

    public QaFlowHitNodeVo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public QaFlowHitNodeVo withAnswerType(AnswerTypeEnum answerType) {
        this.answerType = answerType;
        return this;
    }

    /**
     * - TEXT:  - RICH_TEXT:  - FLOW:  - QA_PAIR:  
     * @return answerType
     */
    public AnswerTypeEnum getAnswerType() {
        return answerType;
    }

    public void setAnswerType(AnswerTypeEnum answerType) {
        this.answerType = answerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QaFlowHitNodeVo qaFlowHitNodeVo = (QaFlowHitNodeVo) o;
        return Objects.equals(this.id, qaFlowHitNodeVo.id) && Objects.equals(this.name, qaFlowHitNodeVo.name)
            && Objects.equals(this.content, qaFlowHitNodeVo.content)
            && Objects.equals(this.answerType, qaFlowHitNodeVo.answerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, content, answerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaFlowHitNodeVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
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
