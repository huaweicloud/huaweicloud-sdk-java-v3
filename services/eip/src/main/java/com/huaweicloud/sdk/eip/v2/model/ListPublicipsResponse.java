package com.huaweicloud.sdk.eip.v2.model;

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
public class ListPublicipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicipShowResp> publicips = null;

    public ListPublicipsResponse withPublicips(List<PublicipShowResp> publicips) {
        this.publicips = publicips;
        return this;
    }

    public ListPublicipsResponse addPublicipsItem(PublicipShowResp publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public ListPublicipsResponse withPublicips(Consumer<List<PublicipShowResp>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 弹性公网IP对象
     * @return publicips
     */
    public List<PublicipShowResp> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicipShowResp> publicips) {
        this.publicips = publicips;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicipsResponse listPublicipsResponse = (ListPublicipsResponse) o;
        return Objects.equals(this.publicips, listPublicipsResponse.publicips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipsResponse {\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
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
