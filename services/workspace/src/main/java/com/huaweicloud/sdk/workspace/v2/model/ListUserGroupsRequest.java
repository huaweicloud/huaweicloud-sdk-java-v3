package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListUserGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private List<String> platformType = null;

    public ListUserGroupsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回用户组数量限制。如果不指定或为0，则使用默认值100，从1开始，最大100。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListUserGroupsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始，默认值0，必须与limit同时使用。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListUserGroupsRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 用来匹配用户组的搜索关键字。例如根据组名模糊查询。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListUserGroupsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 根据用户组的域名进行过滤。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListUserGroupsRequest withPlatformType(List<String> platformType) {
        this.platformType = platformType;
        return this;
    }

    public ListUserGroupsRequest addPlatformTypeItem(String platformTypeItem) {
        if (this.platformType == null) {
            this.platformType = new ArrayList<>();
        }
        this.platformType.add(platformTypeItem);
        return this;
    }

    public ListUserGroupsRequest withPlatformType(Consumer<List<String>> platformTypeSetter) {
        if (this.platformType == null) {
            this.platformType = new ArrayList<>();
        }
        platformTypeSetter.accept(this.platformType);
        return this;
    }

    /**
     * 用户类型。 * AD： AD域用户 * LOCAL： 本地liteAs用户 * UOS： UOS域用户
     * @return platformType
     */
    public List<String> getPlatformType() {
        return platformType;
    }

    public void setPlatformType(List<String> platformType) {
        this.platformType = platformType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserGroupsRequest that = (ListUserGroupsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.platformType, that.platformType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, keyword, domain, platformType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserGroupsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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
