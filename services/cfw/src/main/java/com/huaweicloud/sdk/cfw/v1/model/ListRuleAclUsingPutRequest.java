package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListRuleAclUsingPutRequest {

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

    public ListRuleAclUsingPutRequest withAclRuleId(String aclRuleId) {
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

    public ListRuleAclUsingPutRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListRuleAclUsingPutRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListRuleAclUsingPutRequest withBody(OrderRuleAclDto body) {
        this.body = body;
        return this;
    }

    public ListRuleAclUsingPutRequest withBody(Consumer<OrderRuleAclDto> bodySetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuleAclUsingPutRequest listRuleAclUsingPutRequest = (ListRuleAclUsingPutRequest) o;
        return Objects.equals(this.aclRuleId, listRuleAclUsingPutRequest.aclRuleId)
            && Objects.equals(this.enterpriseProjectId, listRuleAclUsingPutRequest.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, listRuleAclUsingPutRequest.fwInstanceId)
            && Objects.equals(this.body, listRuleAclUsingPutRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclRuleId, enterpriseProjectId, fwInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuleAclUsingPutRequest {\n");
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
