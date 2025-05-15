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
public class ListInterRegionBandwidthsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private List<String> cloudConnectionId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_id")

    private List<String> bandwidthPackageId = null;

    public ListInterRegionBandwidthsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInterRegionBandwidthsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListInterRegionBandwidthsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListInterRegionBandwidthsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListInterRegionBandwidthsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID查询，可查询多个ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListInterRegionBandwidthsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListInterRegionBandwidthsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListInterRegionBandwidthsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤列表。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInterRegionBandwidthsRequest withCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    public ListInterRegionBandwidthsRequest addCloudConnectionIdItem(String cloudConnectionIdItem) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        this.cloudConnectionId.add(cloudConnectionIdItem);
        return this;
    }

    public ListInterRegionBandwidthsRequest withCloudConnectionId(Consumer<List<String>> cloudConnectionIdSetter) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        cloudConnectionIdSetter.accept(this.cloudConnectionId);
        return this;
    }

    /**
     * 根据云连接的ID过滤列表。
     * @return cloudConnectionId
     */
    public List<String> getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public ListInterRegionBandwidthsRequest withBandwidthPackageId(List<String> bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    public ListInterRegionBandwidthsRequest addBandwidthPackageIdItem(String bandwidthPackageIdItem) {
        if (this.bandwidthPackageId == null) {
            this.bandwidthPackageId = new ArrayList<>();
        }
        this.bandwidthPackageId.add(bandwidthPackageIdItem);
        return this;
    }

    public ListInterRegionBandwidthsRequest withBandwidthPackageId(Consumer<List<String>> bandwidthPackageIdSetter) {
        if (this.bandwidthPackageId == null) {
            this.bandwidthPackageId = new ArrayList<>();
        }
        bandwidthPackageIdSetter.accept(this.bandwidthPackageId);
        return this;
    }

    /**
     * 根据带宽包列表过滤域间带宽实例列表。
     * @return bandwidthPackageId
     */
    public List<String> getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(List<String> bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInterRegionBandwidthsRequest that = (ListInterRegionBandwidthsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId)
            && Objects.equals(this.bandwidthPackageId, that.bandwidthPackageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, enterpriseProjectId, cloudConnectionId, bandwidthPackageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInterRegionBandwidthsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
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
