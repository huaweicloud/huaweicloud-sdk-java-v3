package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchPublicipResp
 */
public class BatchPublicipResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCode")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicipResp publicip;

    public BatchPublicipResp withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 响应码
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public BatchPublicipResp withPublicip(PublicipResp publicip) {
        this.publicip = publicip;
        return this;
    }

    public BatchPublicipResp withPublicip(Consumer<PublicipResp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicipResp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicipResp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipResp publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchPublicipResp that = (BatchPublicipResp) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.publicip, that.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPublicipResp {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
