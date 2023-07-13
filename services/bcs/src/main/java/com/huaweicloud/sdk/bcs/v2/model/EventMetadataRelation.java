package com.huaweicloud.sdk.bcs.v2.model;

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
 * 事件告警查询条件组合
 */
public class EventMetadataRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<String> value = null;

    /**
     * 该条件与其他条件的组合方式
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

        /**
         * Enum NOT for value: "NOT"
         */
        public static final RelationEnum NOT = new RelationEnum("NOT");

        private static final Map<String, RelationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationEnum> createStaticFields() {
            Map<String, RelationEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            map.put("NOT", NOT);
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

    public EventMetadataRelation withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 指定查询字段的key，对应metadata里面的key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public EventMetadataRelation withValue(List<String> value) {
        this.value = value;
        return this;
    }

    public EventMetadataRelation addValueItem(String valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public EventMetadataRelation withValue(Consumer<List<String>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 查询条件中指定key的值
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public EventMetadataRelation withRelation(RelationEnum relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 该条件与其他条件的组合方式
     * @return relation
     */
    public RelationEnum getRelation() {
        return relation;
    }

    public void setRelation(RelationEnum relation) {
        this.relation = relation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMetadataRelation that = (EventMetadataRelation) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.relation, that.relation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, relation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventMetadataRelation {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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
