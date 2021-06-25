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
public class ListSourceIpNumRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recent")
    
    private String recent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private List<String> hosts = null;
    
    public ListSourceIpNumRequest withRecent(String recent) {
        this.recent = recent;
        return this;
    }

    


    /**
     * 要查询事件时间范围
     * @return recent
     */
    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    

    public ListSourceIpNumRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public ListSourceIpNumRequest addHostsItem(String hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListSourceIpNumRequest withHosts(Consumer<List<String>> hostsSetter) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 要查询事件的域名列表
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSourceIpNumRequest listSourceIpNumRequest = (ListSourceIpNumRequest) o;
        return Objects.equals(this.recent, listSourceIpNumRequest.recent) &&
            Objects.equals(this.hosts, listSourceIpNumRequest.hosts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recent, hosts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSourceIpNumRequest {\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

