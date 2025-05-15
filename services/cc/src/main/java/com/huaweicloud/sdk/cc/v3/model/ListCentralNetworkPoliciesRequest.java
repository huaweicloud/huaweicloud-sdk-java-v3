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
public class ListCentralNetworkPoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

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
    @JsonProperty(value = "state")

    private List<CentralNetworkPolicyStateEnum> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private List<Version> version = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Boolean isApplied;

    public ListCentralNetworkPoliciesRequest withCentralNetworkId(String centralNetworkId) {
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

    public ListCentralNetworkPoliciesRequest withLimit(Integer limit) {
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

    public ListCentralNetworkPoliciesRequest withMarker(String marker) {
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

    public ListCentralNetworkPoliciesRequest withSortKey(String sortKey) {
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

    public ListCentralNetworkPoliciesRequest withSortDir(SortDir sortDir) {
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

    public ListCentralNetworkPoliciesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCentralNetworkPoliciesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCentralNetworkPoliciesRequest withId(Consumer<List<String>> idSetter) {
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

    public ListCentralNetworkPoliciesRequest withState(List<CentralNetworkPolicyStateEnum> state) {
        this.state = state;
        return this;
    }

    public ListCentralNetworkPoliciesRequest addStateItem(CentralNetworkPolicyStateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListCentralNetworkPoliciesRequest withState(Consumer<List<CentralNetworkPolicyStateEnum>> stateSetter) {
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
    public List<CentralNetworkPolicyStateEnum> getState() {
        return state;
    }

    public void setState(List<CentralNetworkPolicyStateEnum> state) {
        this.state = state;
    }

    public ListCentralNetworkPoliciesRequest withVersion(List<Version> version) {
        this.version = version;
        return this;
    }

    public ListCentralNetworkPoliciesRequest addVersionItem(Version versionItem) {
        if (this.version == null) {
            this.version = new ArrayList<>();
        }
        this.version.add(versionItem);
        return this;
    }

    public ListCentralNetworkPoliciesRequest withVersion(Consumer<List<Version>> versionSetter) {
        if (this.version == null) {
            this.version = new ArrayList<>();
        }
        versionSetter.accept(this.version);
        return this;
    }

    /**
     * 根据版本查询，可查询多个名字。
     * @return version
     */
    public List<Version> getVersion() {
        return version;
    }

    public void setVersion(List<Version> version) {
        this.version = version;
    }

    public ListCentralNetworkPoliciesRequest withIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否被应用。
     * @return isApplied
     */
    public Boolean getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkPoliciesRequest that = (ListCentralNetworkPoliciesRequest) obj;
        return Objects.equals(this.centralNetworkId, that.centralNetworkId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.state, that.state) && Objects.equals(this.version, that.version)
            && Objects.equals(this.isApplied, that.isApplied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkId, limit, marker, sortKey, sortDir, id, state, version, isApplied);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkPoliciesRequest {\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
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
