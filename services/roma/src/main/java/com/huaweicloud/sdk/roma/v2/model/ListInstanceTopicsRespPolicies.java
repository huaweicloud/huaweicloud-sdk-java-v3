package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ListInstanceTopicsRespPolicies */
public class ListInstanceTopicsRespPolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private Boolean owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /** 权限类型。 - all：发布+订阅 - pub：发布 - sub：订阅 */
    public static final class AccessPolicyEnum {

        /** Enum ALL for value: "all" */
        public static final AccessPolicyEnum ALL = new AccessPolicyEnum("all");

        /** Enum PUB for value: "pub" */
        public static final AccessPolicyEnum PUB = new AccessPolicyEnum("pub");

        /** Enum SUB for value: "sub" */
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AccessPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessPolicyEnum(value);
            }
            return result;
        }

        public static AccessPolicyEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof AccessPolicyEnum) {
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
    @JsonProperty(value = "access_policy")

    private AccessPolicyEnum accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ListInstanceTopicsRespPolicies withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    /** 是否为创建topic时所选择的应用。
     * 
     * @return owner */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public ListInstanceTopicsRespPolicies withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 集成应用key。
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListInstanceTopicsRespPolicies withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 应用名称。
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListInstanceTopicsRespPolicies withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /** 权限类型。 - all：发布+订阅 - pub：发布 - sub：订阅
     * 
     * @return accessPolicy */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public ListInstanceTopicsRespPolicies withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 权限类型对应的标签。 当权限类型是all时，发布和订阅的标签用符号“&”隔开。 当有多个标签时，标签用符号“||”隔开。
     * 
     * @return tag */
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
        ListInstanceTopicsRespPolicies listInstanceTopicsRespPolicies = (ListInstanceTopicsRespPolicies) o;
        return Objects.equals(this.owner, listInstanceTopicsRespPolicies.owner)
            && Objects.equals(this.userName, listInstanceTopicsRespPolicies.userName)
            && Objects.equals(this.appName, listInstanceTopicsRespPolicies.appName)
            && Objects.equals(this.accessPolicy, listInstanceTopicsRespPolicies.accessPolicy)
            && Objects.equals(this.tag, listInstanceTopicsRespPolicies.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, userName, appName, accessPolicy, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsRespPolicies {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
