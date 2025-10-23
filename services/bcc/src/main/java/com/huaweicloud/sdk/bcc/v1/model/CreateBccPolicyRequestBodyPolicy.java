package com.huaweicloud.sdk.bcc.v1.model;

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
 * policy
 */
public class CreateBccPolicyRequestBodyPolicy {

    /**
     * protection_type
     */
    public static final class ProtectionTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ProtectionTypeEnum BACKUP = new ProtectionTypeEnum("backup");

        /**
         * Enum DISASTER_RECOVERY for value: "disaster_recovery"
         */
        public static final ProtectionTypeEnum DISASTER_RECOVERY = new ProtectionTypeEnum("disaster_recovery");

        private static final Map<String, ProtectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionTypeEnum> createStaticFields() {
            Map<String, ProtectionTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("disaster_recovery", DISASTER_RECOVERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionTypeEnum(String value) {
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
        public static ProtectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionTypeEnum(value));
        }

        public static ProtectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionTypeEnum) {
                return this.value.equals(((ProtectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private ProtectionTypeEnum protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyber")

    private Boolean cyber;

    /**
     * 存储类型，obs,evs,sfs，默认obs
     */
    public static final class StorageTypeEnum {

        /**
         * Enum OBS for value: "obs"
         */
        public static final StorageTypeEnum OBS = new StorageTypeEnum("obs");

        /**
         * Enum EVS for value: "evs"
         */
        public static final StorageTypeEnum EVS = new StorageTypeEnum("evs");

        /**
         * Enum SFS for value: "sfs"
         */
        public static final StorageTypeEnum SFS = new StorageTypeEnum("sfs");

        private static final Map<String, StorageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageTypeEnum> createStaticFields() {
            Map<String, StorageTypeEnum> map = new HashMap<>();
            map.put("obs", OBS);
            map.put("evs", EVS);
            map.put("sfs", SFS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageTypeEnum(String value) {
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
        public static StorageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageTypeEnum(value));
        }

        public static StorageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageTypeEnum) {
                return this.value.equals(((StorageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageTypeEnum storageType;

    /**
     * 策略类型,cbr_local_policy,cbr_remote_policy,rds_local_policy,rds_remote_policy
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum CBR_LOCAL_POLICY for value: "cbr_local_policy"
         */
        public static final PolicyTypeEnum CBR_LOCAL_POLICY = new PolicyTypeEnum("cbr_local_policy");

        /**
         * Enum CBR_REMOTE_POLICY for value: "cbr_remote_policy"
         */
        public static final PolicyTypeEnum CBR_REMOTE_POLICY = new PolicyTypeEnum("cbr_remote_policy");

        /**
         * Enum RDS_LOCAL_POLICY for value: "rds_local_policy"
         */
        public static final PolicyTypeEnum RDS_LOCAL_POLICY = new PolicyTypeEnum("rds_local_policy");

        /**
         * Enum RDS_REMOTE_POLICY for value: "rds_remote_policy"
         */
        public static final PolicyTypeEnum RDS_REMOTE_POLICY = new PolicyTypeEnum("rds_remote_policy");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("cbr_local_policy", CBR_LOCAL_POLICY);
            map.put("cbr_remote_policy", CBR_REMOTE_POLICY);
            map.put("rds_local_policy", RDS_LOCAL_POLICY);
            map.put("rds_remote_policy", RDS_REMOTE_POLICY);
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
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbr_policy_detail")

    private CreateBccPolicyRequestBodyPolicyCbrPolicyDetail cbrPolicyDetail;

    public CreateBccPolicyRequestBodyPolicy withProtectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * protection_type
     * @return protectionType
     */
    public ProtectionTypeEnum getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
    }

    public CreateBccPolicyRequestBodyPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateBccPolicyRequestBodyPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称，取值长度范围[2,64]。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBccPolicyRequestBodyPolicy withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateBccPolicyRequestBodyPolicy withCyber(Boolean cyber) {
        this.cyber = cyber;
        return this;
    }

    /**
     * 是否启用加密
     * @return cyber
     */
    public Boolean getCyber() {
        return cyber;
    }

    public void setCyber(Boolean cyber) {
        this.cyber = cyber;
    }

    public CreateBccPolicyRequestBodyPolicy withStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型，obs,evs,sfs，默认obs
     * @return storageType
     */
    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    public CreateBccPolicyRequestBodyPolicy withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型,cbr_local_policy,cbr_remote_policy,rds_local_policy,rds_remote_policy
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public CreateBccPolicyRequestBodyPolicy withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 保护服务类型，如:ecs, evs, rds
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public CreateBccPolicyRequestBodyPolicy withCbrPolicyDetail(
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetail cbrPolicyDetail) {
        this.cbrPolicyDetail = cbrPolicyDetail;
        return this;
    }

    public CreateBccPolicyRequestBodyPolicy withCbrPolicyDetail(
        Consumer<CreateBccPolicyRequestBodyPolicyCbrPolicyDetail> cbrPolicyDetailSetter) {
        if (this.cbrPolicyDetail == null) {
            this.cbrPolicyDetail = new CreateBccPolicyRequestBodyPolicyCbrPolicyDetail();
            cbrPolicyDetailSetter.accept(this.cbrPolicyDetail);
        }

        return this;
    }

    /**
     * Get cbrPolicyDetail
     * @return cbrPolicyDetail
     */
    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail getCbrPolicyDetail() {
        return cbrPolicyDetail;
    }

    public void setCbrPolicyDetail(CreateBccPolicyRequestBodyPolicyCbrPolicyDetail cbrPolicyDetail) {
        this.cbrPolicyDetail = cbrPolicyDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBccPolicyRequestBodyPolicy that = (CreateBccPolicyRequestBodyPolicy) obj;
        return Objects.equals(this.protectionType, that.protectionType) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.cyber, that.cyber) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.cbrPolicyDetail, that.cbrPolicyDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectionType,
            enabled,
            name,
            regionId,
            cyber,
            storageType,
            policyType,
            serviceType,
            cbrPolicyDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBccPolicyRequestBodyPolicy {\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    cyber: ").append(toIndentedString(cyber)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    cbrPolicyDetail: ").append(toIndentedString(cbrPolicyDetail)).append("\n");
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
