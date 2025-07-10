package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量桌面删除标签。
 */
public class BatchDeleteDesktopsTagsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<DesktopTagsInfo> desktops = null;

    public BatchDeleteDesktopsTagsReq withDesktops(List<DesktopTagsInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public BatchDeleteDesktopsTagsReq addDesktopsItem(DesktopTagsInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public BatchDeleteDesktopsTagsReq withDesktops(Consumer<List<DesktopTagsInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面（桌面携带标签列表）列表。批量操作时非法桌面ID会过滤不做处理。
     * @return desktops
     */
    public List<DesktopTagsInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<DesktopTagsInfo> desktops) {
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
        BatchDeleteDesktopsTagsReq that = (BatchDeleteDesktopsTagsReq) obj;
        return Objects.equals(this.desktops, that.desktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDesktopsTagsReq {\n");
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
