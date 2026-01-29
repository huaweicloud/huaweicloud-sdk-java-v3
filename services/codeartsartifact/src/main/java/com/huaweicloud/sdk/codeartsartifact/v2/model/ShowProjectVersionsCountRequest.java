package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectVersionsCountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_version")

    private String buildVersion;

    public ShowProjectVersionsCountRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID，可以调用API获取，也可以从控制台获取，获取方式请参考[项目ID](CloudArtifact_api_0015.xml)。 **约束限制**： 不涉及。 **取值范围**： 只能由英文字母、数字组成，且长度为32个字符。 **默认取值**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowProjectVersionsCountRequest withBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }

    /**
     * **参数解释**： 发布库版本的名称。 **约束限制**： 不涉及。 **取值范围**： 英文字母、数字、特殊字符支持中划线、下划线和英文句号，长度为1-128个字符。 **默认取值**： 不涉及。
     * @return buildVersion
     */
    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectVersionsCountRequest that = (ShowProjectVersionsCountRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.buildVersion, that.buildVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, buildVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectVersionsCountRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
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
