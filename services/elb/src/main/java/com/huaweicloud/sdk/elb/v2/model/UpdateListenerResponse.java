package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.ListenerV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateListenerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener")
    
    private ListenerV2Resp listener = null;

    public UpdateListenerResponse withListener(ListenerV2Resp listener) {
        this.listener = listener;
        return this;
    }

    public UpdateListenerResponse withListener(Consumer<ListenerV2Resp> listenerSetter) {
        if(this.listener == null ){
            this.listener = new ListenerV2Resp();
            listenerSetter.accept(this.listener);
        }
        
        return this;
    }


    /**
     * Get listener
     * @return listener
     */
    public ListenerV2Resp getListener() {
        return listener;
    }

    public void setListener(ListenerV2Resp listener) {
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
        UpdateListenerResponse updateListenerResponse = (UpdateListenerResponse) o;
        return Objects.equals(this.listener, updateListenerResponse.listener);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listener);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerResponse {\n");
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

