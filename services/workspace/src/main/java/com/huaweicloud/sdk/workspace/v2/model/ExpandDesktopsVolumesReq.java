package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩容磁盘请求。
 */
public class ExpandDesktopsVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_volumes_expansion")

    private List<ExpandVolumesReq> desktopVolumesExpansion = null;

    public ExpandDesktopsVolumesReq withDesktopVolumesExpansion(List<ExpandVolumesReq> desktopVolumesExpansion) {
        this.desktopVolumesExpansion = desktopVolumesExpansion;
        return this;
    }

    public ExpandDesktopsVolumesReq addDesktopVolumesExpansionItem(ExpandVolumesReq desktopVolumesExpansionItem) {
        if (this.desktopVolumesExpansion == null) {
            this.desktopVolumesExpansion = new ArrayList<>();
        }
        this.desktopVolumesExpansion.add(desktopVolumesExpansionItem);
        return this;
    }

    public ExpandDesktopsVolumesReq withDesktopVolumesExpansion(
        Consumer<List<ExpandVolumesReq>> desktopVolumesExpansionSetter) {
        if (this.desktopVolumesExpansion == null) {
            this.desktopVolumesExpansion = new ArrayList<>();
        }
        desktopVolumesExpansionSetter.accept(this.desktopVolumesExpansion);
        return this;
    }

    /**
     * 扩容磁盘参数。
     * @return desktopVolumesExpansion
     */
    public List<ExpandVolumesReq> getDesktopVolumesExpansion() {
        return desktopVolumesExpansion;
    }

    public void setDesktopVolumesExpansion(List<ExpandVolumesReq> desktopVolumesExpansion) {
        this.desktopVolumesExpansion = desktopVolumesExpansion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandDesktopsVolumesReq expandDesktopsVolumesReq = (ExpandDesktopsVolumesReq) o;
        return Objects.equals(this.desktopVolumesExpansion, expandDesktopsVolumesReq.desktopVolumesExpansion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopVolumesExpansion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopsVolumesReq {\n");
        sb.append("    desktopVolumesExpansion: ").append(toIndentedString(desktopVolumesExpansion)).append("\n");
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
