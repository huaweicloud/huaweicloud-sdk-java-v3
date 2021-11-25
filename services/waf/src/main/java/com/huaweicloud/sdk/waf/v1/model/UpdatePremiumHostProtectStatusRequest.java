package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdatePremiumHostProtectStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePremiumHostProtectStatusRequestBody body;

    public UpdatePremiumHostProtectStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdatePremiumHostProtectStatusRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /** 独享模式域名ID
     * 
     * @return hostId */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdatePremiumHostProtectStatusRequest withBody(UpdatePremiumHostProtectStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePremiumHostProtectStatusRequest withBody(
        Consumer<UpdatePremiumHostProtectStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePremiumHostProtectStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdatePremiumHostProtectStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePremiumHostProtectStatusRequestBody body) {
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
        UpdatePremiumHostProtectStatusRequest updatePremiumHostProtectStatusRequest =
            (UpdatePremiumHostProtectStatusRequest) o;
        return Objects.equals(this.enterpriseProjectId, updatePremiumHostProtectStatusRequest.enterpriseProjectId)
            && Objects.equals(this.hostId, updatePremiumHostProtectStatusRequest.hostId)
            && Objects.equals(this.body, updatePremiumHostProtectStatusRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, hostId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumHostProtectStatusRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
