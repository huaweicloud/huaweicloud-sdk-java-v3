package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CloudLink查询vmr返回的结构
 */
public class VmrCloudLinkDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrConfId")
    
    private String vmrConfId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrName")
    
    private String vmrName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userName")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userAccount")
    
    private String userAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guestpwd")
    
    private String guestpwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guestUrl")
    
    private String guestUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostpwd")
    
    private String hostpwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostUrl")
    
    private String hostUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startConfWithoutHost")
    
    private Boolean startConfWithoutHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gustFirstNotice")
    
    private Boolean gustFirstNotice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgId")
    
    private String vmrPkgId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maxParties")
    
    private Integer maxParties;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maxManualProlongTimes")
    
    private Integer maxManualProlongTimes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrMode")
    
    private Integer vmrMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireDate")
    
    private Long expireDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remainingHours")
    
    private Long remainingHours;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public VmrCloudLinkDTO withId(String id) {
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

    

    public VmrCloudLinkDTO withVmrConfId(String vmrConfId) {
        this.vmrConfId = vmrConfId;
        return this;
    }

    


    /**
     * vmr虚拟会议室Id
     * @return vmrConfId
     */
    public String getVmrConfId() {
        return vmrConfId;
    }

    public void setVmrConfId(String vmrConfId) {
        this.vmrConfId = vmrConfId;
    }

    

    public VmrCloudLinkDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    


    /**
     * vmr虚拟会议室名称
     * @return vmrName
     */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    

    public VmrCloudLinkDTO withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public VmrCloudLinkDTO withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    


    /**
     * 用户账号
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    

    public VmrCloudLinkDTO withGuestpwd(String guestpwd) {
        this.guestpwd = guestpwd;
        return this;
    }

    


    /**
     * 来宾密码
     * @return guestpwd
     */
    public String getGuestpwd() {
        return guestpwd;
    }

    public void setGuestpwd(String guestpwd) {
        this.guestpwd = guestpwd;
    }

    

    public VmrCloudLinkDTO withGuestUrl(String guestUrl) {
        this.guestUrl = guestUrl;
        return this;
    }

    


    /**
     * 来宾与会链接
     * @return guestUrl
     */
    public String getGuestUrl() {
        return guestUrl;
    }

    public void setGuestUrl(String guestUrl) {
        this.guestUrl = guestUrl;
    }

    

    public VmrCloudLinkDTO withHostpwd(String hostpwd) {
        this.hostpwd = hostpwd;
        return this;
    }

    


    /**
     * 主席密码
     * @return hostpwd
     */
    public String getHostpwd() {
        return hostpwd;
    }

    public void setHostpwd(String hostpwd) {
        this.hostpwd = hostpwd;
    }

    

    public VmrCloudLinkDTO withHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
        return this;
    }

    


    /**
     * 主席与会链接
     * @return hostUrl
     */
    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    

    public VmrCloudLinkDTO withStartConfWithoutHost(Boolean startConfWithoutHost) {
        this.startConfWithoutHost = startConfWithoutHost;
        return this;
    }

    


    /**
     * 允许来宾先入会
     * @return startConfWithoutHost
     */
    public Boolean getStartConfWithoutHost() {
        return startConfWithoutHost;
    }

    public void setStartConfWithoutHost(Boolean startConfWithoutHost) {
        this.startConfWithoutHost = startConfWithoutHost;
    }

    

    public VmrCloudLinkDTO withGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
        return this;
    }

    


    /**
     * 来宾先入会发送通知
     * @return gustFirstNotice
     */
    public Boolean getGustFirstNotice() {
        return gustFirstNotice;
    }

    public void setGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
    }

    

    public VmrCloudLinkDTO withVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
        return this;
    }

    


    /**
     * 对应的云会议室套餐包ID
     * @return vmrPkgId
     */
    public String getVmrPkgId() {
        return vmrPkgId;
    }

    public void setVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
    }

    

    public VmrCloudLinkDTO withMaxParties(Integer maxParties) {
        this.maxParties = maxParties;
        return this;
    }

    


    /**
     * 对应的云会议室套餐包最大与会方数
     * @return maxParties
     */
    public Integer getMaxParties() {
        return maxParties;
    }

    public void setMaxParties(Integer maxParties) {
        this.maxParties = maxParties;
    }

    

    public VmrCloudLinkDTO withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 对应的云会议室套餐包最大与会时长，若为0，则代表不限制
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    

    public VmrCloudLinkDTO withMaxManualProlongTimes(Integer maxManualProlongTimes) {
        this.maxManualProlongTimes = maxManualProlongTimes;
        return this;
    }

    


    /**
     * 对应的云会议室套餐包最大会议时长时间到后的延长会议次数
     * @return maxManualProlongTimes
     */
    public Integer getMaxManualProlongTimes() {
        return maxManualProlongTimes;
    }

    public void setMaxManualProlongTimes(Integer maxManualProlongTimes) {
        this.maxManualProlongTimes = maxManualProlongTimes;
    }

    

    public VmrCloudLinkDTO withVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
        return this;
    }

    


    /**
     * VMR模式 * 0：个人 * 1：专用 * 2：网络研讨会 
     * @return vmrMode
     */
    public Integer getVmrMode() {
        return vmrMode;
    }

    public void setVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
    }

    

    public VmrCloudLinkDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    


    /**
     * 到期时间，utc时间戳
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    

    public VmrCloudLinkDTO withRemainingHours(Long remainingHours) {
        this.remainingHours = remainingHours;
        return this;
    }

    


    /**
     * 剩余时间（小时，不足按1小时计）
     * @return remainingHours
     */
    public Long getRemainingHours() {
        return remainingHours;
    }

    public void setRemainingHours(Long remainingHours) {
        this.remainingHours = remainingHours;
    }

    

    public VmrCloudLinkDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * vmr虚拟会议室状态。 * 0、正常 * 1、停用 
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
        VmrCloudLinkDTO vmrCloudLinkDTO = (VmrCloudLinkDTO) o;
        return Objects.equals(this.id, vmrCloudLinkDTO.id) &&
            Objects.equals(this.vmrConfId, vmrCloudLinkDTO.vmrConfId) &&
            Objects.equals(this.vmrName, vmrCloudLinkDTO.vmrName) &&
            Objects.equals(this.userName, vmrCloudLinkDTO.userName) &&
            Objects.equals(this.userAccount, vmrCloudLinkDTO.userAccount) &&
            Objects.equals(this.guestpwd, vmrCloudLinkDTO.guestpwd) &&
            Objects.equals(this.guestUrl, vmrCloudLinkDTO.guestUrl) &&
            Objects.equals(this.hostpwd, vmrCloudLinkDTO.hostpwd) &&
            Objects.equals(this.hostUrl, vmrCloudLinkDTO.hostUrl) &&
            Objects.equals(this.startConfWithoutHost, vmrCloudLinkDTO.startConfWithoutHost) &&
            Objects.equals(this.gustFirstNotice, vmrCloudLinkDTO.gustFirstNotice) &&
            Objects.equals(this.vmrPkgId, vmrCloudLinkDTO.vmrPkgId) &&
            Objects.equals(this.maxParties, vmrCloudLinkDTO.maxParties) &&
            Objects.equals(this.duration, vmrCloudLinkDTO.duration) &&
            Objects.equals(this.maxManualProlongTimes, vmrCloudLinkDTO.maxManualProlongTimes) &&
            Objects.equals(this.vmrMode, vmrCloudLinkDTO.vmrMode) &&
            Objects.equals(this.expireDate, vmrCloudLinkDTO.expireDate) &&
            Objects.equals(this.remainingHours, vmrCloudLinkDTO.remainingHours) &&
            Objects.equals(this.status, vmrCloudLinkDTO.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, vmrConfId, vmrName, userName, userAccount, guestpwd, guestUrl, hostpwd, hostUrl, startConfWithoutHost, gustFirstNotice, vmrPkgId, maxParties, duration, maxManualProlongTimes, vmrMode, expireDate, remainingHours, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmrCloudLinkDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmrConfId: ").append(toIndentedString(vmrConfId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    guestpwd: ").append(toIndentedString(guestpwd)).append("\n");
        sb.append("    guestUrl: ").append(toIndentedString(guestUrl)).append("\n");
        sb.append("    hostpwd: ").append(toIndentedString(hostpwd)).append("\n");
        sb.append("    hostUrl: ").append(toIndentedString(hostUrl)).append("\n");
        sb.append("    startConfWithoutHost: ").append(toIndentedString(startConfWithoutHost)).append("\n");
        sb.append("    gustFirstNotice: ").append(toIndentedString(gustFirstNotice)).append("\n");
        sb.append("    vmrPkgId: ").append(toIndentedString(vmrPkgId)).append("\n");
        sb.append("    maxParties: ").append(toIndentedString(maxParties)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    maxManualProlongTimes: ").append(toIndentedString(maxManualProlongTimes)).append("\n");
        sb.append("    vmrMode: ").append(toIndentedString(vmrMode)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    remainingHours: ").append(toIndentedString(remainingHours)).append("\n");
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

