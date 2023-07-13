package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情
 */
public class AtlasEntityHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_names")

    private List<String> classificationNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifications")

    private List<AtlasClassificationInfo> classifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meaning_names")

    private List<String> meaningNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meanings")

    private List<TermAssignmentHeader> meanings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private Object children;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    public AtlasEntityHeader withTypeName(String typeName) {
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

    public AtlasEntityHeader withGuid(String guid) {
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

    public AtlasEntityHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AtlasEntityHeader withDisplayText(String displayText) {
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

    public AtlasEntityHeader withStatus(String status) {
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

    public AtlasEntityHeader withClassificationNames(List<String> classificationNames) {
        this.classificationNames = classificationNames;
        return this;
    }

    public AtlasEntityHeader addClassificationNamesItem(String classificationNamesItem) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        this.classificationNames.add(classificationNamesItem);
        return this;
    }

    public AtlasEntityHeader withClassificationNames(Consumer<List<String>> classificationNamesSetter) {
        if (this.classificationNames == null) {
            this.classificationNames = new ArrayList<>();
        }
        classificationNamesSetter.accept(this.classificationNames);
        return this;
    }

    /**
     * Get classificationNames
     * @return classificationNames
     */
    public List<String> getClassificationNames() {
        return classificationNames;
    }

    public void setClassificationNames(List<String> classificationNames) {
        this.classificationNames = classificationNames;
    }

    public AtlasEntityHeader withClassifications(List<AtlasClassificationInfo> classifications) {
        this.classifications = classifications;
        return this;
    }

    public AtlasEntityHeader addClassificationsItem(AtlasClassificationInfo classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    public AtlasEntityHeader withClassifications(Consumer<List<AtlasClassificationInfo>> classificationsSetter) {
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

    public AtlasEntityHeader withMeaningNames(List<String> meaningNames) {
        this.meaningNames = meaningNames;
        return this;
    }

    public AtlasEntityHeader addMeaningNamesItem(String meaningNamesItem) {
        if (this.meaningNames == null) {
            this.meaningNames = new ArrayList<>();
        }
        this.meaningNames.add(meaningNamesItem);
        return this;
    }

    public AtlasEntityHeader withMeaningNames(Consumer<List<String>> meaningNamesSetter) {
        if (this.meaningNames == null) {
            this.meaningNames = new ArrayList<>();
        }
        meaningNamesSetter.accept(this.meaningNames);
        return this;
    }

    /**
     * Get meaningNames
     * @return meaningNames
     */
    public List<String> getMeaningNames() {
        return meaningNames;
    }

    public void setMeaningNames(List<String> meaningNames) {
        this.meaningNames = meaningNames;
    }

    public AtlasEntityHeader withMeanings(List<TermAssignmentHeader> meanings) {
        this.meanings = meanings;
        return this;
    }

    public AtlasEntityHeader addMeaningsItem(TermAssignmentHeader meaningsItem) {
        if (this.meanings == null) {
            this.meanings = new ArrayList<>();
        }
        this.meanings.add(meaningsItem);
        return this;
    }

    public AtlasEntityHeader withMeanings(Consumer<List<TermAssignmentHeader>> meaningsSetter) {
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

    public AtlasEntityHeader withChildren(Object children) {
        this.children = children;
        return this;
    }

    /**
     * 实体map Map<String, AtlasEntityHeader>
     * @return children
     */
    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }

    public AtlasEntityHeader withAttributes(Object attributes) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AtlasEntityHeader that = (AtlasEntityHeader) obj;
        return Objects.equals(this.typeName, that.typeName) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.name, that.name) && Objects.equals(this.displayText, that.displayText)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.classificationNames, that.classificationNames)
            && Objects.equals(this.classifications, that.classifications)
            && Objects.equals(this.meaningNames, that.meaningNames) && Objects.equals(this.meanings, that.meanings)
            && Objects.equals(this.children, that.children) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName,
            guid,
            name,
            displayText,
            status,
            classificationNames,
            classifications,
            meaningNames,
            meanings,
            children,
            attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtlasEntityHeader {\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    classificationNames: ").append(toIndentedString(classificationNames)).append("\n");
        sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
        sb.append("    meaningNames: ").append(toIndentedString(meaningNames)).append("\n");
        sb.append("    meanings: ").append(toIndentedString(meanings)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
