package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 增加磁盘请求。
 */
public class AddDesktopsVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_volumes")

    private List<AddDesktopVolumesReq> desktopVolumes = null;

    public AddDesktopsVolumesReq withDesktopVolumes(List<AddDesktopVolumesReq> desktopVolumes) {
        this.desktopVolumes = desktopVolumes;
        return this;
    }

    public AddDesktopsVolumesReq addDesktopVolumesItem(AddDesktopVolumesReq desktopVolumesItem) {
        if (this.desktopVolumes == null) {
            this.desktopVolumes = new ArrayList<>();
        }
        this.desktopVolumes.add(desktopVolumesItem);
        return this;
    }

    public AddDesktopsVolumesReq withDesktopVolumes(Consumer<List<AddDesktopVolumesReq>> desktopVolumesSetter) {
        if (this.desktopVolumes == null) {
            this.desktopVolumes = new ArrayList<>();
        }
        desktopVolumesSetter.accept(this.desktopVolumes);
        return this;
    }

    /**
     * 新增磁盘参数。
     * @return desktopVolumes
     */
    public List<AddDesktopVolumesReq> getDesktopVolumes() {
        return desktopVolumes;
    }

    public void setDesktopVolumes(List<AddDesktopVolumesReq> desktopVolumes) {
        this.desktopVolumes = desktopVolumes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDesktopsVolumesReq addDesktopsVolumesReq = (AddDesktopsVolumesReq) o;
        return Objects.equals(this.desktopVolumes, addDesktopsVolumesReq.desktopVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDesktopsVolumesReq {\n");
        sb.append("    desktopVolumes: ").append(toIndentedString(desktopVolumes)).append("\n");
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
