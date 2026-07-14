package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 推理单元配置。 **约束限制：** 单机推理时，个数只会为1；如果是分布式推理时，根据不同框架，实例单元配置可灵活配置。
 */
public class UnitConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_spec")

    private CustomResourceSpec customSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_display_name")

    private String flavorDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ImageInfo image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ModelResource> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codes")

    private List<Code> codes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<FileInfo> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dumps")

    private List<Dump> dumps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "termination_grace")

    private TerminationGrace terminationGrace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private Map<String, String> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_health")

    private Health readinessHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_health")

    private Health startupHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_health")

    private Health livenessHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery")

    private String recovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_reset_enable")

    private Boolean npuResetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_count")

    private Integer groupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private Affinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config")

    private ServiceSecurityConfig securityConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_resource_flavor")

    private String poolResourceFlavor;

    public UnitConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 实例单元ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnitConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例单元角色名称。 **约束限制：** 最大长度为16字符，且需满足正则：^\\[a-z0-9]([-a-z0-9]*[a-z0-9])?$ **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitConfig withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 实例单元角色。 **约束限制：** 不涉及。 **取值范围：** - common：表示其他角色。 **默认取值：** 不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UnitConfig withCustomSpec(CustomResourceSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public UnitConfig withCustomSpec(Consumer<CustomResourceSpec> customSpecSetter) {
        if (this.customSpec == null) {
            this.customSpec = new CustomResourceSpec();
            customSpecSetter.accept(this.customSpec);
        }

        return this;
    }

    /**
     * Get customSpec
     * @return customSpec
     */
    public CustomResourceSpec getCustomSpec() {
        return customSpec;
    }

    public void setCustomSpec(CustomResourceSpec customSpec) {
        this.customSpec = customSpec;
    }

    public UnitConfig withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释：** 资源规格，根据所提供版本选择适合业务的规格。当specification为custom为自定义规格。由custom_spec指定部署的规格配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public UnitConfig withFlavorDisplayName(String flavorDisplayName) {
        this.flavorDisplayName = flavorDisplayName;
        return this;
    }

    /**
     * **参数解释：** 资源规格的显示名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return flavorDisplayName
     */
    public String getFlavorDisplayName() {
        return flavorDisplayName;
    }

    public void setFlavorDisplayName(String flavorDisplayName) {
        this.flavorDisplayName = flavorDisplayName;
    }

    public UnitConfig withImage(ImageInfo image) {
        this.image = image;
        return this;
    }

    public UnitConfig withImage(Consumer<ImageInfo> imageSetter) {
        if (this.image == null) {
            this.image = new ImageInfo();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ImageInfo getImage() {
        return image;
    }

    public void setImage(ImageInfo image) {
        this.image = image;
    }

    public UnitConfig withModels(List<ModelResource> models) {
        this.models = models;
        return this;
    }

    public UnitConfig addModelsItem(ModelResource modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public UnitConfig withModels(Consumer<List<ModelResource>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * **参数解释：** 废弃参数，推荐使用files进行模型相关配置。 模型相关配置，用户可以在此处选择模型及权重文件配合镜像使用。 **约束限制：** 不涉及。
     * @return models
     */
    public List<ModelResource> getModels() {
        return models;
    }

    public void setModels(List<ModelResource> models) {
        this.models = models;
    }

    public UnitConfig withCodes(List<Code> codes) {
        this.codes = codes;
        return this;
    }

    public UnitConfig addCodesItem(Code codesItem) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        this.codes.add(codesItem);
        return this;
    }

    public UnitConfig withCodes(Consumer<List<Code>> codesSetter) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        codesSetter.accept(this.codes);
        return this;
    }

    /**
     * **参数解释：** 废弃参数，推荐使用files进行代码相关配置。 代码相关配置，用户可以在此处选择代码所在的obs路径等。 **约束限制：** 不涉及。
     * @return codes
     */
    public List<Code> getCodes() {
        return codes;
    }

    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    public UnitConfig withFiles(List<FileInfo> files) {
        this.files = files;
        return this;
    }

    public UnitConfig addFilesItem(FileInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public UnitConfig withFiles(Consumer<List<FileInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释：** 模型和代码相关配置，用户可以在此处选择模型及权重文件配合镜像使用以及代码所在的obs路径等。 **约束限制：** 不涉及。
     * @return files
     */
    public List<FileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<FileInfo> files) {
        this.files = files;
    }

    public UnitConfig withDumps(List<Dump> dumps) {
        this.dumps = dumps;
        return this;
    }

    public UnitConfig addDumpsItem(Dump dumpsItem) {
        if (this.dumps == null) {
            this.dumps = new ArrayList<>();
        }
        this.dumps.add(dumpsItem);
        return this;
    }

    public UnitConfig withDumps(Consumer<List<Dump>> dumpsSetter) {
        if (this.dumps == null) {
            this.dumps = new ArrayList<>();
        }
        dumpsSetter.accept(this.dumps);
        return this;
    }

    /**
     * **参数解释：** 用户转储配置，用户可以在此处选择要转储的目的obs。 **约束限制：** 最多配置20组。
     * @return dumps
     */
    public List<Dump> getDumps() {
        return dumps;
    }

    public void setDumps(List<Dump> dumps) {
        this.dumps = dumps;
    }

    public UnitConfig withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 配置实例个数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public UnitConfig withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * **参数解释：** 启动命令。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public UnitConfig withTerminationGrace(TerminationGrace terminationGrace) {
        this.terminationGrace = terminationGrace;
        return this;
    }

    public UnitConfig withTerminationGrace(Consumer<TerminationGrace> terminationGraceSetter) {
        if (this.terminationGrace == null) {
            this.terminationGrace = new TerminationGrace();
            terminationGraceSetter.accept(this.terminationGrace);
        }

        return this;
    }

    /**
     * Get terminationGrace
     * @return terminationGrace
     */
    public TerminationGrace getTerminationGrace() {
        return terminationGrace;
    }

    public void setTerminationGrace(TerminationGrace terminationGrace) {
        this.terminationGrace = terminationGrace;
    }

    public UnitConfig withEnvs(Map<String, String> envs) {
        this.envs = envs;
        return this;
    }

    public UnitConfig putEnvsItem(String key, String envsItem) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        this.envs.put(key, envsItem);
        return this;
    }

    public UnitConfig withEnvs(Consumer<Map<String, String>> envsSetter) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * **参数解释：** 环境变量。 **约束限制：** 变量键长度不大于64，由字母、数字、下划线、中划线、点组成，不能以数字开头。值的输入内容不能存在HTML标签，包括<^>。
     * @return envs
     */
    public Map<String, String> getEnvs() {
        return envs;
    }

    public void setEnvs(Map<String, String> envs) {
        this.envs = envs;
    }

    public UnitConfig withReadinessHealth(Health readinessHealth) {
        this.readinessHealth = readinessHealth;
        return this;
    }

    public UnitConfig withReadinessHealth(Consumer<Health> readinessHealthSetter) {
        if (this.readinessHealth == null) {
            this.readinessHealth = new Health();
            readinessHealthSetter.accept(this.readinessHealth);
        }

        return this;
    }

    /**
     * Get readinessHealth
     * @return readinessHealth
     */
    public Health getReadinessHealth() {
        return readinessHealth;
    }

    public void setReadinessHealth(Health readinessHealth) {
        this.readinessHealth = readinessHealth;
    }

    public UnitConfig withStartupHealth(Health startupHealth) {
        this.startupHealth = startupHealth;
        return this;
    }

    public UnitConfig withStartupHealth(Consumer<Health> startupHealthSetter) {
        if (this.startupHealth == null) {
            this.startupHealth = new Health();
            startupHealthSetter.accept(this.startupHealth);
        }

        return this;
    }

    /**
     * Get startupHealth
     * @return startupHealth
     */
    public Health getStartupHealth() {
        return startupHealth;
    }

    public void setStartupHealth(Health startupHealth) {
        this.startupHealth = startupHealth;
    }

    public UnitConfig withLivenessHealth(Health livenessHealth) {
        this.livenessHealth = livenessHealth;
        return this;
    }

    public UnitConfig withLivenessHealth(Consumer<Health> livenessHealthSetter) {
        if (this.livenessHealth == null) {
            this.livenessHealth = new Health();
            livenessHealthSetter.accept(this.livenessHealth);
        }

        return this;
    }

    /**
     * Get livenessHealth
     * @return livenessHealth
     */
    public Health getLivenessHealth() {
        return livenessHealth;
    }

    public void setLivenessHealth(Health livenessHealth) {
        this.livenessHealth = livenessHealth;
    }

    public UnitConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 端口。 **约束限制：** 不涉及。 **取值范围：** [1,65535]。 **默认取值：** 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UnitConfig withRecovery(String recovery) {
        this.recovery = recovery;
        return this;
    }

    /**
     * **参数解释：** 自动重建策略，开启后，由于部署配置变更或者故障等原因导致Pod重启时，平台将按策略自动执行重建。若不开启，平台将不会主动干预处理。 **约束限制：** 不涉及。 **取值范围：** - Instance：部署副本重建，故障时重新拉起整个部署。 - Role：单元重建，当部署单元内的Pod出现故障时，重启该单元内的所有Pod。 - Pod：Pod重建，故障时重新拉起故障pod。 **默认取值：** 不涉及。
     * @return recovery
     */
    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public UnitConfig withNpuResetEnable(Boolean npuResetEnable) {
        this.npuResetEnable = npuResetEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启恢复策略。 **约束限制：** 不涉及。 **取值范围：** - true：开启恢复策略。 - false：不开启恢复策略。 **默认取值：** 不涉及。
     * @return npuResetEnable
     */
    public Boolean getNpuResetEnable() {
        return npuResetEnable;
    }

    public void setNpuResetEnable(Boolean npuResetEnable) {
        this.npuResetEnable = npuResetEnable;
    }

    public UnitConfig withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    /**
     * **参数解释：** 单元副本数，当部署类型deploy_type为SINGLE或工作负载类型workload_type为DEPLOYMENT时，该参数无效。 **约束限制：** 不涉及。 **取值范围：** [1, 100] 或者为空。 **默认取值：** 默认值为1。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    public UnitConfig withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public UnitConfig withAffinity(Consumer<Affinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new Affinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public UnitConfig withSecurityConfig(ServiceSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    public UnitConfig withSecurityConfig(Consumer<ServiceSecurityConfig> securityConfigSetter) {
        if (this.securityConfig == null) {
            this.securityConfig = new ServiceSecurityConfig();
            securityConfigSetter.accept(this.securityConfig);
        }

        return this;
    }

    /**
     * Get securityConfig
     * @return securityConfig
     */
    public ServiceSecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    public void setSecurityConfig(ServiceSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    public UnitConfig withPoolResourceFlavor(String poolResourceFlavor) {
        this.poolResourceFlavor = poolResourceFlavor;
        return this;
    }

    /**
     * **参数解释：** 节点池资源规格。 **约束限制：** 只能包含字母、数字、点、中划线和下划线。 **取值范围：** 长度不超过128字符。 **默认取值：** 不涉及。
     * @return poolResourceFlavor
     */
    public String getPoolResourceFlavor() {
        return poolResourceFlavor;
    }

    public void setPoolResourceFlavor(String poolResourceFlavor) {
        this.poolResourceFlavor = poolResourceFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnitConfig that = (UnitConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.role, that.role) && Objects.equals(this.customSpec, that.customSpec)
            && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.flavorDisplayName, that.flavorDisplayName) && Objects.equals(this.image, that.image)
            && Objects.equals(this.models, that.models) && Objects.equals(this.codes, that.codes)
            && Objects.equals(this.files, that.files) && Objects.equals(this.dumps, that.dumps)
            && Objects.equals(this.count, that.count) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.terminationGrace, that.terminationGrace) && Objects.equals(this.envs, that.envs)
            && Objects.equals(this.readinessHealth, that.readinessHealth)
            && Objects.equals(this.startupHealth, that.startupHealth)
            && Objects.equals(this.livenessHealth, that.livenessHealth) && Objects.equals(this.port, that.port)
            && Objects.equals(this.recovery, that.recovery) && Objects.equals(this.npuResetEnable, that.npuResetEnable)
            && Objects.equals(this.groupCount, that.groupCount) && Objects.equals(this.affinity, that.affinity)
            && Objects.equals(this.securityConfig, that.securityConfig)
            && Objects.equals(this.poolResourceFlavor, that.poolResourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            role,
            customSpec,
            flavor,
            flavorDisplayName,
            image,
            models,
            codes,
            files,
            dumps,
            count,
            cmd,
            terminationGrace,
            envs,
            readinessHealth,
            startupHealth,
            livenessHealth,
            port,
            recovery,
            npuResetEnable,
            groupCount,
            affinity,
            securityConfig,
            poolResourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnitConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    flavorDisplayName: ").append(toIndentedString(flavorDisplayName)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    dumps: ").append(toIndentedString(dumps)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    terminationGrace: ").append(toIndentedString(terminationGrace)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    readinessHealth: ").append(toIndentedString(readinessHealth)).append("\n");
        sb.append("    startupHealth: ").append(toIndentedString(startupHealth)).append("\n");
        sb.append("    livenessHealth: ").append(toIndentedString(livenessHealth)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
        sb.append("    npuResetEnable: ").append(toIndentedString(npuResetEnable)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    securityConfig: ").append(toIndentedString(securityConfig)).append("\n");
        sb.append("    poolResourceFlavor: ").append(toIndentedString(poolResourceFlavor)).append("\n");
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
