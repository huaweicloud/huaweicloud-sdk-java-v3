package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateProviderSourcePrimitiveTypeHolder
 */
public class PrivateProviderSourcePrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_source")

    private String providerSource;

    public PrivateProviderSourcePrimitiveTypeHolder withProviderSource(String providerSource) {
        this.providerSource = providerSource;
        return this;
    }

    /**
     * 用户使用私有provider，在Terraform模板中定义required_providers信息时，需要指明的source参数。  该参数按照“huawei.com/private-provider/{provider_name}”的形式拼接。关于provider_name和provider_source字段在模板中的使用细节，详见创建私有Provider的API描述。
     * @return providerSource
     */
    public String getProviderSource() {
        return providerSource;
    }

    public void setProviderSource(String providerSource) {
        this.providerSource = providerSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateProviderSourcePrimitiveTypeHolder that = (PrivateProviderSourcePrimitiveTypeHolder) obj;
        return Objects.equals(this.providerSource, that.providerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateProviderSourcePrimitiveTypeHolder {\n");
        sb.append("    providerSource: ").append(toIndentedString(providerSource)).append("\n");
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
