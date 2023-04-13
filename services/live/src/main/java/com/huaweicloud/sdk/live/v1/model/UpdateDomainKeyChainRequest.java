package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDomainKeyChainRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private KeyChainInfo body;

    public UpdateDomainKeyChainRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播域名，包括推流域名和播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UpdateDomainKeyChainRequest withBody(KeyChainInfo body) {
        this.body = body;
        return this;
    }

    public UpdateDomainKeyChainRequest withBody(Consumer<KeyChainInfo> bodySetter) {
        if (this.body == null) {
            this.body = new KeyChainInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeyChainInfo getBody() {
        return body;
    }

    public void setBody(KeyChainInfo body) {
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
        UpdateDomainKeyChainRequest updateDomainKeyChainRequest = (UpdateDomainKeyChainRequest) o;
        return Objects.equals(this.domain, updateDomainKeyChainRequest.domain)
            && Objects.equals(this.body, updateDomainKeyChainRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainKeyChainRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
