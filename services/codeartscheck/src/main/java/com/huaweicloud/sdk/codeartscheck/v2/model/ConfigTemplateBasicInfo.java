package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 配置模板详情。
 */
public class ConfigTemplateBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude")

    private String exclude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includePaths")

    private String includePaths;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastReviser")

    private String lastReviser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectName")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoType")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoUrl")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourcePoolId")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourcePoolName")

    private String resourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_type")

    private String resourcePoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewData")

    private List<ReviewDataInfoResponse> reviewData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewDataJson")

    private String reviewDataJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleSets")

    private List<ConfigTemplateRuleSetInfo> ruleSets = null;

    public ConfigTemplateBasicInfo withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释：** 执行机类型。 **取值范围：** X86/ARM。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ConfigTemplateBasicInfo withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 不涉及。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ConfigTemplateBasicInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 配置模板创建时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ConfigTemplateBasicInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：** 配置模板创建者。 **取值范围：** 不涉及。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ConfigTemplateBasicInfo withExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }

    /**
     * **参数解释：** 任务配置的排除目录信息。 **取值范围:** 不涉及。
     * @return exclude
     */
    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    public ConfigTemplateBasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 配置模板ID，修改配置信息需要用到配置模板ID，每个代码检查任务及其下的分支任务都有相同的且唯一的配置模板ID。 **取值范围:** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigTemplateBasicInfo withIncludePaths(String includePaths) {
        this.includePaths = includePaths;
        return this;
    }

    /**
     * **参数解释：** 检查目录。不配置检查目录时，检查代码仓中所有目录下的代码文件；配置检查目录时，只检查配置目录中的文件。 **取值范围：** 不涉及。
     * @return includePaths
     */
    public String getIncludePaths() {
        return includePaths;
    }

    public void setIncludePaths(String includePaths) {
        this.includePaths = includePaths;
    }

    public ConfigTemplateBasicInfo withLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
        return this;
    }

    /**
     * **参数解释：** 最后修改人的用户名。 **取值范围：** 不涉及。
     * @return lastReviser
     */
    public String getLastReviser() {
        return lastReviser;
    }

    public void setLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
    }

    public ConfigTemplateBasicInfo withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：** 配置模板上一次修改时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ConfigTemplateBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 配置模板的名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigTemplateBasicInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位UUID，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口获取。 **取值范围：** 长度为[1~32]个字符。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ConfigTemplateBasicInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名。 **取值范围：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ConfigTemplateBasicInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 华为云地域。 **取值范围：** 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ConfigTemplateBasicInfo withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * **参数解释：** 代码仓类型。 **取值范围：** - DevCloud：CodeArtsRepo仓。 - Gitee：Gitee仓。 - GitHub：GitHub仓。 - GitPub：通用Git仓。 - gitcode：GitCode仓。 - gitlab：GitLab仓。 - self_gitlab：自建GitLab仓。 - tfs_git：TFS仓。 - bitbucket：Bitbucket仓。
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public ConfigTemplateBasicInfo withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **取值范围：** 不涉及。
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public ConfigTemplateBasicInfo withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * **参数解释：** 启用的资源池ID，使用内置执行机的情况下为\"\"。 **取值范围：** 不涉及。
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public ConfigTemplateBasicInfo withResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }

    /**
     * **参数解释：** 启用的资源池名称，使用内置执行机的情况下为空。 **取值范围：** 不涉及。
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return resourcePoolName;
    }

    public void setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }

    public ConfigTemplateBasicInfo withResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
        return this;
    }

    /**
     * **参数解释：** 启用的资源池类型。 **取值范围：** - default：使用内置资源池。 - exclusive：使用专属资源池。 - self-hosted：使用自定义资源池。
     * @return resourcePoolType
     */
    public String getResourcePoolType() {
        return resourcePoolType;
    }

    public void setResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
    }

    public ConfigTemplateBasicInfo withReviewData(List<ReviewDataInfoResponse> reviewData) {
        this.reviewData = reviewData;
        return this;
    }

    public ConfigTemplateBasicInfo addReviewDataItem(ReviewDataInfoResponse reviewDataItem) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        this.reviewData.add(reviewDataItem);
        return this;
    }

    public ConfigTemplateBasicInfo withReviewData(Consumer<List<ReviewDataInfoResponse>> reviewDataSetter) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        reviewDataSetter.accept(this.reviewData);
        return this;
    }

    /**
     * **参数解释：** 任务门禁配置列表。
     * @return reviewData
     */
    public List<ReviewDataInfoResponse> getReviewData() {
        return reviewData;
    }

    public void setReviewData(List<ReviewDataInfoResponse> reviewData) {
        this.reviewData = reviewData;
    }

    public ConfigTemplateBasicInfo withReviewDataJson(String reviewDataJson) {
        this.reviewDataJson = reviewDataJson;
        return this;
    }

    /**
     * **参数解释：** 任务门禁配置列表的json字符串。 **取值范围：** 不涉及。
     * @return reviewDataJson
     */
    public String getReviewDataJson() {
        return reviewDataJson;
    }

    public void setReviewDataJson(String reviewDataJson) {
        this.reviewDataJson = reviewDataJson;
    }

    public ConfigTemplateBasicInfo withRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    public ConfigTemplateBasicInfo addRuleSetsItem(ConfigTemplateRuleSetInfo ruleSetsItem) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        this.ruleSets.add(ruleSetsItem);
        return this;
    }

    public ConfigTemplateBasicInfo withRuleSets(Consumer<List<ConfigTemplateRuleSetInfo>> ruleSetsSetter) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        ruleSetsSetter.accept(this.ruleSets);
        return this;
    }

    /**
     * **参数解释：** 规则集配置列表。
     * @return ruleSets
     */
    public List<ConfigTemplateRuleSetInfo> getRuleSets() {
        return ruleSets;
    }

    public void setRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigTemplateBasicInfo that = (ConfigTemplateBasicInfo) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.exclude, that.exclude) && Objects.equals(this.id, that.id)
            && Objects.equals(this.includePaths, that.includePaths)
            && Objects.equals(this.lastReviser, that.lastReviser)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.region, that.region) && Objects.equals(this.repoType, that.repoType)
            && Objects.equals(this.repoUrl, that.repoUrl) && Objects.equals(this.resourcePoolId, that.resourcePoolId)
            && Objects.equals(this.resourcePoolName, that.resourcePoolName)
            && Objects.equals(this.resourcePoolType, that.resourcePoolType)
            && Objects.equals(this.reviewData, that.reviewData)
            && Objects.equals(this.reviewDataJson, that.reviewDataJson) && Objects.equals(this.ruleSets, that.ruleSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            branch,
            createTime,
            creator,
            exclude,
            id,
            includePaths,
            lastReviser,
            lastUpdateTime,
            name,
            projectId,
            projectName,
            region,
            repoType,
            repoUrl,
            resourcePoolId,
            resourcePoolName,
            resourcePoolType,
            reviewData,
            reviewDataJson,
            ruleSets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigTemplateBasicInfo {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
        sb.append("    lastReviser: ").append(toIndentedString(lastReviser)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    resourcePoolName: ").append(toIndentedString(resourcePoolName)).append("\n");
        sb.append("    resourcePoolType: ").append(toIndentedString(resourcePoolType)).append("\n");
        sb.append("    reviewData: ").append(toIndentedString(reviewData)).append("\n");
        sb.append("    reviewDataJson: ").append(toIndentedString(reviewDataJson)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
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
