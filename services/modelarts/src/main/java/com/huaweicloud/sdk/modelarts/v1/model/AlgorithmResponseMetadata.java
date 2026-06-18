package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法的元数据，描述算法基本信息。
 */
public class AlgorithmResponseMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_project")

    private String aiProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private String isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Map<String, String>> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_list")

    private List<String> attrList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private Integer versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public AlgorithmResponseMetadata withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 算法uuid，创建算法时无需填写。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AlgorithmResponseMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 算法名称。限制为1-64位只含数字、字母、下划线和中划线的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmResponseMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对算法的描述，默认为“NULL”，字符串的长度限制为[0, 256]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlgorithmResponseMetadata withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 指定算法所处的工作空间，默认值为“0”。“0” 为默认的工作空间。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public AlgorithmResponseMetadata withAiProject(String aiProject) {
        this.aiProject = aiProject;
        return this;
    }

    /**
     * 指定算法所属的ai项目，默认值为\"default-ai-project\"。ai项目已下线，无需关注。
     * @return aiProject
     */
    public String getAiProject() {
        return aiProject;
    }

    public void setAiProject(String aiProject) {
        this.aiProject = aiProject;
    }

    public AlgorithmResponseMetadata withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AlgorithmResponseMetadata withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户的domainID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AlgorithmResponseMetadata withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 算法来源类型。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AlgorithmResponseMetadata withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 算法api版本，标识新旧版。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AlgorithmResponseMetadata withIsValid(String isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * 算法可用性。
     * @return isValid
     */
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public AlgorithmResponseMetadata withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 算法状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AlgorithmResponseMetadata withTags(List<Map<String, String>> tags) {
        this.tags = tags;
        return this;
    }

    public AlgorithmResponseMetadata addTagsItem(Map<String, String> tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AlgorithmResponseMetadata withTags(Consumer<List<Map<String, String>>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 算法标签。
     * @return tags
     */
    public List<Map<String, String>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, String>> tags) {
        this.tags = tags;
    }

    public AlgorithmResponseMetadata withAttrList(List<String> attrList) {
        this.attrList = attrList;
        return this;
    }

    public AlgorithmResponseMetadata addAttrListItem(String attrListItem) {
        if (this.attrList == null) {
            this.attrList = new ArrayList<>();
        }
        this.attrList.add(attrListItem);
        return this;
    }

    public AlgorithmResponseMetadata withAttrList(Consumer<List<String>> attrListSetter) {
        if (this.attrList == null) {
            this.attrList = new ArrayList<>();
        }
        attrListSetter.accept(this.attrList);
        return this;
    }

    /**
     * 算法属性列表。
     * @return attrList
     */
    public List<String> getAttrList() {
        return attrList;
    }

    public void setAttrList(List<String> attrList) {
        this.attrList = attrList;
    }

    public AlgorithmResponseMetadata withVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * 算法版本数量，默认为0。
     * @return versionNum
     */
    public Integer getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
    }

    public AlgorithmResponseMetadata withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 算法大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public AlgorithmResponseMetadata withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 算法创建时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AlgorithmResponseMetadata withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 算法更新时间戳。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmResponseMetadata that = (AlgorithmResponseMetadata) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.aiProject, that.aiProject) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.source, that.source)
            && Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.state, that.state) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.attrList, that.attrList) && Objects.equals(this.versionNum, that.versionNum)
            && Objects.equals(this.size, that.size) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            workspaceId,
            aiProject,
            userName,
            domainId,
            source,
            apiVersion,
            isValid,
            state,
            tags,
            attrList,
            versionNum,
            size,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseMetadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    aiProject: ").append(toIndentedString(aiProject)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    attrList: ").append(toIndentedString(attrList)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
