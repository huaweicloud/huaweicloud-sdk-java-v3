package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IncidentOrderCCEmailInfoV2
 */
public class IncidentOrderCCEmailInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cc_email")
    
    private String ccEmail;

    public IncidentOrderCCEmailInfoV2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public IncidentOrderCCEmailInfoV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * 客户id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public IncidentOrderCCEmailInfoV2 withCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    


    /**
     * 操作邮箱
     * @return ccEmail
     */
    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentOrderCCEmailInfoV2 incidentOrderCCEmailInfoV2 = (IncidentOrderCCEmailInfoV2) o;
        return Objects.equals(this.userId, incidentOrderCCEmailInfoV2.userId) &&
            Objects.equals(this.customerId, incidentOrderCCEmailInfoV2.customerId) &&
            Objects.equals(this.ccEmail, incidentOrderCCEmailInfoV2.ccEmail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, customerId, ccEmail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentOrderCCEmailInfoV2 {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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

