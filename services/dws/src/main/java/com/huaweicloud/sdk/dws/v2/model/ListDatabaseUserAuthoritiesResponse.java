package com.huaweicloud.sdk.dws.v2.model;

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
public class ListDatabaseUserAuthoritiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authority_list")

    private List<GrantAuthority> authorityList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDatabaseUserAuthoritiesResponse withAuthorityList(List<GrantAuthority> authorityList) {
        this.authorityList = authorityList;
        return this;
    }

    public ListDatabaseUserAuthoritiesResponse addAuthorityListItem(GrantAuthority authorityListItem) {
        if (this.authorityList == null) {
            this.authorityList = new ArrayList<>();
        }
        this.authorityList.add(authorityListItem);
        return this;
    }

    public ListDatabaseUserAuthoritiesResponse withAuthorityList(Consumer<List<GrantAuthority>> authorityListSetter) {
        if (this.authorityList == null) {
            this.authorityList = new ArrayList<>();
        }
        authorityListSetter.accept(this.authorityList);
        return this;
    }

    /**
     * **参数解释**： 权限详情列表。 **取值范围**： 不涉及。
     * @return authorityList
     */
    public List<GrantAuthority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<GrantAuthority> authorityList) {
        this.authorityList = authorityList;
    }

    public ListDatabaseUserAuthoritiesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 权限总条数。 **取值范围**： 不涉及。
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
        ListDatabaseUserAuthoritiesResponse that = (ListDatabaseUserAuthoritiesResponse) obj;
        return Objects.equals(this.authorityList, that.authorityList) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorityList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseUserAuthoritiesResponse {\n");
        sb.append("    authorityList: ").append(toIndentedString(authorityList)).append("\n");
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
