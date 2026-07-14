package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInferIntranetConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateIntranetConnectionRequestBody body;

    public UpdateInferIntranetConnectionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 内网接入id。id可以根据[查询当前租户的内网接入申请列表](ListInferIntranetConnectionApplications.xml)返回body的id字段得到。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInferIntranetConnectionRequest withBody(UpdateIntranetConnectionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInferIntranetConnectionRequest withBody(Consumer<UpdateIntranetConnectionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateIntranetConnectionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateIntranetConnectionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateIntranetConnectionRequestBody body) {
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
        UpdateInferIntranetConnectionRequest that = (UpdateInferIntranetConnectionRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInferIntranetConnectionRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
