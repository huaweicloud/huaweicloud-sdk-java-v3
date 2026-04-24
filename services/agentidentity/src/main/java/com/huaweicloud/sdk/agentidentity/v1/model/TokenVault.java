package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TokenVault
 */
public class TokenVault {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_vault_id")

    private String tokenVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_configuration")

    private KmsConfiguration kmsConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public TokenVault withTokenVaultId(String tokenVaultId) {
        this.tokenVaultId = tokenVaultId;
        return this;
    }

    /**
     * The unique identifier of the token vault.
     * @return tokenVaultId
     */
    public String getTokenVaultId() {
        return tokenVaultId;
    }

    public void setTokenVaultId(String tokenVaultId) {
        this.tokenVaultId = tokenVaultId;
    }

    public TokenVault withKmsConfiguration(KmsConfiguration kmsConfiguration) {
        this.kmsConfiguration = kmsConfiguration;
        return this;
    }

    public TokenVault withKmsConfiguration(Consumer<KmsConfiguration> kmsConfigurationSetter) {
        if (this.kmsConfiguration == null) {
            this.kmsConfiguration = new KmsConfiguration();
            kmsConfigurationSetter.accept(this.kmsConfiguration);
        }

        return this;
    }

    /**
     * Get kmsConfiguration
     * @return kmsConfiguration
     */
    public KmsConfiguration getKmsConfiguration() {
        return kmsConfiguration;
    }

    public void setKmsConfiguration(KmsConfiguration kmsConfiguration) {
        this.kmsConfiguration = kmsConfiguration;
    }

    public TokenVault withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TokenVault withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public TokenVault addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TokenVault withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 自定义标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TokenVault that = (TokenVault) obj;
        return Objects.equals(this.tokenVaultId, that.tokenVaultId)
            && Objects.equals(this.kmsConfiguration, that.kmsConfiguration)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenVaultId, kmsConfiguration, updatedAt, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenVault {\n");
        sb.append("    tokenVaultId: ").append(toIndentedString(tokenVaultId)).append("\n");
        sb.append("    kmsConfiguration: ").append(toIndentedString(kmsConfiguration)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
