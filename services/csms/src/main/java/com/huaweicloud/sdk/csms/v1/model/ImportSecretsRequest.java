package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportSecretsRequest
 */
public class ImportSecretsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private List<CreateSecretRequestBody> secrets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ImportSecretsRequest withSecrets(List<CreateSecretRequestBody> secrets) {
        this.secrets = secrets;
        return this;
    }

    public ImportSecretsRequest addSecretsItem(CreateSecretRequestBody secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    public ImportSecretsRequest withSecrets(Consumer<List<CreateSecretRequestBody>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * 批量创建凭据参数
     * @return secrets
     */
    public List<CreateSecretRequestBody> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<CreateSecretRequestBody> secrets) {
        this.secrets = secrets;
    }

    public ImportSecretsRequest withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 导入数据条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportSecretsRequest that = (ImportSecretsRequest) obj;
        return Objects.equals(this.secrets, that.secrets) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secrets, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportSecretsRequest {\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
