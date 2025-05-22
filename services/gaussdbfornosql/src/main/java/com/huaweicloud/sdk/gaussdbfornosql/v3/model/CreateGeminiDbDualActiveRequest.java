package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateGeminiDbDualActiveRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DualActiveRequestBody body;

    public CreateGeminiDbDualActiveRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 参数解释 实例Id，可以调用[5.3.3查询实例列表和详情](x-wc://file=zh-cn_topic_0000001397299481.xml)接口获取。如果未申请实例，可以调用[5.3.1创建实例](x-wc://file=zh-cn_topic_0000001397139461.xml)接口创建。 约束限制 不涉及。 取值范围 不涉及。 默认取值 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateGeminiDbDualActiveRequest withBody(DualActiveRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateGeminiDbDualActiveRequest withBody(Consumer<DualActiveRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DualActiveRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DualActiveRequestBody getBody() {
        return body;
    }

    public void setBody(DualActiveRequestBody body) {
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
        CreateGeminiDbDualActiveRequest that = (CreateGeminiDbDualActiveRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGeminiDbDualActiveRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
