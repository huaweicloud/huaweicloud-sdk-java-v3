package com.huaweicloud.sdk.mrs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.HostModel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListHostsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    
    private List<HostModel> hosts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private Integer total;

    public ListHostsResponse withHosts(List<HostModel> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public ListHostsResponse addHostsItem(HostModel hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListHostsResponse withHosts(Consumer<List<HostModel>> hostsSetter) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机参数。
     * @return hosts
     */
    public List<HostModel> getHosts() {
        return hosts;
    }

    public void setHosts(List<HostModel> hosts) {
        this.hosts = hosts;
    }

    

    public ListHostsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 主机列表总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsResponse listHostsResponse = (ListHostsResponse) o;
        return Objects.equals(this.hosts, listHostsResponse.hosts) &&
            Objects.equals(this.total, listHostsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hosts, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsResponse {\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

