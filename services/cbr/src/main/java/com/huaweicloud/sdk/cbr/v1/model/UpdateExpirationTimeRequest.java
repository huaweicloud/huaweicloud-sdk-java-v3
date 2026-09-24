package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateExpirationTimeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateExpirationTimeReq body;

    public UpdateExpirationTimeRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID，默认取值不涉及。 [获取方法请参见\"[获取存储库ID](https://support.huaweicloud.com/api-cbr/ListVault.html)\"。](tag:hws) [获取方法请参见\"[获取存储库ID](https://support.huaweicloud.com/intl/zh-cn/api-cbr/ListVault.html)\"。](tag:hws_hk)
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public UpdateExpirationTimeRequest withBody(UpdateExpirationTimeReq body) {
        this.body = body;
        return this;
    }

    public UpdateExpirationTimeRequest withBody(Consumer<UpdateExpirationTimeReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateExpirationTimeReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateExpirationTimeReq getBody() {
        return body;
    }

    public void setBody(UpdateExpirationTimeReq body) {
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
        UpdateExpirationTimeRequest that = (UpdateExpirationTimeRequest) obj;
        return Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExpirationTimeRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
