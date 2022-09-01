package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePrePaidPublicipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    @JacksonXmlProperty(localName = "publicip")

    private PublicipCreateResp publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    @JacksonXmlProperty(localName = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    @JacksonXmlProperty(localName = "publicip_id")

    private String publicipId;

    public CreatePrePaidPublicipResponse withPublicip(PublicipCreateResp publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePrePaidPublicipResponse withPublicip(Consumer<PublicipCreateResp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicipCreateResp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicipCreateResp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipCreateResp publicip) {
        this.publicip = publicip;
    }

    public CreatePrePaidPublicipResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号（预付费场景返回该字段）
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreatePrePaidPublicipResponse withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 弹性公网IP的ID（预付费场景返回该字段）
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrePaidPublicipResponse createPrePaidPublicipResponse = (CreatePrePaidPublicipResponse) o;
        return Objects.equals(this.publicip, createPrePaidPublicipResponse.publicip)
            && Objects.equals(this.orderId, createPrePaidPublicipResponse.orderId)
            && Objects.equals(this.publicipId, createPrePaidPublicipResponse.publicipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip, orderId, publicipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipResponse {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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
