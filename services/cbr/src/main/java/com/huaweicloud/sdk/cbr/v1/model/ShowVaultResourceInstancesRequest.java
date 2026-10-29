package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowVaultResourceInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VaultResourceInstancesReq body;

    public ShowVaultResourceInstancesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 云备份企业项目ID，获取企业项目ID请参考[查询企业项目列表](https://support.huaweicloud.com/api-em/zh-cn_topic_0121230880.html)(tag:hws)[查询企业项目列表](https://support.huaweicloud.com/intl/zh-cn/api-em/zh-cn_topic_0121230880.html)(tag:hws_hk)[《企业管理API参考》“查询企业项目列表”章节](tag:ctc,dt,tm,sbc,hws_eu,fcs_vm,hcso_dt,srg) **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowVaultResourceInstancesRequest withBody(VaultResourceInstancesReq body) {
        this.body = body;
        return this;
    }

    public ShowVaultResourceInstancesRequest withBody(Consumer<VaultResourceInstancesReq> bodySetter) {
        if (this.body == null) {
            this.body = new VaultResourceInstancesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VaultResourceInstancesReq getBody() {
        return body;
    }

    public void setBody(VaultResourceInstancesReq body) {
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
        ShowVaultResourceInstancesRequest that = (ShowVaultResourceInstancesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVaultResourceInstancesRequest {\n");
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
