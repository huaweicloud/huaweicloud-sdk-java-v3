package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchDeleteCertificatesResp
 */
public class BatchDeleteCertificatesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private String retStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_code")

    private String retCode;

    public BatchDeleteCertificatesResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchDeleteCertificatesResp withRetStatus(String retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * 对应id的证书删除后的结果，not found表示证书不存在，successful表示删除成功
     * @return retStatus
     */
    public String getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    public BatchDeleteCertificatesResp withRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 错误码，删除失败时返回此字段
     * @return retCode
     */
    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteCertificatesResp that = (BatchDeleteCertificatesResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.retStatus, that.retStatus)
            && Objects.equals(this.retCode, that.retCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, retStatus, retCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCertificatesResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
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
