package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListDesktopPoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pools")

    private List<SimpleDesktopPoolInfo> desktopPools = null;

    public ListDesktopPoolsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDesktopPoolsResponse withDesktopPools(List<SimpleDesktopPoolInfo> desktopPools) {
        this.desktopPools = desktopPools;
        return this;
    }

    public ListDesktopPoolsResponse addDesktopPoolsItem(SimpleDesktopPoolInfo desktopPoolsItem) {
        if (this.desktopPools == null) {
            this.desktopPools = new ArrayList<>();
        }
        this.desktopPools.add(desktopPoolsItem);
        return this;
    }

    public ListDesktopPoolsResponse withDesktopPools(Consumer<List<SimpleDesktopPoolInfo>> desktopPoolsSetter) {
        if (this.desktopPools == null) {
            this.desktopPools = new ArrayList<>();
        }
        desktopPoolsSetter.accept(this.desktopPools);
        return this;
    }

    /**
     * 桌面池信息。
     * @return desktopPools
     */
    public List<SimpleDesktopPoolInfo> getDesktopPools() {
        return desktopPools;
    }

    public void setDesktopPools(List<SimpleDesktopPoolInfo> desktopPools) {
        this.desktopPools = desktopPools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopPoolsResponse that = (ListDesktopPoolsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.desktopPools, that.desktopPools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, desktopPools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopPoolsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    desktopPools: ").append(toIndentedString(desktopPools)).append("\n");
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
