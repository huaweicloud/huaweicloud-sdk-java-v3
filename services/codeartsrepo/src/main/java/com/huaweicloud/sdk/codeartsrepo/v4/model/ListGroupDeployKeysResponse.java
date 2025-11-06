package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ListGroupDeployKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<DeployKeyDto> body = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ListGroupDeployKeysResponse withBody(List<DeployKeyDto> body) {
        this.body = body;
        return this;
    }

    public ListGroupDeployKeysResponse addBodyItem(DeployKeyDto bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListGroupDeployKeysResponse withBody(Consumer<List<DeployKeyDto>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<DeployKeyDto> getBody() {
        return body;
    }

    public void setBody(List<DeployKeyDto> body) {
        this.body = body;
    }

    public ListGroupDeployKeysResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupDeployKeysResponse that = (ListGroupDeployKeysResponse) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupDeployKeysResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
