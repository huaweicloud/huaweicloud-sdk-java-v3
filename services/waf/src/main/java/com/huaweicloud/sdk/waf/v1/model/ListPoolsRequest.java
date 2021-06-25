package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPoolsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pagesize")
    
    private Integer pagesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private Boolean detail;

    public ListPoolsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 当前页数
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListPoolsRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    


    /**
     * 页内项目数
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    

    public ListPoolsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * WAF组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListPoolsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * WAF组所在VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public ListPoolsRequest withDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 是否返回WAF组详情（例如组内域名/实例等）
     * @return detail
     */
    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPoolsRequest listPoolsRequest = (ListPoolsRequest) o;
        return Objects.equals(this.page, listPoolsRequest.page) &&
            Objects.equals(this.pagesize, listPoolsRequest.pagesize) &&
            Objects.equals(this.name, listPoolsRequest.name) &&
            Objects.equals(this.vpcId, listPoolsRequest.vpcId) &&
            Objects.equals(this.detail, listPoolsRequest.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, name, vpcId, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

