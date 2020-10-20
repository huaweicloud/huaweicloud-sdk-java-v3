package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateListenerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener")
    
    private CreateListenerV2Req listener = null;

    public CreateListenerRequestBody withListener(CreateListenerV2Req listener) {
        this.listener = listener;
        return this;
    }

    public CreateListenerRequestBody withListener(Consumer<CreateListenerV2Req> listenerSetter) {
        if(this.listener == null ){
            this.listener = new CreateListenerV2Req();
            listenerSetter.accept(this.listener);
        }
        
        return this;
    }


    /**
     * Get listener
     * @return listener
     */
    public CreateListenerV2Req getListener() {
        return listener;
    }

    public void setListener(CreateListenerV2Req listener) {
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
        CreateListenerRequestBody createListenerRequestBody = (CreateListenerRequestBody) o;
        return Objects.equals(this.listener, createListenerRequestBody.listener);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listener);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerRequestBody {\n");
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

