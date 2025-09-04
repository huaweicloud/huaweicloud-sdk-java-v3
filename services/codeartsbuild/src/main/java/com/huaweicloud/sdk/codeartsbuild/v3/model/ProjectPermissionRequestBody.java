package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建更新分组返回体
 */
public class ProjectPermissionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_switch")

    private Boolean projectSwitch;

    public ProjectPermissionRequestBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 填写需要查询构建历史列表的构建任务ID。获取方法：在构建任务详情页，拷贝浏览器URL末尾的32位数字、字母组合的字符串，即为构建任务ID。 **约束限制**： 不涉及。 **取值范围**： 只能是英文字母和数字，长度为32个字符。 **默认取值**： 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ProjectPermissionRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： CodeArts项目ID。获取方式请参考[获取CodeArts项目ID](https://support.huaweicloud.com/api-codeci/cloudbuild_03_0022.html)。 **约束限制**： 不涉及。 **取值范围**： 32位数字、字母组合的字符串。 **默认取值**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProjectPermissionRequestBody withProjectSwitch(Boolean projectSwitch) {
        this.projectSwitch = projectSwitch;
        return this;
    }

    /**
     * **参数解释**： 是否同步最新一次项目权限。 **约束限制**： 不涉及。 **取值范围**： ● true：使用项目级权限。 ● false：不使用项目级权限。 **默认取值**： 不涉及。
     * @return projectSwitch
     */
    public Boolean getProjectSwitch() {
        return projectSwitch;
    }

    public void setProjectSwitch(Boolean projectSwitch) {
        this.projectSwitch = projectSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectPermissionRequestBody that = (ProjectPermissionRequestBody) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectSwitch, that.projectSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, projectId, projectSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectPermissionRequestBody {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectSwitch: ").append(toIndentedString(projectSwitch)).append("\n");
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
