package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ProductInfo
 */
public class ProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    @JacksonXmlProperty(localName = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    @JacksonXmlProperty(localName = "product_name")

    private String productName;

    public ProductInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 数据源产品所属账号的ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProductInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 数据源产品所属项目的ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProductInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 数据源产品所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProductInfo withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 数据源产品所属公司的名称。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ProductInfo withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 数据源产品的名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) o;
        return Objects.equals(this.domainId, productInfo.domainId)
            && Objects.equals(this.projectId, productInfo.projectId) && Objects.equals(this.region, productInfo.region)
            && Objects.equals(this.companyName, productInfo.companyName)
            && Objects.equals(this.productName, productInfo.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, projectId, region, companyName, productName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfo {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
