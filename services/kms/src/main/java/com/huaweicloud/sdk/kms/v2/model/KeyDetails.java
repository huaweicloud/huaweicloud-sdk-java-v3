package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** KeyDetails */
public class KeyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_alias")

    private String keyAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realm")

    private String realm;

    /** 密钥生成算法。 - AES_256 - SM4 - RSA_2048 - RSA_3072 - RSA_4096 - EC_P256 - EC_P384 - SM2 */
    public static final class KeySpecEnum {

        /** Enum AES_256 for value: "AES_256" */
        public static final KeySpecEnum AES_256 = new KeySpecEnum("AES_256");

        /** Enum SM4 for value: "SM4" */
        public static final KeySpecEnum SM4 = new KeySpecEnum("SM4");

        /** Enum RSA_2048 for value: "RSA_2048" */
        public static final KeySpecEnum RSA_2048 = new KeySpecEnum("RSA_2048");

        /** Enum RSA_3072 for value: "RSA_3072" */
        public static final KeySpecEnum RSA_3072 = new KeySpecEnum("RSA_3072");

        /** Enum RSA_4096 for value: "RSA_4096" */
        public static final KeySpecEnum RSA_4096 = new KeySpecEnum("RSA_4096");

        /** Enum EC_P256 for value: "EC_P256" */
        public static final KeySpecEnum EC_P256 = new KeySpecEnum("EC_P256");

        /** Enum EC_P384 for value: "EC_P384" */
        public static final KeySpecEnum EC_P384 = new KeySpecEnum("EC_P384");

        /** Enum SM2 for value: "SM2" */
        public static final KeySpecEnum SM2 = new KeySpecEnum("SM2");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("SM4", SM4);
            map.put("RSA_2048", RSA_2048);
            map.put("RSA_3072", RSA_3072);
            map.put("RSA_4096", RSA_4096);
            map.put("EC_P256", EC_P256);
            map.put("EC_P384", EC_P384);
            map.put("SM2", SM2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeySpecEnum(String value) {
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
        public static KeySpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KeySpecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeySpecEnum(value);
            }
            return result;
        }

        public static KeySpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeySpecEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeySpecEnum) {
                return this.value.equals(((KeySpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_spec")

    private KeySpecEnum keySpec;

    /** 密钥用途。 - ENCRYPT_DECRYPT - SIGN_VERIFY */
    public static final class KeyUsageEnum {

        /** Enum ENCRYPT_DECRYPT for value: "ENCRYPT_DECRYPT" */
        public static final KeyUsageEnum ENCRYPT_DECRYPT = new KeyUsageEnum("ENCRYPT_DECRYPT");

        /** Enum SIGN_VERIFY for value: "SIGN_VERIFY" */
        public static final KeyUsageEnum SIGN_VERIFY = new KeyUsageEnum("SIGN_VERIFY");

        private static final Map<String, KeyUsageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyUsageEnum> createStaticFields() {
            Map<String, KeyUsageEnum> map = new HashMap<>();
            map.put("ENCRYPT_DECRYPT", ENCRYPT_DECRYPT);
            map.put("SIGN_VERIFY", SIGN_VERIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyUsageEnum(String value) {
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
        public static KeyUsageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KeyUsageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeyUsageEnum(value);
            }
            return result;
        }

        public static KeyUsageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeyUsageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyUsageEnum) {
                return this.value.equals(((KeyUsageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_usage")

    private KeyUsageEnum keyUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_description")

    private String keyDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_deletion_date")

    private String scheduledDeletionDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_state")

    private String keyState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_key_flag")

    private String defaultKeyFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private String keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    /** 密钥来源，默认为“kms”，枚举如下： - kms表示密钥材料由kms生成kms表示密钥材料由kms生成 - external表示密钥材料由外部导入 */
    public static final class OriginEnum {

        /** Enum KMS for value: "kms" */
        public static final OriginEnum KMS = new OriginEnum("kms");

        /** Enum EXTERNAL for value: "external" */
        public static final OriginEnum EXTERNAL = new OriginEnum("external");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("kms", KMS);
            map.put("external", EXTERNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OriginEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginEnum(value);
            }
            return result;
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OriginEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_rotation_enabled")

    private String keyRotationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_enterprise_project_id")

    private String sysEnterpriseProjectId;

    public KeyDetails withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /** 密钥ID。
     * 
     * @return keyId */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public KeyDetails withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 用户域ID。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeyDetails withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    /** 密钥别名。
     * 
     * @return keyAlias */
    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public KeyDetails withRealm(String realm) {
        this.realm = realm;
        return this;
    }

    /** 密钥区域。
     * 
     * @return realm */
    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public KeyDetails withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /** 密钥生成算法。 - AES_256 - SM4 - RSA_2048 - RSA_3072 - RSA_4096 - EC_P256 - EC_P384 - SM2
     * 
     * @return keySpec */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public KeyDetails withKeyUsage(KeyUsageEnum keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /** 密钥用途。 - ENCRYPT_DECRYPT - SIGN_VERIFY
     * 
     * @return keyUsage */
    public KeyUsageEnum getKeyUsage() {
        return keyUsage;
    }

    public void setKeyUsage(KeyUsageEnum keyUsage) {
        this.keyUsage = keyUsage;
    }

    public KeyDetails withKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
        return this;
    }

    /** 密钥描述。
     * 
     * @return keyDescription */
    public String getKeyDescription() {
        return keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    public KeyDetails withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /** 密钥创建时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * 
     * @return creationDate */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public KeyDetails withScheduledDeletionDate(String scheduledDeletionDate) {
        this.scheduledDeletionDate = scheduledDeletionDate;
        return this;
    }

    /** 密钥计划删除时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * 
     * @return scheduledDeletionDate */
    public String getScheduledDeletionDate() {
        return scheduledDeletionDate;
    }

    public void setScheduledDeletionDate(String scheduledDeletionDate) {
        this.scheduledDeletionDate = scheduledDeletionDate;
    }

    public KeyDetails withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /** 密钥状态，满足正则匹配“^[1-5]{1}$”，枚举如下： - “1”表示待激活状态 - “2”表示启用状态 - “3”表示禁用状态 - “4”表示计划删除状态 - “5”表示等待导入状态
     * 
     * @return keyState */
    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    public KeyDetails withDefaultKeyFlag(String defaultKeyFlag) {
        this.defaultKeyFlag = defaultKeyFlag;
        return this;
    }

    /** 默认主密钥标识，默认主密钥标识为1，非默认标识为0。
     * 
     * @return defaultKeyFlag */
    public String getDefaultKeyFlag() {
        return defaultKeyFlag;
    }

    public void setDefaultKeyFlag(String defaultKeyFlag) {
        this.defaultKeyFlag = defaultKeyFlag;
    }

    public KeyDetails withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /** 密钥类型。
     * 
     * @return keyType */
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public KeyDetails withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /** 密钥材料失效时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * 
     * @return expirationTime */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public KeyDetails withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /** 密钥来源，默认为“kms”，枚举如下： - kms表示密钥材料由kms生成kms表示密钥材料由kms生成 - external表示密钥材料由外部导入
     * 
     * @return origin */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public KeyDetails withKeyRotationEnabled(String keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
        return this;
    }

    /** 密钥轮换状态，默认为“false”，表示关闭密钥轮换功能。
     * 
     * @return keyRotationEnabled */
    public String getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    public void setKeyRotationEnabled(String keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    public KeyDetails withSysEnterpriseProjectId(String sysEnterpriseProjectId) {
        this.sysEnterpriseProjectId = sysEnterpriseProjectId;
        return this;
    }

    /** 企业项目ID，默认为“0”。 - 对于开通企业项目的用户，表示资源处于默认企业项目下。 - 对于未开通企业项目的用户，表示资源未处于企业项目下。
     * 
     * @return sysEnterpriseProjectId */
    public String getSysEnterpriseProjectId() {
        return sysEnterpriseProjectId;
    }

    public void setSysEnterpriseProjectId(String sysEnterpriseProjectId) {
        this.sysEnterpriseProjectId = sysEnterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyDetails keyDetails = (KeyDetails) o;
        return Objects.equals(this.keyId, keyDetails.keyId) && Objects.equals(this.domainId, keyDetails.domainId)
            && Objects.equals(this.keyAlias, keyDetails.keyAlias) && Objects.equals(this.realm, keyDetails.realm)
            && Objects.equals(this.keySpec, keyDetails.keySpec) && Objects.equals(this.keyUsage, keyDetails.keyUsage)
            && Objects.equals(this.keyDescription, keyDetails.keyDescription)
            && Objects.equals(this.creationDate, keyDetails.creationDate)
            && Objects.equals(this.scheduledDeletionDate, keyDetails.scheduledDeletionDate)
            && Objects.equals(this.keyState, keyDetails.keyState)
            && Objects.equals(this.defaultKeyFlag, keyDetails.defaultKeyFlag)
            && Objects.equals(this.keyType, keyDetails.keyType)
            && Objects.equals(this.expirationTime, keyDetails.expirationTime)
            && Objects.equals(this.origin, keyDetails.origin)
            && Objects.equals(this.keyRotationEnabled, keyDetails.keyRotationEnabled)
            && Objects.equals(this.sysEnterpriseProjectId, keyDetails.sysEnterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId,
            domainId,
            keyAlias,
            realm,
            keySpec,
            keyUsage,
            keyDescription,
            creationDate,
            scheduledDeletionDate,
            keyState,
            defaultKeyFlag,
            keyType,
            expirationTime,
            origin,
            keyRotationEnabled,
            sysEnterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyDetails {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
        sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    scheduledDeletionDate: ").append(toIndentedString(scheduledDeletionDate)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
        sb.append("    defaultKeyFlag: ").append(toIndentedString(defaultKeyFlag)).append("\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    keyRotationEnabled: ").append(toIndentedString(keyRotationEnabled)).append("\n");
        sb.append("    sysEnterpriseProjectId: ").append(toIndentedString(sysEnterpriseProjectId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
