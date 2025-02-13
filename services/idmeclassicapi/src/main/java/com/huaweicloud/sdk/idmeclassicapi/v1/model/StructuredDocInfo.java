package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StructuredDocInfo
 */
public class StructuredDocInfo {

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

    public StructuredDocInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  文档ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StructuredDocInfo withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * **参数解释**：  kooPage文档ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public StructuredDocInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**：  文档标题。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StructuredDocInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  文档类型。  **约束限制**：  不涉及。  **取值范围**：  - directory：目录。 - pageDocument：Page文档。 - boardDocument：Board文档。 - mindDocument：Mind文档。 - drawDocument：Draw文档。  **默认取值**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StructuredDocInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释**：  模板ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public StructuredDocInfo withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释**：  团队ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public StructuredDocInfo withWikiId(String wikiId) {
        this.wikiId = wikiId;
        return this;
    }

    /**
     * **参数解释**：  知识库ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return wikiId
     */
    public String getWikiId() {
        return wikiId;
    }

    public void setWikiId(String wikiId) {
        this.wikiId = wikiId;
    }

    public StructuredDocInfo withParentDocumentId(String parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
        return this;
    }

    /**
     * **参数解释**：  父文档ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return parentDocumentId
     */
    public String getParentDocumentId() {
        return parentDocumentId;
    }

    public void setParentDocumentId(String parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
    }

    public StructuredDocInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public StructuredDocInfo withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释**：  模型名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public StructuredDocInfo withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * **参数解释**：  创建者ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public StructuredDocInfo withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释**：  修改人。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
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
        StructuredDocInfo that = (StructuredDocInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.documentId, that.documentId)
            && Objects.equals(this.title, that.title) && Objects.equals(this.type, that.type)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.organizationId, that.organizationId) && Objects.equals(this.wikiId, that.wikiId)
            && Objects.equals(this.parentDocumentId, that.parentDocumentId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.createUserId, that.createUserId) && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
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
        sb.append("class StructuredDocInfo {\n");
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
