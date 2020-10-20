package com.huaweicloud.sdk.elb.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.ListenersV2InStatusResp;
import com.huaweicloud.sdk.elb.v2.model.PoolsV2InStatusResp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 负载均衡器对象，用于负载均衡器状态树中
 */
public class LoadbalancerV2InStatusResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<ListenersV2InStatusResp> listeners = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<PoolsV2InStatusResp> pools = new ArrayList<>();
        /**
     * 负载均衡器的操作状态；该字段为预留字段，暂未启用。默认为ONLINE。
     */
    public static final class OperatingStatusEnum {

        
        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final OperatingStatusEnum ONLINE = new OperatingStatusEnum("ONLINE");
        
        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final OperatingStatusEnum OFFLINE = new OperatingStatusEnum("OFFLINE");
        
        /**
         * Enum DEGRADED for value: "DEGRADED"
         */
        public static final OperatingStatusEnum DEGRADED = new OperatingStatusEnum("DEGRADED");
        
        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final OperatingStatusEnum DISABLED = new OperatingStatusEnum("DISABLED");
        
        /**
         * Enum NO_MONITOR for value: "NO_MONITOR"
         */
        public static final OperatingStatusEnum NO_MONITOR = new OperatingStatusEnum("NO_MONITOR");
        

        private static final Map<String, OperatingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatingStatusEnum> createStaticFields() {
            Map<String, OperatingStatusEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            map.put("DEGRADED", DEGRADED);
            map.put("DISABLED", DISABLED);
            map.put("NO_MONITOR", NO_MONITOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatingStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperatingStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperatingStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperatingStatusEnum(value);
            }
            return result;
        }

        public static OperatingStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperatingStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperatingStatusEnum) {
                return this.value.equals(((OperatingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private OperatingStatusEnum operatingStatus;
    /**
     * 负载均衡器的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     */
    public static final class ProvisioningStatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ProvisioningStatusEnum ACTIVE = new ProvisioningStatusEnum("ACTIVE");
        
        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final ProvisioningStatusEnum PENDING_CREATE = new ProvisioningStatusEnum("PENDING_CREATE");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ProvisioningStatusEnum ERROR = new ProvisioningStatusEnum("ERROR");
        

        private static final Map<String, ProvisioningStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProvisioningStatusEnum> createStaticFields() {
            Map<String, ProvisioningStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProvisioningStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProvisioningStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProvisioningStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProvisioningStatusEnum(value);
            }
            return result;
        }

        public static ProvisioningStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProvisioningStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProvisioningStatusEnum) {
                return this.value.equals(((ProvisioningStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private ProvisioningStatusEnum provisioningStatus;

    public LoadbalancerV2InStatusResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadbalancerV2InStatusResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 负载均衡器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadbalancerV2InStatusResp withListeners(List<ListenersV2InStatusResp> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public LoadbalancerV2InStatusResp addListenersItem(ListenersV2InStatusResp listenersItem) {
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadbalancerV2InStatusResp withListeners(Consumer<List<ListenersV2InStatusResp>> listenersSetter) {
        if(this.listeners == null ){
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 负载均衡器关联的监听器列表
     * @return listeners
     */
    public List<ListenersV2InStatusResp> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenersV2InStatusResp> listeners) {
        this.listeners = listeners;
    }

    public LoadbalancerV2InStatusResp withPools(List<PoolsV2InStatusResp> pools) {
        this.pools = pools;
        return this;
    }

    
    public LoadbalancerV2InStatusResp addPoolsItem(PoolsV2InStatusResp poolsItem) {
        this.pools.add(poolsItem);
        return this;
    }

    public LoadbalancerV2InStatusResp withPools(Consumer<List<PoolsV2InStatusResp>> poolsSetter) {
        if(this.pools == null ){
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 负载均衡器关联的后端云服务器组列表
     * @return pools
     */
    public List<PoolsV2InStatusResp> getPools() {
        return pools;
    }

    public void setPools(List<PoolsV2InStatusResp> pools) {
        this.pools = pools;
    }

    public LoadbalancerV2InStatusResp withOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 负载均衡器的操作状态；该字段为预留字段，暂未启用。默认为ONLINE。
     * @return operatingStatus
     */
    public OperatingStatusEnum getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public LoadbalancerV2InStatusResp withProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 负载均衡器的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     * @return provisioningStatus
     */
    public ProvisioningStatusEnum getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
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
        LoadbalancerV2InStatusResp loadbalancerV2InStatusResp = (LoadbalancerV2InStatusResp) o;
        return Objects.equals(this.name, loadbalancerV2InStatusResp.name) &&
            Objects.equals(this.id, loadbalancerV2InStatusResp.id) &&
            Objects.equals(this.listeners, loadbalancerV2InStatusResp.listeners) &&
            Objects.equals(this.pools, loadbalancerV2InStatusResp.pools) &&
            Objects.equals(this.operatingStatus, loadbalancerV2InStatusResp.operatingStatus) &&
            Objects.equals(this.provisioningStatus, loadbalancerV2InStatusResp.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, listeners, pools, operatingStatus, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadbalancerV2InStatusResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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

