package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListBackPoolMembersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_members")

    private List<BackPoolMemVO> poolMembers = null;

    public ListBackPoolMembersResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListBackPoolMembersResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListBackPoolMembersResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 当前流量池的成员总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListBackPoolMembersResponse withPoolMembers(List<BackPoolMemVO> poolMembers) {
        this.poolMembers = poolMembers;
        return this;
    }

    public ListBackPoolMembersResponse addPoolMembersItem(BackPoolMemVO poolMembersItem) {
        if (this.poolMembers == null) {
            this.poolMembers = new ArrayList<>();
        }
        this.poolMembers.add(poolMembersItem);
        return this;
    }

    public ListBackPoolMembersResponse withPoolMembers(Consumer<List<BackPoolMemVO>> poolMembersSetter) {
        if (this.poolMembers == null) {
            this.poolMembers = new ArrayList<>();
        }
        poolMembersSetter.accept(this.poolMembers);
        return this;
    }

    /**
     * 查询出来的流量池成员记录列表
     * @return poolMembers
     */
    public List<BackPoolMemVO> getPoolMembers() {
        return poolMembers;
    }

    public void setPoolMembers(List<BackPoolMemVO> poolMembers) {
        this.poolMembers = poolMembers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackPoolMembersResponse that = (ListBackPoolMembersResponse) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.count, that.count) && Objects.equals(this.poolMembers, that.poolMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, poolMembers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackPoolMembersResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    poolMembers: ").append(toIndentedString(poolMembers)).append("\n");
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
