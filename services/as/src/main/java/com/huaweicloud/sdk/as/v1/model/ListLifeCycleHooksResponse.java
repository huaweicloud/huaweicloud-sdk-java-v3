package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.LifecycleHookList;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListLifeCycleHooksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_hooks")
    
    private List<LifecycleHookList> lifecycleHooks = null;
    
    public ListLifeCycleHooksResponse withLifecycleHooks(List<LifecycleHookList> lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
        return this;
    }

    
    public ListLifeCycleHooksResponse addLifecycleHooksItem(LifecycleHookList lifecycleHooksItem) {
        if (this.lifecycleHooks == null) {
            this.lifecycleHooks = new ArrayList<>();
        }
        this.lifecycleHooks.add(lifecycleHooksItem);
        return this;
    }

    public ListLifeCycleHooksResponse withLifecycleHooks(Consumer<List<LifecycleHookList>> lifecycleHooksSetter) {
        if(this.lifecycleHooks == null ){
            this.lifecycleHooks = new ArrayList<>();
        }
        lifecycleHooksSetter.accept(this.lifecycleHooks);
        return this;
    }

    /**
     * 生命周期挂钩列表。
     * @return lifecycleHooks
     */
    public List<LifecycleHookList> getLifecycleHooks() {
        return lifecycleHooks;
    }

    public void setLifecycleHooks(List<LifecycleHookList> lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLifeCycleHooksResponse listLifeCycleHooksResponse = (ListLifeCycleHooksResponse) o;
        return Objects.equals(this.lifecycleHooks, listLifeCycleHooksResponse.lifecycleHooks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lifecycleHooks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLifeCycleHooksResponse {\n");
            sb.append("    lifecycleHooks: ").append(toIndentedString(lifecycleHooks)).append("\n");
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

