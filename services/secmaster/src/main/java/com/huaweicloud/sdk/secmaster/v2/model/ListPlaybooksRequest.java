package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPlaybooksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_txt")

    private String searchTxt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListPlaybooksRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * ID of workspace
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListPlaybooksRequest withSearchTxt(String searchTxt) {
        this.searchTxt = searchTxt;
        return this;
    }

    /**
     * 搜索关键字
     * @return searchTxt
     */
    public String getSearchTxt() {
        return searchTxt;
    }

    public void setSearchTxt(String searchTxt) {
        this.searchTxt = searchTxt;
    }

    public ListPlaybooksRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * component id.
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListPlaybooksRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ListPlaybooksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * request offset, from 0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPlaybooksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * request limit size
     * minimum: 1
     * maximum: 999999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPlaybooksRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 剧本描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListPlaybooksRequest withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * 数据类名称
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public ListPlaybooksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 剧本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPlaybooksRequest listPlaybooksRequest = (ListPlaybooksRequest) o;
        return Objects.equals(this.workspaceId, listPlaybooksRequest.workspaceId)
            && Objects.equals(this.searchTxt, listPlaybooksRequest.searchTxt)
            && Objects.equals(this.componentId, listPlaybooksRequest.componentId)
            && Objects.equals(this.enabled, listPlaybooksRequest.enabled)
            && Objects.equals(this.offset, listPlaybooksRequest.offset)
            && Objects.equals(this.limit, listPlaybooksRequest.limit)
            && Objects.equals(this.description, listPlaybooksRequest.description)
            && Objects.equals(this.dataclassName, listPlaybooksRequest.dataclassName)
            && Objects.equals(this.name, listPlaybooksRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workspaceId, searchTxt, componentId, enabled, offset, limit, description, dataclassName, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybooksRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    searchTxt: ").append(toIndentedString(searchTxt)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
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
