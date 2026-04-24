package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BaseThirdDomainController
 */
public class BaseThirdDomainController {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_password")

    private String userPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_dc_address")

    private String mainDcAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_interface_address")

    private String openInterfaceAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_interface_domain_name")

    private String openInterfaceDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_service_address")

    private String internalServiceAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_cert")

    private String appCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_cert_key")

    private String appCertKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi_ca_cert")

    private String openapiCaCert;

    public BaseThirdDomainController withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 域管理员。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BaseThirdDomainController withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * 域管理员密码。
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public BaseThirdDomainController withMainDcAddress(String mainDcAddress) {
        this.mainDcAddress = mainDcAddress;
        return this;
    }

    /**
     * 域管平台地址。
     * @return mainDcAddress
     */
    public String getMainDcAddress() {
        return mainDcAddress;
    }

    public void setMainDcAddress(String mainDcAddress) {
        this.mainDcAddress = mainDcAddress;
    }

    public BaseThirdDomainController withOpenInterfaceAddress(String openInterfaceAddress) {
        this.openInterfaceAddress = openInterfaceAddress;
        return this;
    }

    /**
     * 域管开放接口地址。
     * @return openInterfaceAddress
     */
    public String getOpenInterfaceAddress() {
        return openInterfaceAddress;
    }

    public void setOpenInterfaceAddress(String openInterfaceAddress) {
        this.openInterfaceAddress = openInterfaceAddress;
    }

    public BaseThirdDomainController withOpenInterfaceDomainName(String openInterfaceDomainName) {
        this.openInterfaceDomainName = openInterfaceDomainName;
        return this;
    }

    /**
     * 域管开放接口域名。
     * @return openInterfaceDomainName
     */
    public String getOpenInterfaceDomainName() {
        return openInterfaceDomainName;
    }

    public void setOpenInterfaceDomainName(String openInterfaceDomainName) {
        this.openInterfaceDomainName = openInterfaceDomainName;
    }

    public BaseThirdDomainController withInternalServiceAddress(String internalServiceAddress) {
        this.internalServiceAddress = internalServiceAddress;
        return this;
    }

    /**
     * 域管内部服务地址。
     * @return internalServiceAddress
     */
    public String getInternalServiceAddress() {
        return internalServiceAddress;
    }

    public void setInternalServiceAddress(String internalServiceAddress) {
        this.internalServiceAddress = internalServiceAddress;
    }

    public BaseThirdDomainController withAppCert(String appCert) {
        this.appCert = appCert;
        return this;
    }

    /**
     * 客户端证书公钥。
     * @return appCert
     */
    public String getAppCert() {
        return appCert;
    }

    public void setAppCert(String appCert) {
        this.appCert = appCert;
    }

    public BaseThirdDomainController withAppCertKey(String appCertKey) {
        this.appCertKey = appCertKey;
        return this;
    }

    /**
     * 客户端证书私钥。
     * @return appCertKey
     */
    public String getAppCertKey() {
        return appCertKey;
    }

    public void setAppCertKey(String appCertKey) {
        this.appCertKey = appCertKey;
    }

    public BaseThirdDomainController withOpenapiCaCert(String openapiCaCert) {
        this.openapiCaCert = openapiCaCert;
        return this;
    }

    /**
     * 服务端CA。
     * @return openapiCaCert
     */
    public String getOpenapiCaCert() {
        return openapiCaCert;
    }

    public void setOpenapiCaCert(String openapiCaCert) {
        this.openapiCaCert = openapiCaCert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseThirdDomainController that = (BaseThirdDomainController) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.userPassword, that.userPassword)
            && Objects.equals(this.mainDcAddress, that.mainDcAddress)
            && Objects.equals(this.openInterfaceAddress, that.openInterfaceAddress)
            && Objects.equals(this.openInterfaceDomainName, that.openInterfaceDomainName)
            && Objects.equals(this.internalServiceAddress, that.internalServiceAddress)
            && Objects.equals(this.appCert, that.appCert) && Objects.equals(this.appCertKey, that.appCertKey)
            && Objects.equals(this.openapiCaCert, that.openapiCaCert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username,
            userPassword,
            mainDcAddress,
            openInterfaceAddress,
            openInterfaceDomainName,
            internalServiceAddress,
            appCert,
            appCertKey,
            openapiCaCert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseThirdDomainController {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
        sb.append("    mainDcAddress: ").append(toIndentedString(mainDcAddress)).append("\n");
        sb.append("    openInterfaceAddress: ").append(toIndentedString(openInterfaceAddress)).append("\n");
        sb.append("    openInterfaceDomainName: ").append(toIndentedString(openInterfaceDomainName)).append("\n");
        sb.append("    internalServiceAddress: ").append(toIndentedString(internalServiceAddress)).append("\n");
        sb.append("    appCert: ").append(toIndentedString(appCert)).append("\n");
        sb.append("    appCertKey: ").append(toIndentedString(appCertKey)).append("\n");
        sb.append("    openapiCaCert: ").append(toIndentedString(openapiCaCert)).append("\n");
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
