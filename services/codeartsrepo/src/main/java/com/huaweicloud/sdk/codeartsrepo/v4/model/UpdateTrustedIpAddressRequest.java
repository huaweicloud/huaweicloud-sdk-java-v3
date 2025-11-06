package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTrustedIpAddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private Integer ipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddTrustedIpAddressRequestBody body;

    public UpdateTrustedIpAddressRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库id，代码仓首页，Repository ID后的数字Id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateTrustedIpAddressRequest withIpId(Integer ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * **参数解释：** ip白名单id。
     * minimum: 1
     * maximum: 2147483647
     * @return ipId
     */
    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    public UpdateTrustedIpAddressRequest withBody(AddTrustedIpAddressRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrustedIpAddressRequest withBody(Consumer<AddTrustedIpAddressRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddTrustedIpAddressRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddTrustedIpAddressRequestBody getBody() {
        return body;
    }

    public void setBody(AddTrustedIpAddressRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrustedIpAddressRequest that = (UpdateTrustedIpAddressRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ipId, that.ipId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrustedIpAddressRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
