package com.huaweicloud.sdk.elb.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.ResourceList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 负载均衡器响应体
 */
public class LoadbalancerResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_id")
    
    private String vipSubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_port_id")
    
    private String vipPortId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<ResourceList> listeners = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<ResourceList> pools = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;
    /**
     * 负载均衡器的操作状态
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
     * 负载均衡器的配置状态
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = new ArrayList<>();
    
    public LoadbalancerResp withId(String id) {
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

    public LoadbalancerResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 负载均衡器所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public LoadbalancerResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadbalancerResp withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 负载均衡器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LoadbalancerResp withVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
        return this;
    }

    


    /**
     * 负载均衡器所在的子网ID。仅支持内网类型。
     * @return vipSubnetId
     */
    public String getVipSubnetId() {
        return vipSubnetId;
    }

    public void setVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
    }

    public LoadbalancerResp withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    


    /**
     * 负载均衡器虚拟IP对应的端口ID
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public LoadbalancerResp withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    


    /**
     * 负载均衡器的虚拟IP。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public LoadbalancerResp withListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public LoadbalancerResp addListenersItem(ResourceList listenersItem) {
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadbalancerResp withListeners(Consumer<List<ResourceList>> listenersSetter) {
        if(this.listeners == null ){
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 负载均衡器关联的监听器ID的列表
     * @return listeners
     */
    public List<ResourceList> getListeners() {
        return listeners;
    }

    public void setListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
    }

    public LoadbalancerResp withPools(List<ResourceList> pools) {
        this.pools = pools;
        return this;
    }

    
    public LoadbalancerResp addPoolsItem(ResourceList poolsItem) {
        this.pools.add(poolsItem);
        return this;
    }

    public LoadbalancerResp withPools(Consumer<List<ResourceList>> poolsSetter) {
        if(this.pools == null ){
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 负载均衡器关联的后端云服务器组ID的列表。
     * @return pools
     */
    public List<ResourceList> getPools() {
        return pools;
    }

    public void setPools(List<ResourceList> pools) {
        this.pools = pools;
    }

    public LoadbalancerResp withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 负载均衡器的供应者名称。只支持vlb
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public LoadbalancerResp withOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 负载均衡器的操作状态
     * @return operatingStatus
     */
    public OperatingStatusEnum getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public LoadbalancerResp withProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 负载均衡器的配置状态
     * @return provisioningStatus
     */
    public ProvisioningStatusEnum getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadbalancerResp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 负载均衡器的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public LoadbalancerResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 负载均衡器的创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LoadbalancerResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 负载均衡器的更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LoadbalancerResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 负载均衡器的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public LoadbalancerResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 负载均衡器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LoadbalancerResp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public LoadbalancerResp addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public LoadbalancerResp withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 负载均衡器的标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadbalancerResp loadbalancerResp = (LoadbalancerResp) o;
        return Objects.equals(this.id, loadbalancerResp.id) &&
            Objects.equals(this.tenantId, loadbalancerResp.tenantId) &&
            Objects.equals(this.name, loadbalancerResp.name) &&
            Objects.equals(this.description, loadbalancerResp.description) &&
            Objects.equals(this.vipSubnetId, loadbalancerResp.vipSubnetId) &&
            Objects.equals(this.vipPortId, loadbalancerResp.vipPortId) &&
            Objects.equals(this.vipAddress, loadbalancerResp.vipAddress) &&
            Objects.equals(this.listeners, loadbalancerResp.listeners) &&
            Objects.equals(this.pools, loadbalancerResp.pools) &&
            Objects.equals(this.provider, loadbalancerResp.provider) &&
            Objects.equals(this.operatingStatus, loadbalancerResp.operatingStatus) &&
            Objects.equals(this.provisioningStatus, loadbalancerResp.provisioningStatus) &&
            Objects.equals(this.adminStateUp, loadbalancerResp.adminStateUp) &&
            Objects.equals(this.createdAt, loadbalancerResp.createdAt) &&
            Objects.equals(this.updatedAt, loadbalancerResp.updatedAt) &&
            Objects.equals(this.enterpriseProjectId, loadbalancerResp.enterpriseProjectId) &&
            Objects.equals(this.projectId, loadbalancerResp.projectId) &&
            Objects.equals(this.tags, loadbalancerResp.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, tenantId, name, description, vipSubnetId, vipPortId, vipAddress, listeners, pools, provider, operatingStatus, provisioningStatus, adminStateUp, createdAt, updatedAt, enterpriseProjectId, projectId, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadbalancerResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vipSubnetId: ").append(toIndentedString(vipSubnetId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

