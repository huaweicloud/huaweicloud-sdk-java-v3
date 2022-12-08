package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchCreatePublicipsV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BatchBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private BatchPublicIp publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_number")

    private Integer publicipNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public BatchCreatePublicipsV2RequestBody withBandwidth(BatchBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public BatchCreatePublicipsV2RequestBody withBandwidth(Consumer<BatchBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BatchBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BatchBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BatchBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public BatchCreatePublicipsV2RequestBody withPublicip(BatchPublicIp publicip) {
        this.publicip = publicip;
        return this;
    }

    public BatchCreatePublicipsV2RequestBody withPublicip(Consumer<BatchPublicIp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new BatchPublicIp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public BatchPublicIp getPublicip() {
        return publicip;
    }

    public void setPublicip(BatchPublicIp publicip) {
        this.publicip = publicip;
    }

    public BatchCreatePublicipsV2RequestBody withPublicipNumber(Integer publicipNumber) {
        this.publicipNumber = publicipNumber;
        return this;
    }

    /**
     * 批量创建EIP的个数
     * @return publicipNumber
     */
    public Integer getPublicipNumber() {
        return publicipNumber;
    }

    public void setPublicipNumber(Integer publicipNumber) {
        this.publicipNumber = publicipNumber;
    }

    public BatchCreatePublicipsV2RequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreatePublicipsV2RequestBody batchCreatePublicipsV2RequestBody = (BatchCreatePublicipsV2RequestBody) o;
        return Objects.equals(this.bandwidth, batchCreatePublicipsV2RequestBody.bandwidth)
            && Objects.equals(this.publicip, batchCreatePublicipsV2RequestBody.publicip)
            && Objects.equals(this.publicipNumber, batchCreatePublicipsV2RequestBody.publicipNumber)
            && Objects.equals(this.enterpriseProjectId, batchCreatePublicipsV2RequestBody.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, publicip, publicipNumber, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreatePublicipsV2RequestBody {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    publicipNumber: ").append(toIndentedString(publicipNumber)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
