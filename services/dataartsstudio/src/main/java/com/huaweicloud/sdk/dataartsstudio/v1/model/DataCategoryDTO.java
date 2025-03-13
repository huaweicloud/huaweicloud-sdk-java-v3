package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataCategoryDTO
 */
public class DataCategoryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_level")

    private Integer categoryLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_list")

    private List<DataClassificationRuleQueryDTO> ruleList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_path")

    private String categoryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronize")

    private Boolean synchronize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<DataCategoryDTO> children = null;

    public DataCategoryDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类id
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public DataCategoryDTO withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * 分类名称
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public DataCategoryDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 分类描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataCategoryDTO withCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
        return this;
    }

    /**
     * 分类层级
     * minimum: 1
     * maximum: 128
     * @return categoryLevel
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public DataCategoryDTO withRuleList(List<DataClassificationRuleQueryDTO> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    public DataCategoryDTO addRuleListItem(DataClassificationRuleQueryDTO ruleListItem) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        this.ruleList.add(ruleListItem);
        return this;
    }

    public DataCategoryDTO withRuleList(Consumer<List<DataClassificationRuleQueryDTO>> ruleListSetter) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        ruleListSetter.accept(this.ruleList);
        return this;
    }

    /**
     * 识别规则
     * @return ruleList
     */
    public List<DataClassificationRuleQueryDTO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<DataClassificationRuleQueryDTO> ruleList) {
        this.ruleList = ruleList;
    }

    public DataCategoryDTO withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 分类树根节点
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public DataCategoryDTO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父分类节点
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DataCategoryDTO withCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
        return this;
    }

    /**
     * 分类树路径
     * @return categoryPath
     */
    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public DataCategoryDTO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public DataCategoryDTO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DataCategoryDTO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新者
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public DataCategoryDTO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 2147483647
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public DataCategoryDTO withProjectId(String projectId) {
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

    public DataCategoryDTO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DataCategoryDTO withSynchronize(Boolean synchronize) {
        this.synchronize = synchronize;
        return this;
    }

    /**
     * 同步（默认都同步资产）
     * @return synchronize
     */
    public Boolean getSynchronize() {
        return synchronize;
    }

    public void setSynchronize(Boolean synchronize) {
        this.synchronize = synchronize;
    }

    public DataCategoryDTO withChildren(List<DataCategoryDTO> children) {
        this.children = children;
        return this;
    }

    public DataCategoryDTO addChildrenItem(DataCategoryDTO childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public DataCategoryDTO withChildren(Consumer<List<DataCategoryDTO>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子分类
     * @return children
     */
    public List<DataCategoryDTO> getChildren() {
        return children;
    }

    public void setChildren(List<DataCategoryDTO> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataCategoryDTO that = (DataCategoryDTO) obj;
        return Objects.equals(this.categoryId, that.categoryId) && Objects.equals(this.categoryName, that.categoryName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.categoryLevel, that.categoryLevel) && Objects.equals(this.ruleList, that.ruleList)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.categoryPath, that.categoryPath) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.synchronize, that.synchronize)
            && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId,
            categoryName,
            description,
            categoryLevel,
            ruleList,
            rootId,
            parentId,
            categoryPath,
            createBy,
            createTime,
            updateBy,
            updateTime,
            projectId,
            instanceId,
            synchronize,
            children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataCategoryDTO {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryLevel: ").append(toIndentedString(categoryLevel)).append("\n");
        sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    synchronize: ").append(toIndentedString(synchronize)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
