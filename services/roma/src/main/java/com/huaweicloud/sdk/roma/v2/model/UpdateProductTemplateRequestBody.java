package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateProductTemplateRequestBody */
public class UpdateProductTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public UpdateProductTemplateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 产品模板名称，支持中文,英文大小写，数字，下划线和中划线,长度2-64
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateProductTemplateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 产品模板描述，长度0-200
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProductTemplateRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 产品模板状态 0-启用 1-禁用 minimum: 0 maximum: 10
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProductTemplateRequestBody updateProductTemplateRequestBody = (UpdateProductTemplateRequestBody) o;
        return Objects.equals(this.name, updateProductTemplateRequestBody.name)
            && Objects.equals(this.description, updateProductTemplateRequestBody.description)
            && Objects.equals(this.status, updateProductTemplateRequestBody.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductTemplateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
