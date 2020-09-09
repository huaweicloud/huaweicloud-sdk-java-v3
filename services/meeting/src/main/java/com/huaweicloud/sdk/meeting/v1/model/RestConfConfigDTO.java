package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 会议配置信息
 */
public class RestConfConfigDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isSendNotify")
    
    private Boolean isSendNotify;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isSendSms")
    
    private Boolean isSendSms;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isSendCalendar")
    
    private Boolean isSendCalendar;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isAutoMute")
    
    private Boolean isAutoMute;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isGuestFreePwd")
    
    private Boolean isGuestFreePwd;

    public RestConfConfigDTO withIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
        return this;
    }

    


    /**
     * 是否需要发送会议邮件通知。默认值由会议模板决定。 - True: 需要。 - False: 不需要。
     * @return isSendNotify
     */
    public Boolean getIsSendNotify() {
        return isSendNotify;
    }

    public void setIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
    }

    public RestConfConfigDTO withIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
        return this;
    }

    


    /**
     * 是否需要发送会议短信通知。默认值由会议模板决定。 - True: 需要。 - False: 不需要。
     * @return isSendSms
     */
    public Boolean getIsSendSms() {
        return isSendSms;
    }

    public void setIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
    }

    public RestConfConfigDTO withIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
        return this;
    }

    


    /**
     * 是否需要发送会议通知。默认值由会议模板决定。 - True: 需要。 - False: 不需要。
     * @return isSendCalendar
     */
    public Boolean getIsSendCalendar() {
        return isSendCalendar;
    }

    public void setIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
    }

    public RestConfConfigDTO withIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
        return this;
    }

    


    /**
     * 是否自动静音。默认值由会议模板决定。 - True: 自动静音。 - False: 不自动静音。
     * @return isAutoMute
     */
    public Boolean getIsAutoMute() {
        return isAutoMute;
    }

    public void setIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
    }

    public RestConfConfigDTO withIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
        return this;
    }

    


    /**
     * 是否来宾免密（仅随机会议有效）。 - True: 免密。 - False: 需要密码。
     * @return isGuestFreePwd
     */
    public Boolean getIsGuestFreePwd() {
        return isGuestFreePwd;
    }

    public void setIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestConfConfigDTO restConfConfigDTO = (RestConfConfigDTO) o;
        return Objects.equals(this.isSendNotify, restConfConfigDTO.isSendNotify) &&
            Objects.equals(this.isSendSms, restConfConfigDTO.isSendSms) &&
            Objects.equals(this.isSendCalendar, restConfConfigDTO.isSendCalendar) &&
            Objects.equals(this.isAutoMute, restConfConfigDTO.isAutoMute) &&
            Objects.equals(this.isGuestFreePwd, restConfConfigDTO.isGuestFreePwd);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isSendNotify, isSendSms, isSendCalendar, isAutoMute, isGuestFreePwd);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestConfConfigDTO {\n");
        sb.append("    isSendNotify: ").append(toIndentedString(isSendNotify)).append("\n");
        sb.append("    isSendSms: ").append(toIndentedString(isSendSms)).append("\n");
        sb.append("    isSendCalendar: ").append(toIndentedString(isSendCalendar)).append("\n");
        sb.append("    isAutoMute: ").append(toIndentedString(isAutoMute)).append("\n");
        sb.append("    isGuestFreePwd: ").append(toIndentedString(isGuestFreePwd)).append("\n");
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

