package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建云办公带宽变更订单请求体。
 */
public class CreateSubnetBandwidthChangeOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_name")

    private String bandwidthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private String bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private OrderExtendParam extendParam;

    public CreateSubnetBandwidthChangeOrderRequestBody withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /**
     * 云办公带宽名称。
     * @return bandwidthName
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public CreateSubnetBandwidthChangeOrderRequestBody withBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 变更云办公带宽的带宽大小。
     * @return bandwidthSize
     */
    public String getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public CreateSubnetBandwidthChangeOrderRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateSubnetBandwidthChangeOrderRequestBody withExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateSubnetBandwidthChangeOrderRequestBody withExtendParam(Consumer<OrderExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new OrderExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public OrderExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubnetBandwidthChangeOrderRequestBody that = (CreateSubnetBandwidthChangeOrderRequestBody) obj;
        return Objects.equals(this.bandwidthName, that.bandwidthName)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthName, bandwidthSize, enterpriseProjectId, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetBandwidthChangeOrderRequestBody {\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
