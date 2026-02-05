package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAiApiKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_api_keys")

    private List<AiApiKeyBaseInfo> aiApiKeys = null;

    public ListAiApiKeysResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAiApiKeysResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListAiApiKeysResponse withAiApiKeys(List<AiApiKeyBaseInfo> aiApiKeys) {
        this.aiApiKeys = aiApiKeys;
        return this;
    }

    public ListAiApiKeysResponse addAiApiKeysItem(AiApiKeyBaseInfo aiApiKeysItem) {
        if (this.aiApiKeys == null) {
            this.aiApiKeys = new ArrayList<>();
        }
        this.aiApiKeys.add(aiApiKeysItem);
        return this;
    }

    public ListAiApiKeysResponse withAiApiKeys(Consumer<List<AiApiKeyBaseInfo>> aiApiKeysSetter) {
        if (this.aiApiKeys == null) {
            this.aiApiKeys = new ArrayList<>();
        }
        aiApiKeysSetter.accept(this.aiApiKeys);
        return this;
    }

    /**
     * AIAPIKey列表，展示匿名化的已经创建的AIAPIKey。 AIAPIKey的创建数量上限可以通过配额调整。 
     * @return aiApiKeys
     */
    public List<AiApiKeyBaseInfo> getAiApiKeys() {
        return aiApiKeys;
    }

    public void setAiApiKeys(List<AiApiKeyBaseInfo> aiApiKeys) {
        this.aiApiKeys = aiApiKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiApiKeysResponse that = (ListAiApiKeysResponse) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.aiApiKeys, that.aiApiKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, aiApiKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiApiKeysResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    aiApiKeys: ").append(toIndentedString(aiApiKeys)).append("\n");
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
