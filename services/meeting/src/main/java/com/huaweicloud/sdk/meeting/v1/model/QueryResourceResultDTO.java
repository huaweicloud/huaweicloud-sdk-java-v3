package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryResourceResultDTO
 */
public class QueryResourceResultDTO  {



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
    @JsonProperty(value="typeDesc")
    
    private String typeDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireDate")
    
    private Long expireDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="editable")
    
    private Boolean editable;

    public QueryResourceResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 唯一标识若携带则以携带为准，企业内保证唯一，否则后台自动生成UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryResourceResultDTO withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 资源类型，前台通过查询接口返回该sp支持售卖的资源在界面上做相应屏蔽，当前为枚举类型. - VMR        - 云会议室 - CONF_CALL  - 会议并发数 - HARD_1080P - 1080P硬终端 - HARD_720P  - 720P硬终端 - SOFT       - 软终端用户数 - ROOM       - 大屏软终端 - LIVE       - 直播推流 - RECORD     - 录播空间 - HARD_THIRD_PARTY - 第三方硬终端账号 - HUAWEI_VISION -智慧屏
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QueryResourceResultDTO withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    


    /**
     * 资源标识，比如资源类型为vmrpkg，则该参数为vmrPkgId
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public QueryResourceResultDTO withTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }

    


    /**
     * 资源标识对应的回显描述,比如资源类型为vmrpkg，则该参数为vmrPkgName
     * @return typeDesc
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public QueryResourceResultDTO withCount(Integer count) {
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

    public QueryResourceResultDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    


    /**
     * 到期时间,utc时间戳
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    public QueryResourceResultDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源状态: - 0：正常 - 1：到期 - 2：停用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public QueryResourceResultDTO withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    


    /**
     * 标识资源是否可以编辑或删除，为false时，前台需要屏蔽操作按钮
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryResourceResultDTO queryResourceResultDTO = (QueryResourceResultDTO) o;
        return Objects.equals(this.id, queryResourceResultDTO.id) &&
            Objects.equals(this.type, queryResourceResultDTO.type) &&
            Objects.equals(this.typeId, queryResourceResultDTO.typeId) &&
            Objects.equals(this.typeDesc, queryResourceResultDTO.typeDesc) &&
            Objects.equals(this.count, queryResourceResultDTO.count) &&
            Objects.equals(this.expireDate, queryResourceResultDTO.expireDate) &&
            Objects.equals(this.status, queryResourceResultDTO.status) &&
            Objects.equals(this.editable, queryResourceResultDTO.editable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, type, typeId, typeDesc, count, expireDate, status, editable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResourceResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    typeDesc: ").append(toIndentedString(typeDesc)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

