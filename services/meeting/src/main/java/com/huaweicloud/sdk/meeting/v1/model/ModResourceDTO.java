package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModResourceDTO
 */
public class ModResourceDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireDate")
    
    private Long expireDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isDisabled")
    
    private Boolean isDisabled;

    public ModResourceDTO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 资源标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModResourceDTO withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 资源类型，企业内ID和TYPE唯一标识一个资源项，若只传资源ID可能会修改多个资源的信息. - VMR        - 云会议室 - CONF_CALL  - 会议并发数 - HARD_1080P - 1080P硬终端 - HARD_720P  - 720P硬终端 - SOFT       - 软终端用户数 - ROOM       - 大屏软终端 - LIVE       - 直播推流 - RECORD     - 录播空间 - HARD_THIRD_PARTY - 第三方硬终端账号 - HUAWEI_VISION -智慧屏
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModResourceDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    


    /**
     * 到期时间
     * minimum: 0
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    public ModResourceDTO withIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    


    /**
     * 资源是否被停用
     * @return isDisabled
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModResourceDTO modResourceDTO = (ModResourceDTO) o;
        return Objects.equals(this.id, modResourceDTO.id) &&
            Objects.equals(this.type, modResourceDTO.type) &&
            Objects.equals(this.expireDate, modResourceDTO.expireDate) &&
            Objects.equals(this.isDisabled, modResourceDTO.isDisabled);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, type, expireDate, isDisabled);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModResourceDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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

