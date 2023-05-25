package com.huaweicloud.sdk.aos.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StackStatusPrimitiveTypeHolder
 */
public class StackStatusPrimitiveTypeHolder  {

    /**
     * 资源栈的状态    * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署    * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待    * `DEPLOYMENT_FAILED` - 部署失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情    * `DEPLOYMENT_COMPLETE` - 部署完成    * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待    * `ROLLBACK_FAILED` - 回滚失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情    * `ROLLBACK_COMPLETE` - 回滚完成    * `DELETION_IN_PROGRESS` - 正在删除，请等待    * `DELETION_FAILED` - 删除失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情
     */
    public static final class StatusEnum {

        
        /**
         * Enum CREATION_COMPLETE for value: "CREATION_COMPLETE"
         */
        public static final StatusEnum CREATION_COMPLETE = new StatusEnum("CREATION_COMPLETE");
        
        /**
         * Enum DEPLOYMENT_IN_PROGRESS for value: "DEPLOYMENT_IN_PROGRESS"
         */
        public static final StatusEnum DEPLOYMENT_IN_PROGRESS = new StatusEnum("DEPLOYMENT_IN_PROGRESS");
        
        /**
         * Enum DEPLOYMENT_FAILED for value: "DEPLOYMENT_FAILED"
         */
        public static final StatusEnum DEPLOYMENT_FAILED = new StatusEnum("DEPLOYMENT_FAILED");
        
        /**
         * Enum DEPLOYMENT_COMPLETE for value: "DEPLOYMENT_COMPLETE"
         */
        public static final StatusEnum DEPLOYMENT_COMPLETE = new StatusEnum("DEPLOYMENT_COMPLETE");
        
        /**
         * Enum ROLLBACK_IN_PROGRESS for value: "ROLLBACK_IN_PROGRESS"
         */
        public static final StatusEnum ROLLBACK_IN_PROGRESS = new StatusEnum("ROLLBACK_IN_PROGRESS");
        
        /**
         * Enum ROLLBACK_FAILED for value: "ROLLBACK_FAILED"
         */
        public static final StatusEnum ROLLBACK_FAILED = new StatusEnum("ROLLBACK_FAILED");
        
        /**
         * Enum ROLLBACK_COMPLETE for value: "ROLLBACK_COMPLETE"
         */
        public static final StatusEnum ROLLBACK_COMPLETE = new StatusEnum("ROLLBACK_COMPLETE");
        
        /**
         * Enum DELETION_IN_PROGRESS for value: "DELETION_IN_PROGRESS"
         */
        public static final StatusEnum DELETION_IN_PROGRESS = new StatusEnum("DELETION_IN_PROGRESS");
        
        /**
         * Enum DELETION_FAILED for value: "DELETION_FAILED"
         */
        public static final StatusEnum DELETION_FAILED = new StatusEnum("DELETION_FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATION_COMPLETE", CREATION_COMPLETE);
            map.put("DEPLOYMENT_IN_PROGRESS", DEPLOYMENT_IN_PROGRESS);
            map.put("DEPLOYMENT_FAILED", DEPLOYMENT_FAILED);
            map.put("DEPLOYMENT_COMPLETE", DEPLOYMENT_COMPLETE);
            map.put("ROLLBACK_IN_PROGRESS", ROLLBACK_IN_PROGRESS);
            map.put("ROLLBACK_FAILED", ROLLBACK_FAILED);
            map.put("ROLLBACK_COMPLETE", ROLLBACK_COMPLETE);
            map.put("DELETION_IN_PROGRESS", DELETION_IN_PROGRESS);
            map.put("DELETION_FAILED", DELETION_FAILED);
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="status")
    

    private StatusEnum status;

    public StackStatusPrimitiveTypeHolder withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源栈的状态    * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署    * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待    * `DEPLOYMENT_FAILED` - 部署失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情    * `DEPLOYMENT_COMPLETE` - 部署完成    * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待    * `ROLLBACK_FAILED` - 回滚失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情    * `ROLLBACK_COMPLETE` - 回滚完成    * `DELETION_IN_PROGRESS` - 正在删除，请等待    * `DELETION_FAILED` - 删除失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StackStatusPrimitiveTypeHolder stackStatusPrimitiveTypeHolder = (StackStatusPrimitiveTypeHolder) o;
        return Objects.equals(this.status, stackStatusPrimitiveTypeHolder.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackStatusPrimitiveTypeHolder {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

