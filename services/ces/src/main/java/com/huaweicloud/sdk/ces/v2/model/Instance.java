package com.huaweicloud.sdk.ces.v2.model;

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
 * **参数解释** 资源名称匹配参数 **约束限制** 不涉及 
 */
public class Instance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    /**
     * **参数解释** 逻辑运算符 **约束限制** 不涉及 **取值范围** - ALL: 所有条件匹配成功 - ANY: 任意条件匹配成功 **默认取值** 不涉及 
     */
    public static final class LogicalOperatorEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LogicalOperatorEnum ALL = new LogicalOperatorEnum("ALL");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final LogicalOperatorEnum ANY = new LogicalOperatorEnum("ANY");

        private static final Map<String, LogicalOperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogicalOperatorEnum> createStaticFields() {
            Map<String, LogicalOperatorEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogicalOperatorEnum(String value) {
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
        public static LogicalOperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogicalOperatorEnum(value));
        }

        public static LogicalOperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogicalOperatorEnum) {
                return this.value.equals(((LogicalOperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_operator")

    private LogicalOperatorEnum logicalOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_names")

    private List<ResourceNameItem> instanceNames = null;

    public Instance withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释** 云产品名称 **约束限制** 不涉及 **取值范围** 长度为[0,128]个字符 **默认取值** 不涉及 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Instance withLogicalOperator(LogicalOperatorEnum logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * **参数解释** 逻辑运算符 **约束限制** 不涉及 **取值范围** - ALL: 所有条件匹配成功 - ANY: 任意条件匹配成功 **默认取值** 不涉及 
     * @return logicalOperator
     */
    public LogicalOperatorEnum getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(LogicalOperatorEnum logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public Instance withInstanceNames(List<ResourceNameItem> instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }

    public Instance addInstanceNamesItem(ResourceNameItem instanceNamesItem) {
        if (this.instanceNames == null) {
            this.instanceNames = new ArrayList<>();
        }
        this.instanceNames.add(instanceNamesItem);
        return this;
    }

    public Instance withInstanceNames(Consumer<List<ResourceNameItem>> instanceNamesSetter) {
        if (this.instanceNames == null) {
            this.instanceNames = new ArrayList<>();
        }
        instanceNamesSetter.accept(this.instanceNames);
        return this;
    }

    /**
     * **参数解释** 资源名称匹配参数数组 **约束限制** 不超过10个名称 
     * @return instanceNames
     */
    public List<ResourceNameItem> getInstanceNames() {
        return instanceNames;
    }

    public void setInstanceNames(List<ResourceNameItem> instanceNames) {
        this.instanceNames = instanceNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Instance that = (Instance) obj;
        return Objects.equals(this.productName, that.productName)
            && Objects.equals(this.logicalOperator, that.logicalOperator)
            && Objects.equals(this.instanceNames, that.instanceNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, logicalOperator, instanceNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Instance {\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
        sb.append("    instanceNames: ").append(toIndentedString(instanceNames)).append("\n");
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
