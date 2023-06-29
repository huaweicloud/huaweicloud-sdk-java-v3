package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除桌面数据盘请求。
 */
public class DeleteVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    private List<String> volumeIds = null;

    public DeleteVolumesReq withVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public DeleteVolumesReq addVolumeIdsItem(String volumeIdsItem) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        this.volumeIds.add(volumeIdsItem);
        return this;
    }

    public DeleteVolumesReq withVolumeIds(Consumer<List<String>> volumeIdsSetter) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        volumeIdsSetter.accept(this.volumeIds);
        return this;
    }

    /**
     * 待删除的桌面数据盘ID列表。
     * @return volumeIds
     */
    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVolumesReq that = (DeleteVolumesReq) obj;
        return Objects.equals(this.volumeIds, that.volumeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVolumesReq {\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
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
