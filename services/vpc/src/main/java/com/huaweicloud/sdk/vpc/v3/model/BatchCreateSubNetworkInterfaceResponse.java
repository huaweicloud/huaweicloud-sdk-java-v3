package com.huaweicloud.sdk.vpc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.SubNetworkInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchCreateSubNetworkInterfaceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_network_interfaces")
    
    private List<SubNetworkInterface> subNetworkInterfaces = null;
    
    public BatchCreateSubNetworkInterfaceResponse withRequestId(String requestId) {
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

    

    public BatchCreateSubNetworkInterfaceResponse withSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
        return this;
    }

    
    public BatchCreateSubNetworkInterfaceResponse addSubNetworkInterfacesItem(SubNetworkInterface subNetworkInterfacesItem) {
        if(this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        this.subNetworkInterfaces.add(subNetworkInterfacesItem);
        return this;
    }

    public BatchCreateSubNetworkInterfaceResponse withSubNetworkInterfaces(Consumer<List<SubNetworkInterface>> subNetworkInterfacesSetter) {
        if(this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        subNetworkInterfacesSetter.accept(this.subNetworkInterfaces);
        return this;
    }

    /**
     * 批量创建辅助弹性网卡的响应体
     * @return subNetworkInterfaces
     */
    public List<SubNetworkInterface> getSubNetworkInterfaces() {
        return subNetworkInterfaces;
    }

    public void setSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateSubNetworkInterfaceResponse batchCreateSubNetworkInterfaceResponse = (BatchCreateSubNetworkInterfaceResponse) o;
        return Objects.equals(this.requestId, batchCreateSubNetworkInterfaceResponse.requestId) &&
            Objects.equals(this.subNetworkInterfaces, batchCreateSubNetworkInterfaceResponse.subNetworkInterfaces);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, subNetworkInterfaces);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSubNetworkInterfaceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subNetworkInterfaces: ").append(toIndentedString(subNetworkInterfaces)).append("\n");
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

