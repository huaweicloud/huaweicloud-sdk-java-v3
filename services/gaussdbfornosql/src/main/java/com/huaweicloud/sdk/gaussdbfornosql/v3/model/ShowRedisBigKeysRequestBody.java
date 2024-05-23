package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowRedisBigKeysRequestBody
 */
public class ShowRedisBigKeysRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_types")

    private List<String> keyTypes = null;

    public ShowRedisBigKeysRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置偏移量，表示从查询到的大key列表偏移offset条数据后查询对应的大key信息。 取值大于或等于0。不传该参数时，查询偏移量默认为0，表示从第一条大key开始查询。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowRedisBigKeysRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询个数上限值。 取值范围：1~100。不传该参数时，默认查询前100条大key。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowRedisBigKeysRequestBody withKeyTypes(List<String> keyTypes) {
        this.keyTypes = keyTypes;
        return this;
    }

    public ShowRedisBigKeysRequestBody addKeyTypesItem(String keyTypesItem) {
        if (this.keyTypes == null) {
            this.keyTypes = new ArrayList<>();
        }
        this.keyTypes.add(keyTypesItem);
        return this;
    }

    public ShowRedisBigKeysRequestBody withKeyTypes(Consumer<List<String>> keyTypesSetter) {
        if (this.keyTypes == null) {
            this.keyTypes = new ArrayList<>();
        }
        keyTypesSetter.accept(this.keyTypes);
        return this;
    }

    /**
     * 大key的类型,一个字符串列表,支持\"string\",\"hash\",\"zset\",\"set\",\"list\",\"stream\"六种类型。
     * @return keyTypes
     */
    public List<String> getKeyTypes() {
        return keyTypes;
    }

    public void setKeyTypes(List<String> keyTypes) {
        this.keyTypes = keyTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRedisBigKeysRequestBody that = (ShowRedisBigKeysRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.keyTypes, that.keyTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, keyTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRedisBigKeysRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    keyTypes: ").append(toIndentedString(keyTypes)).append("\n");
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
