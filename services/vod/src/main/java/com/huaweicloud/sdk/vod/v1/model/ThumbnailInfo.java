package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.ThumbnailRsp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 截图信息。仅当截图成功后才能查询到此信息，未截图、正在截图以及截图失败时，此字段为空。
 */
public class ThumbnailInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample")
    
    private List<ThumbnailRsp> sample = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dots")
    
    private List<ThumbnailRsp> dots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exec_desc")
    
    private String execDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_status")
    
    private String thumbnailStatus;

    public ThumbnailInfo withSample(List<ThumbnailRsp> sample) {
        this.sample = sample;
        return this;
    }

    
    public ThumbnailInfo addSampleItem(ThumbnailRsp sampleItem) {
        if(this.sample == null) {
            this.sample = new ArrayList<>();
        }
        this.sample.add(sampleItem);
        return this;
    }

    public ThumbnailInfo withSample(Consumer<List<ThumbnailRsp>> sampleSetter) {
        if(this.sample == null) {
            this.sample = new ArrayList<>();
        }
        sampleSetter.accept(this.sample);
        return this;
    }

    /**
     * Get sample
     * @return sample
     */
    public List<ThumbnailRsp> getSample() {
        return sample;
    }

    public void setSample(List<ThumbnailRsp> sample) {
        this.sample = sample;
    }

    

    public ThumbnailInfo withDots(List<ThumbnailRsp> dots) {
        this.dots = dots;
        return this;
    }

    
    public ThumbnailInfo addDotsItem(ThumbnailRsp dotsItem) {
        if(this.dots == null) {
            this.dots = new ArrayList<>();
        }
        this.dots.add(dotsItem);
        return this;
    }

    public ThumbnailInfo withDots(Consumer<List<ThumbnailRsp>> dotsSetter) {
        if(this.dots == null) {
            this.dots = new ArrayList<>();
        }
        dotsSetter.accept(this.dots);
        return this;
    }

    /**
     * Get dots
     * @return dots
     */
    public List<ThumbnailRsp> getDots() {
        return dots;
    }

    public void setDots(List<ThumbnailRsp> dots) {
        this.dots = dots;
    }

    

    public ThumbnailInfo withExecDesc(String execDesc) {
        this.execDesc = execDesc;
        return this;
    }

    


    /**
     * Get execDesc
     * @return execDesc
     */
    public String getExecDesc() {
        return execDesc;
    }

    public void setExecDesc(String execDesc) {
        this.execDesc = execDesc;
    }

    

    public ThumbnailInfo withThumbnailStatus(String thumbnailStatus) {
        this.thumbnailStatus = thumbnailStatus;
        return this;
    }

    


    /**
     * Get thumbnailStatus
     * @return thumbnailStatus
     */
    public String getThumbnailStatus() {
        return thumbnailStatus;
    }

    public void setThumbnailStatus(String thumbnailStatus) {
        this.thumbnailStatus = thumbnailStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThumbnailInfo thumbnailInfo = (ThumbnailInfo) o;
        return Objects.equals(this.sample, thumbnailInfo.sample) &&
            Objects.equals(this.dots, thumbnailInfo.dots) &&
            Objects.equals(this.execDesc, thumbnailInfo.execDesc) &&
            Objects.equals(this.thumbnailStatus, thumbnailInfo.thumbnailStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sample, dots, execDesc, thumbnailStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailInfo {\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    execDesc: ").append(toIndentedString(execDesc)).append("\n");
        sb.append("    thumbnailStatus: ").append(toIndentedString(thumbnailStatus)).append("\n");
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

