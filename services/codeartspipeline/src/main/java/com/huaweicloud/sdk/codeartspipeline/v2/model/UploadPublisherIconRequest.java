package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadPublisherIconRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_en_name")

    private String publisherEnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadPublisherIconRequestBody body;

    public UploadPublisherIconRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UploadPublisherIconRequest withPublisherEnName(String publisherEnName) {
        this.publisherEnName = publisherEnName;
        return this;
    }

    /**
     * 发布商名称
     * @return publisherEnName
     */
    public String getPublisherEnName() {
        return publisherEnName;
    }

    public void setPublisherEnName(String publisherEnName) {
        this.publisherEnName = publisherEnName;
    }

    public UploadPublisherIconRequest withBody(UploadPublisherIconRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadPublisherIconRequest withBody(Consumer<UploadPublisherIconRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadPublisherIconRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadPublisherIconRequestBody getBody() {
        return body;
    }

    public void setBody(UploadPublisherIconRequestBody body) {
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
        UploadPublisherIconRequest that = (UploadPublisherIconRequest) obj;
        return Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.publisherEnName, that.publisherEnName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, publisherEnName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadPublisherIconRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    publisherEnName: ").append(toIndentedString(publisherEnName)).append("\n");
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
