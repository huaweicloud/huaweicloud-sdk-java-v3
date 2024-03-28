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
public class ListCentralNetworkErRouteTableAttachmentsRequest {

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
    @JsonProperty(value = "attachment_instance_id")

    private List<String> attachmentInstanceId = null;

    public ListCentralNetworkErRouteTableAttachmentsRequest withLimit(Integer limit) {
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

    public ListCentralNetworkErRouteTableAttachmentsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向翻页。 翻页过程中，查询条件不能修改，包括过滤条件，排序条件，limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withSortKey(String sortKey) {
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

    public ListCentralNetworkErRouteTableAttachmentsRequest withSortDir(SortDir sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 指定排序是升序还是降序(asc为升序，desc为降序)。
     * @return sortDir
     */
    public SortDir getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDir sortDir) {
        this.sortDir = sortDir;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据id查询，可查询多个id。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withName(Consumer<List<String>> nameSetter) {
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

    public ListCentralNetworkErRouteTableAttachmentsRequest withState(List<CentralNetworkConnectionStateEnum> state) {
        this.state = state;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest addStateItem(CentralNetworkConnectionStateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withState(
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

    public ListCentralNetworkErRouteTableAttachmentsRequest withCentralNetworkId(String centralNetworkId) {
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

    public ListCentralNetworkErRouteTableAttachmentsRequest withAttachmentInstanceId(
        List<String> attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest addAttachmentInstanceIdItem(
        String attachmentInstanceIdItem) {
        if (this.attachmentInstanceId == null) {
            this.attachmentInstanceId = new ArrayList<>();
        }
        this.attachmentInstanceId.add(attachmentInstanceIdItem);
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsRequest withAttachmentInstanceId(
        Consumer<List<String>> attachmentInstanceIdSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkErRouteTableAttachmentsRequest that = (ListCentralNetworkErRouteTableAttachmentsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.attachmentInstanceId, that.attachmentInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, sortKey, sortDir, id, name, state, centralNetworkId, attachmentInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkErRouteTableAttachmentsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    attachmentInstanceId: ").append(toIndentedString(attachmentInstanceId)).append("\n");
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
