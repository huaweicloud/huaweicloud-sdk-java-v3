package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateThumbReq
 */
public class CreateThumbReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_para")

    private ThumbnailPara thumbnailPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tar")

    private Integer tar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private Integer sync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_dir")

    private Integer originalDir;

    public CreateThumbReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateThumbReq withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public CreateThumbReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateThumbReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateThumbReq withUserData(String userData) {
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

    public CreateThumbReq withThumbnailPara(ThumbnailPara thumbnailPara) {
        this.thumbnailPara = thumbnailPara;
        return this;
    }

    public CreateThumbReq withThumbnailPara(Consumer<ThumbnailPara> thumbnailParaSetter) {
        if (this.thumbnailPara == null) {
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
     * 是否压缩抽帧图片生成tar包。  取值如下： - 0：压缩。 - 1：不压缩 默认值：1 
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
     * 是否同步处理，同步处理是指不下载全部文件，快速定位到截图位置进行截图。  取值如下： - 0：排队处理。 - 1：同步处理，暂只支持按时间点截单张图。 默认值：0 
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
     * 是否使用原始输出目录。  取值如下： - 0：不使用原始输出目录，下发的输出目录后面追加随机目录，防止截图文件outputUri相同被覆盖。 - 1：使用原始输出目录。 默认值：0 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateThumbReq that = (CreateThumbReq) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.thumbnailPara, that.thumbnailPara)
            && Objects.equals(this.tar, that.tar) && Objects.equals(this.sync, that.sync)
            && Objects.equals(this.originalDir, that.originalDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, userData, thumbnailPara, tar, sync, originalDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThumbReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    thumbnailPara: ").append(toIndentedString(thumbnailPara)).append("\n");
        sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    originalDir: ").append(toIndentedString(originalDir)).append("\n");
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
