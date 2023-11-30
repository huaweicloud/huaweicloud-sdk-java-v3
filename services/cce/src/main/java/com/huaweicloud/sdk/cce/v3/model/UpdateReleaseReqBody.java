package com.huaweicloud.sdk.cce.v3.model;

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
 * 更新模板实例的请求体
 */
public class UpdateReleaseReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_id")

    private String chartId;

    /**
     * 更新操作，升级为upgrade，回退为rollback
     */
    public static final class ActionEnum {

        /**
         * Enum UPGRADE for value: "upgrade"
         */
        public static final ActionEnum UPGRADE = new ActionEnum("upgrade");

        /**
         * Enum ROLLBACK for value: "rollback"
         */
        public static final ActionEnum ROLLBACK = new ActionEnum("rollback");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("upgrade", UPGRADE);
            map.put("rollback", ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ReleaseReqBodyParams parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private CreateReleaseReqBodyValues values;

    public UpdateReleaseReqBody withChartId(String chartId) {
        this.chartId = chartId;
        return this;
    }

    /**
     * 模板ID
     * @return chartId
     */
    public String getChartId() {
        return chartId;
    }

    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    public UpdateReleaseReqBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 更新操作，升级为upgrade，回退为rollback
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public UpdateReleaseReqBody withParameters(ReleaseReqBodyParams parameters) {
        this.parameters = parameters;
        return this;
    }

    public UpdateReleaseReqBody withParameters(Consumer<ReleaseReqBodyParams> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ReleaseReqBodyParams();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ReleaseReqBodyParams getParameters() {
        return parameters;
    }

    public void setParameters(ReleaseReqBodyParams parameters) {
        this.parameters = parameters;
    }

    public UpdateReleaseReqBody withValues(CreateReleaseReqBodyValues values) {
        this.values = values;
        return this;
    }

    public UpdateReleaseReqBody withValues(Consumer<CreateReleaseReqBodyValues> valuesSetter) {
        if (this.values == null) {
            this.values = new CreateReleaseReqBodyValues();
            valuesSetter.accept(this.values);
        }

        return this;
    }

    /**
     * Get values
     * @return values
     */
    public CreateReleaseReqBodyValues getValues() {
        return values;
    }

    public void setValues(CreateReleaseReqBodyValues values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateReleaseReqBody that = (UpdateReleaseReqBody) obj;
        return Objects.equals(this.chartId, that.chartId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartId, action, parameters, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReleaseReqBody {\n");
        sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
