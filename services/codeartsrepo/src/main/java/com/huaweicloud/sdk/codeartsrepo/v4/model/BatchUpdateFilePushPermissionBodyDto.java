package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateFilePushPermissionBodyDto
 */
public class BatchUpdateFilePushPermissionBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<FilePushPermissionUpdateDto> permissions = null;

    public BatchUpdateFilePushPermissionBodyDto withPermissions(List<FilePushPermissionUpdateDto> permissions) {
        this.permissions = permissions;
        return this;
    }

    public BatchUpdateFilePushPermissionBodyDto addPermissionsItem(FilePushPermissionUpdateDto permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public BatchUpdateFilePushPermissionBodyDto withPermissions(
        Consumer<List<FilePushPermissionUpdateDto>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * **参数解释：** 文件推送权限更新列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return permissions
     */
    public List<FilePushPermissionUpdateDto> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<FilePushPermissionUpdateDto> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateFilePushPermissionBodyDto that = (BatchUpdateFilePushPermissionBodyDto) obj;
        return Objects.equals(this.permissions, that.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateFilePushPermissionBodyDto {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
