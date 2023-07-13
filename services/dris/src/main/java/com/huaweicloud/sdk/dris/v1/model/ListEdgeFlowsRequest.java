package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEdgeFlowsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_id")

    private String edgeId;

    public ListEdgeFlowsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * \"**参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和横杠（-）的组合，长度36。\"
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListEdgeFlowsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数说明**：分页查询时的页码。
     * minimum: 0
     * maximum: 199
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEdgeFlowsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：分页查询时每页显示的记录数。
     * minimum: 1
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEdgeFlowsRequest withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * **参数说明**：查询此时间后达到平台的消息。  格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'。  例如 2020-09-01T01:37:01.000Z。  **取值范围**：携带edge_id参数查询时，from_date和to_date的时间范围不能超过24小时；未携带edge_id参数查询时，from_date和to_date的时间范围不能超过1小时。 
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ListEdgeFlowsRequest withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * **参数说明**：查询此时间前达到平台的消息。  格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'。  例如 2020-09-02T01:37:01.000Z。  **取值范围**：携带edge_id参数查询时，from_date和to_date的时间范围不能超过24小时；未携带edge_id参数查询时，from_date和to_date的时间范围不能超过1小时。 
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ListEdgeFlowsRequest withEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge。  **取值范围**：数字，a至f的小写字母，横杠（-），长度为36的组合。 
     * @return edgeId
     */
    public String getEdgeId() {
        return edgeId;
    }

    public void setEdgeId(String edgeId) {
        this.edgeId = edgeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeFlowsRequest that = (ListEdgeFlowsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.fromDate, that.fromDate)
            && Objects.equals(this.toDate, that.toDate) && Objects.equals(this.edgeId, that.edgeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, fromDate, toDate, edgeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeFlowsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
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
