package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预调配模板详细内容。
 */
public class ProvisioningTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private TemplateResource resources;

    public ProvisioningTemplateBody withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * **参数说明**：预调配模板参数， ，配置格式为{\"parameter\":{\"type\":\"String\"}} ，其中parameter目前支持从预调配设备的证书的使用者字段提取内容，证书必须包含模板中定义的所有参数值，华为云IoT平台定义了可在预调配模板中声明和引用的如下参数: - iotda::certificate::country (国家/地区,C ) - iotda::certificate::organization (组织,O) - iotda::certificate::organizational_unit (组织单位,OU) - iotda::certificate::distinguished_name_qualifier (可辨别名称限定符,dnQualifier) - iotda::certificate::state_name (省市,ST) - iotda::certificate::common_name (公用名,CN) - iotda::certificate::serial_number (序列号,serialNumber)  type描述parameter的类型，目前仅支持string。  配置样例：  '{\"iotda::certificate::country\":{\"type\":\"String\"},  \"iotda::certificate::organization\":{\"type\":\"String\"},  \"iotda::certificate::organizational_unit\":{\"type\":\"String\"},  \"iotda::certificate::distinguished_name_qualifier\":{\"type\":\"String\"},  \"iotda::certificate::state_name\":{\"type\":\"String\"},  \"iotda::certificate::common_name\":{\"type\":\"String\"},  \"iotda::certificate::serial_number\":{\"type\":\"String\"}}'
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public ProvisioningTemplateBody withResources(TemplateResource resources) {
        this.resources = resources;
        return this;
    }

    public ProvisioningTemplateBody withResources(Consumer<TemplateResource> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new TemplateResource();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public TemplateResource getResources() {
        return resources;
    }

    public void setResources(TemplateResource resources) {
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
        ProvisioningTemplateBody that = (ProvisioningTemplateBody) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisioningTemplateBody {\n");
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
