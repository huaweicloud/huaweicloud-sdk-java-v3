package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowTemplateV3Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickname")

    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_count")

    private Integer viewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_count")

    private Integer usageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "published_at")

    private String publishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite_state")

    private Integer favoriteState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainers")

    private List<String> maintainers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_source")

    private Integer platformSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Object> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_type")

    private String dependencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store")

    private Integer store;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_info")

    private String storeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    private Object deployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_static")

    private Integer isStatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_id")

    private String updateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private List<TopicCategory> topic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependents")

    private List<Dependent> dependents = null;

    public ShowTemplateV3Response withId(String id) {
        this.id = id;
        return this;
    }

    /** 模板id。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTemplateV3Response withTitle(String title) {
        this.title = title;
        return this;
    }

    /** 模板名称。
     * 
     * @return title */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowTemplateV3Response withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 模板描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTemplateV3Response withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** 模板创建者id。
     * 
     * @return creatorId */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowTemplateV3Response withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /** 模板创建者，有别名返回别名。
     * 
     * @return creator */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowTemplateV3Response withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /** 模板创建者，有别名返回别名。
     * 
     * @return nickname */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ShowTemplateV3Response withScore(Integer score) {
        this.score = score;
        return this;
    }

    /** 模板评分（点赞数）。 minimum: 1 maximum: 99999
     * 
     * @return score */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ShowTemplateV3Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 模板状态： - 0：审核中 - 1：已上架 - 2：未上架（已下架） - 3：未上架（合规检查不通过） - 4：未上架（待上架） - 5：已删除 minimum: 0 maximum: 5
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTemplateV3Response withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    /** 访问量。 minimum: 1 maximum: 99999
     * 
     * @return viewCount */
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public ShowTemplateV3Response withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /** 引用量。 minimum: 1 maximum: 99999
     * 
     * @return usageCount */
    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public ShowTemplateV3Response withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowTemplateV3Response withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowTemplateV3Response withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /** 上架时间。
     * 
     * @return publishedAt */
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ShowTemplateV3Response withFavoriteState(Integer favoriteState) {
        this.favoriteState = favoriteState;
        return this;
    }

    /** 点赞状态： - 1：点赞 - 0：未点赞 minimum: 0 maximum: 1
     * 
     * @return favoriteState */
    public Integer getFavoriteState() {
        return favoriteState;
    }

    public void setFavoriteState(Integer favoriteState) {
        this.favoriteState = favoriteState;
    }

    public ShowTemplateV3Response withMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public ShowTemplateV3Response addMaintainersItem(String maintainersItem) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        this.maintainers.add(maintainersItem);
        return this;
    }

    public ShowTemplateV3Response withMaintainers(Consumer<List<String>> maintainersSetter) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        maintainersSetter.accept(this.maintainers);
        return this;
    }

    /** 模板相关联的所有维护人账号名称。
     * 
     * @return maintainers */
    public List<String> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
    }

    public ShowTemplateV3Response withPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    /** 平台来源： - 0：codelabs - 1：devstar minimum: 0 maximum: 1
     * 
     * @return platformSource */
    public Integer getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
    }

    public ShowTemplateV3Response withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /** 模板自定义参数列表。
     * 
     * @return properties */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public ShowTemplateV3Response withDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public ShowTemplateV3Response addDependenciesItem(Object dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ShowTemplateV3Response withDependencies(Consumer<List<Object>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /** dependency信息。
     * 
     * @return dependencies */
    public List<Object> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
    }

    public ShowTemplateV3Response withDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /** dependency类型： - '0'：非分组的依赖类型 - '1'：分组依赖类型
     * 
     * @return dependencyType */
    public String getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    public ShowTemplateV3Response withStore(Integer store) {
        this.store = store;
        return this;
    }

    /** 代码存储位置： - 0：codehub - 1：Obs - 2：efs - 3：网络公开代码仓 minimum: 0 maximum: 9
     * 
     * @return store */
    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public ShowTemplateV3Response withStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }

    /** 获取代码模版所需的信息。
     * 
     * @return storeInfo */
    public String getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
    }

    public ShowTemplateV3Response withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /** 模板文件解压缩之后的大小(单位:KB)。 minimum: 0 maximum: 2147483647
     * 
     * @return fileSize */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public ShowTemplateV3Response withDeployment(Object deployment) {
        this.deployment = deployment;
        return this;
    }

    /** 部署信息。
     * 
     * @return deployment */
    public Object getDeployment() {
        return deployment;
    }

    public void setDeployment(Object deployment) {
        this.deployment = deployment;
    }

    public ShowTemplateV3Response withIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /** 动、静态代码模板标识： - 0：动态模板codetemplate - 1：静态模板codesample minimum: 0 maximum: 1
     * 
     * @return isStatic */
    public Integer getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
    }

    public ShowTemplateV3Response withUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    /** 模板关联更新态Id。
     * 
     * @return updateId */
    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public ShowTemplateV3Response withTopic(List<TopicCategory> topic) {
        this.topic = topic;
        return this;
    }

    public ShowTemplateV3Response addTopicItem(TopicCategory topicItem) {
        if (this.topic == null) {
            this.topic = new ArrayList<>();
        }
        this.topic.add(topicItem);
        return this;
    }

    public ShowTemplateV3Response withTopic(Consumer<List<TopicCategory>> topicSetter) {
        if (this.topic == null) {
            this.topic = new ArrayList<>();
        }
        topicSetter.accept(this.topic);
        return this;
    }

    /** 模板标签。
     * 
     * @return topic */
    public List<TopicCategory> getTopic() {
        return topic;
    }

    public void setTopic(List<TopicCategory> topic) {
        this.topic = topic;
    }

    public ShowTemplateV3Response withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public ShowTemplateV3Response addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowTemplateV3Response withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 自定义标签。
     * 
     * @return tags */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public ShowTemplateV3Response withDependents(List<Dependent> dependents) {
        this.dependents = dependents;
        return this;
    }

    public ShowTemplateV3Response addDependentsItem(Dependent dependentsItem) {
        if (this.dependents == null) {
            this.dependents = new ArrayList<>();
        }
        this.dependents.add(dependentsItem);
        return this;
    }

    public ShowTemplateV3Response withDependents(Consumer<List<Dependent>> dependentsSetter) {
        if (this.dependents == null) {
            this.dependents = new ArrayList<>();
        }
        dependentsSetter.accept(this.dependents);
        return this;
    }

    /** 模板部署支持方式信息
     * 
     * @return dependents */
    public List<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTemplateV3Response showTemplateV3Response = (ShowTemplateV3Response) o;
        return Objects.equals(this.id, showTemplateV3Response.id)
            && Objects.equals(this.title, showTemplateV3Response.title)
            && Objects.equals(this.description, showTemplateV3Response.description)
            && Objects.equals(this.creatorId, showTemplateV3Response.creatorId)
            && Objects.equals(this.creator, showTemplateV3Response.creator)
            && Objects.equals(this.nickname, showTemplateV3Response.nickname)
            && Objects.equals(this.score, showTemplateV3Response.score)
            && Objects.equals(this.status, showTemplateV3Response.status)
            && Objects.equals(this.viewCount, showTemplateV3Response.viewCount)
            && Objects.equals(this.usageCount, showTemplateV3Response.usageCount)
            && Objects.equals(this.createdAt, showTemplateV3Response.createdAt)
            && Objects.equals(this.updatedAt, showTemplateV3Response.updatedAt)
            && Objects.equals(this.publishedAt, showTemplateV3Response.publishedAt)
            && Objects.equals(this.favoriteState, showTemplateV3Response.favoriteState)
            && Objects.equals(this.maintainers, showTemplateV3Response.maintainers)
            && Objects.equals(this.platformSource, showTemplateV3Response.platformSource)
            && Objects.equals(this.properties, showTemplateV3Response.properties)
            && Objects.equals(this.dependencies, showTemplateV3Response.dependencies)
            && Objects.equals(this.dependencyType, showTemplateV3Response.dependencyType)
            && Objects.equals(this.store, showTemplateV3Response.store)
            && Objects.equals(this.storeInfo, showTemplateV3Response.storeInfo)
            && Objects.equals(this.fileSize, showTemplateV3Response.fileSize)
            && Objects.equals(this.deployment, showTemplateV3Response.deployment)
            && Objects.equals(this.isStatic, showTemplateV3Response.isStatic)
            && Objects.equals(this.updateId, showTemplateV3Response.updateId)
            && Objects.equals(this.topic, showTemplateV3Response.topic)
            && Objects.equals(this.tags, showTemplateV3Response.tags)
            && Objects.equals(this.dependents, showTemplateV3Response.dependents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            description,
            creatorId,
            creator,
            nickname,
            score,
            status,
            viewCount,
            usageCount,
            createdAt,
            updatedAt,
            publishedAt,
            favoriteState,
            maintainers,
            platformSource,
            properties,
            dependencies,
            dependencyType,
            store,
            storeInfo,
            fileSize,
            deployment,
            isStatic,
            updateId,
            topic,
            tags,
            dependents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateV3Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
        sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    favoriteState: ").append(toIndentedString(favoriteState)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
        sb.append("    store: ").append(toIndentedString(store)).append("\n");
        sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
