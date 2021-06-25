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
public class ListPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pagesize")
    
    private Integer pagesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public ListPolicyRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * page
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListPolicyRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    


    /**
     * pagesize
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    

    public ListPolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPolicyRequest listPolicyRequest = (ListPolicyRequest) o;
        return Objects.equals(this.page, listPolicyRequest.page) &&
            Objects.equals(this.pagesize, listPolicyRequest.pagesize) &&
            Objects.equals(this.name, listPolicyRequest.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

