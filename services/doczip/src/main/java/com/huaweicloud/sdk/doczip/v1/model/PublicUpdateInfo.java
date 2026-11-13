package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublicUpdateInfo
 */
public class PublicUpdateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kid")

    private String kid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private String opType;

    public PublicUpdateInfo withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * **参数解释**： Key ID。 **约束限制**： 不涉及。 **取值范围**： [1-128]个字符。 **默认取值**： 不涉及。
     * @return kid
     */
    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public PublicUpdateInfo withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * **参数解释**： PEM 格式公钥。 **约束限制**： 不涉及。 **取值范围**： [1-2048]的字符串。 **默认取值**： 不涉及。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public PublicUpdateInfo withOpType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * **参数解释**： 操作类型。 **约束限制**： 不涉及。 **取值范围**： - add：新增。 - update：更新。 - delete：删除 **默认取值**： 不涉及。
     * @return opType
     */
    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicUpdateInfo that = (PublicUpdateInfo) obj;
        return Objects.equals(this.kid, that.kid) && Objects.equals(this.publicKey, that.publicKey)
            && Objects.equals(this.opType, that.opType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kid, publicKey, opType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicUpdateInfo {\n");
        sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
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
