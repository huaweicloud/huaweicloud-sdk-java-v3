package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.SkillResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TaskBotAnswers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    
    
    private String answer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="skill_id")
    
    
    private String skillId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="skill_responses")
    
    
    private List<SkillResponse> skillResponses = null;
    
    public TaskBotAnswers withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    


    /**
     * 答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public TaskBotAnswers withSkillId(String skillId) {
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

    

    public TaskBotAnswers withSkillResponses(List<SkillResponse> skillResponses) {
        this.skillResponses = skillResponses;
        return this;
    }

    
    public TaskBotAnswers addSkillResponsesItem(SkillResponse skillResponsesItem) {
        if(this.skillResponses == null) {
            this.skillResponses = new ArrayList<>();
        }
        this.skillResponses.add(skillResponsesItem);
        return this;
    }

    public TaskBotAnswers withSkillResponses(Consumer<List<SkillResponse>> skillResponsesSetter) {
        if(this.skillResponses == null) {
            this.skillResponses = new ArrayList<>();
        }
        skillResponsesSetter.accept(this.skillResponses);
        return this;
    }

    /**
     * 技能回复信息。
     * @return skillResponses
     */
    public List<SkillResponse> getSkillResponses() {
        return skillResponses;
    }

    public void setSkillResponses(List<SkillResponse> skillResponses) {
        this.skillResponses = skillResponses;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBotAnswers taskBotAnswers = (TaskBotAnswers) o;
        return Objects.equals(this.answer, taskBotAnswers.answer) &&
            Objects.equals(this.skillId, taskBotAnswers.skillId) &&
            Objects.equals(this.skillResponses, taskBotAnswers.skillResponses);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, skillId, skillResponses);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBotAnswers {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    skillResponses: ").append(toIndentedString(skillResponses)).append("\n");
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

