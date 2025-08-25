package com.huaweicloud.sdk.cpcs.v1.model;

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
public class BatchDisableAccessKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_ids")

    private List<String> accessKeyIds = null;

    public BatchDisableAccessKeysResponse withAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
        return this;
    }

    public BatchDisableAccessKeysResponse addAccessKeyIdsItem(String accessKeyIdsItem) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        this.accessKeyIds.add(accessKeyIdsItem);
        return this;
    }

    public BatchDisableAccessKeysResponse withAccessKeyIds(Consumer<List<String>> accessKeyIdsSetter) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        accessKeyIdsSetter.accept(this.accessKeyIds);
        return this;
    }

    /**
     * 禁用的访问密钥id列表
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
        BatchDisableAccessKeysResponse that = (BatchDisableAccessKeysResponse) obj;
        return Objects.equals(this.accessKeyIds, that.accessKeyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisableAccessKeysResponse {\n");
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
