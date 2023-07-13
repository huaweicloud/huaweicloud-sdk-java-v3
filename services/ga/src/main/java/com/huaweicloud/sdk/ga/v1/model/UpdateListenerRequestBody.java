package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update Listener request
 */
public class UpdateListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private UpdateListenerOption listener;

    public UpdateListenerRequestBody withListener(UpdateListenerOption listener) {
        this.listener = listener;
        return this;
    }

    public UpdateListenerRequestBody withListener(Consumer<UpdateListenerOption> listenerSetter) {
        if (this.listener == null) {
            this.listener = new UpdateListenerOption();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    /**
     * Get listener
     * @return listener
     */
    public UpdateListenerOption getListener() {
        return listener;
    }

    public void setListener(UpdateListenerOption listener) {
        this.listener = listener;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateListenerRequestBody that = (UpdateListenerRequestBody) obj;
        return Objects.equals(this.listener, that.listener);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listener);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerRequestBody {\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
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
