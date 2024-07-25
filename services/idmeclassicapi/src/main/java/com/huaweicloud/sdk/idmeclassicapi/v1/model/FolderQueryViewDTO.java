package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FolderQueryViewDTO
 */
public class FolderQueryViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "businessCode")

    private String businessCode;

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptionEn")

    private String descriptionEn;

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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameEn")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantQueryViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public FolderQueryViewDTO withBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }

    /**
     * **参数解释：**  编码。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return businessCode
     */
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public FolderQueryViewDTO withClassName(String className) {
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

    public FolderQueryViewDTO withCreateTime(String createTime) {
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

    public FolderQueryViewDTO withCreator(String creator) {
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

    public FolderQueryViewDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**  中文描述。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FolderQueryViewDTO withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * **参数解释：**  英文描述。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public FolderQueryViewDTO withDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
        return this;
    }

    /**
     * **参数解释：**  失效标识。  **取值范围：**  - true：失效。  - false：未失效。  **默认取值：**  false。 
     * @return disableFlag
     */
    public Boolean getDisableFlag() {
        return disableFlag;
    }

    public void setDisableFlag(Boolean disableFlag) {
        this.disableFlag = disableFlag;
    }

    public FolderQueryViewDTO withExtAttrMap(Object extAttrMap) {
        this.extAttrMap = extAttrMap;
        return this;
    }

    /**
     * **参数解释：**  扩展属性映射集。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return extAttrMap
     */
    public Object getExtAttrMap() {
        return extAttrMap;
    }

    public void setExtAttrMap(Object extAttrMap) {
        this.extAttrMap = extAttrMap;
    }

    public FolderQueryViewDTO withExtAttrs(List<EXAValueViewDTO> extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }

    public FolderQueryViewDTO addExtAttrsItem(EXAValueViewDTO extAttrsItem) {
        if (this.extAttrs == null) {
            this.extAttrs = new ArrayList<>();
        }
        this.extAttrs.add(extAttrsItem);
        return this;
    }

    public FolderQueryViewDTO withExtAttrs(Consumer<List<EXAValueViewDTO>> extAttrsSetter) {
        if (this.extAttrs == null) {
            this.extAttrs = new ArrayList<>();
        }
        extAttrsSetter.accept(this.extAttrs);
        return this;
    }

    /**
     * **参数解释：**  扩展属性列表。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return extAttrs
     */
    public List<EXAValueViewDTO> getExtAttrs() {
        return extAttrs;
    }

    public void setExtAttrs(List<EXAValueViewDTO> extAttrs) {
        this.extAttrs = extAttrs;
    }

    public FolderQueryViewDTO withId(String id) {
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

    public FolderQueryViewDTO withLastUpdateTime(String lastUpdateTime) {
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

    public FolderQueryViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  修改人。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public FolderQueryViewDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  中文名称。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FolderQueryViewDTO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * **参数解释：**  英文名称。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public FolderQueryViewDTO withRdmExtensionType(String rdmExtensionType) {
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

    public FolderQueryViewDTO withTenant(TenantQueryViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public FolderQueryViewDTO withTenant(Consumer<TenantQueryViewDTO> tenantSetter) {
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

    public FolderQueryViewDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  类别。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderQueryViewDTO that = (FolderQueryViewDTO) obj;
        return Objects.equals(this.businessCode, that.businessCode) && Objects.equals(this.className, that.className)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.disableFlag, that.disableFlag) && Objects.equals(this.extAttrMap, that.extAttrMap)
            && Objects.equals(this.extAttrs, that.extAttrs) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessCode,
            className,
            createTime,
            creator,
            description,
            descriptionEn,
            disableFlag,
            extAttrMap,
            extAttrs,
            id,
            lastUpdateTime,
            modifier,
            name,
            nameEn,
            rdmExtensionType,
            tenant,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderQueryViewDTO {\n");
        sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    disableFlag: ").append(toIndentedString(disableFlag)).append("\n");
        sb.append("    extAttrMap: ").append(toIndentedString(extAttrMap)).append("\n");
        sb.append("    extAttrs: ").append(toIndentedString(extAttrs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
