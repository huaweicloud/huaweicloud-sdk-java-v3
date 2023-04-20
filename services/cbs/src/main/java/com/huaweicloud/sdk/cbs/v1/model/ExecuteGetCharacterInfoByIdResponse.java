package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Character;
import com.huaweicloud.sdk.cbs.v1.model.CharacterDimension;
import com.huaweicloud.sdk.cbs.v1.model.CharacterPosition;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteGetCharacterInfoByIdResponse extends SdkResponse {


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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="center_photo_url")
    

    private String centerPhotoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="left_photo_url")
    

    private String leftPhotoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preview_video_url")
    

    private String previewVideoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="right_photo_url")
    

    private String rightPhotoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="best_img_quality_preview_url")
    

    private String bestImgQualityPreviewUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="best_lip_sync_preview_url")
    

    private String bestLipSyncPreviewUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="best_mouth_rec_preview_url")
    

    private String bestMouthRecPreviewUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="have_segment_data")
    

    private Boolean haveSegmentData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="initial_video_url")
    

    private String initialVideoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="background_url")
    

    private String backgroundUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="model")
    

    private Integer model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charater_position")
    

    private CharacterPosition charaterPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charater_dimension")
    

    private CharacterDimension charaterDimension;

    public ExecuteGetCharacterInfoByIdResponse withCreateTime(String createTime) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withUpdateTime(String updateTime) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withCharacterName(String characterName) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withGender(Integer gender) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withId(String id) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withName(String name) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withPhotoUrl(String photoUrl) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withPosture(Integer posture) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withTrainFinishTimeEstimate(String trainFinishTimeEstimate) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withTrainStartTime(String trainStartTime) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withTrainStatus(Integer trainStatus) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withType(Integer type) {
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

    

    public ExecuteGetCharacterInfoByIdResponse withCenterPhotoUrl(String centerPhotoUrl) {
        this.centerPhotoUrl = centerPhotoUrl;
        return this;
    }

    


    /**
     * 形象在中心时的图片obs 地址
     * @return centerPhotoUrl
     */
    public String getCenterPhotoUrl() {
        return centerPhotoUrl;
    }

    public void setCenterPhotoUrl(String centerPhotoUrl) {
        this.centerPhotoUrl = centerPhotoUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 合成错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withLeftPhotoUrl(String leftPhotoUrl) {
        this.leftPhotoUrl = leftPhotoUrl;
        return this;
    }

    


    /**
     * 形象在左时的图片obs 地址 考虑兼容性：如果为null，形象无法使用左右配置
     * @return leftPhotoUrl
     */
    public String getLeftPhotoUrl() {
        return leftPhotoUrl;
    }

    public void setLeftPhotoUrl(String leftPhotoUrl) {
        this.leftPhotoUrl = leftPhotoUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withPreviewVideoUrl(String previewVideoUrl) {
        this.previewVideoUrl = previewVideoUrl;
        return this;
    }

    


    /**
     * 预览视频
     * @return previewVideoUrl
     */
    public String getPreviewVideoUrl() {
        return previewVideoUrl;
    }

    public void setPreviewVideoUrl(String previewVideoUrl) {
        this.previewVideoUrl = previewVideoUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withRightPhotoUrl(String rightPhotoUrl) {
        this.rightPhotoUrl = rightPhotoUrl;
        return this;
    }

    


    /**
     * 形象在右时的图片obs 地址 考虑兼容性：如果为null，形象无法使用左右配置
     * @return rightPhotoUrl
     */
    public String getRightPhotoUrl() {
        return rightPhotoUrl;
    }

    public void setRightPhotoUrl(String rightPhotoUrl) {
        this.rightPhotoUrl = rightPhotoUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withBestImgQualityPreviewUrl(String bestImgQualityPreviewUrl) {
        this.bestImgQualityPreviewUrl = bestImgQualityPreviewUrl;
        return this;
    }

    


    /**
     * 显示效果最佳预览
     * @return bestImgQualityPreviewUrl
     */
    public String getBestImgQualityPreviewUrl() {
        return bestImgQualityPreviewUrl;
    }

    public void setBestImgQualityPreviewUrl(String bestImgQualityPreviewUrl) {
        this.bestImgQualityPreviewUrl = bestImgQualityPreviewUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withBestLipSyncPreviewUrl(String bestLipSyncPreviewUrl) {
        this.bestLipSyncPreviewUrl = bestLipSyncPreviewUrl;
        return this;
    }

    


    /**
     * 音唇同步最佳预览
     * @return bestLipSyncPreviewUrl
     */
    public String getBestLipSyncPreviewUrl() {
        return bestLipSyncPreviewUrl;
    }

    public void setBestLipSyncPreviewUrl(String bestLipSyncPreviewUrl) {
        this.bestLipSyncPreviewUrl = bestLipSyncPreviewUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withBestMouthRecPreviewUrl(String bestMouthRecPreviewUrl) {
        this.bestMouthRecPreviewUrl = bestMouthRecPreviewUrl;
        return this;
    }

    


    /**
     * 嘴巴部分效果最佳
     * @return bestMouthRecPreviewUrl
     */
    public String getBestMouthRecPreviewUrl() {
        return bestMouthRecPreviewUrl;
    }

    public void setBestMouthRecPreviewUrl(String bestMouthRecPreviewUrl) {
        this.bestMouthRecPreviewUrl = bestMouthRecPreviewUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withHaveSegmentData(Boolean haveSegmentData) {
        this.haveSegmentData = haveSegmentData;
        return this;
    }

    


    /**
     * 是否有人像分割数据
     * @return haveSegmentData
     */
    public Boolean getHaveSegmentData() {
        return haveSegmentData;
    }

    public void setHaveSegmentData(Boolean haveSegmentData) {
        this.haveSegmentData = haveSegmentData;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withInitialVideoUrl(String initialVideoUrl) {
        this.initialVideoUrl = initialVideoUrl;
        return this;
    }

    


    /**
     * 合成原始视频地址
     * @return initialVideoUrl
     */
    public String getInitialVideoUrl() {
        return initialVideoUrl;
    }

    public void setInitialVideoUrl(String initialVideoUrl) {
        this.initialVideoUrl = initialVideoUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
        return this;
    }

    


    /**
     * 抠图背景地址
     * @return backgroundUrl
     */
    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withModel(Integer model) {
        this.model = model;
        return this;
    }

    


    /**
     * 0: best img quality 1: best lip sync 2: best mouth rec
     * @return model
     */
    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withCharaterPosition(CharacterPosition charaterPosition) {
        this.charaterPosition = charaterPosition;
        return this;
    }

    public ExecuteGetCharacterInfoByIdResponse withCharaterPosition(Consumer<CharacterPosition> charaterPositionSetter) {
        if(this.charaterPosition == null ){
            this.charaterPosition = new CharacterPosition();
            charaterPositionSetter.accept(this.charaterPosition);
        }
        
        return this;
    }


    /**
     * Get charaterPosition
     * @return charaterPosition
     */
    public CharacterPosition getCharaterPosition() {
        return charaterPosition;
    }

    public void setCharaterPosition(CharacterPosition charaterPosition) {
        this.charaterPosition = charaterPosition;
    }

    

    public ExecuteGetCharacterInfoByIdResponse withCharaterDimension(CharacterDimension charaterDimension) {
        this.charaterDimension = charaterDimension;
        return this;
    }

    public ExecuteGetCharacterInfoByIdResponse withCharaterDimension(Consumer<CharacterDimension> charaterDimensionSetter) {
        if(this.charaterDimension == null ){
            this.charaterDimension = new CharacterDimension();
            charaterDimensionSetter.accept(this.charaterDimension);
        }
        
        return this;
    }


    /**
     * Get charaterDimension
     * @return charaterDimension
     */
    public CharacterDimension getCharaterDimension() {
        return charaterDimension;
    }

    public void setCharaterDimension(CharacterDimension charaterDimension) {
        this.charaterDimension = charaterDimension;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetCharacterInfoByIdResponse executeGetCharacterInfoByIdResponse = (ExecuteGetCharacterInfoByIdResponse) o;
        return Objects.equals(this.createTime, executeGetCharacterInfoByIdResponse.createTime) &&
            Objects.equals(this.updateTime, executeGetCharacterInfoByIdResponse.updateTime) &&
            Objects.equals(this.characterName, executeGetCharacterInfoByIdResponse.characterName) &&
            Objects.equals(this.gender, executeGetCharacterInfoByIdResponse.gender) &&
            Objects.equals(this.id, executeGetCharacterInfoByIdResponse.id) &&
            Objects.equals(this.name, executeGetCharacterInfoByIdResponse.name) &&
            Objects.equals(this.photoUrl, executeGetCharacterInfoByIdResponse.photoUrl) &&
            Objects.equals(this.posture, executeGetCharacterInfoByIdResponse.posture) &&
            Objects.equals(this.trainFinishTimeEstimate, executeGetCharacterInfoByIdResponse.trainFinishTimeEstimate) &&
            Objects.equals(this.trainStartTime, executeGetCharacterInfoByIdResponse.trainStartTime) &&
            Objects.equals(this.trainStatus, executeGetCharacterInfoByIdResponse.trainStatus) &&
            Objects.equals(this.type, executeGetCharacterInfoByIdResponse.type) &&
            Objects.equals(this.centerPhotoUrl, executeGetCharacterInfoByIdResponse.centerPhotoUrl) &&
            Objects.equals(this.errorMsg, executeGetCharacterInfoByIdResponse.errorMsg) &&
            Objects.equals(this.leftPhotoUrl, executeGetCharacterInfoByIdResponse.leftPhotoUrl) &&
            Objects.equals(this.previewVideoUrl, executeGetCharacterInfoByIdResponse.previewVideoUrl) &&
            Objects.equals(this.rightPhotoUrl, executeGetCharacterInfoByIdResponse.rightPhotoUrl) &&
            Objects.equals(this.bestImgQualityPreviewUrl, executeGetCharacterInfoByIdResponse.bestImgQualityPreviewUrl) &&
            Objects.equals(this.bestLipSyncPreviewUrl, executeGetCharacterInfoByIdResponse.bestLipSyncPreviewUrl) &&
            Objects.equals(this.bestMouthRecPreviewUrl, executeGetCharacterInfoByIdResponse.bestMouthRecPreviewUrl) &&
            Objects.equals(this.haveSegmentData, executeGetCharacterInfoByIdResponse.haveSegmentData) &&
            Objects.equals(this.initialVideoUrl, executeGetCharacterInfoByIdResponse.initialVideoUrl) &&
            Objects.equals(this.backgroundUrl, executeGetCharacterInfoByIdResponse.backgroundUrl) &&
            Objects.equals(this.model, executeGetCharacterInfoByIdResponse.model) &&
            Objects.equals(this.charaterPosition, executeGetCharacterInfoByIdResponse.charaterPosition) &&
            Objects.equals(this.charaterDimension, executeGetCharacterInfoByIdResponse.charaterDimension);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, characterName, gender, id, name, photoUrl, posture, trainFinishTimeEstimate, trainStartTime, trainStatus, type, centerPhotoUrl, errorMsg, leftPhotoUrl, previewVideoUrl, rightPhotoUrl, bestImgQualityPreviewUrl, bestLipSyncPreviewUrl, bestMouthRecPreviewUrl, haveSegmentData, initialVideoUrl, backgroundUrl, model, charaterPosition, charaterDimension);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetCharacterInfoByIdResponse {\n");
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
        sb.append("    centerPhotoUrl: ").append(toIndentedString(centerPhotoUrl)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    leftPhotoUrl: ").append(toIndentedString(leftPhotoUrl)).append("\n");
        sb.append("    previewVideoUrl: ").append(toIndentedString(previewVideoUrl)).append("\n");
        sb.append("    rightPhotoUrl: ").append(toIndentedString(rightPhotoUrl)).append("\n");
        sb.append("    bestImgQualityPreviewUrl: ").append(toIndentedString(bestImgQualityPreviewUrl)).append("\n");
        sb.append("    bestLipSyncPreviewUrl: ").append(toIndentedString(bestLipSyncPreviewUrl)).append("\n");
        sb.append("    bestMouthRecPreviewUrl: ").append(toIndentedString(bestMouthRecPreviewUrl)).append("\n");
        sb.append("    haveSegmentData: ").append(toIndentedString(haveSegmentData)).append("\n");
        sb.append("    initialVideoUrl: ").append(toIndentedString(initialVideoUrl)).append("\n");
        sb.append("    backgroundUrl: ").append(toIndentedString(backgroundUrl)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    charaterPosition: ").append(toIndentedString(charaterPosition)).append("\n");
        sb.append("    charaterDimension: ").append(toIndentedString(charaterDimension)).append("\n");
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

