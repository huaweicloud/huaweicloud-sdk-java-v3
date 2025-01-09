package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量解绑用户请求
 */
public class BatchDetachInstancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<DetachInstancesDesktopInfo> desktops = null;

    public BatchDetachInstancesReq withDesktops(List<DetachInstancesDesktopInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public BatchDetachInstancesReq addDesktopsItem(DetachInstancesDesktopInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public BatchDetachInstancesReq withDesktops(Consumer<List<DetachInstancesDesktopInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 解绑的桌面信息列表。
     * @return desktops
     */
    public List<DetachInstancesDesktopInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<DetachInstancesDesktopInfo> desktops) {
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
        BatchDetachInstancesReq that = (BatchDetachInstancesReq) obj;
        return Objects.equals(this.desktops, that.desktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDetachInstancesReq {\n");
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
