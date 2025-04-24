package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDomainMultiCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private UpdateDomainMultiCertificatesResponseBodyContent https;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<UpdateDomainMultiCertificatesResponseBodyResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateDomainMultiCertificatesResponse withHttps(UpdateDomainMultiCertificatesResponseBodyContent https) {
        this.https = https;
        return this;
    }

    public UpdateDomainMultiCertificatesResponse withHttps(
        Consumer<UpdateDomainMultiCertificatesResponseBodyContent> httpsSetter) {
        if (this.https == null) {
            this.https = new UpdateDomainMultiCertificatesResponseBodyContent();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    /**
     * Get https
     * @return https
     */
    public UpdateDomainMultiCertificatesResponseBodyContent getHttps() {
        return https;
    }

    public void setHttps(UpdateDomainMultiCertificatesResponseBodyContent https) {
        this.https = https;
    }

    public UpdateDomainMultiCertificatesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行结果，success，fail
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateDomainMultiCertificatesResponse withResult(
        List<UpdateDomainMultiCertificatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }

    public UpdateDomainMultiCertificatesResponse addResultItem(
        UpdateDomainMultiCertificatesResponseBodyResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public UpdateDomainMultiCertificatesResponse withResult(
        Consumer<List<UpdateDomainMultiCertificatesResponseBodyResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 详情
     * @return result
     */
    public List<UpdateDomainMultiCertificatesResponseBodyResult> getResult() {
        return result;
    }

    public void setResult(List<UpdateDomainMultiCertificatesResponseBodyResult> result) {
        this.result = result;
    }

    public UpdateDomainMultiCertificatesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesResponse that = (UpdateDomainMultiCertificatesResponse) obj;
        return Objects.equals(this.https, that.https) && Objects.equals(this.status, that.status)
            && Objects.equals(this.result, that.result) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(https, status, result, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesResponse {\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
