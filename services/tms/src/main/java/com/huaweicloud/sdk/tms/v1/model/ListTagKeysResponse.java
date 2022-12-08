package com.huaweicloud.sdk.tms.v1.model;

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
public class ListTagKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<String> keys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoTagKeys pageInfo;

    public ListTagKeysResponse withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    public ListTagKeysResponse addKeysItem(String keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public ListTagKeysResponse withKeys(Consumer<List<String>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * 标签键列表
     * @return keys
     */
    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public ListTagKeysResponse withPageInfo(PageInfoTagKeys pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTagKeysResponse withPageInfo(Consumer<PageInfoTagKeys> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoTagKeys();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoTagKeys getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoTagKeys pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagKeysResponse listTagKeysResponse = (ListTagKeysResponse) o;
        return Objects.equals(this.keys, listTagKeysResponse.keys)
            && Objects.equals(this.pageInfo, listTagKeysResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagKeysResponse {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
