package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建流程审核请求
 */
public class CreateAopWorkflowVersionApprovelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    /**
     * **参数解释**: 流程的审核结果 - PASS 通过 - UN_PASS 拒绝  **约束限制**: 不涉及         **取值范围**: - PASS - UN_PASS  **默认值**:  不涉及
     */
    public static final class ResultEnum {

        /**
         * Enum PASS for value: "PASS"
         */
        public static final ResultEnum PASS = new ResultEnum("PASS");

        /**
         * Enum UN_PASS for value: "UN_PASS"
         */
        public static final ResultEnum UN_PASS = new ResultEnum("UN_PASS");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("PASS", PASS);
            map.put("UN_PASS", UN_PASS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultEnum(value));
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    public CreateAopWorkflowVersionApprovelInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**: 流程的审核意见 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateAopWorkflowVersionApprovelInfo withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**: 流程的审核结果 - PASS 通过 - UN_PASS 拒绝  **约束限制**: 不涉及         **取值范围**: - PASS - UN_PASS  **默认值**:  不涉及
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAopWorkflowVersionApprovelInfo that = (CreateAopWorkflowVersionApprovelInfo) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAopWorkflowVersionApprovelInfo {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
