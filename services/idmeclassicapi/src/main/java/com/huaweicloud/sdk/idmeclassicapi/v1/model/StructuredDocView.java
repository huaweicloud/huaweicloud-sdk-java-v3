package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StructuredDocView
 */
public class StructuredDocView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmVersion")

    private Integer rdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmDeleteFlag")

    private Integer rdmDeleteFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clazz")

    private String clazz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiki_id")

    private String wikiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_document_id")

    private String parentDocumentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public StructuredDocView withCreator(String creator) {
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

    public StructuredDocView withCreateTime(String createTime) {
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

    public StructuredDocView withLastUpdateTime(String lastUpdateTime) {
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

    public StructuredDocView withRdmVersion(Integer rdmVersion) {
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

    public StructuredDocView withRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
        return this;
    }

    /**
     * **参数解释：**  软删除标识，参数值为0或1。  **取值范围：**  - 0：表示未删除。 - 1：表示已删除。  **默认取值：**  不涉及。
     * @return rdmDeleteFlag
     */
    public Integer getRdmDeleteFlag() {
        return rdmDeleteFlag;
    }

    public void setRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
    }

    public StructuredDocView withRdmExtensionType(String rdmExtensionType) {
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

    public StructuredDocView withTenant(TenantViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public StructuredDocView withTenant(Consumer<TenantViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(TenantViewDTO tenant) {
        this.tenant = tenant;
    }

    public StructuredDocView withClassName(String className) {
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

    public StructuredDocView withClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    /**
     * **参数解释：**  类名。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return clazz
     */
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public StructuredDocView withId(String id) {
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

    public StructuredDocView withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * **参数解释：**  kooPage文档ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public StructuredDocView withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：**  文档标题。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StructuredDocView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  文档类型。  **取值范围：**  - directory：目录。 - pageDocument：Page文档。 - boardDocument：Board文档。 - mindDocument：Mind文档。 - drawDocument：Draw文档。  **默认取值：**  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StructuredDocView withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释：**  模板ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public StructuredDocView withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释：**  团队ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public StructuredDocView withWikiId(String wikiId) {
        this.wikiId = wikiId;
        return this;
    }

    /**
     * **参数解释：**  知识库ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return wikiId
     */
    public String getWikiId() {
        return wikiId;
    }

    public void setWikiId(String wikiId) {
        this.wikiId = wikiId;
    }

    public StructuredDocView withParentDocumentId(String parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
        return this;
    }

    /**
     * **参数解释：**  父文档ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return parentDocumentId
     */
    public String getParentDocumentId() {
        return parentDocumentId;
    }

    public void setParentDocumentId(String parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
    }

    public StructuredDocView withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：**  实例ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public StructuredDocView withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：**  模型名称。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public StructuredDocView withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * **参数解释：**  创建者ID。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public StructuredDocView withModifier(String modifier) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StructuredDocView that = (StructuredDocView) obj;
        return Objects.equals(this.creator, that.creator) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.rdmVersion, that.rdmVersion)
            && Objects.equals(this.rdmDeleteFlag, that.rdmDeleteFlag)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.className, that.className) && Objects.equals(this.clazz, that.clazz)
            && Objects.equals(this.id, that.id) && Objects.equals(this.documentId, that.documentId)
            && Objects.equals(this.title, that.title) && Objects.equals(this.type, that.type)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.organizationId, that.organizationId) && Objects.equals(this.wikiId, that.wikiId)
            && Objects.equals(this.parentDocumentId, that.parentDocumentId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.createUserId, that.createUserId) && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator,
            createTime,
            lastUpdateTime,
            rdmVersion,
            rdmDeleteFlag,
            rdmExtensionType,
            tenant,
            className,
            clazz,
            id,
            documentId,
            title,
            type,
            templateId,
            organizationId,
            wikiId,
            parentDocumentId,
            instanceId,
            modelName,
            createUserId,
            modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructuredDocView {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    rdmDeleteFlag: ").append(toIndentedString(rdmDeleteFlag)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    clazz: ").append(toIndentedString(clazz)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    wikiId: ").append(toIndentedString(wikiId)).append("\n");
        sb.append("    parentDocumentId: ").append(toIndentedString(parentDocumentId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
