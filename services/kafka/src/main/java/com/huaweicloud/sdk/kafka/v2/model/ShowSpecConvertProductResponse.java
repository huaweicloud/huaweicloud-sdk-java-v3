package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSpecConvertProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public ShowSpecConvertProductResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 新产品ID。 **取值范围**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSpecConvertProductResponse that = (ShowSpecConvertProductResponse) obj;
        return Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpecConvertProductResponse {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
