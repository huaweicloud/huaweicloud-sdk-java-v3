package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建专属密钥库请求体
 */
public class CreateKeyStoreRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_alias")

    private String keystoreAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_cluster_id")

    private String hsmClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_ca_cert")

    private String hsmCaCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * 专属密钥库集群类型。DHSM表示专属加密服务集群，CDMS表示密码卡集群,DEFAULT表示KMS原有集群
     */
    public static final class KeystoreTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final KeystoreTypeEnum DEFAULT = new KeystoreTypeEnum("DEFAULT");

        /**
         * Enum DHSM for value: "DHSM"
         */
        public static final KeystoreTypeEnum DHSM = new KeystoreTypeEnum("DHSM");

        /**
         * Enum CDMS for value: "CDMS"
         */
        public static final KeystoreTypeEnum CDMS = new KeystoreTypeEnum("CDMS");

        private static final Map<String, KeystoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeystoreTypeEnum> createStaticFields() {
            Map<String, KeystoreTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("DHSM", DHSM);
            map.put("CDMS", CDMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeystoreTypeEnum(String value) {
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
        public static KeystoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeystoreTypeEnum(value));
        }

        public static KeystoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeystoreTypeEnum) {
                return this.value.equals(((KeystoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_type")

    private KeystoreTypeEnum keystoreType;

    public CreateKeyStoreRequestBody withKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
        return this;
    }

    /**
     * 专属密钥库别名，取值范围为1到255个字符，满足正则匹配“^[a-zA-Z0-9:/_-]{1,255}$”，且不与已有的专属密钥库别名重名。
     * @return keystoreAlias
     */
    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }

    public CreateKeyStoreRequestBody withHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
        return this;
    }

    /**
     * DHSM集群Id，要求集群当前未创建专属密钥库。
     * @return hsmClusterId
     */
    public String getHsmClusterId() {
        return hsmClusterId;
    }

    public void setHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
    }

    public CreateKeyStoreRequestBody withHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
        return this;
    }

    /**
     * DHSM集群的CA证书
     * @return hsmCaCert
     */
    public String getHsmCaCert() {
        return hsmCaCert;
    }

    public void setHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
    }

    public CreateKeyStoreRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。当类型为DHSM时，cluster_id为hsm_cluster_id。当类型为CDMS时，为cdms_cluster_id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateKeyStoreRequestBody withKeystoreType(KeystoreTypeEnum keystoreType) {
        this.keystoreType = keystoreType;
        return this;
    }

    /**
     * 专属密钥库集群类型。DHSM表示专属加密服务集群，CDMS表示密码卡集群,DEFAULT表示KMS原有集群
     * @return keystoreType
     */
    public KeystoreTypeEnum getKeystoreType() {
        return keystoreType;
    }

    public void setKeystoreType(KeystoreTypeEnum keystoreType) {
        this.keystoreType = keystoreType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKeyStoreRequestBody that = (CreateKeyStoreRequestBody) obj;
        return Objects.equals(this.keystoreAlias, that.keystoreAlias)
            && Objects.equals(this.hsmClusterId, that.hsmClusterId) && Objects.equals(this.hsmCaCert, that.hsmCaCert)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.keystoreType, that.keystoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreAlias, hsmClusterId, hsmCaCert, clusterId, keystoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeyStoreRequestBody {\n");
        sb.append("    keystoreAlias: ").append(toIndentedString(keystoreAlias)).append("\n");
        sb.append("    hsmClusterId: ").append(toIndentedString(hsmClusterId)).append("\n");
        sb.append("    hsmCaCert: ").append(toIndentedString(hsmCaCert)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    keystoreType: ").append(toIndentedString(keystoreType)).append("\n");
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
