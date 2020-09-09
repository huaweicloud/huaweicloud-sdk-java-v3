package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepoInfo
 */
public class RepoInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createAt")
    
    private String createAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groupName")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="httpUrl")
    
    private String httpUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectId")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectIsDelete")
    
    private String projectIsDelete;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repoId")
    
    private String repoId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sshUrl")
    
    private String sshUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visibilityLevel")
    
    private Integer visibilityLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="webUrl")
    
    private String webUrl;

    public RepoInfo withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    


    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public RepoInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 仓库组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public RepoInfo withHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    


    /**
     * https url
     * @return httpUrl
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public RepoInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 仓库uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RepoInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 仓库名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepoInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目的uuid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepoInfo withProjectIsDelete(String projectIsDelete) {
        this.projectIsDelete = projectIsDelete;
        return this;
    }

    


    /**
     * 项目是否被删除
     * @return projectIsDelete
     */
    public String getProjectIsDelete() {
        return projectIsDelete;
    }

    public void setProjectIsDelete(String projectIsDelete) {
        this.projectIsDelete = projectIsDelete;
    }

    public RepoInfo withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    


    /**
     * 仓库主键id
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public RepoInfo withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    


    /**
     * ssh url
     * @return sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public RepoInfo withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    


    /**
     * 是否可见：0私有仓库，20公有仓库
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public RepoInfo withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    


    /**
     * web url 访问路径
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoInfo repoInfo = (RepoInfo) o;
        return Objects.equals(this.createAt, repoInfo.createAt) &&
            Objects.equals(this.groupName, repoInfo.groupName) &&
            Objects.equals(this.httpUrl, repoInfo.httpUrl) &&
            Objects.equals(this.id, repoInfo.id) &&
            Objects.equals(this.name, repoInfo.name) &&
            Objects.equals(this.projectId, repoInfo.projectId) &&
            Objects.equals(this.projectIsDelete, repoInfo.projectIsDelete) &&
            Objects.equals(this.repoId, repoInfo.repoId) &&
            Objects.equals(this.sshUrl, repoInfo.sshUrl) &&
            Objects.equals(this.visibilityLevel, repoInfo.visibilityLevel) &&
            Objects.equals(this.webUrl, repoInfo.webUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createAt, groupName, httpUrl, id, name, projectId, projectIsDelete, repoId, sshUrl, visibilityLevel, webUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoInfo {\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    httpUrl: ").append(toIndentedString(httpUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectIsDelete: ").append(toIndentedString(projectIsDelete)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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

