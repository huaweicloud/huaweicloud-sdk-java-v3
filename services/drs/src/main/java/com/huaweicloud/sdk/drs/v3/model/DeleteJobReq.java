package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 删除在线迁移任务请求体。
 */
public class DeleteJobReq {

    /**
     * **参数解释**：  批量结束或删除任务的操作类型，指定对任务执行结束还是删除操作。  **约束限制**：  包年/包月任务需要先手动退订，然后delete_type参数设置为delete调用该接口删除任务。  **取值范围**：  - terminate：结束任务 - force_terminate：强制结束任务 - delete：删除任务 - roll_back_upgrade_active_standby：转主备任务回滚  **默认取值**：  不涉及
     */
    public static final class DeleteTypeEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final DeleteTypeEnum TERMINATE = new DeleteTypeEnum("terminate");

        /**
         * Enum FORCE_TERMINATE for value: "force_terminate"
         */
        public static final DeleteTypeEnum FORCE_TERMINATE = new DeleteTypeEnum("force_terminate");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final DeleteTypeEnum DELETE = new DeleteTypeEnum("delete");

        /**
         * Enum ROLL_BACK_UPGRADE_ACTIVE_STANDBY for value: "roll_back_upgrade_active_standby"
         */
        public static final DeleteTypeEnum ROLL_BACK_UPGRADE_ACTIVE_STANDBY =
            new DeleteTypeEnum("roll_back_upgrade_active_standby");

        private static final Map<String, DeleteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteTypeEnum> createStaticFields() {
            Map<String, DeleteTypeEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("force_terminate", FORCE_TERMINATE);
            map.put("delete", DELETE);
            map.put("roll_back_upgrade_active_standby", ROLL_BACK_UPGRADE_ACTIVE_STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteTypeEnum(String value) {
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
        public static DeleteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteTypeEnum(value));
        }

        public static DeleteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteTypeEnum) {
                return this.value.equals(((DeleteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_type")

    private DeleteTypeEnum deleteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_breakpoint_position")

    private Boolean isShowBreakpointPosition;

    public DeleteJobReq withDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
        return this;
    }

    /**
     * **参数解释**：  批量结束或删除任务的操作类型，指定对任务执行结束还是删除操作。  **约束限制**：  包年/包月任务需要先手动退订，然后delete_type参数设置为delete调用该接口删除任务。  **取值范围**：  - terminate：结束任务 - force_terminate：强制结束任务 - delete：删除任务 - roll_back_upgrade_active_standby：转主备任务回滚  **默认取值**：  不涉及
     * @return deleteType
     */
    public DeleteTypeEnum getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
    }

    public DeleteJobReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  任务ID，用于唯一标识需要结束或删除的数据复制任务。  **约束限制**：  不涉及。  **取值范围**：  UUID格式字符串。  **默认取值**：  不涉及
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DeleteJobReq withIsShowBreakpointPosition(Boolean isShowBreakpointPosition) {
        this.isShowBreakpointPosition = isShowBreakpointPosition;
        return this;
    }

    /**
     * **参数解释**：  MySQL为源的数据复制任务，结束任务时是否展示断点信息。  **约束限制**：  仅MySQL为源的实时迁移、实时同步、实时灾备任务适用。  **取值范围**：  - true：展示断点信息 - false：不展示断点信息  **默认取值**：  不涉及
     * @return isShowBreakpointPosition
     */
    public Boolean getIsShowBreakpointPosition() {
        return isShowBreakpointPosition;
    }

    public void setIsShowBreakpointPosition(Boolean isShowBreakpointPosition) {
        this.isShowBreakpointPosition = isShowBreakpointPosition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteJobReq that = (DeleteJobReq) obj;
        return Objects.equals(this.deleteType, that.deleteType) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.isShowBreakpointPosition, that.isShowBreakpointPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteType, jobId, isShowBreakpointPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteJobReq {\n");
        sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isShowBreakpointPosition: ").append(toIndentedString(isShowBreakpointPosition)).append("\n");
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
