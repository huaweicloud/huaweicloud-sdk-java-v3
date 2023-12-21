package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PersistableModelSaveDTO
 */
public class PersistableModelSaveDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aclEntry")

    private String aclEntry;

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
    @JsonProperty(value = "extAttrMap")

    private Object extAttrMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extAttrs")

    private List<EXAValueParamDTO> extAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder")

    private ObjectReferenceParamDTO folder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleState")

    private ObjectReferenceParamDTO lifecycleState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleTemplate")

    private ObjectReferenceParamDTO lifecycleTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needSetNullAttrs")

    private List<String> needSetNullAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentNode")

    private ObjectReferenceParamDTO parentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private ObjectReferenceParamDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniqueKey")

    private String uniqueKey;

    public PersistableModelSaveDTO withAclEntry(String aclEntry) {
        this.aclEntry = aclEntry;
        return this;
    }

    /**
     * 访问控制列表。
     * @return aclEntry
     */
    public String getAclEntry() {
        return aclEntry;
    }

    public void setAclEntry(String aclEntry) {
        this.aclEntry = aclEntry;
    }

    public PersistableModelSaveDTO withClsAttrs(List<Object> clsAttrs) {
        this.clsAttrs = clsAttrs;
        return this;
    }

    public PersistableModelSaveDTO addClsAttrsItem(Object clsAttrsItem) {
        if (this.clsAttrs == null) {
            this.clsAttrs = new ArrayList<>();
        }
        this.clsAttrs.add(clsAttrsItem);
        return this;
    }

    public PersistableModelSaveDTO withClsAttrs(Consumer<List<Object>> clsAttrsSetter) {
        if (this.clsAttrs == null) {
            this.clsAttrs = new ArrayList<>();
        }
        clsAttrsSetter.accept(this.clsAttrs);
        return this;
    }

    /**
     * 分类属性。
     * @return clsAttrs
     */
    public List<Object> getClsAttrs() {
        return clsAttrs;
    }

    public void setClsAttrs(List<Object> clsAttrs) {
        this.clsAttrs = clsAttrs;
    }

    public PersistableModelSaveDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PersistableModelSaveDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public PersistableModelSaveDTO withDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
        return this;
    }

    /**
     * 失效标识。  - true：失效。  - false：未失效。
     * @return disableFlag
     */
    public Boolean getDisableFlag() {
        return disableFlag;
    }

    public void setDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
    }

    public PersistableModelSaveDTO withExtAttrMap(Object extAttrMap) {
        this.extAttrMap = extAttrMap;
        return this;
    }

    /**
     * 扩展属性映射集。
     * @return extAttrMap
     */
    public Object getExtAttrMap() {
        return extAttrMap;
    }

    public void setExtAttrMap(Object extAttrMap) {
        this.extAttrMap = extAttrMap;
    }

    public PersistableModelSaveDTO withExtAttrs(List<EXAValueParamDTO> extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }

    public PersistableModelSaveDTO addExtAttrsItem(EXAValueParamDTO extAttrsItem) {
        if (this.extAttrs == null) {
            this.extAttrs = new ArrayList<>();
        }
        this.extAttrs.add(extAttrsItem);
        return this;
    }

    public PersistableModelSaveDTO withExtAttrs(Consumer<List<EXAValueParamDTO>> extAttrsSetter) {
        if (this.extAttrs == null) {
            this.extAttrs = new ArrayList<>();
        }
        extAttrsSetter.accept(this.extAttrs);
        return this;
    }

    /**
     * 扩展属性列表。
     * @return extAttrs
     */
    public List<EXAValueParamDTO> getExtAttrs() {
        return extAttrs;
    }

    public void setExtAttrs(List<EXAValueParamDTO> extAttrs) {
        this.extAttrs = extAttrs;
    }

    public PersistableModelSaveDTO withFolder(ObjectReferenceParamDTO folder) {
        this.folder = folder;
        return this;
    }

    public PersistableModelSaveDTO withFolder(Consumer<ObjectReferenceParamDTO> folderSetter) {
        if (this.folder == null) {
            this.folder = new ObjectReferenceParamDTO();
            folderSetter.accept(this.folder);
        }

        return this;
    }

    /**
     * Get folder
     * @return folder
     */
    public ObjectReferenceParamDTO getFolder() {
        return folder;
    }

    public void setFolder(ObjectReferenceParamDTO folder) {
        this.folder = folder;
    }

    public PersistableModelSaveDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersistableModelSaveDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public PersistableModelSaveDTO withLifecycleState(ObjectReferenceParamDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    public PersistableModelSaveDTO withLifecycleState(Consumer<ObjectReferenceParamDTO> lifecycleStateSetter) {
        if (this.lifecycleState == null) {
            this.lifecycleState = new ObjectReferenceParamDTO();
            lifecycleStateSetter.accept(this.lifecycleState);
        }

        return this;
    }

    /**
     * Get lifecycleState
     * @return lifecycleState
     */
    public ObjectReferenceParamDTO getLifecycleState() {
        return lifecycleState;
    }

    public void setLifecycleState(ObjectReferenceParamDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public PersistableModelSaveDTO withLifecycleTemplate(ObjectReferenceParamDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
        return this;
    }

    public PersistableModelSaveDTO withLifecycleTemplate(Consumer<ObjectReferenceParamDTO> lifecycleTemplateSetter) {
        if (this.lifecycleTemplate == null) {
            this.lifecycleTemplate = new ObjectReferenceParamDTO();
            lifecycleTemplateSetter.accept(this.lifecycleTemplate);
        }

        return this;
    }

    /**
     * Get lifecycleTemplate
     * @return lifecycleTemplate
     */
    public ObjectReferenceParamDTO getLifecycleTemplate() {
        return lifecycleTemplate;
    }

    public void setLifecycleTemplate(ObjectReferenceParamDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
    }

    public PersistableModelSaveDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 更新者。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public PersistableModelSaveDTO withNeedSetNullAttrs(List<String> needSetNullAttrs) {
        this.needSetNullAttrs = needSetNullAttrs;
        return this;
    }

    public PersistableModelSaveDTO addNeedSetNullAttrsItem(String needSetNullAttrsItem) {
        if (this.needSetNullAttrs == null) {
            this.needSetNullAttrs = new ArrayList<>();
        }
        this.needSetNullAttrs.add(needSetNullAttrsItem);
        return this;
    }

    public PersistableModelSaveDTO withNeedSetNullAttrs(Consumer<List<String>> needSetNullAttrsSetter) {
        if (this.needSetNullAttrs == null) {
            this.needSetNullAttrs = new ArrayList<>();
        }
        needSetNullAttrsSetter.accept(this.needSetNullAttrs);
        return this;
    }

    /**
     * 设置NULL值的属性名称。
     * @return needSetNullAttrs
     */
    public List<String> getNeedSetNullAttrs() {
        return needSetNullAttrs;
    }

    public void setNeedSetNullAttrs(List<String> needSetNullAttrs) {
        this.needSetNullAttrs = needSetNullAttrs;
    }

    public PersistableModelSaveDTO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 拥有者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PersistableModelSaveDTO withParentNode(ObjectReferenceParamDTO parentNode) {
        this.parentNode = parentNode;
        return this;
    }

    public PersistableModelSaveDTO withParentNode(Consumer<ObjectReferenceParamDTO> parentNodeSetter) {
        if (this.parentNode == null) {
            this.parentNode = new ObjectReferenceParamDTO();
            parentNodeSetter.accept(this.parentNode);
        }

        return this;
    }

    /**
     * Get parentNode
     * @return parentNode
     */
    public ObjectReferenceParamDTO getParentNode() {
        return parentNode;
    }

    public void setParentNode(ObjectReferenceParamDTO parentNode) {
        this.parentNode = parentNode;
    }

    public PersistableModelSaveDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * 扩展类型。
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public PersistableModelSaveDTO withTenant(ObjectReferenceParamDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public PersistableModelSaveDTO withTenant(Consumer<ObjectReferenceParamDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new ObjectReferenceParamDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public ObjectReferenceParamDTO getTenant() {
        return tenant;
    }

    public void setTenant(ObjectReferenceParamDTO tenant) {
        this.tenant = tenant;
    }

    public PersistableModelSaveDTO withUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }

    /**
     * 示例模型的唯一键属性。
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
        PersistableModelSaveDTO that = (PersistableModelSaveDTO) obj;
        return Objects.equals(this.aclEntry, that.aclEntry) && Objects.equals(this.clsAttrs, that.clsAttrs)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.disableFlag, that.disableFlag) && Objects.equals(this.extAttrMap, that.extAttrMap)
            && Objects.equals(this.extAttrs, that.extAttrs) && Objects.equals(this.folder, that.folder)
            && Objects.equals(this.id, that.id) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.lifecycleState, that.lifecycleState)
            && Objects.equals(this.lifecycleTemplate, that.lifecycleTemplate)
            && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.needSetNullAttrs, that.needSetNullAttrs) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.parentNode, that.parentNode)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.uniqueKey, that.uniqueKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclEntry,
            clsAttrs,
            createTime,
            creator,
            disableFlag,
            extAttrMap,
            extAttrs,
            folder,
            id,
            lastUpdateTime,
            lifecycleState,
            lifecycleTemplate,
            modifier,
            needSetNullAttrs,
            owner,
            parentNode,
            rdmExtensionType,
            tenant,
            uniqueKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistableModelSaveDTO {\n");
        sb.append("    aclEntry: ").append(toIndentedString(aclEntry)).append("\n");
        sb.append("    clsAttrs: ").append(toIndentedString(clsAttrs)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    disableFlag: ").append(toIndentedString(disableFlag)).append("\n");
        sb.append("    extAttrMap: ").append(toIndentedString(extAttrMap)).append("\n");
        sb.append("    extAttrs: ").append(toIndentedString(extAttrs)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
        sb.append("    lifecycleTemplate: ").append(toIndentedString(lifecycleTemplate)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    needSetNullAttrs: ").append(toIndentedString(needSetNullAttrs)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
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
