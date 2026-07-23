package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCoreSpaceNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_access_enable")

    private Boolean publicAccessEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_access_config")

    private CoreSpacePrivateNetworkRequestBody privateAccessConfig;

    public UpdateCoreSpaceNetworkResponse withPublicAccessEnable(Boolean publicAccessEnable) {
        this.publicAccessEnable = publicAccessEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启公网访问。 **约束限制：** 不涉及。 **取值范围：** - true: 开启公网访问 - false: 关闭公网访问 **默认取值：** false 
     * @return publicAccessEnable
     */
    public Boolean getPublicAccessEnable() {
        return publicAccessEnable;
    }

    public void setPublicAccessEnable(Boolean publicAccessEnable) {
        this.publicAccessEnable = publicAccessEnable;
    }

    public UpdateCoreSpaceNetworkResponse withPrivateAccessConfig(
        CoreSpacePrivateNetworkRequestBody privateAccessConfig) {
        this.privateAccessConfig = privateAccessConfig;
        return this;
    }

    public UpdateCoreSpaceNetworkResponse withPrivateAccessConfig(
        Consumer<CoreSpacePrivateNetworkRequestBody> privateAccessConfigSetter) {
        if (this.privateAccessConfig == null) {
            this.privateAccessConfig = new CoreSpacePrivateNetworkRequestBody();
            privateAccessConfigSetter.accept(this.privateAccessConfig);
        }

        return this;
    }

    /**
     * Get privateAccessConfig
     * @return privateAccessConfig
     */
    public CoreSpacePrivateNetworkRequestBody getPrivateAccessConfig() {
        return privateAccessConfig;
    }

    public void setPrivateAccessConfig(CoreSpacePrivateNetworkRequestBody privateAccessConfig) {
        this.privateAccessConfig = privateAccessConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreSpaceNetworkResponse that = (UpdateCoreSpaceNetworkResponse) obj;
        return Objects.equals(this.publicAccessEnable, that.publicAccessEnable)
            && Objects.equals(this.privateAccessConfig, that.privateAccessConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicAccessEnable, privateAccessConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreSpaceNetworkResponse {\n");
        sb.append("    publicAccessEnable: ").append(toIndentedString(publicAccessEnable)).append("\n");
        sb.append("    privateAccessConfig: ").append(toIndentedString(privateAccessConfig)).append("\n");
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
