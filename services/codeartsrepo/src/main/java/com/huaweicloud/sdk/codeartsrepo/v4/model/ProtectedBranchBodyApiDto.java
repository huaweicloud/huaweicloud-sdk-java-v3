package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectedBranchBodyApiDto
 */
public class ProtectedBranchBodyApiDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ProtectedActionBasicApiDto> actions = null;

    public ProtectedBranchBodyApiDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 保护分支名称。 **取值范围** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProtectedBranchBodyApiDto withActions(List<ProtectedActionBasicApiDto> actions) {
        this.actions = actions;
        return this;
    }

    public ProtectedBranchBodyApiDto addActionsItem(ProtectedActionBasicApiDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ProtectedBranchBodyApiDto withActions(Consumer<List<ProtectedActionBasicApiDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 事件列表。
     * @return actions
     */
    public List<ProtectedActionBasicApiDto> getActions() {
        return actions;
    }

    public void setActions(List<ProtectedActionBasicApiDto> actions) {
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
        ProtectedBranchBodyApiDto that = (ProtectedBranchBodyApiDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchBodyApiDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
