package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEventsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recent")
    
    private String recent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private List<String> hosts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pagesize")
    
    private Integer pagesize;

    public ListEventsRequest withRecent(String recent) {
        this.recent = recent;
        return this;
    }

    


    /**
     * 查询日志的时间范围
     * @return recent
     */
    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    

    public ListEventsRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public ListEventsRequest addHostsItem(String hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListEventsRequest withHosts(Consumer<List<String>> hostsSetter) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 查询指定host列表的日志
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    

    public ListEventsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 查询列表的页数
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListEventsRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    


    /**
     * 查询列表每一页的条数
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventsRequest listEventsRequest = (ListEventsRequest) o;
        return Objects.equals(this.recent, listEventsRequest.recent) &&
            Objects.equals(this.hosts, listEventsRequest.hosts) &&
            Objects.equals(this.page, listEventsRequest.page) &&
            Objects.equals(this.pagesize, listEventsRequest.pagesize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recent, hosts, page, pagesize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsRequest {\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
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

