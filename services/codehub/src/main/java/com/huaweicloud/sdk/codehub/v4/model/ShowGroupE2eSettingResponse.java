package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGroupE2eSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e2e_policies")

    private E2ePolicyDto e2ePolicies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req")

    private ReqSettingDto req;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private LinkSettingDto link;

    public ShowGroupE2eSettingResponse withE2ePolicies(E2ePolicyDto e2ePolicies) {
        this.e2ePolicies = e2ePolicies;
        return this;
    }

    public ShowGroupE2eSettingResponse withE2ePolicies(Consumer<E2ePolicyDto> e2ePoliciesSetter) {
        if (this.e2ePolicies == null) {
            this.e2ePolicies = new E2ePolicyDto();
            e2ePoliciesSetter.accept(this.e2ePolicies);
        }

        return this;
    }

    /**
     * Get e2ePolicies
     * @return e2ePolicies
     */
    public E2ePolicyDto getE2ePolicies() {
        return e2ePolicies;
    }

    public void setE2ePolicies(E2ePolicyDto e2ePolicies) {
        this.e2ePolicies = e2ePolicies;
    }

    public ShowGroupE2eSettingResponse withReq(ReqSettingDto req) {
        this.req = req;
        return this;
    }

    public ShowGroupE2eSettingResponse withReq(Consumer<ReqSettingDto> reqSetter) {
        if (this.req == null) {
            this.req = new ReqSettingDto();
            reqSetter.accept(this.req);
        }

        return this;
    }

    /**
     * Get req
     * @return req
     */
    public ReqSettingDto getReq() {
        return req;
    }

    public void setReq(ReqSettingDto req) {
        this.req = req;
    }

    public ShowGroupE2eSettingResponse withLink(LinkSettingDto link) {
        this.link = link;
        return this;
    }

    public ShowGroupE2eSettingResponse withLink(Consumer<LinkSettingDto> linkSetter) {
        if (this.link == null) {
            this.link = new LinkSettingDto();
            linkSetter.accept(this.link);
        }

        return this;
    }

    /**
     * Get link
     * @return link
     */
    public LinkSettingDto getLink() {
        return link;
    }

    public void setLink(LinkSettingDto link) {
        this.link = link;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupE2eSettingResponse that = (ShowGroupE2eSettingResponse) obj;
        return Objects.equals(this.e2ePolicies, that.e2ePolicies) && Objects.equals(this.req, that.req)
            && Objects.equals(this.link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(e2ePolicies, req, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupE2eSettingResponse {\n");
        sb.append("    e2ePolicies: ").append(toIndentedString(e2ePolicies)).append("\n");
        sb.append("    req: ").append(toIndentedString(req)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
