package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private String domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_tags")

    private Boolean showTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exact_match")

    private Boolean exactMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListDomainsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 加速域名，采用模糊匹配的方式。（长度限制为1-255字符）。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ListDomainsRequest withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 加速域名的业务类型。取值： - web（网站加速） - download（文件下载加速） - video（点播加速） - wholeSite（全站加速）
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public ListDomainsRequest withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * 加速域名状态。取值意义： - online表示“已开启” - offline表示“已停用” - configuring表示“配置中” - configure_failed表示“配置失败” - checking表示“审核中” - check_failed表示“审核未通过” - deleting表示“删除中”。
     * @return domainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public ListDomainsRequest withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * 华为云CDN提供的加速服务范围，包含： - mainland_china 中国大陆 - outside_mainland_china 中国大陆境外 - global 全球。
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ListDomainsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页加速域名的数量，取值范围1-10000，默认值为30。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListDomainsRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 查询的页码，即：从哪一页开始查询，取值范围1-65535，默认值为1。
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListDomainsRequest withShowTags(Boolean showTags) {
        this.showTags = showTags;
        return this;
    }

    /**
     * 展示标签标识 true：展示 false：不展示。
     * @return showTags
     */
    public Boolean getShowTags() {
        return showTags;
    }

    public void setShowTags(Boolean showTags) {
        this.showTags = showTags;
    }

    public ListDomainsRequest withExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
        return this;
    }

    /**
     * 精准匹配 true：开启 false：关闭。
     * @return exactMatch
     */
    public Boolean getExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    public ListDomainsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，\"all\"表示所有项目。注意：当使用子帐号调用接口时，该参数必传。  您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainsRequest that = (ListDomainsRequest) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNumber, that.pageNumber) && Objects.equals(this.showTags, that.showTags)
            && Objects.equals(this.exactMatch, that.exactMatch)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            businessType,
            domainStatus,
            serviceArea,
            pageSize,
            pageNumber,
            showTags,
            exactMatch,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainsRequest {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    showTags: ").append(toIndentedString(showTags)).append("\n");
        sb.append("    exactMatch: ").append(toIndentedString(exactMatch)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
