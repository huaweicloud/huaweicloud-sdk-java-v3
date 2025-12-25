package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Result
 */
public class Result {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_msg_bytes")

    private BigDecimal averageMsgBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_msgs")

    private Long subscribeMsgs;

    public Result withAverageMsgBytes(BigDecimal averageMsgBytes) {
        this.averageMsgBytes = averageMsgBytes;
        return this;
    }

    /**
     * 平均消费大小
     * minimum: 0
     * maximum: 1E+13
     * @return averageMsgBytes
     */
    public BigDecimal getAverageMsgBytes() {
        return averageMsgBytes;
    }

    public void setAverageMsgBytes(BigDecimal averageMsgBytes) {
        this.averageMsgBytes = averageMsgBytes;
    }

    public Result withSubscribeMsgs(Long subscribeMsgs) {
        this.subscribeMsgs = subscribeMsgs;
        return this;
    }

    /**
     * 消费条数
     * minimum: 0
     * maximum: 10000000000000
     * @return subscribeMsgs
     */
    public Long getSubscribeMsgs() {
        return subscribeMsgs;
    }

    public void setSubscribeMsgs(Long subscribeMsgs) {
        this.subscribeMsgs = subscribeMsgs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Result that = (Result) obj;
        return Objects.equals(this.averageMsgBytes, that.averageMsgBytes)
            && Objects.equals(this.subscribeMsgs, that.subscribeMsgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageMsgBytes, subscribeMsgs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Result {\n");
        sb.append("    averageMsgBytes: ").append(toIndentedString(averageMsgBytes)).append("\n");
        sb.append("    subscribeMsgs: ").append(toIndentedString(subscribeMsgs)).append("\n");
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
