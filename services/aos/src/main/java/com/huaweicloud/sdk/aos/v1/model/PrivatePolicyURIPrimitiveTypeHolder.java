package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivatePolicyURIPrimitiveTypeHolder
 */
public class PrivatePolicyURIPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_uri")

    private String policyUri;

    public PrivatePolicyURIPrimitiveTypeHolder withPolicyUri(String policyUri) {
        this.policyUri = policyUri;
        return this;
    }

    /**
     * 策略文件的OBS地址。内容仅支持OPA开源引擎识别的，以rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板。  OBS地址支持同类型Region之间进行互相访问（Region分为通用Region和专属Region，通用Region指面向公共租户提供通用云服务的Region；专属Region指只承载同一类业务或只面向特定租户提供业务服务的专用Region）  策略文件当前支持单文件或zip压缩包，单文件需要以\".rego\"结尾，压缩包当前只支持zip格式，文件需要以`.zip`结尾。  关于策略文件的校验要求如下：   * 文件必须是UTF8编码   * 创建时不负责校验内容的正确性   * 策略文件必须是UTF-8编码   * 单文件或压缩包解压前后的大小应控制在1MB以内   * 压缩包内的文件数量不能超过100个   * 压缩包内的文件路径最长为2048   * 策略文件名最长为255个字节  policy_uri和policy_body必须有且只有一个存在
     * @return policyUri
     */
    public String getPolicyUri() {
        return policyUri;
    }

    public void setPolicyUri(String policyUri) {
        this.policyUri = policyUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivatePolicyURIPrimitiveTypeHolder that = (PrivatePolicyURIPrimitiveTypeHolder) obj;
        return Objects.equals(this.policyUri, that.policyUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivatePolicyURIPrimitiveTypeHolder {\n");
        sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
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
