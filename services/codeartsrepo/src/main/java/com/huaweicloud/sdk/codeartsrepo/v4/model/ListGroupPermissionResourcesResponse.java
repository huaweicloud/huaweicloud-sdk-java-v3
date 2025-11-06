package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ListGroupPermissionResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_project_permission")

    private Boolean useProjectPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PermissionResourcesDto> resources = null;

    public ListGroupPermissionResourcesResponse withUseProjectPermission(Boolean useProjectPermission) {
        this.useProjectPermission = useProjectPermission;
        return this;
    }

    /**
     * **参数解释：** 是否使用项目权限。
     * @return useProjectPermission
     */
    public Boolean getUseProjectPermission() {
        return useProjectPermission;
    }

    public void setUseProjectPermission(Boolean useProjectPermission) {
        this.useProjectPermission = useProjectPermission;
    }

    public ListGroupPermissionResourcesResponse withResources(List<PermissionResourcesDto> resources) {
        this.resources = resources;
        return this;
    }

    public ListGroupPermissionResourcesResponse addResourcesItem(PermissionResourcesDto resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListGroupPermissionResourcesResponse withResources(Consumer<List<PermissionResourcesDto>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释：** 资源列表。
     * @return resources
     */
    public List<PermissionResourcesDto> getResources() {
        return resources;
    }

    public void setResources(List<PermissionResourcesDto> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupPermissionResourcesResponse that = (ListGroupPermissionResourcesResponse) obj;
        return Objects.equals(this.useProjectPermission, that.useProjectPermission)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useProjectPermission, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupPermissionResourcesResponse {\n");
        sb.append("    useProjectPermission: ").append(toIndentedString(useProjectPermission)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
