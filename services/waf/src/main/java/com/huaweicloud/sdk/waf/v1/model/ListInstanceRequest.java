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
public class ListInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pagesize")
    
    private Integer pagesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instancename")
    
    private String instancename;

    public ListInstanceRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 页数
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListInstanceRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    


    /**
     * 每页数量
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    

    public ListInstanceRequest withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    


    /**
     * 独享引擎名称
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceRequest listInstanceRequest = (ListInstanceRequest) o;
        return Objects.equals(this.page, listInstanceRequest.page) &&
            Objects.equals(this.pagesize, listInstanceRequest.pagesize) &&
            Objects.equals(this.instancename, listInstanceRequest.instancename);
    }
    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, instancename);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
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

