package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentSpec
 */
public class ComponentSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_replica")

    private Integer availableReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Source source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_info")

    private List<Access> accessInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_strategy")

    private List<LogStrategy> logStrategy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ComponentSpec withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 语言/运行时，例如：Java8、tomcat8。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ComponentSpec withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ComponentSpec withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 副本。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public ComponentSpec withAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
        return this;
    }

    /**
     * 可用副本。
     * @return availableReplica
     */
    public Integer getAvailableReplica() {
        return availableReplica;
    }

    public void setAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
    }

    public ComponentSpec withSource(Source source) {
        this.source = source;
        return this;
    }

    public ComponentSpec withSource(Consumer<Source> sourceSetter) {
        if (this.source == null) {
            this.source = new Source();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public ComponentSpec withBuild(Build build) {
        this.build = build;
        return this;
    }

    public ComponentSpec withBuild(Consumer<Build> buildSetter) {
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

    public ComponentSpec withAccessInfo(List<Access> accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }

    public ComponentSpec addAccessInfoItem(Access accessInfoItem) {
        if (this.accessInfo == null) {
            this.accessInfo = new ArrayList<>();
        }
        this.accessInfo.add(accessInfoItem);
        return this;
    }

    public ComponentSpec withAccessInfo(Consumer<List<Access>> accessInfoSetter) {
        if (this.accessInfo == null) {
            this.accessInfo = new ArrayList<>();
        }
        accessInfoSetter.accept(this.accessInfo);
        return this;
    }

    /**
     * Get accessInfo
     * @return accessInfo
     */
    public List<Access> getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(List<Access> accessInfo) {
        this.accessInfo = accessInfo;
    }

    public ComponentSpec withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * 构建id。
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public ComponentSpec withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 镜像地址。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ComponentSpec withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ComponentSpec withLogStrategy(List<LogStrategy> logStrategy) {
        this.logStrategy = logStrategy;
        return this;
    }

    public ComponentSpec addLogStrategyItem(LogStrategy logStrategyItem) {
        if (this.logStrategy == null) {
            this.logStrategy = new ArrayList<>();
        }
        this.logStrategy.add(logStrategyItem);
        return this;
    }

    public ComponentSpec withLogStrategy(Consumer<List<LogStrategy>> logStrategySetter) {
        if (this.logStrategy == null) {
            this.logStrategy = new ArrayList<>();
        }
        logStrategySetter.accept(this.logStrategy);
        return this;
    }

    /**
     * 日志策略。
     * @return logStrategy
     */
    public List<LogStrategy> getLogStrategy() {
        return logStrategy;
    }

    public void setLogStrategy(List<LogStrategy> logStrategy) {
        this.logStrategy = logStrategy;
    }

    public ComponentSpec withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 组件状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentSpec componentSpec = (ComponentSpec) o;
        return Objects.equals(this.runtime, componentSpec.runtime) && Objects.equals(this.envId, componentSpec.envId)
            && Objects.equals(this.replica, componentSpec.replica)
            && Objects.equals(this.availableReplica, componentSpec.availableReplica)
            && Objects.equals(this.source, componentSpec.source) && Objects.equals(this.build, componentSpec.build)
            && Objects.equals(this.accessInfo, componentSpec.accessInfo)
            && Objects.equals(this.buildId, componentSpec.buildId)
            && Objects.equals(this.imageUrl, componentSpec.imageUrl) && Objects.equals(this.jobId, componentSpec.jobId)
            && Objects.equals(this.logStrategy, componentSpec.logStrategy)
            && Objects.equals(this.status, componentSpec.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtime,
            envId,
            replica,
            availableReplica,
            source,
            build,
            accessInfo,
            buildId,
            imageUrl,
            jobId,
            logStrategy,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentSpec {\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    availableReplica: ").append(toIndentedString(availableReplica)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    logStrategy: ").append(toIndentedString(logStrategy)).append("\n");
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
