package com.huaweicloud.sdk.ief.v1.model;

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
    @JsonProperty(value = "secrets")

    private List<SecretDetailResp> secrets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSecretsResponse withSecrets(List<SecretDetailResp> secrets) {
        this.secrets = secrets;
        return this;
    }

    public ListSecretsResponse addSecretsItem(SecretDetailResp secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    public ListSecretsResponse withSecrets(Consumer<List<SecretDetailResp>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * 密钥
     * @return secrets
     */
    public List<SecretDetailResp> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<SecretDetailResp> secrets) {
        this.secrets = secrets;
    }

    public ListSecretsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        return Objects.equals(this.secrets, listSecretsResponse.secrets)
            && Objects.equals(this.count, listSecretsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secrets, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecretsResponse {\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
