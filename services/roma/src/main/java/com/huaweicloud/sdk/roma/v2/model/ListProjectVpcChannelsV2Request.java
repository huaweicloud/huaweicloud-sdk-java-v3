package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectVpcChannelsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_host")

    private String memberHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_port")

    private Integer memberPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_id")

    private String memberGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members_return")

    private Boolean membersReturn;

    public ListProjectVpcChannelsV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListProjectVpcChannelsV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectVpcChannelsV2Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPC通道的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListProjectVpcChannelsV2Request withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPC通道的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProjectVpcChannelsV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /**
     * 指定需要精确匹配查找的参数名称，多个参数需要支持精确匹配时参数之间使用“,”隔开。  目前支持name，member_group_name。
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListProjectVpcChannelsV2Request withMemberHost(String memberHost) {
        this.memberHost = memberHost;
        return this;
    }

    /**
     * 后端服务地址。默认精确查询，不支持模糊查询。
     * @return memberHost
     */
    public String getMemberHost() {
        return memberHost;
    }

    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost;
    }

    public ListProjectVpcChannelsV2Request withMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
        return this;
    }

    /**
     * 后端服务器端口
     * minimum: 0
     * maximum: 65535
     * @return memberPort
     */
    public Integer getMemberPort() {
        return memberPort;
    }

    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    public ListProjectVpcChannelsV2Request withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /**
     * 后端服务器组名称
     * @return memberGroupName
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public ListProjectVpcChannelsV2Request withMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
        return this;
    }

    /**
     * 后端服务器组编号
     * @return memberGroupId
     */
    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public ListProjectVpcChannelsV2Request withMembersReturn(Boolean membersReturn) {
        this.membersReturn = membersReturn;
        return this;
    }

    /**
     * 是否返回后端实例列表
     * @return membersReturn
     */
    public Boolean getMembersReturn() {
        return membersReturn;
    }

    public void setMembersReturn(Boolean membersReturn) {
        this.membersReturn = membersReturn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectVpcChannelsV2Request listProjectVpcChannelsV2Request = (ListProjectVpcChannelsV2Request) o;
        return Objects.equals(this.offset, listProjectVpcChannelsV2Request.offset)
            && Objects.equals(this.limit, listProjectVpcChannelsV2Request.limit)
            && Objects.equals(this.id, listProjectVpcChannelsV2Request.id)
            && Objects.equals(this.name, listProjectVpcChannelsV2Request.name)
            && Objects.equals(this.preciseSearch, listProjectVpcChannelsV2Request.preciseSearch)
            && Objects.equals(this.memberHost, listProjectVpcChannelsV2Request.memberHost)
            && Objects.equals(this.memberPort, listProjectVpcChannelsV2Request.memberPort)
            && Objects.equals(this.memberGroupName, listProjectVpcChannelsV2Request.memberGroupName)
            && Objects.equals(this.memberGroupId, listProjectVpcChannelsV2Request.memberGroupId)
            && Objects.equals(this.membersReturn, listProjectVpcChannelsV2Request.membersReturn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            id,
            name,
            preciseSearch,
            memberHost,
            memberPort,
            memberGroupName,
            memberGroupId,
            membersReturn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectVpcChannelsV2Request {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("    memberHost: ").append(toIndentedString(memberHost)).append("\n");
        sb.append("    memberPort: ").append(toIndentedString(memberPort)).append("\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    memberGroupId: ").append(toIndentedString(memberGroupId)).append("\n");
        sb.append("    membersReturn: ").append(toIndentedString(membersReturn)).append("\n");
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
