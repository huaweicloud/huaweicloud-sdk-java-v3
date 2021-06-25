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
public class ListUrlRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    
    private String top;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recent")
    
    private String recent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private List<String> hosts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<String> instances = null;
    
    public ListUrlRequest withTop(String top) {
        this.top = top;
        return this;
    }

    


    /**
     * 受攻击次数最多的几条url
     * @return top
     */
    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    

    public ListUrlRequest withRecent(String recent) {
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

    

    public ListUrlRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * 起始时间戳
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    

    public ListUrlRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    


    /**
     * 截止时间戳
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    

    public ListUrlRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public ListUrlRequest addHostsItem(String hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListUrlRequest withHosts(Consumer<List<String>> hostsSetter) {
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

    

    public ListUrlRequest withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListUrlRequest addInstancesItem(String instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListUrlRequest withInstances(Consumer<List<String>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 域名
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUrlRequest listUrlRequest = (ListUrlRequest) o;
        return Objects.equals(this.top, listUrlRequest.top) &&
            Objects.equals(this.recent, listUrlRequest.recent) &&
            Objects.equals(this.from, listUrlRequest.from) &&
            Objects.equals(this.to, listUrlRequest.to) &&
            Objects.equals(this.hosts, listUrlRequest.hosts) &&
            Objects.equals(this.instances, listUrlRequest.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(top, recent, from, to, hosts, instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUrlRequest {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

