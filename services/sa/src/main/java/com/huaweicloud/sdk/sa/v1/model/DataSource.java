package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DataSource
 */
public class DataSource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="company_name")
    
    private String companyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_feature")
    
    private String productFeature;

    public DataSource withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据源类型，取值范围如下： 1 - 华为产品 2 - 第三方产品 3 - 租户私有产品
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public DataSource withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 数据源产品所属管理账号的ID，最大36个字符。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public DataSource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 数据源产品所属项目的ID，最大36个字符。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public DataSource withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 数据源产品所在区域，具体取值范围查看华为云地区和终端节点定义。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public DataSource withCompanyName(String companyName) {
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

    

    public DataSource withProductName(String productName) {
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

    

    public DataSource withProductFeature(String productFeature) {
        this.productFeature = productFeature;
        return this;
    }

    


    /**
     * 产品功能特性名称，用来指明检测到当前事件的产品的功能特性。
     * @return productFeature
     */
    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataSource dataSource = (DataSource) o;
        return Objects.equals(this.type, dataSource.type) &&
            Objects.equals(this.domainId, dataSource.domainId) &&
            Objects.equals(this.projectId, dataSource.projectId) &&
            Objects.equals(this.region, dataSource.region) &&
            Objects.equals(this.companyName, dataSource.companyName) &&
            Objects.equals(this.productName, dataSource.productName) &&
            Objects.equals(this.productFeature, dataSource.productFeature);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, domainId, projectId, region, companyName, productName, productFeature);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productFeature: ").append(toIndentedString(productFeature)).append("\n");
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

