package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TrashcanResultData
 */
public class TrashcanResultData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successNum")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedNum")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedMessages")

    private List<String> failedMessages = null;

    public TrashcanResultData withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**： 成功数目。 **取值范围**： 不涉及。 
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public TrashcanResultData withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释**： 失败数目。 **取值范围**： 不涉及。 
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public TrashcanResultData withFailedMessages(List<String> failedMessages) {
        this.failedMessages = failedMessages;
        return this;
    }

    public TrashcanResultData addFailedMessagesItem(String failedMessagesItem) {
        if (this.failedMessages == null) {
            this.failedMessages = new ArrayList<>();
        }
        this.failedMessages.add(failedMessagesItem);
        return this;
    }

    public TrashcanResultData withFailedMessages(Consumer<List<String>> failedMessagesSetter) {
        if (this.failedMessages == null) {
            this.failedMessages = new ArrayList<>();
        }
        failedMessagesSetter.accept(this.failedMessages);
        return this;
    }

    /**
     * **参数解释**： 失败原因。 **取值范围**： 不涉及。 
     * @return failedMessages
     */
    public List<String> getFailedMessages() {
        return failedMessages;
    }

    public void setFailedMessages(List<String> failedMessages) {
        this.failedMessages = failedMessages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrashcanResultData that = (TrashcanResultData) obj;
        return Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.failedMessages, that.failedMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successNum, failedNum, failedMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrashcanResultData {\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    failedMessages: ").append(toIndentedString(failedMessages)).append("\n");
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
