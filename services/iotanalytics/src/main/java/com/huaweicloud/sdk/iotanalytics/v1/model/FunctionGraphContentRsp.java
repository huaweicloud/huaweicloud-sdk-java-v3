package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SMN数据源配置内容 */
public class FunctionGraphContentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functionName")

    private String functionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origUrl")

    private String origUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finalUrl")

    private String finalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verifyBody")

    private String verifyBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    public FunctionGraphContentRsp withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /** 名称
     * 
     * @return functionName */
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public FunctionGraphContentRsp withOrigUrl(String origUrl) {
        this.origUrl = origUrl;
        return this;
    }

    /** 原始URL
     * 
     * @return origUrl */
    public String getOrigUrl() {
        return origUrl;
    }

    public void setOrigUrl(String origUrl) {
        this.origUrl = origUrl;
    }

    public FunctionGraphContentRsp withFinalUrl(String finalUrl) {
        this.finalUrl = finalUrl;
        return this;
    }

    /** 转换后的URL
     * 
     * @return finalUrl */
    public String getFinalUrl() {
        return finalUrl;
    }

    public void setFinalUrl(String finalUrl) {
        this.finalUrl = finalUrl;
    }

    public FunctionGraphContentRsp withVerifyBody(String verifyBody) {
        this.verifyBody = verifyBody;
        return this;
    }

    /** 校验参数
     * 
     * @return verifyBody */
    public String getVerifyBody() {
        return verifyBody;
    }

    public void setVerifyBody(String verifyBody) {
        this.verifyBody = verifyBody;
    }

    public FunctionGraphContentRsp withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /** 租户的AK
     * 
     * @return ak */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public FunctionGraphContentRsp withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /** 租户的SK
     * 
     * @return sk */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public FunctionGraphContentRsp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionGraphContentRsp functionGraphContentRsp = (FunctionGraphContentRsp) o;
        return Objects.equals(this.functionName, functionGraphContentRsp.functionName)
            && Objects.equals(this.origUrl, functionGraphContentRsp.origUrl)
            && Objects.equals(this.finalUrl, functionGraphContentRsp.finalUrl)
            && Objects.equals(this.verifyBody, functionGraphContentRsp.verifyBody)
            && Objects.equals(this.ak, functionGraphContentRsp.ak)
            && Objects.equals(this.sk, functionGraphContentRsp.sk)
            && Objects.equals(this.projectId, functionGraphContentRsp.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, origUrl, finalUrl, verifyBody, ak, sk, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGraphContentRsp {\n");
        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("    origUrl: ").append(toIndentedString(origUrl)).append("\n");
        sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
        sb.append("    verifyBody: ").append(toIndentedString(verifyBody)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
