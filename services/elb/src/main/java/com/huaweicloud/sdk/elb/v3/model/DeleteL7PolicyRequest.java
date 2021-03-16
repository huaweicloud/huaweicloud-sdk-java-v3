package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteL7PolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policy_id")
    
    private String l7policyId;

    public DeleteL7PolicyRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    


    /**
     * Get l7policyId
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteL7PolicyRequest deleteL7PolicyRequest = (DeleteL7PolicyRequest) o;
        return Objects.equals(this.l7policyId, deleteL7PolicyRequest.l7policyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(l7policyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteL7PolicyRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
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

