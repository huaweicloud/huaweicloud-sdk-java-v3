package com.huaweicloud.sdk.iam.v5.model;

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
public class ListAccessKeysV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_keys")

    private List<AccessKeyMetadata> accessKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAccessKeysV5Response withAccessKeys(List<AccessKeyMetadata> accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }

    public ListAccessKeysV5Response addAccessKeysItem(AccessKeyMetadata accessKeysItem) {
        if (this.accessKeys == null) {
            this.accessKeys = new ArrayList<>();
        }
        this.accessKeys.add(accessKeysItem);
        return this;
    }

    public ListAccessKeysV5Response withAccessKeys(Consumer<List<AccessKeyMetadata>> accessKeysSetter) {
        if (this.accessKeys == null) {
            this.accessKeys = new ArrayList<>();
        }
        accessKeysSetter.accept(this.accessKeys);
        return this;
    }

    /**
     * 永久访问密钥列表。
     * @return accessKeys
     */
    public List<AccessKeyMetadata> getAccessKeys() {
        return accessKeys;
    }

    public void setAccessKeys(List<AccessKeyMetadata> accessKeys) {
        this.accessKeys = accessKeys;
    }

    public ListAccessKeysV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccessKeysV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessKeysV5Response that = (ListAccessKeysV5Response) obj;
        return Objects.equals(this.accessKeys, that.accessKeys) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeys, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessKeysV5Response {\n");
        sb.append("    accessKeys: ").append(toIndentedString(accessKeys)).append("\n");
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
