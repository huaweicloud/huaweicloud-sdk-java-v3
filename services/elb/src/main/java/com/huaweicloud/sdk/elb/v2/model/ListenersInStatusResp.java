package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.L7policiesInStatusResp;
import com.huaweicloud.sdk.elb.v2.model.PoolsInStatusResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 监听器对象列表，用于状态树中
 */
public class ListenersInStatusResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<PoolsInStatusResp> pools = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policies")
    
    private List<L7policiesInStatusResp> l7policies = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;

    public ListenersInStatusResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 监听器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListenersInStatusResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 监听器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListenersInStatusResp withPools(List<PoolsInStatusResp> pools) {
        this.pools = pools;
        return this;
    }

    
    public ListenersInStatusResp addPoolsItem(PoolsInStatusResp poolsItem) {
        this.pools.add(poolsItem);
        return this;
    }

    public ListenersInStatusResp withPools(Consumer<List<PoolsInStatusResp>> poolsSetter) {
        if(this.pools == null ){
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 监听器关联的后端云服务器组列表
     * @return pools
     */
    public List<PoolsInStatusResp> getPools() {
        return pools;
    }

    public void setPools(List<PoolsInStatusResp> pools) {
        this.pools = pools;
    }

    public ListenersInStatusResp withL7policies(List<L7policiesInStatusResp> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    
    public ListenersInStatusResp addL7policiesItem(L7policiesInStatusResp l7policiesItem) {
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public ListenersInStatusResp withL7policies(Consumer<List<L7policiesInStatusResp>> l7policiesSetter) {
        if(this.l7policies == null ){
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /**
     * 监听器关联的转发策略列表
     * @return l7policies
     */
    public List<L7policiesInStatusResp> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<L7policiesInStatusResp> l7policies) {
        this.l7policies = l7policies;
    }

    public ListenersInStatusResp withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 监听器的操作状态；该字段为预留字段，暂未启用。默认为ONLINE。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListenersInStatusResp withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 监听器的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListenersInStatusResp listenersInStatusResp = (ListenersInStatusResp) o;
        return Objects.equals(this.id, listenersInStatusResp.id) &&
            Objects.equals(this.name, listenersInStatusResp.name) &&
            Objects.equals(this.pools, listenersInStatusResp.pools) &&
            Objects.equals(this.l7policies, listenersInStatusResp.l7policies) &&
            Objects.equals(this.operatingStatus, listenersInStatusResp.operatingStatus) &&
            Objects.equals(this.provisioningStatus, listenersInStatusResp.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, pools, l7policies, operatingStatus, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenersInStatusResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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

