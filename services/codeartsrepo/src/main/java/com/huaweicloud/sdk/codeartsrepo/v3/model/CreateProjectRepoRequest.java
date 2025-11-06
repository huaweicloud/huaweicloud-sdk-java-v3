package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateProjectRepoRequest
 */
public class CreateProjectRepoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_members")

    private Integer importMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_project_info")

    private ExternalKeyMessage externalProjectInfo;

    public CreateProjectRepoRequest withImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
        return this;
    }

    /**
     * 是否导入项目成员，取值范围：0->不导入项目成员，1->导入项目成员
     * @return importMembers
     */
    public Integer getImportMembers() {
        return importMembers;
    }

    public void setImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
    }

    public CreateProjectRepoRequest withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称，取值范围：可以输入英文大小写字母、数字、连字符、下划线，且必须以字母开头
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public CreateProjectRepoRequest withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称，取值范围：可以输入英文大小写字母、数字、连字符、下划线，且必须以字母开头
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public CreateProjectRepoRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 项目类型，scrum
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateProjectRepoRequest withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * 仓库可见性：  *私有仓库：仓库仅对仓库成员可见，仓库成员可读写和访问仓库，取值范围为0  *公开仓库：   1.项目内成员只读仓库：仓库对项目内成员公开只读，并项目内成员可在项目下和代码组下的仓库列表中查看和搜索，取值范围为10   2.租户内成员只读仓库：仓库对租户内成员公开只读，并租户内成员可在项目下和代码组下的仓库列表中查看和搜索，取值范围为10   3.所有访客只读仓库：仓库对所有访客公开只读，并所有访客可在项目下和代码组下的仓库列表中查看和搜索，取值范围为20
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public CreateProjectRepoRequest withExternalProjectInfo(ExternalKeyMessage externalProjectInfo) {
        this.externalProjectInfo = externalProjectInfo;
        return this;
    }

    public CreateProjectRepoRequest withExternalProjectInfo(Consumer<ExternalKeyMessage> externalProjectInfoSetter) {
        if (this.externalProjectInfo == null) {
            this.externalProjectInfo = new ExternalKeyMessage();
            externalProjectInfoSetter.accept(this.externalProjectInfo);
        }

        return this;
    }

    /**
     * Get externalProjectInfo
     * @return externalProjectInfo
     */
    public ExternalKeyMessage getExternalProjectInfo() {
        return externalProjectInfo;
    }

    public void setExternalProjectInfo(ExternalKeyMessage externalProjectInfo) {
        this.externalProjectInfo = externalProjectInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProjectRepoRequest that = (CreateProjectRepoRequest) obj;
        return Objects.equals(this.importMembers, that.importMembers)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.visibilityLevel, that.visibilityLevel)
            && Objects.equals(this.externalProjectInfo, that.externalProjectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importMembers, projectName, repoName, type, visibilityLevel, externalProjectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProjectRepoRequest {\n");
        sb.append("    importMembers: ").append(toIndentedString(importMembers)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    externalProjectInfo: ").append(toIndentedString(externalProjectInfo)).append("\n");
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
