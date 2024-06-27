package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowStackInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Client-Request-Id")

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_instance_addr")

    private String stackInstanceAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 * 无论指定何种用户身份，创建或部署的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
     */
    public static final class CallIdentityEnum {

        /**
         * Enum SELF for value: "SELF"
         */
        public static final CallIdentityEnum SELF = new CallIdentityEnum("SELF");

        /**
         * Enum DELEGATED_ADMIN for value: "DELEGATED_ADMIN"
         */
        public static final CallIdentityEnum DELEGATED_ADMIN = new CallIdentityEnum("DELEGATED_ADMIN");

        private static final Map<String, CallIdentityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CallIdentityEnum> createStaticFields() {
            Map<String, CallIdentityEnum> map = new HashMap<>();
            map.put("SELF", SELF);
            map.put("DELEGATED_ADMIN", DELEGATED_ADMIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CallIdentityEnum(String value) {
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
        public static CallIdentityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CallIdentityEnum(value));
        }

        public static CallIdentityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CallIdentityEnum) {
                return this.value.equals(((CallIdentityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_identity")

    private CallIdentityEnum callIdentity;

    public ShowStackInstanceRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    public ShowStackInstanceRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * 资源栈集的名称。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackSetName
     */
    public String getStackSetName() {
        return stackSetName;
    }

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    public ShowStackInstanceRequest withStackInstanceAddr(String stackInstanceAddr) {
        this.stackInstanceAddr = stackInstanceAddr;
        return this;
    }

    /**
     * 资源栈实例的唯一地址。该地址由region和stack_domain_id通过\"/\"（转义后为%2f或%2F）拼接而成。该地址在domain_id+region+stack_set_name下唯一。
     * @return stackInstanceAddr
     */
    public String getStackInstanceAddr() {
        return stackInstanceAddr;
    }

    public void setStackInstanceAddr(String stackInstanceAddr) {
        this.stackInstanceAddr = stackInstanceAddr;
    }

    public ShowStackInstanceRequest withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈集的时候生成，为UUID。  由于资源栈集名称仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，再重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我认为的那个，而不是其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给予的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public ShowStackInstanceRequest withCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
        return this;
    }

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 * 无论指定何种用户身份，创建或部署的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
     * @return callIdentity
     */
    public CallIdentityEnum getCallIdentity() {
        return callIdentity;
    }

    public void setCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStackInstanceRequest that = (ShowStackInstanceRequest) obj;
        return Objects.equals(this.clientRequestId, that.clientRequestId)
            && Objects.equals(this.stackSetName, that.stackSetName)
            && Objects.equals(this.stackInstanceAddr, that.stackInstanceAddr)
            && Objects.equals(this.stackSetId, that.stackSetId) && Objects.equals(this.callIdentity, that.callIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackSetName, stackInstanceAddr, stackSetId, callIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStackInstanceRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    stackInstanceAddr: ").append(toIndentedString(stackInstanceAddr)).append("\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    callIdentity: ").append(toIndentedString(callIdentity)).append("\n");
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
