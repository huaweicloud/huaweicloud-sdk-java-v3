package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户查询的vmr详情
 */
public class QueryVmrResultDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrId")
    
    private String vmrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrName")
    
    private String vmrName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gustPwd")
    
    private String gustPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gustJoinUrl")
    
    private String gustJoinUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chairPwd")
    
    private String chairPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chairJoinUrl")
    
    private String chairJoinUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowGustFirst")
    
    private Boolean allowGustFirst;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gustFirstNotice")
    
    private Boolean gustFirstNotice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrMode")
    
    private Integer vmrMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgId")
    
    private String vmrPkgId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgName")
    
    private String vmrPkgName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgParties")
    
    private Integer vmrPkgParties;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public QueryVmrResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public QueryVmrResultDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    


    /**
     * 云会议室ID
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    

    public QueryVmrResultDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    


    /**
     * 云会议室名称
     * @return vmrName
     */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    

    public QueryVmrResultDTO withGustPwd(String gustPwd) {
        this.gustPwd = gustPwd;
        return this;
    }

    


    /**
     * 来宾密码
     * @return gustPwd
     */
    public String getGustPwd() {
        return gustPwd;
    }

    public void setGustPwd(String gustPwd) {
        this.gustPwd = gustPwd;
    }

    

    public QueryVmrResultDTO withGustJoinUrl(String gustJoinUrl) {
        this.gustJoinUrl = gustJoinUrl;
        return this;
    }

    


    /**
     * 来宾与会链接
     * @return gustJoinUrl
     */
    public String getGustJoinUrl() {
        return gustJoinUrl;
    }

    public void setGustJoinUrl(String gustJoinUrl) {
        this.gustJoinUrl = gustJoinUrl;
    }

    

    public QueryVmrResultDTO withChairPwd(String chairPwd) {
        this.chairPwd = chairPwd;
        return this;
    }

    


    /**
     * 主席密码
     * @return chairPwd
     */
    public String getChairPwd() {
        return chairPwd;
    }

    public void setChairPwd(String chairPwd) {
        this.chairPwd = chairPwd;
    }

    

    public QueryVmrResultDTO withChairJoinUrl(String chairJoinUrl) {
        this.chairJoinUrl = chairJoinUrl;
        return this;
    }

    


    /**
     * 主席与会链接
     * @return chairJoinUrl
     */
    public String getChairJoinUrl() {
        return chairJoinUrl;
    }

    public void setChairJoinUrl(String chairJoinUrl) {
        this.chairJoinUrl = chairJoinUrl;
    }

    

    public QueryVmrResultDTO withAllowGustFirst(Boolean allowGustFirst) {
        this.allowGustFirst = allowGustFirst;
        return this;
    }

    


    /**
     * 允许来宾先入会
     * @return allowGustFirst
     */
    public Boolean getAllowGustFirst() {
        return allowGustFirst;
    }

    public void setAllowGustFirst(Boolean allowGustFirst) {
        this.allowGustFirst = allowGustFirst;
    }

    

    public QueryVmrResultDTO withGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
        return this;
    }

    


    /**
     * 云会议室被使用后是否通知会议室所有者
     * @return gustFirstNotice
     */
    public Boolean getGustFirstNotice() {
        return gustFirstNotice;
    }

    public void setGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
    }

    

    public QueryVmrResultDTO withVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
        return this;
    }

    


    /**
     * VMR模式 * 0: 个人会议ID * 1: 云会议室 * 2: 网络研讨会 
     * @return vmrMode
     */
    public Integer getVmrMode() {
        return vmrMode;
    }

    public void setVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
    }

    

    public QueryVmrResultDTO withVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
        return this;
    }

    


    /**
     * 云会议室套餐包的id，仅专用云会议室返回
     * @return vmrPkgId
     */
    public String getVmrPkgId() {
        return vmrPkgId;
    }

    public void setVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
    }

    

    public QueryVmrResultDTO withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    


    /**
     * 云会议室套餐包的名称，仅专用云会议室返回
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    

    public QueryVmrResultDTO withVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
        return this;
    }

    


    /**
     * 云会议室套餐包的会议并发方数，仅专用云会议室返回
     * @return vmrPkgParties
     */
    public Integer getVmrPkgParties() {
        return vmrPkgParties;
    }

    public void setVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
    }

    

    public QueryVmrResultDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云会议室状态: * 0、正常 * 1、停用 * 2、未分配 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryVmrResultDTO queryVmrResultDTO = (QueryVmrResultDTO) o;
        return Objects.equals(this.id, queryVmrResultDTO.id) &&
            Objects.equals(this.vmrId, queryVmrResultDTO.vmrId) &&
            Objects.equals(this.vmrName, queryVmrResultDTO.vmrName) &&
            Objects.equals(this.gustPwd, queryVmrResultDTO.gustPwd) &&
            Objects.equals(this.gustJoinUrl, queryVmrResultDTO.gustJoinUrl) &&
            Objects.equals(this.chairPwd, queryVmrResultDTO.chairPwd) &&
            Objects.equals(this.chairJoinUrl, queryVmrResultDTO.chairJoinUrl) &&
            Objects.equals(this.allowGustFirst, queryVmrResultDTO.allowGustFirst) &&
            Objects.equals(this.gustFirstNotice, queryVmrResultDTO.gustFirstNotice) &&
            Objects.equals(this.vmrMode, queryVmrResultDTO.vmrMode) &&
            Objects.equals(this.vmrPkgId, queryVmrResultDTO.vmrPkgId) &&
            Objects.equals(this.vmrPkgName, queryVmrResultDTO.vmrPkgName) &&
            Objects.equals(this.vmrPkgParties, queryVmrResultDTO.vmrPkgParties) &&
            Objects.equals(this.status, queryVmrResultDTO.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, vmrId, vmrName, gustPwd, gustJoinUrl, chairPwd, chairJoinUrl, allowGustFirst, gustFirstNotice, vmrMode, vmrPkgId, vmrPkgName, vmrPkgParties, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryVmrResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    gustPwd: ").append(toIndentedString(gustPwd)).append("\n");
        sb.append("    gustJoinUrl: ").append(toIndentedString(gustJoinUrl)).append("\n");
        sb.append("    chairPwd: ").append(toIndentedString(chairPwd)).append("\n");
        sb.append("    chairJoinUrl: ").append(toIndentedString(chairJoinUrl)).append("\n");
        sb.append("    allowGustFirst: ").append(toIndentedString(allowGustFirst)).append("\n");
        sb.append("    gustFirstNotice: ").append(toIndentedString(gustFirstNotice)).append("\n");
        sb.append("    vmrMode: ").append(toIndentedString(vmrMode)).append("\n");
        sb.append("    vmrPkgId: ").append(toIndentedString(vmrPkgId)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    vmrPkgParties: ").append(toIndentedString(vmrPkgParties)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

