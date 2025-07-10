package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩容桌面池磁盘请求。
 */
public class ExpandDesktopPoolVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<VolumeInfo> volumes = null;

    public ExpandDesktopPoolVolumesReq withVolumes(List<VolumeInfo> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ExpandDesktopPoolVolumesReq addVolumesItem(VolumeInfo volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ExpandDesktopPoolVolumesReq withVolumes(Consumer<List<VolumeInfo>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 扩容的桌面池磁盘列表。
     * @return volumes
     */
    public List<VolumeInfo> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeInfo> volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandDesktopPoolVolumesReq that = (ExpandDesktopPoolVolumesReq) obj;
        return Objects.equals(this.volumes, that.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopPoolVolumesReq {\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
