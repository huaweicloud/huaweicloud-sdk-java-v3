package com.huaweicloud.sdk.cdn.v1.model;




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
 * Follow302StatusBody
 */
public class Follow302StatusBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;
    /**
     * follow302状态（\"off\"/\"on\"）
     */
    public static final class FollowStatusEnum {

        
        /**
         * Enum OFF for value: "off"
         */
        public static final FollowStatusEnum OFF = new FollowStatusEnum("off");
        
        /**
         * Enum ON for value: "on"
         */
        public static final FollowStatusEnum ON = new FollowStatusEnum("on");
        

        private static final Map<String, FollowStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FollowStatusEnum> createStaticFields() {
            Map<String, FollowStatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FollowStatusEnum(String value) {
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
        public static FollowStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FollowStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FollowStatusEnum(value);
            }
            return result;
        }

        public static FollowStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FollowStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FollowStatusEnum) {
                return this.value.equals(((FollowStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="follow_status")
    
    private FollowStatusEnum followStatus;

    public Follow302StatusBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 加速域名id。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public Follow302StatusBody withFollowStatus(FollowStatusEnum followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    


    /**
     * follow302状态（\"off\"/\"on\"）
     * @return followStatus
     */
    public FollowStatusEnum getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(FollowStatusEnum followStatus) {
        this.followStatus = followStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Follow302StatusBody follow302StatusBody = (Follow302StatusBody) o;
        return Objects.equals(this.domainId, follow302StatusBody.domainId) &&
            Objects.equals(this.followStatus, follow302StatusBody.followStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, followStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Follow302StatusBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
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

