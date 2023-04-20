package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteGetCharactersRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="train_status")
    

    private Integer trainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_name")
    

    private String characterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_interact")
    

    private Boolean supportInteract;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gender")
    

    private String gender;

    public ExecuteGetCharactersRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ExecuteGetCharactersRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ExecuteGetCharactersRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 形象类型： 0：预制形象 1：用户自定义形象
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public ExecuteGetCharactersRequest withTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
        return this;
    }

    


    /**
     * 训练状态： 0：预处理 1：训练中 2：训练成功 3：训练失败 4：预览视频生成中
     * @return trainStatus
     */
    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    

    public ExecuteGetCharactersRequest withCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }

    


    /**
     * Get characterName
     * @return characterName
     */
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    

    public ExecuteGetCharactersRequest withSupportInteract(Boolean supportInteract) {
        this.supportInteract = supportInteract;
        return this;
    }

    


    /**
     * 是否只获取支持交互式的数字人；默认：false 获取全部
     * @return supportInteract
     */
    public Boolean getSupportInteract() {
        return supportInteract;
    }

    public void setSupportInteract(Boolean supportInteract) {
        this.supportInteract = supportInteract;
    }

    

    public ExecuteGetCharactersRequest withGender(String gender) {
        this.gender = gender;
        return this;
    }

    


    /**
     * 性别
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetCharactersRequest executeGetCharactersRequest = (ExecuteGetCharactersRequest) o;
        return Objects.equals(this.offset, executeGetCharactersRequest.offset) &&
            Objects.equals(this.limit, executeGetCharactersRequest.limit) &&
            Objects.equals(this.type, executeGetCharactersRequest.type) &&
            Objects.equals(this.trainStatus, executeGetCharactersRequest.trainStatus) &&
            Objects.equals(this.characterName, executeGetCharactersRequest.characterName) &&
            Objects.equals(this.supportInteract, executeGetCharactersRequest.supportInteract) &&
            Objects.equals(this.gender, executeGetCharactersRequest.gender);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, type, trainStatus, characterName, supportInteract, gender);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetCharactersRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    trainStatus: ").append(toIndentedString(trainStatus)).append("\n");
        sb.append("    characterName: ").append(toIndentedString(characterName)).append("\n");
        sb.append("    supportInteract: ").append(toIndentedString(supportInteract)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

