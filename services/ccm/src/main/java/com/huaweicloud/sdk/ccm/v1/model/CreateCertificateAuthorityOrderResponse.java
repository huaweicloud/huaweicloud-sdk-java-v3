package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCertificateAuthorityOrderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_ids")

    private List<String> caIds = null;

    public CreateCertificateAuthorityOrderResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateCertificateAuthorityOrderResponse withCaIds(List<String> caIds) {
        this.caIds = caIds;
        return this;
    }

    public CreateCertificateAuthorityOrderResponse addCaIdsItem(String caIdsItem) {
        if (this.caIds == null) {
            this.caIds = new ArrayList<>();
        }
        this.caIds.add(caIdsItem);
        return this;
    }

    public CreateCertificateAuthorityOrderResponse withCaIds(Consumer<List<String>> caIdsSetter) {
        if (this.caIds == null) {
            this.caIds = new ArrayList<>();
        }
        caIdsSetter.accept(this.caIds);
        return this;
    }

    /**
     * 当前购买的CA证书ID列表。
     * @return caIds
     */
    public List<String> getCaIds() {
        return caIds;
    }

    public void setCaIds(List<String> caIds) {
        this.caIds = caIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCertificateAuthorityOrderResponse that = (CreateCertificateAuthorityOrderResponse) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.caIds, that.caIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, caIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateAuthorityOrderResponse {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    caIds: ").append(toIndentedString(caIds)).append("\n");
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
