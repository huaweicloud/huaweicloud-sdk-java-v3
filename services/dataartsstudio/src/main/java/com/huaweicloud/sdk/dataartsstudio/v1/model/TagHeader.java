package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagHeader
 */
public class TagHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dexcription")

    private Object dexcription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_guid")

    private String relationGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_guid")

    private String tagGuid;

    public TagHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagHeader withDexcription(Object dexcription) {
        this.dexcription = dexcription;
        return this;
    }

    /**
     * 标签描述
     * @return dexcription
     */
    public Object getDexcription() {
        return dexcription;
    }

    public void setDexcription(Object dexcription) {
        this.dexcription = dexcription;
    }

    public TagHeader withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 标签的名称
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public TagHeader withRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * 关联的guid
     * @return relationGuid
     */
    public String getRelationGuid() {
        return relationGuid;
    }

    public void setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
    }

    public TagHeader withTagGuid(String tagGuid) {
        this.tagGuid = tagGuid;
        return this;
    }

    /**
     * 标签关联的guid
     * @return tagGuid
     */
    public String getTagGuid() {
        return tagGuid;
    }

    public void setTagGuid(String tagGuid) {
        this.tagGuid = tagGuid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagHeader tagHeader = (TagHeader) o;
        return Objects.equals(this.name, tagHeader.name) && Objects.equals(this.dexcription, tagHeader.dexcription)
            && Objects.equals(this.displayText, tagHeader.displayText)
            && Objects.equals(this.relationGuid, tagHeader.relationGuid)
            && Objects.equals(this.tagGuid, tagHeader.tagGuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dexcription, displayText, relationGuid, tagGuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagHeader {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dexcription: ").append(toIndentedString(dexcription)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    relationGuid: ").append(toIndentedString(relationGuid)).append("\n");
        sb.append("    tagGuid: ").append(toIndentedString(tagGuid)).append("\n");
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
