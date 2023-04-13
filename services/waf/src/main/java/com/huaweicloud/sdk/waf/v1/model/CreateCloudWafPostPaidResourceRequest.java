package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCloudWafPostPaidResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateCloudWafPostPaidResourceRequestbody body;

    public CreateCloudWafPostPaidResourceRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateCloudWafPostPaidResourceRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateCloudWafPostPaidResourceRequest withBody(CreateCloudWafPostPaidResourceRequestbody body) {
        this.body = body;
        return this;
    }

    public CreateCloudWafPostPaidResourceRequest withBody(
        Consumer<CreateCloudWafPostPaidResourceRequestbody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateCloudWafPostPaidResourceRequestbody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateCloudWafPostPaidResourceRequestbody getBody() {
        return body;
    }

    public void setBody(CreateCloudWafPostPaidResourceRequestbody body) {
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
        CreateCloudWafPostPaidResourceRequest createCloudWafPostPaidResourceRequest =
            (CreateCloudWafPostPaidResourceRequest) o;
        return Objects.equals(this.region, createCloudWafPostPaidResourceRequest.region)
            && Objects.equals(this.enterpriseProjectId, createCloudWafPostPaidResourceRequest.enterpriseProjectId)
            && Objects.equals(this.body, createCloudWafPostPaidResourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudWafPostPaidResourceRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
