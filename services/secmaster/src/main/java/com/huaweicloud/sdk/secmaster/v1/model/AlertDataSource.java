package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 首次上报数据源
 */
public class AlertDataSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_feature")

    private String productFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_module")

    private String productModule;

    public AlertDataSource withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 数据源类型，取值范围如下： 1 - 云上产品 2 - 第三方产品 3 - 租户私有产品
     * minimum: 1
     * maximum: 3
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public AlertDataSource withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 数据源产品所属账号的id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AlertDataSource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 数据源产品所属项目的id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AlertDataSource withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 数据源产品所在区域，具体取值范围查看云地区和终端节点定义
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AlertDataSource withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 数据源产品所属公司的名称
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public AlertDataSource withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 数据源产品的名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public AlertDataSource withProductFeature(String productFeature) {
        this.productFeature = productFeature;
        return this;
    }

    /**
     * 产品功能特性名称，用来指明检测到当前事件的产品的功能特性
     * @return productFeature
     */
    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    public AlertDataSource withProductModule(String productModule) {
        this.productModule = productModule;
        return this;
    }

    /**
     * 检测模块列表
     * @return productModule
     */
    public String getProductModule() {
        return productModule;
    }

    public void setProductModule(String productModule) {
        this.productModule = productModule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertDataSource that = (AlertDataSource) obj;
        return Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.companyName, that.companyName) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.productFeature, that.productFeature)
            && Objects.equals(this.productModule, that.productModule);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceType, domainId, projectId, regionId, companyName, productName, productFeature, productModule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertDataSource {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productFeature: ").append(toIndentedString(productFeature)).append("\n");
        sb.append("    productModule: ").append(toIndentedString(productModule)).append("\n");
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
