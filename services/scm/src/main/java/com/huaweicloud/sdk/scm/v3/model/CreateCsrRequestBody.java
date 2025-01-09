package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateCsrRequestBody
 */
public class CreateCsrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sans")

    private String sans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_algo")

    private String privateKeyAlgo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private String usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_country")

    private String companyCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_province")

    private String companyProvince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_city")

    private String companyCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    public CreateCsrRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义CSR名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCsrRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * CSR绑定的域名。如果您想在提交证书申请时使用该CSR，必须确保证书绑定域名包含此处设置的域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateCsrRequestBody withSans(String sans) {
        this.sans = sans;
        return this;
    }

    /**
     * CSR绑定的附加域名。
     * @return sans
     */
    public String getSans() {
        return sans;
    }

    public void setSans(String sans) {
        this.sans = sans;
    }

    public CreateCsrRequestBody withPrivateKeyAlgo(String privateKeyAlgo) {
        this.privateKeyAlgo = privateKeyAlgo;
        return this;
    }

    /**
     * 私钥算法。取值如下： - RSA_2048 - RSA_3072 - RSA_4096 - EC_P256 - EC_P384 - SM2
     * @return privateKeyAlgo
     */
    public String getPrivateKeyAlgo() {
        return privateKeyAlgo;
    }

    public void setPrivateKeyAlgo(String privateKeyAlgo) {
        this.privateKeyAlgo = privateKeyAlgo;
    }

    public CreateCsrRequestBody withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * CSR用途。取值如下： - PERSONAL：个人证书 - ENTERPRISE：企业证书
     * @return usage
     */
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public CreateCsrRequestBody withCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
        return this;
    }

    /**
     * 国家，当“usage”取值为“ENTERPRISE”时，本参数必填。取值示例：CN。
     * @return companyCountry
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public CreateCsrRequestBody withCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
        return this;
    }

    /**
     * 省份，当“usage”取值为“ENTERPRISE”时，本参数必填。取值示例：北京市。
     * @return companyProvince
     */
    public String getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }

    public CreateCsrRequestBody withCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }

    /**
     * 城市，用途为企业证书场景下必填。当“usage”取值为“ENTERPRISE”时，本参数必填。取值示例：北京市。
     * @return companyCity
     */
    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public CreateCsrRequestBody withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 公司名称，用途为企业证书场景下必填。当“usage”取值为“ENTERPRISE”时，本参数必填。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCsrRequestBody that = (CreateCsrRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.sans, that.sans) && Objects.equals(this.privateKeyAlgo, that.privateKeyAlgo)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.companyCountry, that.companyCountry)
            && Objects.equals(this.companyProvince, that.companyProvince)
            && Objects.equals(this.companyCity, that.companyCity) && Objects.equals(this.companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            domainName,
            sans,
            privateKeyAlgo,
            usage,
            companyCountry,
            companyProvince,
            companyCity,
            companyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCsrRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    privateKeyAlgo: ").append(toIndentedString(privateKeyAlgo)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
        sb.append("    companyProvince: ").append(toIndentedString(companyProvince)).append("\n");
        sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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
