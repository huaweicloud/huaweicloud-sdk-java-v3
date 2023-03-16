package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMessageClearRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_retain_number")

    private Integer messageRetainNumber;

    public ShowMessageClearRuleResponse withMessageRetainNumber(Integer messageRetainNumber) {
        this.messageRetainNumber = messageRetainNumber;
        return this;
    }

    /**
     * 最多保留记录数
     * @return messageRetainNumber
     */
    public Integer getMessageRetainNumber() {
        return messageRetainNumber;
    }

    public void setMessageRetainNumber(Integer messageRetainNumber) {
        this.messageRetainNumber = messageRetainNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessageClearRuleResponse showMessageClearRuleResponse = (ShowMessageClearRuleResponse) o;
        return Objects.equals(this.messageRetainNumber, showMessageClearRuleResponse.messageRetainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageRetainNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessageClearRuleResponse {\n");
        sb.append("    messageRetainNumber: ").append(toIndentedString(messageRetainNumber)).append("\n");
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
