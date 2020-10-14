package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.OutputPolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateExtend
 */
public class TemplateExtend  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private OutputPolicy audio = null;

    public TemplateExtend withAudio(OutputPolicy audio) {
        this.audio = audio;
        return this;
    }

    public TemplateExtend withAudio(Consumer<OutputPolicy> audioSetter) {
        if(this.audio == null ){
            this.audio = new OutputPolicy();
            audioSetter.accept(this.audio);
        }
        
        return this;
    }


    /**
     * Get audio
     * @return audio
     */
    public OutputPolicy getAudio() {
        return audio;
    }

    public void setAudio(OutputPolicy audio) {
        this.audio = audio;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateExtend templateExtend = (TemplateExtend) o;
        return Objects.equals(this.audio, templateExtend.audio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(audio);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateExtend {\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

