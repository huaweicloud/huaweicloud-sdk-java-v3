package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 身份提供方更新信息
 */
public class IDPInfo {

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

    private PublicUpdateInfo publicKeys;

    public IDPInfo withIdpType(String idpType) {
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

    public IDPInfo withIdpIssuer(String idpIssuer) {
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

    public IDPInfo withIdpSigningAlg(String idpSigningAlg) {
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

    public IDPInfo withIdpAudience(String idpAudience) {
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

    public IDPInfo withPublicKeys(PublicUpdateInfo publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    public IDPInfo withPublicKeys(Consumer<PublicUpdateInfo> publicKeysSetter) {
        if (this.publicKeys == null) {
            this.publicKeys = new PublicUpdateInfo();
            publicKeysSetter.accept(this.publicKeys);
        }

        return this;
    }

    /**
     * Get publicKeys
     * @return publicKeys
     */
    public PublicUpdateInfo getPublicKeys() {
        return publicKeys;
    }

    public void setPublicKeys(PublicUpdateInfo publicKeys) {
        this.publicKeys = publicKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDPInfo that = (IDPInfo) obj;
        return Objects.equals(this.idpType, that.idpType) && Objects.equals(this.idpIssuer, that.idpIssuer)
            && Objects.equals(this.idpSigningAlg, that.idpSigningAlg)
            && Objects.equals(this.idpAudience, that.idpAudience) && Objects.equals(this.publicKeys, that.publicKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpType, idpIssuer, idpSigningAlg, idpAudience, publicKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDPInfo {\n");
        sb.append("    idpType: ").append(toIndentedString(idpType)).append("\n");
        sb.append("    idpIssuer: ").append(toIndentedString(idpIssuer)).append("\n");
        sb.append("    idpSigningAlg: ").append(toIndentedString(idpSigningAlg)).append("\n");
        sb.append("    idpAudience: ").append(toIndentedString(idpAudience)).append("\n");
        sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
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
