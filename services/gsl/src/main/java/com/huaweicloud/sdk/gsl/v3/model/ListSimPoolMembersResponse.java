package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSimPoolMembersResponse extends SdkResponse {

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

    private List<PoolMemVO> poolMembers = null;

    public ListSimPoolMembersResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** 每页记录数
     * 
     * @return limit */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSimPoolMembersResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /** 页码
     * 
     * @return offset */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSimPoolMembersResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /** 当前流量池的成员总数
     * 
     * @return count */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListSimPoolMembersResponse withPoolMembers(List<PoolMemVO> poolMembers) {
        this.poolMembers = poolMembers;
        return this;
    }

    public ListSimPoolMembersResponse addPoolMembersItem(PoolMemVO poolMembersItem) {
        if (this.poolMembers == null) {
            this.poolMembers = new ArrayList<>();
        }
        this.poolMembers.add(poolMembersItem);
        return this;
    }

    public ListSimPoolMembersResponse withPoolMembers(Consumer<List<PoolMemVO>> poolMembersSetter) {
        if (this.poolMembers == null) {
            this.poolMembers = new ArrayList<>();
        }
        poolMembersSetter.accept(this.poolMembers);
        return this;
    }

    /** 查询出来的流量池成员记录列表
     * 
     * @return poolMembers */
    public List<PoolMemVO> getPoolMembers() {
        return poolMembers;
    }

    public void setPoolMembers(List<PoolMemVO> poolMembers) {
        this.poolMembers = poolMembers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimPoolMembersResponse listSimPoolMembersResponse = (ListSimPoolMembersResponse) o;
        return Objects.equals(this.limit, listSimPoolMembersResponse.limit)
            && Objects.equals(this.offset, listSimPoolMembersResponse.offset)
            && Objects.equals(this.count, listSimPoolMembersResponse.count)
            && Objects.equals(this.poolMembers, listSimPoolMembersResponse.poolMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, poolMembers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimPoolMembersResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    poolMembers: ").append(toIndentedString(poolMembers)).append("\n");
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
