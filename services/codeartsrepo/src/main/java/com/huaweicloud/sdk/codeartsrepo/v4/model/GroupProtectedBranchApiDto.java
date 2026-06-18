package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 代码组下保护分支。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class GroupProtectedBranchApiDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ProjectProtectedActionResultApiDto> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    public GroupProtectedBranchApiDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 保护分支唯一标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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

    public GroupProtectedBranchApiDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 保护分支名称 **取值范围：** 字符串长度不少于1，不超过1000。 **约束限制：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupProtectedBranchApiDto withActions(List<ProjectProtectedActionResultApiDto> actions) {
        this.actions = actions;
        return this;
    }

    public GroupProtectedBranchApiDto addActionsItem(ProjectProtectedActionResultApiDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public GroupProtectedBranchApiDto withActions(Consumer<List<ProjectProtectedActionResultApiDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 事件列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return actions
     */
    public List<ProjectProtectedActionResultApiDto> getActions() {
        return actions;
    }

    public void setActions(List<ProjectProtectedActionResultApiDto> actions) {
        this.actions = actions;
    }

    public GroupProtectedBranchApiDto withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * **参数解释：** 代码组id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 2147483647
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupProtectedBranchApiDto that = (GroupProtectedBranchApiDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.namespaceId, that.namespaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, actions, namespaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupProtectedBranchApiDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
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
