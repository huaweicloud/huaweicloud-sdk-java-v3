package com.huaweicloud.sdk.cloudide.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.Plugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InstanceEdgeParam
 */
public class InstanceEdgeParam  {

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
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_user_domain_id")
    
    private String instanceUserDomainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_user_domain_name")
    
    private String instanceUserDomainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_user_id")
    
    private String instanceUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_user_name")
    
    private String instanceUserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_temporary")
    
    private Boolean isTemporary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugins")
    
    private List<Plugin> plugins = null;
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
    @JsonProperty(value="refresh_time")
    
    private String refreshTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    private String stackId;

    public InstanceEdgeParam withArch(ArchEnum arch) {
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

    

    public InstanceEdgeParam withCpuMemory(CpuMemoryEnum cpuMemory) {
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

    

    public InstanceEdgeParam withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述。长度不操过100个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public InstanceEdgeParam withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名。 可以输入中文、数字、字母、下划线、点、破折号。长度介于3-100之间
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    public InstanceEdgeParam withInstanceUserDomainId(String instanceUserDomainId) {
        this.instanceUserDomainId = instanceUserDomainId;
        return this;
    }

    


    /**
     * 组织id（对应华为云帐号的domainId）
     * @return instanceUserDomainId
     */
    public String getInstanceUserDomainId() {
        return instanceUserDomainId;
    }

    public void setInstanceUserDomainId(String instanceUserDomainId) {
        this.instanceUserDomainId = instanceUserDomainId;
    }

    

    public InstanceEdgeParam withInstanceUserDomainName(String instanceUserDomainName) {
        this.instanceUserDomainName = instanceUserDomainName;
        return this;
    }

    


    /**
     * 用户组织名
     * @return instanceUserDomainName
     */
    public String getInstanceUserDomainName() {
        return instanceUserDomainName;
    }

    public void setInstanceUserDomainName(String instanceUserDomainName) {
        this.instanceUserDomainName = instanceUserDomainName;
    }

    

    public InstanceEdgeParam withInstanceUserId(String instanceUserId) {
        this.instanceUserId = instanceUserId;
        return this;
    }

    


    /**
     * 用户id
     * @return instanceUserId
     */
    public String getInstanceUserId() {
        return instanceUserId;
    }

    public void setInstanceUserId(String instanceUserId) {
        this.instanceUserId = instanceUserId;
    }

    

    public InstanceEdgeParam withInstanceUserName(String instanceUserName) {
        this.instanceUserName = instanceUserName;
        return this;
    }

    


    /**
     * 用户名
     * @return instanceUserName
     */
    public String getInstanceUserName() {
        return instanceUserName;
    }

    public void setInstanceUserName(String instanceUserName) {
        this.instanceUserName = instanceUserName;
    }

    

    public InstanceEdgeParam withIsTemporary(Boolean isTemporary) {
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

    

    public InstanceEdgeParam withPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
        return this;
    }

    
    public InstanceEdgeParam addPluginsItem(Plugin pluginsItem) {
        this.plugins.add(pluginsItem);
        return this;
    }

    public InstanceEdgeParam withPlugins(Consumer<List<Plugin>> pluginsSetter) {
        if(this.plugins == null ){
            this.plugins = new ArrayList<>();
        }
        pluginsSetter.accept(this.plugins);
        return this;
    }

    /**
     * 插件列表
     * @return plugins
     */
    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    

    public InstanceEdgeParam withPvcQuantity(PvcQuantityEnum pvcQuantity) {
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

    

    public InstanceEdgeParam withRefreshTime(String refreshTime) {
        this.refreshTime = refreshTime;
        return this;
    }

    


    /**
     * 实例的生命周期。 arm架构,生命周期只能设置成30，60。x86架构可取值为30，60，240，1440和-1。除-1外，其它值的单位为“分钟”。实例在到达生命周期后，将会被暂停（已保存的数据不会被删除）。-1表示实例不会自动停止。
     * @return refreshTime
     */
    public String getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(String refreshTime) {
        this.refreshTime = refreshTime;
    }

    

    public InstanceEdgeParam withStackId(String stackId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceEdgeParam instanceEdgeParam = (InstanceEdgeParam) o;
        return Objects.equals(this.arch, instanceEdgeParam.arch) &&
            Objects.equals(this.cpuMemory, instanceEdgeParam.cpuMemory) &&
            Objects.equals(this.description, instanceEdgeParam.description) &&
            Objects.equals(this.instanceName, instanceEdgeParam.instanceName) &&
            Objects.equals(this.instanceUserDomainId, instanceEdgeParam.instanceUserDomainId) &&
            Objects.equals(this.instanceUserDomainName, instanceEdgeParam.instanceUserDomainName) &&
            Objects.equals(this.instanceUserId, instanceEdgeParam.instanceUserId) &&
            Objects.equals(this.instanceUserName, instanceEdgeParam.instanceUserName) &&
            Objects.equals(this.isTemporary, instanceEdgeParam.isTemporary) &&
            Objects.equals(this.plugins, instanceEdgeParam.plugins) &&
            Objects.equals(this.pvcQuantity, instanceEdgeParam.pvcQuantity) &&
            Objects.equals(this.refreshTime, instanceEdgeParam.refreshTime) &&
            Objects.equals(this.stackId, instanceEdgeParam.stackId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(arch, cpuMemory, description, instanceName, instanceUserDomainId, instanceUserDomainName, instanceUserId, instanceUserName, isTemporary, plugins, pvcQuantity, refreshTime, stackId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceEdgeParam {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuMemory: ").append(toIndentedString(cpuMemory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceUserDomainId: ").append(toIndentedString(instanceUserDomainId)).append("\n");
        sb.append("    instanceUserDomainName: ").append(toIndentedString(instanceUserDomainName)).append("\n");
        sb.append("    instanceUserId: ").append(toIndentedString(instanceUserId)).append("\n");
        sb.append("    instanceUserName: ").append(toIndentedString(instanceUserName)).append("\n");
        sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
        sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
        sb.append("    pvcQuantity: ").append(toIndentedString(pvcQuantity)).append("\n");
        sb.append("    refreshTime: ").append(toIndentedString(refreshTime)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
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

