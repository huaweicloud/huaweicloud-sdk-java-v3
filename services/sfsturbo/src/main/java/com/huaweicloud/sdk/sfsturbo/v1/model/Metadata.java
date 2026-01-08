package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * metadata参数详情
 */
public class Metadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_key_id")

    private String cryptKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_flavor")

    private String dedicatedFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_type")

    private String expandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpc_bw")

    private String hpcBw;

    /**
     * 是否自动创建安全组规则。\"true\"表示自动创建安全组规则，\"false\"表示不自动创建安全组规则。默认值是\"true\"。
     */
    public static final class AutoCreateSecurityGroupRulesEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final AutoCreateSecurityGroupRulesEnum TRUE = new AutoCreateSecurityGroupRulesEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final AutoCreateSecurityGroupRulesEnum FALSE = new AutoCreateSecurityGroupRulesEnum("false");

        private static final Map<String, AutoCreateSecurityGroupRulesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoCreateSecurityGroupRulesEnum> createStaticFields() {
            Map<String, AutoCreateSecurityGroupRulesEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoCreateSecurityGroupRulesEnum(String value) {
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
        public static AutoCreateSecurityGroupRulesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AutoCreateSecurityGroupRulesEnum(value));
        }

        public static AutoCreateSecurityGroupRulesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoCreateSecurityGroupRulesEnum) {
                return this.value.equals(((AutoCreateSecurityGroupRulesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_create_security_group_rules")

    private AutoCreateSecurityGroupRulesEnum autoCreateSecurityGroupRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public Metadata withCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
        return this;
    }

    /**
     * 要创加密文件系统，该字段传KMS服务专业版密钥的ID。
     * @return cryptKeyId
     */
    public String getCryptKeyId() {
        return cryptKeyId;
    }

    public void setCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
    }

    public Metadata withDedicatedFlavor(String dedicatedFlavor) {
        this.dedicatedFlavor = dedicatedFlavor;
        return this;
    }

    /**
     * 创专属文件系统，要创建的虚拟机的规格。
     * @return dedicatedFlavor
     */
    public String getDedicatedFlavor() {
        return dedicatedFlavor;
    }

    public void setDedicatedFlavor(String dedicatedFlavor) {
        this.dedicatedFlavor = dedicatedFlavor;
    }

    public Metadata withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /**
     * 创专属文件系统，要指定一个专属分布式存储的ID。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public Metadata withExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }

    /**
     * 扩展类型；当文件系统正在创建时，该字段不返回。  - 创建增强型、20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB、HPC缓存型文件系统时，该参数必填。  - 创建增强型的文件系统，包括标准型-增强版和性能型-增强版，需要填写\"bandwidth\"。  - 创建20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB文件系统，需要填写\"hpc\"。  - 创建HPC缓存型，需要填写\"hpc_cache\"。 
     * @return expandType
     */
    public String getExpandType() {
        return expandType;
    }

    public void setExpandType(String expandType) {
        this.expandType = expandType;
    }

    public Metadata withHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
        return this;
    }

    /**
     * 文件系统的带宽规格。  创建20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB、HPC缓存型文件系统时，该参数必填。  20MB/s/TiB，填写\"20M\"。 40MB/s/TiB，填写\"40M\"。 125MB/s/TiB，填写\"125M\"。 250MB/s/TiB，填写\"250M\"。 500MB/s/TiB，填写\"500M\"。 1000MB/s/TiB，填写\"1000M\"。 HPC缓存型，填写\"2G\"、\"4G\"、\"8G\"、\"16G\"、\"24G\"、\"32G\"或\"48G\"。 
     * @return hpcBw
     */
    public String getHpcBw() {
        return hpcBw;
    }

    public void setHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
    }

    public Metadata withAutoCreateSecurityGroupRules(AutoCreateSecurityGroupRulesEnum autoCreateSecurityGroupRules) {
        this.autoCreateSecurityGroupRules = autoCreateSecurityGroupRules;
        return this;
    }

    /**
     * 是否自动创建安全组规则。\"true\"表示自动创建安全组规则，\"false\"表示不自动创建安全组规则。默认值是\"true\"。
     * @return autoCreateSecurityGroupRules
     */
    public AutoCreateSecurityGroupRulesEnum getAutoCreateSecurityGroupRules() {
        return autoCreateSecurityGroupRules;
    }

    public void setAutoCreateSecurityGroupRules(AutoCreateSecurityGroupRulesEnum autoCreateSecurityGroupRules) {
        this.autoCreateSecurityGroupRules = autoCreateSecurityGroupRules;
    }

    public Metadata withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID。
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata that = (Metadata) obj;
        return Objects.equals(this.cryptKeyId, that.cryptKeyId)
            && Objects.equals(this.dedicatedFlavor, that.dedicatedFlavor)
            && Objects.equals(this.dedicatedStorageId, that.dedicatedStorageId)
            && Objects.equals(this.expandType, that.expandType) && Objects.equals(this.hpcBw, that.hpcBw)
            && Objects.equals(this.autoCreateSecurityGroupRules, that.autoCreateSecurityGroupRules)
            && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cryptKeyId,
            dedicatedFlavor,
            dedicatedStorageId,
            expandType,
            hpcBw,
            autoCreateSecurityGroupRules,
            vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    cryptKeyId: ").append(toIndentedString(cryptKeyId)).append("\n");
        sb.append("    dedicatedFlavor: ").append(toIndentedString(dedicatedFlavor)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    expandType: ").append(toIndentedString(expandType)).append("\n");
        sb.append("    hpcBw: ").append(toIndentedString(hpcBw)).append("\n");
        sb.append("    autoCreateSecurityGroupRules: ")
            .append(toIndentedString(autoCreateSecurityGroupRules))
            .append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
