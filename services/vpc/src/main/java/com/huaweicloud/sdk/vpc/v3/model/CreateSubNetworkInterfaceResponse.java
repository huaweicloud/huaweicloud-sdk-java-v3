package com.huaweicloud.sdk.vpc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.SubNetworkInterface;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSubNetworkInterfaceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_network_interface")
    
    private SubNetworkInterface subNetworkInterface = null;

    public CreateSubNetworkInterfaceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateSubNetworkInterfaceResponse withSubNetworkInterface(SubNetworkInterface subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
        return this;
    }

    public CreateSubNetworkInterfaceResponse withSubNetworkInterface(Consumer<SubNetworkInterface> subNetworkInterfaceSetter) {
        if(this.subNetworkInterface == null ){
            this.subNetworkInterface = new SubNetworkInterface();
            subNetworkInterfaceSetter.accept(this.subNetworkInterface);
        }
        
        return this;
    }


    /**
     * Get subNetworkInterface
     * @return subNetworkInterface
     */
    public SubNetworkInterface getSubNetworkInterface() {
        return subNetworkInterface;
    }

    public void setSubNetworkInterface(SubNetworkInterface subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubNetworkInterfaceResponse createSubNetworkInterfaceResponse = (CreateSubNetworkInterfaceResponse) o;
        return Objects.equals(this.requestId, createSubNetworkInterfaceResponse.requestId) &&
            Objects.equals(this.subNetworkInterface, createSubNetworkInterfaceResponse.subNetworkInterface);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, subNetworkInterface);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubNetworkInterfaceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subNetworkInterface: ").append(toIndentedString(subNetworkInterface)).append("\n");
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

