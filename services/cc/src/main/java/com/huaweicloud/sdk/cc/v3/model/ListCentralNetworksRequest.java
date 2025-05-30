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
public class ListCentralNetworksRequest {

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

    private List<CentralNetworkStateEnum> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_id")

    private List<String> enterpriseRouterId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_id")

    private List<String> attachmentInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private List<String> globalConnectionBandwidthId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private List<String> connectionId = null;

    public ListCentralNetworksRequest withLimit(Integer limit) {
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

    public ListCentralNetworksRequest withMarker(String marker) {
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

    public ListCentralNetworksRequest withSortKey(String sortKey) {
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

    public ListCentralNetworksRequest withSortDir(SortDir sortDir) {
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

    public ListCentralNetworksRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCentralNetworksRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCentralNetworksRequest withId(Consumer<List<String>> idSetter) {
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

    public ListCentralNetworksRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListCentralNetworksRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListCentralNetworksRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名字查询，可查询多个名字。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListCentralNetworksRequest withState(List<CentralNetworkStateEnum> state) {
        this.state = state;
        return this;
    }

    public ListCentralNetworksRequest addStateItem(CentralNetworkStateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListCentralNetworksRequest withState(Consumer<List<CentralNetworkStateEnum>> stateSetter) {
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
    public List<CentralNetworkStateEnum> getState() {
        return state;
    }

    public void setState(List<CentralNetworkStateEnum> state) {
        this.state = state;
    }

    public ListCentralNetworksRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListCentralNetworksRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListCentralNetworksRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    public ListCentralNetworksRequest withEnterpriseRouterId(List<String> enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
        return this;
    }

    public ListCentralNetworksRequest addEnterpriseRouterIdItem(String enterpriseRouterIdItem) {
        if (this.enterpriseRouterId == null) {
            this.enterpriseRouterId = new ArrayList<>();
        }
        this.enterpriseRouterId.add(enterpriseRouterIdItem);
        return this;
    }

    public ListCentralNetworksRequest withEnterpriseRouterId(Consumer<List<String>> enterpriseRouterIdSetter) {
        if (this.enterpriseRouterId == null) {
            this.enterpriseRouterId = new ArrayList<>();
        }
        enterpriseRouterIdSetter.accept(this.enterpriseRouterId);
        return this;
    }

    /**
     * 根据ER实例ID过滤列表。
     * @return enterpriseRouterId
     */
    public List<String> getEnterpriseRouterId() {
        return enterpriseRouterId;
    }

    public void setEnterpriseRouterId(List<String> enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
    }

    public ListCentralNetworksRequest withAttachmentInstanceId(List<String> attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
        return this;
    }

    public ListCentralNetworksRequest addAttachmentInstanceIdItem(String attachmentInstanceIdItem) {
        if (this.attachmentInstanceId == null) {
            this.attachmentInstanceId = new ArrayList<>();
        }
        this.attachmentInstanceId.add(attachmentInstanceIdItem);
        return this;
    }

    public ListCentralNetworksRequest withAttachmentInstanceId(Consumer<List<String>> attachmentInstanceIdSetter) {
        if (this.attachmentInstanceId == null) {
            this.attachmentInstanceId = new ArrayList<>();
        }
        attachmentInstanceIdSetter.accept(this.attachmentInstanceId);
        return this;
    }

    /**
     * Attachment实例的ID。
     * @return attachmentInstanceId
     */
    public List<String> getAttachmentInstanceId() {
        return attachmentInstanceId;
    }

    public void setAttachmentInstanceId(List<String> attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
    }

    public ListCentralNetworksRequest withGlobalConnectionBandwidthId(List<String> globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    public ListCentralNetworksRequest addGlobalConnectionBandwidthIdItem(String globalConnectionBandwidthIdItem) {
        if (this.globalConnectionBandwidthId == null) {
            this.globalConnectionBandwidthId = new ArrayList<>();
        }
        this.globalConnectionBandwidthId.add(globalConnectionBandwidthIdItem);
        return this;
    }

    public ListCentralNetworksRequest withGlobalConnectionBandwidthId(
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

    public ListCentralNetworksRequest withConnectionId(List<String> connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public ListCentralNetworksRequest addConnectionIdItem(String connectionIdItem) {
        if (this.connectionId == null) {
            this.connectionId = new ArrayList<>();
        }
        this.connectionId.add(connectionIdItem);
        return this;
    }

    public ListCentralNetworksRequest withConnectionId(Consumer<List<String>> connectionIdSetter) {
        if (this.connectionId == null) {
            this.connectionId = new ArrayList<>();
        }
        connectionIdSetter.accept(this.connectionId);
        return this;
    }

    /**
     * 连接的ID。
     * @return connectionId
     */
    public List<String> getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(List<String> connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworksRequest that = (ListCentralNetworksRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.attachmentInstanceId, that.attachmentInstanceId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.connectionId, that.connectionId);
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
            enterpriseProjectId,
            enterpriseRouterId,
            attachmentInstanceId,
            globalConnectionBandwidthId,
            connectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworksRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    attachmentInstanceId: ").append(toIndentedString(attachmentInstanceId)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
