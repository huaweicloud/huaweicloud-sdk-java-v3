package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解绑用户请求
 */
public class DetachInstancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shutoff_after_detach")

    private Boolean shutoffAfterDetach;

    public DetachInstancesReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public DetachInstancesReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public DetachInstancesReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 桌面id,不能为空
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public DetachInstancesReq withShutoffAfterDetach(Boolean shutoffAfterDetach) {
        this.shutoffAfterDetach = shutoffAfterDetach;
        return this;
    }

    /**
     * 解绑后是否关机。
     * @return shutoffAfterDetach
     */
    public Boolean getShutoffAfterDetach() {
        return shutoffAfterDetach;
    }

    public void setShutoffAfterDetach(Boolean shutoffAfterDetach) {
        this.shutoffAfterDetach = shutoffAfterDetach;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachInstancesReq that = (DetachInstancesReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds)
            && Objects.equals(this.shutoffAfterDetach, that.shutoffAfterDetach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, shutoffAfterDetach);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachInstancesReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    shutoffAfterDetach: ").append(toIndentedString(shutoffAfterDetach)).append("\n");
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
