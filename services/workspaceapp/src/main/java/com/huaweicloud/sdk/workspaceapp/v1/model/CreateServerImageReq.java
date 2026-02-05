package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建云应用镜像的请求体。
 */
public class CreateServerImageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_sysprep")

    private Boolean executeSysprep;

    public CreateServerImageReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称，名称需满足如下规则: * 首尾字符不能为空格。 * 长度范围1～128个字符。 * 只允许3种字符，英文大小写，数字，特殊字符包含-、.、_、空格和中文。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateServerImageReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像描述，描述需满足如下规则: * 首字符不能为空格。 * 长度范围0～1024个字符。 * 支持字母、数字、中文。 * 不支持回车、<、 >字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateServerImageReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **⚠ : 此属性是预留字段，不需要传值，目前镜像产物默认属于default企业项目** 镜像所属的企业项目ID，默认属于default企业项目。 关于企业项目ID的获取及企业项目特性的详细信息，请参考“[企业中心总览](https://support.huaweicloud.com/zh-cn/usermanual-em/zh-cn_topic_0123692049.html)”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateServerImageReq withExecuteSysprep(Boolean executeSysprep) {
        this.executeSysprep = executeSysprep;
        return this;
    }

    /**
     * 是否执行系统封装步骤。
     * @return executeSysprep
     */
    public Boolean getExecuteSysprep() {
        return executeSysprep;
    }

    public void setExecuteSysprep(Boolean executeSysprep) {
        this.executeSysprep = executeSysprep;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerImageReq that = (CreateServerImageReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.executeSysprep, that.executeSysprep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, enterpriseProjectId, executeSysprep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerImageReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    executeSysprep: ").append(toIndentedString(executeSysprep)).append("\n");
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
