package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckNoNewAccessResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    /**
     * 检查新访问权限的结果。 - pass：无新增访问权限 - fail：有新增访问权限 
     */
    public static final class CheckResultEnum {

        /**
         * Enum PASS for value: "pass"
         */
        public static final CheckResultEnum PASS = new CheckResultEnum("pass");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final CheckResultEnum FAIL = new CheckResultEnum("fail");

        private static final Map<String, CheckResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckResultEnum> createStaticFields() {
            Map<String, CheckResultEnum> map = new HashMap<>();
            map.put("pass", PASS);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckResultEnum(String value) {
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
        public static CheckResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckResultEnum(value));
        }

        public static CheckResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CheckResultEnum) {
                return this.value.equals(((CheckResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private CheckResultEnum checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reasons")

    private List<CheckNoNewAccessReason> reasons = null;

    public CheckNoNewAccessResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 更新后的策略是否允许新访问权限的消息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CheckNoNewAccessResponse withCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 检查新访问权限的结果。 - pass：无新增访问权限 - fail：有新增访问权限 
     * @return checkResult
     */
    public CheckResultEnum getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
    }

    public CheckNoNewAccessResponse withReasons(List<CheckNoNewAccessReason> reasons) {
        this.reasons = reasons;
        return this;
    }

    public CheckNoNewAccessResponse addReasonsItem(CheckNoNewAccessReason reasonsItem) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        this.reasons.add(reasonsItem);
        return this;
    }

    public CheckNoNewAccessResponse withReasons(Consumer<List<CheckNoNewAccessReason>> reasonsSetter) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        reasonsSetter.accept(this.reasons);
        return this;
    }

    /**
     * 新增action的statement描述。
     * @return reasons
     */
    public List<CheckNoNewAccessReason> getReasons() {
        return reasons;
    }

    public void setReasons(List<CheckNoNewAccessReason> reasons) {
        this.reasons = reasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckNoNewAccessResponse that = (CheckNoNewAccessResponse) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.checkResult, that.checkResult)
            && Objects.equals(this.reasons, that.reasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, checkResult, reasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNoNewAccessResponse {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
