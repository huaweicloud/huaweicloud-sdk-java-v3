package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.RepoHook;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepoListHook
 */
public class RepoListHook  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hooks")
    
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
        if(this.hooks == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoListHook repoListHook = (RepoListHook) o;
        return Objects.equals(this.hooks, repoListHook.hooks);
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

