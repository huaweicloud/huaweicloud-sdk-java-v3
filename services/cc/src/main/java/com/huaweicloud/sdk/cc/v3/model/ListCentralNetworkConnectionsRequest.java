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
public class ListCentralNetworkConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDir sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<CentralNetworkConnectionStateEnum> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private List<String> globalConnectionBandwidthId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private ConnectionTypeEnum connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cross_region")

    private Boolean isCrossRegion;

    public ListCentralNetworkConnectionsRequest withLimit(Integer limit) {
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

    public ListCentralNetworkConnectionsRequest withMarker(String marker) {
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

    public ListCentralNetworkConnectionsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListCentralNetworkConnectionsRequest withSortDir(SortDir sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 指定排序是升序还是降序（asc为升序，desc为降序）。
     * @return sortDir
     */
    public SortDir getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDir sortDir) {
        this.sortDir = sortDir;
    }

    public ListCentralNetworkConnectionsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCentralNetworkConnectionsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCentralNetworkConnectionsRequest withId(Consumer<List<String>> idSetter) {
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

    public ListCentralNetworkConnectionsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListCentralNetworkConnectionsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListCentralNetworkConnectionsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名称查询，可查询多个名称。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListCentralNetworkConnectionsRequest withState(List<CentralNetworkConnectionStateEnum> state) {
        this.state = state;
        return this;
    }

    public ListCentralNetworkConnectionsRequest addStateItem(CentralNetworkConnectionStateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListCentralNetworkConnectionsRequest withState(
        Consumer<List<CentralNetworkConnectionStateEnum>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * 根据状态查询，可查询多个状态。
     * @return state
     */
    public List<CentralNetworkConnectionStateEnum> getState() {
        return state;
    }

    public void setState(List<CentralNetworkConnectionStateEnum> state) {
        this.state = state;
    }

    public ListCentralNetworkConnectionsRequest withCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
        return this;
    }

    /**
     * 中心网络的ID。
     * @return centralNetworkId
     */
    public String getCentralNetworkId() {
        return centralNetworkId;
    }

    public void setCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
    }

    public ListCentralNetworkConnectionsRequest withGlobalConnectionBandwidthId(
        List<String> globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    public ListCentralNetworkConnectionsRequest addGlobalConnectionBandwidthIdItem(
        String globalConnectionBandwidthIdItem) {
        if (this.globalConnectionBandwidthId == null) {
            this.globalConnectionBandwidthId = new ArrayList<>();
        }
        this.globalConnectionBandwidthId.add(globalConnectionBandwidthIdItem);
        return this;
    }

    public ListCentralNetworkConnectionsRequest withGlobalConnectionBandwidthId(
        Consumer<List<String>> globalConnectionBandwidthIdSetter) {
        if (this.globalConnectionBandwidthId == null) {
            this.globalConnectionBandwidthId = new ArrayList<>();
        }
        globalConnectionBandwidthIdSetter.accept(this.globalConnectionBandwidthId);
        return this;
    }

    /**
     * 根据带宽包ID过滤。
     * @return globalConnectionBandwidthId
     */
    public List<String> getGlobalConnectionBandwidthId() {
        return globalConnectionBandwidthId;
    }

    public void setGlobalConnectionBandwidthId(List<String> globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
    }

    public ListCentralNetworkConnectionsRequest withBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * 根据带宽类型查询。带宽类型包括： - BandwidthPackage (按带宽计费，需要绑定全域互联带宽，并指定分配带宽大小) - TestBandwidth (不收费的测试带宽，仅保留最小带宽，用于测试跨地域连通性）
     * @return bandwidthType
     */
    public BandwidthTypeEnum getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public ListCentralNetworkConnectionsRequest withConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 连接类型，支持。
     * @return connectionType
     */
    public ConnectionTypeEnum getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
    }

    public ListCentralNetworkConnectionsRequest withIsCrossRegion(Boolean isCrossRegion) {
        this.isCrossRegion = isCrossRegion;
        return this;
    }

    /**
     * 是否跨地域。
     * @return isCrossRegion
     */
    public Boolean getIsCrossRegion() {
        return isCrossRegion;
    }

    public void setIsCrossRegion(Boolean isCrossRegion) {
        this.isCrossRegion = isCrossRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkConnectionsRequest that = (ListCentralNetworkConnectionsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.isCrossRegion, that.isCrossRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            sortKey,
            sortDir,
            id,
            name,
            state,
            centralNetworkId,
            globalConnectionBandwidthId,
            bandwidthType,
            connectionType,
            isCrossRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkConnectionsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    isCrossRegion: ").append(toIndentedString(isCrossRegion)).append("\n");
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
