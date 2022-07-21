package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCertificatesHttpsInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_domain_id")

    private String userDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowCertificatesHttpsInfoRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页的数量，取值范围1-10000，不设值时默认值为30。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowCertificatesHttpsInfoRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 查询的页码。取值范围1-65535，不设值时默认值为1。
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ShowCertificatesHttpsInfoRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 加速域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowCertificatesHttpsInfoRequest withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    /**
     * 域名所属用户的domain_id。
     * @return userDomainId
     */
    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    public ShowCertificatesHttpsInfoRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，\"all\"表示所有项目。注意：当使用子账号调用接口时，该参数必传。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertificatesHttpsInfoRequest showCertificatesHttpsInfoRequest = (ShowCertificatesHttpsInfoRequest) o;
        return Objects.equals(this.pageSize, showCertificatesHttpsInfoRequest.pageSize)
            && Objects.equals(this.pageNumber, showCertificatesHttpsInfoRequest.pageNumber)
            && Objects.equals(this.domainName, showCertificatesHttpsInfoRequest.domainName)
            && Objects.equals(this.userDomainId, showCertificatesHttpsInfoRequest.userDomainId)
            && Objects.equals(this.enterpriseProjectId, showCertificatesHttpsInfoRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, pageNumber, domainName, userDomainId, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificatesHttpsInfoRequest {\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    userDomainId: ").append(toIndentedString(userDomainId)).append("\n");
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
