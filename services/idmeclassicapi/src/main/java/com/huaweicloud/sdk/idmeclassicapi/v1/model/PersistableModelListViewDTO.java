package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PersistableModelListViewDTO
 */
public class PersistableModelListViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aclEntry")

    private String aclEntry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clsAttrs")

    private List<Object> clsAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disableFlag")

    private Boolean disableFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder")

    private ObjectReferenceViewDTO folder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fullPath")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leafFlag")

    private Boolean leafFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleState")

    private ObjectReferenceViewDTO lifecycleState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleTemplate")

    private ObjectReferenceViewDTO lifecycleTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentNode")

    private ObjectReferenceViewDTO parentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rawFullPath")

    private String rawFullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmDeleteFlag")

    private Integer rdmDeleteFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmVersion")

    private Integer rdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootNode")

    private ObjectReferenceViewDTO rootNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private ObjectReferenceViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniqueKey")

    private String uniqueKey;

    public PersistableModelListViewDTO withAclEntry(String aclEntry) {
        this.aclEntry = aclEntry;
        return this;
    }

    /**
     * **参数解释：**  访问控制列表。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return aclEntry
     */
    public String getAclEntry() {
        return aclEntry;
    }

    public void setAclEntry(String aclEntry) {
        this.aclEntry = aclEntry;
    }

    public PersistableModelListViewDTO withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * **参数解释：**  类名。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public PersistableModelListViewDTO withClsAttrs(List<Object> clsAttrs) {
        this.clsAttrs = clsAttrs;
        return this;
    }

    public PersistableModelListViewDTO addClsAttrsItem(Object clsAttrsItem) {
        if (this.clsAttrs == null) {
            this.clsAttrs = new ArrayList<>();
        }
        this.clsAttrs.add(clsAttrsItem);
        return this;
    }

    public PersistableModelListViewDTO withClsAttrs(Consumer<List<Object>> clsAttrsSetter) {
        if (this.clsAttrs == null) {
            this.clsAttrs = new ArrayList<>();
        }
        clsAttrsSetter.accept(this.clsAttrs);
        return this;
    }

    /**
     * **参数解释：**  分类属性。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return clsAttrs
     */
    public List<Object> getClsAttrs() {
        return clsAttrs;
    }

    public void setClsAttrs(List<Object> clsAttrs) {
        this.clsAttrs = clsAttrs;
    }

    public PersistableModelListViewDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：**  创建时间。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PersistableModelListViewDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：**  创建者。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public PersistableModelListViewDTO withDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
        return this;
    }

    /**
     * **参数解释：**  失效标识。   **取值范围：**  - true：失效。  - false：未失效。  **默认取值：**  不涉及。 
     * @return disableFlag
     */
    public Boolean getDisableFlag() {
        return disableFlag;
    }

    public void setDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
    }

    public PersistableModelListViewDTO withFolder(ObjectReferenceViewDTO folder) {
        this.folder = folder;
        return this;
    }

    public PersistableModelListViewDTO withFolder(Consumer<ObjectReferenceViewDTO> folderSetter) {
        if (this.folder == null) {
            this.folder = new ObjectReferenceViewDTO();
            folderSetter.accept(this.folder);
        }

        return this;
    }

    /**
     * Get folder
     * @return folder
     */
    public ObjectReferenceViewDTO getFolder() {
        return folder;
    }

    public void setFolder(ObjectReferenceViewDTO folder) {
        this.folder = folder;
    }

    public PersistableModelListViewDTO withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * **参数解释：**  用于存储当前节点全路径。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public PersistableModelListViewDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  唯一标识。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersistableModelListViewDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：**  最后更新时间。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public PersistableModelListViewDTO withLeafFlag(Boolean leafFlag) {
        this.leafFlag = leafFlag;
        return this;
    }

    /**
     * **参数解释：**  是否为叶子节点。  **取值范围：**  - true：是叶子节点。 - false：不是叶子节点。  **默认取值：**  false。 
     * @return leafFlag
     */
    public Boolean getLeafFlag() {
        return leafFlag;
    }

    public void setLeafFlag(Boolean leafFlag) {
        this.leafFlag = leafFlag;
    }

    public PersistableModelListViewDTO withLifecycleState(ObjectReferenceViewDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    public PersistableModelListViewDTO withLifecycleState(Consumer<ObjectReferenceViewDTO> lifecycleStateSetter) {
        if (this.lifecycleState == null) {
            this.lifecycleState = new ObjectReferenceViewDTO();
            lifecycleStateSetter.accept(this.lifecycleState);
        }

        return this;
    }

    /**
     * Get lifecycleState
     * @return lifecycleState
     */
    public ObjectReferenceViewDTO getLifecycleState() {
        return lifecycleState;
    }

    public void setLifecycleState(ObjectReferenceViewDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public PersistableModelListViewDTO withLifecycleTemplate(ObjectReferenceViewDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
        return this;
    }

    public PersistableModelListViewDTO withLifecycleTemplate(Consumer<ObjectReferenceViewDTO> lifecycleTemplateSetter) {
        if (this.lifecycleTemplate == null) {
            this.lifecycleTemplate = new ObjectReferenceViewDTO();
            lifecycleTemplateSetter.accept(this.lifecycleTemplate);
        }

        return this;
    }

    /**
     * Get lifecycleTemplate
     * @return lifecycleTemplate
     */
    public ObjectReferenceViewDTO getLifecycleTemplate() {
        return lifecycleTemplate;
    }

    public void setLifecycleTemplate(ObjectReferenceViewDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
    }

    public PersistableModelListViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public PersistableModelListViewDTO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：**  拥有者。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PersistableModelListViewDTO withParentNode(ObjectReferenceViewDTO parentNode) {
        this.parentNode = parentNode;
        return this;
    }

    public PersistableModelListViewDTO withParentNode(Consumer<ObjectReferenceViewDTO> parentNodeSetter) {
        if (this.parentNode == null) {
            this.parentNode = new ObjectReferenceViewDTO();
            parentNodeSetter.accept(this.parentNode);
        }

        return this;
    }

    /**
     * Get parentNode
     * @return parentNode
     */
    public ObjectReferenceViewDTO getParentNode() {
        return parentNode;
    }

    public void setParentNode(ObjectReferenceViewDTO parentNode) {
        this.parentNode = parentNode;
    }

    public PersistableModelListViewDTO withRawFullPath(String rawFullPath) {
        this.rawFullPath = rawFullPath;
        return this;
    }

    /**
     * **参数解释：**  用于存储当前节点原始全路径。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return rawFullPath
     */
    public String getRawFullPath() {
        return rawFullPath;
    }

    public void setRawFullPath(String rawFullPath) {
        this.rawFullPath = rawFullPath;
    }

    public PersistableModelListViewDTO withRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
        return this;
    }

    /**
     * **参数解释：**  软删除标识。  **取值范围：**  - 0：表示未删除。 - 1：表示已删除。  **默认取值：**  0。 
     * @return rdmDeleteFlag
     */
    public Integer getRdmDeleteFlag() {
        return rdmDeleteFlag;
    }

    public void setRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
    }

    public PersistableModelListViewDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * **参数解释：**  扩展类型。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public PersistableModelListViewDTO withRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
        return this;
    }

    /**
     * **参数解释：**  系统版本。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return rdmVersion
     */
    public Integer getRdmVersion() {
        return rdmVersion;
    }

    public void setRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
    }

    public PersistableModelListViewDTO withRootNode(ObjectReferenceViewDTO rootNode) {
        this.rootNode = rootNode;
        return this;
    }

    public PersistableModelListViewDTO withRootNode(Consumer<ObjectReferenceViewDTO> rootNodeSetter) {
        if (this.rootNode == null) {
            this.rootNode = new ObjectReferenceViewDTO();
            rootNodeSetter.accept(this.rootNode);
        }

        return this;
    }

    /**
     * Get rootNode
     * @return rootNode
     */
    public ObjectReferenceViewDTO getRootNode() {
        return rootNode;
    }

    public void setRootNode(ObjectReferenceViewDTO rootNode) {
        this.rootNode = rootNode;
    }

    public PersistableModelListViewDTO withTenant(ObjectReferenceViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public PersistableModelListViewDTO withTenant(Consumer<ObjectReferenceViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new ObjectReferenceViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public ObjectReferenceViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(ObjectReferenceViewDTO tenant) {
        this.tenant = tenant;
    }

    public PersistableModelListViewDTO withUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }

    /**
     * **参数解释：**  示例模型的唯一键约束属性。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return uniqueKey
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistableModelListViewDTO that = (PersistableModelListViewDTO) obj;
        return Objects.equals(this.aclEntry, that.aclEntry) && Objects.equals(this.className, that.className)
            && Objects.equals(this.clsAttrs, that.clsAttrs) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.disableFlag, that.disableFlag)
            && Objects.equals(this.folder, that.folder) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.id, that.id) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.leafFlag, that.leafFlag) && Objects.equals(this.lifecycleState, that.lifecycleState)
            && Objects.equals(this.lifecycleTemplate, that.lifecycleTemplate)
            && Objects.equals(this.modifier, that.modifier) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.parentNode, that.parentNode) && Objects.equals(this.rawFullPath, that.rawFullPath)
            && Objects.equals(this.rdmDeleteFlag, that.rdmDeleteFlag)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType)
            && Objects.equals(this.rdmVersion, that.rdmVersion) && Objects.equals(this.rootNode, that.rootNode)
            && Objects.equals(this.tenant, that.tenant) && Objects.equals(this.uniqueKey, that.uniqueKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclEntry,
            className,
            clsAttrs,
            createTime,
            creator,
            disableFlag,
            folder,
            fullPath,
            id,
            lastUpdateTime,
            leafFlag,
            lifecycleState,
            lifecycleTemplate,
            modifier,
            owner,
            parentNode,
            rawFullPath,
            rdmDeleteFlag,
            rdmExtensionType,
            rdmVersion,
            rootNode,
            tenant,
            uniqueKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistableModelListViewDTO {\n");
        sb.append("    aclEntry: ").append(toIndentedString(aclEntry)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    clsAttrs: ").append(toIndentedString(clsAttrs)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    disableFlag: ").append(toIndentedString(disableFlag)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    leafFlag: ").append(toIndentedString(leafFlag)).append("\n");
        sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
        sb.append("    lifecycleTemplate: ").append(toIndentedString(lifecycleTemplate)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
        sb.append("    rawFullPath: ").append(toIndentedString(rawFullPath)).append("\n");
        sb.append("    rdmDeleteFlag: ").append(toIndentedString(rdmDeleteFlag)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    rootNode: ").append(toIndentedString(rootNode)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
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
