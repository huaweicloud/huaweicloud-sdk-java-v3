package com.huaweicloud.sdk.kms.v2.model;

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
public class ListTrustedKeySpaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListAccessPointResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspaces")

    private List<ListTrustedKeySpaceResponseBodyKeyspaces> keyspaces = null;

    public ListTrustedKeySpaceResponse withPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTrustedKeySpaceResponse withPageInfo(Consumer<ListAccessPointResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListAccessPointResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListAccessPointResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListTrustedKeySpaceResponse withKeyspaces(List<ListTrustedKeySpaceResponseBodyKeyspaces> keyspaces) {
        this.keyspaces = keyspaces;
        return this;
    }

    public ListTrustedKeySpaceResponse addKeyspacesItem(ListTrustedKeySpaceResponseBodyKeyspaces keyspacesItem) {
        if (this.keyspaces == null) {
            this.keyspaces = new ArrayList<>();
        }
        this.keyspaces.add(keyspacesItem);
        return this;
    }

    public ListTrustedKeySpaceResponse withKeyspaces(
        Consumer<List<ListTrustedKeySpaceResponseBodyKeyspaces>> keyspacesSetter) {
        if (this.keyspaces == null) {
            this.keyspaces = new ArrayList<>();
        }
        keyspacesSetter.accept(this.keyspaces);
        return this;
    }

    /**
     * **参数解释：** 密钥空间列表 **取值范围：** 不涉及
     * @return keyspaces
     */
    public List<ListTrustedKeySpaceResponseBodyKeyspaces> getKeyspaces() {
        return keyspaces;
    }

    public void setKeyspaces(List<ListTrustedKeySpaceResponseBodyKeyspaces> keyspaces) {
        this.keyspaces = keyspaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrustedKeySpaceResponse that = (ListTrustedKeySpaceResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.keyspaces, that.keyspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, keyspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrustedKeySpaceResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    keyspaces: ").append(toIndentedString(keyspaces)).append("\n");
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
