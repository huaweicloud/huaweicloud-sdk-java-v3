package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 命中条件配置
 */
public class HitCondition {

    /**
     * 条件关系；取值And或者Or
     */
    public static final class RelationEnum {

        /**
         * Enum AND for value: "AND"
         */
        public static final RelationEnum AND = new RelationEnum("AND");

        /**
         * Enum OR for value: "OR"
         */
        public static final RelationEnum OR = new RelationEnum("OR");

        private static final Map<String, RelationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationEnum> createStaticFields() {
            Map<String, RelationEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelationEnum(String value) {
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
        public static RelationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RelationEnum(value));
        }

        public static RelationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelationEnum) {
                return this.value.equals(((RelationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private RelationEnum relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<HitConditionTag> tags = null;

    public HitCondition withRelation(RelationEnum relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 条件关系；取值And或者Or
     * @return relation
     */
    public RelationEnum getRelation() {
        return relation;
    }

    public void setRelation(RelationEnum relation) {
        this.relation = relation;
    }

    public HitCondition withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，数值越低优先级越高；取值0-999，默认值为500，为可选值
     * minimum: 0
     * maximum: 999
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public HitCondition withTags(List<HitConditionTag> tags) {
        this.tags = tags;
        return this;
    }

    public HitCondition addTagsItem(HitConditionTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public HitCondition withTags(Consumer<List<HitConditionTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 匹配关系配置
     * @return tags
     */
    public List<HitConditionTag> getTags() {
        return tags;
    }

    public void setTags(List<HitConditionTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HitCondition that = (HitCondition) obj;
        return Objects.equals(this.relation, that.relation) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, priority, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HitCondition {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
