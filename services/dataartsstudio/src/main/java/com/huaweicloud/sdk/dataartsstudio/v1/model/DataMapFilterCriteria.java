package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * 过滤条件
 */
public class DataMapFilterCriteria {

    /**
     * 过滤属性维度，枚举值：typeName、base.DataAsset.sourceType、classifications.name、tags.name、securityLevel.name、workspaceId
     */
    public static final class AttributeEnum {

        /**
         * Enum BASE_DATAASSET_SOURCETYPE for value: "base.DataAsset.sourceType"
         */
        public static final AttributeEnum BASE_DATAASSET_SOURCETYPE = new AttributeEnum("base.DataAsset.sourceType");

        /**
         * Enum TYPENAME for value: "typeName"
         */
        public static final AttributeEnum TYPENAME = new AttributeEnum("typeName");

        /**
         * Enum CLASSIFICATIONS_NAME for value: "classifications.name"
         */
        public static final AttributeEnum CLASSIFICATIONS_NAME = new AttributeEnum("classifications.name");

        /**
         * Enum TAGS_NAME for value: "tags.name"
         */
        public static final AttributeEnum TAGS_NAME = new AttributeEnum("tags.name");

        /**
         * Enum SECURITYLEVEL_NAME for value: "securityLevel.name"
         */
        public static final AttributeEnum SECURITYLEVEL_NAME = new AttributeEnum("securityLevel.name");

        /**
         * Enum WORKSPACEID for value: "workspaceId"
         */
        public static final AttributeEnum WORKSPACEID = new AttributeEnum("workspaceId");

        private static final Map<String, AttributeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AttributeEnum> createStaticFields() {
            Map<String, AttributeEnum> map = new HashMap<>();
            map.put("base.DataAsset.sourceType", BASE_DATAASSET_SOURCETYPE);
            map.put("typeName", TYPENAME);
            map.put("classifications.name", CLASSIFICATIONS_NAME);
            map.put("tags.name", TAGS_NAME);
            map.put("securityLevel.name", SECURITYLEVEL_NAME);
            map.put("workspaceId", WORKSPACEID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AttributeEnum(String value) {
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
        public static AttributeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttributeEnum(value));
        }

        public static AttributeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AttributeEnum) {
                return this.value.equals(((AttributeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private AttributeEnum attribute;

    /**
     * 操作表示，枚举值：EQ、IN
     */
    public static final class OperatorEnum {

        /**
         * Enum IN for value: "IN"
         */
        public static final OperatorEnum IN = new OperatorEnum("IN");

        /**
         * Enum EQ for value: "EQ"
         */
        public static final OperatorEnum EQ = new OperatorEnum("EQ");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("IN", IN);
            map.put("EQ", EQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperatorEnum(value));
        }

        public static OperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperatorEnum) {
                return this.value.equals(((OperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorEnum operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<String> value = null;

    /**
     * 条件拼接准则，取值范围 AND,OR
     */
    public static final class ConditionEnum {

        /**
         * Enum OR for value: "OR"
         */
        public static final ConditionEnum OR = new ConditionEnum("OR");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("OR", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionEnum(value));
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterion")

    private List<DataMapFilterCriteria> criterion = null;

    public DataMapFilterCriteria withAttribute(AttributeEnum attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * 过滤属性维度，枚举值：typeName、base.DataAsset.sourceType、classifications.name、tags.name、securityLevel.name、workspaceId
     * @return attribute
     */
    public AttributeEnum getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeEnum attribute) {
        this.attribute = attribute;
    }

    public DataMapFilterCriteria withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作表示，枚举值：EQ、IN
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public DataMapFilterCriteria withValue(List<String> value) {
        this.value = value;
        return this;
    }

    public DataMapFilterCriteria addValueItem(String valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public DataMapFilterCriteria withValue(Consumer<List<String>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 属性过滤值，根据attribute变化。如attribute为数据源：base.DataAsset.sourceType，则值可为[\"dws\", \"hive\"]
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public DataMapFilterCriteria withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 条件拼接准则，取值范围 AND,OR
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    public DataMapFilterCriteria withCriterion(List<DataMapFilterCriteria> criterion) {
        this.criterion = criterion;
        return this;
    }

    public DataMapFilterCriteria addCriterionItem(DataMapFilterCriteria criterionItem) {
        if (this.criterion == null) {
            this.criterion = new ArrayList<>();
        }
        this.criterion.add(criterionItem);
        return this;
    }

    public DataMapFilterCriteria withCriterion(Consumer<List<DataMapFilterCriteria>> criterionSetter) {
        if (this.criterion == null) {
            this.criterion = new ArrayList<>();
        }
        criterionSetter.accept(this.criterion);
        return this;
    }

    /**
     * 条件准则
     * @return criterion
     */
    public List<DataMapFilterCriteria> getCriterion() {
        return criterion;
    }

    public void setCriterion(List<DataMapFilterCriteria> criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataMapFilterCriteria that = (DataMapFilterCriteria) obj;
        return Objects.equals(this.attribute, that.attribute) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.criterion, that.criterion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, operator, value, condition, criterion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMapFilterCriteria {\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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
