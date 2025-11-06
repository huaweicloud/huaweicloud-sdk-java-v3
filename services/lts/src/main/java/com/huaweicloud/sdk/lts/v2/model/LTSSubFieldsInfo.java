package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * json子字段信息
 */
public class LTSSubFieldsInfo {

    /**
     * 字段类型
     */
    public static final class FieldTypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final FieldTypeEnum STRING = new FieldTypeEnum("string");

        /**
         * Enum LONG for value: "long"
         */
        public static final FieldTypeEnum LONG = new FieldTypeEnum("long");

        /**
         * Enum FLOAT for value: "float"
         */
        public static final FieldTypeEnum FLOAT = new FieldTypeEnum("float");

        private static final Map<String, FieldTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldTypeEnum> createStaticFields() {
            Map<String, FieldTypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("long", LONG);
            map.put("float", FLOAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldTypeEnum(String value) {
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
        public static FieldTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldTypeEnum(value));
        }

        public static FieldTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldTypeEnum) {
                return this.value.equals(((FieldTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldType")

    private FieldTypeEnum fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldName")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quickAnalysis")

    private Boolean quickAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldAnalysisAlias")

    private String fieldAnalysisAlias;

    public LTSSubFieldsInfo withFieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型
     * @return fieldType
     */
    public FieldTypeEnum getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public LTSSubFieldsInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 字段名称
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public LTSSubFieldsInfo withQuickAnalysis(Boolean quickAnalysis) {
        this.quickAnalysis = quickAnalysis;
        return this;
    }

    /**
     * 是否快速分析
     * @return quickAnalysis
     */
    public Boolean getQuickAnalysis() {
        return quickAnalysis;
    }

    public void setQuickAnalysis(Boolean quickAnalysis) {
        this.quickAnalysis = quickAnalysis;
    }

    public LTSSubFieldsInfo withFieldAnalysisAlias(String fieldAnalysisAlias) {
        this.fieldAnalysisAlias = fieldAnalysisAlias;
        return this;
    }

    /**
     * **参数解释：** 别名，设置别名后，只支持使用别名进行SQL搜索分析，不支持使用别名进行关键字搜索。 **约束限制：** 不涉及。 **取值范围：** 长度不能大于256。 **默认取值：** 不涉及。
     * @return fieldAnalysisAlias
     */
    public String getFieldAnalysisAlias() {
        return fieldAnalysisAlias;
    }

    public void setFieldAnalysisAlias(String fieldAnalysisAlias) {
        this.fieldAnalysisAlias = fieldAnalysisAlias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LTSSubFieldsInfo that = (LTSSubFieldsInfo) obj;
        return Objects.equals(this.fieldType, that.fieldType) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.quickAnalysis, that.quickAnalysis)
            && Objects.equals(this.fieldAnalysisAlias, that.fieldAnalysisAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldType, fieldName, quickAnalysis, fieldAnalysisAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LTSSubFieldsInfo {\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    quickAnalysis: ").append(toIndentedString(quickAnalysis)).append("\n");
        sb.append("    fieldAnalysisAlias: ").append(toIndentedString(fieldAnalysisAlias)).append("\n");
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
