package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Category层级数据类型
 */
public class CategoryLayerDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private BaseCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_parent_field")

    private String linkParentField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<CategoryLayerDTO> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_code")

    private String categoryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_type")

    private String layerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_x")

    private Integer positionX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_y")

    private Integer positionY;

    public CategoryLayerDTO withCategory(BaseCategory category) {
        this.category = category;
        return this;
    }

    public CategoryLayerDTO withCategory(Consumer<BaseCategory> categorySetter) {
        if (this.category == null) {
            this.category = new BaseCategory();
            categorySetter.accept(this.category);
        }

        return this;
    }

    /**
     * Get category
     * @return category
     */
    public BaseCategory getCategory() {
        return category;
    }

    public void setCategory(BaseCategory category) {
        this.category = category;
    }

    public CategoryLayerDTO withLinkParentField(String linkParentField) {
        this.linkParentField = linkParentField;
        return this;
    }

    /**
     * **参数解释**： 父类字段。 **取值范围**： 不涉及。
     * @return linkParentField
     */
    public String getLinkParentField() {
        return linkParentField;
    }

    public void setLinkParentField(String linkParentField) {
        this.linkParentField = linkParentField;
    }

    public CategoryLayerDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 工作项层级ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CategoryLayerDTO withChildren(List<CategoryLayerDTO> children) {
        this.children = children;
        return this;
    }

    public CategoryLayerDTO addChildrenItem(CategoryLayerDTO childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public CategoryLayerDTO withChildren(Consumer<List<CategoryLayerDTO>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * **参数解释**： 子工作项层级数据类型。 **取值范围**： 不涉及。
     * @return children
     */
    public List<CategoryLayerDTO> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryLayerDTO> children) {
        this.children = children;
    }

    public CategoryLayerDTO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 层级对象类型编码。 **取值范围**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CategoryLayerDTO withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * **参数解释**： 对象类型编码。 **取值范围**： 不涉及。
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public CategoryLayerDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * **参数解释**： 对象类型ID。 **取值范围**： 不涉及。
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryLayerDTO withLayerType(String layerType) {
        this.layerType = layerType;
        return this;
    }

    /**
     * **参数解释**： 层级类型。 **取值范围**： 不涉及。
     * @return layerType
     */
    public String getLayerType() {
        return layerType;
    }

    public void setLayerType(String layerType) {
        this.layerType = layerType;
    }

    public CategoryLayerDTO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 父ID。 **取值范围**： 不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CategoryLayerDTO withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * **参数解释**： 根工作项ID。 **取值范围**： 不涉及。
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public CategoryLayerDTO withPositionX(Integer positionX) {
        this.positionX = positionX;
        return this;
    }

    /**
     * **参数解释**： 画布X轴坐标。 **取值范围**： 不涉及。
     * @return positionX
     */
    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public CategoryLayerDTO withPositionY(Integer positionY) {
        this.positionY = positionY;
        return this;
    }

    /**
     * **参数解释**： 画布Y轴坐标。 **取值范围**： 不涉及。
     * @return positionY
     */
    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryLayerDTO that = (CategoryLayerDTO) obj;
        return Objects.equals(this.category, that.category)
            && Objects.equals(this.linkParentField, that.linkParentField) && Objects.equals(this.id, that.id)
            && Objects.equals(this.children, that.children) && Objects.equals(this.code, that.code)
            && Objects.equals(this.categoryCode, that.categoryCode) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.layerType, that.layerType) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.positionX, that.positionX)
            && Objects.equals(this.positionY, that.positionY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            linkParentField,
            id,
            children,
            code,
            categoryCode,
            categoryId,
            layerType,
            parentId,
            rootId,
            positionX,
            positionY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryLayerDTO {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    linkParentField: ").append(toIndentedString(linkParentField)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
        sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
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
