package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 媒资审核参数
 */
public class Review {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "politics")

    private Integer politics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terrorism")

    private Integer terrorism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "porn")

    private Integer porn;

    public Review withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 审核模板ID。您可以在视频点播控制台配置审核模板后获取，具体请参见[审核设置](https://support.huaweicloud.com/usermanual-vod/vod_01_0057.html)。
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
     * 截图检测时间间隔，取值范围为[0,100]，该参数在请求参数中忽略。 置信度越高，说明审核结果越可信。未开启或设置为0时，表示不进行此项检测。
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
     * 鉴政内容检测置信度，取值范围为[0,100]，该参数在请求参数中忽略。 置信度越高，说明审核结果越可信。未开启或设置为0时，表示不进行此项检测。
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
     * 鉴恐内容的检测置信度，取值范围为[0,100]，该参数在请求参数中忽略。 置信度越高，说明审核结果越可信。未开启或设置为0时，表示不进行此项检测。
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
     * 鉴黄内容的检测置信度，取值范围为[0,100]，该参数在请求参数中忽略。 置信度越高，说明审核结果越可信。未开启或设置为0时，表示不进行此项检测。  
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
        return Objects.equals(this.templateId, review.templateId) && Objects.equals(this.interval, review.interval)
            && Objects.equals(this.politics, review.politics) && Objects.equals(this.terrorism, review.terrorism)
            && Objects.equals(this.porn, review.porn);
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
