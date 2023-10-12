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
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值     * `SERVICE_MANAGED` - 用户在自己的Organization中将RFS设置为可信服务后，才可以使用此种模式创建资源栈集。用户不需要手动创建委托，基于Organization，RFS会自动帮用户创建委托。只有Organization组织管理员或委托管理员才可以在SERVICE_MANAGED下创建资源栈集。     * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
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
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值     * `SERVICE_MANAGED` - 用户在自己的Organization中将RFS设置为可信服务后，才可以使用此种模式创建资源栈集。用户不需要手动创建委托，基于Organization，RFS会自动帮用户创建委托。只有Organization组织管理员或委托管理员才可以在SERVICE_MANAGED下创建资源栈集。     * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
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
     * 管理委托名称  资源编排服务使用该委托获取成员账号委托给管理账号的权限  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用v5委托时给与administration_agency_urn，administration_agency_name只支持接收v3委托名称，若给与了v5委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。
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
     * 被管理的委托名称。  资源编排服务会使用该委托获取实际部署资源所需要的权限  不同成员账号委托给管理账号的委托名称需要保持一致。暂不支持根据不同provider定义不同委托权限  当用户定义SELF_MANAGED权限类型时，必须指定该参数。当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400
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
     * HCL模板，描述了资源的目标状态。资源编排服务将比较此模板与当前远程资源的状态之间的区别。  template_body和template_uri 必须有且只有一个存在  *在CreateStack API中，template_body和template_uri可以都不给予*  **注意：**   * template_body中默认不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的template_body。如为敏感信息，建议将敏感信息通过vars_structure参数化，并设置encryption字段开启加密
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
     * HCL模板的OBS地址，该模板描述了资源的目标状态。资源编排服务将比较此模板与当前远程资源的状态之间的区别。  OBS地址支持同类型Region之间进行互相访问（Region分为通用Region和专属Region，通用Region指面向公共租户提供通用云服务的Region；专属Region指只承载同一类业务或只面向特定租户提供业务服务的专用Region）  对应的文件应该是纯tf文件或zip压缩包  纯tf文件需要以`.tf`或者`.tf.json`结尾，并遵守HCL语法  压缩包目前只支持zip格式，文件需要以`.zip`结尾。解压后的文件不得包含\".tfvars\"文件且必须是UTF8编码（其中.tf.json不能包含BOM头），zip压缩包当前支持的子文件数量最大为100  template_body和template_uri 必须有且只有一个存在  *在CreateStack API中，template_body和template_uri可以都不给予*  **注意：**   * template_uri对应的模板文件中默认不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的模板文件内容。如为敏感信息，建议将敏感信息通过vars_structure参数化，并设置encryption字段开启加密   * template_uri对应的文件（或文件夹、zip包）名的长度不得超过255个字节，文件大小不得超过1MB
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
     * HCL参数文件的OBS地址。HCL模板支持参数传入，即，同一个模板可以给予不同的参数而达到不同的效果。  OBS地址支持同类型Region之间进行互相访问（Region分为通用Region和专属Region，通用Region指面向公共租户提供通用云服务的Region；专属Region指只承载同一类业务或只面向特定租户提供业务服务的专用Region）  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400 * vars_uri中的内容使用HCL的tfvars格式，用户可以将“.tfvars”中的内容保存到文件并上传到OBS中，并将OBS pre-signed URL传递给vars_uri。 * 注意：vars_uri的内容不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议通过vars_structure并设置encryption字段传递
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
     * HCL参数文件的内容。HCL模板支持参数传入，即，同一个模板可以给予不同的参数而达到不同的效果。  * vars_body使用HCL的tfvars格式，用户可以将“.tfvars”中的内容提交到vars_body中。  * 资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  * 如果vars_body过大，可以使用vars_uri  * 如果vars中都是简单的字符串格式，可以使用var_structure  * 注意：vars_body中不应该含有任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars。如为敏感信息，建议通过vars_structure并设置encryption字段传递
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
     * 管理委托URN  资源编排服务使用该委托获取成员账号委托给管理账号的权限  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用v5委托时给与administration_agency_urn，administration_agency_name只支持接收普通委托名称，若给与了v5委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。
     * @return administrationAgencyUrn
     */
    public String getAdministrationAgencyUrn() {
        return administrationAgencyUrn;
    }

    public void setAdministrationAgencyUrn(String administrationAgencyUrn) {
        this.administrationAgencyUrn = administrationAgencyUrn;
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
            && Objects.equals(this.administrationAgencyUrn, that.administrationAgencyUrn);
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
            administrationAgencyUrn);
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
