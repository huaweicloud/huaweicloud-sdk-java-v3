package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PersistableModelQueryViewDTO
 */
public class PersistableModelQueryViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

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

    private List<EXAValueViewDTO> extAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder")

    private FolderQueryViewDTO folder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantQueryViewDTO tenant;

    public PersistableModelQueryViewDTO withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 类名。
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public PersistableModelQueryViewDTO withCreateTime(String createTime) {
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

    public PersistableModelQueryViewDTO withCreator(String creator) {
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

    public PersistableModelQueryViewDTO withDisableFlag(Boolean disableFlag) {
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

    public PersistableModelQueryViewDTO withExtAttrMap(Object extAttrMap) {
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

    public PersistableModelQueryViewDTO withExtAttrs(List<EXAValueViewDTO> extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }

    public PersistableModelQueryViewDTO addExtAttrsItem(EXAValueViewDTO extAttrsItem) {
        if (this.extAttrs == null) {
            this.extAttrs = new ArrayList<>();
        }
        this.extAttrs.add(extAttrsItem);
        return this;
    }

    public PersistableModelQueryViewDTO withExtAttrs(Consumer<List<EXAValueViewDTO>> extAttrsSetter) {
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
    public List<EXAValueViewDTO> getExtAttrs() {
        return extAttrs;
    }

    public void setExtAttrs(List<EXAValueViewDTO> extAttrs) {
        this.extAttrs = extAttrs;
    }

    public PersistableModelQueryViewDTO withFolder(FolderQueryViewDTO folder) {
        this.folder = folder;
        return this;
    }

    public PersistableModelQueryViewDTO withFolder(Consumer<FolderQueryViewDTO> folderSetter) {
        if (this.folder == null) {
            this.folder = new FolderQueryViewDTO();
            folderSetter.accept(this.folder);
        }

        return this;
    }

    /**
     * Get folder
     * @return folder
     */
    public FolderQueryViewDTO getFolder() {
        return folder;
    }

    public void setFolder(FolderQueryViewDTO folder) {
        this.folder = folder;
    }

    public PersistableModelQueryViewDTO withId(String id) {
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

    public PersistableModelQueryViewDTO withLastUpdateTime(String lastUpdateTime) {
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

    public PersistableModelQueryViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 修改人。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public PersistableModelQueryViewDTO withRdmExtensionType(String rdmExtensionType) {
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

    public PersistableModelQueryViewDTO withTenant(TenantQueryViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public PersistableModelQueryViewDTO withTenant(Consumer<TenantQueryViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantQueryViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantQueryViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(TenantQueryViewDTO tenant) {
        this.tenant = tenant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistableModelQueryViewDTO that = (PersistableModelQueryViewDTO) obj;
        return Objects.equals(this.className, that.className) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.disableFlag, that.disableFlag)
            && Objects.equals(this.extAttrMap, that.extAttrMap) && Objects.equals(this.extAttrs, that.extAttrs)
            && Objects.equals(this.folder, that.folder) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className,
            createTime,
            creator,
            disableFlag,
            extAttrMap,
            extAttrs,
            folder,
            id,
            lastUpdateTime,
            modifier,
            rdmExtensionType,
            tenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistableModelQueryViewDTO {\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    disableFlag: ").append(toIndentedString(disableFlag)).append("\n");
        sb.append("    extAttrMap: ").append(toIndentedString(extAttrMap)).append("\n");
        sb.append("    extAttrs: ").append(toIndentedString(extAttrs)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
