package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.L7policiesV2InStatusResp;
import com.huaweicloud.sdk.elb.v2.model.PoolsV2InStatusResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 监听器对象列表，用于状态树中
 */
public class ListenersV2InStatusResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<PoolsV2InStatusResp> pools = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policies")
    
    private List<L7policiesV2InStatusResp> l7policies = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;

    public ListenersV2InStatusResp withId(String id) {
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

    public ListenersV2InStatusResp withName(String name) {
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

    public ListenersV2InStatusResp withPools(List<PoolsV2InStatusResp> pools) {
        this.pools = pools;
        return this;
    }

    
    public ListenersV2InStatusResp addPoolsItem(PoolsV2InStatusResp poolsItem) {
        this.pools.add(poolsItem);
        return this;
    }

    public ListenersV2InStatusResp withPools(Consumer<List<PoolsV2InStatusResp>> poolsSetter) {
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
    public List<PoolsV2InStatusResp> getPools() {
        return pools;
    }

    public void setPools(List<PoolsV2InStatusResp> pools) {
        this.pools = pools;
    }

    public ListenersV2InStatusResp withL7policies(List<L7policiesV2InStatusResp> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    
    public ListenersV2InStatusResp addL7policiesItem(L7policiesV2InStatusResp l7policiesItem) {
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public ListenersV2InStatusResp withL7policies(Consumer<List<L7policiesV2InStatusResp>> l7policiesSetter) {
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
    public List<L7policiesV2InStatusResp> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<L7policiesV2InStatusResp> l7policies) {
        this.l7policies = l7policies;
    }

    public ListenersV2InStatusResp withOperatingStatus(String operatingStatus) {
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

    public ListenersV2InStatusResp withProvisioningStatus(String provisioningStatus) {
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
        ListenersV2InStatusResp listenersV2InStatusResp = (ListenersV2InStatusResp) o;
        return Objects.equals(this.id, listenersV2InStatusResp.id) &&
            Objects.equals(this.name, listenersV2InStatusResp.name) &&
            Objects.equals(this.pools, listenersV2InStatusResp.pools) &&
            Objects.equals(this.l7policies, listenersV2InStatusResp.l7policies) &&
            Objects.equals(this.operatingStatus, listenersV2InStatusResp.operatingStatus) &&
            Objects.equals(this.provisioningStatus, listenersV2InStatusResp.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, pools, l7policies, operatingStatus, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenersV2InStatusResp {\n");
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

