package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVpcResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    @JacksonXmlProperty(localName = "vpc")

    private Vpc vpc;

    public ShowVpcResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowVpcResponse withVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }

    public ShowVpcResponse withVpc(Consumer<Vpc> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new Vpc();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public Vpc getVpc() {
        return vpc;
    }

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcResponse showVpcResponse = (ShowVpcResponse) o;
        return Objects.equals(this.requestId, showVpcResponse.requestId)
            && Objects.equals(this.vpc, showVpcResponse.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
