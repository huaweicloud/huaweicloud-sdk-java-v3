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
public class ListDesktopActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_actions")

    private List<DesktopAction> desktopActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDesktopActionsResponse withDesktopActions(List<DesktopAction> desktopActions) {
        this.desktopActions = desktopActions;
        return this;
    }

    public ListDesktopActionsResponse addDesktopActionsItem(DesktopAction desktopActionsItem) {
        if (this.desktopActions == null) {
            this.desktopActions = new ArrayList<>();
        }
        this.desktopActions.add(desktopActionsItem);
        return this;
    }

    public ListDesktopActionsResponse withDesktopActions(Consumer<List<DesktopAction>> desktopActionsSetter) {
        if (this.desktopActions == null) {
            this.desktopActions = new ArrayList<>();
        }
        desktopActionsSetter.accept(this.desktopActions);
        return this;
    }

    /**
     * 桌面开关列表。
     * @return desktopActions
     */
    public List<DesktopAction> getDesktopActions() {
        return desktopActions;
    }

    public void setDesktopActions(List<DesktopAction> desktopActions) {
        this.desktopActions = desktopActions;
    }

    public ListDesktopActionsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 2147483647
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
        ListDesktopActionsResponse that = (ListDesktopActionsResponse) obj;
        return Objects.equals(this.desktopActions, that.desktopActions)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopActions, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopActionsResponse {\n");
        sb.append("    desktopActions: ").append(toIndentedString(desktopActions)).append("\n");
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
