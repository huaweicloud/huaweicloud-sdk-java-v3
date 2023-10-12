package com.huaweicloud.sdk.bss.v2.model;

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
public class ListSubCustomerNewTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_customer_tags")

    private List<NewCustomerTagItem> newCustomerTags = null;

    public ListSubCustomerNewTagResponse withNewCustomerTags(List<NewCustomerTagItem> newCustomerTags) {
        this.newCustomerTags = newCustomerTags;
        return this;
    }

    public ListSubCustomerNewTagResponse addNewCustomerTagsItem(NewCustomerTagItem newCustomerTagsItem) {
        if (this.newCustomerTags == null) {
            this.newCustomerTags = new ArrayList<>();
        }
        this.newCustomerTags.add(newCustomerTagsItem);
        return this;
    }

    public ListSubCustomerNewTagResponse withNewCustomerTags(Consumer<List<NewCustomerTagItem>> newCustomerTagsSetter) {
        if (this.newCustomerTags == null) {
            this.newCustomerTags = new ArrayList<>();
        }
        newCustomerTagsSetter.accept(this.newCustomerTags);
        return this;
    }

    /**
     * 新客标签信息列表。只有成功的时候才返回。 此列表不包含非子客户的数据。批量查询客户新客标签时，若入参携带了非子客户，会被过滤。 具体请参见表1 NewCustomerTagItem。
     * @return newCustomerTags
     */
    public List<NewCustomerTagItem> getNewCustomerTags() {
        return newCustomerTags;
    }

    public void setNewCustomerTags(List<NewCustomerTagItem> newCustomerTags) {
        this.newCustomerTags = newCustomerTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerNewTagResponse that = (ListSubCustomerNewTagResponse) obj;
        return Objects.equals(this.newCustomerTags, that.newCustomerTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newCustomerTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerNewTagResponse {\n");
        sb.append("    newCustomerTags: ").append(toIndentedString(newCustomerTags)).append("\n");
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
