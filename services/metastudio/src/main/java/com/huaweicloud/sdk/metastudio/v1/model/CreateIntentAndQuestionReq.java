package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建知识库意图和问法请求。
 */
public class CreateIntentAndQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_list")

    private List<KnowledgeQuestionCreateInfo> questionList = null;

    public CreateIntentAndQuestionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIntentAndQuestionReq withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * 问题答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public CreateIntentAndQuestionReq withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能ID。
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public CreateIntentAndQuestionReq withQuestionList(List<KnowledgeQuestionCreateInfo> questionList) {
        this.questionList = questionList;
        return this;
    }

    public CreateIntentAndQuestionReq addQuestionListItem(KnowledgeQuestionCreateInfo questionListItem) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        this.questionList.add(questionListItem);
        return this;
    }

    public CreateIntentAndQuestionReq withQuestionList(Consumer<List<KnowledgeQuestionCreateInfo>> questionListSetter) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        questionListSetter.accept(this.questionList);
        return this;
    }

    /**
     * 问法列表
     * @return questionList
     */
    public List<KnowledgeQuestionCreateInfo> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<KnowledgeQuestionCreateInfo> questionList) {
        this.questionList = questionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIntentAndQuestionReq that = (CreateIntentAndQuestionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.answer, that.answer)
            && Objects.equals(this.skillId, that.skillId) && Objects.equals(this.questionList, that.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, answer, skillId, questionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIntentAndQuestionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
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
