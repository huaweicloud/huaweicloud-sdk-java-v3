package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建包周期的弹性公网IP
 */
public class CreatePrePaidPublicipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    @JacksonXmlProperty(localName = "publicip")

    private CreatePrePaidPublicipOption publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    @JacksonXmlProperty(localName = "bandwidth")

    private CreatePublicipBandwidthOption bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    @JacksonXmlProperty(localName = "extendParam")

    private CreatePrePaidPublicipExtendParamOption extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreatePrePaidPublicipRequestBody withPublicip(CreatePrePaidPublicipOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withPublicip(Consumer<CreatePrePaidPublicipOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new CreatePrePaidPublicipOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public CreatePrePaidPublicipOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreatePrePaidPublicipOption publicip) {
        this.publicip = publicip;
    }

    public CreatePrePaidPublicipRequestBody withBandwidth(CreatePublicipBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withBandwidth(Consumer<CreatePublicipBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CreatePublicipBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CreatePublicipBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreatePublicipBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreatePrePaidPublicipRequestBody withExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withExtendParam(
        Consumer<CreatePrePaidPublicipExtendParamOption> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new CreatePrePaidPublicipExtendParamOption();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public CreatePrePaidPublicipExtendParamOption getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
    }

    public CreatePrePaidPublicipRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。  创建弹性公网IP时，给弹性公网IP绑定企业项目ID。  不指定该参数时，默认值是 0
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
        CreatePrePaidPublicipRequestBody createPrePaidPublicipRequestBody = (CreatePrePaidPublicipRequestBody) o;
        return Objects.equals(this.publicip, createPrePaidPublicipRequestBody.publicip)
            && Objects.equals(this.bandwidth, createPrePaidPublicipRequestBody.bandwidth)
            && Objects.equals(this.extendParam, createPrePaidPublicipRequestBody.extendParam)
            && Objects.equals(this.enterpriseProjectId, createPrePaidPublicipRequestBody.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip, bandwidth, extendParam, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipRequestBody {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
