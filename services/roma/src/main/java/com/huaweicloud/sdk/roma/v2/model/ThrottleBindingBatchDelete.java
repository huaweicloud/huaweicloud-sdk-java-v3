package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThrottleBindingBatchDelete
 */
public class ThrottleBindingBatchDelete {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_bindings")

    private List<String> throttleBindings = null;

    public ThrottleBindingBatchDelete withThrottleBindings(List<String> throttleBindings) {
        this.throttleBindings = throttleBindings;
        return this;
    }

    public ThrottleBindingBatchDelete addThrottleBindingsItem(String throttleBindingsItem) {
        if (this.throttleBindings == null) {
            this.throttleBindings = new ArrayList<>();
        }
        this.throttleBindings.add(throttleBindingsItem);
        return this;
    }

    public ThrottleBindingBatchDelete withThrottleBindings(Consumer<List<String>> throttleBindingsSetter) {
        if (this.throttleBindings == null) {
            this.throttleBindings = new ArrayList<>();
        }
        throttleBindingsSetter.accept(this.throttleBindings);
        return this;
    }

    /**
     * 需要解除绑定的API和流控策略绑定关系ID列表
     * @return throttleBindings
     */
    public List<String> getThrottleBindings() {
        return throttleBindings;
    }

    public void setThrottleBindings(List<String> throttleBindings) {
        this.throttleBindings = throttleBindings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleBindingBatchDelete throttleBindingBatchDelete = (ThrottleBindingBatchDelete) o;
        return Objects.equals(this.throttleBindings, throttleBindingBatchDelete.throttleBindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(throttleBindings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingBatchDelete {\n");
        sb.append("    throttleBindings: ").append(toIndentedString(throttleBindings)).append("\n");
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
