package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入私钥请求体
 */
public class ImportPrivateKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private ImportPrivateKeyKeypairBean keypair;

    public ImportPrivateKeyRequestBody withKeypair(ImportPrivateKeyKeypairBean keypair) {
        this.keypair = keypair;
        return this;
    }

    public ImportPrivateKeyRequestBody withKeypair(Consumer<ImportPrivateKeyKeypairBean> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new ImportPrivateKeyKeypairBean();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public ImportPrivateKeyKeypairBean getKeypair() {
        return keypair;
    }

    public void setKeypair(ImportPrivateKeyKeypairBean keypair) {
        this.keypair = keypair;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportPrivateKeyRequestBody that = (ImportPrivateKeyRequestBody) obj;
        return Objects.equals(this.keypair, that.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPrivateKeyRequestBody {\n");
        sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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
