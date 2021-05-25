package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListPermissionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_page")
    
    private Integer perPage;

    public KeystoneListPermissionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 权限名，获取方式请参见：[获取权限名、权限ID](https://support.huaweicloud.com/api-iam/iam_10_0001.html)。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public KeystoneListPermissionsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。    > - 如果填写此参数，则返回账号下所有自定义策略。 > - 如果不填写此参数，则返回所有系统权限（包含系统策略和系统角色）。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public KeystoneListPermissionsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 分页查询时数据的页数，查询值最小为1，默认值为1。需要与per_page同时使用。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public KeystoneListPermissionsRequest withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    


    /**
     * 分页查询时每页的数据个数，取值范围为[1,300], 默认值为300。需要与page同时使用。
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListPermissionsRequest keystoneListPermissionsRequest = (KeystoneListPermissionsRequest) o;
        return Objects.equals(this.name, keystoneListPermissionsRequest.name) &&
            Objects.equals(this.domainId, keystoneListPermissionsRequest.domainId) &&
            Objects.equals(this.page, keystoneListPermissionsRequest.page) &&
            Objects.equals(this.perPage, keystoneListPermissionsRequest.perPage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, page, perPage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListPermissionsRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

