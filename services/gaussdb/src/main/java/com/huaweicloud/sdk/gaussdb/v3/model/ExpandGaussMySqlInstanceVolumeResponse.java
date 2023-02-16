package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExpandGaussMySqlInstanceVolumeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    
    private String orderId;

    public ExpandGaussMySqlInstanceVolumeResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 扩容后容量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ExpandGaussMySqlInstanceVolumeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandGaussMySqlInstanceVolumeResponse expandGaussMySqlInstanceVolumeResponse = (ExpandGaussMySqlInstanceVolumeResponse) o;
        return Objects.equals(this.size, expandGaussMySqlInstanceVolumeResponse.size) &&
            Objects.equals(this.orderId, expandGaussMySqlInstanceVolumeResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandGaussMySqlInstanceVolumeResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

