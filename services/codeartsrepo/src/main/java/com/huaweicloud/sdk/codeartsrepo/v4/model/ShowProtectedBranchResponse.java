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
public class ShowProtectedBranchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<RepositoryProtectedActionDto> actions = null;

    public ShowProtectedBranchResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 保护分支ID。 **取值范围：** 1-2147483647
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

    public ShowProtectedBranchResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 分支名称或通配符。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProtectedBranchResponse withActions(List<RepositoryProtectedActionDto> actions) {
        this.actions = actions;
        return this;
    }

    public ShowProtectedBranchResponse addActionsItem(RepositoryProtectedActionDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ShowProtectedBranchResponse withActions(Consumer<List<RepositoryProtectedActionDto>> actionsSetter) {
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
        ShowProtectedBranchResponse that = (ShowProtectedBranchResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectedBranchResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
