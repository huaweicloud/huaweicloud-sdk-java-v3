package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.TrackerOBSChannelConfigBody;
import com.huaweicloud.sdk.rms.v1.model.TrackerSMNChannelConfigBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Tracker 信息发送通道
 */
public class ChannelConfigBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn")
    
    private TrackerSMNChannelConfigBody smn = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs")
    
    private TrackerOBSChannelConfigBody obs = null;

    public ChannelConfigBody withSmn(TrackerSMNChannelConfigBody smn) {
        this.smn = smn;
        return this;
    }

    public ChannelConfigBody withSmn(Consumer<TrackerSMNChannelConfigBody> smnSetter) {
        if(this.smn == null ){
            this.smn = new TrackerSMNChannelConfigBody();
            smnSetter.accept(this.smn);
        }
        
        return this;
    }


    /**
     * Get smn
     * @return smn
     */
    public TrackerSMNChannelConfigBody getSmn() {
        return smn;
    }

    public void setSmn(TrackerSMNChannelConfigBody smn) {
        this.smn = smn;
    }

    public ChannelConfigBody withObs(TrackerOBSChannelConfigBody obs) {
        this.obs = obs;
        return this;
    }

    public ChannelConfigBody withObs(Consumer<TrackerOBSChannelConfigBody> obsSetter) {
        if(this.obs == null ){
            this.obs = new TrackerOBSChannelConfigBody();
            obsSetter.accept(this.obs);
        }
        
        return this;
    }


    /**
     * Get obs
     * @return obs
     */
    public TrackerOBSChannelConfigBody getObs() {
        return obs;
    }

    public void setObs(TrackerOBSChannelConfigBody obs) {
        this.obs = obs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelConfigBody channelConfigBody = (ChannelConfigBody) o;
        return Objects.equals(this.smn, channelConfigBody.smn) &&
            Objects.equals(this.obs, channelConfigBody.obs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(smn, obs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelConfigBody {\n");
        sb.append("    smn: ").append(toIndentedString(smn)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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

