package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateAssetCategoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    @JacksonXmlProperty(localName = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    @JacksonXmlProperty(localName = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    @JacksonXmlProperty(localName = "projectId")

    private String projectId;

    public UpdateAssetCategoryResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 媒资分类名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAssetCategoryResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父分类ID。 一级分类父ID为0。
     * minimum: 0
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public UpdateAssetCategoryResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 媒资分类ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateAssetCategoryResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 媒资分类层级。  取值如下： - 1：一级分类层级。 - 2：二级分类层级。 - 3：三级分类层级。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public UpdateAssetCategoryResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetCategoryResponse updateAssetCategoryResponse = (UpdateAssetCategoryResponse) o;
        return Objects.equals(this.name, updateAssetCategoryResponse.name)
            && Objects.equals(this.parentId, updateAssetCategoryResponse.parentId)
            && Objects.equals(this.id, updateAssetCategoryResponse.id)
            && Objects.equals(this.level, updateAssetCategoryResponse.level)
            && Objects.equals(this.projectId, updateAssetCategoryResponse.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentId, id, level, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetCategoryResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
