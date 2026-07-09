package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRealNameAuthQrCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qr_code_url")

    private String qrCodeUrl;

    public ShowRealNameAuthQrCodeResponse withQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }

    /**
     * 人脸实名认证二维码地址。该二维码仅限单次使用，扫描后将自动失效。若未在10分钟内完成扫描，系统将自动作废。
     * @return qrCodeUrl
     */
    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRealNameAuthQrCodeResponse that = (ShowRealNameAuthQrCodeResponse) obj;
        return Objects.equals(this.qrCodeUrl, that.qrCodeUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qrCodeUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealNameAuthQrCodeResponse {\n");
        sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
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
