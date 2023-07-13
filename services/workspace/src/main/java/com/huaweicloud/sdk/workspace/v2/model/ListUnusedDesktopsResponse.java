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
public class ListUnusedDesktopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_desktops")

    private List<UnusedDesktopInfo> unusedDesktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListUnusedDesktopsResponse withUnusedDesktops(List<UnusedDesktopInfo> unusedDesktops) {
        this.unusedDesktops = unusedDesktops;
        return this;
    }

    public ListUnusedDesktopsResponse addUnusedDesktopsItem(UnusedDesktopInfo unusedDesktopsItem) {
        if (this.unusedDesktops == null) {
            this.unusedDesktops = new ArrayList<>();
        }
        this.unusedDesktops.add(unusedDesktopsItem);
        return this;
    }

    public ListUnusedDesktopsResponse withUnusedDesktops(Consumer<List<UnusedDesktopInfo>> unusedDesktopsSetter) {
        if (this.unusedDesktops == null) {
            this.unusedDesktops = new ArrayList<>();
        }
        unusedDesktopsSetter.accept(this.unusedDesktops);
        return this;
    }

    /**
     * 指定时间段内未使用桌面列表。
     * @return unusedDesktops
     */
    public List<UnusedDesktopInfo> getUnusedDesktops() {
        return unusedDesktops;
    }

    public void setUnusedDesktops(List<UnusedDesktopInfo> unusedDesktops) {
        this.unusedDesktops = unusedDesktops;
    }

    public ListUnusedDesktopsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 2000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUnusedDesktopsResponse that = (ListUnusedDesktopsResponse) obj;
        return Objects.equals(this.unusedDesktops, that.unusedDesktops)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unusedDesktops, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUnusedDesktopsResponse {\n");
        sb.append("    unusedDesktops: ").append(toIndentedString(unusedDesktops)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
