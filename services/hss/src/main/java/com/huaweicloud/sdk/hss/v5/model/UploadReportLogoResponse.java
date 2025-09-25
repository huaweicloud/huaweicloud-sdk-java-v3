package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UploadReportLogoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_id")

    private String logoId;

    public UploadReportLogoResponse withLogoId(String logoId) {
        this.logoId = logoId;
        return this;
    }

    /**
     * **参数解释**： logo文件唯一标识ID **取值范围**： 字符长度0-256位 
     * @return logoId
     */
    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadReportLogoResponse that = (UploadReportLogoResponse) obj;
        return Objects.equals(this.logoId, that.logoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadReportLogoResponse {\n");
        sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
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
