package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分句上传任务的上传地址,create_type为segment时设置。
 */
public class CreateTrainingJobRspSegmentUploadingUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_uploading_url")

    private List<String> audioUploadingUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "txt_uploading_url")

    private List<String> txtUploadingUrl = null;

    public CreateTrainingJobRspSegmentUploadingUrl withAudioUploadingUrl(List<String> audioUploadingUrl) {
        this.audioUploadingUrl = audioUploadingUrl;
        return this;
    }

    public CreateTrainingJobRspSegmentUploadingUrl addAudioUploadingUrlItem(String audioUploadingUrlItem) {
        if (this.audioUploadingUrl == null) {
            this.audioUploadingUrl = new ArrayList<>();
        }
        this.audioUploadingUrl.add(audioUploadingUrlItem);
        return this;
    }

    public CreateTrainingJobRspSegmentUploadingUrl withAudioUploadingUrl(
        Consumer<List<String>> audioUploadingUrlSetter) {
        if (this.audioUploadingUrl == null) {
            this.audioUploadingUrl = new ArrayList<>();
        }
        audioUploadingUrlSetter.accept(this.audioUploadingUrl);
        return this;
    }

    /**
     * 音频上传的地址。  通过该obs地址上传时，需设置content-type为audio/wav
     * @return audioUploadingUrl
     */
    public List<String> getAudioUploadingUrl() {
        return audioUploadingUrl;
    }

    public void setAudioUploadingUrl(List<String> audioUploadingUrl) {
        this.audioUploadingUrl = audioUploadingUrl;
    }

    public CreateTrainingJobRspSegmentUploadingUrl withTxtUploadingUrl(List<String> txtUploadingUrl) {
        this.txtUploadingUrl = txtUploadingUrl;
        return this;
    }

    public CreateTrainingJobRspSegmentUploadingUrl addTxtUploadingUrlItem(String txtUploadingUrlItem) {
        if (this.txtUploadingUrl == null) {
            this.txtUploadingUrl = new ArrayList<>();
        }
        this.txtUploadingUrl.add(txtUploadingUrlItem);
        return this;
    }

    public CreateTrainingJobRspSegmentUploadingUrl withTxtUploadingUrl(Consumer<List<String>> txtUploadingUrlSetter) {
        if (this.txtUploadingUrl == null) {
            this.txtUploadingUrl = new ArrayList<>();
        }
        txtUploadingUrlSetter.accept(this.txtUploadingUrl);
        return this;
    }

    /**
     * 文本上传的地址。  通过该obs地址上传时需设置content-type为text/plain
     * @return txtUploadingUrl
     */
    public List<String> getTxtUploadingUrl() {
        return txtUploadingUrl;
    }

    public void setTxtUploadingUrl(List<String> txtUploadingUrl) {
        this.txtUploadingUrl = txtUploadingUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrainingJobRspSegmentUploadingUrl that = (CreateTrainingJobRspSegmentUploadingUrl) obj;
        return Objects.equals(this.audioUploadingUrl, that.audioUploadingUrl)
            && Objects.equals(this.txtUploadingUrl, that.txtUploadingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioUploadingUrl, txtUploadingUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrainingJobRspSegmentUploadingUrl {\n");
        sb.append("    audioUploadingUrl: ").append(toIndentedString(audioUploadingUrl)).append("\n");
        sb.append("    txtUploadingUrl: ").append(toIndentedString(txtUploadingUrl)).append("\n");
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
