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
public class ListDesktopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<SimpleDesktopInfo> desktops = null;

    public ListDesktopsResponse withTotalCount(Integer totalCount) {
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

    public ListDesktopsResponse withDesktops(List<SimpleDesktopInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public ListDesktopsResponse addDesktopsItem(SimpleDesktopInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public ListDesktopsResponse withDesktops(Consumer<List<SimpleDesktopInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面信息。
     * @return desktops
     */
    public List<SimpleDesktopInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<SimpleDesktopInfo> desktops) {
        this.desktops = desktops;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsResponse that = (ListDesktopsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.desktops, that.desktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, desktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
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
