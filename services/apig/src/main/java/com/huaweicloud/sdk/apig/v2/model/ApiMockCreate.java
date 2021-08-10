package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** mock后端详情 */
public class ApiMockCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_content")

    private String resultContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_id")

    private String authorizerId;

    public ApiMockCreate withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 描述信息。长度不超过255个字符 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ApiMockCreate withResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }

    /** 返回结果
     * 
     * @return resultContent */
    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    public ApiMockCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 版本。字符长度不超过64
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApiMockCreate withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /** 后端自定义认证ID
     * 
     * @return authorizerId */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiMockCreate apiMockCreate = (ApiMockCreate) o;
        return Objects.equals(this.remark, apiMockCreate.remark)
            && Objects.equals(this.resultContent, apiMockCreate.resultContent)
            && Objects.equals(this.version, apiMockCreate.version)
            && Objects.equals(this.authorizerId, apiMockCreate.authorizerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark, resultContent, version, authorizerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiMockCreate {\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    resultContent: ").append(toIndentedString(resultContent)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
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
