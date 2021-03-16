package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.SubAudioFile;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateResetTracksReq
 */
public class CreateResetTracksReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_file")
    
    private SubAudioFile audioFile;

    public CreateResetTracksReq withAudioFile(SubAudioFile audioFile) {
        this.audioFile = audioFile;
        return this;
    }

    public CreateResetTracksReq withAudioFile(Consumer<SubAudioFile> audioFileSetter) {
        if(this.audioFile == null ){
            this.audioFile = new SubAudioFile();
            audioFileSetter.accept(this.audioFile);
        }
        
        return this;
    }


    /**
     * Get audioFile
     * @return audioFile
     */
    public SubAudioFile getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(SubAudioFile audioFile) {
        this.audioFile = audioFile;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResetTracksReq createResetTracksReq = (CreateResetTracksReq) o;
        return Objects.equals(this.audioFile, createResetTracksReq.audioFile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(audioFile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResetTracksReq {\n");
        sb.append("    audioFile: ").append(toIndentedString(audioFile)).append("\n");
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

