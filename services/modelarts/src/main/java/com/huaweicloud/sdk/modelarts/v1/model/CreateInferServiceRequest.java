package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateInferServiceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token-Provider")

    private String xAuthTokenProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ServiceCreateRequest body;

    public CreateInferServiceRequest withXAuthTokenProvider(String xAuthTokenProvider) {
        this.xAuthTokenProvider = xAuthTokenProvider;
        return this;
    }

    /**
     * **参数解释：** 服务提供者的domain级或project级Token，创建服务携带该请求头时，系统将解析该token并将账号id保存为服务的提供者即provider，该服务将被系统保护，仅携带该提供者的domain级或project级Token的更新操作允许执行。[通过调用IAM服务获取用户Token接口获取响应消息头中X-Subject-Token的值。](tag:hws,hws_hk)获取方法请参见[[获取IAM用户Token（使用密码）](modelarts_03_0004.xml)](tag:hws,hws_hk)[[获取Token](modelarts_03_0015.xml)](tag:hcs,hcs_sm)。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return xAuthTokenProvider
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token-Provider")
    public String getXAuthTokenProvider() {
        return xAuthTokenProvider;
    }

    public void setXAuthTokenProvider(String xAuthTokenProvider) {
        this.xAuthTokenProvider = xAuthTokenProvider;
    }

    public CreateInferServiceRequest withBody(ServiceCreateRequest body) {
        this.body = body;
        return this;
    }

    public CreateInferServiceRequest withBody(Consumer<ServiceCreateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new ServiceCreateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ServiceCreateRequest getBody() {
        return body;
    }

    public void setBody(ServiceCreateRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInferServiceRequest that = (CreateInferServiceRequest) obj;
        return Objects.equals(this.xAuthTokenProvider, that.xAuthTokenProvider) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAuthTokenProvider, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInferServiceRequest {\n");
        sb.append("    xAuthTokenProvider: ").append(toIndentedString(xAuthTokenProvider)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
