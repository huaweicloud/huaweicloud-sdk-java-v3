package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import com.huaweicloud.sdk.mpc.v1.model.ThumbnailPara;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateThumbReq
 */
public class CreateThumbReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_para")
    
    private ThumbnailPara thumbnailPara = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tar")
    
    private Integer tar = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync")
    
    private Integer sync = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="original_dir")
    
    private Integer originalDir = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_project_id")
    
    private String tenantProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="canonical_grant_id")
    
    private String canonicalGrantId;

    public CreateThumbReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateThumbReq withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public CreateThumbReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateThumbReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateThumbReq withThumbnailPara(ThumbnailPara thumbnailPara) {
        this.thumbnailPara = thumbnailPara;
        return this;
    }

    public CreateThumbReq withThumbnailPara(Consumer<ThumbnailPara> thumbnailParaSetter) {
        if(this.thumbnailPara == null ){
            this.thumbnailPara = new ThumbnailPara();
            thumbnailParaSetter.accept(this.thumbnailPara);
        }
        
        return this;
    }


    /**
     * Get thumbnailPara
     * @return thumbnailPara
     */
    public ThumbnailPara getThumbnailPara() {
        return thumbnailPara;
    }

    public void setThumbnailPara(ThumbnailPara thumbnailPara) {
        this.thumbnailPara = thumbnailPara;
    }

    public CreateThumbReq withTar(Integer tar) {
        this.tar = tar;
        return this;
    }

    


    /**
     * 是否压缩抽帧图片生成tar包。  取值如下：  - 0：压缩。 - 1：不压缩 
     * minimum: 0
     * maximum: 1
     * @return tar
     */
    public Integer getTar() {
        return tar;
    }

    public void setTar(Integer tar) {
        this.tar = tar;
    }

    public CreateThumbReq withSync(Integer sync) {
        this.sync = sync;
        return this;
    }

    


    /**
     * 是否同步处理，同步处理是指不下载全部文件，快速定位到截图位置进行截图。  取值如下： - 0：排队处理。 - 1：同步处理，暂只支持按时间点截单张图。 
     * minimum: 0
     * maximum: 1
     * @return sync
     */
    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }

    public CreateThumbReq withOriginalDir(Integer originalDir) {
        this.originalDir = originalDir;
        return this;
    }

    


    /**
     * 是否使用原始输出目录。  取值如下： - 0：不使用原始输出目录，下发的输出目录后面追加随机目录，防止截图文件outputUri相同被覆盖。 - 1：使用原始输出目录。 
     * minimum: 0
     * maximum: 1
     * @return originalDir
     */
    public Integer getOriginalDir() {
        return originalDir;
    }

    public void setOriginalDir(Integer originalDir) {
        this.originalDir = originalDir;
    }

    public CreateThumbReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户Id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateThumbReq withTenantProjectId(String tenantProjectId) {
        this.tenantProjectId = tenantProjectId;
        return this;
    }

    


    /**
     * vod租户Id
     * @return tenantProjectId
     */
    public String getTenantProjectId() {
        return tenantProjectId;
    }

    public void setTenantProjectId(String tenantProjectId) {
        this.tenantProjectId = tenantProjectId;
    }

    public CreateThumbReq withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * domain名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateThumbReq withCanonicalGrantId(String canonicalGrantId) {
        this.canonicalGrantId = canonicalGrantId;
        return this;
    }

    


    /**
     * 用户domainId
     * @return canonicalGrantId
     */
    public String getCanonicalGrantId() {
        return canonicalGrantId;
    }

    public void setCanonicalGrantId(String canonicalGrantId) {
        this.canonicalGrantId = canonicalGrantId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateThumbReq createThumbReq = (CreateThumbReq) o;
        return Objects.equals(this.input, createThumbReq.input) &&
            Objects.equals(this.output, createThumbReq.output) &&
            Objects.equals(this.thumbnailPara, createThumbReq.thumbnailPara) &&
            Objects.equals(this.tar, createThumbReq.tar) &&
            Objects.equals(this.sync, createThumbReq.sync) &&
            Objects.equals(this.originalDir, createThumbReq.originalDir) &&
            Objects.equals(this.projectId, createThumbReq.projectId) &&
            Objects.equals(this.tenantProjectId, createThumbReq.tenantProjectId) &&
            Objects.equals(this.domainName, createThumbReq.domainName) &&
            Objects.equals(this.canonicalGrantId, createThumbReq.canonicalGrantId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(input, output, thumbnailPara, tar, sync, originalDir, projectId, tenantProjectId, domainName, canonicalGrantId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThumbReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    thumbnailPara: ").append(toIndentedString(thumbnailPara)).append("\n");
        sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    originalDir: ").append(toIndentedString(originalDir)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantProjectId: ").append(toIndentedString(tenantProjectId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    canonicalGrantId: ").append(toIndentedString(canonicalGrantId)).append("\n");
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

