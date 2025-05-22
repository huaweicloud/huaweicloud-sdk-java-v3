package com.huaweicloud.sdk.dws.v2.model;

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
public class ShowClusterVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicate")

    private Integer duplicate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_info_list")

    private List<DiskInfoResponse> diskInfoList = null;

    public ShowClusterVolumeResponse withDuplicate(Integer duplicate) {
        this.duplicate = duplicate;
        return this;
    }

    /**
     * **参数解释**： 单节点磁盘数量。 **取值范围**： 不涉及。
     * @return duplicate
     */
    public Integer getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Integer duplicate) {
        this.duplicate = duplicate;
    }

    public ShowClusterVolumeResponse withDiskInfoList(List<DiskInfoResponse> diskInfoList) {
        this.diskInfoList = diskInfoList;
        return this;
    }

    public ShowClusterVolumeResponse addDiskInfoListItem(DiskInfoResponse diskInfoListItem) {
        if (this.diskInfoList == null) {
            this.diskInfoList = new ArrayList<>();
        }
        this.diskInfoList.add(diskInfoListItem);
        return this;
    }

    public ShowClusterVolumeResponse withDiskInfoList(Consumer<List<DiskInfoResponse>> diskInfoListSetter) {
        if (this.diskInfoList == null) {
            this.diskInfoList = new ArrayList<>();
        }
        diskInfoListSetter.accept(this.diskInfoList);
        return this;
    }

    /**
     * **参数解释**： 节点容量详情。 **取值范围**： 不涉及。
     * @return diskInfoList
     */
    public List<DiskInfoResponse> getDiskInfoList() {
        return diskInfoList;
    }

    public void setDiskInfoList(List<DiskInfoResponse> diskInfoList) {
        this.diskInfoList = diskInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterVolumeResponse that = (ShowClusterVolumeResponse) obj;
        return Objects.equals(this.duplicate, that.duplicate) && Objects.equals(this.diskInfoList, that.diskInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duplicate, diskInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterVolumeResponse {\n");
        sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
        sb.append("    diskInfoList: ").append(toIndentedString(diskInfoList)).append("\n");
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
