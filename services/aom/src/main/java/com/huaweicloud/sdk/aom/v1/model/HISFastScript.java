package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HIS 用户快速执行脚本实体类。
 */
public class HISFastScript  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_type")
    
    
    private String scriptType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmd_user")
    
    
    private String cmdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_content")
    
    
    private String scriptContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecs_id_list")
    
    
    private String ecsIdList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_args")
    
    
    private String scriptArgs;

    public HISFastScript withScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    


    /**
     * 脚本类型。SHELL BAT PYTHON POWER_SHELL
     * @return scriptType
     */
    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    

    public HISFastScript withCmdUser(String cmdUser) {
        this.cmdUser = cmdUser;
        return this;
    }

    


    /**
     * 执行脚本的ECS机器用户。
     * @return cmdUser
     */
    public String getCmdUser() {
        return cmdUser;
    }

    public void setCmdUser(String cmdUser) {
        this.cmdUser = cmdUser;
    }

    

    public HISFastScript withScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }

    


    /**
     * 脚本内容。
     * @return scriptContent
     */
    public String getScriptContent() {
        return scriptContent;
    }

    public void setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
    }

    

    public HISFastScript withEcsIdList(String ecsIdList) {
        this.ecsIdList = ecsIdList;
        return this;
    }

    


    /**
     * 执行的机器列表。
     * @return ecsIdList
     */
    public String getEcsIdList() {
        return ecsIdList;
    }

    public void setEcsIdList(String ecsIdList) {
        this.ecsIdList = ecsIdList;
    }

    

    public HISFastScript withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public HISFastScript withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public HISFastScript withScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
        return this;
    }

    


    /**
     * 任务参数，多个参数以空格分隔。
     * @return scriptArgs
     */
    public String getScriptArgs() {
        return scriptArgs;
    }

    public void setScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HISFastScript hiSFastScript = (HISFastScript) o;
        return Objects.equals(this.scriptType, hiSFastScript.scriptType) &&
            Objects.equals(this.cmdUser, hiSFastScript.cmdUser) &&
            Objects.equals(this.scriptContent, hiSFastScript.scriptContent) &&
            Objects.equals(this.ecsIdList, hiSFastScript.ecsIdList) &&
            Objects.equals(this.name, hiSFastScript.name) &&
            Objects.equals(this.projectId, hiSFastScript.projectId) &&
            Objects.equals(this.scriptArgs, hiSFastScript.scriptArgs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scriptType, cmdUser, scriptContent, ecsIdList, name, projectId, scriptArgs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HISFastScript {\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    cmdUser: ").append(toIndentedString(cmdUser)).append("\n");
        sb.append("    scriptContent: ").append(toIndentedString(scriptContent)).append("\n");
        sb.append("    ecsIdList: ").append(toIndentedString(ecsIdList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    scriptArgs: ").append(toIndentedString(scriptArgs)).append("\n");
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

