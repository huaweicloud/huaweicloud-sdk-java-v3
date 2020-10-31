package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateProductExt
 */
public class TemplateProductExt  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="productshort")
    
    private String productshort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="home_link")
    
    private String homeLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_link")
    
    private String apiLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdk_link")
    
    private String sdkLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="doc_link")
    
    private String docLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logo_link")
    
    private String logoLink;

    public TemplateProductExt withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateProductExt withProductshort(String productshort) {
        this.productshort = productshort;
        return this;
    }

    


    /**
     * 产品短名
     * @return productshort
     */
    public String getProductshort() {
        return productshort;
    }

    public void setProductshort(String productshort) {
        this.productshort = productshort;
    }

    public TemplateProductExt withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 产品名
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public TemplateProductExt withHomeLink(String homeLink) {
        this.homeLink = homeLink;
        return this;
    }

    


    /**
     * 首页链接
     * @return homeLink
     */
    public String getHomeLink() {
        return homeLink;
    }

    public void setHomeLink(String homeLink) {
        this.homeLink = homeLink;
    }

    public TemplateProductExt withApiLink(String apiLink) {
        this.apiLink = apiLink;
        return this;
    }

    


    /**
     * api调试链接
     * @return apiLink
     */
    public String getApiLink() {
        return apiLink;
    }

    public void setApiLink(String apiLink) {
        this.apiLink = apiLink;
    }

    public TemplateProductExt withSdkLink(String sdkLink) {
        this.sdkLink = sdkLink;
        return this;
    }

    


    /**
     * sdk下载链接
     * @return sdkLink
     */
    public String getSdkLink() {
        return sdkLink;
    }

    public void setSdkLink(String sdkLink) {
        this.sdkLink = sdkLink;
    }

    public TemplateProductExt withDocLink(String docLink) {
        this.docLink = docLink;
        return this;
    }

    


    /**
     * 文档链接
     * @return docLink
     */
    public String getDocLink() {
        return docLink;
    }

    public void setDocLink(String docLink) {
        this.docLink = docLink;
    }

    public TemplateProductExt withLogoLink(String logoLink) {
        this.logoLink = logoLink;
        return this;
    }

    


    /**
     * logo链接
     * @return logoLink
     */
    public String getLogoLink() {
        return logoLink;
    }

    public void setLogoLink(String logoLink) {
        this.logoLink = logoLink;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateProductExt templateProductExt = (TemplateProductExt) o;
        return Objects.equals(this.id, templateProductExt.id) &&
            Objects.equals(this.productshort, templateProductExt.productshort) &&
            Objects.equals(this.productName, templateProductExt.productName) &&
            Objects.equals(this.homeLink, templateProductExt.homeLink) &&
            Objects.equals(this.apiLink, templateProductExt.apiLink) &&
            Objects.equals(this.sdkLink, templateProductExt.sdkLink) &&
            Objects.equals(this.docLink, templateProductExt.docLink) &&
            Objects.equals(this.logoLink, templateProductExt.logoLink);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, productshort, productName, homeLink, apiLink, sdkLink, docLink, logoLink);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateProductExt {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productshort: ").append(toIndentedString(productshort)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    homeLink: ").append(toIndentedString(homeLink)).append("\n");
        sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
        sb.append("    sdkLink: ").append(toIndentedString(sdkLink)).append("\n");
        sb.append("    docLink: ").append(toIndentedString(docLink)).append("\n");
        sb.append("    logoLink: ").append(toIndentedString(logoLink)).append("\n");
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

