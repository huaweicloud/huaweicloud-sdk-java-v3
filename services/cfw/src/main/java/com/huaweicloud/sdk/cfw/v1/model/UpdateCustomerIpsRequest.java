package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCustomerIpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_cfw_id")

    private String ipsCfwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CustomerIpsSaveDto body;

    public UpdateCustomerIpsRequest withIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
        return this;
    }

    /**
     * **参数解释**： cfw侧自定义IPS规则id **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return ipsCfwId
     */
    public String getIpsCfwId() {
        return ipsCfwId;
    }

    public void setIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
    }

    public UpdateCustomerIpsRequest withBody(CustomerIpsSaveDto body) {
        this.body = body;
        return this;
    }

    public UpdateCustomerIpsRequest withBody(Consumer<CustomerIpsSaveDto> bodySetter) {
        if (this.body == null) {
            this.body = new CustomerIpsSaveDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CustomerIpsSaveDto getBody() {
        return body;
    }

    public void setBody(CustomerIpsSaveDto body) {
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
        UpdateCustomerIpsRequest that = (UpdateCustomerIpsRequest) obj;
        return Objects.equals(this.ipsCfwId, that.ipsCfwId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipsCfwId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomerIpsRequest {\n");
        sb.append("    ipsCfwId: ").append(toIndentedString(ipsCfwId)).append("\n");
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
