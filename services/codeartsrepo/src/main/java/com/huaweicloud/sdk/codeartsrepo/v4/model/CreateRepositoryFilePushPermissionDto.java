package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRepositoryFilePushPermissionDto
 */
public class CreateRepositoryFilePushPermissionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<FilePushPermissionActionBodyDto> actions = null;

    public CreateRepositoryFilePushPermissionDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 目录路径或通配符 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateRepositoryFilePushPermissionDto withActions(List<FilePushPermissionActionBodyDto> actions) {
        this.actions = actions;
        return this;
    }

    public CreateRepositoryFilePushPermissionDto addActionsItem(FilePushPermissionActionBodyDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreateRepositoryFilePushPermissionDto withActions(
        Consumer<List<FilePushPermissionActionBodyDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 事件设置列表 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return actions
     */
    public List<FilePushPermissionActionBodyDto> getActions() {
        return actions;
    }

    public void setActions(List<FilePushPermissionActionBodyDto> actions) {
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
        CreateRepositoryFilePushPermissionDto that = (CreateRepositoryFilePushPermissionDto) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepositoryFilePushPermissionDto {\n");
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
