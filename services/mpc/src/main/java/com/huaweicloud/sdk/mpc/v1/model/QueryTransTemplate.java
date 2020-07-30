package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Audio;
import com.huaweicloud.sdk.mpc.v1.model.Common;
import com.huaweicloud.sdk.mpc.v1.model.Video;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryTransTemplate
 */
public class QueryTransTemplate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    
    private String templateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private Video video = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private Audio audio = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Common common = null;

    public QueryTransTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 转码模板名称。 
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public QueryTransTemplate withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 租户ID。 
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public QueryTransTemplate withVideo(Video video) {
        this.video = video;
        return this;
    }

    public QueryTransTemplate withVideo(Consumer<Video> videoSetter) {
        if(this.video == null ){
            this.video = new Video();
            videoSetter.accept(this.video);
        }
        
        return this;
    }


    /**
     * Get video
     * @return video
     */
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public QueryTransTemplate withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public QueryTransTemplate withAudio(Consumer<Audio> audioSetter) {
        if(this.audio == null ){
            this.audio = new Audio();
            audioSetter.accept(this.audio);
        }
        
        return this;
    }


    /**
     * Get audio
     * @return audio
     */
    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public QueryTransTemplate withCommon(Common common) {
        this.common = common;
        return this;
    }

    public QueryTransTemplate withCommon(Consumer<Common> commonSetter) {
        if(this.common == null ){
            this.common = new Common();
            commonSetter.accept(this.common);
        }
        
        return this;
    }


    /**
     * Get common
     * @return common
     */
    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryTransTemplate queryTransTemplate = (QueryTransTemplate) o;
        return Objects.equals(this.templateName, queryTransTemplate.templateName) &&
            Objects.equals(this.tenantId, queryTransTemplate.tenantId) &&
            Objects.equals(this.video, queryTransTemplate.video) &&
            Objects.equals(this.audio, queryTransTemplate.audio) &&
            Objects.equals(this.common, queryTransTemplate.common);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateName, tenantId, video, audio, common);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTransTemplate {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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

