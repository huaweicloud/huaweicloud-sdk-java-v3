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
 * **参数解释：** 推理单元配置。
 */
public class UnitConfigResponse {

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
    @JsonProperty(value = "image")

    private ImageInfoResponse image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<InferModelResponse> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<FileResponse> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codes")

    private List<CodeResponse> codes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dumps")

    private List<DumpResponse> dumps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_count")

    private Integer groupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private Map<String, String> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_health")

    private HealthResponse readinessHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_health")

    private HealthResponse startupHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_health")

    private HealthResponse livenessHealth;

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
    @JsonProperty(value = "affinity")

    private AffinityResponse affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_display_name")

    private String flavorDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "termination_grace")

    private TerminationGrace terminationGrace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config")

    private ServiceSecurityConfig securityConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_resource_flavor")

    private String poolResourceFlavor;

    public UnitConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 实例单元ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnitConfigResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例单元名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitConfigResponse withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 实例单元角色。 **取值范围：** - COMMON：表示其他角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UnitConfigResponse withCustomSpec(CustomResourceSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public UnitConfigResponse withCustomSpec(Consumer<CustomResourceSpec> customSpecSetter) {
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

    public UnitConfigResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释：** 资源规格，根据所提供版本选择适合业务的规格。当specification为custom时表示自定义规格。由custom_spec指定部署的规格配置。 **取值范围：** 不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public UnitConfigResponse withImage(ImageInfoResponse image) {
        this.image = image;
        return this;
    }

    public UnitConfigResponse withImage(Consumer<ImageInfoResponse> imageSetter) {
        if (this.image == null) {
            this.image = new ImageInfoResponse();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ImageInfoResponse getImage() {
        return image;
    }

    public void setImage(ImageInfoResponse image) {
        this.image = image;
    }

    public UnitConfigResponse withModels(List<InferModelResponse> models) {
        this.models = models;
        return this;
    }

    public UnitConfigResponse addModelsItem(InferModelResponse modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public UnitConfigResponse withModels(Consumer<List<InferModelResponse>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * **参数解释：** 模型相关配置，用户可以在此处选择模型及权重文件配合镜像使用。
     * @return models
     */
    public List<InferModelResponse> getModels() {
        return models;
    }

    public void setModels(List<InferModelResponse> models) {
        this.models = models;
    }

    public UnitConfigResponse withFiles(List<FileResponse> files) {
        this.files = files;
        return this;
    }

    public UnitConfigResponse addFilesItem(FileResponse filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public UnitConfigResponse withFiles(Consumer<List<FileResponse>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释：** 模型和代码相关配置，用户可以在此处选择模型及权重文件配合镜像使用以及代码所在的obs路径等。
     * @return files
     */
    public List<FileResponse> getFiles() {
        return files;
    }

    public void setFiles(List<FileResponse> files) {
        this.files = files;
    }

    public UnitConfigResponse withCodes(List<CodeResponse> codes) {
        this.codes = codes;
        return this;
    }

    public UnitConfigResponse addCodesItem(CodeResponse codesItem) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        this.codes.add(codesItem);
        return this;
    }

    public UnitConfigResponse withCodes(Consumer<List<CodeResponse>> codesSetter) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        codesSetter.accept(this.codes);
        return this;
    }

    /**
     * **参数解释：** 代码相关配置，用户可以在此处选择代码所在的obs路径等。
     * @return codes
     */
    public List<CodeResponse> getCodes() {
        return codes;
    }

    public void setCodes(List<CodeResponse> codes) {
        this.codes = codes;
    }

    public UnitConfigResponse withDumps(List<DumpResponse> dumps) {
        this.dumps = dumps;
        return this;
    }

    public UnitConfigResponse addDumpsItem(DumpResponse dumpsItem) {
        if (this.dumps == null) {
            this.dumps = new ArrayList<>();
        }
        this.dumps.add(dumpsItem);
        return this;
    }

    public UnitConfigResponse withDumps(Consumer<List<DumpResponse>> dumpsSetter) {
        if (this.dumps == null) {
            this.dumps = new ArrayList<>();
        }
        dumpsSetter.accept(this.dumps);
        return this;
    }

    /**
     * **参数解释：** 转储相关配置，用户可以在此处选择转储的目的obs路径等。
     * @return dumps
     */
    public List<DumpResponse> getDumps() {
        return dumps;
    }

    public void setDumps(List<DumpResponse> dumps) {
        this.dumps = dumps;
    }

    public UnitConfigResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 配置实例个数。 **取值范围：** 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public UnitConfigResponse withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    /**
     * **参数解释：** 单元副本数，当部署类型deploy_type为SINGLE或工作负载类型workload_type为DEPLOYMENT时，该参数无效。 **取值范围：** [1, 100] 或者为空。 **默认取值：** 默认值为1。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    public UnitConfigResponse withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * **参数解释：** 启动命令。 **取值范围：** 不涉及。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public UnitConfigResponse withEnvs(Map<String, String> envs) {
        this.envs = envs;
        return this;
    }

    public UnitConfigResponse putEnvsItem(String key, String envsItem) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        this.envs.put(key, envsItem);
        return this;
    }

    public UnitConfigResponse withEnvs(Consumer<Map<String, String>> envsSetter) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * **参数解释：** 环境变量。
     * @return envs
     */
    public Map<String, String> getEnvs() {
        return envs;
    }

    public void setEnvs(Map<String, String> envs) {
        this.envs = envs;
    }

    public UnitConfigResponse withReadinessHealth(HealthResponse readinessHealth) {
        this.readinessHealth = readinessHealth;
        return this;
    }

    public UnitConfigResponse withReadinessHealth(Consumer<HealthResponse> readinessHealthSetter) {
        if (this.readinessHealth == null) {
            this.readinessHealth = new HealthResponse();
            readinessHealthSetter.accept(this.readinessHealth);
        }

        return this;
    }

    /**
     * Get readinessHealth
     * @return readinessHealth
     */
    public HealthResponse getReadinessHealth() {
        return readinessHealth;
    }

    public void setReadinessHealth(HealthResponse readinessHealth) {
        this.readinessHealth = readinessHealth;
    }

    public UnitConfigResponse withStartupHealth(HealthResponse startupHealth) {
        this.startupHealth = startupHealth;
        return this;
    }

    public UnitConfigResponse withStartupHealth(Consumer<HealthResponse> startupHealthSetter) {
        if (this.startupHealth == null) {
            this.startupHealth = new HealthResponse();
            startupHealthSetter.accept(this.startupHealth);
        }

        return this;
    }

    /**
     * Get startupHealth
     * @return startupHealth
     */
    public HealthResponse getStartupHealth() {
        return startupHealth;
    }

    public void setStartupHealth(HealthResponse startupHealth) {
        this.startupHealth = startupHealth;
    }

    public UnitConfigResponse withLivenessHealth(HealthResponse livenessHealth) {
        this.livenessHealth = livenessHealth;
        return this;
    }

    public UnitConfigResponse withLivenessHealth(Consumer<HealthResponse> livenessHealthSetter) {
        if (this.livenessHealth == null) {
            this.livenessHealth = new HealthResponse();
            livenessHealthSetter.accept(this.livenessHealth);
        }

        return this;
    }

    /**
     * Get livenessHealth
     * @return livenessHealth
     */
    public HealthResponse getLivenessHealth() {
        return livenessHealth;
    }

    public void setLivenessHealth(HealthResponse livenessHealth) {
        this.livenessHealth = livenessHealth;
    }

    public UnitConfigResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 端口。 **取值范围：** [1,65535]。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UnitConfigResponse withRecovery(String recovery) {
        this.recovery = recovery;
        return this;
    }

    /**
     * **参数解释：** 自动重建策略，开启后，由于部署配置变更或者故障等原因导致Pod重启时，平台将按策略自动执行重建。若不开启，平台将不会主动干预处理。 **取值范围：** - Instance：部署副本重建，故障时重新拉起整个部署。 - Role：单元重建，当部署单元内的Pod出现故障时，重启该单元内的所有Pod。 - Pod：Pod重建，故障时重新拉起故障pod。
     * @return recovery
     */
    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public UnitConfigResponse withNpuResetEnable(Boolean npuResetEnable) {
        this.npuResetEnable = npuResetEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启恢复策略。 **取值范围：** - true：开启恢复策略。 - false：不开启恢复策略。
     * @return npuResetEnable
     */
    public Boolean getNpuResetEnable() {
        return npuResetEnable;
    }

    public void setNpuResetEnable(Boolean npuResetEnable) {
        this.npuResetEnable = npuResetEnable;
    }

    public UnitConfigResponse withAffinity(AffinityResponse affinity) {
        this.affinity = affinity;
        return this;
    }

    public UnitConfigResponse withAffinity(Consumer<AffinityResponse> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new AffinityResponse();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public AffinityResponse getAffinity() {
        return affinity;
    }

    public void setAffinity(AffinityResponse affinity) {
        this.affinity = affinity;
    }

    public UnitConfigResponse withFlavorDisplayName(String flavorDisplayName) {
        this.flavorDisplayName = flavorDisplayName;
        return this;
    }

    /**
     * **参数解释：** 规格展示名。仅使用切分规格部署的服务返回有此字段。 **取值范围：** 不涉及。
     * @return flavorDisplayName
     */
    public String getFlavorDisplayName() {
        return flavorDisplayName;
    }

    public void setFlavorDisplayName(String flavorDisplayName) {
        this.flavorDisplayName = flavorDisplayName;
    }

    public UnitConfigResponse withTerminationGrace(TerminationGrace terminationGrace) {
        this.terminationGrace = terminationGrace;
        return this;
    }

    public UnitConfigResponse withTerminationGrace(Consumer<TerminationGrace> terminationGraceSetter) {
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

    public UnitConfigResponse withSecurityConfig(ServiceSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    public UnitConfigResponse withSecurityConfig(Consumer<ServiceSecurityConfig> securityConfigSetter) {
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

    public UnitConfigResponse withPoolResourceFlavor(String poolResourceFlavor) {
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
        UnitConfigResponse that = (UnitConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.role, that.role) && Objects.equals(this.customSpec, that.customSpec)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.image, that.image)
            && Objects.equals(this.models, that.models) && Objects.equals(this.files, that.files)
            && Objects.equals(this.codes, that.codes) && Objects.equals(this.dumps, that.dumps)
            && Objects.equals(this.count, that.count) && Objects.equals(this.groupCount, that.groupCount)
            && Objects.equals(this.cmd, that.cmd) && Objects.equals(this.envs, that.envs)
            && Objects.equals(this.readinessHealth, that.readinessHealth)
            && Objects.equals(this.startupHealth, that.startupHealth)
            && Objects.equals(this.livenessHealth, that.livenessHealth) && Objects.equals(this.port, that.port)
            && Objects.equals(this.recovery, that.recovery) && Objects.equals(this.npuResetEnable, that.npuResetEnable)
            && Objects.equals(this.affinity, that.affinity)
            && Objects.equals(this.flavorDisplayName, that.flavorDisplayName)
            && Objects.equals(this.terminationGrace, that.terminationGrace)
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
            image,
            models,
            files,
            codes,
            dumps,
            count,
            groupCount,
            cmd,
            envs,
            readinessHealth,
            startupHealth,
            livenessHealth,
            port,
            recovery,
            npuResetEnable,
            affinity,
            flavorDisplayName,
            terminationGrace,
            securityConfig,
            poolResourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnitConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
        sb.append("    dumps: ").append(toIndentedString(dumps)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    readinessHealth: ").append(toIndentedString(readinessHealth)).append("\n");
        sb.append("    startupHealth: ").append(toIndentedString(startupHealth)).append("\n");
        sb.append("    livenessHealth: ").append(toIndentedString(livenessHealth)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
        sb.append("    npuResetEnable: ").append(toIndentedString(npuResetEnable)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    flavorDisplayName: ").append(toIndentedString(flavorDisplayName)).append("\n");
        sb.append("    terminationGrace: ").append(toIndentedString(terminationGrace)).append("\n");
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
