package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AD域配置信息
 */
public class UpdateActiveDirectoryDomainRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_account")

    private String serviceAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_name")

    private String systemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite_same_account")

    private Boolean overwriteSameAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_server")

    private List<String> dnsServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit")

    private String organizationUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public UpdateActiveDirectoryDomainRequestBody withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * 服务账号，在创建域服务器时指定，一般默认为administrator
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public UpdateActiveDirectoryDomainRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 账号对应密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateActiveDirectoryDomainRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域控服务器的域名，在创建域服务器时指定
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateActiveDirectoryDomainRequestBody withSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }

    /**
     * 存储系统在AD域中的名称
     * @return systemName
     */
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public UpdateActiveDirectoryDomainRequestBody withOverwriteSameAccount(Boolean overwriteSameAccount) {
        this.overwriteSameAccount = overwriteSameAccount;
        return this;
    }

    /**
     * 如果域控制器中已存在同系统名称的存储系统，开启该选项后，将覆盖原有的存储系统信息。
     * @return overwriteSameAccount
     */
    public Boolean getOverwriteSameAccount() {
        return overwriteSameAccount;
    }

    public void setOverwriteSameAccount(Boolean overwriteSameAccount) {
        this.overwriteSameAccount = overwriteSameAccount;
    }

    public UpdateActiveDirectoryDomainRequestBody withDnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    public UpdateActiveDirectoryDomainRequestBody addDnsServerItem(String dnsServerItem) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        this.dnsServer.add(dnsServerItem);
        return this;
    }

    public UpdateActiveDirectoryDomainRequestBody withDnsServer(Consumer<List<String>> dnsServerSetter) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        dnsServerSetter.accept(this.dnsServer);
        return this;
    }

    /**
     * DNS服务器IP地址，用于解析AD域的域名
     * @return dnsServer
     */
    public List<String> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
    }

    public UpdateActiveDirectoryDomainRequestBody withOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }

    /**
     * 域中包含的一类目录对象如用户、计算机、打印机等资源的总称，加入后将作为其中的一员。若不填，则默认加入到computers组织单元。
     * @return organizationUnit
     */
    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public UpdateActiveDirectoryDomainRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc的id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateActiveDirectoryDomainRequestBody that = (UpdateActiveDirectoryDomainRequestBody) obj;
        return Objects.equals(this.serviceAccount, that.serviceAccount) && Objects.equals(this.password, that.password)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.systemName, that.systemName)
            && Objects.equals(this.overwriteSameAccount, that.overwriteSameAccount)
            && Objects.equals(this.dnsServer, that.dnsServer)
            && Objects.equals(this.organizationUnit, that.organizationUnit) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceAccount,
            password,
            domainName,
            systemName,
            overwriteSameAccount,
            dnsServer,
            organizationUnit,
            vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateActiveDirectoryDomainRequestBody {\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
        sb.append("    overwriteSameAccount: ").append(toIndentedString(overwriteSameAccount)).append("\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
        sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
