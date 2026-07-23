package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  运行时入站认证配置请求Body体。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunIdentityCreateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private CoreRunAuthorizerType authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_configuration")

    private CoreRunAuthorizerConfiguration authorizerConfiguration;

    public CoreRunIdentityCreateReqBody withAuthorizerType(CoreRunAuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * Get authorizerType
     * @return authorizerType
     */
    public CoreRunAuthorizerType getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(CoreRunAuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
    }

    public CoreRunIdentityCreateReqBody withAuthorizerConfiguration(
        CoreRunAuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
        return this;
    }

    public CoreRunIdentityCreateReqBody withAuthorizerConfiguration(
        Consumer<CoreRunAuthorizerConfiguration> authorizerConfigurationSetter) {
        if (this.authorizerConfiguration == null) {
            this.authorizerConfiguration = new CoreRunAuthorizerConfiguration();
            authorizerConfigurationSetter.accept(this.authorizerConfiguration);
        }

        return this;
    }

    /**
     * Get authorizerConfiguration
     * @return authorizerConfiguration
     */
    public CoreRunAuthorizerConfiguration getAuthorizerConfiguration() {
        return authorizerConfiguration;
    }

    public void setAuthorizerConfiguration(CoreRunAuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunIdentityCreateReqBody that = (CoreRunIdentityCreateReqBody) obj;
        return Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.authorizerConfiguration, that.authorizerConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizerType, authorizerConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunIdentityCreateReqBody {\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    authorizerConfiguration: ").append(toIndentedString(authorizerConfiguration)).append("\n");
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
