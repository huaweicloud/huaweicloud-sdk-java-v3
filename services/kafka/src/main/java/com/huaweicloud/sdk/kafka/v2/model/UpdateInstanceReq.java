package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateInstanceReq
 */
public class UpdateInstanceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_begin")
    
    private String maintainBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_end")
    
    private String maintainEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;
    /**
     * 容量阈值策略。 支持两种策略模式： - produce_reject: 生产受限 - time_base: 自动删除 
     */
    public static class RetentionPolicyEnum {

        
        /**
         * Enum PRODUCE_REJECT for value: "produce_reject"
         */
        public static final RetentionPolicyEnum PRODUCE_REJECT = new RetentionPolicyEnum("produce_reject");
        
        /**
         * Enum TIME_BASE for value: "time_base"
         */
        public static final RetentionPolicyEnum TIME_BASE = new RetentionPolicyEnum("time_base");
        

        public static final Map<String, RetentionPolicyEnum> staticFields = new HashMap<String, RetentionPolicyEnum>() {
            { 
                put("produce_reject", PRODUCE_REJECT);
                put("time_base", TIME_BASE);
            }
        };

        private String value;

        RetentionPolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RetentionPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RetentionPolicyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RetentionPolicyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RetentionPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RetentionPolicyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RetentionPolicyEnum) {
                return this.value.equals(((RetentionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_policy")
    
    private RetentionPolicyEnum retentionPolicy;

    public UpdateInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。  由英文字符开头，只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstanceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 实例的描述信息。  长度不超过1024的字符串。  > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    


    /**
     * 维护时间窗开始时间，格式为HH:mm:ss。   - 维护时间窗开始和结束时间必须为指定的时间段，可参考查[询维护时间窗时间段](https://support.huaweicloud.com/api-kafka/ShowMaintainWindows.html)。   - 开始时间必须为22:00:00、02:00:00、06:00:00、10:00:00、14:00:00和18:00:00。   - 该参数不能单独为空，若该值为空，则结束时间也为空。系统分配一个默认开始时间02:00:00。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public UpdateInstanceReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    


    /**
     * 维护时间窗结束时间，格式为HH:mm:ss。   - 维护时间窗开始和结束时间必须为指定的时间段，可参考查[询维护时间窗时间段](https://support.huaweicloud.com/api-kafka/ShowMaintainWindows.html)。   - 结束时间在开始时间基础上加四个小时，即当开始时间为22:00:00时，结束时间为02:00:00。   - 该参数不能单独为空，若该值为空，则开始时间也为空。系统分配一个默认结束时间06:00:00。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public UpdateInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public UpdateInstanceReq withRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    


    /**
     * 容量阈值策略。 支持两种策略模式： - produce_reject: 生产受限 - time_base: 自动删除 
     * @return retentionPolicy
     */
    public RetentionPolicyEnum getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicyEnum retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceReq updateInstanceReq = (UpdateInstanceReq) o;
        return Objects.equals(this.name, updateInstanceReq.name) &&
            Objects.equals(this.description, updateInstanceReq.description) &&
            Objects.equals(this.maintainBegin, updateInstanceReq.maintainBegin) &&
            Objects.equals(this.maintainEnd, updateInstanceReq.maintainEnd) &&
            Objects.equals(this.securityGroupId, updateInstanceReq.securityGroupId) &&
            Objects.equals(this.retentionPolicy, updateInstanceReq.retentionPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, maintainBegin, maintainEnd, securityGroupId, retentionPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
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

