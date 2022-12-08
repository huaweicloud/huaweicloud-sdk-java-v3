package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowForwardingConfigsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_type")

    private String forwardingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowForwardingConfigsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和连接符（-）的组合，长度36。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowForwardingConfigsRequest withForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
        return this;
    }

    /**
     * **参数说明**：转发配置的类型。  **取值范围**：当前仅支持“kafka，mrskafka”。
     * @return forwardingType
     */
    public String getForwardingType() {
        return forwardingType;
    }

    public void setForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
    }

    public ShowForwardingConfigsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数说明**：查询配置列表的偏移量。
     * minimum: 0
     * maximum: 5000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowForwardingConfigsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：查询时每页显示的记录数。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowForwardingConfigsRequest showForwardingConfigsRequest = (ShowForwardingConfigsRequest) o;
        return Objects.equals(this.instanceId, showForwardingConfigsRequest.instanceId)
            && Objects.equals(this.forwardingType, showForwardingConfigsRequest.forwardingType)
            && Objects.equals(this.offset, showForwardingConfigsRequest.offset)
            && Objects.equals(this.limit, showForwardingConfigsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, forwardingType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowForwardingConfigsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    forwardingType: ").append(toIndentedString(forwardingType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
