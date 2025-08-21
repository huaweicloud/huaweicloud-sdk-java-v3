package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateProtectedTagsBodyDto
 */
public class BatchUpdateProtectedTagsBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "names")

    private List<String> names = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<RepositoryProtectedTagActionBodyDto> actions = null;

    public BatchUpdateProtectedTagsBodyDto withNames(List<String> names) {
        this.names = names;
        return this;
    }

    public BatchUpdateProtectedTagsBodyDto addNamesItem(String namesItem) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    public BatchUpdateProtectedTagsBodyDto withNames(Consumer<List<String>> namesSetter) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        namesSetter.accept(this.names);
        return this;
    }

    /**
     * **参数解释：** 保护Tag名或通配符列表。 **约束限制：** 必填 **取值范围：** 不涉及 **默认取值：** 不涉及。
     * @return names
     */
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public BatchUpdateProtectedTagsBodyDto withActions(List<RepositoryProtectedTagActionBodyDto> actions) {
        this.actions = actions;
        return this;
    }

    public BatchUpdateProtectedTagsBodyDto addActionsItem(RepositoryProtectedTagActionBodyDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public BatchUpdateProtectedTagsBodyDto withActions(
        Consumer<List<RepositoryProtectedTagActionBodyDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 权限列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及。
     * @return actions
     */
    public List<RepositoryProtectedTagActionBodyDto> getActions() {
        return actions;
    }

    public void setActions(List<RepositoryProtectedTagActionBodyDto> actions) {
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
        BatchUpdateProtectedTagsBodyDto that = (BatchUpdateProtectedTagsBodyDto) obj;
        return Objects.equals(this.names, that.names) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateProtectedTagsBodyDto {\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
