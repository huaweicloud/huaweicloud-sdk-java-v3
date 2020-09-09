package com.huaweicloud.sdk.kms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * KeyDetails
 */
public class KeyDetails  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_alias")
    
    private String keyAlias;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="realm")
    
    private String realm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_description")
    
    private String keyDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creation_date")
    
    private String creationDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduled_deletion_date")
    
    private String scheduledDeletionDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_state")
    
    private String keyState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_key_flag")
    
    private String defaultKeyFlag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_type")
    
    private String keyType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expiration_time")
    
    private String expirationTime;
    /**
     * 密钥来源，默认为“kms”，枚举如下：  - kms表示密钥材料由kms生成kms表示密钥材料由kms生成  - external表示密钥材料由外部导入
     */
    public static final class OriginEnum {

        
        /**
         * Enum KMS for value: "kms"
         */
        public static final OriginEnum KMS = new OriginEnum("kms");
        
        /**
         * Enum EXTERNAL for value: "external"
         */
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

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OriginEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OriginEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginEnum(value);
            }
            return result;
        }

        public static OriginEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof OriginEnum) {
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
    @JsonProperty(value="origin")
    
    private OriginEnum origin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_rotation_enabled")
    
    private String keyRotationEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_enterprise_project_id")
    
    private String sysEnterpriseProjectId;

    public KeyDetails withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID。
     * @return keyId
     */
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

    


    /**
     * 用户域ID。
     * @return domainId
     */
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

    


    /**
     * 密钥别名。
     * @return keyAlias
     */
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

    


    /**
     * 密钥区域。
     * @return realm
     */
    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public KeyDetails withKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
        return this;
    }

    


    /**
     * 密钥描述。
     * @return keyDescription
     */
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

    


    /**
     * 密钥创建时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * @return creationDate
     */
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

    


    /**
     * 密钥计划删除时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * @return scheduledDeletionDate
     */
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

    


    /**
     * 密钥状态，满足正则匹配“^[1-5]{1}$”，枚举如下：  - “1”表示待激活状态  - “2”表示启用状态  - “3”表示禁用状态  - “4”表示计划删除状态  - “5”表示等待导入状态
     * @return keyState
     */
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

    


    /**
     * 默认主密钥标识，默认主密钥标识为1，非默认标识为0。
     * @return defaultKeyFlag
     */
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

    


    /**
     * 密钥类型。
     * @return keyType
     */
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

    


    /**
     * 密钥材料失效时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * @return expirationTime
     */
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

    


    /**
     * 密钥来源，默认为“kms”，枚举如下：  - kms表示密钥材料由kms生成kms表示密钥材料由kms生成  - external表示密钥材料由外部导入
     * @return origin
     */
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

    


    /**
     * 密钥轮换状态，默认为“false”，表示关闭密钥轮换功能。
     * @return keyRotationEnabled
     */
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

    


    /**
     * 企业项目ID，默认为“0”。  - 对于开通企业项目的用户，表示资源处于默认企业项目下。  - 对于未开通企业项目的用户，表示资源未处于企业项目下。
     * @return sysEnterpriseProjectId
     */
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
        return Objects.equals(this.keyId, keyDetails.keyId) &&
            Objects.equals(this.domainId, keyDetails.domainId) &&
            Objects.equals(this.keyAlias, keyDetails.keyAlias) &&
            Objects.equals(this.realm, keyDetails.realm) &&
            Objects.equals(this.keyDescription, keyDetails.keyDescription) &&
            Objects.equals(this.creationDate, keyDetails.creationDate) &&
            Objects.equals(this.scheduledDeletionDate, keyDetails.scheduledDeletionDate) &&
            Objects.equals(this.keyState, keyDetails.keyState) &&
            Objects.equals(this.defaultKeyFlag, keyDetails.defaultKeyFlag) &&
            Objects.equals(this.keyType, keyDetails.keyType) &&
            Objects.equals(this.expirationTime, keyDetails.expirationTime) &&
            Objects.equals(this.origin, keyDetails.origin) &&
            Objects.equals(this.keyRotationEnabled, keyDetails.keyRotationEnabled) &&
            Objects.equals(this.sysEnterpriseProjectId, keyDetails.sysEnterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, domainId, keyAlias, realm, keyDescription, creationDate, scheduledDeletionDate, keyState, defaultKeyFlag, keyType, expirationTime, origin, keyRotationEnabled, sysEnterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyDetails {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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

