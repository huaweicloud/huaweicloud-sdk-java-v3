package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RecognizeThailandLicensePlateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ThailandLicensePlateRequestBody body;

    public RecognizeThailandLicensePlateRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。OCR支持通过企业项目管理（EPS）对不同用户组和用户的资源使用，进行分账。 获取方法：[进入“[企业项目管理](https://console.huaweicloud.com/eps/?region=cn-north-4#/projects/list)”页面,](tag:hc)[进入“[企业项目管理](https://console-intl.huaweicloud.com/eps/?region=ap-southeast-1#/projects/list)”页面,](tag:hk)单击企业项目名称，在企业项目详情页获取Enterprise-Project-Id（企业项目ID）。 企业项目创建步骤请参见用户指南。 > 说明： 创建企业项目后，在传参时，有以下三类场景。 - 携带正确的ID，正常使用OCR服务，账单的企业项目会被分类到企业ID对应的企业项目中。 - 携带格式正确但不存在的ID，正常使用OCR服务，账单的企业项目会显示对应不存在的企业项目ID。 - 不携带ID或格式错误ID（包含特殊字符等），正常使用OCR服务，账单的企业项目会被分类到\"default\"中。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecognizeThailandLicensePlateRequest withBody(ThailandLicensePlateRequestBody body) {
        this.body = body;
        return this;
    }

    public RecognizeThailandLicensePlateRequest withBody(Consumer<ThailandLicensePlateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ThailandLicensePlateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ThailandLicensePlateRequestBody getBody() {
        return body;
    }

    public void setBody(ThailandLicensePlateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecognizeThailandLicensePlateRequest that = (RecognizeThailandLicensePlateRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeThailandLicensePlateRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
