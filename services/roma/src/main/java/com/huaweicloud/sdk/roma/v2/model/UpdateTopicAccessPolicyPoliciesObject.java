package com.huaweicloud.sdk.roma.v2.model;




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
 * UpdateTopicAccessPolicyPoliciesObject
 */
public class UpdateTopicAccessPolicyPoliciesObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private Boolean owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;
    /**
     * 权限类型。   - all：发布+订阅   - pub：发布   - sub：订阅
     */
    public static final class AccessPolicyEnum {

        
        /**
         * Enum ALL for value: "all"
         */
        public static final AccessPolicyEnum ALL = new AccessPolicyEnum("all");
        
        /**
         * Enum PUB for value: "pub"
         */
        public static final AccessPolicyEnum PUB = new AccessPolicyEnum("pub");
        
        /**
         * Enum SUB for value: "sub"
         */
        public static final AccessPolicyEnum SUB = new AccessPolicyEnum("sub");
        

        private static final Map<String, AccessPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessPolicyEnum> createStaticFields() {
            Map<String, AccessPolicyEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("pub", PUB);
            map.put("sub", SUB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessPolicyEnum(String value) {
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
        public static AccessPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessPolicyEnum(value);
            }
            return result;
        }

        public static AccessPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AccessPolicyEnum) {
                return this.value.equals(((AccessPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_policy")
    
    private AccessPolicyEnum accessPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;

    public UpdateTopicAccessPolicyPoliciesObject withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 是否为创建topic时所选择的应用。
     * @return owner
     */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public UpdateTopicAccessPolicyPoliciesObject withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 集成应用key。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateTopicAccessPolicyPoliciesObject withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public UpdateTopicAccessPolicyPoliciesObject withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    


    /**
     * 权限类型。   - all：发布+订阅   - pub：发布   - sub：订阅
     * @return accessPolicy
     */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public UpdateTopicAccessPolicyPoliciesObject withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 权限类型对应的标签。  当权限类型是all时，发布和订阅的标签用符号“&”隔开。  当有多个标签时，标签用符号“||”隔开。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicAccessPolicyPoliciesObject updateTopicAccessPolicyPoliciesObject = (UpdateTopicAccessPolicyPoliciesObject) o;
        return Objects.equals(this.owner, updateTopicAccessPolicyPoliciesObject.owner) &&
            Objects.equals(this.appId, updateTopicAccessPolicyPoliciesObject.appId) &&
            Objects.equals(this.appName, updateTopicAccessPolicyPoliciesObject.appName) &&
            Objects.equals(this.accessPolicy, updateTopicAccessPolicyPoliciesObject.accessPolicy) &&
            Objects.equals(this.tag, updateTopicAccessPolicyPoliciesObject.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(owner, appId, appName, accessPolicy, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAccessPolicyPoliciesObject {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

