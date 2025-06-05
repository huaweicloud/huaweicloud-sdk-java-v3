package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListUserImageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_creator")

    private Boolean isCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_names")

    private List<String> eihealthProjectNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<String> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_create_time")

    private Long startCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_create_time")

    private Long endCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_update_time")

    private Long startUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_update_time")

    private Long endUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListUserImageRequest withIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
        return this;
    }

    /**
     * 是否仅展示本人创建资源。
     * @return isCreator
     */
    public Boolean getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public ListUserImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID，支持精确搜索。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ListUserImageRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称，支持模糊搜索。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListUserImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像描述，支持模糊搜索。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListUserImageRequest withEihealthProjectNames(List<String> eihealthProjectNames) {
        this.eihealthProjectNames = eihealthProjectNames;
        return this;
    }

    public ListUserImageRequest addEihealthProjectNamesItem(String eihealthProjectNamesItem) {
        if (this.eihealthProjectNames == null) {
            this.eihealthProjectNames = new ArrayList<>();
        }
        this.eihealthProjectNames.add(eihealthProjectNamesItem);
        return this;
    }

    public ListUserImageRequest withEihealthProjectNames(Consumer<List<String>> eihealthProjectNamesSetter) {
        if (this.eihealthProjectNames == null) {
            this.eihealthProjectNames = new ArrayList<>();
        }
        eihealthProjectNamesSetter.accept(this.eihealthProjectNames);
        return this;
    }

    /**
     * 空间名称列表，支持查询多个空间下的镜像。
     * @return eihealthProjectNames
     */
    public List<String> getEihealthProjectNames() {
        return eihealthProjectNames;
    }

    public void setEihealthProjectNames(List<String> eihealthProjectNames) {
        this.eihealthProjectNames = eihealthProjectNames;
    }

    public ListUserImageRequest withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源空间名称，支持模糊搜索。
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ListUserImageRequest withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public ListUserImageRequest addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public ListUserImageRequest withTypes(Consumer<List<String>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 镜像类型列表。
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public ListUserImageRequest withStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }

    /**
     * 最小创建时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return startCreateTime
     */
    public Long getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public ListUserImageRequest withEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }

    /**
     * 最大创建时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public ListUserImageRequest withStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
        return this;
    }

    /**
     * 最小更新时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return startUpdateTime
     */
    public Long getStartUpdateTime() {
        return startUpdateTime;
    }

    public void setStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }

    public ListUserImageRequest withEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
        return this;
    }

    /**
     * 最大更新时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return endUpdateTime
     */
    public Long getEndUpdateTime() {
        return endUpdateTime;
    }

    public void setEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
    }

    public ListUserImageRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序规则，目前默认时间降序，支持根据create_time|update_time排序。
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListUserImageRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则，目前默认时间降序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListUserImageRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListUserImageRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]。
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserImageRequest that = (ListUserImageRequest) obj;
        return Objects.equals(this.isCreator, that.isCreator) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.eihealthProjectNames, that.eihealthProjectNames)
            && Objects.equals(this.sourceProjectName, that.sourceProjectName) && Objects.equals(this.types, that.types)
            && Objects.equals(this.startCreateTime, that.startCreateTime)
            && Objects.equals(this.endCreateTime, that.endCreateTime)
            && Objects.equals(this.startUpdateTime, that.startUpdateTime)
            && Objects.equals(this.endUpdateTime, that.endUpdateTime) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCreator,
            imageId,
            imageName,
            description,
            eihealthProjectNames,
            sourceProjectName,
            types,
            startCreateTime,
            endCreateTime,
            startUpdateTime,
            endUpdateTime,
            sortBy,
            sortDir,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserImageRequest {\n");
        sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eihealthProjectNames: ").append(toIndentedString(eihealthProjectNames)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    startCreateTime: ").append(toIndentedString(startCreateTime)).append("\n");
        sb.append("    endCreateTime: ").append(toIndentedString(endCreateTime)).append("\n");
        sb.append("    startUpdateTime: ").append(toIndentedString(startUpdateTime)).append("\n");
        sb.append("    endUpdateTime: ").append(toIndentedString(endUpdateTime)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
