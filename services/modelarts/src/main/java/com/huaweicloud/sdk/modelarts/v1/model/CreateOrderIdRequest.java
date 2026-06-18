package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOrderIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actionType")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaceId")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateOrderRequestBody body;

    public CreateOrderIdRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：资源池ID。 **约束限制**：不涉及。  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOrderIdRequest withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**：订单操作类型。 **约束限制**：不涉及。  **取值范围**：可选值如下： - toPeriod：按需转包周期，默认值 **默认取值**：不涉及。
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public CreateOrderIdRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID，默认是0。 **约束限制**：不涉及。  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateOrderIdRequest withBody(CreateOrderRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateOrderIdRequest withBody(Consumer<CreateOrderRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateOrderRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateOrderRequestBody getBody() {
        return body;
    }

    public void setBody(CreateOrderRequestBody body) {
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
        CreateOrderIdRequest that = (CreateOrderIdRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actionType, workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrderIdRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
