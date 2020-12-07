package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CancelSubscriptionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_urn")
    
    private String subscriptionUrn;

    public CancelSubscriptionRequest withSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
        return this;
    }

    


    /**
     * Get subscriptionUrn
     * @return subscriptionUrn
     */
    public String getSubscriptionUrn() {
        return subscriptionUrn;
    }

    public void setSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelSubscriptionRequest cancelSubscriptionRequest = (CancelSubscriptionRequest) o;
        return Objects.equals(this.subscriptionUrn, cancelSubscriptionRequest.subscriptionUrn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelSubscriptionRequest {\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
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

