package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryFilePushPermissionDto
 */
public class RepositoryFilePushPermissionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<RepositoryProtectedActionDto> actions = null;

    public RepositoryFilePushPermissionDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库文件推送权限ID。 **取值范围：** 1-2147483647
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryFilePushPermissionDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 目录路径或通配符。 **取值范围：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepositoryFilePushPermissionDto withActions(List<RepositoryProtectedActionDto> actions) {
        this.actions = actions;
        return this;
    }

    public RepositoryFilePushPermissionDto addActionsItem(RepositoryProtectedActionDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public RepositoryFilePushPermissionDto withActions(Consumer<List<RepositoryProtectedActionDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 事件列表。 **取值范围：** 不涉及。
     * @return actions
     */
    public List<RepositoryProtectedActionDto> getActions() {
        return actions;
    }

    public void setActions(List<RepositoryProtectedActionDto> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryFilePushPermissionDto that = (RepositoryFilePushPermissionDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.path, that.path)
            && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, path, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryFilePushPermissionDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
