package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面使用时间信息。
 */
public class DesktopUsedHoursInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_username")

    private String desktopUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_info_list")

    private List<DesktopUsedInfo> usedInfoList = null;

    public DesktopUsedHoursInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面Id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopUsedHoursInfo withDesktopUsername(String desktopUsername) {
        this.desktopUsername = desktopUsername;
        return this;
    }

    /**
     * 使用的用户。
     * @return desktopUsername
     */
    public String getDesktopUsername() {
        return desktopUsername;
    }

    public void setDesktopUsername(String desktopUsername) {
        this.desktopUsername = desktopUsername;
    }

    public DesktopUsedHoursInfo withUsedInfoList(List<DesktopUsedInfo> usedInfoList) {
        this.usedInfoList = usedInfoList;
        return this;
    }

    public DesktopUsedHoursInfo addUsedInfoListItem(DesktopUsedInfo usedInfoListItem) {
        if (this.usedInfoList == null) {
            this.usedInfoList = new ArrayList<>();
        }
        this.usedInfoList.add(usedInfoListItem);
        return this;
    }

    public DesktopUsedHoursInfo withUsedInfoList(Consumer<List<DesktopUsedInfo>> usedInfoListSetter) {
        if (this.usedInfoList == null) {
            this.usedInfoList = new ArrayList<>();
        }
        usedInfoListSetter.accept(this.usedInfoList);
        return this;
    }

    /**
     * 桌面使用时间列表。
     * @return usedInfoList
     */
    public List<DesktopUsedInfo> getUsedInfoList() {
        return usedInfoList;
    }

    public void setUsedInfoList(List<DesktopUsedInfo> usedInfoList) {
        this.usedInfoList = usedInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopUsedHoursInfo that = (DesktopUsedHoursInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.desktopUsername, that.desktopUsername)
            && Objects.equals(this.usedInfoList, that.usedInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, desktopUsername, usedInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopUsedHoursInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopUsername: ").append(toIndentedString(desktopUsername)).append("\n");
        sb.append("    usedInfoList: ").append(toIndentedString(usedInfoList)).append("\n");
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
