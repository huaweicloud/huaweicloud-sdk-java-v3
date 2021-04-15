package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AudioProcess;
import com.huaweicloud.sdk.mpc.v1.model.AudioTrack;
import com.huaweicloud.sdk.mpc.v1.model.Audit;
import com.huaweicloud.sdk.mpc.v1.model.AvParameters;
import com.huaweicloud.sdk.mpc.v1.model.Crop;
import com.huaweicloud.sdk.mpc.v1.model.DigitalWatermark;
import com.huaweicloud.sdk.mpc.v1.model.Encryption;
import com.huaweicloud.sdk.mpc.v1.model.MultiAudio;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import com.huaweicloud.sdk.mpc.v1.model.QualityEnhance;
import com.huaweicloud.sdk.mpc.v1.model.SpecialEffect;
import com.huaweicloud.sdk.mpc.v1.model.Subtitle;
import com.huaweicloud.sdk.mpc.v1.model.SystemProcess;
import com.huaweicloud.sdk.mpc.v1.model.TemplateExtend;
import com.huaweicloud.sdk.mpc.v1.model.Thumbnail;
import com.huaweicloud.sdk.mpc.v1.model.VideoProcess;
import com.huaweicloud.sdk.mpc.v1.model.WatermarkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateTranscodingReq
 */
