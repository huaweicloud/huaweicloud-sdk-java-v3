package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAiGuardRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    /**
     * **参数解释：** 检测类型 **约束限制：** 不涉及 **取值范围：** text(文本), image(图片) **默认取值：** 不涉及
     */
    public static final class DetectTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final DetectTypeEnum TEXT = new DetectTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final DetectTypeEnum IMAGE = new DetectTypeEnum("image");

        private static final Map<String, DetectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectTypeEnum> createStaticFields() {
            Map<String, DetectTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectTypeEnum(String value) {
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
        public static DetectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DetectTypeEnum(value));
        }

        public static DetectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DetectTypeEnum) {
                return this.value.equals(((DetectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private DetectTypeEnum detectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAiGuardRuleRequestBody body;

    public CreateAiGuardRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 策略ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateAiGuardRuleRequest withDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * **参数解释：** 检测类型 **约束限制：** 不涉及 **取值范围：** text(文本), image(图片) **默认取值：** 不涉及
     * @return detectType
     */
    public DetectTypeEnum getDetectType() {
        return detectType;
    }

    public void setDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
    }

    public CreateAiGuardRuleRequest withBody(CreateAiGuardRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAiGuardRuleRequest withBody(Consumer<CreateAiGuardRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAiGuardRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateAiGuardRuleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateAiGuardRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiGuardRuleRequest that = (CreateAiGuardRuleRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.detectType, that.detectType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, detectType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiGuardRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
