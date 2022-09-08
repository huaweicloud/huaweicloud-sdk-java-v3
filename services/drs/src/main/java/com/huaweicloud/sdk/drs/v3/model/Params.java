package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据参数信息体
 */
public class Params {

    /**
     * 参数对比结果
     */
    public static final class CompareResultEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final CompareResultEnum TRUE = new CompareResultEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final CompareResultEnum FALSE = new CompareResultEnum("false");

        private static final Map<String, CompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareResultEnum> createStaticFields() {
            Map<String, CompareResultEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareResultEnum(String value) {
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
        public static CompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CompareResultEnum(value);
            }
            return result;
        }

        public static CompareResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareResultEnum) {
                return this.value.equals(((CompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private CompareResultEnum compareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    /**
     * 分组
     */
    public static final class GroupEnum {

        /**
         * Enum COMMON_ for value: "common-常规参数"
         */
        public static final GroupEnum COMMON_ = new GroupEnum("common-常规参数");

        /**
         * Enum PERFORMANCE_ for value: "performance-性能参数"
         */
        public static final GroupEnum PERFORMANCE_ = new GroupEnum("performance-性能参数");

        private static final Map<String, GroupEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupEnum> createStaticFields() {
            Map<String, GroupEnum> map = new HashMap<>();
            map.put("common-常规参数", COMMON_);
            map.put("performance-性能参数", PERFORMANCE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupEnum(String value) {
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
        public static GroupEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            GroupEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new GroupEnum(value);
            }
            return result;
        }

        public static GroupEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            GroupEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupEnum) {
                return this.value.equals(((GroupEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private GroupEnum group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * 是否需要重启
     */
    public static final class NeedRestartEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final NeedRestartEnum TRUE = new NeedRestartEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final NeedRestartEnum FALSE = new NeedRestartEnum("false");

        private static final Map<String, NeedRestartEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NeedRestartEnum> createStaticFields() {
            Map<String, NeedRestartEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NeedRestartEnum(String value) {
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
        public static NeedRestartEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NeedRestartEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NeedRestartEnum(value);
            }
            return result;
        }

        public static NeedRestartEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NeedRestartEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NeedRestartEnum) {
                return this.value.equals(((NeedRestartEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    private NeedRestartEnum needRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_value")

    private String sourceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public Params withCompareResult(CompareResultEnum compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    /**
     * 参数对比结果
     * @return compareResult
     */
    public CompareResultEnum getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(CompareResultEnum compareResult) {
        this.compareResult = compareResult;
    }

    public Params withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 参数类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Params withGroup(GroupEnum group) {
        this.group = group;
        return this;
    }

    /**
     * 分组
     * @return group
     */
    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    public Params withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 参数名
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Params withNeedRestart(NeedRestartEnum needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * 是否需要重启
     * @return needRestart
     */
    public NeedRestartEnum getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(NeedRestartEnum needRestart) {
        this.needRestart = needRestart;
    }

    public Params withSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
        return this;
    }

    /**
     * 源数据库参数值
     * @return sourceValue
     */
    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }

    public Params withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * 目标数据库参数值
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public Params withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数范围
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public Params withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Params withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Params params = (Params) o;
        return Objects.equals(this.compareResult, params.compareResult)
            && Objects.equals(this.dataType, params.dataType) && Objects.equals(this.group, params.group)
            && Objects.equals(this.key, params.key) && Objects.equals(this.needRestart, params.needRestart)
            && Objects.equals(this.sourceValue, params.sourceValue)
            && Objects.equals(this.targetValue, params.targetValue)
            && Objects.equals(this.valueRange, params.valueRange) && Objects.equals(this.errorCode, params.errorCode)
            && Objects.equals(this.errorMessage, params.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareResult,
            dataType,
            group,
            key,
            needRestart,
            sourceValue,
            targetValue,
            valueRange,
            errorCode,
            errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Params {\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
