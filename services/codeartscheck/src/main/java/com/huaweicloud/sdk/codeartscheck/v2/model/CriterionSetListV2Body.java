package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CriterionSetListV2Body
 */
public class CriterionSetListV2Body {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastReviser")

    private String lastReviser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentId")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numCriterion")

    private Integer numCriterion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canEdit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canDelete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managers")

    private String managers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentSetNames")

    private String parentSetNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainId")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inheritMode")

    private String inheritMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatorId")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSystemDefault")

    private String isSystemDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isProjectDefault")

    private String isProjectDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSystemSet")

    private String isSystemSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleIds")

    private String ruleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canSetDefault")

    private Boolean canSetDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isUsed")

    private Boolean isUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childSets")

    private List<String> childSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isReliable")

    private Boolean isReliable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isRecommand")

    private String isRecommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isDefault")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultSet")

    private String defaultSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptId")

    private String deptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reliableTag")

    private String reliableTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommandType")

    private String recommandType;

    public CriterionSetListV2Body withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规则集ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CriterionSetListV2Body withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则集中文名称。 **取值范围：** 任意中英文字符，数字，点，连字符和下划线组成的字符串，长度为[1~128]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CriterionSetListV2Body withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * **参数解释：** 规则集中文描述。 **取值范围：** 不涉及。
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public CriterionSetListV2Body withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 规则集类型。 **取值范围：** - system：系统规则集。 - custom：自定义规则集。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CriterionSetListV2Body withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：** 规则集创建者。 **取值范围：** 用户名。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CriterionSetListV2Body withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 规则集创建时间。 **取值范围：** 0时区标准时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CriterionSetListV2Body withLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
        return this;
    }

    /**
     * **参数解释：** 规则集最近一次更新的操作人。 **取值范围：** 用户名。
     * @return lastReviser
     */
    public String getLastReviser() {
        return lastReviser;
    }

    public void setLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
    }

    public CriterionSetListV2Body withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：** 规则集最近一次更新的时间。 **取值范围：** 0时区标准时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public CriterionSetListV2Body withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释：** 规则集语言。 **取值范围：** - ARKTS - C# - CANGJIE - C++ - CSS - GO - HTML - JAVA - JAVASCRIPT - KOTLIN - LUA - PHP - PYTHON - RUST - SCALA - SHELL - SQL - TERRAFORM - TYPESCRIPT - AZURERESOURCEMANAGER - DOCKER - KUBERNETES
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public CriterionSetListV2Body withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：** 父规则集ID。 **取值范围：** 32位UUID组成的字符串。多个ID之间用逗号分隔。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CriterionSetListV2Body withNumCriterion(Integer numCriterion) {
        this.numCriterion = numCriterion;
        return this;
    }

    /**
     * **参数解释：** 规则集中已启用的规则数量。 **取值范围：** ≥0
     * @return numCriterion
     */
    public Integer getNumCriterion() {
        return numCriterion;
    }

    public void setNumCriterion(Integer numCriterion) {
        this.numCriterion = numCriterion;
    }

    public CriterionSetListV2Body withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否具有修改该规则集的权限。 **取值范围：** - true：有编辑的权限。 - false：没有编辑的权限。
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public CriterionSetListV2Body withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否具有删除该规则集的权限。 **取值范围：** - true：有删除的权限。 - false：没有删除的权限。
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public CriterionSetListV2Body withManagers(String managers) {
        this.managers = managers;
        return this;
    }

    /**
     * **参数解释：** 规则集管理员。 **取值范围：** 用户ID。多个ID用逗号分隔。
     * @return managers
     */
    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers;
    }

    public CriterionSetListV2Body withParentSetNames(String parentSetNames) {
        this.parentSetNames = parentSetNames;
        return this;
    }

    /**
     * **参数解释：** 父规则集的名称。 **取值范围：** 多个规则集名称之间用逗号分隔。
     * @return parentSetNames
     */
    public String getParentSetNames() {
        return parentSetNames;
    }

    public void setParentSetNames(String parentSetNames) {
        this.parentSetNames = parentSetNames;
    }

    public CriterionSetListV2Body withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户ID，租户ID的值来源于IAM的租户ID。 **取值范围：** 32位UUID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CriterionSetListV2Body withInheritMode(String inheritMode) {
        this.inheritMode = inheritMode;
        return this;
    }

    /**
     * **参数解释：** 规则集创建时候的继承类型。 **取值范围：** - strong：规则集创建的时候来源于继承。 - null：规则集创建的时候来源于非继承。
     * @return inheritMode
     */
    public String getInheritMode() {
        return inheritMode;
    }

    public void setInheritMode(String inheritMode) {
        this.inheritMode = inheritMode;
    }

    public CriterionSetListV2Body withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释：** 创建者用户ID。 **取值范围：** 32位UUID。
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public CriterionSetListV2Body withIsSystemDefault(String isSystemDefault) {
        this.isSystemDefault = isSystemDefault;
        return this;
    }

    /**
     * **参数解释：** 是否为系统默认规则集。 **取值范围：** - 0：否。 - 1：是。
     * @return isSystemDefault
     */
    public String getIsSystemDefault() {
        return isSystemDefault;
    }

    public void setIsSystemDefault(String isSystemDefault) {
        this.isSystemDefault = isSystemDefault;
    }

    public CriterionSetListV2Body withIsProjectDefault(String isProjectDefault) {
        this.isProjectDefault = isProjectDefault;
        return this;
    }

    /**
     * **参数解释：** 是否为项目默认规则集。 **取值范围：** - 0：否。 - 1：是。
     * @return isProjectDefault
     */
    public String getIsProjectDefault() {
        return isProjectDefault;
    }

    public void setIsProjectDefault(String isProjectDefault) {
        this.isProjectDefault = isProjectDefault;
    }

    public CriterionSetListV2Body withIsSystemSet(String isSystemSet) {
        this.isSystemSet = isSystemSet;
        return this;
    }

    /**
     * **参数解释：** 是否为系统规则集。 **取值范围：** - 0：否。 - 1：是。
     * @return isSystemSet
     */
    public String getIsSystemSet() {
        return isSystemSet;
    }

    public void setIsSystemSet(String isSystemSet) {
        this.isSystemSet = isSystemSet;
    }

    public CriterionSetListV2Body withRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /**
     * **参数解释：** 规则集中已启用的能力规则unique_id。 **取值范围：** unique_id为32位UUID。多个unique_id之间用逗号分隔。
     * @return ruleIds
     */
    public String getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
    }

    public CriterionSetListV2Body withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 规则集所在局点。 **取值范围：** 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CriterionSetListV2Body withCanSetDefault(Boolean canSetDefault) {
        this.canSetDefault = canSetDefault;
        return this;
    }

    /**
     * **参数解释：** 是否具有设置默认规则集的权限。 **取值范围：** - true：有权限。 - false：没有权限。
     * @return canSetDefault
     */
    public Boolean getCanSetDefault() {
        return canSetDefault;
    }

    public void setCanSetDefault(Boolean canSetDefault) {
        this.canSetDefault = canSetDefault;
    }

    public CriterionSetListV2Body withIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
        return this;
    }

    /**
     * **参数解释：** 规则集是否被使用。 **取值范围：** - true：规则集被使用。 - false：规则集未被使用。
     * @return isUsed
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public CriterionSetListV2Body withChildSets(List<String> childSets) {
        this.childSets = childSets;
        return this;
    }

    public CriterionSetListV2Body addChildSetsItem(String childSetsItem) {
        if (this.childSets == null) {
            this.childSets = new ArrayList<>();
        }
        this.childSets.add(childSetsItem);
        return this;
    }

    public CriterionSetListV2Body withChildSets(Consumer<List<String>> childSetsSetter) {
        if (this.childSets == null) {
            this.childSets = new ArrayList<>();
        }
        childSetsSetter.accept(this.childSets);
        return this;
    }

    /**
     * **参数解释：** 子规则集。 **取值范围：** 不涉及。
     * @return childSets
     */
    public List<String> getChildSets() {
        return childSets;
    }

    public void setChildSets(List<String> childSets) {
        this.childSets = childSets;
    }

    public CriterionSetListV2Body withIsReliable(Boolean isReliable) {
        this.isReliable = isReliable;
        return this;
    }

    /**
     * **参数解释：** 是否为可信规则集。该字段已弃用。 **取值范围：** - true：是。 - false：否。
     * @return isReliable
     */
    public Boolean getIsReliable() {
        return isReliable;
    }

    public void setIsReliable(Boolean isReliable) {
        this.isReliable = isReliable;
    }

    public CriterionSetListV2Body withIsRecommand(String isRecommand) {
        this.isRecommand = isRecommand;
        return this;
    }

    /**
     * **参数解释：** 是否为推荐规则集。该字段已弃用。 **取值范围：** - 1：是。 - 0：否。
     * @return isRecommand
     */
    public String getIsRecommand() {
        return isRecommand;
    }

    public void setIsRecommand(String isRecommand) {
        this.isRecommand = isRecommand;
    }

    public CriterionSetListV2Body withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释：** 是否为默认规则集。该字段已弃用。 **取值范围：** - true：是。 - false：否。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public CriterionSetListV2Body withDefaultSet(String defaultSet) {
        this.defaultSet = defaultSet;
        return this;
    }

    /**
     * **参数解释：** 是否为默认规则集。该字段已弃用。 **取值范围：** - \"true\"：是。 - \"false\"：否。
     * @return defaultSet
     */
    public String getDefaultSet() {
        return defaultSet;
    }

    public void setDefaultSet(String defaultSet) {
        this.defaultSet = defaultSet;
    }

    public CriterionSetListV2Body withDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * **参数解释：** 该字段已弃用。 **取值范围：** 不涉及。
     * @return deptId
     */
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public CriterionSetListV2Body withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * **参数解释：** 该字段已弃用。 **取值范围：** 不涉及。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public CriterionSetListV2Body withReliableTag(String reliableTag) {
        this.reliableTag = reliableTag;
        return this;
    }

    /**
     * **参数解释：** 该字段已弃用。 **取值范围：** 不涉及。
     * @return reliableTag
     */
    public String getReliableTag() {
        return reliableTag;
    }

    public void setReliableTag(String reliableTag) {
        this.reliableTag = reliableTag;
    }

    public CriterionSetListV2Body withRecommandType(String recommandType) {
        this.recommandType = recommandType;
        return this;
    }

    /**
     * **参数解释：** 该字段已弃用。 **取值范围：** 不涉及。
     * @return recommandType
     */
    public String getRecommandType() {
        return recommandType;
    }

    public void setRecommandType(String recommandType) {
        this.recommandType = recommandType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CriterionSetListV2Body that = (CriterionSetListV2Body) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.comments, that.comments) && Objects.equals(this.type, that.type)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastReviser, that.lastReviser)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.language, that.language)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.numCriterion, that.numCriterion)
            && Objects.equals(this.canEdit, that.canEdit) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.managers, that.managers) && Objects.equals(this.parentSetNames, that.parentSetNames)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.inheritMode, that.inheritMode)
            && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.isSystemDefault, that.isSystemDefault)
            && Objects.equals(this.isProjectDefault, that.isProjectDefault)
            && Objects.equals(this.isSystemSet, that.isSystemSet) && Objects.equals(this.ruleIds, that.ruleIds)
            && Objects.equals(this.region, that.region) && Objects.equals(this.canSetDefault, that.canSetDefault)
            && Objects.equals(this.isUsed, that.isUsed) && Objects.equals(this.childSets, that.childSets)
            && Objects.equals(this.isReliable, that.isReliable) && Objects.equals(this.isRecommand, that.isRecommand)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.defaultSet, that.defaultSet)
            && Objects.equals(this.deptId, that.deptId) && Objects.equals(this.deptName, that.deptName)
            && Objects.equals(this.reliableTag, that.reliableTag)
            && Objects.equals(this.recommandType, that.recommandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            comments,
            type,
            creator,
            createTime,
            lastReviser,
            lastUpdateTime,
            language,
            parentId,
            numCriterion,
            canEdit,
            canDelete,
            managers,
            parentSetNames,
            domainId,
            inheritMode,
            creatorId,
            isSystemDefault,
            isProjectDefault,
            isSystemSet,
            ruleIds,
            region,
            canSetDefault,
            isUsed,
            childSets,
            isReliable,
            isRecommand,
            isDefault,
            defaultSet,
            deptId,
            deptName,
            reliableTag,
            recommandType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CriterionSetListV2Body {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastReviser: ").append(toIndentedString(lastReviser)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    numCriterion: ").append(toIndentedString(numCriterion)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
        sb.append("    parentSetNames: ").append(toIndentedString(parentSetNames)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    inheritMode: ").append(toIndentedString(inheritMode)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    isSystemDefault: ").append(toIndentedString(isSystemDefault)).append("\n");
        sb.append("    isProjectDefault: ").append(toIndentedString(isProjectDefault)).append("\n");
        sb.append("    isSystemSet: ").append(toIndentedString(isSystemSet)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    canSetDefault: ").append(toIndentedString(canSetDefault)).append("\n");
        sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
        sb.append("    childSets: ").append(toIndentedString(childSets)).append("\n");
        sb.append("    isReliable: ").append(toIndentedString(isReliable)).append("\n");
        sb.append("    isRecommand: ").append(toIndentedString(isRecommand)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    defaultSet: ").append(toIndentedString(defaultSet)).append("\n");
        sb.append("    deptId: ").append(toIndentedString(deptId)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    reliableTag: ").append(toIndentedString(reliableTag)).append("\n");
        sb.append("    recommandType: ").append(toIndentedString(recommandType)).append("\n");
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
