package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户期望在资源栈实例中更新的参数内容，参数将覆盖到本次请求中指定的所有资源栈实例中，并根据更新后的参数部署资源栈实例。覆盖后的参数将永久被记录在资源栈实例中，并在之后的部署中继续使用被覆盖参数，直到下一次被更新覆盖。  用户只能覆盖在资源栈集中记录的参数集合vars，如果指定了vars中不存在的参数会报错400。如果用户想要增加可以覆盖的参数，需要先通过DeployStackSet API 更新资源栈集记录的参数集合vars。通过DeployStackSet API更新vars后，资源栈实例中已经被覆盖的参数不会被更新，仍然保留覆盖值。  参数覆盖只针对用户在资源栈集中通过vars指定的参数，不包括在模板中定义使用默认值的参数。如果用户期望对使用默认值的参数进行覆盖，则需要按上述要求先通过DeployStackSet API 更新资源栈集记录的vars，显式地向vars中增加相关参数定义。  用户每次通过DeployStackSet API 更新资源栈集vars时，如果缺少了任一部署目标的资源栈实例中所记录的被覆盖参数时（即当前被覆盖参数已不是更新后资源栈集参数vars的子集)，会报错400  当前用户在更新参数覆盖时不能指定保留已有的参数覆盖，必须在更新的时候给予全部的覆盖信息。  参数覆盖后的资源栈实例应用的vars_body总长不超过51200。参数覆盖后的资源栈实例应用的vars_uri文件内容不超过1M。  例如：资源栈集中记录的vars_body内容为”key1&#x3D;value1,key2&#x3D;value2,....“，资源栈实例参数覆盖的vars_body为“key1&#x3D;another_value1”，则要求应用参数覆盖后的vars_body“key1&#x3D;another_value1,key2&#x3D;value2,....”总长不超过51200。  例如：资源栈集中记录的vars_uri文件内容为”key1&#x3D;value1,key2&#x3D;value2,....“，资源栈实例参数覆盖的vars_body为“key1&#x3D;another_value1”，则要求应用参数覆盖后的vars_uri文件内容“key1&#x3D;another_value1,key2&#x3D;value2,....”总长不超过1M。  如果var_overrides未给予，则不会更新覆盖资源栈实例中记录的参数。如果vars_uri或vars_body或use_stack_set_vars至少给予了一个，则会对参数覆盖进行替换式更新，即所给予的参数将被完全覆盖至指定资源栈实例中。  vars_body、vars_uri和use_stack_set_vars中声明的全部参数集合必须和资源栈集中记录的参数集合保持一致，如果声明了资源栈集中不存在的参数会报错400，如果没有声明已经在资源栈集中记录的参数会报错400，如果声明了同一个参数会报错400。  注：   * 期望覆盖指定参数值，需要在vars_uri或者vars_body中指定期望覆盖的参数名称及参数值。   * 期望将某个已覆盖参数回退至资源栈集中记录的参数值，需要在use_stack_set_vars中指定期望回退的参数名称。   * 期望将所有已覆盖参数回退至资源栈集中记录的参数值，需要在use_stack_set_vars中指定资源栈集中记录的全部参数名称。   * 期望使用当前资源栈实例中记录的参数值进行部署，则不需要指定var_overrides。
 */
public class VarOverridesPrimitiveTypeHolderVarOverrides {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_uri")

    private String varsUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_body")

    private String varsBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_stack_set_vars")

    private List<String> useStackSetVars = null;

    public VarOverridesPrimitiveTypeHolderVarOverrides withVarsUri(String varsUri) {
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

    public VarOverridesPrimitiveTypeHolderVarOverrides withVarsBody(String varsBody) {
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

    public VarOverridesPrimitiveTypeHolderVarOverrides withUseStackSetVars(List<String> useStackSetVars) {
        this.useStackSetVars = useStackSetVars;
        return this;
    }

    public VarOverridesPrimitiveTypeHolderVarOverrides addUseStackSetVarsItem(String useStackSetVarsItem) {
        if (this.useStackSetVars == null) {
            this.useStackSetVars = new ArrayList<>();
        }
        this.useStackSetVars.add(useStackSetVarsItem);
        return this;
    }

    public VarOverridesPrimitiveTypeHolderVarOverrides withUseStackSetVars(
        Consumer<List<String>> useStackSetVarsSetter) {
        if (this.useStackSetVars == null) {
            this.useStackSetVars = new ArrayList<>();
        }
        useStackSetVarsSetter.accept(this.useStackSetVars);
        return this;
    }

    /**
     * 用户期望使用资源栈集中记录的参数值进行部署的参数名称列表。  用户只能选择已经在资源栈集中被记录的参数，如果指定了未被记录的参数会报错400。  如果use_stack_set_vars中包含资源栈实例中已经被覆盖的参数名称，则会将该参数回退至资源栈集中记录的参数值。
     * @return useStackSetVars
     */
    public List<String> getUseStackSetVars() {
        return useStackSetVars;
    }

    public void setUseStackSetVars(List<String> useStackSetVars) {
        this.useStackSetVars = useStackSetVars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VarOverridesPrimitiveTypeHolderVarOverrides that = (VarOverridesPrimitiveTypeHolderVarOverrides) obj;
        return Objects.equals(this.varsUri, that.varsUri) && Objects.equals(this.varsBody, that.varsBody)
            && Objects.equals(this.useStackSetVars, that.useStackSetVars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varsUri, varsBody, useStackSetVars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VarOverridesPrimitiveTypeHolderVarOverrides {\n");
        sb.append("    varsUri: ").append(toIndentedString(varsUri)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    useStackSetVars: ").append(toIndentedString(useStackSetVars)).append("\n");
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
