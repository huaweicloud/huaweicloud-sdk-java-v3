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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private List<String> localAreaId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private List<String> remoteAreaId = null;

    public ListAreaBandwidthPackageSpecificationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAreaBandwidthPackageSpecificationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * （索引位置，偏移量）， 从offset指定的下一条数据开始查询。 查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数（action为count时无此参数） 从第一条数据偏移offset条数据后开始查询，如果action为filter默认为0（偏移0条数据，表示从第一条数据开始查询）,必须为数字，不能为负数。
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

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
     * 根据本端大区ID过滤带宽包资源规格列表。
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
     * 根据对端大区ID过滤带宽包资源规格列表。
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
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.localAreaId, that.localAreaId)
            && Objects.equals(this.remoteAreaId, that.remoteAreaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, localAreaId, remoteAreaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreaBandwidthPackageSpecificationsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
