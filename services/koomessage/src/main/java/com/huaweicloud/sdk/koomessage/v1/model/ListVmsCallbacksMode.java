package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 响应数据。
 */
public class ListVmsCallbacksMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callbacks")

    private List<VmsCallBack> callbacks = null;

    public ListVmsCallbacksMode withCallbacks(List<VmsCallBack> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    public ListVmsCallbacksMode addCallbacksItem(VmsCallBack callbacksItem) {
        if (this.callbacks == null) {
            this.callbacks = new ArrayList<>();
        }
        this.callbacks.add(callbacksItem);
        return this;
    }

    public ListVmsCallbacksMode withCallbacks(Consumer<List<VmsCallBack>> callbacksSetter) {
        if (this.callbacks == null) {
            this.callbacks = new ArrayList<>();
        }
        callbacksSetter.accept(this.callbacks);
        return this;
    }

    /**
     * 回执接口列表。
     * @return callbacks
     */
    public List<VmsCallBack> getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(List<VmsCallBack> callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVmsCallbacksMode listVmsCallbacksMode = (ListVmsCallbacksMode) o;
        return Objects.equals(this.callbacks, listVmsCallbacksMode.callbacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbacks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsCallbacksMode {\n");
        sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
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
