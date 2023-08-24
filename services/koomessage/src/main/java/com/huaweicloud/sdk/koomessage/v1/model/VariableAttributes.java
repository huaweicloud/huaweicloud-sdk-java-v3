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
     * 参数类型。
     */
    public static final class VariableTypeEnum {

        /**
         * Enum PHONE_ for value: "PHONE：电话号码"
         */
        public static final VariableTypeEnum PHONE_ = new VariableTypeEnum("PHONE：电话号码");

        /**
         * Enum NEWTEXT_ for value: "NEWTEXT：解析标识"
         */
        public static final VariableTypeEnum NEWTEXT_ = new VariableTypeEnum("NEWTEXT：解析标识");

        /**
         * Enum CHARDIGIT_ for value: "CHARDIGIT：其他号码(如验证码、订单号、密码等)"
         */
        public static final VariableTypeEnum CHARDIGIT_ = new VariableTypeEnum("CHARDIGIT：其他号码(如验证码、订单号、密码等)");

        /**
         * Enum DATETIME_ for value: "DATETIME：日期时间"
         */
        public static final VariableTypeEnum DATETIME_ = new VariableTypeEnum("DATETIME：日期时间");

        /**
         * Enum MONEY_ for value: "MONEY：金额"
         */
        public static final VariableTypeEnum MONEY_ = new VariableTypeEnum("MONEY：金额");

        /**
         * Enum TEXT_ for value: "TEXT：其他"
         */
        public static final VariableTypeEnum TEXT_ = new VariableTypeEnum("TEXT：其他");

        private static final Map<String, VariableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VariableTypeEnum> createStaticFields() {
            Map<String, VariableTypeEnum> map = new HashMap<>();
            map.put("PHONE：电话号码", PHONE_);
            map.put("NEWTEXT：解析标识", NEWTEXT_);
            map.put("CHARDIGIT：其他号码(如验证码、订单号、密码等)", CHARDIGIT_);
            map.put("DATETIME：日期时间", DATETIME_);
            map.put("MONEY：金额", MONEY_);
            map.put("TEXT：其他", TEXT_);
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
     * 参数类型。
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
