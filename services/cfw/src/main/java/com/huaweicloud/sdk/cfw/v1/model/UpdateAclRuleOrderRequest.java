package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAclRuleOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_rule_id")

    private String aclRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OrderRuleAclDto body;

    public UpdateAclRuleOrderRequest withAclRuleId(String aclRuleId) {
        this.aclRuleId = aclRuleId;
        return this;
    }

    /**
     * 规则id
     * @return aclRuleId
     */
    public String getAclRuleId() {
        return aclRuleId;
    }

    public void setAclRuleId(String aclRuleId) {
        this.aclRuleId = aclRuleId;
    }

    public UpdateAclRuleOrderRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateAclRuleOrderRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，默认情况下，fw_instance_Id为空时，返回账号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public UpdateAclRuleOrderRequest withBody(OrderRuleAclDto body) {
        this.body = body;
        return this;
    }

    public UpdateAclRuleOrderRequest withBody(Consumer<OrderRuleAclDto> bodySetter) {
        if (this.body == null) {
            this.body = new OrderRuleAclDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OrderRuleAclDto getBody() {
        return body;
    }

    public void setBody(OrderRuleAclDto body) {
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
        UpdateAclRuleOrderRequest that = (UpdateAclRuleOrderRequest) obj;
        return Objects.equals(this.aclRuleId, that.aclRuleId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclRuleId, enterpriseProjectId, fwInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAclRuleOrderRequest {\n");
        sb.append("    aclRuleId: ").append(toIndentedString(aclRuleId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
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
