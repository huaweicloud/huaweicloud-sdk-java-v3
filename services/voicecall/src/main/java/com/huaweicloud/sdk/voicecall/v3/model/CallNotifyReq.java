package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CallNotifyReq
 */
public class CallNotifyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayNbr")

    private String displayNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calleeNbr")

    private String calleeNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playInfoList")

    private List<PlayContentInfo> playInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusUrl")

    private String statusUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feeUrl")

    private String feeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnIdlePort")

    private String returnIdlePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userData")

    private String userData;

    public CallNotifyReq withDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
        return this;
    }

    /**
     * 固话号码，被叫终端上显示的主叫号码，需要提前在订购号码页面申请该号码
     * @return displayNbr
     */
    public String getDisplayNbr() {
        return displayNbr;
    }

    public void setDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
    }

    public CallNotifyReq withCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
        return this;
    }

    /**
     * 被叫号码
     * @return calleeNbr
     */
    public String getCalleeNbr() {
        return calleeNbr;
    }

    public void setCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
    }

    public CallNotifyReq withPlayInfoList(List<PlayContentInfo> playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }

    public CallNotifyReq addPlayInfoListItem(PlayContentInfo playInfoListItem) {
        if (this.playInfoList == null) {
            this.playInfoList = new ArrayList<>();
        }
        this.playInfoList.add(playInfoListItem);
        return this;
    }

    public CallNotifyReq withPlayInfoList(Consumer<List<PlayContentInfo>> playInfoListSetter) {
        if (this.playInfoList == null) {
            this.playInfoList = new ArrayList<>();
        }
        playInfoListSetter.accept(this.playInfoList);
        return this;
    }

    /**
     * Get playInfoList
     * @return playInfoList
     */
    public List<PlayContentInfo> getPlayInfoList() {
        return playInfoList;
    }

    public void setPlayInfoList(List<PlayContentInfo> playInfoList) {
        this.playInfoList = playInfoList;
    }

    public CallNotifyReq withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * 此参数请采用BASE64编码进行加密。此字段用于设置SP接收状态上报的URL。
     * @return statusUrl
     */
    public String getStatusUrl() {
        return statusUrl;
    }

    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    public CallNotifyReq withFeeUrl(String feeUrl) {
        this.feeUrl = feeUrl;
        return this;
    }

    /**
     * 此参数请采用BASE64编码进行加密。此参数用于设置SP接收话单上报的URL。
     * @return feeUrl
     */
    public String getFeeUrl() {
        return feeUrl;
    }

    public void setFeeUrl(String feeUrl) {
        this.feeUrl = feeUrl;
    }

    public CallNotifyReq withReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
        return this;
    }

    /**
     * 指示是否需要返回平台的空闲端口数量。true：需要返回,false：不需要返回
     * @return returnIdlePort
     */
    public String getReturnIdlePort() {
        return returnIdlePort;
    }

    public void setReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
    }

    public CallNotifyReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户附属信息，此标识由第三方服务器定义，会在后续的通知消息中携带此信息
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CallNotifyReq that = (CallNotifyReq) obj;
        return Objects.equals(this.displayNbr, that.displayNbr) && Objects.equals(this.calleeNbr, that.calleeNbr)
            && Objects.equals(this.playInfoList, that.playInfoList) && Objects.equals(this.statusUrl, that.statusUrl)
            && Objects.equals(this.feeUrl, that.feeUrl) && Objects.equals(this.returnIdlePort, that.returnIdlePort)
            && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayNbr, calleeNbr, playInfoList, statusUrl, feeUrl, returnIdlePort, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallNotifyReq {\n");
        sb.append("    displayNbr: ").append(toIndentedString(displayNbr)).append("\n");
        sb.append("    calleeNbr: ").append(toIndentedString(calleeNbr)).append("\n");
        sb.append("    playInfoList: ").append(toIndentedString(playInfoList)).append("\n");
        sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
        sb.append("    feeUrl: ").append(toIndentedString(feeUrl)).append("\n");
        sb.append("    returnIdlePort: ").append(toIndentedString(returnIdlePort)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
