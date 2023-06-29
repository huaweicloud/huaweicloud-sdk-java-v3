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
public class ListUsedDesktopInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_used_info_list")

    private List<DesktopUsedHoursInfo> desktopUsedInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListUsedDesktopInfoResponse withDesktopUsedInfoList(List<DesktopUsedHoursInfo> desktopUsedInfoList) {
        this.desktopUsedInfoList = desktopUsedInfoList;
        return this;
    }

    public ListUsedDesktopInfoResponse addDesktopUsedInfoListItem(DesktopUsedHoursInfo desktopUsedInfoListItem) {
        if (this.desktopUsedInfoList == null) {
            this.desktopUsedInfoList = new ArrayList<>();
        }
        this.desktopUsedInfoList.add(desktopUsedInfoListItem);
        return this;
    }

    public ListUsedDesktopInfoResponse withDesktopUsedInfoList(
        Consumer<List<DesktopUsedHoursInfo>> desktopUsedInfoListSetter) {
        if (this.desktopUsedInfoList == null) {
            this.desktopUsedInfoList = new ArrayList<>();
        }
        desktopUsedInfoListSetter.accept(this.desktopUsedInfoList);
        return this;
    }

    /**
     * 桌面使用信息（以桌面Id划分）。
     * @return desktopUsedInfoList
     */
    public List<DesktopUsedHoursInfo> getDesktopUsedInfoList() {
        return desktopUsedInfoList;
    }

    public void setDesktopUsedInfoList(List<DesktopUsedHoursInfo> desktopUsedInfoList) {
        this.desktopUsedInfoList = desktopUsedInfoList;
    }

    public ListUsedDesktopInfoResponse withTotalCount(Integer totalCount) {
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
        ListUsedDesktopInfoResponse that = (ListUsedDesktopInfoResponse) obj;
        return Objects.equals(this.desktopUsedInfoList, that.desktopUsedInfoList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopUsedInfoList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsedDesktopInfoResponse {\n");
        sb.append("    desktopUsedInfoList: ").append(toIndentedString(desktopUsedInfoList)).append("\n");
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
