package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateGatewayResponseV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responses")

    private Map<String, ResponseInfoResp> responses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public CreateGatewayResponseV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 响应名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateGatewayResponseV2Response withResponses(Map<String, ResponseInfoResp> responses) {
        this.responses = responses;
        return this;
    }

    public CreateGatewayResponseV2Response putResponsesItem(String key, ResponseInfoResp responsesItem) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        this.responses.put(key, responsesItem);
        return this;
    }

    public CreateGatewayResponseV2Response withResponses(Consumer<Map<String, ResponseInfoResp>> responsesSetter) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 错误类型的响应定义，其中key为错误类型。key的枚举值为： - AUTH_FAILURE：认证失败 - AUTH_HEADER_MISSING：认证身份来源缺失 - AUTHORIZER_FAILURE：自定义认证失败 - AUTHORIZER_CONF_FAILURE：自定义认证配置错误 - AUTHORIZER_IDENTITIES_FAILURE：自定义认证身份来源错误 - BACKEND_UNAVAILABLE：后端不可用 - BACKEND_TIMEOUT：后端超时 - THROTTLED：调用次数超出阈值 - UNAUTHORIZED：应用未授权 - ACCESS_DENIED：拒绝访问 - NOT_FOUND：未找到匹配的API - REQUEST_PARAMETERS_FAILURE：请求参数错误 - DEFAULT_4XX：默认4XX - DEFAULT_5XX：默认5XX - THIRD_AUTH_FAILURE: 第三方认证失败 - THIRD_AUTH_IDENTITIES_FAILURE: 第三方认证身份来源错误 - THIRD_AUTH_CONF_FAILURE: 第三方认证配置错误 - OIDC_AUTH_TOKEN_VERIFY_FAIL: When the token verification mode is used for OIDC authentication, the token verification fails. - OIDC_AUTH_GET_DISCOVERY_ERROR: During OIDC authentication, the IDP service is unavailable or the network is unreachable. As a result, information cannot be obtained from the configured discovery. - OIDC_AUTH_CODE_FLOW_FAIL: When a browser is used for OIDC authentication, the authorization code processing fails. - JWT_AUTH_FAILURE: The JWT authentication plug-in fails to verify the token. - ORCHESTRATION_PARAMETER_NOT_FOUND: 没有入参进行参数编排规则匹配，参数编排失败 - ORCHESTRATION_FAILURE: 有入参进行参数编排规则匹配，但是匹配不上编排规则，参数编排失败  每项错误类型均为一个JSON体
     * @return responses
     */
    public Map<String, ResponseInfoResp> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, ResponseInfoResp> responses) {
        this.responses = responses;
    }

    public CreateGatewayResponseV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 响应ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateGatewayResponseV2Response withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为分组默认响应
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public CreateGatewayResponseV2Response withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateGatewayResponseV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
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
        CreateGatewayResponseV2Response that = (CreateGatewayResponseV2Response) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.responses, that.responses)
            && Objects.equals(this.id, that.id) && Objects.equals(this._default, that._default)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, responses, id, _default, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGatewayResponseV2Response {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
