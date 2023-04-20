package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Time;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 形象
 */
public class Character  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_name")
    

    private String characterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gender")
    

    private Integer gender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="photo_url")
    

    private String photoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="posture")
    

    private Integer posture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="train_finish_time_estimate")
    

    private String trainFinishTimeEstimate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="train_start_time")
    

    private String trainStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="train_status")
    

    private Integer trainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private Integer type;

    public Character withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public Character withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public Character withCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }

    


    /**
     * 形象的个人姓名
     * @return characterName
     */
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    

    public Character withGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    


    /**
     * Get gender
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    

    public Character withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 形象id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Character withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 形象名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Character withPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    


    /**
     * 形象obs地址
     * @return photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    

    public Character withPosture(Integer posture) {
        this.posture = posture;
        return this;
    }

    


    /**
     * 姿态： 0：站姿全身 1：站姿半身 2：坐姿全身 3：坐姿半身
     * @return posture
     */
    public Integer getPosture() {
        return posture;
    }

    public void setPosture(Integer posture) {
        this.posture = posture;
    }

    

    public Character withTrainFinishTimeEstimate(String trainFinishTimeEstimate) {
        this.trainFinishTimeEstimate = trainFinishTimeEstimate;
        return this;
    }

    


    /**
     * 估算的训练结束时间
     * @return trainFinishTimeEstimate
     */
    public String getTrainFinishTimeEstimate() {
        return trainFinishTimeEstimate;
    }

    public void setTrainFinishTimeEstimate(String trainFinishTimeEstimate) {
        this.trainFinishTimeEstimate = trainFinishTimeEstimate;
    }

    

    public Character withTrainStartTime(String trainStartTime) {
        this.trainStartTime = trainStartTime;
        return this;
    }

    


    /**
     * 训练开始时间
     * @return trainStartTime
     */
    public String getTrainStartTime() {
        return trainStartTime;
    }

    public void setTrainStartTime(String trainStartTime) {
        this.trainStartTime = trainStartTime;
    }

    

    public Character withTrainStatus(Integer trainStatus) {
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

    

    public Character withType(Integer type) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Character character = (Character) o;
        return Objects.equals(this.createTime, character.createTime) &&
            Objects.equals(this.updateTime, character.updateTime) &&
            Objects.equals(this.characterName, character.characterName) &&
            Objects.equals(this.gender, character.gender) &&
            Objects.equals(this.id, character.id) &&
            Objects.equals(this.name, character.name) &&
            Objects.equals(this.photoUrl, character.photoUrl) &&
            Objects.equals(this.posture, character.posture) &&
            Objects.equals(this.trainFinishTimeEstimate, character.trainFinishTimeEstimate) &&
            Objects.equals(this.trainStartTime, character.trainStartTime) &&
            Objects.equals(this.trainStatus, character.trainStatus) &&
            Objects.equals(this.type, character.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, characterName, gender, id, name, photoUrl, posture, trainFinishTimeEstimate, trainStartTime, trainStatus, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Character {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    characterName: ").append(toIndentedString(characterName)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
        sb.append("    posture: ").append(toIndentedString(posture)).append("\n");
        sb.append("    trainFinishTimeEstimate: ").append(toIndentedString(trainFinishTimeEstimate)).append("\n");
        sb.append("    trainStartTime: ").append(toIndentedString(trainStartTime)).append("\n");
        sb.append("    trainStatus: ").append(toIndentedString(trainStatus)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

