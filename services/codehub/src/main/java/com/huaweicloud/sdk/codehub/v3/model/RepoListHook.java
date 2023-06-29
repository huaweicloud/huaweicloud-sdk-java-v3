package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepoListHook
 */
public class RepoListHook {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hooks")

    private List<RepoHook> hooks = null;

    public RepoListHook withHooks(List<RepoHook> hooks) {
        this.hooks = hooks;
        return this;
    }

    public RepoListHook addHooksItem(RepoHook hooksItem) {
        if (this.hooks == null) {
            this.hooks = new ArrayList<>();
        }
        this.hooks.add(hooksItem);
        return this;
    }

    public RepoListHook withHooks(Consumer<List<RepoHook>> hooksSetter) {
        if (this.hooks == null) {
            this.hooks = new ArrayList<>();
        }
        hooksSetter.accept(this.hooks);
        return this;
    }

    /**
     * hook列表
     * @return hooks
     */
    public List<RepoHook> getHooks() {
        return hooks;
    }

    public void setHooks(List<RepoHook> hooks) {
        this.hooks = hooks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoListHook that = (RepoListHook) obj;
        return Objects.equals(this.hooks, that.hooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoListHook {\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
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
