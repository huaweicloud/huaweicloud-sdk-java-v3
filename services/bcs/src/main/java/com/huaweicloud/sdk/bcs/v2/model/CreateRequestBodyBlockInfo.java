package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 区块生成配置信息
 */
public class CreateRequestBodyBlockInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="batch_timeout")
    
    private Integer batchTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_message_count")
    
    private Integer maxMessageCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preferred_maxbytes")
    
    private Integer preferredMaxbytes;

    public CreateRequestBodyBlockInfo withBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }

    


    /**
     * 区块产生时间（单位：秒），默认2秒
     * @return batchTimeout
     */
    public Integer getBatchTimeout() {
        return batchTimeout;
    }

    public void setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
    }

    

    public CreateRequestBodyBlockInfo withMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }

    


    /**
     * 区块包含交易数量，默认500
     * @return maxMessageCount
     */
    public Integer getMaxMessageCount() {
        return maxMessageCount;
    }

    public void setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
    }

    

    public CreateRequestBodyBlockInfo withPreferredMaxbytes(Integer preferredMaxbytes) {
        this.preferredMaxbytes = preferredMaxbytes;
        return this;
    }

    


    /**
     * 区块容量（单位：MB），默认2MB
     * @return preferredMaxbytes
     */
    public Integer getPreferredMaxbytes() {
        return preferredMaxbytes;
    }

    public void setPreferredMaxbytes(Integer preferredMaxbytes) {
        this.preferredMaxbytes = preferredMaxbytes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestBodyBlockInfo createRequestBodyBlockInfo = (CreateRequestBodyBlockInfo) o;
        return Objects.equals(this.batchTimeout, createRequestBodyBlockInfo.batchTimeout) &&
            Objects.equals(this.maxMessageCount, createRequestBodyBlockInfo.maxMessageCount) &&
            Objects.equals(this.preferredMaxbytes, createRequestBodyBlockInfo.preferredMaxbytes);
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

