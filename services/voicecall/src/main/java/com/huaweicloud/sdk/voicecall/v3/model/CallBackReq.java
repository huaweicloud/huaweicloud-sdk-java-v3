package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CallBackReq
 */
public class CallBackReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayNbr")

    private String displayNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callerNbr")

    private String callerNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayCalleeNbr")

    private String displayCalleeNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calleeNbr")

    private String calleeNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxDuration")

    private Integer maxDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastMinVoice")

    private String lastMinVoice;

    /**
     * 当maxDuration字段设置为非0时此参数有效。此字段用于设置最后一分钟放音的播放对象。
     */
    public static final class LastMinToUEEnum {

        /**
         * Enum TOA for value: "toa"
         */
        public static final LastMinToUEEnum TOA = new LastMinToUEEnum("toa");

        /**
         * Enum TOB for value: "tob"
         */
        public static final LastMinToUEEnum TOB = new LastMinToUEEnum("tob");

        /**
         * Enum BOTH for value: "both"
         */
        public static final LastMinToUEEnum BOTH = new LastMinToUEEnum("both");

        private static final Map<String, LastMinToUEEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LastMinToUEEnum> createStaticFields() {
            Map<String, LastMinToUEEnum> map = new HashMap<>();
            map.put("toa", TOA);
            map.put("tob", TOB);
            map.put("both", BOTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LastMinToUEEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LastMinToUEEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LastMinToUEEnum(value));
        }

        public static LastMinToUEEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LastMinToUEEnum) {
                return this.value.equals(((LastMinToUEEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastMinToUE")

    private LastMinToUEEnum lastMinToUE;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playPreVoice")

    private String playPreVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preVoice")

    private String preVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitVoice")

    private String waitVoice;

    /**
     * 该参数用于指定被叫的媒体音播放方式
     */
    public static final class CalleeMediaEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final CalleeMediaEnum ALL = new CalleeMediaEnum("all");

        /**
         * Enum NONE for value: "none"
         */
        public static final CalleeMediaEnum NONE = new CalleeMediaEnum("none");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final CalleeMediaEnum FAIL = new CalleeMediaEnum("fail");

        private static final Map<String, CalleeMediaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CalleeMediaEnum> createStaticFields() {
            Map<String, CalleeMediaEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("none", NONE);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CalleeMediaEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CalleeMediaEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CalleeMediaEnum(value));
        }

        public static CalleeMediaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CalleeMediaEnum) {
                return this.value.equals(((CalleeMediaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calleeMedia")

    private CalleeMediaEnum calleeMedia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusUrl")

    private String statusUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feeUrl")

    private String feeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordFlag")

    private String recordFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordHintTone")

    private String recordHintTone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partyTypeRequiredInDisconnect")

    private String partyTypeRequiredInDisconnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnIdlePort")

    private String returnIdlePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userData")

    private String userData;

    public CallBackReq withDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
        return this;
    }

    /**
     * 号码格式（固话）：国家码+区号+固话，与号码管理页面的“固话号码”保持一致。
     * @return displayNbr
     */
    public String getDisplayNbr() {
        return displayNbr;
    }

    public void setDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
    }

    public CallBackReq withCallerNbr(String callerNbr) {
        this.callerNbr = callerNbr;
        return this;
    }

    /**
     * 此字段定义用户在SP开发的应用中，通过语音回呼功能发起呼叫时所使用的主叫号码
     * @return callerNbr
     */
    public String getCallerNbr() {
        return callerNbr;
    }

    public void setCallerNbr(String callerNbr) {
        this.callerNbr = callerNbr;
    }

    public CallBackReq withDisplayCalleeNbr(String displayCalleeNbr) {
        this.displayCalleeNbr = displayCalleeNbr;
        return this;
    }

    /**
     * 此字段定义被叫用户收到语音通话平台的呼叫时，被叫用户终端的来电显示号码。需提前在订购号码页面申请该号码。
     * @return displayCalleeNbr
     */
    public String getDisplayCalleeNbr() {
        return displayCalleeNbr;
    }

    public void setDisplayCalleeNbr(String displayCalleeNbr) {
        this.displayCalleeNbr = displayCalleeNbr;
    }

    public CallBackReq withCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
        return this;
    }

    /**
     * 此字段定义终端用户在SP开发的应用中通过语音回呼业务发起呼叫时所拨打的被叫号码
     * @return calleeNbr
     */
    public String getCalleeNbr() {
        return calleeNbr;
    }

    public void setCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
    }

    public CallBackReq withMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * 此字段用于设置允许单次通话进行的最长时间，通话时间从被叫接通的时刻开始计算
     * @return maxDuration
     */
    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public CallBackReq withLastMinVoice(String lastMinVoice) {
        this.lastMinVoice = lastMinVoice;
        return this;
    }

    /**
     * 当maxDuration字段设置为非0时此参数有效。此参数用于设置最后一分钟放音提示音，此值填写SP定制的放音文件名
     * @return lastMinVoice
     */
    public String getLastMinVoice() {
        return lastMinVoice;
    }

    public void setLastMinVoice(String lastMinVoice) {
        this.lastMinVoice = lastMinVoice;
    }

    public CallBackReq withLastMinToUE(LastMinToUEEnum lastMinToUE) {
        this.lastMinToUE = lastMinToUE;
        return this;
    }

    /**
     * 当maxDuration字段设置为非0时此参数有效。此字段用于设置最后一分钟放音的播放对象。
     * @return lastMinToUE
     */
    public LastMinToUEEnum getLastMinToUE() {
        return lastMinToUE;
    }

    public void setLastMinToUE(LastMinToUEEnum lastMinToUE) {
        this.lastMinToUE = lastMinToUE;
    }

    public CallBackReq withPlayPreVoice(String playPreVoice) {
        this.playPreVoice = playPreVoice;
        return this;
    }

    /**
     * 此字段用于设置主叫（callerNbr）应答语音回呼后，呼叫被叫（calleeNbr）前，是否向主叫（callerNbr）播放提示音。
     * @return playPreVoice
     */
    public String getPlayPreVoice() {
        return playPreVoice;
    }

    public void setPlayPreVoice(String playPreVoice) {
        this.playPreVoice = playPreVoice;
    }

    public CallBackReq withPreVoice(String preVoice) {
        this.preVoice = preVoice;
        return this;
    }

    /**
     * 当playPreVoice字段设置为true时此参数有效。此字段用于设置主叫（callerNbr）应答语音回呼后，呼叫被叫（calleeNbr）前向主叫播放的提示音，此值填写放音文件名
     * @return preVoice
     */
    public String getPreVoice() {
        return preVoice;
    }

    public void setPreVoice(String preVoice) {
        this.preVoice = preVoice;
    }

    public CallBackReq withWaitVoice(String waitVoice) {
        this.waitVoice = waitVoice;
        return this;
    }

    /**
     * 此字段用于设置主叫应答语音回呼后的等待音，此值填写放音文件名
     * @return waitVoice
     */
    public String getWaitVoice() {
        return waitVoice;
    }

    public void setWaitVoice(String waitVoice) {
        this.waitVoice = waitVoice;
    }

    public CallBackReq withCalleeMedia(CalleeMediaEnum calleeMedia) {
        this.calleeMedia = calleeMedia;
        return this;
    }

    /**
     * 该参数用于指定被叫的媒体音播放方式
     * @return calleeMedia
     */
    public CalleeMediaEnum getCalleeMedia() {
        return calleeMedia;
    }

    public void setCalleeMedia(CalleeMediaEnum calleeMedia) {
        this.calleeMedia = calleeMedia;
    }

    public CallBackReq withStatusUrl(String statusUrl) {
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

    public CallBackReq withFeeUrl(String feeUrl) {
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

    public CallBackReq withRecordFlag(String recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }

    /**
     * 此字段设置语音回呼通话过程是否录音。
     * @return recordFlag
     */
    public String getRecordFlag() {
        return recordFlag;
    }

    public void setRecordFlag(String recordFlag) {
        this.recordFlag = recordFlag;
    }

    public CallBackReq withRecordHintTone(String recordHintTone) {
        this.recordHintTone = recordHintTone;
        return this;
    }

    /**
     * 此字段在recordFlag为true时才有效。此字段用于设置使用录音功能的提示音，参数传值为指定的放音文件名。
     * @return recordHintTone
     */
    public String getRecordHintTone() {
        return recordHintTone;
    }

    public void setRecordHintTone(String recordHintTone) {
        this.recordHintTone = recordHintTone;
    }

    public CallBackReq withPartyTypeRequiredInDisconnect(String partyTypeRequiredInDisconnect) {
        this.partyTypeRequiredInDisconnect = partyTypeRequiredInDisconnect;
        return this;
    }

    /**
     * 该参数用于指定语音通话平台给开发者发送disconnect的呼叫状态时，通知消息是否需要携带通话主动挂机的用户类型。
     * @return partyTypeRequiredInDisconnect
     */
    public String getPartyTypeRequiredInDisconnect() {
        return partyTypeRequiredInDisconnect;
    }

    public void setPartyTypeRequiredInDisconnect(String partyTypeRequiredInDisconnect) {
        this.partyTypeRequiredInDisconnect = partyTypeRequiredInDisconnect;
    }

    public CallBackReq withReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
        return this;
    }

    /**
     * 指示是否需要返回平台空闲呼叫端口数量。
     * @return returnIdlePort
     */
    public String getReturnIdlePort() {
        return returnIdlePort;
    }

    public void setReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
    }

    public CallBackReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 此字段用于SP开发者自定义呼叫发起时，设置用户的附属信息，应用场景可以是当开发者想要对每一次呼叫的用户进行跟踪时，该参数可以携带用于标识用户的信息
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
        CallBackReq that = (CallBackReq) obj;
        return Objects.equals(this.displayNbr, that.displayNbr) && Objects.equals(this.callerNbr, that.callerNbr)
            && Objects.equals(this.displayCalleeNbr, that.displayCalleeNbr)
            && Objects.equals(this.calleeNbr, that.calleeNbr) && Objects.equals(this.maxDuration, that.maxDuration)
            && Objects.equals(this.lastMinVoice, that.lastMinVoice)
            && Objects.equals(this.lastMinToUE, that.lastMinToUE)
            && Objects.equals(this.playPreVoice, that.playPreVoice) && Objects.equals(this.preVoice, that.preVoice)
            && Objects.equals(this.waitVoice, that.waitVoice) && Objects.equals(this.calleeMedia, that.calleeMedia)
            && Objects.equals(this.statusUrl, that.statusUrl) && Objects.equals(this.feeUrl, that.feeUrl)
            && Objects.equals(this.recordFlag, that.recordFlag)
            && Objects.equals(this.recordHintTone, that.recordHintTone)
            && Objects.equals(this.partyTypeRequiredInDisconnect, that.partyTypeRequiredInDisconnect)
            && Objects.equals(this.returnIdlePort, that.returnIdlePort) && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayNbr,
            callerNbr,
            displayCalleeNbr,
            calleeNbr,
            maxDuration,
            lastMinVoice,
            lastMinToUE,
            playPreVoice,
            preVoice,
            waitVoice,
            calleeMedia,
            statusUrl,
            feeUrl,
            recordFlag,
            recordHintTone,
            partyTypeRequiredInDisconnect,
            returnIdlePort,
            userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallBackReq {\n");
        sb.append("    displayNbr: ").append(toIndentedString(displayNbr)).append("\n");
        sb.append("    callerNbr: ").append(toIndentedString(callerNbr)).append("\n");
        sb.append("    displayCalleeNbr: ").append(toIndentedString(displayCalleeNbr)).append("\n");
        sb.append("    calleeNbr: ").append(toIndentedString(calleeNbr)).append("\n");
        sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
        sb.append("    lastMinVoice: ").append(toIndentedString(lastMinVoice)).append("\n");
        sb.append("    lastMinToUE: ").append(toIndentedString(lastMinToUE)).append("\n");
        sb.append("    playPreVoice: ").append(toIndentedString(playPreVoice)).append("\n");
        sb.append("    preVoice: ").append(toIndentedString(preVoice)).append("\n");
        sb.append("    waitVoice: ").append(toIndentedString(waitVoice)).append("\n");
        sb.append("    calleeMedia: ").append(toIndentedString(calleeMedia)).append("\n");
        sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
        sb.append("    feeUrl: ").append(toIndentedString(feeUrl)).append("\n");
        sb.append("    recordFlag: ").append(toIndentedString(recordFlag)).append("\n");
        sb.append("    recordHintTone: ").append(toIndentedString(recordHintTone)).append("\n");
        sb.append("    partyTypeRequiredInDisconnect: ")
            .append(toIndentedString(partyTypeRequiredInDisconnect))
            .append("\n");
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
