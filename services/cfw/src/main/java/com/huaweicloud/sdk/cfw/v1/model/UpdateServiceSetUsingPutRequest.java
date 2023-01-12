package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateServiceSetUsingPutRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateServiceSetUsingPUTRequestBody body;

    public UpdateServiceSetUsingPutRequest withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 服务组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public UpdateServiceSetUsingPutRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateServiceSetUsingPutRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。默认情况下，fw_instance_Id为空时，返回帐号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public UpdateServiceSetUsingPutRequest withBody(UpdateServiceSetUsingPUTRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateServiceSetUsingPutRequest withBody(Consumer<UpdateServiceSetUsingPUTRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateServiceSetUsingPUTRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateServiceSetUsingPUTRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateServiceSetUsingPUTRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServiceSetUsingPutRequest updateServiceSetUsingPutRequest = (UpdateServiceSetUsingPutRequest) o;
        return Objects.equals(this.setId, updateServiceSetUsingPutRequest.setId)
            && Objects.equals(this.enterpriseProjectId, updateServiceSetUsingPutRequest.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, updateServiceSetUsingPutRequest.fwInstanceId)
            && Objects.equals(this.body, updateServiceSetUsingPutRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, enterpriseProjectId, fwInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServiceSetUsingPutRequest {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
