package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template_id")

    private List<String> launchTemplateId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    public ListTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * max number of resources to return
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTemplatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * next page resource index id
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTemplatesRequest withLaunchTemplateId(List<String> launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    public ListTemplatesRequest addLaunchTemplateIdItem(String launchTemplateIdItem) {
        if (this.launchTemplateId == null) {
            this.launchTemplateId = new ArrayList<>();
        }
        this.launchTemplateId.add(launchTemplateIdItem);
        return this;
    }

    public ListTemplatesRequest withLaunchTemplateId(Consumer<List<String>> launchTemplateIdSetter) {
        if (this.launchTemplateId == null) {
            this.launchTemplateId = new ArrayList<>();
        }
        launchTemplateIdSetter.accept(this.launchTemplateId);
        return this;
    }

    /**
     * 模板ID
     * @return launchTemplateId
     */
    public List<String> getLaunchTemplateId() {
        return launchTemplateId;
    }

    public void setLaunchTemplateId(List<String> launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    public ListTemplatesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListTemplatesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListTemplatesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTemplatesRequest that = (ListTemplatesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.launchTemplateId, that.launchTemplateId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, launchTemplateId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    launchTemplateId: ").append(toIndentedString(launchTemplateId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
