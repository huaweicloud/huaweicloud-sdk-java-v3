package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ShowRedisBigKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<BigKeysInfoResponseBody> keys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowRedisBigKeysResponse withKeys(List<BigKeysInfoResponseBody> keys) {
        this.keys = keys;
        return this;
    }

    public ShowRedisBigKeysResponse addKeysItem(BigKeysInfoResponseBody keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public ShowRedisBigKeysResponse withKeys(Consumer<List<BigKeysInfoResponseBody>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * 查询到的大Key列表。
     * @return keys
     */
    public List<BigKeysInfoResponseBody> getKeys() {
        return keys;
    }

    public void setKeys(List<BigKeysInfoResponseBody> keys) {
        this.keys = keys;
    }

    public ShowRedisBigKeysResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 大Key的总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRedisBigKeysResponse that = (ShowRedisBigKeysResponse) obj;
        return Objects.equals(this.keys, that.keys) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRedisBigKeysResponse {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
