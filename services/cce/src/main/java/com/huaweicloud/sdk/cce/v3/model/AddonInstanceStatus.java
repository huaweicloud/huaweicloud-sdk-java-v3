package com.huaweicloud.sdk.cce.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Versions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 插件状态信息
 */
public class AddonInstanceStatus  {

    /**
     * 插件实例状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum INSTALLING for value: "installing"
         */
        public static final StatusEnum INSTALLING = new StatusEnum("installing");
        
        /**
         * Enum UPGRADING for value: "upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("upgrading");
        
        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");
        
        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("installing", INSTALLING);
            map.put("upgrading", UPGRADING);
            map.put("failed", FAILED);
            map.put("running", RUNNING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
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
            if (obj != null && obj instanceof StatusEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Reason")
    
    private String reason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="targetVersions")
    
    private List<String> targetVersions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currentVersion")
    
    private Versions currentVersion;

    public AddonInstanceStatus withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 插件实例状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public AddonInstanceStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    


    /**
     * 插件安装失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    

    public AddonInstanceStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 安装错误详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public AddonInstanceStatus withTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
        return this;
    }

    
    public AddonInstanceStatus addTargetVersionsItem(String targetVersionsItem) {
        if(this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        this.targetVersions.add(targetVersionsItem);
        return this;
    }

    public AddonInstanceStatus withTargetVersions(Consumer<List<String>> targetVersionsSetter) {
        if(this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        targetVersionsSetter.accept(this.targetVersions);
        return this;
    }

    /**
     * 此插件版本，支持升级的集群版本
     * @return targetVersions
     */
    public List<String> getTargetVersions() {
        return targetVersions;
    }

    public void setTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
    }

    

    public AddonInstanceStatus withCurrentVersion(Versions currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public AddonInstanceStatus withCurrentVersion(Consumer<Versions> currentVersionSetter) {
        if(this.currentVersion == null ){
            this.currentVersion = new Versions();
            currentVersionSetter.accept(this.currentVersion);
        }
        
        return this;
    }


    /**
     * Get currentVersion
     * @return currentVersion
     */
    public Versions getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Versions currentVersion) {
        this.currentVersion = currentVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonInstanceStatus addonInstanceStatus = (AddonInstanceStatus) o;
        return Objects.equals(this.status, addonInstanceStatus.status) &&
            Objects.equals(this.reason, addonInstanceStatus.reason) &&
            Objects.equals(this.message, addonInstanceStatus.message) &&
            Objects.equals(this.targetVersions, addonInstanceStatus.targetVersions) &&
            Objects.equals(this.currentVersion, addonInstanceStatus.currentVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, reason, message, targetVersions, currentVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonInstanceStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
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

