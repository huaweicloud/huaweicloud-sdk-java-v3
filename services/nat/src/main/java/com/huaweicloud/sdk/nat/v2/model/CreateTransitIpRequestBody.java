package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建中转IP的请求体。
 */
public class CreateTransitIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip")

    private CreatTransitIpOption transitIp;

    public CreateTransitIpRequestBody withTransitIp(CreatTransitIpOption transitIp) {
        this.transitIp = transitIp;
        return this;
    }

    public CreateTransitIpRequestBody withTransitIp(Consumer<CreatTransitIpOption> transitIpSetter) {
        if (this.transitIp == null) {
            this.transitIp = new CreatTransitIpOption();
            transitIpSetter.accept(this.transitIp);
        }

        return this;
    }

    /**
     * Get transitIp
     * @return transitIp
     */
    public CreatTransitIpOption getTransitIp() {
        return transitIp;
    }

    public void setTransitIp(CreatTransitIpOption transitIp) {
        this.transitIp = transitIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransitIpRequestBody createTransitIpRequestBody = (CreateTransitIpRequestBody) o;
        return Objects.equals(this.transitIp, createTransitIpRequestBody.transitIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransitIpRequestBody {\n");
        sb.append("    transitIp: ").append(toIndentedString(transitIp)).append("\n");
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
