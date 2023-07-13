package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateReferResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer")

    private RefererRsp referer;

    public UpdateReferResponse withReferer(RefererRsp referer) {
        this.referer = referer;
        return this;
    }

    public UpdateReferResponse withReferer(Consumer<RefererRsp> refererSetter) {
        if (this.referer == null) {
            this.referer = new RefererRsp();
            refererSetter.accept(this.referer);
        }

        return this;
    }

    /**
     * Get referer
     * @return referer
     */
    public RefererRsp getReferer() {
        return referer;
    }

    public void setReferer(RefererRsp referer) {
        this.referer = referer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateReferResponse that = (UpdateReferResponse) obj;
        return Objects.equals(this.referer, that.referer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReferResponse {\n");
        sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
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
