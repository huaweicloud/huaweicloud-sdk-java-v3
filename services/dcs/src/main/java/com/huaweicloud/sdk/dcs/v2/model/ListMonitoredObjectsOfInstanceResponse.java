package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.ClusterRedisNodeMonitoredObject;
import com.huaweicloud.sdk.dcs.v2.model.DimChild;
import com.huaweicloud.sdk.dcs.v2.model.InstancesMonitoredObject;
import com.huaweicloud.sdk.dcs.v2.model.ProxyNodeMonitoredObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMonitoredObjectsOfInstanceResponse extends SdkResponse {



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
    @JsonProperty(value="dcs_cluster_redis_node")
    
    private List<ClusterRedisNodeMonitoredObject> dcsClusterRedisNode = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dcs_cluster_proxy_node")
    
    private List<ProxyNodeMonitoredObject> dcsClusterProxyNode = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListMonitoredObjectsOfInstanceResponse withRouter(List<String> router) {
        this.router = router;
        return this;
    }

    
    public ListMonitoredObjectsOfInstanceResponse addRouterItem(String routerItem) {
        if (this.router == null) {
            this.router = new ArrayList<>();
        }
        this.router.add(routerItem);
        return this;
    }

    public ListMonitoredObjectsOfInstanceResponse withRouter(Consumer<List<String>> routerSetter) {
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

    public ListMonitoredObjectsOfInstanceResponse withChildren(List<DimChild> children) {
        this.children = children;
        return this;
    }

    
    public ListMonitoredObjectsOfInstanceResponse addChildrenItem(DimChild childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ListMonitoredObjectsOfInstanceResponse withChildren(Consumer<List<DimChild>> childrenSetter) {
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

    public ListMonitoredObjectsOfInstanceResponse withInstances(List<InstancesMonitoredObject> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListMonitoredObjectsOfInstanceResponse addInstancesItem(InstancesMonitoredObject instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListMonitoredObjectsOfInstanceResponse withInstances(Consumer<List<InstancesMonitoredObject>> instancesSetter) {
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

    public ListMonitoredObjectsOfInstanceResponse withDcsClusterRedisNode(List<ClusterRedisNodeMonitoredObject> dcsClusterRedisNode) {
        this.dcsClusterRedisNode = dcsClusterRedisNode;
        return this;
    }

    
    public ListMonitoredObjectsOfInstanceResponse addDcsClusterRedisNodeItem(ClusterRedisNodeMonitoredObject dcsClusterRedisNodeItem) {
        if (this.dcsClusterRedisNode == null) {
            this.dcsClusterRedisNode = new ArrayList<>();
        }
        this.dcsClusterRedisNode.add(dcsClusterRedisNodeItem);
        return this;
    }

    public ListMonitoredObjectsOfInstanceResponse withDcsClusterRedisNode(Consumer<List<ClusterRedisNodeMonitoredObject>> dcsClusterRedisNodeSetter) {
        if(this.dcsClusterRedisNode == null ){
            this.dcsClusterRedisNode = new ArrayList<>();
        }
        dcsClusterRedisNodeSetter.accept(this.dcsClusterRedisNode);
        return this;
    }

    /**
     * Proxy集群或Cluster集群时才存在，表示集群数据节点维度的监控对象列表。字段名称与children的子维度对象名称相同。
     * @return dcsClusterRedisNode
     */
    public List<ClusterRedisNodeMonitoredObject> getDcsClusterRedisNode() {
        return dcsClusterRedisNode;
    }

    public void setDcsClusterRedisNode(List<ClusterRedisNodeMonitoredObject> dcsClusterRedisNode) {
        this.dcsClusterRedisNode = dcsClusterRedisNode;
    }

    public ListMonitoredObjectsOfInstanceResponse withDcsClusterProxyNode(List<ProxyNodeMonitoredObject> dcsClusterProxyNode) {
        this.dcsClusterProxyNode = dcsClusterProxyNode;
        return this;
    }

    
    public ListMonitoredObjectsOfInstanceResponse addDcsClusterProxyNodeItem(ProxyNodeMonitoredObject dcsClusterProxyNodeItem) {
        if (this.dcsClusterProxyNode == null) {
            this.dcsClusterProxyNode = new ArrayList<>();
        }
        this.dcsClusterProxyNode.add(dcsClusterProxyNodeItem);
        return this;
    }

    public ListMonitoredObjectsOfInstanceResponse withDcsClusterProxyNode(Consumer<List<ProxyNodeMonitoredObject>> dcsClusterProxyNodeSetter) {
        if(this.dcsClusterProxyNode == null ){
            this.dcsClusterProxyNode = new ArrayList<>();
        }
        dcsClusterProxyNodeSetter.accept(this.dcsClusterProxyNode);
        return this;
    }

    /**
     * Proxy集群时才存在，表示集群Proxy节点维度的监控对象列表。字段名称与children的子维度对象名称相同。
     * @return dcsClusterProxyNode
     */
    public List<ProxyNodeMonitoredObject> getDcsClusterProxyNode() {
        return dcsClusterProxyNode;
    }

    public void setDcsClusterProxyNode(List<ProxyNodeMonitoredObject> dcsClusterProxyNode) {
        this.dcsClusterProxyNode = dcsClusterProxyNode;
    }

    public ListMonitoredObjectsOfInstanceResponse withTotal(Integer total) {
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
        ListMonitoredObjectsOfInstanceResponse listMonitoredObjectsOfInstanceResponse = (ListMonitoredObjectsOfInstanceResponse) o;
        return Objects.equals(this.router, listMonitoredObjectsOfInstanceResponse.router) &&
            Objects.equals(this.children, listMonitoredObjectsOfInstanceResponse.children) &&
            Objects.equals(this.instances, listMonitoredObjectsOfInstanceResponse.instances) &&
            Objects.equals(this.dcsClusterRedisNode, listMonitoredObjectsOfInstanceResponse.dcsClusterRedisNode) &&
            Objects.equals(this.dcsClusterProxyNode, listMonitoredObjectsOfInstanceResponse.dcsClusterProxyNode) &&
            Objects.equals(this.total, listMonitoredObjectsOfInstanceResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(router, children, instances, dcsClusterRedisNode, dcsClusterProxyNode, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonitoredObjectsOfInstanceResponse {\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    dcsClusterRedisNode: ").append(toIndentedString(dcsClusterRedisNode)).append("\n");
        sb.append("    dcsClusterProxyNode: ").append(toIndentedString(dcsClusterProxyNode)).append("\n");
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

