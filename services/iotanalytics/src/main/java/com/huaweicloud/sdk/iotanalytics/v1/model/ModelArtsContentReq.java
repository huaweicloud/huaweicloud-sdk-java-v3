package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModelArts数据源配置内容
 */
public class ModelArtsContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_address")

    private String accessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_body")

    private String verifyBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ModelArtsContentReq withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ModelArtsContentReq withAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress;
        return this;
    }

    /**
     * 访问地址
     * @return accessAddress
     */
    public String getAccessAddress() {
        return accessAddress;
    }

    public void setAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress;
    }

    public ModelArtsContentReq withVerifyBody(String verifyBody) {
        this.verifyBody = verifyBody;
        return this;
    }

    /**
     * 校验参数
     * @return verifyBody
     */
    public String getVerifyBody() {
        return verifyBody;
    }

    public void setVerifyBody(String verifyBody) {
        this.verifyBody = verifyBody;
    }

    public ModelArtsContentReq withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 租户的AK
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public ModelArtsContentReq withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 租户的SK
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public ModelArtsContentReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelArtsContentReq that = (ModelArtsContentReq) obj;
        return Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.accessAddress, that.accessAddress)
            && Objects.equals(this.verifyBody, that.verifyBody) && Objects.equals(this.ak, that.ak)
            && Objects.equals(this.sk, that.sk) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, accessAddress, verifyBody, ak, sk, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelArtsContentReq {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    accessAddress: ").append(toIndentedString(accessAddress)).append("\n");
        sb.append("    verifyBody: ").append(toIndentedString(verifyBody)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
