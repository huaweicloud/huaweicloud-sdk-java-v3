package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowLogsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_date")
    
    private Long queryDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_number")
    
    private Integer pageNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ShowLogsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 只支持单个域名，如：www.test1.com。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public ShowLogsRequest withQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    


    /**
     * 查询开始时间，查询开始时间到开始时间+1天内的日志数据，取值范围是距离当前30天内。
     * @return queryDate
     */
    public Long getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
    }

    

    public ShowLogsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 单页最大数量，取值范围为1-10000。
     * minimum: 1
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    

    public ShowLogsRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    


    /**
     * 当前查询第几页，取值范围为1-65535。
     * minimum: 1
     * maximum: 65535
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    

    public ShowLogsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 当用户开启企业项目功能时，该参数生效，表示资源所属企业项目，不传表示默认项目。
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
        ShowLogsRequest showLogsRequest = (ShowLogsRequest) o;
        return Objects.equals(this.domainName, showLogsRequest.domainName) &&
            Objects.equals(this.queryDate, showLogsRequest.queryDate) &&
            Objects.equals(this.pageSize, showLogsRequest.pageSize) &&
            Objects.equals(this.pageNumber, showLogsRequest.pageNumber) &&
            Objects.equals(this.enterpriseProjectId, showLogsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainName, queryDate, pageSize, pageNumber, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogsRequest {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    queryDate: ").append(toIndentedString(queryDate)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

