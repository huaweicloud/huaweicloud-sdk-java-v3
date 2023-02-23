package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CollectAllResourcesSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private List<String> regionId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private List<String> epId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private List<String> projectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CollectAllResourcesSummaryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CollectAllResourcesSummaryRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public CollectAllResourcesSummaryRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public CollectAllResourcesSummaryRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 资源类型（provider.type）
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public CollectAllResourcesSummaryRequest withRegionId(List<String> regionId) {
        this.regionId = regionId;
        return this;
    }

    public CollectAllResourcesSummaryRequest addRegionIdItem(String regionIdItem) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        this.regionId.add(regionIdItem);
        return this;
    }

    public CollectAllResourcesSummaryRequest withRegionId(Consumer<List<String>> regionIdSetter) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        regionIdSetter.accept(this.regionId);
        return this;
    }

    /**
     * 区域ID列表
     * @return regionId
     */
    public List<String> getRegionId() {
        return regionId;
    }

    public void setRegionId(List<String> regionId) {
        this.regionId = regionId;
    }

    public CollectAllResourcesSummaryRequest withEpId(List<String> epId) {
        this.epId = epId;
        return this;
    }

    public CollectAllResourcesSummaryRequest addEpIdItem(String epIdItem) {
        if (this.epId == null) {
            this.epId = new ArrayList<>();
        }
        this.epId.add(epIdItem);
        return this;
    }

    public CollectAllResourcesSummaryRequest withEpId(Consumer<List<String>> epIdSetter) {
        if (this.epId == null) {
            this.epId = new ArrayList<>();
        }
        epIdSetter.accept(this.epId);
        return this;
    }

    /**
     * 企业项目ID列表
     * @return epId
     */
    public List<String> getEpId() {
        return epId;
    }

    public void setEpId(List<String> epId) {
        this.epId = epId;
    }

    public CollectAllResourcesSummaryRequest withProjectId(List<String> projectId) {
        this.projectId = projectId;
        return this;
    }

    public CollectAllResourcesSummaryRequest addProjectIdItem(String projectIdItem) {
        if (this.projectId == null) {
            this.projectId = new ArrayList<>();
        }
        this.projectId.add(projectIdItem);
        return this;
    }

    public CollectAllResourcesSummaryRequest withProjectId(Consumer<List<String>> projectIdSetter) {
        if (this.projectId == null) {
            this.projectId = new ArrayList<>();
        }
        projectIdSetter.accept(this.projectId);
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public List<String> getProjectId() {
        return projectId;
    }

    public void setProjectId(List<String> projectId) {
        this.projectId = projectId;
    }

    public CollectAllResourcesSummaryRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CollectAllResourcesSummaryRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CollectAllResourcesSummaryRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectAllResourcesSummaryRequest collectAllResourcesSummaryRequest = (CollectAllResourcesSummaryRequest) o;
        return Objects.equals(this.name, collectAllResourcesSummaryRequest.name)
            && Objects.equals(this.type, collectAllResourcesSummaryRequest.type)
            && Objects.equals(this.regionId, collectAllResourcesSummaryRequest.regionId)
            && Objects.equals(this.epId, collectAllResourcesSummaryRequest.epId)
            && Objects.equals(this.projectId, collectAllResourcesSummaryRequest.projectId)
            && Objects.equals(this.tags, collectAllResourcesSummaryRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, regionId, epId, projectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectAllResourcesSummaryRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
