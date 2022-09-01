package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    @JacksonXmlProperty(localName = "listener")

    private UpdateListenerReq listener;

    public UpdateListenerRequestBody withListener(UpdateListenerReq listener) {
        this.listener = listener;
        return this;
    }

    public UpdateListenerRequestBody withListener(Consumer<UpdateListenerReq> listenerSetter) {
        if (this.listener == null) {
            this.listener = new UpdateListenerReq();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    /**
     * Get listener
     * @return listener
     */
    public UpdateListenerReq getListener() {
        return listener;
    }

    public void setListener(UpdateListenerReq listener) {
        this.listener = listener;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateListenerRequestBody updateListenerRequestBody = (UpdateListenerRequestBody) o;
        return Objects.equals(this.listener, updateListenerRequestBody.listener);
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
