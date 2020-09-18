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
public class ShowSubCustomerBudgetRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;

    public ShowSubCustomerBudgetRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * Get customerId
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSubCustomerBudgetRequest showSubCustomerBudgetRequest = (ShowSubCustomerBudgetRequest) o;
        return Objects.equals(this.customerId, showSubCustomerBudgetRequest.customerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubCustomerBudgetRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

