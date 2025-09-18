package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTranscodingsTaskResponse
 */
public class QueryTranscodingsTaskResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 任务执行状态。 
     */
    public static final class StatusEnum {

        /**
         * Enum NO_TASK for value: "NO_TASK"
         */
        public static final StatusEnum NO_TASK = new StatusEnum("NO_TASK");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StatusEnum WAITING = new StatusEnum("WAITING");

        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final StatusEnum TRANSCODING = new StatusEnum("TRANSCODING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum NEED_TO_BE_AUDIT for value: "NEED_TO_BE_AUDIT"
         */
        public static final StatusEnum NEED_TO_BE_AUDIT = new StatusEnum("NEED_TO_BE_AUDIT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NO_TASK", NO_TASK);
            map.put("WAITING", WAITING);
            map.put("TRANSCODING", TRANSCODING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("NEED_TO_BE_AUDIT", NEED_TO_BE_AUDIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_id")

    private List<Integer> transTemplateId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_name")

    private List<String> outputFileName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tips")

    private String tips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_detail")

    private TranscodeDetail transcodeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_output")

    private ObsObjInfo thumbnailOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_outputname")

    private String thumbnailOutputname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pic_info")

    private List<PicInfo> picInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "av_parameters")

    private List<AvParameters> avParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_manifests")

    private List<AdditionalManifests> additionalManifests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private List<FileMetaData> metadata = null;

    public QueryTranscodingsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public QueryTranscodingsTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryTranscodingsTaskResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务执行进度百分比, 取值范围：[0, 100]。 
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public QueryTranscodingsTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 转码任务启动时间 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QueryTranscodingsTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 转码任务结束时间 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    public QueryTranscodingsTaskResponse addTransTemplateIdItem(Integer transTemplateIdItem) {
        if (this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        this.transTemplateId.add(transTemplateIdItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(Consumer<List<Integer>> transTemplateIdSetter) {
        if (this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        transTemplateIdSetter.accept(this.transTemplateId);
        return this;
    }

    /**
     * 转码任务对应的转码模板ID 
     * @return transTemplateId
     */
    public List<Integer> getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public QueryTranscodingsTaskResponse withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public QueryTranscodingsTaskResponse withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public QueryTranscodingsTaskResponse withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public QueryTranscodingsTaskResponse withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public QueryTranscodingsTaskResponse withOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    public QueryTranscodingsTaskResponse addOutputFileNameItem(String outputFileNameItem) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        this.outputFileName.add(outputFileNameItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withOutputFileName(Consumer<List<String>> outputFileNameSetter) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        outputFileNameSetter.accept(this.outputFileName);
        return this;
    }

    /**
     * 转码生成的文件名，数组类型，可能包含多个，包含截图文件名。 
     * @return outputFileName
     */
    public List<String> getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
    }

    public QueryTranscodingsTaskResponse withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义数据。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public QueryTranscodingsTaskResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 转码任务的返回码。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryTranscodingsTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 转码任务描述，当转码出现异常时，此字段为异常的原因。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryTranscodingsTaskResponse withTips(String tips) {
        this.tips = tips;
        return this;
    }

    /**
     * 转码成功，但音频采样率过低时的提示。 
     * @return tips
     */
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
        return this;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(Consumer<TranscodeDetail> transcodeDetailSetter) {
        if (this.transcodeDetail == null) {
            this.transcodeDetail = new TranscodeDetail();
            transcodeDetailSetter.accept(this.transcodeDetail);
        }

        return this;
    }

    /**
     * Get transcodeDetail
     * @return transcodeDetail
     */
    public TranscodeDetail getTranscodeDetail() {
        return transcodeDetail;
    }

    public void setTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
        return this;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(Consumer<ObsObjInfo> thumbnailOutputSetter) {
        if (this.thumbnailOutput == null) {
            this.thumbnailOutput = new ObsObjInfo();
            thumbnailOutputSetter.accept(this.thumbnailOutput);
        }

        return this;
    }

    /**
     * Get thumbnailOutput
     * @return thumbnailOutput
     */
    public ObsObjInfo getThumbnailOutput() {
        return thumbnailOutput;
    }

    public void setThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
        return this;
    }

    /**
     * 截图压缩包名。 
     * @return thumbnailOutputname
     */
    public String getThumbnailOutputname() {
        return thumbnailOutputname;
    }

    public void setThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
    }

    public QueryTranscodingsTaskResponse withPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public QueryTranscodingsTaskResponse addPicInfoItem(PicInfo picInfoItem) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        this.picInfo.add(picInfoItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withPicInfo(Consumer<List<PicInfo>> picInfoSetter) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        picInfoSetter.accept(this.picInfo);
        return this;
    }

    /**
     * 截图文件信息。 
     * @return picInfo
     */
    public List<PicInfo> getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
    }

    public QueryTranscodingsTaskResponse withAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
        return this;
    }

    public QueryTranscodingsTaskResponse addAvParametersItem(AvParameters avParametersItem) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        this.avParameters.add(avParametersItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withAvParameters(Consumer<List<AvParameters>> avParametersSetter) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        avParametersSetter.accept(this.avParameters);
        return this;
    }

    /**
     * 转码参数。  若同时设置“trans_template_id”和此参数，则优先使用此参数进行转码。 
     * @return avParameters
     */
    public List<AvParameters> getAvParameters() {
        return avParameters;
    }

    public void setAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
    }

    public QueryTranscodingsTaskResponse withAdditionalManifests(List<AdditionalManifests> additionalManifests) {
        this.additionalManifests = additionalManifests;
        return this;
    }

    public QueryTranscodingsTaskResponse addAdditionalManifestsItem(AdditionalManifests additionalManifestsItem) {
        if (this.additionalManifests == null) {
            this.additionalManifests = new ArrayList<>();
        }
        this.additionalManifests.add(additionalManifestsItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withAdditionalManifests(
        Consumer<List<AdditionalManifests>> additionalManifestsSetter) {
        if (this.additionalManifests == null) {
            this.additionalManifests = new ArrayList<>();
        }
        additionalManifestsSetter.accept(this.additionalManifests);
        return this;
    }

    /**
     * 主索引定制参数。 
     * @return additionalManifests
     */
    public List<AdditionalManifests> getAdditionalManifests() {
        return additionalManifests;
    }

    public void setAdditionalManifests(List<AdditionalManifests> additionalManifests) {
        this.additionalManifests = additionalManifests;
    }

    public QueryTranscodingsTaskResponse withMetadata(List<FileMetaData> metadata) {
        this.metadata = metadata;
        return this;
    }

    public QueryTranscodingsTaskResponse addMetadataItem(FileMetaData metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withMetadata(Consumer<List<FileMetaData>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 输出文件的metadata信息 
     * @return metadata
     */
    public List<FileMetaData> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<FileMetaData> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTranscodingsTaskResponse that = (QueryTranscodingsTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.transTemplateId, that.transTemplateId)
            && Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.outputFileName, that.outputFileName) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tips, that.tips) && Objects.equals(this.transcodeDetail, that.transcodeDetail)
            && Objects.equals(this.thumbnailOutput, that.thumbnailOutput)
            && Objects.equals(this.thumbnailOutputname, that.thumbnailOutputname)
            && Objects.equals(this.picInfo, that.picInfo) && Objects.equals(this.avParameters, that.avParameters)
            && Objects.equals(this.additionalManifests, that.additionalManifests)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            progress,
            createTime,
            endTime,
            transTemplateId,
            input,
            output,
            outputFileName,
            userData,
            errorCode,
            description,
            tips,
            transcodeDetail,
            thumbnailOutput,
            thumbnailOutputname,
            picInfo,
            avParameters,
            additionalManifests,
            metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTranscodingsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    transcodeDetail: ").append(toIndentedString(transcodeDetail)).append("\n");
        sb.append("    thumbnailOutput: ").append(toIndentedString(thumbnailOutput)).append("\n");
        sb.append("    thumbnailOutputname: ").append(toIndentedString(thumbnailOutputname)).append("\n");
        sb.append("    picInfo: ").append(toIndentedString(picInfo)).append("\n");
        sb.append("    avParameters: ").append(toIndentedString(avParameters)).append("\n");
        sb.append("    additionalManifests: ").append(toIndentedString(additionalManifests)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
