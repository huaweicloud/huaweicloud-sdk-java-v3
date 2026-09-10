package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量关联或取消关联数据集成资源到工作空间请求体。
 */
public class BatchBindMigrationResourceToWorkspaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "banding_resource_list")

    private List<MigrationBindResource> bandingResourceList = null;

    public BatchBindMigrationResourceToWorkspaceRequestBody withBandingResourceList(
        List<MigrationBindResource> bandingResourceList) {
        this.bandingResourceList = bandingResourceList;
        return this;
    }

    public BatchBindMigrationResourceToWorkspaceRequestBody addBandingResourceListItem(
        MigrationBindResource bandingResourceListItem) {
        if (this.bandingResourceList == null) {
            this.bandingResourceList = new ArrayList<>();
        }
        this.bandingResourceList.add(bandingResourceListItem);
        return this;
    }

    public BatchBindMigrationResourceToWorkspaceRequestBody withBandingResourceList(
        Consumer<List<MigrationBindResource>> bandingResourceListSetter) {
        if (this.bandingResourceList == null) {
            this.bandingResourceList = new ArrayList<>();
        }
        bandingResourceListSetter.accept(this.bandingResourceList);
        return this;
    }

    /**
     * 待关联或取消关联的资源列表。
     * @return bandingResourceList
     */
    public List<MigrationBindResource> getBandingResourceList() {
        return bandingResourceList;
    }

    public void setBandingResourceList(List<MigrationBindResource> bandingResourceList) {
        this.bandingResourceList = bandingResourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBindMigrationResourceToWorkspaceRequestBody that = (BatchBindMigrationResourceToWorkspaceRequestBody) obj;
        return Objects.equals(this.bandingResourceList, that.bandingResourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandingResourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBindMigrationResourceToWorkspaceRequestBody {\n");
        sb.append("    bandingResourceList: ").append(toIndentedString(bandingResourceList)).append("\n");
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
