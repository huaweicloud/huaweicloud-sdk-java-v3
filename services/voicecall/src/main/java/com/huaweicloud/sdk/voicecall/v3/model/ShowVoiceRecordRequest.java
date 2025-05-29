package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVoiceRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-AKSK")

    private String xAksk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileName")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordDomain")

    private String recordDomain;

    public ShowVoiceRecordRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 固定填写为AKSK realm='SDP',profile='UsernameToken',type='Appkey'。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ShowVoiceRecordRequest withXAksk(String xAksk) {
        this.xAksk = xAksk;
        return this;
    }

    /**
     * 取值为UsernameToken Username='APP_Key的值', PasswordDigest='PasswordDigest的值', Nonce='随机数', Created='随机数生成时间'。
     * @return xAksk
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-AKSK")
    public String getXAksk() {
        return xAksk;
    }

    public void setXAksk(String xAksk) {
        this.xAksk = xAksk;
    }

    public ShowVoiceRecordRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 录音文件名。通过'呼叫状态和话单通知API'的recordObjectName参数获取。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ShowVoiceRecordRequest withRecordDomain(String recordDomain) {
        this.recordDomain = recordDomain;
        return this;
    }

    /**
     * 录音文件存储的服务器域名，通过'呼叫状态和话单通知API'的recordDomain参数获取
     * @return recordDomain
     */
    public String getRecordDomain() {
        return recordDomain;
    }

    public void setRecordDomain(String recordDomain) {
        this.recordDomain = recordDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVoiceRecordRequest that = (ShowVoiceRecordRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xAksk, that.xAksk)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.recordDomain, that.recordDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xAksk, fileName, recordDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVoiceRecordRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xAksk: ").append(toIndentedString(xAksk)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    recordDomain: ").append(toIndentedString(recordDomain)).append("\n");
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
