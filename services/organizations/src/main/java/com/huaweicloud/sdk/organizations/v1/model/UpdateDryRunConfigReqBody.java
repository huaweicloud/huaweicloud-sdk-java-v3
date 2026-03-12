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
 * 更新策略试运行的请求体。
 */
public class UpdateDryRunConfigReqBody {

    /**
     * 试运行策略的类型名称，service_control_policy服务控制策略。
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyTypeEnum(value));
        }

        public static PolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 策略试运行的开启状态。enabled：启用；disabled 禁用。
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_prefix")

    private String bucketPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public UpdateDryRunConfigReqBody withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 试运行策略的类型名称，service_control_policy服务控制策略。
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public UpdateDryRunConfigReqBody withRootId(String rootId) {
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

    public UpdateDryRunConfigReqBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 策略试运行的开启状态。enabled：启用；disabled 禁用。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateDryRunConfigReqBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 用户桶名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public UpdateDryRunConfigReqBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 用户桶所在的region。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public UpdateDryRunConfigReqBody withBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    /**
     * 用户桶的前缀。
     * @return bucketPrefix
     */
    public String getBucketPrefix() {
        return bucketPrefix;
    }

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    public UpdateDryRunConfigReqBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称。Organizations服务通过此委托将试运行日志写入用户obs桶
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDryRunConfigReqBody that = (UpdateDryRunConfigReqBody) obj;
        return Objects.equals(this.policyType, that.policyType) && Objects.equals(this.rootId, that.rootId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.bucketPrefix, that.bucketPrefix)
            && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyType, rootId, status, bucketName, regionId, bucketPrefix, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDryRunConfigReqBody {\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    bucketPrefix: ").append(toIndentedString(bucketPrefix)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
