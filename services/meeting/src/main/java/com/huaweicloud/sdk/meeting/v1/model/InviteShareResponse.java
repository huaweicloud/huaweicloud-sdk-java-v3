package com.huaweicloud.sdk.meeting.v1.model;




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
public class InviteShareResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="returnCode")
    
    private Integer returnCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="returnDesc")
    
    private String returnDesc;

    public InviteShareResponse withReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    


    /**
     * 结果码
     * minimum: 0
     * maximum: 2147483647
     * @return returnCode
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    

    public InviteShareResponse withReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
        return this;
    }

    


    /**
     * 结果描述
     * @return returnDesc
     */
    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteShareResponse inviteShareResponse = (InviteShareResponse) o;
        return Objects.equals(this.returnCode, inviteShareResponse.returnCode) &&
            Objects.equals(this.returnDesc, inviteShareResponse.returnDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(returnCode, returnDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteShareResponse {\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
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

