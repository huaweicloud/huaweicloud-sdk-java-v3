package com.huaweicloud.sdk.aos.v1.model;

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
 * CreateStackSetRequestBody
 */
public class CreateStackSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_description")

    private String stackSetDescription;

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值，默认为SELF_MANAGED。用户可以使用创建资源栈集（CreateStackSet）API 指定该参数。该参数暂不支持更新。用户如果想要更新权限模型，可以通过先删除再创建同名资源栈集实现。   * `SELF_MANAGED` - 自我管理，基于部署需求，用户需要提前手动创建委托，既包含管理账号授权给RFS的委托，也包含成员账号授权给管理账号的委托。如果委托不存在或权限不足，创建资源栈集不会失败，创建资源栈实例时才会报错。   * `SERVICE_MANAGED` - 服务管理，基于Organization服务，RFS会自动创建部署Organization 成员账号时所需的全部 IAM 委托。用户需要提前在Organization可信服务列表中将”资源编排资源栈集服务“启用，且只有Organization的管理账号或”资源编排资源栈集服务“的委托管理员，才允许指定SERVICE_MANAGED创建资源栈集，否则会报错。
     */
    public static final class PermissionModelEnum {

        /**
         * Enum SELF_MANAGED for value: "SELF_MANAGED"
         */
        public static final PermissionModelEnum SELF_MANAGED = new PermissionModelEnum("SELF_MANAGED");

        /**
         * Enum SERVICE_MANAGED for value: "SERVICE_MANAGED"
         */
        public static final PermissionModelEnum SERVICE_MANAGED = new PermissionModelEnum("SERVICE_MANAGED");

        private static final Map<String, PermissionModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionModelEnum> createStaticFields() {
            Map<String, PermissionModelEnum> map = new HashMap<>();
            map.put("SELF_MANAGED", SELF_MANAGED);
            map.put("SERVICE_MANAGED", SERVICE_MANAGED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private String templateBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_uri")

    private String templateUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_uri")

    private String varsUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_body")

    private String varsBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_stack_description")

    private String initialStackDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_urn")

    private String administrationAgencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_operation")

    private ManagedOperation managedOperation;

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。 * 无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
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

    public CreateStackSetRequestBody withStackSetName(String stackSetName) {
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

    public CreateStackSetRequestBody withStackSetDescription(String stackSetDescription) {
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

    public CreateStackSetRequestBody withPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值，默认为SELF_MANAGED。用户可以使用创建资源栈集（CreateStackSet）API 指定该参数。该参数暂不支持更新。用户如果想要更新权限模型，可以通过先删除再创建同名资源栈集实现。   * `SELF_MANAGED` - 自我管理，基于部署需求，用户需要提前手动创建委托，既包含管理账号授权给RFS的委托，也包含成员账号授权给管理账号的委托。如果委托不存在或权限不足，创建资源栈集不会失败，创建资源栈实例时才会报错。   * `SERVICE_MANAGED` - 服务管理，基于Organization服务，RFS会自动创建部署Organization 成员账号时所需的全部 IAM 委托。用户需要提前在Organization可信服务列表中将”资源编排资源栈集服务“启用，且只有Organization的管理账号或”资源编排资源栈集服务“的委托管理员，才允许指定SERVICE_MANAGED创建资源栈集，否则会报错。
     * @return permissionModel
     */
    public PermissionModelEnum getPermissionModel() {
        return permissionModel;
    }

    public void setPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
    }

    public CreateStackSetRequestBody withAdministrationAgencyName(String administrationAgencyName) {
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

    public CreateStackSetRequestBody withManagedAgencyName(String managedAgencyName) {
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

    public CreateStackSetRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * HCL模板，描述了资源的目标状态。资源编排服务将比较此模板与当前远程资源的状态之间的区别。  template_body和template_uri 必须有且只有一个存在  **注意：**   * 资源栈集不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储对应的template_body
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    public CreateStackSetRequestBody withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    /**
     * HCL模板的OBS地址，该模板描述了资源的目标状态。资源编排服务将比较此模板与当前远程资源的状态之间的区别  请确保OBS地址所在局点与使用RFS服务局点一致。  对应的文件应该是纯tf文件或zip压缩包  纯tf文件需要以“.tf”或者“.tf.json”结尾，并遵守HCL语法，且文件的编码格式须为UTF-8  压缩包目前只支持zip格式，文件需要以\".zip\"结尾。解压后的文件不得包含\".tfvars\"文件。解压前最大支持1MB，解压后最大支持1MB。zip压缩包文件数量不能超过100个  template_body和template_uri 必须有且只有一个存在  **注意：**   * 资源栈集不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储template_uri对应的模板文件内容。   * template_uri对应的模板文件如果为zip类型，则内部的文件或文件夹名称长度不得超过255个字节，最深路径长度不得超过2048字节，zip包大小不得超过1MB
     * @return templateUri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    public CreateStackSetRequestBody withVarsUri(String varsUri) {
        this.varsUri = varsUri;
        return this;
    }

    /**
     * HCL参数文件的OBS地址。HCL模板支持参数传入，即，同一个模板可以给予不同的参数而达到不同的效果。  请确保OBS地址所在局点与使用RFS服务局点一致。  * vars_uri需要指向一个OBS的pre-signed URL地址，其他地址暂不支持  * 资源编排服务支持vars_body和vars_uri，如果以上两种方式中声明了同一个变量，将报错400  * vars_uri中的内容使用HCL的tfvars格式，用户可以将“.tfvars”中的内容保存到文件并上传到OBS中，并将OBS pre-signed URL传递给vars_uri  * 资源栈集不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储vars_uri对应的参数文件内容
     * @return varsUri
     */
    public String getVarsUri() {
        return varsUri;
    }

    public void setVarsUri(String varsUri) {
        this.varsUri = varsUri;
    }

    public CreateStackSetRequestBody withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    /**
     * HCL参数文件的内容。HCL模板支持参数传入，即，同一个模板可以给予不同的参数而达到不同的效果。  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中  * 资源编排服务支持vars_body和vars_uri，如果以上两种方式中声明了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 资源栈集不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储对应的vars_body。
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    public CreateStackSetRequestBody withInitialStackDescription(String initialStackDescription) {
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

    public CreateStackSetRequestBody withAdministrationAgencyUrn(String administrationAgencyUrn) {
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

    public CreateStackSetRequestBody withManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
        return this;
    }

    public CreateStackSetRequestBody withManagedOperation(Consumer<ManagedOperation> managedOperationSetter) {
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

    public CreateStackSetRequestBody withCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
        return this;
    }

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。 * 无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
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
        CreateStackSetRequestBody that = (CreateStackSetRequestBody) obj;
        return Objects.equals(this.stackSetName, that.stackSetName)
            && Objects.equals(this.stackSetDescription, that.stackSetDescription)
            && Objects.equals(this.permissionModel, that.permissionModel)
            && Objects.equals(this.administrationAgencyName, that.administrationAgencyName)
            && Objects.equals(this.managedAgencyName, that.managedAgencyName)
            && Objects.equals(this.templateBody, that.templateBody)
            && Objects.equals(this.templateUri, that.templateUri) && Objects.equals(this.varsUri, that.varsUri)
            && Objects.equals(this.varsBody, that.varsBody)
            && Objects.equals(this.initialStackDescription, that.initialStackDescription)
            && Objects.equals(this.administrationAgencyUrn, that.administrationAgencyUrn)
            && Objects.equals(this.managedOperation, that.managedOperation)
            && Objects.equals(this.callIdentity, that.callIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetName,
            stackSetDescription,
            permissionModel,
            administrationAgencyName,
            managedAgencyName,
            templateBody,
            templateUri,
            varsUri,
            varsBody,
            initialStackDescription,
            administrationAgencyUrn,
            managedOperation,
            callIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStackSetRequestBody {\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    stackSetDescription: ").append(toIndentedString(stackSetDescription)).append("\n");
        sb.append("    permissionModel: ").append(toIndentedString(permissionModel)).append("\n");
        sb.append("    administrationAgencyName: ").append(toIndentedString(administrationAgencyName)).append("\n");
        sb.append("    managedAgencyName: ").append(toIndentedString(managedAgencyName)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    varsUri: ").append(toIndentedString(varsUri)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    initialStackDescription: ").append(toIndentedString(initialStackDescription)).append("\n");
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
