package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListHasVerifiedContactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_list")

    private List<ContactV2> contactList = null;

    public ListHasVerifiedContactsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 总数 minimum: 0 maximum: 65535
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListHasVerifiedContactsResponse withContactList(List<ContactV2> contactList) {
        this.contactList = contactList;
        return this;
    }

    public ListHasVerifiedContactsResponse addContactListItem(ContactV2 contactListItem) {
        if (this.contactList == null) {
            this.contactList = new ArrayList<>();
        }
        this.contactList.add(contactListItem);
        return this;
    }

    public ListHasVerifiedContactsResponse withContactList(Consumer<List<ContactV2>> contactListSetter) {
        if (this.contactList == null) {
            this.contactList = new ArrayList<>();
        }
        contactListSetter.accept(this.contactList);
        return this;
    }

    /** 联系方式列表
     * 
     * @return contactList */
    public List<ContactV2> getContactList() {
        return contactList;
    }

    public void setContactList(List<ContactV2> contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHasVerifiedContactsResponse listHasVerifiedContactsResponse = (ListHasVerifiedContactsResponse) o;
        return Objects.equals(this.count, listHasVerifiedContactsResponse.count)
            && Objects.equals(this.contactList, listHasVerifiedContactsResponse.contactList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, contactList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHasVerifiedContactsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
