package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情
 */
public class AtlasAssetEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifications")

    private List<AtlasClassificationInfo> classifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meanings")

    private List<TermAssignmentHeader> meanings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ship_attributes")

    private Object relationShipAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    public AtlasAssetEntity withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public AtlasAssetEntity withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public AtlasAssetEntity withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public AtlasAssetEntity withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public AtlasAssetEntity withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 修改人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public AtlasAssetEntity withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public AtlasAssetEntity withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public AtlasAssetEntity withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 展示
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public AtlasAssetEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 枚举值：ACTIVE、DELETED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AtlasAssetEntity withClassifications(List<AtlasClassificationInfo> classifications) {
        this.classifications = classifications;
        return this;
    }

    public AtlasAssetEntity addClassificationsItem(AtlasClassificationInfo classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    public AtlasAssetEntity withClassifications(Consumer<List<AtlasClassificationInfo>> classificationsSetter) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        classificationsSetter.accept(this.classifications);
        return this;
    }

    /**
     * 分类信息
     * @return classifications
     */
    public List<AtlasClassificationInfo> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<AtlasClassificationInfo> classifications) {
        this.classifications = classifications;
    }

    public AtlasAssetEntity withMeanings(List<TermAssignmentHeader> meanings) {
        this.meanings = meanings;
        return this;
    }

    public AtlasAssetEntity addMeaningsItem(TermAssignmentHeader meaningsItem) {
        if (this.meanings == null) {
            this.meanings = new ArrayList<>();
        }
        this.meanings.add(meaningsItem);
        return this;
    }

    public AtlasAssetEntity withMeanings(Consumer<List<TermAssignmentHeader>> meaningsSetter) {
        if (this.meanings == null) {
            this.meanings = new ArrayList<>();
        }
        meaningsSetter.accept(this.meanings);
        return this;
    }

    /**
     * 关联任务
     * @return meanings
     */
    public List<TermAssignmentHeader> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<TermAssignmentHeader> meanings) {
        this.meanings = meanings;
    }

    public AtlasAssetEntity withRelationShipAttributes(Object relationShipAttributes) {
        this.relationShipAttributes = relationShipAttributes;
        return this;
    }

    /**
     * 实体map Map<String, Object>
     * @return relationShipAttributes
     */
    public Object getRelationShipAttributes() {
        return relationShipAttributes;
    }

    public void setRelationShipAttributes(Object relationShipAttributes) {
        this.relationShipAttributes = relationShipAttributes;
    }

    public AtlasAssetEntity withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 实体map Map<String, Object>
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtlasAssetEntity atlasAssetEntity = (AtlasAssetEntity) o;
        return Objects.equals(this.typeName, atlasAssetEntity.typeName)
            && Objects.equals(this.guid, atlasAssetEntity.guid)
            && Objects.equals(this.version, atlasAssetEntity.version)
            && Objects.equals(this.updateTime, atlasAssetEntity.updateTime)
            && Objects.equals(this.updateUser, atlasAssetEntity.updateUser)
            && Objects.equals(this.createTime, atlasAssetEntity.createTime)
            && Objects.equals(this.createUser, atlasAssetEntity.createUser)
            && Objects.equals(this.displayText, atlasAssetEntity.displayText)
            && Objects.equals(this.status, atlasAssetEntity.status)
            && Objects.equals(this.classifications, atlasAssetEntity.classifications)
            && Objects.equals(this.meanings, atlasAssetEntity.meanings)
            && Objects.equals(this.relationShipAttributes, atlasAssetEntity.relationShipAttributes)
            && Objects.equals(this.attributes, atlasAssetEntity.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName,
            guid,
            version,
            updateTime,
            updateUser,
            createTime,
            createUser,
            displayText,
            status,
            classifications,
            meanings,
            relationShipAttributes,
            attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtlasAssetEntity {\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
        sb.append("    meanings: ").append(toIndentedString(meanings)).append("\n");
        sb.append("    relationShipAttributes: ").append(toIndentedString(relationShipAttributes)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
