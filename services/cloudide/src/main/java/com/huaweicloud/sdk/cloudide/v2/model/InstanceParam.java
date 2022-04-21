package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceParam
 */
public class InstanceParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchEnum(value);
            }
            return result;
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof ArchEnum) {
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
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    /**
     * cpu规格.arm架构支持4U8G，x86架构支持1U1G,2U4G,2U8G 与技术栈配置的规格对应，可通过技术栈管理ListStacks接口获取。如果标签不为空，以标签配置的技术栈规格为准。 quantum技术栈，x86架构cpu规格为2U8G;其他技术栈，x86架构cpu规格为1U1G,2U4G
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CpuMemoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CpuMemoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CpuMemoryEnum(value);
            }
            return result;
        }

        public static CpuMemoryEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof CpuMemoryEnum) {
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
    @JsonProperty(value = "cpu_memory")

    private CpuMemoryEnum cpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_temporary")

    private Boolean isTemporary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_tag")

    private String labelTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_enable_list")

    private List<String> pluginEnableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_vars")

    private Map<String, String> pluginVars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PvcQuantityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PvcQuantityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PvcQuantityEnum(value);
            }
            return result;
        }

        public static PvcQuantityEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof PvcQuantityEnum) {
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
    @JsonProperty(value = "pvc_quantity")

    private PvcQuantityEnum pvcQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_interval")

    private String refreshInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Long repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_user_domain_name")

    private String instanceUserDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_user_name")

    private String instanceUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_domain_id")

    private String instanceDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_user_id")

    private String instanceUserId;

    public InstanceParam withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 代理商id，教程活动场景下使用
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public InstanceParam withArch(ArchEnum arch) {
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

    public InstanceParam withCpuMemory(CpuMemoryEnum cpuMemory) {
        this.cpuMemory = cpuMemory;
        return this;
    }

    /**
     * cpu规格.arm架构支持4U8G，x86架构支持1U1G,2U4G,2U8G 与技术栈配置的规格对应，可通过技术栈管理ListStacks接口获取。如果标签不为空，以标签配置的技术栈规格为准。 quantum技术栈，x86架构cpu规格为2U8G;其他技术栈，x86架构cpu规格为1U1G,2U4G
     * @return cpuMemory
     */
    public CpuMemoryEnum getCpuMemory() {
        return cpuMemory;
    }

    public void setCpuMemory(CpuMemoryEnum cpuMemory) {
        this.cpuMemory = cpuMemory;
    }

    public InstanceParam withDescription(String description) {
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

    public InstanceParam withDisplayName(String displayName) {
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

    public InstanceParam withIsTemporary(Boolean isTemporary) {
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

    public InstanceParam withLabelTag(String labelTag) {
        this.labelTag = labelTag;
        return this;
    }

    /**
     * 实例标签（不同的第三方需要和CloudIDE服务共同设定标签），不传默认为default
     * @return labelTag
     */
    public String getLabelTag() {
        return labelTag;
    }

    public void setLabelTag(String labelTag) {
        this.labelTag = labelTag;
    }

    public InstanceParam withPluginEnableList(List<String> pluginEnableList) {
        this.pluginEnableList = pluginEnableList;
        return this;
    }

    public InstanceParam addPluginEnableListItem(String pluginEnableListItem) {
        if (this.pluginEnableList == null) {
            this.pluginEnableList = new ArrayList<>();
        }
        this.pluginEnableList.add(pluginEnableListItem);
        return this;
    }

    public InstanceParam withPluginEnableList(Consumer<List<String>> pluginEnableListSetter) {
        if (this.pluginEnableList == null) {
            this.pluginEnableList = new ArrayList<>();
        }
        pluginEnableListSetter.accept(this.pluginEnableList);
        return this;
    }

    /**
     * 预装插件列表
     * @return pluginEnableList
     */
    public List<String> getPluginEnableList() {
        return pluginEnableList;
    }

    public void setPluginEnableList(List<String> pluginEnableList) {
        this.pluginEnableList = pluginEnableList;
    }

    public InstanceParam withPluginVars(Map<String, String> pluginVars) {
        this.pluginVars = pluginVars;
        return this;
    }

    public InstanceParam putPluginVarsItem(String key, String pluginVarsItem) {
        if (this.pluginVars == null) {
            this.pluginVars = new HashMap<>();
        }
        this.pluginVars.put(key, pluginVarsItem);
        return this;
    }

    public InstanceParam withPluginVars(Consumer<Map<String, String>> pluginVarsSetter) {
        if (this.pluginVars == null) {
            this.pluginVars = new HashMap<>();
        }
        pluginVarsSetter.accept(this.pluginVars);
        return this;
    }

    /**
     * 预装插件参数
     * @return pluginVars
     */
    public Map<String, String> getPluginVars() {
        return pluginVars;
    }

    public void setPluginVars(Map<String, String> pluginVars) {
        this.pluginVars = pluginVars;
    }

    public InstanceParam withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 云服务器对应的portId，小网连接ecs的场景下使用
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public InstanceParam withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 云服务器ip，小网连接ecs的场景下使用
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public InstanceParam withPvcQuantity(PvcQuantityEnum pvcQuantity) {
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

    public InstanceParam withRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }

    /**
     * 自动休眠时长。 arm架构,自动休眠时长只能设置成30，60。x86架构可取值为30，60，240，1440和-1。除-1外，其它值的单位为“分钟”。实例无操作超过自动休眠时长后，将会被暂停（已保存的数据不会被删除）。-1表示实例不会自动停止
     * @return refreshInterval
     */
    public String getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public InstanceParam withRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 解放号的仓库id，解放号场景下使用
     * minimum: 1
     * maximum: -9223372036854775616
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public InstanceParam withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 技术栈ID，通过技术栈管理ListStacks接口获取。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public InstanceParam withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，教程活动场景下使用
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public InstanceParam withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 解放号的token，解放号场景下使用
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InstanceParam withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 云服务器对应的vpcId，小网连接ecs的场景下使用
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceParam withInstanceUserDomainName(String instanceUserDomainName) {
        this.instanceUserDomainName = instanceUserDomainName;
        return this;
    }

    /**
     * 实例授权用户租户名
     * @return instanceUserDomainName
     */
    public String getInstanceUserDomainName() {
        return instanceUserDomainName;
    }

    public void setInstanceUserDomainName(String instanceUserDomainName) {
        this.instanceUserDomainName = instanceUserDomainName;
    }

    public InstanceParam withInstanceUserName(String instanceUserName) {
        this.instanceUserName = instanceUserName;
        return this;
    }

    /**
     * 实例授权用户名
     * @return instanceUserName
     */
    public String getInstanceUserName() {
        return instanceUserName;
    }

    public void setInstanceUserName(String instanceUserName) {
        this.instanceUserName = instanceUserName;
    }

    public InstanceParam withInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
        return this;
    }

    /**
     * 实例授权用户租户ID
     * @return instanceDomainId
     */
    public String getInstanceDomainId() {
        return instanceDomainId;
    }

    public void setInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
    }

    public InstanceParam withInstanceUserId(String instanceUserId) {
        this.instanceUserId = instanceUserId;
        return this;
    }

    /**
     * 实例授权用户ID
     * @return instanceUserId
     */
    public String getInstanceUserId() {
        return instanceUserId;
    }

    public void setInstanceUserId(String instanceUserId) {
        this.instanceUserId = instanceUserId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceParam instanceParam = (InstanceParam) o;
        return Objects.equals(this.agentId, instanceParam.agentId) && Objects.equals(this.arch, instanceParam.arch)
            && Objects.equals(this.cpuMemory, instanceParam.cpuMemory)
            && Objects.equals(this.description, instanceParam.description)
            && Objects.equals(this.displayName, instanceParam.displayName)
            && Objects.equals(this.isTemporary, instanceParam.isTemporary)
            && Objects.equals(this.labelTag, instanceParam.labelTag)
            && Objects.equals(this.pluginEnableList, instanceParam.pluginEnableList)
            && Objects.equals(this.pluginVars, instanceParam.pluginVars)
            && Objects.equals(this.portId, instanceParam.portId)
            && Objects.equals(this.privateIp, instanceParam.privateIp)
            && Objects.equals(this.pvcQuantity, instanceParam.pvcQuantity)
            && Objects.equals(this.refreshInterval, instanceParam.refreshInterval)
            && Objects.equals(this.repositoryId, instanceParam.repositoryId)
            && Objects.equals(this.stackId, instanceParam.stackId)
            && Objects.equals(this.taskType, instanceParam.taskType) && Objects.equals(this.token, instanceParam.token)
            && Objects.equals(this.vpcId, instanceParam.vpcId)
            && Objects.equals(this.instanceUserDomainName, instanceParam.instanceUserDomainName)
            && Objects.equals(this.instanceUserName, instanceParam.instanceUserName)
            && Objects.equals(this.instanceDomainId, instanceParam.instanceDomainId)
            && Objects.equals(this.instanceUserId, instanceParam.instanceUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            arch,
            cpuMemory,
            description,
            displayName,
            isTemporary,
            labelTag,
            pluginEnableList,
            pluginVars,
            portId,
            privateIp,
            pvcQuantity,
            refreshInterval,
            repositoryId,
            stackId,
            taskType,
            token,
            vpcId,
            instanceUserDomainName,
            instanceUserName,
            instanceDomainId,
            instanceUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceParam {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuMemory: ").append(toIndentedString(cpuMemory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    isTemporary: ").append(toIndentedString(isTemporary)).append("\n");
        sb.append("    labelTag: ").append(toIndentedString(labelTag)).append("\n");
        sb.append("    pluginEnableList: ").append(toIndentedString(pluginEnableList)).append("\n");
        sb.append("    pluginVars: ").append(toIndentedString(pluginVars)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    pvcQuantity: ").append(toIndentedString(pvcQuantity)).append("\n");
        sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    instanceUserDomainName: ").append(toIndentedString(instanceUserDomainName)).append("\n");
        sb.append("    instanceUserName: ").append(toIndentedString(instanceUserName)).append("\n");
        sb.append("    instanceDomainId: ").append(toIndentedString(instanceDomainId)).append("\n");
        sb.append("    instanceUserId: ").append(toIndentedString(instanceUserId)).append("\n");
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
