package com.huaweicloud.sdk.osm.v2.model;

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
 * Answer
 */
public class Answer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_flow_entry")

    private CbsFlowEntry qaFlowEntry;

    public Answer withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 答案内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Answer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 答案Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Answer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Answer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Answer withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Answer withAnswerType(AnswerTypeEnum answerType) {
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

    public Answer withQaFlowEntry(CbsFlowEntry qaFlowEntry) {
        this.qaFlowEntry = qaFlowEntry;
        return this;
    }

    public Answer withQaFlowEntry(Consumer<CbsFlowEntry> qaFlowEntrySetter) {
        if (this.qaFlowEntry == null) {
            this.qaFlowEntry = new CbsFlowEntry();
            qaFlowEntrySetter.accept(this.qaFlowEntry);
        }

        return this;
    }

    /**
     * Get qaFlowEntry
     * @return qaFlowEntry
     */
    public CbsFlowEntry getQaFlowEntry() {
        return qaFlowEntry;
    }

    public void setQaFlowEntry(CbsFlowEntry qaFlowEntry) {
        this.qaFlowEntry = qaFlowEntry;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Answer answer = (Answer) o;
        return Objects.equals(this.content, answer.content) && Objects.equals(this.id, answer.id)
            && Objects.equals(this.tags, answer.tags) && Objects.equals(this.answerType, answer.answerType)
            && Objects.equals(this.qaFlowEntry, answer.qaFlowEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, id, tags, answerType, qaFlowEntry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Answer {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
        sb.append("    qaFlowEntry: ").append(toIndentedString(qaFlowEntry)).append("\n");
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
