package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.ListenerResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListListenersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<ListenerResp> listeners = null;
    
    public ListListenersResponse withListeners(List<ListenerResp> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public ListListenersResponse addListenersItem(ListenerResp listenersItem) {
        if(this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public ListListenersResponse withListeners(Consumer<List<ListenerResp>> listenersSetter) {
        if(this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 监听器对象列表
     * @return listeners
     */
    public List<ListenerResp> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerResp> listeners) {
        this.listeners = listeners;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListListenersResponse listListenersResponse = (ListListenersResponse) o;
        return Objects.equals(this.listeners, listListenersResponse.listeners);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listeners);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersResponse {\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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

