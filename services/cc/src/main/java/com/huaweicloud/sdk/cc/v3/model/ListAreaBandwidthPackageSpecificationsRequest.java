package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAreaBandwidthPackageSpecificationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private List<String> localAreaId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private List<String> remoteAreaId = null;

    public ListAreaBandwidthPackageSpecificationsRequest withLocalAreaId(List<String> localAreaId) {
        this.localAreaId = localAreaId;
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsRequest addLocalAreaIdItem(String localAreaIdItem) {
        if (this.localAreaId == null) {
            this.localAreaId = new ArrayList<>();
        }
        this.localAreaId.add(localAreaIdItem);
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsRequest withLocalAreaId(Consumer<List<String>> localAreaIdSetter) {
        if (this.localAreaId == null) {
            this.localAreaId = new ArrayList<>();
        }
        localAreaIdSetter.accept(this.localAreaId);
        return this;
    }

    /**
     * 根据本端大区ID过滤带宽包资源规格列表
     * @return localAreaId
     */
    public List<String> getLocalAreaId() {
        return localAreaId;
    }

    public void setLocalAreaId(List<String> localAreaId) {
        this.localAreaId = localAreaId;
    }

    public ListAreaBandwidthPackageSpecificationsRequest withRemoteAreaId(List<String> remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsRequest addRemoteAreaIdItem(String remoteAreaIdItem) {
        if (this.remoteAreaId == null) {
            this.remoteAreaId = new ArrayList<>();
        }
        this.remoteAreaId.add(remoteAreaIdItem);
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsRequest withRemoteAreaId(Consumer<List<String>> remoteAreaIdSetter) {
        if (this.remoteAreaId == null) {
            this.remoteAreaId = new ArrayList<>();
        }
        remoteAreaIdSetter.accept(this.remoteAreaId);
        return this;
    }

    /**
     * 根据对端大区ID过滤带宽包资源规格列表
     * @return remoteAreaId
     */
    public List<String> getRemoteAreaId() {
        return remoteAreaId;
    }

    public void setRemoteAreaId(List<String> remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAreaBandwidthPackageSpecificationsRequest that = (ListAreaBandwidthPackageSpecificationsRequest) obj;
        return Objects.equals(this.localAreaId, that.localAreaId)
            && Objects.equals(this.remoteAreaId, that.remoteAreaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localAreaId, remoteAreaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreaBandwidthPackageSpecificationsRequest {\n");
        sb.append("    localAreaId: ").append(toIndentedString(localAreaId)).append("\n");
        sb.append("    remoteAreaId: ").append(toIndentedString(remoteAreaId)).append("\n");
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
