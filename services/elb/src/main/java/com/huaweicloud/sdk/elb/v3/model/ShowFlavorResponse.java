package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlavorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    public ShowFlavorResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowFlavorResponse withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public ShowFlavorResponse withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorResponse that = (ShowFlavorResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, flavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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
