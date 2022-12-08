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
public class AdDomain {

    /**
     * 域类型。 - LITE_AS：本地认证。 - LOCAL_AD：本地AD。 说明：域类型为“LOCAL_AD”时，请确保所选VPC网络与AD所属网络可连通。
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
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainTypeEnum(value);
            }
            return result;
        }

        public static DomainTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "domain_password")

    private String domainPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_domain_ip")

    private String activeDomainIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_domain_name")

    private String activeDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_domain_ip")

    private String standbyDomainIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_domain_name")

    private String standbyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_dns_ip")

    private String activeDnsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_dns_ip")

    private String standbyDnsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_computer_object")

    private Integer deleteComputerObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ldaps")

    private Boolean useLdaps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_config")

    private TlsConfig tlsConfig;

    public AdDomain withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域类型。 - LITE_AS：本地认证。 - LOCAL_AD：本地AD。 说明：域类型为“LOCAL_AD”时，请确保所选VPC网络与AD所属网络可连通。
     * @return domainType
     */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public AdDomain withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名称。域类型为LOCAL_AD时需要配置。 域名必须为AD服务器上已经存在的域名，且长度不超过55。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AdDomain withDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
        return this;
    }

    /**
     * 域管理员帐号。域类型为LOCAL_AD时需要配置。 必须为AD服务器上已经存在的域管理员帐号。
     * @return domainAdminAccount
     */
    public String getDomainAdminAccount() {
        return domainAdminAccount;
    }

    public void setDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
    }

    public AdDomain withDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }

    /**
     * 域管理员账号密码。域类型为LOCAL_AD时需要配置。
     * @return domainPassword
     */
    public String getDomainPassword() {
        return domainPassword;
    }

    public void setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
    }

    public AdDomain withActiveDomainIp(String activeDomainIp) {
        this.activeDomainIp = activeDomainIp;
        return this;
    }

    /**
     * 主域控制器IP地址。域类型为LOCAL_AD时需要配置。
     * @return activeDomainIp
     */
    public String getActiveDomainIp() {
        return activeDomainIp;
    }

    public void setActiveDomainIp(String activeDomainIp) {
        this.activeDomainIp = activeDomainIp;
    }

    public AdDomain withActiveDomainName(String activeDomainName) {
        this.activeDomainName = activeDomainName;
        return this;
    }

    /**
     * 主域控制器名称。域类型为LOCAL_AD时需要配置。
     * @return activeDomainName
     */
    public String getActiveDomainName() {
        return activeDomainName;
    }

    public void setActiveDomainName(String activeDomainName) {
        this.activeDomainName = activeDomainName;
    }

    public AdDomain withStandbyDomainIp(String standbyDomainIp) {
        this.standbyDomainIp = standbyDomainIp;
        return this;
    }

    /**
     * 备域控制器IP地址。域类型为LOCAL_AD时且配置备节点时需要配置。
     * @return standbyDomainIp
     */
    public String getStandbyDomainIp() {
        return standbyDomainIp;
    }

    public void setStandbyDomainIp(String standbyDomainIp) {
        this.standbyDomainIp = standbyDomainIp;
    }

    public AdDomain withStandbyDomainName(String standbyDomainName) {
        this.standbyDomainName = standbyDomainName;
        return this;
    }

    /**
     * 备域控制器名称。域类型为LOCAL_AD时且配置备节点时需要配置。
     * @return standbyDomainName
     */
    public String getStandbyDomainName() {
        return standbyDomainName;
    }

    public void setStandbyDomainName(String standbyDomainName) {
        this.standbyDomainName = standbyDomainName;
    }

    public AdDomain withActiveDnsIp(String activeDnsIp) {
        this.activeDnsIp = activeDnsIp;
        return this;
    }

    /**
     * 主DNS IP地址。域类型为LOCAL_AD时需要配置。
     * @return activeDnsIp
     */
    public String getActiveDnsIp() {
        return activeDnsIp;
    }

    public void setActiveDnsIp(String activeDnsIp) {
        this.activeDnsIp = activeDnsIp;
    }

    public AdDomain withStandbyDnsIp(String standbyDnsIp) {
        this.standbyDnsIp = standbyDnsIp;
        return this;
    }

    /**
     * 备DNS IP地址。域类型为LOCAL_AD时且配置备节点时需要配置。
     * @return standbyDnsIp
     */
    public String getStandbyDnsIp() {
        return standbyDnsIp;
    }

    public void setStandbyDnsIp(String standbyDnsIp) {
        this.standbyDnsIp = standbyDnsIp;
    }

    public AdDomain withDeleteComputerObject(Integer deleteComputerObject) {
        this.deleteComputerObject = deleteComputerObject;
        return this;
    }

    /**
     * 是否在删除桌面的同时删除AD上对应的计算机对象，0代表不删除，1代表删除。
     * minimum: 0
     * maximum: 1
     * @return deleteComputerObject
     */
    public Integer getDeleteComputerObject() {
        return deleteComputerObject;
    }

    public void setDeleteComputerObject(Integer deleteComputerObject) {
        this.deleteComputerObject = deleteComputerObject;
    }

    public AdDomain withUseLdaps(Boolean useLdaps) {
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

    public AdDomain withTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }

    public AdDomain withTlsConfig(Consumer<TlsConfig> tlsConfigSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdDomain adDomain = (AdDomain) o;
        return Objects.equals(this.domainType, adDomain.domainType)
            && Objects.equals(this.domainName, adDomain.domainName)
            && Objects.equals(this.domainAdminAccount, adDomain.domainAdminAccount)
            && Objects.equals(this.domainPassword, adDomain.domainPassword)
            && Objects.equals(this.activeDomainIp, adDomain.activeDomainIp)
            && Objects.equals(this.activeDomainName, adDomain.activeDomainName)
            && Objects.equals(this.standbyDomainIp, adDomain.standbyDomainIp)
            && Objects.equals(this.standbyDomainName, adDomain.standbyDomainName)
            && Objects.equals(this.activeDnsIp, adDomain.activeDnsIp)
            && Objects.equals(this.standbyDnsIp, adDomain.standbyDnsIp)
            && Objects.equals(this.deleteComputerObject, adDomain.deleteComputerObject)
            && Objects.equals(this.useLdaps, adDomain.useLdaps) && Objects.equals(this.tlsConfig, adDomain.tlsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainType,
            domainName,
            domainAdminAccount,
            domainPassword,
            activeDomainIp,
            activeDomainName,
            standbyDomainIp,
            standbyDomainName,
            activeDnsIp,
            standbyDnsIp,
            deleteComputerObject,
            useLdaps,
            tlsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdDomain {\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainAdminAccount: ").append(toIndentedString(domainAdminAccount)).append("\n");
        sb.append("    domainPassword: ").append(toIndentedString(domainPassword)).append("\n");
        sb.append("    activeDomainIp: ").append(toIndentedString(activeDomainIp)).append("\n");
        sb.append("    activeDomainName: ").append(toIndentedString(activeDomainName)).append("\n");
        sb.append("    standbyDomainIp: ").append(toIndentedString(standbyDomainIp)).append("\n");
        sb.append("    standbyDomainName: ").append(toIndentedString(standbyDomainName)).append("\n");
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
