package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 延长会议消息体。
 */
public class RestProlongDurReqBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto")
    
    private Integer auto;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;

    public RestProlongDurReqBody withAuto(Integer auto) {
        this.auto = auto;
        return this;
    }

    


    /**
     * - 0: 手动延长。 - 1: 自动延长（未携带延长时间时，默认每次延长15分钟）。
     * @return auto
     */
    public Integer getAuto() {
        return auto;
    }

    public void setAuto(Integer auto) {
        this.auto = auto;
    }

    

    public RestProlongDurReqBody withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 延长时间，单位为分钟。 默认值：15
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestProlongDurReqBody restProlongDurReqBody = (RestProlongDurReqBody) o;
        return Objects.equals(this.auto, restProlongDurReqBody.auto) &&
            Objects.equals(this.duration, restProlongDurReqBody.duration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auto, duration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestProlongDurReqBody {\n");
        sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

