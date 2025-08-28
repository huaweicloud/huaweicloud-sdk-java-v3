package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateCertificatePrivateKeyEchoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_echo")

    private Boolean privateKeyEcho;

    public CreateCertificatePrivateKeyEchoRequestBody withPrivateKeyEcho(Boolean privateKeyEcho) {
        this.privateKeyEcho = privateKeyEcho;
        return this;
    }

    /**
     * **参数解释**：ELB证书的私钥回显开关。  **约束限制**：不涉及  **取值范围**： - true：开启回显，证书的列表、详情、创建和更新接口响应字段将会显示私钥内容。 - false：关闭回显，证书的所有接口响应不显私钥内容，使用脱敏内容（*****）代替。  **默认取值**：不涉及
     * @return privateKeyEcho
     */
    public Boolean getPrivateKeyEcho() {
        return privateKeyEcho;
    }

    public void setPrivateKeyEcho(Boolean privateKeyEcho) {
        this.privateKeyEcho = privateKeyEcho;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCertificatePrivateKeyEchoRequestBody that = (CreateCertificatePrivateKeyEchoRequestBody) obj;
        return Objects.equals(this.privateKeyEcho, that.privateKeyEcho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateKeyEcho);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificatePrivateKeyEchoRequestBody {\n");
        sb.append("    privateKeyEcho: ").append(toIndentedString(privateKeyEcho)).append("\n");
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
