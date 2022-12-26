package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDomainIp6SwitchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DomainIpv6SwitchReq body;

    public UpdateDomainIp6SwitchRequest withBody(DomainIpv6SwitchReq body) {
        this.body = body;
        return this;
    }

    public UpdateDomainIp6SwitchRequest withBody(Consumer<DomainIpv6SwitchReq> bodySetter) {
        if (this.body == null) {
            this.body = new DomainIpv6SwitchReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DomainIpv6SwitchReq getBody() {
        return body;
    }

    public void setBody(DomainIpv6SwitchReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainIp6SwitchRequest updateDomainIp6SwitchRequest = (UpdateDomainIp6SwitchRequest) o;
        return Objects.equals(this.body, updateDomainIp6SwitchRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainIp6SwitchRequest {\n");
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
