package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 脚本执行入参引用定义
 */
public class ScriptExecuteParamReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer_type")

    private String referType;

    /**
     * 引用参数的唯一主键id
     */
    public static final class ParamIdEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final ParamIdEnum LOW = new ParamIdEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final ParamIdEnum MEDIUM = new ParamIdEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final ParamIdEnum HIGH = new ParamIdEnum("HIGH");

        private static final Map<String, ParamIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ParamIdEnum> createStaticFields() {
            Map<String, ParamIdEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ParamIdEnum(String value) {
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
        public static ParamIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ParamIdEnum(value));
        }

        public static ParamIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ParamIdEnum) {
                return this.value.equals(((ParamIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_id")

    private ParamIdEnum paramId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_version")

    private String paramVersion;

    public ScriptExecuteParamReference withReferType(String referType) {
        this.referType = referType;
        return this;
    }

    /**
     * 参数引用类型：PARAM_STORE
     * @return referType
     */
    public String getReferType() {
        return referType;
    }

    public void setReferType(String referType) {
        this.referType = referType;
    }

    public ScriptExecuteParamReference withParamId(ParamIdEnum paramId) {
        this.paramId = paramId;
        return this;
    }

    /**
     * 引用参数的唯一主键id
     * @return paramId
     */
    public ParamIdEnum getParamId() {
        return paramId;
    }

    public void setParamId(ParamIdEnum paramId) {
        this.paramId = paramId;
    }

    public ScriptExecuteParamReference withParamVersion(String paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }

    /**
     * 引用参数的版本号
     * @return paramVersion
     */
    public String getParamVersion() {
        return paramVersion;
    }

    public void setParamVersion(String paramVersion) {
        this.paramVersion = paramVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecuteParamReference that = (ScriptExecuteParamReference) obj;
        return Objects.equals(this.referType, that.referType) && Objects.equals(this.paramId, that.paramId)
            && Objects.equals(this.paramVersion, that.paramVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referType, paramId, paramVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecuteParamReference {\n");
        sb.append("    referType: ").append(toIndentedString(referType)).append("\n");
        sb.append("    paramId: ").append(toIndentedString(paramId)).append("\n");
        sb.append("    paramVersion: ").append(toIndentedString(paramVersion)).append("\n");
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
