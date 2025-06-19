package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 复制构建任务请求体
 */
public class CopyBuildJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_job_id")

    private String copyJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_update_sub_module")

    private String autoUpdateSubModule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<CreateBuildJobParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scms")

    private List<CreateBuildJobScm> scms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CreateBuildJobSteps> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_config_type")

    private String buildConfigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<Trigger> triggers = null;

    public CopyBuildJobRequestBody withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 使用机器的架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public CopyBuildJobRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 构建任务所在项目的ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CopyBuildJobRequestBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public CopyBuildJobRequestBody withCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
        return this;
    }

    /**
     * 构建任务ID
     * @return copyJobId
     */
    public String getCopyJobId() {
        return copyJobId;
    }

    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    public CopyBuildJobRequestBody withAutoUpdateSubModule(String autoUpdateSubModule) {
        this.autoUpdateSubModule = autoUpdateSubModule;
        return this;
    }

    /**
     * 是否自动更新子模块
     * @return autoUpdateSubModule
     */
    public String getAutoUpdateSubModule() {
        return autoUpdateSubModule;
    }

    public void setAutoUpdateSubModule(String autoUpdateSubModule) {
        this.autoUpdateSubModule = autoUpdateSubModule;
    }

    public CopyBuildJobRequestBody withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 执行机规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public CopyBuildJobRequestBody withParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CopyBuildJobRequestBody addParametersItem(CreateBuildJobParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public CopyBuildJobRequestBody withParameters(Consumer<List<CreateBuildJobParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 构建执行参数列表
     * @return parameters
     */
    public List<CreateBuildJobParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
    }

    public CopyBuildJobRequestBody withScms(List<CreateBuildJobScm> scms) {
        this.scms = scms;
        return this;
    }

    public CopyBuildJobRequestBody addScmsItem(CreateBuildJobScm scmsItem) {
        if (this.scms == null) {
            this.scms = new ArrayList<>();
        }
        this.scms.add(scmsItem);
        return this;
    }

    public CopyBuildJobRequestBody withScms(Consumer<List<CreateBuildJobScm>> scmsSetter) {
        if (this.scms == null) {
            this.scms = new ArrayList<>();
        }
        scmsSetter.accept(this.scms);
        return this;
    }

    /**
     * 构建执行SCM
     * @return scms
     */
    public List<CreateBuildJobScm> getScms() {
        return scms;
    }

    public void setScms(List<CreateBuildJobScm> scms) {
        this.scms = scms;
    }

    public CopyBuildJobRequestBody withSteps(List<CreateBuildJobSteps> steps) {
        this.steps = steps;
        return this;
    }

    public CopyBuildJobRequestBody addStepsItem(CreateBuildJobSteps stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CopyBuildJobRequestBody withSteps(Consumer<List<CreateBuildJobSteps>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 构建执行的步骤
     * @return steps
     */
    public List<CreateBuildJobSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<CreateBuildJobSteps> steps) {
        this.steps = steps;
    }

    public CopyBuildJobRequestBody withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * host类型
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public CopyBuildJobRequestBody withBuildConfigType(String buildConfigType) {
        this.buildConfigType = buildConfigType;
        return this;
    }

    /**
     * 构建的配置类型
     * @return buildConfigType
     */
    public String getBuildConfigType() {
        return buildConfigType;
    }

    public void setBuildConfigType(String buildConfigType) {
        this.buildConfigType = buildConfigType;
    }

    public CopyBuildJobRequestBody withTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public CopyBuildJobRequestBody addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public CopyBuildJobRequestBody withTriggers(Consumer<List<Trigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 定时任务触发器集合
     * @return triggers
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CopyBuildJobRequestBody that = (CopyBuildJobRequestBody) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.copyJobId, that.copyJobId)
            && Objects.equals(this.autoUpdateSubModule, that.autoUpdateSubModule)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.scms, that.scms) && Objects.equals(this.steps, that.steps)
            && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.buildConfigType, that.buildConfigType)
            && Objects.equals(this.triggers, that.triggers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            projectId,
            jobName,
            copyJobId,
            autoUpdateSubModule,
            flavor,
            parameters,
            scms,
            steps,
            hostType,
            buildConfigType,
            triggers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyBuildJobRequestBody {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    copyJobId: ").append(toIndentedString(copyJobId)).append("\n");
        sb.append("    autoUpdateSubModule: ").append(toIndentedString(autoUpdateSubModule)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    scms: ").append(toIndentedString(scms)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    buildConfigType: ").append(toIndentedString(buildConfigType)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
