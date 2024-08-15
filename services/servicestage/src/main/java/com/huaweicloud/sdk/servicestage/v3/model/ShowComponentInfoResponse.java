package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowComponentInfoResponse extends SdkResponse {

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
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

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
    @JsonProperty(value = "deploy_strategy")

    private DeployStrategy deployStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jvm_opts")

    private String jvmOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tomcat_opts")

    private ComponentInfoTomcatOpts tomcatOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<ComponentLogs> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metric")

    private ComponentInfoCustomMetric customMetric;

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
    @JsonProperty(value = "refer_resources")

    private List<ReferResourceCreate> referResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ComponentStatusView status;

    public ShowComponentInfoResponse withName(String name) {
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

    public ShowComponentInfoResponse withDescription(String description) {
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

    public ShowComponentInfoResponse withLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    public ShowComponentInfoResponse addLabelsItem(Label labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowComponentInfoResponse withLabels(Consumer<List<Label>> labelsSetter) {
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

    public ShowComponentInfoResponse withRuntimeStack(RuntimeStack runtimeStack) {
        this.runtimeStack = runtimeStack;
        return this;
    }

    public ShowComponentInfoResponse withRuntimeStack(Consumer<RuntimeStack> runtimeStackSetter) {
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

    public ShowComponentInfoResponse withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public ShowComponentInfoResponse withSource(Consumer<SourceObject> sourceSetter) {
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

    public ShowComponentInfoResponse withBuild(Build build) {
        this.build = build;
        return this;
    }

    public ShowComponentInfoResponse withBuild(Consumer<Build> buildSetter) {
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

    public ShowComponentInfoResponse withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get environmentId
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ShowComponentInfoResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get applicationId
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ShowComponentInfoResponse withLimitCpu(BigDecimal limitCpu) {
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

    public ShowComponentInfoResponse withLimitMemory(BigDecimal limitMemory) {
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

    public ShowComponentInfoResponse withRequestCpu(BigDecimal requestCpu) {
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

    public ShowComponentInfoResponse withRequestMemory(BigDecimal requestMemory) {
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

    public ShowComponentInfoResponse withReplica(Integer replica) {
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

    public ShowComponentInfoResponse withVersion(String version) {
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

    public ShowComponentInfoResponse withSwimlaneId(String swimlaneId) {
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

    public ShowComponentInfoResponse withEnvs(List<ComponentEnvironment> envs) {
        this.envs = envs;
        return this;
    }

    public ShowComponentInfoResponse addEnvsItem(ComponentEnvironment envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ShowComponentInfoResponse withEnvs(Consumer<List<ComponentEnvironment>> envsSetter) {
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

    public ShowComponentInfoResponse withStorages(List<ComponentStorage> storages) {
        this.storages = storages;
        return this;
    }

    public ShowComponentInfoResponse addStoragesItem(ComponentStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public ShowComponentInfoResponse withStorages(Consumer<List<ComponentStorage>> storagesSetter) {
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

    public ShowComponentInfoResponse withCommand(ComponentCommand command) {
        this.command = command;
        return this;
    }

    public ShowComponentInfoResponse withCommand(Consumer<ComponentCommand> commandSetter) {
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

    public ShowComponentInfoResponse withPostStart(ComponentLifecycle postStart) {
        this.postStart = postStart;
        return this;
    }

    public ShowComponentInfoResponse withPostStart(Consumer<ComponentLifecycle> postStartSetter) {
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

    public ShowComponentInfoResponse withPreStop(ComponentLifecycle preStop) {
        this.preStop = preStop;
        return this;
    }

    public ShowComponentInfoResponse withPreStop(Consumer<ComponentLifecycle> preStopSetter) {
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

    public ShowComponentInfoResponse withTimezone(String timezone) {
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

    public ShowComponentInfoResponse withMesher(Mesher mesher) {
        this.mesher = mesher;
        return this;
    }

    public ShowComponentInfoResponse withMesher(Consumer<Mesher> mesherSetter) {
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

    public ShowComponentInfoResponse withDeployStrategy(DeployStrategy deployStrategy) {
        this.deployStrategy = deployStrategy;
        return this;
    }

    public ShowComponentInfoResponse withDeployStrategy(Consumer<DeployStrategy> deployStrategySetter) {
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

    public ShowComponentInfoResponse withJvmOpts(String jvmOpts) {
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

    public ShowComponentInfoResponse withTomcatOpts(ComponentInfoTomcatOpts tomcatOpts) {
        this.tomcatOpts = tomcatOpts;
        return this;
    }

    public ShowComponentInfoResponse withTomcatOpts(Consumer<ComponentInfoTomcatOpts> tomcatOptsSetter) {
        if (this.tomcatOpts == null) {
            this.tomcatOpts = new ComponentInfoTomcatOpts();
            tomcatOptsSetter.accept(this.tomcatOpts);
        }

        return this;
    }

    /**
     * Get tomcatOpts
     * @return tomcatOpts
     */
    public ComponentInfoTomcatOpts getTomcatOpts() {
        return tomcatOpts;
    }

    public void setTomcatOpts(ComponentInfoTomcatOpts tomcatOpts) {
        this.tomcatOpts = tomcatOpts;
    }

    public ShowComponentInfoResponse withLogs(List<ComponentLogs> logs) {
        this.logs = logs;
        return this;
    }

    public ShowComponentInfoResponse addLogsItem(ComponentLogs logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ShowComponentInfoResponse withLogs(Consumer<List<ComponentLogs>> logsSetter) {
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

    public ShowComponentInfoResponse withCustomMetric(ComponentInfoCustomMetric customMetric) {
        this.customMetric = customMetric;
        return this;
    }

    public ShowComponentInfoResponse withCustomMetric(Consumer<ComponentInfoCustomMetric> customMetricSetter) {
        if (this.customMetric == null) {
            this.customMetric = new ComponentInfoCustomMetric();
            customMetricSetter.accept(this.customMetric);
        }

        return this;
    }

    /**
     * Get customMetric
     * @return customMetric
     */
    public ComponentInfoCustomMetric getCustomMetric() {
        return customMetric;
    }

    public void setCustomMetric(ComponentInfoCustomMetric customMetric) {
        this.customMetric = customMetric;
    }

    public ShowComponentInfoResponse withAffinity(ComponentAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public ShowComponentInfoResponse withAffinity(Consumer<ComponentAffinity> affinitySetter) {
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

    public ShowComponentInfoResponse withAntiAffinity(ComponentAffinity antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }

    public ShowComponentInfoResponse withAntiAffinity(Consumer<ComponentAffinity> antiAffinitySetter) {
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

    public ShowComponentInfoResponse withLivenessProbe(ComponentProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ShowComponentInfoResponse withLivenessProbe(Consumer<ComponentProbe> livenessProbeSetter) {
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

    public ShowComponentInfoResponse withReadinessProbe(ComponentProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ShowComponentInfoResponse withReadinessProbe(Consumer<ComponentProbe> readinessProbeSetter) {
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

    public ShowComponentInfoResponse withReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
        return this;
    }

    public ShowComponentInfoResponse addReferResourcesItem(ReferResourceCreate referResourcesItem) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        this.referResources.add(referResourcesItem);
        return this;
    }

    public ShowComponentInfoResponse withReferResources(Consumer<List<ReferResourceCreate>> referResourcesSetter) {
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

    public ShowComponentInfoResponse withStatus(ComponentStatusView status) {
        this.status = status;
        return this;
    }

    public ShowComponentInfoResponse withStatus(Consumer<ComponentStatusView> statusSetter) {
        if (this.status == null) {
            this.status = new ComponentStatusView();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ComponentStatusView getStatus() {
        return status;
    }

    public void setStatus(ComponentStatusView status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComponentInfoResponse that = (ShowComponentInfoResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.runtimeStack, that.runtimeStack)
            && Objects.equals(this.source, that.source) && Objects.equals(this.build, that.build)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.limitCpu, that.limitCpu)
            && Objects.equals(this.limitMemory, that.limitMemory) && Objects.equals(this.requestCpu, that.requestCpu)
            && Objects.equals(this.requestMemory, that.requestMemory) && Objects.equals(this.replica, that.replica)
            && Objects.equals(this.version, that.version) && Objects.equals(this.swimlaneId, that.swimlaneId)
            && Objects.equals(this.envs, that.envs) && Objects.equals(this.storages, that.storages)
            && Objects.equals(this.command, that.command) && Objects.equals(this.postStart, that.postStart)
            && Objects.equals(this.preStop, that.preStop) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.mesher, that.mesher) && Objects.equals(this.deployStrategy, that.deployStrategy)
            && Objects.equals(this.jvmOpts, that.jvmOpts) && Objects.equals(this.tomcatOpts, that.tomcatOpts)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.customMetric, that.customMetric)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.antiAffinity, that.antiAffinity)
            && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe)
            && Objects.equals(this.referResources, that.referResources) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            labels,
            runtimeStack,
            source,
            build,
            environmentId,
            applicationId,
            limitCpu,
            limitMemory,
            requestCpu,
            requestMemory,
            replica,
            version,
            swimlaneId,
            envs,
            storages,
            command,
            postStart,
            preStop,
            timezone,
            mesher,
            deployStrategy,
            jvmOpts,
            tomcatOpts,
            logs,
            customMetric,
            affinity,
            antiAffinity,
            livenessProbe,
            readinessProbe,
            referResources,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentInfoResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    runtimeStack: ").append(toIndentedString(runtimeStack)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    limitCpu: ").append(toIndentedString(limitCpu)).append("\n");
        sb.append("    limitMemory: ").append(toIndentedString(limitMemory)).append("\n");
        sb.append("    requestCpu: ").append(toIndentedString(requestCpu)).append("\n");
        sb.append("    requestMemory: ").append(toIndentedString(requestMemory)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    swimlaneId: ").append(toIndentedString(swimlaneId)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    mesher: ").append(toIndentedString(mesher)).append("\n");
        sb.append("    deployStrategy: ").append(toIndentedString(deployStrategy)).append("\n");
        sb.append("    jvmOpts: ").append(toIndentedString(jvmOpts)).append("\n");
        sb.append("    tomcatOpts: ").append(toIndentedString(tomcatOpts)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    customMetric: ").append(toIndentedString(customMetric)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    referResources: ").append(toIndentedString(referResources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
