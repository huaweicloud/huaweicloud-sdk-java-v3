package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowShardDiskMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_disk_infos")

    private List<GroupDiskInfoResult> groupDiskInfos = null;

    public ShowShardDiskMessagesResponse withGroupDiskInfos(List<GroupDiskInfoResult> groupDiskInfos) {
        this.groupDiskInfos = groupDiskInfos;
        return this;
    }

    public ShowShardDiskMessagesResponse addGroupDiskInfosItem(GroupDiskInfoResult groupDiskInfosItem) {
        if (this.groupDiskInfos == null) {
            this.groupDiskInfos = new ArrayList<>();
        }
        this.groupDiskInfos.add(groupDiskInfosItem);
        return this;
    }

    public ShowShardDiskMessagesResponse withGroupDiskInfos(Consumer<List<GroupDiskInfoResult>> groupDiskInfosSetter) {
        if (this.groupDiskInfos == null) {
            this.groupDiskInfos = new ArrayList<>();
        }
        groupDiskInfosSetter.accept(this.groupDiskInfos);
        return this;
    }

    /**
     * **参数解释**： 分片磁盘信息列表。
     * @return groupDiskInfos
     */
    public List<GroupDiskInfoResult> getGroupDiskInfos() {
        return groupDiskInfos;
    }

    public void setGroupDiskInfos(List<GroupDiskInfoResult> groupDiskInfos) {
        this.groupDiskInfos = groupDiskInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShardDiskMessagesResponse that = (ShowShardDiskMessagesResponse) obj;
        return Objects.equals(this.groupDiskInfos, that.groupDiskInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupDiskInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShardDiskMessagesResponse {\n");
        sb.append("    groupDiskInfos: ").append(toIndentedString(groupDiskInfos)).append("\n");
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
