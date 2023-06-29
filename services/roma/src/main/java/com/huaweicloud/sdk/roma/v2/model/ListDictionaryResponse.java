package com.huaweicloud.sdk.roma.v2.model;

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
public class ListDictionaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dictionaries")

    private List<Dictionary> dictionaries = null;

    public ListDictionaryResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数，与分页无关
     * minimum: 1
     * maximum: 128
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDictionaryResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 当前页的数量，小于等于请求里指定的limit
     * minimum: 1
     * maximum: 128
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListDictionaryResponse withDictionaries(List<Dictionary> dictionaries) {
        this.dictionaries = dictionaries;
        return this;
    }

    public ListDictionaryResponse addDictionariesItem(Dictionary dictionariesItem) {
        if (this.dictionaries == null) {
            this.dictionaries = new ArrayList<>();
        }
        this.dictionaries.add(dictionariesItem);
        return this;
    }

    public ListDictionaryResponse withDictionaries(Consumer<List<Dictionary>> dictionariesSetter) {
        if (this.dictionaries == null) {
            this.dictionaries = new ArrayList<>();
        }
        dictionariesSetter.accept(this.dictionaries);
        return this;
    }

    /**
     * 字典列表
     * @return dictionaries
     */
    public List<Dictionary> getDictionaries() {
        return dictionaries;
    }

    public void setDictionaries(List<Dictionary> dictionaries) {
        this.dictionaries = dictionaries;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDictionaryResponse that = (ListDictionaryResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.dictionaries, that.dictionaries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, dictionaries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDictionaryResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
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
