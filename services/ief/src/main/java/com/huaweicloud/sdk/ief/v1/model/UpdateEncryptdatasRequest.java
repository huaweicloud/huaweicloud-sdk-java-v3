package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEncryptdatasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryptdata_id")

    private String encryptdataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EncryptDataReq body;

    public UpdateEncryptdatasRequest withEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
        return this;
    }

    /**
     * 加密数据ID
     * @return encryptdataId
     */
    public String getEncryptdataId() {
        return encryptdataId;
    }

    public void setEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
    }

    public UpdateEncryptdatasRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateEncryptdatasRequest withBody(EncryptDataReq body) {
        this.body = body;
        return this;
    }

    public UpdateEncryptdatasRequest withBody(Consumer<EncryptDataReq> bodySetter) {
        if (this.body == null) {
            this.body = new EncryptDataReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EncryptDataReq getBody() {
        return body;
    }

    public void setBody(EncryptDataReq body) {
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
        UpdateEncryptdatasRequest updateEncryptdatasRequest = (UpdateEncryptdatasRequest) o;
        return Objects.equals(this.encryptdataId, updateEncryptdatasRequest.encryptdataId)
            && Objects.equals(this.iefInstanceId, updateEncryptdatasRequest.iefInstanceId)
            && Objects.equals(this.body, updateEncryptdatasRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptdataId, iefInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEncryptdatasRequest {\n");
        sb.append("    encryptdataId: ").append(toIndentedString(encryptdataId)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
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
