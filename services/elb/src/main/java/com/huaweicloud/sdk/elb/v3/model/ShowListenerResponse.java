package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.Listener;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowListenerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener")
    
    private Listener listener;

    public ShowListenerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public ShowListenerResponse withListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    public ShowListenerResponse withListener(Consumer<Listener> listenerSetter) {
        if(this.listener == null ){
            this.listener = new Listener();
            listenerSetter.accept(this.listener);
        }
        
        return this;
    }


    /**
     * Get listener
     * @return listener
     */
    public Listener getListener() {
        return listener;
    }

    public void setListener(Listener listener) {
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
        ShowListenerResponse showListenerResponse = (ShowListenerResponse) o;
        return Objects.equals(this.requestId, showListenerResponse.requestId) &&
            Objects.equals(this.listener, showListenerResponse.listener);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, listener);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowListenerResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

