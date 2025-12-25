package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRetryPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Secmaster-Version")

    private String xSecmasterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * 操作类型：create创建，retry重试
     */
    public static final class ActionTypeEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionTypeEnum CREATE = new ActionTypeEnum("create");

        /**
         * Enum RETRY for value: "retry"
         */
        public static final ActionTypeEnum RETRY = new ActionTypeEnum("retry");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put("retry", RETRY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateRetryPolicyRequestBody body;

    public CreateRetryPolicyRequest withXSecmasterVersion(String xSecmasterVersion) {
        this.xSecmasterVersion = xSecmasterVersion;
        return this;
    }

    /**
     * 服务版本，例如25.5.0
     * @return xSecmasterVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Secmaster-Version")
    public String getXSecmasterVersion() {
        return xSecmasterVersion;
    }

    public void setXSecmasterVersion(String xSecmasterVersion) {
        this.xSecmasterVersion = xSecmasterVersion;
    }

    public CreateRetryPolicyRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateRetryPolicyRequest withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 操作类型：create创建，retry重试
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public CreateRetryPolicyRequest withBody(CreateRetryPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateRetryPolicyRequest withBody(Consumer<CreateRetryPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateRetryPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateRetryPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(CreateRetryPolicyRequestBody body) {
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
        CreateRetryPolicyRequest that = (CreateRetryPolicyRequest) obj;
        return Objects.equals(this.xSecmasterVersion, that.xSecmasterVersion)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecmasterVersion, workspaceId, actionType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetryPolicyRequest {\n");
        sb.append("    xSecmasterVersion: ").append(toIndentedString(xSecmasterVersion)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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
