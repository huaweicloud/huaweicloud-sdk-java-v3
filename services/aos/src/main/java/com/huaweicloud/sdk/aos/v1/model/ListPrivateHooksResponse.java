package com.huaweicloud.sdk.aos.v1.model;

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
public class ListPrivateHooksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hooks")

    private List<PrivateHookSummary> hooks = null;

    public ListPrivateHooksResponse withHooks(List<PrivateHookSummary> hooks) {
        this.hooks = hooks;
        return this;
    }

    public ListPrivateHooksResponse addHooksItem(PrivateHookSummary hooksItem) {
        if (this.hooks == null) {
            this.hooks = new ArrayList<>();
        }
        this.hooks.add(hooksItem);
        return this;
    }

    public ListPrivateHooksResponse withHooks(Consumer<List<PrivateHookSummary>> hooksSetter) {
        if (this.hooks == null) {
            this.hooks = new ArrayList<>();
        }
        hooksSetter.accept(this.hooks);
        return this;
    }

    /**
     * 私有hook的列表。默认以创建时间降序排序。
     * @return hooks
     */
    public List<PrivateHookSummary> getHooks() {
        return hooks;
    }

    public void setHooks(List<PrivateHookSummary> hooks) {
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
        ListPrivateHooksResponse that = (ListPrivateHooksResponse) obj;
        return Objects.equals(this.hooks, that.hooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateHooksResponse {\n");
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
