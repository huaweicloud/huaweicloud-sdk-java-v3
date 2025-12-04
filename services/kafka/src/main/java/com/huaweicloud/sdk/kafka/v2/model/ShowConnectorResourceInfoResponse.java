package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowConnectorResourceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "soldOut")

    private Boolean soldOut;

    public ShowConnectorResourceInfoResponse withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * **参数解释**： 是否售罄。 **取值范围**： - true：售罄。 - false：未售罄。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectorResourceInfoResponse that = (ShowConnectorResourceInfoResponse) obj;
        return Objects.equals(this.soldOut, that.soldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectorResourceInfoResponse {\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
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
