package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateUnscopeTokenByIdpInitiatedRequestBody
 */
public class CreateUnscopeTokenByIdpInitiatedRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SAMLResponse")

    private String saMLResponse;

    public CreateUnscopeTokenByIdpInitiatedRequestBody withSaMLResponse(String saMLResponse) {
        this.saMLResponse = saMLResponse;
        return this;
    }

    /**
     * 在IdP认证成功后返回的响应体。详情请参见：[获取联邦认证unscoped token(IdP initiated)](https://support.huaweicloud.com/api-iam/iam_02_0003.html)。
     * @return saMLResponse
     */
    public String getSaMLResponse() {
        return saMLResponse;
    }

    public void setSaMLResponse(String saMLResponse) {
        this.saMLResponse = saMLResponse;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("SAMLResponse", new FormDataPart<>(saMLResponse));
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUnscopeTokenByIdpInitiatedRequestBody that = (CreateUnscopeTokenByIdpInitiatedRequestBody) obj;
        return Objects.equals(this.saMLResponse, that.saMLResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saMLResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnscopeTokenByIdpInitiatedRequestBody {\n");
        sb.append("    saMLResponse: ").append(toIndentedString(saMLResponse)).append("\n");
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
