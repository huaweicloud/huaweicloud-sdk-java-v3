package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpsTuningOutput
 */
public class OpsTuningOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tools")

    private List<OpsToolOutput> tools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skills")

    private List<OpsSkillOutput> skills = null;

    public OpsTuningOutput withTools(List<OpsToolOutput> tools) {
        this.tools = tools;
        return this;
    }

    public OpsTuningOutput addToolsItem(OpsToolOutput toolsItem) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.add(toolsItem);
        return this;
    }

    public OpsTuningOutput withTools(Consumer<List<OpsToolOutput>> toolsSetter) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        toolsSetter.accept(this.tools);
        return this;
    }

    /**
     * **参数解释：** 待优化的工具列表，type为tool时必填。  **约束限制：** 不涉及  **取值范围：** 数组长度0-10。  **默认取值：** 空数组。
     * @return tools
     */
    public List<OpsToolOutput> getTools() {
        return tools;
    }

    public void setTools(List<OpsToolOutput> tools) {
        this.tools = tools;
    }

    public OpsTuningOutput withSkills(List<OpsSkillOutput> skills) {
        this.skills = skills;
        return this;
    }

    public OpsTuningOutput addSkillsItem(OpsSkillOutput skillsItem) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.add(skillsItem);
        return this;
    }

    public OpsTuningOutput withSkills(Consumer<List<OpsSkillOutput>> skillsSetter) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        skillsSetter.accept(this.skills);
        return this;
    }

    /**
     * **参数解释：** 待优化的技能列表，type为skill时必填。  **约束限制：** 不涉及  **取值范围：** 数组长度0-10。  **默认取值：** 空数组。
     * @return skills
     */
    public List<OpsSkillOutput> getSkills() {
        return skills;
    }

    public void setSkills(List<OpsSkillOutput> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningOutput that = (OpsTuningOutput) obj;
        return Objects.equals(this.tools, that.tools) && Objects.equals(this.skills, that.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tools, skills);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningOutput {\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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
