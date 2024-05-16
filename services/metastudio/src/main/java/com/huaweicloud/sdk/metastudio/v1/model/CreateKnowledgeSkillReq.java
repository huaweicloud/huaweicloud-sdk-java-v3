package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建知识库技能请求。
 */
public class CreateKnowledgeSkillReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identify")

    private String identify;

    public CreateKnowledgeSkillReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 技能名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateKnowledgeSkillReq withIdentify(String identify) {
        this.identify = identify;
        return this;
    }

    /**
     * 技能标识。
     * @return identify
     */
    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKnowledgeSkillReq that = (CreateKnowledgeSkillReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.identify, that.identify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, identify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKnowledgeSkillReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    identify: ").append(toIndentedString(identify)).append("\n");
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
