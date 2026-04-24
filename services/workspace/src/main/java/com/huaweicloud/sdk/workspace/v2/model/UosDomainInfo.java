package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询域控的配置信息响应。
 */
public class UosDomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config_id")

    private String authConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private DomainType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

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
    @JsonProperty(value = "app_cert_id")

    private String appCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_cert_start_time")

    private String appCertStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_cert_end_time")

    private String appCertEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi_ca_cert_id")

    private String openapiCaCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi_ca_cert_start_time")

    private String openapiCaCertStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi_ca_cert_end_time")

    private String openapiCaCertEndTime;

    public UosDomainInfo withAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * 认证配置id。
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    public UosDomainInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域控id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UosDomainInfo withType(DomainType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public DomainType getType() {
        return type;
    }

    public void setType(DomainType type) {
        this.type = type;
    }

    public UosDomainInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 统信域控名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UosDomainInfo withUsername(String username) {
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

    public UosDomainInfo withMainDcAddress(String mainDcAddress) {
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

    public UosDomainInfo withOpenInterfaceAddress(String openInterfaceAddress) {
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

    public UosDomainInfo withOpenInterfaceDomainName(String openInterfaceDomainName) {
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

    public UosDomainInfo withInternalServiceAddress(String internalServiceAddress) {
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

    public UosDomainInfo withAppCertId(String appCertId) {
        this.appCertId = appCertId;
        return this;
    }

    /**
     * 客户端证书公钥id。
     * @return appCertId
     */
    public String getAppCertId() {
        return appCertId;
    }

    public void setAppCertId(String appCertId) {
        this.appCertId = appCertId;
    }

    public UosDomainInfo withAppCertStartTime(String appCertStartTime) {
        this.appCertStartTime = appCertStartTime;
        return this;
    }

    /**
     * 客户端证书公钥有效期起始时间。
     * @return appCertStartTime
     */
    public String getAppCertStartTime() {
        return appCertStartTime;
    }

    public void setAppCertStartTime(String appCertStartTime) {
        this.appCertStartTime = appCertStartTime;
    }

    public UosDomainInfo withAppCertEndTime(String appCertEndTime) {
        this.appCertEndTime = appCertEndTime;
        return this;
    }

    /**
     * 客户端证书公钥有效期结束时间。
     * @return appCertEndTime
     */
    public String getAppCertEndTime() {
        return appCertEndTime;
    }

    public void setAppCertEndTime(String appCertEndTime) {
        this.appCertEndTime = appCertEndTime;
    }

    public UosDomainInfo withOpenapiCaCertId(String openapiCaCertId) {
        this.openapiCaCertId = openapiCaCertId;
        return this;
    }

    /**
     * 服务端CA id。
     * @return openapiCaCertId
     */
    public String getOpenapiCaCertId() {
        return openapiCaCertId;
    }

    public void setOpenapiCaCertId(String openapiCaCertId) {
        this.openapiCaCertId = openapiCaCertId;
    }

    public UosDomainInfo withOpenapiCaCertStartTime(String openapiCaCertStartTime) {
        this.openapiCaCertStartTime = openapiCaCertStartTime;
        return this;
    }

    /**
     * 服务端CA有效期起始时间。
     * @return openapiCaCertStartTime
     */
    public String getOpenapiCaCertStartTime() {
        return openapiCaCertStartTime;
    }

    public void setOpenapiCaCertStartTime(String openapiCaCertStartTime) {
        this.openapiCaCertStartTime = openapiCaCertStartTime;
    }

    public UosDomainInfo withOpenapiCaCertEndTime(String openapiCaCertEndTime) {
        this.openapiCaCertEndTime = openapiCaCertEndTime;
        return this;
    }

    /**
     * 服务端CA有效期结束时间。
     * @return openapiCaCertEndTime
     */
    public String getOpenapiCaCertEndTime() {
        return openapiCaCertEndTime;
    }

    public void setOpenapiCaCertEndTime(String openapiCaCertEndTime) {
        this.openapiCaCertEndTime = openapiCaCertEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UosDomainInfo that = (UosDomainInfo) obj;
        return Objects.equals(this.authConfigId, that.authConfigId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.username, that.username) && Objects.equals(this.mainDcAddress, that.mainDcAddress)
            && Objects.equals(this.openInterfaceAddress, that.openInterfaceAddress)
            && Objects.equals(this.openInterfaceDomainName, that.openInterfaceDomainName)
            && Objects.equals(this.internalServiceAddress, that.internalServiceAddress)
            && Objects.equals(this.appCertId, that.appCertId)
            && Objects.equals(this.appCertStartTime, that.appCertStartTime)
            && Objects.equals(this.appCertEndTime, that.appCertEndTime)
            && Objects.equals(this.openapiCaCertId, that.openapiCaCertId)
            && Objects.equals(this.openapiCaCertStartTime, that.openapiCaCertStartTime)
            && Objects.equals(this.openapiCaCertEndTime, that.openapiCaCertEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfigId,
            id,
            type,
            domainName,
            username,
            mainDcAddress,
            openInterfaceAddress,
            openInterfaceDomainName,
            internalServiceAddress,
            appCertId,
            appCertStartTime,
            appCertEndTime,
            openapiCaCertId,
            openapiCaCertStartTime,
            openapiCaCertEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UosDomainInfo {\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    mainDcAddress: ").append(toIndentedString(mainDcAddress)).append("\n");
        sb.append("    openInterfaceAddress: ").append(toIndentedString(openInterfaceAddress)).append("\n");
        sb.append("    openInterfaceDomainName: ").append(toIndentedString(openInterfaceDomainName)).append("\n");
        sb.append("    internalServiceAddress: ").append(toIndentedString(internalServiceAddress)).append("\n");
        sb.append("    appCertId: ").append(toIndentedString(appCertId)).append("\n");
        sb.append("    appCertStartTime: ").append(toIndentedString(appCertStartTime)).append("\n");
        sb.append("    appCertEndTime: ").append(toIndentedString(appCertEndTime)).append("\n");
        sb.append("    openapiCaCertId: ").append(toIndentedString(openapiCaCertId)).append("\n");
        sb.append("    openapiCaCertStartTime: ").append(toIndentedString(openapiCaCertStartTime)).append("\n");
        sb.append("    openapiCaCertEndTime: ").append(toIndentedString(openapiCaCertEndTime)).append("\n");
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
