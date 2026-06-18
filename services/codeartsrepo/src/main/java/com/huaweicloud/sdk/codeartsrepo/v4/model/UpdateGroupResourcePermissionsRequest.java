package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGroupResourcePermissionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private Integer resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePermissionBodyDto body;

    public UpdateGroupResourcePermissionsRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public UpdateGroupResourcePermissionsRequest withResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源Id，通过获取代码组权限资源点列表获取的数据中的Id **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return resourceId
     */
    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public UpdateGroupResourcePermissionsRequest withBody(UpdatePermissionBodyDto body) {
        this.body = body;
        return this;
    }

    public UpdateGroupResourcePermissionsRequest withBody(Consumer<UpdatePermissionBodyDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePermissionBodyDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePermissionBodyDto getBody() {
        return body;
    }

    public void setBody(UpdatePermissionBodyDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupResourcePermissionsRequest that = (UpdateGroupResourcePermissionsRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupResourcePermissionsRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
