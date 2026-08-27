package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户创建算法必要的结构体
 */
public class AlgorithmCreateDto {

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
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    private String picture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private ProgramLang lang;

    public AlgorithmCreateDto withName(String name) {
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

    public AlgorithmCreateDto withBuildCommand(String buildCommand) {
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

    public AlgorithmCreateDto withEnv(String env) {
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

    public AlgorithmCreateDto withCommand(String command) {
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

    public AlgorithmCreateDto withDescription(String description) {
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

    public AlgorithmCreateDto withPicture(String picture) {
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

    public AlgorithmCreateDto withLang(ProgramLang lang) {
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
        AlgorithmCreateDto that = (AlgorithmCreateDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.buildCommand, that.buildCommand)
            && Objects.equals(this.env, that.env) && Objects.equals(this.command, that.command)
            && Objects.equals(this.description, that.description) && Objects.equals(this.picture, that.picture)
            && Objects.equals(this.lang, that.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, buildCommand, env, command, description, picture, lang);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmCreateDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    buildCommand: ").append(toIndentedString(buildCommand)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
