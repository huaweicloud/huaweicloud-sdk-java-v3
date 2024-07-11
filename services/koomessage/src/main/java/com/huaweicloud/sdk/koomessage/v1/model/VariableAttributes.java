package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VariableAttributes
 */
public class VariableAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_index")

    private Integer variableIndex;

    /**
     * 参数类型。PHONE：电话号码，NEWTEXT：解析标识，CHARDIGIT：其他号码(如验证码、订单号、密码等)，DATETIME：日期时间，MONEY：金额，TEXT：其他。
     */
    public static final class VariableTypeEnum {

        /**
         * Enum PHONE for value: "PHONE"
         */
        public static final VariableTypeEnum PHONE = new VariableTypeEnum("PHONE");

        /**
         * Enum NEWTEXT for value: "NEWTEXT"
         */
        public static final VariableTypeEnum NEWTEXT = new VariableTypeEnum("NEWTEXT");

        /**
         * Enum CHARDIGIT for value: "CHARDIGIT"
         */
        public static final VariableTypeEnum CHARDIGIT = new VariableTypeEnum("CHARDIGIT");

        /**
         * Enum DATETIME for value: "DATETIME"
         */
        public static final VariableTypeEnum DATETIME = new VariableTypeEnum("DATETIME");

        /**
         * Enum MONEY for value: "MONEY"
         */
        public static final VariableTypeEnum MONEY = new VariableTypeEnum("MONEY");

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final VariableTypeEnum TEXT = new VariableTypeEnum("TEXT");

        private static final Map<String, VariableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VariableTypeEnum> createStaticFields() {
            Map<String, VariableTypeEnum> map = new HashMap<>();
            map.put("PHONE", PHONE);
            map.put("NEWTEXT", NEWTEXT);
            map.put("CHARDIGIT", CHARDIGIT);
            map.put("DATETIME", DATETIME);
            map.put("MONEY", MONEY);
            map.put("TEXT", TEXT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VariableTypeEnum(String value) {
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
        public static VariableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VariableTypeEnum(value));
        }

        public static VariableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VariableTypeEnum) {
                return this.value.equals(((VariableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private VariableTypeEnum variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_desc")

    private String variableDesc;

    public VariableAttributes withVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
        return this;
    }

    /**
     * 参数索引。
     * @return variableIndex
     */
    public Integer getVariableIndex() {
        return variableIndex;
    }

    public void setVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
    }

    public VariableAttributes withVariableType(VariableTypeEnum variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 参数类型。PHONE：电话号码，NEWTEXT：解析标识，CHARDIGIT：其他号码(如验证码、订单号、密码等)，DATETIME：日期时间，MONEY：金额，TEXT：其他。
     * @return variableType
     */
    public VariableTypeEnum getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableTypeEnum variableType) {
        this.variableType = variableType;
    }

    public VariableAttributes withVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
        return this;
    }

    /**
     * 参数描述。变量类型为TEXT（其他）时必填。
     * @return variableDesc
     */
    public String getVariableDesc() {
        return variableDesc;
    }

    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VariableAttributes that = (VariableAttributes) obj;
        return Objects.equals(this.variableIndex, that.variableIndex)
            && Objects.equals(this.variableType, that.variableType)
            && Objects.equals(this.variableDesc, that.variableDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableIndex, variableType, variableDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableAttributes {\n");
        sb.append("    variableIndex: ").append(toIndentedString(variableIndex)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variableDesc: ").append(toIndentedString(variableDesc)).append("\n");
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
