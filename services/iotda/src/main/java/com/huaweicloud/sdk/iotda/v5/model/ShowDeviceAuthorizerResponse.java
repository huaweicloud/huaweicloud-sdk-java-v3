package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeviceAuthorizerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_id")

    private String authorizerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_name")

    private String authorizerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_enable")

    private Boolean signingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_token")

    private String signingToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_public_key")

    private String signingPublicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_authorizer")

    private Boolean defaultAuthorizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_enable")

    private Boolean cacheEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowDeviceAuthorizerResponse withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * **参数说明**：自定义鉴权ID。
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    public ShowDeviceAuthorizerResponse withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * **参数说明**：自定义鉴权器名称，同一租户下的自定义鉴权器名称不能重复。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return authorizerName
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    public ShowDeviceAuthorizerResponse withFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    /**
     * **参数说明**：函数名称。
     * @return funcName
     */
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public ShowDeviceAuthorizerResponse withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /**
     * **参数说明**：函数的URN（Uniform Resource Name），唯一标识函数，即自定义鉴权器对应的处理函数地址。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public ShowDeviceAuthorizerResponse withSigningEnable(Boolean signingEnable) {
        this.signingEnable = signingEnable;
        return this;
    }

    /**
     * **参数说明**：是否启动签名校验，启动签名校验后不满足签名要求的鉴权信息将被拒绝，以减少无效的函数调用。推荐用户进行安全的签名校验，默认开启。
     * @return signingEnable
     */
    public Boolean getSigningEnable() {
        return signingEnable;
    }

    public void setSigningEnable(Boolean signingEnable) {
        this.signingEnable = signingEnable;
    }

    public ShowDeviceAuthorizerResponse withSigningToken(String signingToken) {
        this.signingToken = signingToken;
        return this;
    }

    /**
     * **参数说明**：签名校验的Key值，开启签名校验时使用。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return signingToken
     */
    public String getSigningToken() {
        return signingToken;
    }

    public void setSigningToken(String signingToken) {
        this.signingToken = signingToken;
    }

    public ShowDeviceAuthorizerResponse withSigningPublicKey(String signingPublicKey) {
        this.signingPublicKey = signingPublicKey;
        return this;
    }

    /**
     * **参数说明**：签名校验的公钥，开启签名校验时使用。用于认证设备携带的签名信息是否正确。
     * @return signingPublicKey
     */
    public String getSigningPublicKey() {
        return signingPublicKey;
    }

    public void setSigningPublicKey(String signingPublicKey) {
        this.signingPublicKey = signingPublicKey;
    }

    public ShowDeviceAuthorizerResponse withDefaultAuthorizer(Boolean defaultAuthorizer) {
        this.defaultAuthorizer = defaultAuthorizer;
        return this;
    }

    /**
     * **参数说明**：是否为默认的鉴权方式，默认为false。
     * @return defaultAuthorizer
     */
    public Boolean getDefaultAuthorizer() {
        return defaultAuthorizer;
    }

    public void setDefaultAuthorizer(Boolean defaultAuthorizer) {
        this.defaultAuthorizer = defaultAuthorizer;
    }

    public ShowDeviceAuthorizerResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：是否激活该鉴权方式 - ACTIVE：该鉴权为激活状态。 - INACTIVE：该鉴权为停用状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDeviceAuthorizerResponse withCacheEnable(Boolean cacheEnable) {
        this.cacheEnable = cacheEnable;
        return this;
    }

    /**
     * **参数说明**：是否开启缓存，默认为false，设备为true时，当设备入参（username，clientId，password，以及证书信息，函数urn）不变时，当缓存结果存在时，将直接使用缓存结果，建议在调试时设置为false，生产时设置为true，避免频繁调用函数。
     * @return cacheEnable
     */
    public Boolean getCacheEnable() {
        return cacheEnable;
    }

    public void setCacheEnable(Boolean cacheEnable) {
        this.cacheEnable = cacheEnable;
    }

    public ShowDeviceAuthorizerResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台进行自定义鉴权相关操作的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowDeviceAuthorizerResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 在物联网平台更新自定义鉴权相关操作的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeviceAuthorizerResponse that = (ShowDeviceAuthorizerResponse) obj;
        return Objects.equals(this.authorizerId, that.authorizerId)
            && Objects.equals(this.authorizerName, that.authorizerName) && Objects.equals(this.funcName, that.funcName)
            && Objects.equals(this.funcUrn, that.funcUrn) && Objects.equals(this.signingEnable, that.signingEnable)
            && Objects.equals(this.signingToken, that.signingToken)
            && Objects.equals(this.signingPublicKey, that.signingPublicKey)
            && Objects.equals(this.defaultAuthorizer, that.defaultAuthorizer)
            && Objects.equals(this.status, that.status) && Objects.equals(this.cacheEnable, that.cacheEnable)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizerId,
            authorizerName,
            funcName,
            funcUrn,
            signingEnable,
            signingToken,
            signingPublicKey,
            defaultAuthorizer,
            status,
            cacheEnable,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceAuthorizerResponse {\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    authorizerName: ").append(toIndentedString(authorizerName)).append("\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    signingEnable: ").append(toIndentedString(signingEnable)).append("\n");
        sb.append("    signingToken: ").append(toIndentedString(signingToken)).append("\n");
        sb.append("    signingPublicKey: ").append(toIndentedString(signingPublicKey)).append("\n");
        sb.append("    defaultAuthorizer: ").append(toIndentedString(defaultAuthorizer)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cacheEnable: ").append(toIndentedString(cacheEnable)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
