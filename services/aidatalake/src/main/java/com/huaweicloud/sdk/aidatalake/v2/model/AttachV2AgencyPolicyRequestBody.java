package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：附加策略请求。 **约束限制**：policy_name为必填字段。
 */
public class AttachV2AgencyPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    public AttachV2AgencyPolicyRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**：权限策略名称，指定要操作的权限策略。 **约束限制**：不支持操作必选策略（AI_DATALAKE_COMMON_POLICY、AI_DATALAKE_SELF_POLICY、AI_DATALAKE_LAKEFORMATION_POLICY、AI_DATALAKE_LTS_POLICY）。 **取值范围**：   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：VPCEP相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。 **默认取值**：不涉及。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachV2AgencyPolicyRequestBody that = (AttachV2AgencyPolicyRequestBody) obj;
        return Objects.equals(this.policyName, that.policyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachV2AgencyPolicyRequestBody {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
