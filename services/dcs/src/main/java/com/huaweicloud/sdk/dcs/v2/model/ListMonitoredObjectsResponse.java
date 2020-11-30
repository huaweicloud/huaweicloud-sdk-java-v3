package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.DimChild;
import com.huaweicloud.sdk.dcs.v2.model.InstancesMonitoredObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMonitoredObjectsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="router")
    
    private List<String> router = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="children")
    
    private List<DimChild> children = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<InstancesMonitoredObject> instances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListMonitoredObjectsResponse withRouter(List<String> router) {
        this.router = router;
        return this;
    }

    
    public ListMonitoredObjectsResponse addRouterItem(String routerItem) {
        if (this.router == null) {
            this.router = new ArrayList<>();
        }
        this.router.add(routerItem);
        return this;
    }

    public ListMonitoredObjectsResponse withRouter(Consumer<List<String>> routerSetter) {
        if(this.router == null ){
            this.router = new ArrayList<>();
        }
        routerSetter.accept(this.router);
        return this;
    }

    /**
     * 当前查询维度路由。如果是主维度，则数组中是自身ID。
     * @return router
     */
    public List<String> getRouter() {
        return router;
    }

    public void setRouter(List<String> router) {
        this.router = router;
    }

    public ListMonitoredObjectsResponse withChildren(List<DimChild> children) {
        this.children = children;
        return this;
    }

    
    public ListMonitoredObjectsResponse addChildrenItem(DimChild childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ListMonitoredObjectsResponse withChildren(Consumer<List<DimChild>> childrenSetter) {
        if(this.children == null ){
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 当前查询维度子维度对象列表。当前只有维度为dcs_instance_id时才有值。 - Proxy集群有两个子维度，分别为dcs_cluster_redis_node和dcs_cluster_proxy_node。 - Cluster集群有一个子维度 dcs_cluster_proxy_node。 
     * @return children
     */
    public List<DimChild> getChildren() {
        return children;
    }

    public void setChildren(List<DimChild> children) {
        this.children = children;
    }

    public ListMonitoredObjectsResponse withInstances(List<InstancesMonitoredObject> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListMonitoredObjectsResponse addInstancesItem(InstancesMonitoredObject instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListMonitoredObjectsResponse withInstances(Consumer<List<InstancesMonitoredObject>> instancesSetter) {
        if(this.instances == null ){
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 当前查询维度监控对象列表。
     * @return instances
     */
    public List<InstancesMonitoredObject> getInstances() {
        return instances;
    }

    public void setInstances(List<InstancesMonitoredObject> instances) {
        this.instances = instances;
    }

    public ListMonitoredObjectsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 主维度监控对象的总数。
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
        ListMonitoredObjectsResponse listMonitoredObjectsResponse = (ListMonitoredObjectsResponse) o;
        return Objects.equals(this.router, listMonitoredObjectsResponse.router) &&
            Objects.equals(this.children, listMonitoredObjectsResponse.children) &&
            Objects.equals(this.instances, listMonitoredObjectsResponse.instances) &&
            Objects.equals(this.total, listMonitoredObjectsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(router, children, instances, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonitoredObjectsResponse {\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

