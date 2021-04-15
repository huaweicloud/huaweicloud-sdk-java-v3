package com.huaweicloud.sdk.cloudide.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.Attributes;
import com.huaweicloud.sdk.cloudide.v2.model.Role;
import com.huaweicloud.sdk.cloudide.v2.model.RoleAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InstancesVO
 */
public class InstancesVO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_list")
    
    private List<RoleAction> actionList = null;
        /**
     * cpu架构 x86|arm
     */
    public static final class ArchEnum {

        
        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchEnum X86 = new ArchEnum("x86");
        
        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchEnum ARM = new ArchEnum("arm");
        

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchEnum(value);
            }
            return result;
        }

        public static ArchEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    private ArchEnum arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    
    private Attributes attributes;
    /**
     * cpu规格.arm架构支持4U8G，x86架构支持1U1G,2U4G,2U8G 与技术栈配置的规格对应，可通过技术栈管理ListStacksByTag接口获取。如果标签不为空，以标签配置的技术栈规格为准。 quantum技术栈，x86架构cpu规格为2U8G;其他技术栈，x86架构cpu规格为1U1G,2U4G
     */
    public static final class CpuMemoryEnum {

        
        /**
         * Enum _1U1G for value: "1U1G"
         */
        public static final CpuMemoryEnum _1U1G = new CpuMemoryEnum("1U1G");
        
        /**
         * Enum _2U4G for value: "2U4G"
         */
        public static final CpuMemoryEnum _2U4G = new CpuMemoryEnum("2U4G");
        
        /**
         * Enum _2U8G for value: "2U8G"
         */
        public static final CpuMemoryEnum _2U8G = new CpuMemoryEnum("2U8G");
        
        /**
         * Enum _4U8G for value: "4U8G"
         */
        public static final CpuMemoryEnum _4U8G = new CpuMemoryEnum("4U8G");
        

        private static final Map<String, CpuMemoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CpuMemoryEnum> createStaticFields() {
            Map<String, CpuMemoryEnum> map = new HashMap<>();
            map.put("1U1G", _1U1G);
            map.put("2U4G", _2U4G);
            map.put("2U8G", _2U8G);
            map.put("4U8G", _4U8G);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CpuMemoryEnum(String value) {
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
        public static CpuMemoryEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CpuMemoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CpuMemoryEnum(value);
            }
            return result;
        }

        public static CpuMemoryEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CpuMemoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CpuMemoryEnum) {
                return this.value.equals(((CpuMemoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu_memory")
    
    private CpuMemoryEnum cpuMemory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_temporary")
    
    private Boolean isTemporary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="link")
    
    private String link;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="organization_id")
    
    private String organizationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner_id")
    
    private String ownerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner_name")
    
    private String ownerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform_id")
    
    private Long platformId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private")
    
    private Boolean _private;
    /**
     * PVC规格 5GB|10GB|20GB
     */
    public static final class PvcQuantityEnum {

        
        /**
         * Enum _5GB for value: "5GB"
         */
        public static final PvcQuantityEnum _5GB = new PvcQuantityEnum("5GB");
        
        /**
         * Enum _10GB for value: "10GB"
         */
        public static final PvcQuantityEnum _10GB = new PvcQuantityEnum("10GB");
        
        /**
         * Enum _20GB for value: "20GB"
         */
        public static final PvcQuantityEnum _20GB = new PvcQuantityEnum("20GB");
        

        private static final Map<String, PvcQuantityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PvcQuantityEnum> createStaticFields() {
            Map<String, PvcQuantityEnum> map = new HashMap<>();
            map.put("5GB", _5GB);
            map.put("10GB", _10GB);
            map.put("20GB", _20GB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PvcQuantityEnum(String value) {
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
        public static PvcQuantityEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PvcQuantityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PvcQuantityEnum(value);
            }
            return result;
        }

        public static PvcQuantityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PvcQuantityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PvcQuantityEnum) {
                return this.value.equals(((PvcQuantityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pvc_quantity")
    
    private PvcQuantityEnum pvcQuantity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refresh_interval")
    
    private Long refreshInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private Role role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private String roleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_map")
    
    private Map<String, String> serverMap = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_url")
    
    private String serverUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    private String stackId;
    /**
     * 实例状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");
        
        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");
        
        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StatusEnum STOPPING = new StatusEnum("STOPPING");
        
        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");
        
        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");
        
        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("STARTING", STARTING);
            map.put("RUNNING", RUNNING);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("DELETING", DELETING);
            map.put("DELETED", DELETED);
            map.put("DELETE_FAILED", DELETE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_org")
    
    private String subOrg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;

    public InstancesVO withActionList(List<RoleAction> actionList) {
        this.actionList = actionList;
        return this;
    }

    
    public InstancesVO addActionListItem(RoleAction actionListItem) {
        if(this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        this.actionList.add(actionListItem);
        return this;
    }

    public InstancesVO withActionList(Consumer<List<RoleAction>> actionListSetter) {
        if(this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        actionListSetter.accept(this.actionList);
        return this;
    }

    /**
     * 角色权限列表
     * @return actionList
     */
    public List<RoleAction> getActionList() {
        return actionList;
    }

    public void setActionList(List<RoleAction> actionList) {
        this.actionList = actionList;
    }

    

    public InstancesVO withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * cpu架构 x86|arm
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    

    public InstancesVO withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public InstancesVO withAttributes(Consumer<Attributes> attributesSetter) {
        if(this.attributes == null ){
            this.attributes = new Attributes();
            attributesSetter.accept(this.attributes);
        }
        
        return this;
    }


    /**
     * Get attributes
     * @return attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    

    public InstancesVO withCpuMemory(CpuMemoryEnum cpuMemory) {
        this.cpuMemory = cpuMemory;
        return this;
    }

    


    /**
     * cpu规格.arm架构支持4U8G，x86架构支持1U1G,2U4G,2U8G 与技术栈配置的规格对应，可通过技术栈管理ListStacksByTag接口获取。如果标签不为空，以标签配置的技术栈规格为准。 quantum技术栈，x86架构cpu规格为2U8G;其他技术栈，x86架构cpu规格为1U1G,2U4G
     * @return cpuMemory
     */
    public CpuMemoryEnum getCpuMemory() {
        return cpuMemory;
    }

    public void setCpuMemory(CpuMemoryEnum cpuMemory) {
        this.cpuMemory = cpuMemory;
    }

    

    public InstancesVO withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    

    public InstancesVO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public InstancesVO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 实例名。 可以输入中文、数字、字母、下划线、点、破折号。长度介于3-100之间
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public InstancesVO withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 组织名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public InstancesVO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public InstancesVO withIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }

    


    /**
     * 是否页面显示（以标签配置为准）
     * @return isTemporary
     */
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    

    public InstancesVO withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    

    public InstancesVO withLink(String link) {
        this.link = link;
        return this;
    }

    


    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    

    public InstancesVO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public InstancesVO withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    


    /**
     * 组织id（对应华为云帐号的domainId）
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    

    public InstancesVO withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    


    /**
     * 用户id
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    

    public InstancesVO withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    


    /**
     * 用户名
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    

    public InstancesVO withPlatformId(Long platformId) {
        this.platformId = platformId;
        return this;
    }

    


    /**
     * 平台ID
     * minimum: 1
     * maximum: 100
     * @return platformId
     */
    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    

    public InstancesVO withPrivate(Boolean _private) {
        this._private = _private;
        return this;
    }

    


    /**
     * 是否私有平台
     * @return _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    

    public InstancesVO withPvcQuantity(PvcQuantityEnum pvcQuantity) {
        this.pvcQuantity = pvcQuantity;
        return this;
    }

    


    /**
     * PVC规格 5GB|10GB|20GB
     * @return pvcQuantity
     */
    public PvcQuantityEnum getPvcQuantity() {
        return pvcQuantity;
    }

    public void setPvcQuantity(PvcQuantityEnum pvcQuantity) {
        this.pvcQuantity = pvcQuantity;
    }

    

    public InstancesVO withRefreshInterval(Long refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }

    


    /**
     * 实例的生命周期。 arm架构,生命周期只能设置成30，60。x86架构可取值为30，60，240，1440和-1。除-1外，其它值的单位为“分钟”。实例在到达生命周期后，将会被暂停（已保存的数据不会被删除）。-1表示实例不会自动停止。
     * minimum: -1
     * maximum: 1440
     * @return refreshInterval
     */
    public Long getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Long refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    

    public InstancesVO withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public InstancesVO withRole(Role role) {
        this.role = role;
        return this;
    }

    public InstancesVO withRole(Consumer<Role> roleSetter) {
        if(this.role == null ){
            this.role = new Role();
            roleSetter.accept(this.role);
        }
        
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    

    public InstancesVO withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * 角色id
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    

    public InstancesVO withServerMap(Map<String, String> serverMap) {
        this.serverMap = serverMap;
        return this;
    }

    

    public InstancesVO putServerMapItem(String key, String serverMapItem) {
        if(this.serverMap == null) {
            this.serverMap = new HashMap<>();
        }
        this.serverMap.put(key, serverMapItem);
        return this;
    }

    public InstancesVO withServerMap(Consumer<Map<String, String>> serverMapSetter) {
        if(this.serverMap == null) {
            this.serverMap = new HashMap<>();
        }
        serverMapSetter.accept(this.serverMap);
        return this;
    }
    /**
     * server
     * @return serverMap
     */
    public Map<String, String> getServerMap() {
        return serverMap;
    }

    public void setServerMap(Map<String, String> serverMap) {
        this.serverMap = serverMap;
    }

    

    public InstancesVO withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    


    /**
     * 服务链接
     * @return serverUrl
     */
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    

    public InstancesVO withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 技术栈ID，通过技术栈管理ListStacksByTag接口获取。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public InstancesVO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public InstancesVO withSubOrg(String subOrg) {
        this.subOrg = subOrg;
        return this;
    }

    


    /**
     * 子组织
     * @return subOrg
     */
    public String getSubOrg() {
        return subOrg;
    }

    public void setSubOrg(String subOrg) {
        this.subOrg = subOrg;
    }

    

    public InstancesVO withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstancesVO instancesVO = (InstancesVO) o;
        return Objects.equals(this.actionList, instancesVO.actionList) &&
            Objects.equals(this.arch, instancesVO.arch) &&
            Objects.equals(this.attributes, instancesVO.attributes) &&
            Objects.equals(this.cpuMemory, instancesVO.cpuMemory) &&
            Objects.equals(this.createdTime, instancesVO.createdTime) &&
            Objects.equals(this.description, instancesVO.description) &&
            Objects.equals(this.displayName, instancesVO.displayName) &&
            Objects.equals(this.domainName, instancesVO.domainName) &&
            Objects.equals(this.id, instancesVO.id) &&
            Objects.equals(this.isTemporary, instancesVO.isTemporary) &&
            Objects.equals(this.label, instancesVO.label) &&
            Objects.equals(this.link, instancesVO.link) &&
            Objects.equals(this.name, instancesVO.name) &&
            Objects.equals(this.organizationId, instancesVO.organizationId) &&
            Objects.equals(this.ownerId, instancesVO.ownerId) &&
            Objects.equals(this.ownerName, instancesVO.ownerName) &&
            Objects.equals(this.platformId, instancesVO.platformId) &&
            Objects.equals(this._private, instancesVO._private) &&
            Objects.equals(this.pvcQuantity, instancesVO.pvcQuantity) &&
            Objects.equals(this.refreshInterval, instancesVO.refreshInterval) &&
            Objects.equals(this.region, instancesVO.region) &&
            Objects.equals(this.role, instancesVO.role) &&
            Objects.equals(this.roleId, instancesVO.roleId) &&
            Objects.equals(this.serverMap, instancesVO.serverMap) &&
            Objects.equals(this.serverUrl, instancesVO.serverUrl) &&
            Objects.equals(this.stackId, instancesVO.stackId) &&
            Objects.equals(this.status, instancesVO.status) &&
            Objects.equals(this.subOrg, instancesVO.subOrg) &&
            Objects.equals(this.updatedTime, instancesVO.updatedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionList, arch, attributes, cpuMemory, createdTime, description, displayName, domainName, id, isTemporary, label, link, name, organizationId, ownerId, ownerName, platformId, _private, pvcQuantity, refreshInterval, region, role, roleId, serverMap, serverUrl, stackId, status, subOrg, updatedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesVO {\n");
        sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    cpuMemory: ").append(toIndentedString(cpuMemory)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    pvcQuantity: ").append(toIndentedString(pvcQuantity)).append("\n");
        sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    serverMap: ").append(toIndentedString(serverMap)).append("\n");
        sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subOrg: ").append(toIndentedString(subOrg)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

