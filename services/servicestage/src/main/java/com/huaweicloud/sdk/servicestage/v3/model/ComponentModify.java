package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentModify
 */
public class ComponentModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<Label> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_stack")

    private RuntimeStack runtimeStack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceObject source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_cpu")

    private BigDecimal limitCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_memory")

    private BigDecimal limitMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_cpu")

    private BigDecimal requestCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_memory")

    private BigDecimal requestMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swimlane_id")

    private String swimlaneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<ComponentEnvironment> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<ComponentStorage> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_strategy")

    private DeployStrategy deployStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private ComponentCommand command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_start")

    private ComponentLifecycle postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_stop")

    private ComponentLifecycle preStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mesher")

    private Mesher mesher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jvm_opts")

    private String jvmOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tomcat_opts")

    private ComponentModifyTomcatOpts tomcatOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<ComponentLogs> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metric")

    private ComponentModifyCustomMetric customMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private ComponentAffinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_affinity")

    private ComponentAffinity antiAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private ComponentProbe livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private ComponentProbe readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_accesses")

    private List<ExternalAccesses> externalAccesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer_resources")

    private List<ReferResourceCreate> referResources = null;

    public ComponentModify withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentModify withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentModify withLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    public ComponentModify addLabelsItem(Label labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ComponentModify withLabels(Consumer<List<Label>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public ComponentModify withRuntimeStack(RuntimeStack runtimeStack) {
        this.runtimeStack = runtimeStack;
        return this;
    }

    public ComponentModify withRuntimeStack(Consumer<RuntimeStack> runtimeStackSetter) {
        if (this.runtimeStack == null) {
            this.runtimeStack = new RuntimeStack();
            runtimeStackSetter.accept(this.runtimeStack);
        }

        return this;
    }

    /**
     * Get runtimeStack
     * @return runtimeStack
     */
    public RuntimeStack getRuntimeStack() {
        return runtimeStack;
    }

    public void setRuntimeStack(RuntimeStack runtimeStack) {
        this.runtimeStack = runtimeStack;
    }

    public ComponentModify withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public ComponentModify withSource(Consumer<SourceObject> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceObject();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceObject getSource() {
        return source;
    }

    public void setSource(SourceObject source) {
        this.source = source;
    }

    public ComponentModify withBuild(Build build) {
        this.build = build;
        return this;
    }

    public ComponentModify withBuild(Consumer<Build> buildSetter) {
        if (this.build == null) {
            this.build = new Build();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public ComponentModify withLimitCpu(BigDecimal limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }

    /**
     * 单位为Core
     * @return limitCpu
     */
    public BigDecimal getLimitCpu() {
        return limitCpu;
    }

    public void setLimitCpu(BigDecimal limitCpu) {
        this.limitCpu = limitCpu;
    }

    public ComponentModify withLimitMemory(BigDecimal limitMemory) {
        this.limitMemory = limitMemory;
        return this;
    }

    /**
     * 单位为GiB
     * @return limitMemory
     */
    public BigDecimal getLimitMemory() {
        return limitMemory;
    }

    public void setLimitMemory(BigDecimal limitMemory) {
        this.limitMemory = limitMemory;
    }

    public ComponentModify withRequestCpu(BigDecimal requestCpu) {
        this.requestCpu = requestCpu;
        return this;
    }

    /**
     * 单位为Core
     * @return requestCpu
     */
    public BigDecimal getRequestCpu() {
        return requestCpu;
    }

    public void setRequestCpu(BigDecimal requestCpu) {
        this.requestCpu = requestCpu;
    }

    public ComponentModify withRequestMemory(BigDecimal requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }

    /**
     * 单位为GiB
     * @return requestMemory
     */
    public BigDecimal getRequestMemory() {
        return requestMemory;
    }

    public void setRequestMemory(BigDecimal requestMemory) {
        this.requestMemory = requestMemory;
    }

    public ComponentModify withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * Get replica
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public ComponentModify withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentModify withSwimlaneId(String swimlaneId) {
        this.swimlaneId = swimlaneId;
        return this;
    }

    /**
     * 泳道id
     * @return swimlaneId
     */
    public String getSwimlaneId() {
        return swimlaneId;
    }

    public void setSwimlaneId(String swimlaneId) {
        this.swimlaneId = swimlaneId;
    }

    public ComponentModify withEnvs(List<ComponentEnvironment> envs) {
        this.envs = envs;
        return this;
    }

    public ComponentModify addEnvsItem(ComponentEnvironment envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ComponentModify withEnvs(Consumer<List<ComponentEnvironment>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * Get envs
     * @return envs
     */
    public List<ComponentEnvironment> getEnvs() {
        return envs;
    }

    public void setEnvs(List<ComponentEnvironment> envs) {
        this.envs = envs;
    }

    public ComponentModify withStorages(List<ComponentStorage> storages) {
        this.storages = storages;
        return this;
    }

    public ComponentModify addStoragesItem(ComponentStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public ComponentModify withStorages(Consumer<List<ComponentStorage>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * Get storages
     * @return storages
     */
    public List<ComponentStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<ComponentStorage> storages) {
        this.storages = storages;
    }

    public ComponentModify withDeployStrategy(DeployStrategy deployStrategy) {
        this.deployStrategy = deployStrategy;
        return this;
    }

    public ComponentModify withDeployStrategy(Consumer<DeployStrategy> deployStrategySetter) {
        if (this.deployStrategy == null) {
            this.deployStrategy = new DeployStrategy();
            deployStrategySetter.accept(this.deployStrategy);
        }

        return this;
    }

    /**
     * Get deployStrategy
     * @return deployStrategy
     */
    public DeployStrategy getDeployStrategy() {
        return deployStrategy;
    }

    public void setDeployStrategy(DeployStrategy deployStrategy) {
        this.deployStrategy = deployStrategy;
    }

    public ComponentModify withCommand(ComponentCommand command) {
        this.command = command;
        return this;
    }

    public ComponentModify withCommand(Consumer<ComponentCommand> commandSetter) {
        if (this.command == null) {
            this.command = new ComponentCommand();
            commandSetter.accept(this.command);
        }

        return this;
    }

    /**
     * Get command
     * @return command
     */
    public ComponentCommand getCommand() {
        return command;
    }

    public void setCommand(ComponentCommand command) {
        this.command = command;
    }

    public ComponentModify withPostStart(ComponentLifecycle postStart) {
        this.postStart = postStart;
        return this;
    }

    public ComponentModify withPostStart(Consumer<ComponentLifecycle> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new ComponentLifecycle();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public ComponentLifecycle getPostStart() {
        return postStart;
    }

    public void setPostStart(ComponentLifecycle postStart) {
        this.postStart = postStart;
    }

    public ComponentModify withPreStop(ComponentLifecycle preStop) {
        this.preStop = preStop;
        return this;
    }

    public ComponentModify withPreStop(Consumer<ComponentLifecycle> preStopSetter) {
        if (this.preStop == null) {
            this.preStop = new ComponentLifecycle();
            preStopSetter.accept(this.preStop);
        }

        return this;
    }

    /**
     * Get preStop
     * @return preStop
     */
    public ComponentLifecycle getPreStop() {
        return preStop;
    }

    public void setPreStop(ComponentLifecycle preStop) {
        this.preStop = preStop;
    }

    public ComponentModify withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 指定组件运行的时区，比如Asia/Shanghai
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ComponentModify withMesher(Mesher mesher) {
        this.mesher = mesher;
        return this;
    }

    public ComponentModify withMesher(Consumer<Mesher> mesherSetter) {
        if (this.mesher == null) {
            this.mesher = new Mesher();
            mesherSetter.accept(this.mesher);
        }

        return this;
    }

    /**
     * Get mesher
     * @return mesher
     */
    public Mesher getMesher() {
        return mesher;
    }

    public void setMesher(Mesher mesher) {
        this.mesher = mesher;
    }

    public ComponentModify withJvmOpts(String jvmOpts) {
        this.jvmOpts = jvmOpts;
        return this;
    }

    /**
     * jvm参数
     * @return jvmOpts
     */
    public String getJvmOpts() {
        return jvmOpts;
    }

    public void setJvmOpts(String jvmOpts) {
        this.jvmOpts = jvmOpts;
    }

    public ComponentModify withTomcatOpts(ComponentModifyTomcatOpts tomcatOpts) {
        this.tomcatOpts = tomcatOpts;
        return this;
    }

    public ComponentModify withTomcatOpts(Consumer<ComponentModifyTomcatOpts> tomcatOptsSetter) {
        if (this.tomcatOpts == null) {
            this.tomcatOpts = new ComponentModifyTomcatOpts();
            tomcatOptsSetter.accept(this.tomcatOpts);
        }

        return this;
    }

    /**
     * Get tomcatOpts
     * @return tomcatOpts
     */
    public ComponentModifyTomcatOpts getTomcatOpts() {
        return tomcatOpts;
    }

    public void setTomcatOpts(ComponentModifyTomcatOpts tomcatOpts) {
        this.tomcatOpts = tomcatOpts;
    }

    public ComponentModify withLogs(List<ComponentLogs> logs) {
        this.logs = logs;
        return this;
    }

    public ComponentModify addLogsItem(ComponentLogs logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ComponentModify withLogs(Consumer<List<ComponentLogs>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * Get logs
     * @return logs
     */
    public List<ComponentLogs> getLogs() {
        return logs;
    }

    public void setLogs(List<ComponentLogs> logs) {
        this.logs = logs;
    }

    public ComponentModify withCustomMetric(ComponentModifyCustomMetric customMetric) {
        this.customMetric = customMetric;
        return this;
    }

    public ComponentModify withCustomMetric(Consumer<ComponentModifyCustomMetric> customMetricSetter) {
        if (this.customMetric == null) {
            this.customMetric = new ComponentModifyCustomMetric();
            customMetricSetter.accept(this.customMetric);
        }

        return this;
    }

    /**
     * Get customMetric
     * @return customMetric
     */
    public ComponentModifyCustomMetric getCustomMetric() {
        return customMetric;
    }

    public void setCustomMetric(ComponentModifyCustomMetric customMetric) {
        this.customMetric = customMetric;
    }

    public ComponentModify withAffinity(ComponentAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public ComponentModify withAffinity(Consumer<ComponentAffinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new ComponentAffinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public ComponentAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(ComponentAffinity affinity) {
        this.affinity = affinity;
    }

    public ComponentModify withAntiAffinity(ComponentAffinity antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }

    public ComponentModify withAntiAffinity(Consumer<ComponentAffinity> antiAffinitySetter) {
        if (this.antiAffinity == null) {
            this.antiAffinity = new ComponentAffinity();
            antiAffinitySetter.accept(this.antiAffinity);
        }

        return this;
    }

    /**
     * Get antiAffinity
     * @return antiAffinity
     */
    public ComponentAffinity getAntiAffinity() {
        return antiAffinity;
    }

    public void setAntiAffinity(ComponentAffinity antiAffinity) {
        this.antiAffinity = antiAffinity;
    }

    public ComponentModify withLivenessProbe(ComponentProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ComponentModify withLivenessProbe(Consumer<ComponentProbe> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new ComponentProbe();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public ComponentProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(ComponentProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public ComponentModify withReadinessProbe(ComponentProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ComponentModify withReadinessProbe(Consumer<ComponentProbe> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new ComponentProbe();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public ComponentProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(ComponentProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ComponentModify withExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
        return this;
    }

    public ComponentModify addExternalAccessesItem(ExternalAccesses externalAccessesItem) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        this.externalAccesses.add(externalAccessesItem);
        return this;
    }

    public ComponentModify withExternalAccesses(Consumer<List<ExternalAccesses>> externalAccessesSetter) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        externalAccessesSetter.accept(this.externalAccesses);
        return this;
    }

    /**
     * Get externalAccesses
     * @return externalAccesses
     */
    public List<ExternalAccesses> getExternalAccesses() {
        return externalAccesses;
    }

    public void setExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
    }

    public ComponentModify withReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
        return this;
    }

    public ComponentModify addReferResourcesItem(ReferResourceCreate referResourcesItem) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        this.referResources.add(referResourcesItem);
        return this;
    }

    public ComponentModify withReferResources(Consumer<List<ReferResourceCreate>> referResourcesSetter) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        referResourcesSetter.accept(this.referResources);
        return this;
    }

    /**
     * Get referResources
     * @return referResources
     */
    public List<ReferResourceCreate> getReferResources() {
        return referResources;
    }

    public void setReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentModify that = (ComponentModify) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.runtimeStack, that.runtimeStack)
            && Objects.equals(this.source, that.source) && Objects.equals(this.build, that.build)
            && Objects.equals(this.limitCpu, that.limitCpu) && Objects.equals(this.limitMemory, that.limitMemory)
            && Objects.equals(this.requestCpu, that.requestCpu)
            && Objects.equals(this.requestMemory, that.requestMemory) && Objects.equals(this.replica, that.replica)
            && Objects.equals(this.version, that.version) && Objects.equals(this.swimlaneId, that.swimlaneId)
            && Objects.equals(this.envs, that.envs) && Objects.equals(this.storages, that.storages)
            && Objects.equals(this.deployStrategy, that.deployStrategy) && Objects.equals(this.command, that.command)
            && Objects.equals(this.postStart, that.postStart) && Objects.equals(this.preStop, that.preStop)
            && Objects.equals(this.timezone, that.timezone) && Objects.equals(this.mesher, that.mesher)
            && Objects.equals(this.jvmOpts, that.jvmOpts) && Objects.equals(this.tomcatOpts, that.tomcatOpts)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.customMetric, that.customMetric)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.antiAffinity, that.antiAffinity)
            && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe)
            && Objects.equals(this.externalAccesses, that.externalAccesses)
            && Objects.equals(this.referResources, that.referResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            labels,
            runtimeStack,
            source,
            build,
            limitCpu,
            limitMemory,
            requestCpu,
            requestMemory,
            replica,
            version,
            swimlaneId,
            envs,
            storages,
            deployStrategy,
            command,
            postStart,
            preStop,
            timezone,
            mesher,
            jvmOpts,
            tomcatOpts,
            logs,
            customMetric,
            affinity,
            antiAffinity,
            livenessProbe,
            readinessProbe,
            externalAccesses,
            referResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentModify {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    runtimeStack: ").append(toIndentedString(runtimeStack)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    limitCpu: ").append(toIndentedString(limitCpu)).append("\n");
        sb.append("    limitMemory: ").append(toIndentedString(limitMemory)).append("\n");
        sb.append("    requestCpu: ").append(toIndentedString(requestCpu)).append("\n");
        sb.append("    requestMemory: ").append(toIndentedString(requestMemory)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    swimlaneId: ").append(toIndentedString(swimlaneId)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    deployStrategy: ").append(toIndentedString(deployStrategy)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    mesher: ").append(toIndentedString(mesher)).append("\n");
        sb.append("    jvmOpts: ").append(toIndentedString(jvmOpts)).append("\n");
        sb.append("    tomcatOpts: ").append(toIndentedString(tomcatOpts)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    customMetric: ").append(toIndentedString(customMetric)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    externalAccesses: ").append(toIndentedString(externalAccesses)).append("\n");
        sb.append("    referResources: ").append(toIndentedString(referResources)).append("\n");
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
