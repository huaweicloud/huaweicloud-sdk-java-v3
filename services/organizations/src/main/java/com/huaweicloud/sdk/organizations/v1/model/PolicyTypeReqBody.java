package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 策略类型相关操作的请求体。
 */
public class PolicyTypeReqBody {

    /**
     * 策略类型的名称，service_control_policy服务控制策略。
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum SERVICE_CONTROL_POLICY for value: "service_control_policy"
         */
        public static final PolicyTypeEnum SERVICE_CONTROL_POLICY = new PolicyTypeEnum("service_control_policy");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("service_control_policy", SERVICE_CONTROL_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyTypeEnum(String value) {
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
        public static PolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PolicyTypeEnum(value);
            }
            return result;
        }

        public static PolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyTypeEnum) {
                return this.value.equals(((PolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyTypeEnum policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    public PolicyTypeReqBody withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型的名称，service_control_policy服务控制策略。
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public PolicyTypeReqBody withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 根的唯一标识符（ID）。
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyTypeReqBody policyTypeReqBody = (PolicyTypeReqBody) o;
        return Objects.equals(this.policyType, policyTypeReqBody.policyType)
            && Objects.equals(this.rootId, policyTypeReqBody.rootId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyType, rootId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTypeReqBody {\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
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
