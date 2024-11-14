package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckCallNumberInConfRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_number")

    private String callNumber;

    public CheckCallNumberInConfRequest withCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }

    /**
     * 呼叫号码
     * @return callNumber
     */
    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckCallNumberInConfRequest that = (CheckCallNumberInConfRequest) obj;
        return Objects.equals(this.callNumber, that.callNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCallNumberInConfRequest {\n");
        sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
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
