package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchAccessKeysRequestBody
 */
public class BatchAccessKeysRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_ids")

    private List<String> accessKeyIds = null;

    public BatchAccessKeysRequestBody withAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
        return this;
    }

    public BatchAccessKeysRequestBody addAccessKeyIdsItem(String accessKeyIdsItem) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        this.accessKeyIds.add(accessKeyIdsItem);
        return this;
    }

    public BatchAccessKeysRequestBody withAccessKeyIds(Consumer<List<String>> accessKeyIdsSetter) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        accessKeyIdsSetter.accept(this.accessKeyIds);
        return this;
    }

    /**
     * 所需要绑定的访问密钥ID
     * @return accessKeyIds
     */
    public List<String> getAccessKeyIds() {
        return accessKeyIds;
    }

    public void setAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAccessKeysRequestBody that = (BatchAccessKeysRequestBody) obj;
        return Objects.equals(this.accessKeyIds, that.accessKeyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAccessKeysRequestBody {\n");
        sb.append("    accessKeyIds: ").append(toIndentedString(accessKeyIds)).append("\n");
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
