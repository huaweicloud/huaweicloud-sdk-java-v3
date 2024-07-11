package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通过模板创建应用请求体
 */
public class TemplateTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<ConfigInfoDO> configs = null;

    public TemplateTaskRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TemplateTaskRequestBody withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TemplateTaskRequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 部署模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 应用名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TemplateTaskRequestBody withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * 自定义slave资源池id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public TemplateTaskRequestBody withConfigs(List<ConfigInfoDO> configs) {
        this.configs = configs;
        return this;
    }

    public TemplateTaskRequestBody addConfigsItem(ConfigInfoDO configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public TemplateTaskRequestBody withConfigs(Consumer<List<ConfigInfoDO>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 部署参数类
     * @return configs
     */
    public List<ConfigInfoDO> getConfigs() {
        return configs;
    }

    public void setConfigs(List<ConfigInfoDO> configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateTaskRequestBody that = (TemplateTaskRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.slaveClusterId, that.slaveClusterId) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, templateId, taskName, slaveClusterId, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateTaskRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
