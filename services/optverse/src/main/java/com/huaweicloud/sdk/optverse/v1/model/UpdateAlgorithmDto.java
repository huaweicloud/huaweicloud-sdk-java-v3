package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateAlgorithmDto
 */
public class UpdateAlgorithmDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_command")

    private String buildCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private String env;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    private String picture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private ProgramLang lang;

    public UpdateAlgorithmDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID，您可以从[获取项目ID](ai4sservice_03_0033.xml)中获取。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateAlgorithmDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 算法id **约束限制**： 不涉及 **取值范围**： 长度[0,64] **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateAlgorithmDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 算法名称 **约束限制**： 不涉及 **取值范围**： 长度[0,128] **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAlgorithmDto withBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }

    /**
     * **参数解释**： 算法构建命令 **约束限制**： 不涉及 **取值范围**： 长度[0,256] **默认取值**： 不涉及 
     * @return buildCommand
     */
    public String getBuildCommand() {
        return buildCommand;
    }

    public void setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
    }

    public UpdateAlgorithmDto withEnv(String env) {
        this.env = env;
        return this;
    }

    /**
     * **参数解释**： 算法预处理命令，bash脚本，python为pip install等预处理过程。 **约束限制**： 不涉及 **取值范围**： 长度[0,256] **默认取值**： 不涉及 
     * @return env
     */
    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public UpdateAlgorithmDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 算法描述。 **约束限制**： 不涉及 **取值范围**： 长度[0,32768] **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAlgorithmDto withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**： 算法默认启动指令 **约束限制**： 不涉及 **取值范围**： 长度[0,256] **默认取值**： 不涉及 
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public UpdateAlgorithmDto withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**： 算法的创建时间 **约束限制**： 不涉及 **取值范围**： [0,9999999999999] **默认取值**： 无 
     * minimum: 0
     * maximum: 9999999999999
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public UpdateAlgorithmDto withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /**
     * **参数解释**： 算法项目的图标 **约束限制**： 不涉及 **取值范围**： [0,65536] **默认取值**： 无 
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public UpdateAlgorithmDto withLang(ProgramLang lang) {
        this.lang = lang;
        return this;
    }

    /**
     * Get lang
     * @return lang
     */
    public ProgramLang getLang() {
        return lang;
    }

    public void setLang(ProgramLang lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlgorithmDto that = (UpdateAlgorithmDto) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.buildCommand, that.buildCommand)
            && Objects.equals(this.env, that.env) && Objects.equals(this.description, that.description)
            && Objects.equals(this.command, that.command) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.picture, that.picture) && Objects.equals(this.lang, that.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, id, name, buildCommand, env, description, command, createAt, picture, lang);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlgorithmDto {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    buildCommand: ").append(toIndentedString(buildCommand)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
