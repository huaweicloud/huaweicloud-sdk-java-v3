package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.StreamPortrait;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowStreamPortraitResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream_portraits")
    
    private List<StreamPortrait> streamPortraits = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ShowStreamPortraitResponse withStreamPortraits(List<StreamPortrait> streamPortraits) {
        this.streamPortraits = streamPortraits;
        return this;
    }

    
    public ShowStreamPortraitResponse addStreamPortraitsItem(StreamPortrait streamPortraitsItem) {
        if(this.streamPortraits == null) {
            this.streamPortraits = new ArrayList<>();
        }
        this.streamPortraits.add(streamPortraitsItem);
        return this;
    }

    public ShowStreamPortraitResponse withStreamPortraits(Consumer<List<StreamPortrait>> streamPortraitsSetter) {
        if(this.streamPortraits == null) {
            this.streamPortraits = new ArrayList<>();
        }
        streamPortraitsSetter.accept(this.streamPortraits);
        return this;
    }

    /**
     * 播放画像信息列表。
     * @return streamPortraits
     */
    public List<StreamPortrait> getStreamPortraits() {
        return streamPortraits;
    }

    public void setStreamPortraits(List<StreamPortrait> streamPortraits) {
        this.streamPortraits = streamPortraits;
    }

    

    public ShowStreamPortraitResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStreamPortraitResponse showStreamPortraitResponse = (ShowStreamPortraitResponse) o;
        return Objects.equals(this.streamPortraits, showStreamPortraitResponse.streamPortraits) &&
            Objects.equals(this.xRequestId, showStreamPortraitResponse.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(streamPortraits, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamPortraitResponse {\n");
        sb.append("    streamPortraits: ").append(toIndentedString(streamPortraits)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

