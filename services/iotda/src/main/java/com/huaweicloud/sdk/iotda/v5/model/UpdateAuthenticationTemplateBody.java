package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新鉴权模板详细内容。
 */
public class UpdateAuthenticationTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private UpdateAuthenticationTemplateResource resources;

    public UpdateAuthenticationTemplateBody withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * **参数说明**：鉴权模板参数，目前平台预制了mqtt协议连接参数中的clientId，username与设备证书中的属性，参数名定义如下: - iotda::mqtt::client_id ：mqtt连接参数三元组中的Client Id - iotda::mqtt::username ：mqtt连接参数三元组中的User Name - iotda::certificate::country (国家/地区,C ) - iotda::certificate::organization (组织,O) - iotda::certificate::organizational_unit (组织单位,OU) - iotda::certificate::distinguished_name_qualifier (可辨别名称限定符,dnQualifier) - iotda::certificate::state_name (省市,ST) - iotda::certificate::common_name (公用名,CN) - iotda::certificate::serial_number (序列号,serialNumber) - iotda::device::secret ：表示设备原始秘钥
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public UpdateAuthenticationTemplateBody withResources(UpdateAuthenticationTemplateResource resources) {
        this.resources = resources;
        return this;
    }

    public UpdateAuthenticationTemplateBody withResources(
        Consumer<UpdateAuthenticationTemplateResource> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new UpdateAuthenticationTemplateResource();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public UpdateAuthenticationTemplateResource getResources() {
        return resources;
    }

    public void setResources(UpdateAuthenticationTemplateResource resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAuthenticationTemplateBody that = (UpdateAuthenticationTemplateBody) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthenticationTemplateBody {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
