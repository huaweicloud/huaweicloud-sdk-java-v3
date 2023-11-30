package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DWS容错性选项（用于指定外表数据的各类参数）。
 */
public class Options {

    /**
     * 数据入库时，数据源文件中某行的最后一个字段缺失时，请选择是直接将字段设为Null，还是在错误表中报错提示。  取值范围：   - true/on - false/off  缺省值：false/off
     */
    public static final class FillMissingFieldsEnum {

        /**
         * Enum TRUE_ON for value: "true/on"
         */
        public static final FillMissingFieldsEnum TRUE_ON = new FillMissingFieldsEnum("true/on");

        /**
         * Enum FALSE_OFF for value: "false/off"
         */
        public static final FillMissingFieldsEnum FALSE_OFF = new FillMissingFieldsEnum("false/off");

        private static final Map<String, FillMissingFieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FillMissingFieldsEnum> createStaticFields() {
            Map<String, FillMissingFieldsEnum> map = new HashMap<>();
            map.put("true/on", TRUE_ON);
            map.put("false/off", FALSE_OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FillMissingFieldsEnum(String value) {
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
        public static FillMissingFieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FillMissingFieldsEnum(value));
        }

        public static FillMissingFieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FillMissingFieldsEnum) {
                return this.value.equals(((FillMissingFieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fill_missing_fields")

    private FillMissingFieldsEnum fillMissingFields;

    /**
     * 数据源文件中的字段比外表定义列数多时，是否忽略多出的列。该参数只在数据导入过程中使用。  取值范围：  - true/on - false/off  缺省值：false/off
     */
    public static final class IgnoreExtraDataEnum {

        /**
         * Enum TRUE_ON for value: "true/on"
         */
        public static final IgnoreExtraDataEnum TRUE_ON = new IgnoreExtraDataEnum("true/on");

        /**
         * Enum FALSE_OFF for value: "false/off"
         */
        public static final IgnoreExtraDataEnum FALSE_OFF = new IgnoreExtraDataEnum("false/off");

        private static final Map<String, IgnoreExtraDataEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IgnoreExtraDataEnum> createStaticFields() {
            Map<String, IgnoreExtraDataEnum> map = new HashMap<>();
            map.put("true/on", TRUE_ON);
            map.put("false/off", FALSE_OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IgnoreExtraDataEnum(String value) {
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
        public static IgnoreExtraDataEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IgnoreExtraDataEnum(value));
        }

        public static IgnoreExtraDataEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IgnoreExtraDataEnum) {
                return this.value.equals(((IgnoreExtraDataEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_extra_data")

    private IgnoreExtraDataEnum ignoreExtraData;

    /**
     * 导入非法字符容错参数。是将非法字符按照转换规则转换后入库，还是报错中止导入。  取值范围：  - true/on - false/off  缺省值：false/off
     */
    public static final class CompatibleIllegalCharsEnum {

        /**
         * Enum TRUE_ON for value: "true/on"
         */
        public static final CompatibleIllegalCharsEnum TRUE_ON = new CompatibleIllegalCharsEnum("true/on");

        /**
         * Enum FALSE_OFF for value: "false/off"
         */
        public static final CompatibleIllegalCharsEnum FALSE_OFF = new CompatibleIllegalCharsEnum("false/off");

        private static final Map<String, CompatibleIllegalCharsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompatibleIllegalCharsEnum> createStaticFields() {
            Map<String, CompatibleIllegalCharsEnum> map = new HashMap<>();
            map.put("true/on", TRUE_ON);
            map.put("false/off", FALSE_OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompatibleIllegalCharsEnum(String value) {
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
        public static CompatibleIllegalCharsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new CompatibleIllegalCharsEnum(value));
        }

        public static CompatibleIllegalCharsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompatibleIllegalCharsEnum) {
                return this.value.equals(((CompatibleIllegalCharsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compatible_illegal_chars")

    private CompatibleIllegalCharsEnum compatibleIllegalChars;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reject_limit")

    private String rejectLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_table_name")

    private String errorTableName;

    public Options withFillMissingFields(FillMissingFieldsEnum fillMissingFields) {
        this.fillMissingFields = fillMissingFields;
        return this;
    }

    /**
     * 数据入库时，数据源文件中某行的最后一个字段缺失时，请选择是直接将字段设为Null，还是在错误表中报错提示。  取值范围：   - true/on - false/off  缺省值：false/off
     * @return fillMissingFields
     */
    public FillMissingFieldsEnum getFillMissingFields() {
        return fillMissingFields;
    }

    public void setFillMissingFields(FillMissingFieldsEnum fillMissingFields) {
        this.fillMissingFields = fillMissingFields;
    }

    public Options withIgnoreExtraData(IgnoreExtraDataEnum ignoreExtraData) {
        this.ignoreExtraData = ignoreExtraData;
        return this;
    }

    /**
     * 数据源文件中的字段比外表定义列数多时，是否忽略多出的列。该参数只在数据导入过程中使用。  取值范围：  - true/on - false/off  缺省值：false/off
     * @return ignoreExtraData
     */
    public IgnoreExtraDataEnum getIgnoreExtraData() {
        return ignoreExtraData;
    }

    public void setIgnoreExtraData(IgnoreExtraDataEnum ignoreExtraData) {
        this.ignoreExtraData = ignoreExtraData;
    }

    public Options withCompatibleIllegalChars(CompatibleIllegalCharsEnum compatibleIllegalChars) {
        this.compatibleIllegalChars = compatibleIllegalChars;
        return this;
    }

    /**
     * 导入非法字符容错参数。是将非法字符按照转换规则转换后入库，还是报错中止导入。  取值范围：  - true/on - false/off  缺省值：false/off
     * @return compatibleIllegalChars
     */
    public CompatibleIllegalCharsEnum getCompatibleIllegalChars() {
        return compatibleIllegalChars;
    }

    public void setCompatibleIllegalChars(CompatibleIllegalCharsEnum compatibleIllegalChars) {
        this.compatibleIllegalChars = compatibleIllegalChars;
    }

    public Options withRejectLimit(String rejectLimit) {
        this.rejectLimit = rejectLimit;
        return this;
    }

    /**
     * 指定本次数据导入允许出现的数据格式错误个数，当导入过程中出现的数据格式错误未达到限定值时，本次数据导入可以成功。  取值范围：  - 整型值 - unlimited（无限制）  缺省值为0，有错误信息立即返回。
     * @return rejectLimit
     */
    public String getRejectLimit() {
        return rejectLimit;
    }

    public void setRejectLimit(String rejectLimit) {
        this.rejectLimit = rejectLimit;
    }

    public Options withErrorTableName(String errorTableName) {
        this.errorTableName = errorTableName;
        return this;
    }

    /**
     * 用于记录数据格式错误信息的错误表表名。并行导入结束后查询此错误信息表，能够获取详细的错误信息。
     * @return errorTableName
     */
    public String getErrorTableName() {
        return errorTableName;
    }

    public void setErrorTableName(String errorTableName) {
        this.errorTableName = errorTableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Options that = (Options) obj;
        return Objects.equals(this.fillMissingFields, that.fillMissingFields)
            && Objects.equals(this.ignoreExtraData, that.ignoreExtraData)
            && Objects.equals(this.compatibleIllegalChars, that.compatibleIllegalChars)
            && Objects.equals(this.rejectLimit, that.rejectLimit)
            && Objects.equals(this.errorTableName, that.errorTableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fillMissingFields, ignoreExtraData, compatibleIllegalChars, rejectLimit, errorTableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Options {\n");
        sb.append("    fillMissingFields: ").append(toIndentedString(fillMissingFields)).append("\n");
        sb.append("    ignoreExtraData: ").append(toIndentedString(ignoreExtraData)).append("\n");
        sb.append("    compatibleIllegalChars: ").append(toIndentedString(compatibleIllegalChars)).append("\n");
        sb.append("    rejectLimit: ").append(toIndentedString(rejectLimit)).append("\n");
        sb.append("    errorTableName: ").append(toIndentedString(errorTableName)).append("\n");
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
