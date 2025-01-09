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
public class ShowSubnetBandwidthControlListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_mode")

    private String controlMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_list")

    private List<ControlItem> controlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowSubnetBandwidthControlListResponse withControlMode(String controlMode) {
        this.controlMode = controlMode;
        return this;
    }

    /**
     * 控制模式 - BLACK：黑名单控制。 - WHITE：白名单控制。
     * @return controlMode
     */
    public String getControlMode() {
        return controlMode;
    }

    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }

    public ShowSubnetBandwidthControlListResponse withControlList(List<ControlItem> controlList) {
        this.controlList = controlList;
        return this;
    }

    public ShowSubnetBandwidthControlListResponse addControlListItem(ControlItem controlListItem) {
        if (this.controlList == null) {
            this.controlList = new ArrayList<>();
        }
        this.controlList.add(controlListItem);
        return this;
    }

    public ShowSubnetBandwidthControlListResponse withControlList(Consumer<List<ControlItem>> controlListSetter) {
        if (this.controlList == null) {
            this.controlList = new ArrayList<>();
        }
        controlListSetter.accept(this.controlList);
        return this;
    }

    /**
     * 控制的桌面列表。
     * @return controlList
     */
    public List<ControlItem> getControlList() {
        return controlList;
    }

    public void setControlList(List<ControlItem> controlList) {
        this.controlList = controlList;
    }

    public ShowSubnetBandwidthControlListResponse withTotalCount(Integer totalCount) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubnetBandwidthControlListResponse that = (ShowSubnetBandwidthControlListResponse) obj;
        return Objects.equals(this.controlMode, that.controlMode) && Objects.equals(this.controlList, that.controlList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlMode, controlList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubnetBandwidthControlListResponse {\n");
        sb.append("    controlMode: ").append(toIndentedString(controlMode)).append("\n");
        sb.append("    controlList: ").append(toIndentedString(controlList)).append("\n");
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
