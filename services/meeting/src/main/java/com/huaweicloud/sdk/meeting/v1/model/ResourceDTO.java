package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceDTO
 */
public class ResourceDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="typeId")
    
    private String typeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireDate")
    
    private Long expireDate;

    public ResourceDTO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 资源标识，不携带则后台自动生成
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ResourceDTO withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 资源类型，前台通过查询接口返回该sp支持售卖的资源在界面上做相应屏蔽，当前为枚举类型. - VMR        - 云会议室 - CONF_CALL  - 会议并发数 - HARD_1080P - 1080P硬终端 - HARD_720P  - 720P硬终端 - SOFT       - 软终端用户数 - ROOM       - 大屏软终端 - LIVE       - 直播推流 - RECORD     - 录播空间 - HARD_THIRD_PARTY - 第三方硬终端账号 - HUAWEI_VISION -智慧屏 - IDEA_HUB   - ideahub
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ResourceDTO withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    


    /**
     * 类型标识，比如资源类型为vmr，vmr又分为5方，10方等，该参数为vmrPkgId，用来区分子类别，详见如下： - vmr10:ff808081699b56d40169c410d5080179 - vmr50:ff808081699b56cb0169c411a0980152 - vmr100:ff808081699b56cb0169c41167850151 - vmr200:ff808081699b56d40169c410913d0178 - vmr25:ff808081699b56d40169c4111fe5017a - vmr300:ff8080816b9ec3ab016bdff237962e83 - vmr400:ff8080816b9ec475016bdff37efc279f - vmr500:ff8080816b9ec3ab016bdff338542e84
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    

    public ResourceDTO withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 资源数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ResourceDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    


    /**
     * 到期时间,utc时间戳
     * minimum: 0
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceDTO resourceDTO = (ResourceDTO) o;
        return Objects.equals(this.id, resourceDTO.id) &&
            Objects.equals(this.type, resourceDTO.type) &&
            Objects.equals(this.typeId, resourceDTO.typeId) &&
            Objects.equals(this.count, resourceDTO.count) &&
            Objects.equals(this.expireDate, resourceDTO.expireDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, type, typeId, count, expireDate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
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

