package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 阻断老化
 */
public class CreateRetryPolicyRequestBodyDataObjectBlockAge {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_block_ageing")

    private Boolean isBlockAgeing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_ageing")

    private String blockAgeing;

    public CreateRetryPolicyRequestBodyDataObjectBlockAge withIsBlockAgeing(Boolean isBlockAgeing) {
        this.isBlockAgeing = isBlockAgeing;
        return this;
    }

    /**
     * 是否阻断老化
     * @return isBlockAgeing
     */
    public Boolean getIsBlockAgeing() {
        return isBlockAgeing;
    }

    public void setIsBlockAgeing(Boolean isBlockAgeing) {
        this.isBlockAgeing = isBlockAgeing;
    }

    public CreateRetryPolicyRequestBodyDataObjectBlockAge withBlockAgeing(String blockAgeing) {
        this.blockAgeing = blockAgeing;
        return this;
    }

    /**
     * 老化时间，毫秒级时间戳
     * @return blockAgeing
     */
    public String getBlockAgeing() {
        return blockAgeing;
    }

    public void setBlockAgeing(String blockAgeing) {
        this.blockAgeing = blockAgeing;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRetryPolicyRequestBodyDataObjectBlockAge that = (CreateRetryPolicyRequestBodyDataObjectBlockAge) obj;
        return Objects.equals(this.isBlockAgeing, that.isBlockAgeing)
            && Objects.equals(this.blockAgeing, that.blockAgeing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBlockAgeing, blockAgeing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetryPolicyRequestBodyDataObjectBlockAge {\n");
        sb.append("    isBlockAgeing: ").append(toIndentedString(isBlockAgeing)).append("\n");
        sb.append("    blockAgeing: ").append(toIndentedString(blockAgeing)).append("\n");
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
