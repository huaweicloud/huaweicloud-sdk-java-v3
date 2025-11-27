package com.huaweicloud.sdk.rfs.v1.model;

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
 * UpdateStackSetRequestBody
 */
public class UpdateStackSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_description")

    private String stackSetDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_stack_description")

    private String initialStackDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_name")

    private String administrationAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_agency_name")

    private String managedAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_urn")

    private String administrationAgencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_operation")

    private ManagedOperation managedOperation;

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员账号中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。  无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
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

    public UpdateStackSetRequestBody withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈集的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，再重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是被其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给予的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public UpdateStackSetRequestBody withStackSetDescription(String stackSetDescription) {
        this.stackSetDescription = stackSetDescription;
        return this;
    }

    /**
     * 资源栈集的描述。可用于客户识别自己的资源栈集。
     * @return stackSetDescription
     */
    public String getStackSetDescription() {
        return stackSetDescription;
    }

    public void setStackSetDescription(String stackSetDescription) {
        this.stackSetDescription = stackSetDescription;
    }

    public UpdateStackSetRequestBody withInitialStackDescription(String initialStackDescription) {
        this.initialStackDescription = initialStackDescription;
        return this;
    }

    /**
     * 初始化资源栈描述。可用于客户识别被资源栈集所管理的资源栈。  资源栈集下的资源栈仅在创建时统一使用该描述。客户想要更新初始化资源栈描述，可以通过UpdateStackSet API。  后续更新资源栈集描述将不会同步更新已管理的资源栈描述。
     * @return initialStackDescription
     */
    public String getInitialStackDescription() {
        return initialStackDescription;
    }

    public void setInitialStackDescription(String initialStackDescription) {
        this.initialStackDescription = initialStackDescription;
    }

    public UpdateStackSetRequestBody withAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
        return this;
    }

    /**
     * 管理委托名称  资源编排服务使用该委托获取成员账号委托给管理账号的权限。该委托中必须含有iam:tokens:assume权限，用以后续获取被管理委托凭证。如果不包含，则会在新增或者部署实例时报错。  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用信任委托时给予administration_agency_urn，administration_agency_name只支持接收委托名称，如果给予了信任委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。  [[创建委托及授权方式](https://support.huaweicloud.com/usermanual-iam/iam_06_0002.html)](tag:hws) [[创建委托及授权方式](https://support.huaweicloud.com/intl/zh-cn/usermanual-iam/iam_06_0002.html)](tag:hws_hk) [[创建委托及授权方式](https://support.huaweicloud.com/eu/usermanual-iam/iam_06_0002.html)](tag:hws_eu)
     * @return administrationAgencyName
     */
    public String getAdministrationAgencyName() {
        return administrationAgencyName;
    }

    public void setAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
    }

    public UpdateStackSetRequestBody withManagedAgencyName(String managedAgencyName) {
        this.managedAgencyName = managedAgencyName;
        return this;
    }

    /**
     * 被管理的委托名称。  资源编排服务会使用该委托获取实际部署资源所需要的权限  不同成员账号委托给管理账号的委托名称需要保持一致。暂不支持根据不同provider定义不同委托权限  当用户定义SELF_MANAGED权限类型时，必须指定该参数。当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400  [[创建委托及授权方式](https://support.huaweicloud.com/usermanual-iam/iam_06_0002.html)](tag:hws) [[创建委托及授权方式](https://support.huaweicloud.com/intl/zh-cn/usermanual-iam/iam_06_0002.html)](tag:hws_hk) [[创建委托及授权方式](https://support.huaweicloud.com/eu/usermanual-iam/iam_06_0002.html)](tag:hws_eu)
     * @return managedAgencyName
     */
    public String getManagedAgencyName() {
        return managedAgencyName;
    }

    public void setManagedAgencyName(String managedAgencyName) {
        this.managedAgencyName = managedAgencyName;
    }

    public UpdateStackSetRequestBody withAdministrationAgencyUrn(String administrationAgencyUrn) {
        this.administrationAgencyUrn = administrationAgencyUrn;
        return this;
    }

    /**
     * 管理委托URN  资源编排服务使用该委托获取成员账号委托给管理账号的权限。该委托中必须含有sts:tokens:assume权限，用以后续获取被管理委托凭证。如果不包含，则会在新增或者部署实例时报错。  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用信任委托时给予administration_agency_urn，administration_agency_name只支持接收委托名称，如果给予了信任委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。
     * @return administrationAgencyUrn
     */
    public String getAdministrationAgencyUrn() {
        return administrationAgencyUrn;
    }

    public void setAdministrationAgencyUrn(String administrationAgencyUrn) {
        this.administrationAgencyUrn = administrationAgencyUrn;
    }

    public UpdateStackSetRequestBody withManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
        return this;
    }

    public UpdateStackSetRequestBody withManagedOperation(Consumer<ManagedOperation> managedOperationSetter) {
        if (this.managedOperation == null) {
            this.managedOperation = new ManagedOperation();
            managedOperationSetter.accept(this.managedOperation);
        }

        return this;
    }

    /**
     * Get managedOperation
     * @return managedOperation
     */
    public ManagedOperation getManagedOperation() {
        return managedOperation;
    }

    public void setManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
    }

    public UpdateStackSetRequestBody withCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
        return this;
    }

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员账号中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。  无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
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
        UpdateStackSetRequestBody that = (UpdateStackSetRequestBody) obj;
        return Objects.equals(this.stackSetId, that.stackSetId)
            && Objects.equals(this.stackSetDescription, that.stackSetDescription)
            && Objects.equals(this.initialStackDescription, that.initialStackDescription)
            && Objects.equals(this.administrationAgencyName, that.administrationAgencyName)
            && Objects.equals(this.managedAgencyName, that.managedAgencyName)
            && Objects.equals(this.administrationAgencyUrn, that.administrationAgencyUrn)
            && Objects.equals(this.managedOperation, that.managedOperation)
            && Objects.equals(this.callIdentity, that.callIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetId,
            stackSetDescription,
            initialStackDescription,
            administrationAgencyName,
            managedAgencyName,
            administrationAgencyUrn,
            managedOperation,
            callIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStackSetRequestBody {\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    stackSetDescription: ").append(toIndentedString(stackSetDescription)).append("\n");
        sb.append("    initialStackDescription: ").append(toIndentedString(initialStackDescription)).append("\n");
        sb.append("    administrationAgencyName: ").append(toIndentedString(administrationAgencyName)).append("\n");
        sb.append("    managedAgencyName: ").append(toIndentedString(managedAgencyName)).append("\n");
        sb.append("    administrationAgencyUrn: ").append(toIndentedString(administrationAgencyUrn)).append("\n");
        sb.append("    managedOperation: ").append(toIndentedString(managedOperation)).append("\n");
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