public class CreateTranscodingReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trans_template_id")
    
    private List<Integer> transTemplateId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="av_parameters")
    
    private List<AvParameters> avParameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_filenames")
    
    private List<String> outputFilenames = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="watermarks")
    
    private List<WatermarkRequest> watermarks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail")
    
    private Thumbnail thumbnail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="digital_watermark")
    
    private DigitalWatermark digitalWatermark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_user")
    
    private Boolean vipUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_project_id")
    
    private String tenantProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private Integer priority;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit")
    
    private Audit audit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitle")
    
    private Subtitle subtitle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="special_effect")
    
    private SpecialEffect specialEffect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    
    private Encryption encryption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crop")
    
    private Crop crop;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_track")
    
    private AudioTrack audioTrack;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multi_audio")
    
    private MultiAudio multiAudio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_process")
    
    private VideoProcess videoProcess;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_process")
    
    private AudioProcess audioProcess;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality_enhance")
    
    private QualityEnhance qualityEnhance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="system_process")
    
    private SystemProcess systemProcess;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_extend")
    
    private TemplateExtend templateExtend;

    public CreateTranscodingReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateTranscodingReq withInput(Consumer<ObsObjInfo> inputSetter) {
        if(this.input == null ){
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

    

    public CreateTranscodingReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateTranscodingReq withOutput(Consumer<ObsObjInfo> outputSetter) {
        if(this.output == null ){
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

    

    public CreateTranscodingReq withTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    
    public CreateTranscodingReq addTransTemplateIdItem(Integer transTemplateIdItem) {
        if(this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        this.transTemplateId.add(transTemplateIdItem);
        return this;
    }

    public CreateTranscodingReq withTransTemplateId(Consumer<List<Integer>> transTemplateIdSetter) {
        if(this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        transTemplateIdSetter.accept(this.transTemplateId);
        return this;
    }

    /**
     * 转码模板ID，没带av_parameter参数时，必须带该参数，数组，每一路转码输出对应一个转码配置模板ID，最多支持9个模板ID。  多个转码模板中如下参数可变，其他都必须一致：  - 视频bitrate，height，width。 
     * @return transTemplateId
     */
    public List<Integer> getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    

    public CreateTranscodingReq withAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
        return this;
    }

    
    public CreateTranscodingReq addAvParametersItem(AvParameters avParametersItem) {
        if(this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        this.avParameters.add(avParametersItem);
        return this;
    }

    public CreateTranscodingReq withAvParameters(Consumer<List<AvParameters>> avParametersSetter) {
        if(this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        avParametersSetter.accept(this.avParameters);
        return this;
    }

    /**
     * 转码参数。  若同时设置“trans_template_id”和此参数，则优先使用此参数进行转码，不带trans_template_id时，该参数必选。 
     * @return avParameters
     */
    public List<AvParameters> getAvParameters() {
        return avParameters;
    }

    public void setAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
    }

    

    public CreateTranscodingReq withOutputFilenames(List<String> outputFilenames) {
        this.outputFilenames = outputFilenames;
        return this;
    }

    
    public CreateTranscodingReq addOutputFilenamesItem(String outputFilenamesItem) {
        if(this.outputFilenames == null) {
            this.outputFilenames = new ArrayList<>();
        }
        this.outputFilenames.add(outputFilenamesItem);
        return this;
    }

    public CreateTranscodingReq withOutputFilenames(Consumer<List<String>> outputFilenamesSetter) {
        if(this.outputFilenames == null) {
            this.outputFilenames = new ArrayList<>();
        }
        outputFilenamesSetter.accept(this.outputFilenames);
        return this;
    }

    /**
     * 输出文件名称，每一路转码输出对应一个名称，需要与转码模板ID数组的顺序对应。  - 若设置该参数，表示输出文件按该参数命名。 - 若不设置该参数，表示输出文件按默认方式命名。 
     * @return outputFilenames
     */
    public List<String> getOutputFilenames() {
        return outputFilenames;
    }

    public void setOutputFilenames(List<String> outputFilenames) {
        this.outputFilenames = outputFilenames;
    }

    

    public CreateTranscodingReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 用户自定义数据，该字段可在查询接口或消息通知中按原内容透传给用户。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    

    public CreateTranscodingReq withWatermarks(List<WatermarkRequest> watermarks) {
        this.watermarks = watermarks;
        return this;
    }

    
    public CreateTranscodingReq addWatermarksItem(WatermarkRequest watermarksItem) {
        if(this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        this.watermarks.add(watermarksItem);
        return this;
    }

    public CreateTranscodingReq withWatermarks(Consumer<List<WatermarkRequest>> watermarksSetter) {
        if(this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        watermarksSetter.accept(this.watermarks);
        return this;
    }

    /**
     * 图片水印参数，数组，最多支持20个成员。 
     * @return watermarks
     */
    public List<WatermarkRequest> getWatermarks() {
        return watermarks;
    }

    public void setWatermarks(List<WatermarkRequest> watermarks) {
        this.watermarks = watermarks;
    }

    

    public CreateTranscodingReq withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public CreateTranscodingReq withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
        if(this.thumbnail == null ){
            this.thumbnail = new Thumbnail();
            thumbnailSetter.accept(this.thumbnail);
        }
        
        return this;
    }


    /**
     * Get thumbnail
     * @return thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    

    public CreateTranscodingReq withDigitalWatermark(DigitalWatermark digitalWatermark) {
        this.digitalWatermark = digitalWatermark;
        return this;
    }

    public CreateTranscodingReq withDigitalWatermark(Consumer<DigitalWatermark> digitalWatermarkSetter) {
        if(this.digitalWatermark == null ){
            this.digitalWatermark = new DigitalWatermark();
            digitalWatermarkSetter.accept(this.digitalWatermark);
        }
        
        return this;
    }


    /**
     * Get digitalWatermark
     * @return digitalWatermark
     */
    public DigitalWatermark getDigitalWatermark() {
        return digitalWatermark;
    }

    public void setDigitalWatermark(DigitalWatermark digitalWatermark) {
        this.digitalWatermark = digitalWatermark;
    }

    

    public CreateTranscodingReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public CreateTranscodingReq withVipUser(Boolean vipUser) {
        this.vipUser = vipUser;
        return this;
    }

    


    /**
     * 是否vip用户
     * @return vipUser
     */
    public Boolean getVipUser() {
        return vipUser;
    }

    public void setVipUser(Boolean vipUser) {
        this.vipUser = vipUser;
    }

    

    public CreateTranscodingReq withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务Id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public CreateTranscodingReq withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 租户域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public CreateTranscodingReq withTenantProjectId(String tenantProjectId) {
        this.tenantProjectId = tenantProjectId;
        return this;
    }

    


    /**
     * 租户Id
     * @return tenantProjectId
     */
    public String getTenantProjectId() {
        return tenantProjectId;
    }

    public void setTenantProjectId(String tenantProjectId) {
        this.tenantProjectId = tenantProjectId;
    }

    

    public CreateTranscodingReq withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 任务优先级，取值如下： - 9代表高优先级。 - 6代表中优先级，默认为6。  暂时只支持6和9。 
     * minimum: 0
     * maximum: 9
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    

    public CreateTranscodingReq withAudit(Audit audit) {
        this.audit = audit;
        return this;
    }

    public CreateTranscodingReq withAudit(Consumer<Audit> auditSetter) {
        if(this.audit == null ){
            this.audit = new Audit();
            auditSetter.accept(this.audit);
        }
        
        return this;
    }


    /**
     * Get audit
     * @return audit
     */
    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    

    public CreateTranscodingReq withSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public CreateTranscodingReq withSubtitle(Consumer<Subtitle> subtitleSetter) {
        if(this.subtitle == null ){
            this.subtitle = new Subtitle();
            subtitleSetter.accept(this.subtitle);
        }
        
        return this;
    }


    /**
     * Get subtitle
     * @return subtitle
     */
    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    

    public CreateTranscodingReq withSpecialEffect(SpecialEffect specialEffect) {
        this.specialEffect = specialEffect;
        return this;
    }

    public CreateTranscodingReq withSpecialEffect(Consumer<SpecialEffect> specialEffectSetter) {
        if(this.specialEffect == null ){
            this.specialEffect = new SpecialEffect();
            specialEffectSetter.accept(this.specialEffect);
        }
        
        return this;
    }


    /**
     * Get specialEffect
     * @return specialEffect
     */
    public SpecialEffect getSpecialEffect() {
        return specialEffect;
    }

    public void setSpecialEffect(SpecialEffect specialEffect) {
        this.specialEffect = specialEffect;
    }

    

    public CreateTranscodingReq withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public CreateTranscodingReq withEncryption(Consumer<Encryption> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new Encryption();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    

    public CreateTranscodingReq withCrop(Crop crop) {
        this.crop = crop;
        return this;
    }

    public CreateTranscodingReq withCrop(Consumer<Crop> cropSetter) {
        if(this.crop == null ){
            this.crop = new Crop();
            cropSetter.accept(this.crop);
        }
        
        return this;
    }


    /**
     * Get crop
     * @return crop
     */
    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    

    public CreateTranscodingReq withAudioTrack(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
        return this;
    }

    public CreateTranscodingReq withAudioTrack(Consumer<AudioTrack> audioTrackSetter) {
        if(this.audioTrack == null ){
            this.audioTrack = new AudioTrack();
            audioTrackSetter.accept(this.audioTrack);
        }
        
        return this;
    }


    /**
     * Get audioTrack
     * @return audioTrack
     */
    public AudioTrack getAudioTrack() {
        return audioTrack;
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }

    

    public CreateTranscodingReq withMultiAudio(MultiAudio multiAudio) {
        this.multiAudio = multiAudio;
        return this;
    }

    public CreateTranscodingReq withMultiAudio(Consumer<MultiAudio> multiAudioSetter) {
        if(this.multiAudio == null ){
            this.multiAudio = new MultiAudio();
            multiAudioSetter.accept(this.multiAudio);
        }
        
        return this;
    }


    /**
     * Get multiAudio
     * @return multiAudio
     */
    public MultiAudio getMultiAudio() {
        return multiAudio;
    }

    public void setMultiAudio(MultiAudio multiAudio) {
        this.multiAudio = multiAudio;
    }

    

    public CreateTranscodingReq withVideoProcess(VideoProcess videoProcess) {
        this.videoProcess = videoProcess;
        return this;
    }

    public CreateTranscodingReq withVideoProcess(Consumer<VideoProcess> videoProcessSetter) {
        if(this.videoProcess == null ){
            this.videoProcess = new VideoProcess();
            videoProcessSetter.accept(this.videoProcess);
        }
        
        return this;
    }


    /**
     * Get videoProcess
     * @return videoProcess
     */
    public VideoProcess getVideoProcess() {
        return videoProcess;
    }

    public void setVideoProcess(VideoProcess videoProcess) {
        this.videoProcess = videoProcess;
    }

    

    public CreateTranscodingReq withAudioProcess(AudioProcess audioProcess) {
        this.audioProcess = audioProcess;
        return this;
    }

    public CreateTranscodingReq withAudioProcess(Consumer<AudioProcess> audioProcessSetter) {
        if(this.audioProcess == null ){
            this.audioProcess = new AudioProcess();
            audioProcessSetter.accept(this.audioProcess);
        }
        
        return this;
    }


    /**
     * Get audioProcess
     * @return audioProcess
     */
    public AudioProcess getAudioProcess() {
        return audioProcess;
    }

    public void setAudioProcess(AudioProcess audioProcess) {
        this.audioProcess = audioProcess;
    }

    

    public CreateTranscodingReq withQualityEnhance(QualityEnhance qualityEnhance) {
        this.qualityEnhance = qualityEnhance;
        return this;
    }

    public CreateTranscodingReq withQualityEnhance(Consumer<QualityEnhance> qualityEnhanceSetter) {
        if(this.qualityEnhance == null ){
            this.qualityEnhance = new QualityEnhance();
            qualityEnhanceSetter.accept(this.qualityEnhance);
        }
        
        return this;
    }


    /**
     * Get qualityEnhance
     * @return qualityEnhance
     */
    public QualityEnhance getQualityEnhance() {
        return qualityEnhance;
    }

    public void setQualityEnhance(QualityEnhance qualityEnhance) {
        this.qualityEnhance = qualityEnhance;
    }

    

    public CreateTranscodingReq withSystemProcess(SystemProcess systemProcess) {
        this.systemProcess = systemProcess;
        return this;
    }

    public CreateTranscodingReq withSystemProcess(Consumer<SystemProcess> systemProcessSetter) {
        if(this.systemProcess == null ){
            this.systemProcess = new SystemProcess();
            systemProcessSetter.accept(this.systemProcess);
        }
        
        return this;
    }


    /**
     * Get systemProcess
     * @return systemProcess
     */
    public SystemProcess getSystemProcess() {
        return systemProcess;
    }

    public void setSystemProcess(SystemProcess systemProcess) {
        this.systemProcess = systemProcess;
    }

    

    public CreateTranscodingReq withTemplateExtend(TemplateExtend templateExtend) {
        this.templateExtend = templateExtend;
        return this;
    }

    public CreateTranscodingReq withTemplateExtend(Consumer<TemplateExtend> templateExtendSetter) {
        if(this.templateExtend == null ){
            this.templateExtend = new TemplateExtend();
            templateExtendSetter.accept(this.templateExtend);
        }
        
        return this;
    }


    /**
     * Get templateExtend
     * @return templateExtend
     */
    public TemplateExtend getTemplateExtend() {
        return templateExtend;
    }

    public void setTemplateExtend(TemplateExtend templateExtend) {
        this.templateExtend = templateExtend;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTranscodingReq createTranscodingReq = (CreateTranscodingReq) o;
        return Objects.equals(this.input, createTranscodingReq.input) &&
            Objects.equals(this.output, createTranscodingReq.output) &&
            Objects.equals(this.transTemplateId, createTranscodingReq.transTemplateId) &&
            Objects.equals(this.avParameters, createTranscodingReq.avParameters) &&
            Objects.equals(this.outputFilenames, createTranscodingReq.outputFilenames) &&
            Objects.equals(this.userData, createTranscodingReq.userData) &&
            Objects.equals(this.watermarks, createTranscodingReq.watermarks) &&
            Objects.equals(this.thumbnail, createTranscodingReq.thumbnail) &&
            Objects.equals(this.digitalWatermark, createTranscodingReq.digitalWatermark) &&
            Objects.equals(this.projectId, createTranscodingReq.projectId) &&
            Objects.equals(this.vipUser, createTranscodingReq.vipUser) &&
            Objects.equals(this.taskId, createTranscodingReq.taskId) &&
            Objects.equals(this.domainName, createTranscodingReq.domainName) &&
            Objects.equals(this.tenantProjectId, createTranscodingReq.tenantProjectId) &&
            Objects.equals(this.priority, createTranscodingReq.priority) &&
            Objects.equals(this.audit, createTranscodingReq.audit) &&
            Objects.equals(this.subtitle, createTranscodingReq.subtitle) &&
            Objects.equals(this.specialEffect, createTranscodingReq.specialEffect) &&
            Objects.equals(this.encryption, createTranscodingReq.encryption) &&
            Objects.equals(this.crop, createTranscodingReq.crop) &&
            Objects.equals(this.audioTrack, createTranscodingReq.audioTrack) &&
            Objects.equals(this.multiAudio, createTranscodingReq.multiAudio) &&
            Objects.equals(this.videoProcess, createTranscodingReq.videoProcess) &&
            Objects.equals(this.audioProcess, createTranscodingReq.audioProcess) &&
            Objects.equals(this.qualityEnhance, createTranscodingReq.qualityEnhance) &&
            Objects.equals(this.systemProcess, createTranscodingReq.systemProcess) &&
            Objects.equals(this.templateExtend, createTranscodingReq.templateExtend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(input, output, transTemplateId, avParameters, outputFilenames, userData, watermarks, thumbnail, digitalWatermark, projectId, vipUser, taskId, domainName, tenantProjectId, priority, audit, subtitle, specialEffect, encryption, crop, audioTrack, multiAudio, videoProcess, audioProcess, qualityEnhance, systemProcess, templateExtend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTranscodingReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    avParameters: ").append(toIndentedString(avParameters)).append("\n");
        sb.append("    outputFilenames: ").append(toIndentedString(outputFilenames)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    watermarks: ").append(toIndentedString(watermarks)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    digitalWatermark: ").append(toIndentedString(digitalWatermark)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vipUser: ").append(toIndentedString(vipUser)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    tenantProjectId: ").append(toIndentedString(tenantProjectId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
        sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
        sb.append("    specialEffect: ").append(toIndentedString(specialEffect)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    crop: ").append(toIndentedString(crop)).append("\n");
        sb.append("    audioTrack: ").append(toIndentedString(audioTrack)).append("\n");
        sb.append("    multiAudio: ").append(toIndentedString(multiAudio)).append("\n");
        sb.append("    videoProcess: ").append(toIndentedString(videoProcess)).append("\n");
        sb.append("    audioProcess: ").append(toIndentedString(audioProcess)).append("\n");
        sb.append("    qualityEnhance: ").append(toIndentedString(qualityEnhance)).append("\n");
        sb.append("    systemProcess: ").append(toIndentedString(systemProcess)).append("\n");
        sb.append("    templateExtend: ").append(toIndentedString(templateExtend)).append("\n");
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

