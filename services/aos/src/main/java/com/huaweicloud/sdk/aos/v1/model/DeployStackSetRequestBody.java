package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployStackSetRequestBody
 */
public class DeployStackSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_targets")

    private DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets;

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
    @JsonProperty(value = "var_overrides")

    private VarOverridesPrimitiveTypeHolderVarOverrides varOverrides;

    public DeployStackSetRequestBody withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，在重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是又其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给与的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public DeployStackSetRequestBody withDeploymentTargets(
        DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    public DeployStackSetRequestBody withDeploymentTargets(
        Consumer<DeploymentTargetsPrimitiveTypeHolderDeploymentTargets> deploymentTargetsSetter) {
        if (this.deploymentTargets == null) {
            this.deploymentTargets = new DeploymentTargetsPrimitiveTypeHolderDeploymentTargets();
            deploymentTargetsSetter.accept(this.deploymentTargets);
        }

        return this;
    }

    /**
     * Get deploymentTargets
     * @return deploymentTargets
     */
    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    public void setDeploymentTargets(DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    public DeployStackSetRequestBody withTemplateBody(String templateBody) {
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

    public DeployStackSetRequestBody withTemplateUri(String templateUri) {
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

    public DeployStackSetRequestBody withVarsUri(String varsUri) {
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

    public DeployStackSetRequestBody withVarsBody(String varsBody) {
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

    public DeployStackSetRequestBody withVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
        return this;
    }

    public DeployStackSetRequestBody withVarOverrides(
        Consumer<VarOverridesPrimitiveTypeHolderVarOverrides> varOverridesSetter) {
        if (this.varOverrides == null) {
            this.varOverrides = new VarOverridesPrimitiveTypeHolderVarOverrides();
            varOverridesSetter.accept(this.varOverrides);
        }

        return this;
    }

    /**
     * Get varOverrides
     * @return varOverrides
     */
    public VarOverridesPrimitiveTypeHolderVarOverrides getVarOverrides() {
        return varOverrides;
    }

    public void setVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployStackSetRequestBody that = (DeployStackSetRequestBody) obj;
        return Objects.equals(this.stackSetId, that.stackSetId)
            && Objects.equals(this.deploymentTargets, that.deploymentTargets)
            && Objects.equals(this.templateBody, that.templateBody)
            && Objects.equals(this.templateUri, that.templateUri) && Objects.equals(this.varsUri, that.varsUri)
            && Objects.equals(this.varsBody, that.varsBody) && Objects.equals(this.varOverrides, that.varOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetId, deploymentTargets, templateBody, templateUri, varsUri, varsBody, varOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStackSetRequestBody {\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    deploymentTargets: ").append(toIndentedString(deploymentTargets)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    varsUri: ").append(toIndentedString(varsUri)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    varOverrides: ").append(toIndentedString(varOverrides)).append("\n");
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
