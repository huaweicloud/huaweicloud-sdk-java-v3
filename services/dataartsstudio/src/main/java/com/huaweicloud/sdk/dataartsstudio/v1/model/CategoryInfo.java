package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目录树信息。
 */
public class CategoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_eng")

    private String nameEng;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_meaning")

    private String businessMeaning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_guid")

    private String parentGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "department")

    private String department;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_owner")

    private String dataOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_steward")

    private String dataSteward;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private List<String> database = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypt_bucket")

    private String obsEncryptBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private List<String> workspace = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<CategoryInfo> children = null;

    public CategoryInfo withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 主题目录guid。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public CategoryInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题目录名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 主题目录描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 主题目录编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CategoryInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 主题目录路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CategoryInfo withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 主题目录别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CategoryInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 主题目录级别。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CategoryInfo withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 主题目录排序。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CategoryInfo withNameEng(String nameEng) {
        this.nameEng = nameEng;
        return this;
    }

    /**
     * 主题目录英文名称。
     * @return nameEng
     */
    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public CategoryInfo withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 主题目录唯一标识名称。
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public CategoryInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资产创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CategoryInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资产修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CategoryInfo withBusinessMeaning(String businessMeaning) {
        this.businessMeaning = businessMeaning;
        return this;
    }

    /**
     * 业务意义。
     * @return businessMeaning
     */
    public String getBusinessMeaning() {
        return businessMeaning;
    }

    public void setBusinessMeaning(String businessMeaning) {
        this.businessMeaning = businessMeaning;
    }

    public CategoryInfo withParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
        return this;
    }

    /**
     * 父级目录guid。
     * @return parentGuid
     */
    public String getParentGuid() {
        return parentGuid;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public CategoryInfo withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * 主题目录部门。
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public CategoryInfo withDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
        return this;
    }

    /**
     * 数据owner所属部门。
     * @return dataOwner
     */
    public String getDataOwner() {
        return dataOwner;
    }

    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    public CategoryInfo withDataSteward(String dataSteward) {
        this.dataSteward = dataSteward;
        return this;
    }

    /**
     * 数据管家。
     * @return dataSteward
     */
    public String getDataSteward() {
        return dataSteward;
    }

    public void setDataSteward(String dataSteward) {
        this.dataSteward = dataSteward;
    }

    public CategoryInfo withDatabase(List<String> database) {
        this.database = database;
        return this;
    }

    public CategoryInfo addDatabaseItem(String databaseItem) {
        if (this.database == null) {
            this.database = new ArrayList<>();
        }
        this.database.add(databaseItem);
        return this;
    }

    public CategoryInfo withDatabase(Consumer<List<String>> databaseSetter) {
        if (this.database == null) {
            this.database = new ArrayList<>();
        }
        databaseSetter.accept(this.database);
        return this;
    }

    /**
     * 数据库。
     * @return database
     */
    public List<String> getDatabase() {
        return database;
    }

    public void setDatabase(List<String> database) {
        this.database = database;
    }

    public CategoryInfo withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * obs桶。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public CategoryInfo withObsEncryptBucket(String obsEncryptBucket) {
        this.obsEncryptBucket = obsEncryptBucket;
        return this;
    }

    /**
     * obs加密桶。
     * @return obsEncryptBucket
     */
    public String getObsEncryptBucket() {
        return obsEncryptBucket;
    }

    public void setObsEncryptBucket(String obsEncryptBucket) {
        this.obsEncryptBucket = obsEncryptBucket;
    }

    public CategoryInfo withWorkspace(List<String> workspace) {
        this.workspace = workspace;
        return this;
    }

    public CategoryInfo addWorkspaceItem(String workspaceItem) {
        if (this.workspace == null) {
            this.workspace = new ArrayList<>();
        }
        this.workspace.add(workspaceItem);
        return this;
    }

    public CategoryInfo withWorkspace(Consumer<List<String>> workspaceSetter) {
        if (this.workspace == null) {
            this.workspace = new ArrayList<>();
        }
        workspaceSetter.accept(this.workspace);
        return this;
    }

    /**
     * 所属空间。
     * @return workspace
     */
    public List<String> getWorkspace() {
        return workspace;
    }

    public void setWorkspace(List<String> workspace) {
        this.workspace = workspace;
    }

    public CategoryInfo withChildren(List<CategoryInfo> children) {
        this.children = children;
        return this;
    }

    public CategoryInfo addChildrenItem(CategoryInfo childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public CategoryInfo withChildren(Consumer<List<CategoryInfo>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子级目录列表。
     * @return children
     */
    public List<CategoryInfo> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryInfo> children) {
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
        CategoryInfo that = (CategoryInfo) obj;
        return Objects.equals(this.guid, that.guid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.code, that.code)
            && Objects.equals(this.path, that.path) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.level, that.level) && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.nameEng, that.nameEng) && Objects.equals(this.qualifiedName, that.qualifiedName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.businessMeaning, that.businessMeaning)
            && Objects.equals(this.parentGuid, that.parentGuid) && Objects.equals(this.department, that.department)
            && Objects.equals(this.dataOwner, that.dataOwner) && Objects.equals(this.dataSteward, that.dataSteward)
            && Objects.equals(this.database, that.database) && Objects.equals(this.obsBucket, that.obsBucket)
            && Objects.equals(this.obsEncryptBucket, that.obsEncryptBucket)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid,
            name,
            description,
            code,
            path,
            alias,
            level,
            ordinal,
            nameEng,
            qualifiedName,
            createTime,
            updateTime,
            businessMeaning,
            parentGuid,
            department,
            dataOwner,
            dataSteward,
            database,
            obsBucket,
            obsEncryptBucket,
            workspace,
            children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryInfo {\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    nameEng: ").append(toIndentedString(nameEng)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    businessMeaning: ").append(toIndentedString(businessMeaning)).append("\n");
        sb.append("    parentGuid: ").append(toIndentedString(parentGuid)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    dataOwner: ").append(toIndentedString(dataOwner)).append("\n");
        sb.append("    dataSteward: ").append(toIndentedString(dataSteward)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    obsEncryptBucket: ").append(toIndentedString(obsEncryptBucket)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
