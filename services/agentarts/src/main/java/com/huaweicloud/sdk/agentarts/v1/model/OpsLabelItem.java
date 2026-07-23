package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 标注项的详细结构对象，包含基本元数据及可选值列表。 **取值范围：** 不涉及。
 */
public class OpsLabelItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enums")

    private List<OpsLabelValueItem> enums = null;

    public OpsLabelItem withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * **参数解释：** 标注的唯一标识符（ID）。 **取值范围：** 不涉及。
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public OpsLabelItem withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释：** 创建该标注的用户唯一ID。 **取值范围：** 不涉及。
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public OpsLabelItem withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：** 创建者的名称或账号信息。 **取值范围：** 不涉及。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public OpsLabelItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 标注的显示名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsLabelItem withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** 标注的内容类型（如分类category 等）。 **取值范围：** 不涉及。
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public OpsLabelItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 关于该标注的详细说明或补充信息。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpsLabelItem withEnums(List<OpsLabelValueItem> enums) {
        this.enums = enums;
        return this;
    }

    public OpsLabelItem addEnumsItem(OpsLabelValueItem enumsItem) {
        if (this.enums == null) {
            this.enums = new ArrayList<>();
        }
        this.enums.add(enumsItem);
        return this;
    }

    public OpsLabelItem withEnums(Consumer<List<OpsLabelValueItem>> enumsSetter) {
        if (this.enums == null) {
            this.enums = new ArrayList<>();
        }
        enumsSetter.accept(this.enums);
        return this;
    }

    /**
     * **参数解释：** 该标注包含的枚举值（选项）列表。 **取值范围：** 不涉及。
     * @return enums
     */
    public List<OpsLabelValueItem> getEnums() {
        return enums;
    }

    public void setEnums(List<OpsLabelValueItem> enums) {
        this.enums = enums;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsLabelItem that = (OpsLabelItem) obj;
        return Objects.equals(this.labelId, that.labelId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.name, that.name)
            && Objects.equals(this.contentType, that.contentType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enums, that.enums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, creatorId, creator, name, contentType, description, enums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsLabelItem {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enums: ").append(toIndentedString(enums)).append("\n");
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
