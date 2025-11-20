package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckTaskStatus
 */
public class CheckTaskStatus {

    /**
     * **参数解释：** 插件检查状态 **取值范围：** - Init: 插件检查状态，初始化 - Running: 插件检查状态，检查中 - Failed: 插件检查状态，检查完成有风险 - Success: 插件检查状态，检查完成无风险  
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "Init"
         */
        public static final StatusEnum INIT = new StatusEnum("Init");

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        /**
         * Enum SUCCESS for value: "Success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("Success");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Init", INIT);
            map.put("Running", RUNNING);
            map.put("Failed", FAILED);
            map.put("Success", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "riskList")

    private List<CheckTaskRisk> riskList = null;

    public CheckTaskStatus withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 插件检查状态 **取值范围：** - Init: 插件检查状态，初始化 - Running: 插件检查状态，检查中 - Failed: 插件检查状态，检查完成有风险 - Success: 插件检查状态，检查完成无风险  
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CheckTaskStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 插件检查结果信息 **取值范围：** 不涉及 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CheckTaskStatus withRiskList(List<CheckTaskRisk> riskList) {
        this.riskList = riskList;
        return this;
    }

    public CheckTaskStatus addRiskListItem(CheckTaskRisk riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public CheckTaskStatus withRiskList(Consumer<List<CheckTaskRisk>> riskListSetter) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        riskListSetter.accept(this.riskList);
        return this;
    }

    /**
     * **参数解释：** 插件检查风险项列表，不同插件对应的风险检查项不同。 **约束限制：** 不涉及 
     * @return riskList
     */
    public List<CheckTaskRisk> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<CheckTaskRisk> riskList) {
        this.riskList = riskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTaskStatus that = (CheckTaskStatus) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.riskList, that.riskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, riskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTaskStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
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
