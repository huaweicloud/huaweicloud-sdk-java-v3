package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestartEncodeServerRequestBody
 */
public class RestartEncodeServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_ids")

    private List<String> encodeServerIds = null;

    public RestartEncodeServerRequestBody withEncodeServerIds(List<String> encodeServerIds) {
        this.encodeServerIds = encodeServerIds;
        return this;
    }

    public RestartEncodeServerRequestBody addEncodeServerIdsItem(String encodeServerIdsItem) {
        if (this.encodeServerIds == null) {
            this.encodeServerIds = new ArrayList<>();
        }
        this.encodeServerIds.add(encodeServerIdsItem);
        return this;
    }

    public RestartEncodeServerRequestBody withEncodeServerIds(Consumer<List<String>> encodeServerIdsSetter) {
        if (this.encodeServerIds == null) {
            this.encodeServerIds = new ArrayList<>();
        }
        encodeServerIdsSetter.accept(this.encodeServerIds);
        return this;
    }

    /**
     * 待重启的编码服务的ID。
     * @return encodeServerIds
     */
    public List<String> getEncodeServerIds() {
        return encodeServerIds;
    }

    public void setEncodeServerIds(List<String> encodeServerIds) {
        this.encodeServerIds = encodeServerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartEncodeServerRequestBody that = (RestartEncodeServerRequestBody) obj;
        return Objects.equals(this.encodeServerIds, that.encodeServerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeServerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartEncodeServerRequestBody {\n");
        sb.append("    encodeServerIds: ").append(toIndentedString(encodeServerIds)).append("\n");
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
