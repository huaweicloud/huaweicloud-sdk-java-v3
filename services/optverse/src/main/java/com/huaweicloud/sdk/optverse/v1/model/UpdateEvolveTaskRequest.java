package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEvolveTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evolve_task_id")

    private String evolveTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EvolveTaskCreateReq body;

    public UpdateEvolveTaskRequest withEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
        return this;
    }

    /**
     * **参数解释**： 演化任务标识符。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return evolveTaskId
     */
    public String getEvolveTaskId() {
        return evolveTaskId;
    }

    public void setEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
    }

    public UpdateEvolveTaskRequest withBody(EvolveTaskCreateReq body) {
        this.body = body;
        return this;
    }

    public UpdateEvolveTaskRequest withBody(Consumer<EvolveTaskCreateReq> bodySetter) {
        if (this.body == null) {
            this.body = new EvolveTaskCreateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EvolveTaskCreateReq getBody() {
        return body;
    }

    public void setBody(EvolveTaskCreateReq body) {
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
        UpdateEvolveTaskRequest that = (UpdateEvolveTaskRequest) obj;
        return Objects.equals(this.evolveTaskId, that.evolveTaskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evolveTaskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEvolveTaskRequest {\n");
        sb.append("    evolveTaskId: ").append(toIndentedString(evolveTaskId)).append("\n");
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
