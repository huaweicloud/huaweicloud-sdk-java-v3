package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStackSetMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_description")

    private String stackSetDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_stack_description")

    private String initialStackDescription;

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值    * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
     */
    public static final class PermissionModelEnum {

        /**
         * Enum SELF_MANAGED for value: "SELF_MANAGED"
         */
        public static final PermissionModelEnum SELF_MANAGED = new PermissionModelEnum("SELF_MANAGED");

        private static final Map<String, PermissionModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionModelEnum> createStaticFields() {
            Map<String, PermissionModelEnum> map = new HashMap<>();
            map.put("SELF_MANAGED", SELF_MANAGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionModelEnum(String value) {
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
        public static PermissionModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionModelEnum(value));
        }

        public static PermissionModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionModelEnum) {
                return this.value.equals(((PermissionModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_model")

    private PermissionModelEnum permissionModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_name")

    private String administrationAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_agency_name")

    private String managedAgencyName;

    /**
     * 资源栈集的状态     * `IDLE` - 资源栈集空闲 * `OPERATION_IN_PROGRESS` - 资源栈集操作中 * `DEACTIVATED` - 资源栈集禁用
     */
    public static final class StatusEnum {

        /**
         * Enum IDLE for value: "IDLE"
         */
        public static final StatusEnum IDLE = new StatusEnum("IDLE");

        /**
         * Enum OPERATION_IN_PROGRESS for value: "OPERATION_IN_PROGRESS"
         */
        public static final StatusEnum OPERATION_IN_PROGRESS = new StatusEnum("OPERATION_IN_PROGRESS");

        /**
         * Enum DEACTIVATED for value: "DEACTIVATED"
         */
        public static final StatusEnum DEACTIVATED = new StatusEnum("DEACTIVATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("IDLE", IDLE);
            map.put("OPERATION_IN_PROGRESS", OPERATION_IN_PROGRESS);
            map.put("DEACTIVATED", DEACTIVATED);
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
    @JsonProperty(value = "vars_uri_content")

    private String varsUriContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_body")

    private String varsBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_urn")

    private String administrationAgencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_operation")

    private ManagedOperation managedOperation;

    public ShowStackSetMetadataResponse withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈集的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，在重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是又其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给予的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public ShowStackSetMetadataResponse withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * 资源栈集（stack_set）的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackSetName
     */
    public String getStackSetName() {
        return stackSetName;
    }

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    public ShowStackSetMetadataResponse withStackSetDescription(String stackSetDescription) {
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

    public ShowStackSetMetadataResponse withInitialStackDescription(String initialStackDescription) {
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

    public ShowStackSetMetadataResponse withPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值    * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
     * @return permissionModel
     */
    public PermissionModelEnum getPermissionModel() {
        return permissionModel;
    }

    public void setPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
    }

    public ShowStackSetMetadataResponse withAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
        return this;
    }

    /**
     * 管理委托名称  资源编排服务使用该委托获取成员账号委托给管理账号的权限。该委托中必须含有iam:tokens:assume权限，用以后续获取被管理委托凭证。如果不包含，则会在新增或者部署实例时报错。  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用信任委托时给予administration_agency_urn，administration_agency_name只支持接收委托名称，若给予了信任委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。  [[创建委托及授权方式](https://support.huaweicloud.com/usermanual-iam/iam_06_0002.html)](tag:hws) [[创建委托及授权方式](https://support.huaweicloud.com/intl/zh-cn/usermanual-iam/iam_06_0002.html)](tag:hws_hk) [[创建委托及授权方式](https://support.huaweicloud.com/eu/usermanual-iam/iam_06_0002.html)](tag:hws_eu)
     * @return administrationAgencyName
     */
    public String getAdministrationAgencyName() {
        return administrationAgencyName;
    }

    public void setAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
    }

    public ShowStackSetMetadataResponse withManagedAgencyName(String managedAgencyName) {
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

    public ShowStackSetMetadataResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源栈集的状态     * `IDLE` - 资源栈集空闲 * `OPERATION_IN_PROGRESS` - 资源栈集操作中 * `DEACTIVATED` - 资源栈集禁用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowStackSetMetadataResponse withVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
        return this;
    }

    /**
     * vars_uri对应的文件内容
     * @return varsUriContent
     */
    public String getVarsUriContent() {
        return varsUriContent;
    }

    public void setVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
    }

    public ShowStackSetMetadataResponse withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    /**
     * HCL参数文件的内容。HCL模板支持参数传入，即，同一个模板可以给予不同的参数而达到不同的效果。  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中  * 资源编排服务支持vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 资源栈集不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储对应的vars_body。
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    public ShowStackSetMetadataResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源栈集的创建时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowStackSetMetadataResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资源栈集的更新时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowStackSetMetadataResponse withAdministrationAgencyUrn(String administrationAgencyUrn) {
        this.administrationAgencyUrn = administrationAgencyUrn;
        return this;
    }

    /**
     * 管理委托URN  资源编排服务使用该委托获取成员账号委托给管理账号的权限。该委托中必须含有sts:tokens:assume权限，用以后续获取被管理委托凭证。如果不包含，则会在新增或者部署实例时报错。  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用信任委托时给予administration_agency_urn，administration_agency_name只支持接收委托名称，若给予了信任委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。
     * @return administrationAgencyUrn
     */
    public String getAdministrationAgencyUrn() {
        return administrationAgencyUrn;
    }

    public void setAdministrationAgencyUrn(String administrationAgencyUrn) {
        this.administrationAgencyUrn = administrationAgencyUrn;
    }

    public ShowStackSetMetadataResponse withManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
        return this;
    }

    public ShowStackSetMetadataResponse withManagedOperation(Consumer<ManagedOperation> managedOperationSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStackSetMetadataResponse that = (ShowStackSetMetadataResponse) obj;
        return Objects.equals(this.stackSetId, that.stackSetId) && Objects.equals(this.stackSetName, that.stackSetName)
            && Objects.equals(this.stackSetDescription, that.stackSetDescription)
            && Objects.equals(this.initialStackDescription, that.initialStackDescription)
            && Objects.equals(this.permissionModel, that.permissionModel)
            && Objects.equals(this.administrationAgencyName, that.administrationAgencyName)
            && Objects.equals(this.managedAgencyName, that.managedAgencyName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.varsUriContent, that.varsUriContent)
            && Objects.equals(this.varsBody, that.varsBody) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.administrationAgencyUrn, that.administrationAgencyUrn)
            && Objects.equals(this.managedOperation, that.managedOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetId,
            stackSetName,
            stackSetDescription,
            initialStackDescription,
            permissionModel,
            administrationAgencyName,
            managedAgencyName,
            status,
            varsUriContent,
            varsBody,
            createTime,
            updateTime,
            administrationAgencyUrn,
            managedOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStackSetMetadataResponse {\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    stackSetDescription: ").append(toIndentedString(stackSetDescription)).append("\n");
        sb.append("    initialStackDescription: ").append(toIndentedString(initialStackDescription)).append("\n");
        sb.append("    permissionModel: ").append(toIndentedString(permissionModel)).append("\n");
        sb.append("    administrationAgencyName: ").append(toIndentedString(administrationAgencyName)).append("\n");
        sb.append("    managedAgencyName: ").append(toIndentedString(managedAgencyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    varsUriContent: ").append(toIndentedString(varsUriContent)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    administrationAgencyUrn: ").append(toIndentedString(administrationAgencyUrn)).append("\n");
        sb.append("    managedOperation: ").append(toIndentedString(managedOperation)).append("\n");
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
