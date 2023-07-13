package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 区块生成配置信息
 */
public class CreateRequestBodyBlockInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_timeout")

    private Long batchTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_message_count")

    private Long maxMessageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred_maxbytes")

    private Long preferredMaxbytes;

    public CreateRequestBodyBlockInfo withBatchTimeout(Long batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }

    /**
     * 区块产生时间（单位：秒），默认2秒
     * @return batchTimeout
     */
    public Long getBatchTimeout() {
        return batchTimeout;
    }

    public void setBatchTimeout(Long batchTimeout) {
        this.batchTimeout = batchTimeout;
    }

    public CreateRequestBodyBlockInfo withMaxMessageCount(Long maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }

    /**
     * 区块包含交易数量，默认500
     * @return maxMessageCount
     */
    public Long getMaxMessageCount() {
        return maxMessageCount;
    }

    public void setMaxMessageCount(Long maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
    }

    public CreateRequestBodyBlockInfo withPreferredMaxbytes(Long preferredMaxbytes) {
        this.preferredMaxbytes = preferredMaxbytes;
        return this;
    }

    /**
     * 区块容量（单位：MB），默认2MB
     * @return preferredMaxbytes
     */
    public Long getPreferredMaxbytes() {
        return preferredMaxbytes;
    }

    public void setPreferredMaxbytes(Long preferredMaxbytes) {
        this.preferredMaxbytes = preferredMaxbytes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRequestBodyBlockInfo that = (CreateRequestBodyBlockInfo) obj;
        return Objects.equals(this.batchTimeout, that.batchTimeout)
            && Objects.equals(this.maxMessageCount, that.maxMessageCount)
            && Objects.equals(this.preferredMaxbytes, that.preferredMaxbytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchTimeout, maxMessageCount, preferredMaxbytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestBodyBlockInfo {\n");
        sb.append("    batchTimeout: ").append(toIndentedString(batchTimeout)).append("\n");
        sb.append("    maxMessageCount: ").append(toIndentedString(maxMessageCount)).append("\n");
        sb.append("    preferredMaxbytes: ").append(toIndentedString(preferredMaxbytes)).append("\n");
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
