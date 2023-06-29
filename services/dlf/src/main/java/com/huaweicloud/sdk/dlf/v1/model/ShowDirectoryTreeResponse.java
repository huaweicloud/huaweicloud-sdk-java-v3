package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDirectoryTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_directory_id")

    private String parentDirectoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_name")

    private String directoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_type")

    private String categoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private String directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paging")

    private Boolean paging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elements")

    private List<TreeNodeElement> elements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_directories")

    private List<DirectoryTreeResp> subDirectories = null;

    public ShowDirectoryTreeResponse withParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }

    /**
     * Get parentDirectoryId
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return parentDirectoryId;
    }

    public void setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
    }

    public ShowDirectoryTreeResponse withDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    /**
     * Get directoryName
     * @return directoryName
     */
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ShowDirectoryTreeResponse withCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    /**
     * Get categoryType
     * @return categoryType
     */
    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public ShowDirectoryTreeResponse withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * Get directoryId
     * @return directoryId
     */
    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public ShowDirectoryTreeResponse withPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     * @return paging
     */
    public Boolean getPaging() {
        return paging;
    }

    public void setPaging(Boolean paging) {
        this.paging = paging;
    }

    public ShowDirectoryTreeResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowDirectoryTreeResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowDirectoryTreeResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowDirectoryTreeResponse withElements(List<TreeNodeElement> elements) {
        this.elements = elements;
        return this;
    }

    public ShowDirectoryTreeResponse addElementsItem(TreeNodeElement elementsItem) {
        if (this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    public ShowDirectoryTreeResponse withElements(Consumer<List<TreeNodeElement>> elementsSetter) {
        if (this.elements == null) {
            this.elements = new ArrayList<>();
        }
        elementsSetter.accept(this.elements);
        return this;
    }

    /**
     * Get elements
     * @return elements
     */
    public List<TreeNodeElement> getElements() {
        return elements;
    }

    public void setElements(List<TreeNodeElement> elements) {
        this.elements = elements;
    }

    public ShowDirectoryTreeResponse withSubDirectories(List<DirectoryTreeResp> subDirectories) {
        this.subDirectories = subDirectories;
        return this;
    }

    public ShowDirectoryTreeResponse addSubDirectoriesItem(DirectoryTreeResp subDirectoriesItem) {
        if (this.subDirectories == null) {
            this.subDirectories = new ArrayList<>();
        }
        this.subDirectories.add(subDirectoriesItem);
        return this;
    }

    public ShowDirectoryTreeResponse withSubDirectories(Consumer<List<DirectoryTreeResp>> subDirectoriesSetter) {
        if (this.subDirectories == null) {
            this.subDirectories = new ArrayList<>();
        }
        subDirectoriesSetter.accept(this.subDirectories);
        return this;
    }

    /**
     * Get subDirectories
     * @return subDirectories
     */
    public List<DirectoryTreeResp> getSubDirectories() {
        return subDirectories;
    }

    public void setSubDirectories(List<DirectoryTreeResp> subDirectories) {
        this.subDirectories = subDirectories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDirectoryTreeResponse that = (ShowDirectoryTreeResponse) obj;
        return Objects.equals(this.parentDirectoryId, that.parentDirectoryId)
            && Objects.equals(this.directoryName, that.directoryName)
            && Objects.equals(this.categoryType, that.categoryType)
            && Objects.equals(this.directoryId, that.directoryId) && Objects.equals(this.paging, that.paging)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.count, that.count) && Objects.equals(this.elements, that.elements)
            && Objects.equals(this.subDirectories, that.subDirectories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentDirectoryId,
            directoryName,
            categoryType,
            directoryId,
            paging,
            offset,
            limit,
            count,
            elements,
            subDirectories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDirectoryTreeResponse {\n");
        sb.append("    parentDirectoryId: ").append(toIndentedString(parentDirectoryId)).append("\n");
        sb.append("    directoryName: ").append(toIndentedString(directoryName)).append("\n");
        sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
        sb.append("    subDirectories: ").append(toIndentedString(subDirectories)).append("\n");
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
