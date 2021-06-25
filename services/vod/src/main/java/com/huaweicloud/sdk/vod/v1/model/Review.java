package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 媒资审核参数
 */
public class Review  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private String templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    private Integer interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="politics")
    
    private Integer politics;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="terrorism")
    
    private Integer terrorism;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="porn")
    
    private Integer porn;

    public Review withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 审核模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    

    public Review withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 截图的时间间隔。单位为秒
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    

    public Review withPolitics(Integer politics) {
        this.politics = politics;
        return this;
    }

    


    /**
     * 进行政治人物检测时的置信度。 1）  未传参时表示不进行此项检测。 2）  传 -1 表示采用默认的置信度 
     * @return politics
     */
    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    

    public Review withTerrorism(Integer terrorism) {
        this.terrorism = terrorism;
        return this;
    }

    


    /**
     * 进行暴恐元素检测时的置信度。 1)  未传参时表示不进行此项检测。 2)  传 -1 表示采用默认的置信度 
     * @return terrorism
     */
    public Integer getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(Integer terrorism) {
        this.terrorism = terrorism;
    }

    

    public Review withPorn(Integer porn) {
        this.porn = porn;
        return this;
    }

    


    /**
     * 进行涉黄内容检测时的置信度。 1)  未传参时表示不进行此项检测。 2)  传 -1 表示采用默认的置信度 
     * @return porn
     */
    public Integer getPorn() {
        return porn;
    }

    public void setPorn(Integer porn) {
        this.porn = porn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Review review = (Review) o;
        return Objects.equals(this.templateId, review.templateId) &&
            Objects.equals(this.interval, review.interval) &&
            Objects.equals(this.politics, review.politics) &&
            Objects.equals(this.terrorism, review.terrorism) &&
            Objects.equals(this.porn, review.porn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, interval, politics, terrorism, porn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Review {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    politics: ").append(toIndentedString(politics)).append("\n");
        sb.append("    terrorism: ").append(toIndentedString(terrorism)).append("\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
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

