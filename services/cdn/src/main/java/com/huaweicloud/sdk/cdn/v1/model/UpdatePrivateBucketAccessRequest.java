package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePrivateBucketAccessRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdatePrivateBucketAccessBody body;

    public UpdatePrivateBucketAccessRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示修改当前企业项目下加速域名的配置，\"all\"代表所有项目。注意：当使用子账号调用接口时，该参数必传。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdatePrivateBucketAccessRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 加速域名id。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdatePrivateBucketAccessRequest withBody(UpdatePrivateBucketAccessBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateBucketAccessRequest withBody(Consumer<UpdatePrivateBucketAccessBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivateBucketAccessBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePrivateBucketAccessBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateBucketAccessBody body) {
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
        UpdatePrivateBucketAccessRequest updatePrivateBucketAccessRequest = (UpdatePrivateBucketAccessRequest) o;
        return Objects.equals(this.enterpriseProjectId, updatePrivateBucketAccessRequest.enterpriseProjectId)
            && Objects.equals(this.domainId, updatePrivateBucketAccessRequest.domainId)
            && Objects.equals(this.body, updatePrivateBucketAccessRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, domainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateBucketAccessRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
