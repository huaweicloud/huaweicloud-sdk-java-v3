package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AbnormalEventDimensionValue
 */
public class AbnormalEventDimensionValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type")

    private Integer abnormalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type_desc")

    private String abnormalTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_factor")

    private Integer abnormalFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_factor_desc")

    private String abnormalFactorDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private Long userCount;

    public AbnormalEventDimensionValue withAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
        return this;
    }

    /**
     * 异常类型： - 1：进房慢(5s加入房间失败) - 2：视频卡顿 - 3：音频卡顿 
     * minimum: 0
     * maximum: 15
     * @return abnormalType
     */
    public Integer getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
    }

    public AbnormalEventDimensionValue withAbnormalTypeDesc(String abnormalTypeDesc) {
        this.abnormalTypeDesc = abnormalTypeDesc;
        return this;
    }

    /**
     * 异常类型描述与异常类型对应，支持国际化，取值范围为： - 进房慢(5s加入房间失败) - 视频卡顿 - 音频卡顿 
     * @return abnormalTypeDesc
     */
    public String getAbnormalTypeDesc() {
        return abnormalTypeDesc;
    }

    public void setAbnormalTypeDesc(String abnormalTypeDesc) {
        this.abnormalTypeDesc = abnormalTypeDesc;
    }

    public AbnormalEventDimensionValue withAbnormalFactor(Integer abnormalFactor) {
        this.abnormalFactor = abnormalFactor;
        return this;
    }

    /**
     * 异常因素 当异常类型为1时，异常因素取值范围为： - 1：建链失败 - 2：房间非空闲 - 3：服务器异常 - 4：服务器反馈503 - 5：鉴权失败 - 6：鉴权重试 - 7：时钟同步失败 - 8：url错误 - 9：终端内部异常 - 90000004：SDK发出的加入房间信令响应超时 - 90100009：web侧没有收到MSP下发的配置信息 - 90100008：websocket链路建链失败 - 10000001：服务侧返回的异常信息 - 31000003：服务侧返回的异常信息 - 32000030：服务侧返回的异常信息 - 15：浏览器设置sdp异常 当异常类型为2或者3时，异常因素取值范围为： - 1：系统CPU占用高 - 2：App CPU占用高 - 3：音频上行网络延时 - 4：音频上行网络抖动 - 5：视频上行网络延时 - 6：视频上行网络抖动 - 7：音频下行网络延时 - 8：音频下行网络抖动 - 9：视频下行网络延时 - 10：视频下行网络抖动 - 11：上行音频丢包 - 12：上行视频丢包 - 13：下行音频丢包 - 14：下行视频丢包 - 15：下行音频无声音 - 16：其他 - 17：对端用户离线 - 18：对端用户无码流 - 19：对端用户无帧率 - 20：本端服务器下行无码流 - 21：本端服务器下行无帧率 
     * minimum: 0
     * maximum: 15
     * @return abnormalFactor
     */
    public Integer getAbnormalFactor() {
        return abnormalFactor;
    }

    public void setAbnormalFactor(Integer abnormalFactor) {
        this.abnormalFactor = abnormalFactor;
    }

    public AbnormalEventDimensionValue withAbnormalFactorDesc(String abnormalFactorDesc) {
        this.abnormalFactorDesc = abnormalFactorDesc;
        return this;
    }

    /**
     * 异常因素描述，支持国际化 当异常类型为1时，异常因素描述与异常因素对应，取值范围为： - 建链失败 - 房间非空闲 - 服务器异常 - 服务器反馈503 - 鉴权失败 - 鉴权重试 - 时钟同步失败 - url错误 - 终端内部异常 - SDK发出的加入房间信令响应超时 - web侧没有收到MSP下发的配置信息 - websocket链路建链失败 - 服务侧返回的异常信息 - 服务侧返回的异常信息 - 服务侧返回的异常信息 - 浏览器设置sdp异常 当异常类型为2或者3时，异常因素描述与异常因素对应，取值范围为： - 系统CPU占用高 - App CPU占用高 - 音频上行网络延时 - 音频上行网络抖动 - 视频上行网络延时 - 视频上行网络抖动 - 音频下行网络延时 - 音频下行网络抖动 - 视频下行网络延时 - 视频下行网络抖动 - 上行音频丢包 - 上行视频丢包 - 下行音频丢包 - 下行视频丢包 - 下行音频无声音 - 其他 - 对端用户离线 - 对端用户无码流 - 对端用户无帧率 - 本端服务器下行无码流 - 本端服务器下行无帧率 其他情况，异常因素描述为：其他 
     * @return abnormalFactorDesc
     */
    public String getAbnormalFactorDesc() {
        return abnormalFactorDesc;
    }

    public void setAbnormalFactorDesc(String abnormalFactorDesc) {
        this.abnormalFactorDesc = abnormalFactorDesc;
    }

    public AbnormalEventDimensionValue withUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * 异常影响的用户数
     * minimum: 0
     * maximum: 1844674407
     * @return userCount
     */
    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbnormalEventDimensionValue abnormalEventDimensionValue = (AbnormalEventDimensionValue) o;
        return Objects.equals(this.abnormalType, abnormalEventDimensionValue.abnormalType)
            && Objects.equals(this.abnormalTypeDesc, abnormalEventDimensionValue.abnormalTypeDesc)
            && Objects.equals(this.abnormalFactor, abnormalEventDimensionValue.abnormalFactor)
            && Objects.equals(this.abnormalFactorDesc, abnormalEventDimensionValue.abnormalFactorDesc)
            && Objects.equals(this.userCount, abnormalEventDimensionValue.userCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalType, abnormalTypeDesc, abnormalFactor, abnormalFactorDesc, userCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbnormalEventDimensionValue {\n");
        sb.append("    abnormalType: ").append(toIndentedString(abnormalType)).append("\n");
        sb.append("    abnormalTypeDesc: ").append(toIndentedString(abnormalTypeDesc)).append("\n");
        sb.append("    abnormalFactor: ").append(toIndentedString(abnormalFactor)).append("\n");
        sb.append("    abnormalFactorDesc: ").append(toIndentedString(abnormalFactorDesc)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
