package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEffectivePoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_at")

    private OffsetDateTime lastUpdatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_content")

    private String policyContent;

    /**
     * 策略类型的名称，tag_policy标签策略。
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum TAG_POLICY for value: "tag_policy"
         */
        public static final PolicyTypeEnum TAG_POLICY = new PolicyTypeEnum("tag_policy");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("tag_policy", TAG_POLICY);
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
    @JsonProperty(value = "entity_id")

    private String entityId;

    public ShowEffectivePoliciesResponse withLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * 有效策略最后更新时间。
     * @return lastUpdatedAt
     */
    public OffsetDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public ShowEffectivePoliciesResponse withPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }

    /**
     * 有效策略文本内容。
     * @return policyContent
     */
    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    public ShowEffectivePoliciesResponse withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型的名称，tag_policy标签策略。
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public ShowEffectivePoliciesResponse withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * 根、组织单元或帐号的唯一标识符（ID）。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEffectivePoliciesResponse showEffectivePoliciesResponse = (ShowEffectivePoliciesResponse) o;
        return Objects.equals(this.lastUpdatedAt, showEffectivePoliciesResponse.lastUpdatedAt)
            && Objects.equals(this.policyContent, showEffectivePoliciesResponse.policyContent)
            && Objects.equals(this.policyType, showEffectivePoliciesResponse.policyType)
            && Objects.equals(this.entityId, showEffectivePoliciesResponse.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdatedAt, policyContent, policyType, entityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEffectivePoliciesResponse {\n");
        sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
        sb.append("    policyContent: ").append(toIndentedString(policyContent)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
