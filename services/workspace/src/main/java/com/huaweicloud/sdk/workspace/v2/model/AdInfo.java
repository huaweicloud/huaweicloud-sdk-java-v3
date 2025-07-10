package com.huaweicloud.sdk.workspace.v2.model;

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
 * 域信息。
 */
public class AdInfo {

    /**
     * 域类型。 - LITE_AS：本地认证。 - LOCAL_AD：本地AD。
     */
    public static final class DomainTypeEnum {

        /**
         * Enum LITE_AS for value: "LITE_AS"
         */
        public static final DomainTypeEnum LITE_AS = new DomainTypeEnum("LITE_AS");

        /**
         * Enum LOCAL_AD for value: "LOCAL_AD"
         */
        public static final DomainTypeEnum LOCAL_AD = new DomainTypeEnum("LOCAL_AD");

        private static final Map<String, DomainTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainTypeEnum> createStaticFields() {
            Map<String, DomainTypeEnum> map = new HashMap<>();
            map.put("LITE_AS", LITE_AS);
            map.put("LOCAL_AD", LOCAL_AD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainTypeEnum(String value) {
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
        public static DomainTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainTypeEnum(value));
        }

        public static DomainTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainTypeEnum) {
                return this.value.equals(((DomainTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private DomainTypeEnum domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_admin_account")

    private String domainAdminAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_domain_name")

    private String activeDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_domain_ip")

    private String activeDomainIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_domain_name")

    private String standbyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_domain_ip")

    private String standbyDomainIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_dns_ip")

    private String activeDnsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_dns_ip")

    private String standbyDnsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_computer_object")

    private String deleteComputerObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ldaps")

    private Boolean useLdaps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_config")

    private TlsConfig tlsConfig;

    public AdInfo withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域类型。 - LITE_AS：本地认证。 - LOCAL_AD：本地AD。
     * @return domainType
     */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public AdInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名，域类型为LOCAL_AD时有值。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AdInfo withDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
        return this;
    }

    /**
     * 域管理员账号，域类型为LOCAL_AD时有值。
     * @return domainAdminAccount
     */
    public String getDomainAdminAccount() {
        return domainAdminAccount;
    }

    public void setDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
    }

    public AdInfo withActiveDomainName(String activeDomainName) {
        this.activeDomainName = activeDomainName;
        return this;
    }

    /**
     * 主域控制器名称，域类型为LOCAL_AD时有值。
     * @return activeDomainName
     */
    public String getActiveDomainName() {
        return activeDomainName;
    }

    public void setActiveDomainName(String activeDomainName) {
        this.activeDomainName = activeDomainName;
    }

    public AdInfo withActiveDomainIp(String activeDomainIp) {
        this.activeDomainIp = activeDomainIp;
        return this;
    }

    /**
     * 主域控制器IP地址，域类型为LOCAL_AD时有值。
     * @return activeDomainIp
     */
    public String getActiveDomainIp() {
        return activeDomainIp;
    }

    public void setActiveDomainIp(String activeDomainIp) {
        this.activeDomainIp = activeDomainIp;
    }

    public AdInfo withStandbyDomainName(String standbyDomainName) {
        this.standbyDomainName = standbyDomainName;
        return this;
    }

    /**
     * 备域控制器名称，域类型为LOCAL_AD时有值。
     * @return standbyDomainName
     */
    public String getStandbyDomainName() {
        return standbyDomainName;
    }

    public void setStandbyDomainName(String standbyDomainName) {
        this.standbyDomainName = standbyDomainName;
    }

    public AdInfo withStandbyDomainIp(String standbyDomainIp) {
        this.standbyDomainIp = standbyDomainIp;
        return this;
    }

    /**
     * 备域控制器IP地址，域类型为LOCAL_AD时有值。
     * @return standbyDomainIp
     */
    public String getStandbyDomainIp() {
        return standbyDomainIp;
    }

    public void setStandbyDomainIp(String standbyDomainIp) {
        this.standbyDomainIp = standbyDomainIp;
    }

    public AdInfo withActiveDnsIp(String activeDnsIp) {
        this.activeDnsIp = activeDnsIp;
        return this;
    }

    /**
     * 主DNS IP地址，域类型为LOCAL_AD时有值。
     * @return activeDnsIp
     */
    public String getActiveDnsIp() {
        return activeDnsIp;
    }

    public void setActiveDnsIp(String activeDnsIp) {
        this.activeDnsIp = activeDnsIp;
    }

    public AdInfo withStandbyDnsIp(String standbyDnsIp) {
        this.standbyDnsIp = standbyDnsIp;
        return this;
    }

    /**
     * 备DNS IP地址，域类型为LOCAL_AD时有值。
     * @return standbyDnsIp
     */
    public String getStandbyDnsIp() {
        return standbyDnsIp;
    }

    public void setStandbyDnsIp(String standbyDnsIp) {
        this.standbyDnsIp = standbyDnsIp;
    }

    public AdInfo withDeleteComputerObject(String deleteComputerObject) {
        this.deleteComputerObject = deleteComputerObject;
        return this;
    }

    /**
     * 是否在删除桌面的同时删除AD上对应的计算机对象，'0'代表不删除，'1'代表删除。
     * @return deleteComputerObject
     */
    public String getDeleteComputerObject() {
        return deleteComputerObject;
    }

    public void setDeleteComputerObject(String deleteComputerObject) {
        this.deleteComputerObject = deleteComputerObject;
    }

    public AdInfo withUseLdaps(Boolean useLdaps) {
        this.useLdaps = useLdaps;
        return this;
    }

    /**
     * 是否开启LDAPS。
     * @return useLdaps
     */
    public Boolean getUseLdaps() {
        return useLdaps;
    }

    public void setUseLdaps(Boolean useLdaps) {
        this.useLdaps = useLdaps;
    }

    public AdInfo withTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }

    public AdInfo withTlsConfig(Consumer<TlsConfig> tlsConfigSetter) {
        if (this.tlsConfig == null) {
            this.tlsConfig = new TlsConfig();
            tlsConfigSetter.accept(this.tlsConfig);
        }

        return this;
    }

    /**
     * Get tlsConfig
     * @return tlsConfig
     */
    public TlsConfig getTlsConfig() {
        return tlsConfig;
    }

    public void setTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInfo that = (AdInfo) obj;
        return Objects.equals(this.domainType, that.domainType) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.domainAdminAccount, that.domainAdminAccount)
            && Objects.equals(this.activeDomainName, that.activeDomainName)
            && Objects.equals(this.activeDomainIp, that.activeDomainIp)
            && Objects.equals(this.standbyDomainName, that.standbyDomainName)
            && Objects.equals(this.standbyDomainIp, that.standbyDomainIp)
            && Objects.equals(this.activeDnsIp, that.activeDnsIp)
            && Objects.equals(this.standbyDnsIp, that.standbyDnsIp)
            && Objects.equals(this.deleteComputerObject, that.deleteComputerObject)
            && Objects.equals(this.useLdaps, that.useLdaps) && Objects.equals(this.tlsConfig, that.tlsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainType,
            domainName,
            domainAdminAccount,
            activeDomainName,
            activeDomainIp,
            standbyDomainName,
            standbyDomainIp,
            activeDnsIp,
            standbyDnsIp,
            deleteComputerObject,
            useLdaps,
            tlsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdInfo {\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainAdminAccount: ").append(toIndentedString(domainAdminAccount)).append("\n");
        sb.append("    activeDomainName: ").append(toIndentedString(activeDomainName)).append("\n");
        sb.append("    activeDomainIp: ").append(toIndentedString(activeDomainIp)).append("\n");
        sb.append("    standbyDomainName: ").append(toIndentedString(standbyDomainName)).append("\n");
        sb.append("    standbyDomainIp: ").append(toIndentedString(standbyDomainIp)).append("\n");
        sb.append("    activeDnsIp: ").append(toIndentedString(activeDnsIp)).append("\n");
        sb.append("    standbyDnsIp: ").append(toIndentedString(standbyDnsIp)).append("\n");
        sb.append("    deleteComputerObject: ").append(toIndentedString(deleteComputerObject)).append("\n");
        sb.append("    useLdaps: ").append(toIndentedString(useLdaps)).append("\n");
        sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
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
