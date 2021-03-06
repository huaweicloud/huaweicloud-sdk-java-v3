package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.MpcMultiAudio;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateMergeChannelsReq
 */
public class CreateMergeChannelsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multi_audio")
    
    private MpcMultiAudio multiAudio;

    public CreateMergeChannelsReq withMultiAudio(MpcMultiAudio multiAudio) {
        this.multiAudio = multiAudio;
        return this;
    }

    public CreateMergeChannelsReq withMultiAudio(Consumer<MpcMultiAudio> multiAudioSetter) {
        if(this.multiAudio == null ){
            this.multiAudio = new MpcMultiAudio();
            multiAudioSetter.accept(this.multiAudio);
        }
        
        return this;
    }


    /**
     * Get multiAudio
     * @return multiAudio
     */
    public MpcMultiAudio getMultiAudio() {
        return multiAudio;
    }

    public void setMultiAudio(MpcMultiAudio multiAudio) {
        this.multiAudio = multiAudio;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMergeChannelsReq createMergeChannelsReq = (CreateMergeChannelsReq) o;
        return Objects.equals(this.multiAudio, createMergeChannelsReq.multiAudio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(multiAudio);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeChannelsReq {\n");
        sb.append("    multiAudio: ").append(toIndentedString(multiAudio)).append("\n");
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

