package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.AuditInstanceListBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditInstancesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<AuditInstanceListBean> servers = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    public ListAuditInstancesResponse withServers(List<AuditInstanceListBean> servers) {
        this.servers = servers;
        return this;
    }

    
    public ListAuditInstancesResponse addServersItem(AuditInstanceListBean serversItem) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListAuditInstancesResponse withServers(Consumer<List<AuditInstanceListBean>> serversSetter) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 实例信息列表
     * @return servers
     */
    public List<AuditInstanceListBean> getServers() {
        return servers;
    }

    public void setServers(List<AuditInstanceListBean> servers) {
        this.servers = servers;
    }

    

    public ListAuditInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
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
        ListAuditInstancesResponse listAuditInstancesResponse = (ListAuditInstancesResponse) o;
        return Objects.equals(this.servers, listAuditInstancesResponse.servers) &&
            Objects.equals(this.total, listAuditInstancesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(servers, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditInstancesResponse {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

