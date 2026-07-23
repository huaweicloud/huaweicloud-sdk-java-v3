package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时自定义JWT类型认证配置。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunCustomJWTAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discovery_url")

    private String discoveryUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_audience")

    private List<String> allowedAudience = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_clients")

    private List<String> allowedClients = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_scopes")

    private List<String> allowedScopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_claims")

    private List<CoreRunCustomClaimValidation> customClaims = null;

    public CoreRunCustomJWTAuthorizerConfiguration withDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    /**
     * **参数解释**：  此 URL 用于获取 OpenID Connect 配置或授权服务器元数据，以验证传入的令牌。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 2048 个字符。 **默认取值**: 不涉及。
     * @return discoveryUrl
     */
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public void setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration addAllowedAudienceItem(String allowedAudienceItem) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        this.allowedAudience.add(allowedAudienceItem);
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedAudience(Consumer<List<String>> allowedAudienceSetter) {
        if (this.allowedAudience == null) {
            this.allowedAudience = new ArrayList<>();
        }
        allowedAudienceSetter.accept(this.allowedAudience);
        return this;
    }

    /**
     * **参数解释**：  允许对入站 JWT 进行验证的受众值列表。 **约束限制**: 不涉及。 **取值范围**： 元素个数0 - 10，每个受众值元素的长度为1-512个字符。 **默认取值**: 不涉及。
     * @return allowedAudience
     */
    public List<String> getAllowedAudience() {
        return allowedAudience;
    }

    public void setAllowedAudience(List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration addAllowedClientsItem(String allowedClientsItem) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        this.allowedClients.add(allowedClientsItem);
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedClients(Consumer<List<String>> allowedClientsSetter) {
        if (this.allowedClients == null) {
            this.allowedClients = new ArrayList<>();
        }
        allowedClientsSetter.accept(this.allowedClients);
        return this;
    }

    /**
     * **参数解释**：  允许用于入站 JWT 验证的客户端标识符值列表。 **约束限制**: 不涉及。 **取值范围**： 元素个数0 - 50，每个客户端值的长度为 1 - 256 个字符。 **默认取值**: 不涉及。
     * @return allowedClients
     */
    public List<String> getAllowedClients() {
        return allowedClients;
    }

    public void setAllowedClients(List<String> allowedClients) {
        this.allowedClients = allowedClients;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration addAllowedScopesItem(String allowedScopesItem) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        this.allowedScopes.add(allowedScopesItem);
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withAllowedScopes(Consumer<List<String>> allowedScopesSetter) {
        if (this.allowedScopes == null) {
            this.allowedScopes = new ArrayList<>();
        }
        allowedScopesSetter.accept(this.allowedScopes);
        return this;
    }

    /**
     * **参数解释**：  允许对入站 JWT 进行验证的范围值列表。 **约束限制**: 不涉及。 **取值范围**： 元素个数0 - 50，每个范围值的长度为 1 - 256 个字符。 **默认取值**: 不涉及。
     * @return allowedScopes
     */
    public List<String> getAllowedScopes() {
        return allowedScopes;
    }

    public void setAllowedScopes(List<String> allowedScopes) {
        this.allowedScopes = allowedScopes;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withCustomClaims(List<CoreRunCustomClaimValidation> customClaims) {
        this.customClaims = customClaims;
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration addCustomClaimsItem(CoreRunCustomClaimValidation customClaimsItem) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        this.customClaims.add(customClaimsItem);
        return this;
    }

    public CoreRunCustomJWTAuthorizerConfiguration withCustomClaims(
        Consumer<List<CoreRunCustomClaimValidation>> customClaimsSetter) {
        if (this.customClaims == null) {
            this.customClaims = new ArrayList<>();
        }
        customClaimsSetter.accept(this.customClaims);
        return this;
    }

    /**
     * **参数解释**：  对入站 JWT 应用自定义声明验证规则。 **约束限制**: 不涉及。 **取值范围**： 最小数量 1，最大数量 20。 **默认取值**: 不涉及。
     * @return customClaims
     */
    public List<CoreRunCustomClaimValidation> getCustomClaims() {
        return customClaims;
    }

    public void setCustomClaims(List<CoreRunCustomClaimValidation> customClaims) {
        this.customClaims = customClaims;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunCustomJWTAuthorizerConfiguration that = (CoreRunCustomJWTAuthorizerConfiguration) obj;
        return Objects.equals(this.discoveryUrl, that.discoveryUrl)
            && Objects.equals(this.allowedAudience, that.allowedAudience)
            && Objects.equals(this.allowedClients, that.allowedClients)
            && Objects.equals(this.allowedScopes, that.allowedScopes)
            && Objects.equals(this.customClaims, that.customClaims);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discoveryUrl, allowedAudience, allowedClients, allowedScopes, customClaims);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunCustomJWTAuthorizerConfiguration {\n");
        sb.append("    discoveryUrl: ").append(toIndentedString(discoveryUrl)).append("\n");
        sb.append("    allowedAudience: ").append(toIndentedString(allowedAudience)).append("\n");
        sb.append("    allowedClients: ").append(toIndentedString(allowedClients)).append("\n");
        sb.append("    allowedScopes: ").append(toIndentedString(allowedScopes)).append("\n");
        sb.append("    customClaims: ").append(toIndentedString(customClaims)).append("\n");
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
