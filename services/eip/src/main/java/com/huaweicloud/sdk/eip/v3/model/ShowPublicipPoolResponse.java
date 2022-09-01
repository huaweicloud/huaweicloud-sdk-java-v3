package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPublicipPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool")

    @JacksonXmlProperty(localName = "publicip_pool")

    private PublicipPoolShowResp publicipPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    public ShowPublicipPoolResponse withPublicipPool(PublicipPoolShowResp publicipPool) {
        this.publicipPool = publicipPool;
        return this;
    }

    public ShowPublicipPoolResponse withPublicipPool(Consumer<PublicipPoolShowResp> publicipPoolSetter) {
        if (this.publicipPool == null) {
            this.publicipPool = new PublicipPoolShowResp();
            publicipPoolSetter.accept(this.publicipPool);
        }

        return this;
    }

    /**
     * Get publicipPool
     * @return publicipPool
     */
    public PublicipPoolShowResp getPublicipPool() {
        return publicipPool;
    }

    public void setPublicipPool(PublicipPoolShowResp publicipPool) {
        this.publicipPool = publicipPool;
    }

    public ShowPublicipPoolResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPublicipPoolResponse showPublicipPoolResponse = (ShowPublicipPoolResponse) o;
        return Objects.equals(this.publicipPool, showPublicipPoolResponse.publicipPool)
            && Objects.equals(this.requestId, showPublicipPoolResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipPool, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicipPoolResponse {\n");
        sb.append("    publicipPool: ").append(toIndentedString(publicipPool)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
