package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecretsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private List<SecretDetail> secrets = null;

    public ListSecretsResponse withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ListSecretsResponse withSecrets(List<SecretDetail> secrets) {
        this.secrets = secrets;
        return this;
    }

    public ListSecretsResponse addSecretsItem(SecretDetail secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    public ListSecretsResponse withSecrets(Consumer<List<SecretDetail>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * 缪瑶详情列表
     * @return secrets
     */
    public List<SecretDetail> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<SecretDetail> secrets) {
        this.secrets = secrets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecretsResponse listSecretsResponse = (ListSecretsResponse) o;
        return Objects.equals(this.count, listSecretsResponse.count)
            && Objects.equals(this.secrets, listSecretsResponse.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecretsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
