package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





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
public class ShowBalanceStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balanced")
    
    
    private Boolean balanced;

    public ShowBalanceStatusResponse withBalanced(Boolean balanced) {
        this.balanced = balanced;
        return this;
    }

    


    /**
     * 平衡状态。
     * @return balanced
     */
    public Boolean getBalanced() {
        return balanced;
    }

    public void setBalanced(Boolean balanced) {
        this.balanced = balanced;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBalanceStatusResponse showBalanceStatusResponse = (ShowBalanceStatusResponse) o;
        return Objects.equals(this.balanced, showBalanceStatusResponse.balanced);
    }
    @Override
    public int hashCode() {
        return Objects.hash(balanced);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBalanceStatusResponse {\n");
        sb.append("    balanced: ").append(toIndentedString(balanced)).append("\n");
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

