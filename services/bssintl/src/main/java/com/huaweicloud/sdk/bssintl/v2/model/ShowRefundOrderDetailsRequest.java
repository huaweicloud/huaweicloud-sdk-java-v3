package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowRefundOrderDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;

    public ShowRefundOrderDetailsRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * Get orderId
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
        ShowRefundOrderDetailsRequest showRefundOrderDetailsRequest = (ShowRefundOrderDetailsRequest) o;
        return Objects.equals(this.orderId, showRefundOrderDetailsRequest.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefundOrderDetailsRequest {\n");
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

