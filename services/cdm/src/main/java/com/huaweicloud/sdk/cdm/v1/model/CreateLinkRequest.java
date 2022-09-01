package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateLinkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    @JacksonXmlProperty(localName = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate")

    @JacksonXmlProperty(localName = "validate")

    private String validate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CdmCreateAndUpdateLinkReq body;

    public CreateLinkRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateLinkRequest withValidate(String validate) {
        this.validate = validate;
        return this;
    }

    /**
     * 为“true”时，此API仅校验参数是否正确，不创建连接
     * @return validate
     */
    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public CreateLinkRequest withBody(CdmCreateAndUpdateLinkReq body) {
        this.body = body;
        return this;
    }

    public CreateLinkRequest withBody(Consumer<CdmCreateAndUpdateLinkReq> bodySetter) {
        if (this.body == null) {
            this.body = new CdmCreateAndUpdateLinkReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CdmCreateAndUpdateLinkReq getBody() {
        return body;
    }

    public void setBody(CdmCreateAndUpdateLinkReq body) {
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
        CreateLinkRequest createLinkRequest = (CreateLinkRequest) o;
        return Objects.equals(this.clusterId, createLinkRequest.clusterId)
            && Objects.equals(this.validate, createLinkRequest.validate)
            && Objects.equals(this.body, createLinkRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, validate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLinkRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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
