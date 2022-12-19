package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class BatchShowTrafficControllersRequest {

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
    @JsonProperty(value = "traffic_controller_id")

    private String trafficControllerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public BatchShowTrafficControllersRequest withInstanceId(String instanceId) {
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

    public BatchShowTrafficControllersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数说明**：分页查询时的页码， offset大于等于0，默认取值为0
     * minimum: 0
     * maximum: 20
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public BatchShowTrafficControllersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：分页查询时每页显示的记录数，默认值为10，取值范围为0-20的整数。
     * minimum: 1
     * maximum: 20
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BatchShowTrafficControllersRequest withTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
        return this;
    }

    /**
     * **参数说明**：信号机设备ID，全局唯一。  **取值范围**：长度不超过128，只允许字母、数字、以及_-等字符的组合。 
     * @return trafficControllerId
     */
    public String getTrafficControllerId() {
        return trafficControllerId;
    }

    public void setTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
    }

    public BatchShowTrafficControllersRequest withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：序列号。  **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。 
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public BatchShowTrafficControllersRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：设备状态。  **取值范围**： - ONLINE：在线 - OFFLINE：离线 - INITIAL：初始化 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowTrafficControllersRequest batchShowTrafficControllersRequest = (BatchShowTrafficControllersRequest) o;
        return Objects.equals(this.instanceId, batchShowTrafficControllersRequest.instanceId)
            && Objects.equals(this.offset, batchShowTrafficControllersRequest.offset)
            && Objects.equals(this.limit, batchShowTrafficControllersRequest.limit)
            && Objects.equals(this.trafficControllerId, batchShowTrafficControllersRequest.trafficControllerId)
            && Objects.equals(this.esn, batchShowTrafficControllersRequest.esn)
            && Objects.equals(this.status, batchShowTrafficControllersRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, trafficControllerId, esn, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowTrafficControllersRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    trafficControllerId: ").append(toIndentedString(trafficControllerId)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
