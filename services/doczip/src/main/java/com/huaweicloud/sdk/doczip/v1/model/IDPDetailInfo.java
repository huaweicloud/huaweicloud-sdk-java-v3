package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 身份提供方信息
 */
public class IDPDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_type")

    private String idpType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_issuer")

    private String idpIssuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_signing_alg")

    private String idpSigningAlg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_audience")

    private String idpAudience;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_keys")

    private List<PublicInfo> publicKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public IDPDetailInfo withIdpType(String idpType) {
        this.idpType = idpType;
        return this;
    }

    /**
     * **参数解释**： 身份提供方类型。 **约束限制**： 不涉及。 **取值范围**： - oidc：OIDC签名。 - self_signed_jwt：自签。 **默认取值**： 不涉及。
     * @return idpType
     */
    public String getIdpType() {
        return idpType;
    }

    public void setIdpType(String idpType) {
        this.idpType = idpType;
    }

    public IDPDetailInfo withIdpIssuer(String idpIssuer) {
        this.idpIssuer = idpIssuer;
        return this;
    }

    /**
     * **参数解释**： 身份提供方的 Issuer URL。 **约束限制**： 格式如：https://idp.example.com。 **取值范围**： [1-512]个字符。 **默认取值**： 不涉及。
     * @return idpIssuer
     */
    public String getIdpIssuer() {
        return idpIssuer;
    }

    public void setIdpIssuer(String idpIssuer) {
        this.idpIssuer = idpIssuer;
    }

    public IDPDetailInfo withIdpSigningAlg(String idpSigningAlg) {
        this.idpSigningAlg = idpSigningAlg;
        return this;
    }

    /**
     * **参数解释**： 签名算法。 **约束限制**： 不涉及。 **取值范围**： - RS256：RS256算法。 - ES256：ES256算法。 **默认取值**： 不涉及。
     * @return idpSigningAlg
     */
    public String getIdpSigningAlg() {
        return idpSigningAlg;
    }

    public void setIdpSigningAlg(String idpSigningAlg) {
        this.idpSigningAlg = idpSigningAlg;
    }

    public IDPDetailInfo withIdpAudience(String idpAudience) {
        this.idpAudience = idpAudience;
        return this;
    }

    /**
     * **参数解释**： 预期的 Audience。 **约束限制**： 不涉及。 **取值范围**： [1-512]个字符。 **默认取值**： 不涉及。
     * @return idpAudience
     */
    public String getIdpAudience() {
        return idpAudience;
    }

    public void setIdpAudience(String idpAudience) {
        this.idpAudience = idpAudience;
    }

    public IDPDetailInfo withPublicKeys(List<PublicInfo> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    public IDPDetailInfo addPublicKeysItem(PublicInfo publicKeysItem) {
        if (this.publicKeys == null) {
            this.publicKeys = new ArrayList<>();
        }
        this.publicKeys.add(publicKeysItem);
        return this;
    }

    public IDPDetailInfo withPublicKeys(Consumer<List<PublicInfo>> publicKeysSetter) {
        if (this.publicKeys == null) {
            this.publicKeys = new ArrayList<>();
        }
        publicKeysSetter.accept(this.publicKeys);
        return this;
    }

    /**
     * **参数解释**： 身份提供方公钥。 **取值范围**： 不涉及。
     * @return publicKeys
     */
    public List<PublicInfo> getPublicKeys() {
        return publicKeys;
    }

    public void setPublicKeys(List<PublicInfo> publicKeys) {
        this.publicKeys = publicKeys;
    }

    public IDPDetailInfo withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： [创建时间。格式为YYYY-MM-DD HH:mm:ss。例如：2023-11-24 17:35:25。](tag:his) [创建时间。UTC时间。格式为YYYY-MM-DD HH:mm:ss。例如：2023-11-24 17:35:25。](tag:hws) **取值范围**： 不涉及。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IDPDetailInfo withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**： [创建时间。格式为YYYY-MM-DD HH:mm:ss。例如：2023-11-24 17:35:25。](tag:his) [创建时间。UTC时间。格式为YYYY-MM-DD HH:mm:ss。例如：2023-11-24 17:35:25。](tag:hws) **取值范围**： 不涉及。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDPDetailInfo that = (IDPDetailInfo) obj;
        return Objects.equals(this.idpType, that.idpType) && Objects.equals(this.idpIssuer, that.idpIssuer)
            && Objects.equals(this.idpSigningAlg, that.idpSigningAlg)
            && Objects.equals(this.idpAudience, that.idpAudience) && Objects.equals(this.publicKeys, that.publicKeys)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpType, idpIssuer, idpSigningAlg, idpAudience, publicKeys, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDPDetailInfo {\n");
        sb.append("    idpType: ").append(toIndentedString(idpType)).append("\n");
        sb.append("    idpIssuer: ").append(toIndentedString(idpIssuer)).append("\n");
        sb.append("    idpSigningAlg: ").append(toIndentedString(idpSigningAlg)).append("\n");
        sb.append("    idpAudience: ").append(toIndentedString(idpAudience)).append("\n");
        sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
