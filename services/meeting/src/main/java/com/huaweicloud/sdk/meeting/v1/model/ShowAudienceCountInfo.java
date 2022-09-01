package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ShowAudienceCountInfo
 */
public class ShowAudienceCountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "showAudienceMode")

    @JacksonXmlProperty(localName = "showAudienceMode")

    private Integer showAudienceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseAudienceCount")

    @JacksonXmlProperty(localName = "baseAudienceCount")

    private Integer baseAudienceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiple")

    @JacksonXmlProperty(localName = "multiple")

    private Double multiple;

    public ShowAudienceCountInfo withShowAudienceMode(Integer showAudienceMode) {
        this.showAudienceMode = showAudienceMode;
        return this;
    }

    /**
     * 观众显示策略：服务端用来计算观众人数、下发给客户端控制观众显示 * 0：不显示 * 1：倍增显示与会人数，基于实时与会人数或累计与会人次（假设为N），可以再进行倍增设置。 * ---支持设置倍增倍数X和基础人数Y，设置后，显示的人数为：N*X+Y。 * ---X支持设置到小数点后1位，当N*X计算非整数时，向下取整。X的范围是1~10，Y的范围是0~10000。 * 2：按累计与会人数显示（当前不做）
     * minimum: 0
     * maximum: 1
     * @return showAudienceMode
     */
    public Integer getShowAudienceMode() {
        return showAudienceMode;
    }

    public void setShowAudienceMode(Integer showAudienceMode) {
        this.showAudienceMode = showAudienceMode;
    }

    public ShowAudienceCountInfo withBaseAudienceCount(Integer baseAudienceCount) {
        this.baseAudienceCount = baseAudienceCount;
        return this;
    }

    /**
     * 基础人数，范围是0~10000
     * minimum: 0
     * maximum: 10000
     * @return baseAudienceCount
     */
    public Integer getBaseAudienceCount() {
        return baseAudienceCount;
    }

    public void setBaseAudienceCount(Integer baseAudienceCount) {
        this.baseAudienceCount = baseAudienceCount;
    }

    public ShowAudienceCountInfo withMultiple(Double multiple) {
        this.multiple = multiple;
        return this;
    }

    /**
     * 倍增倍数，范围是1~10, 支持设置到小数点后1位
     * minimum: 1
     * maximum: 1E+1
     * @return multiple
     */
    public Double getMultiple() {
        return multiple;
    }

    public void setMultiple(Double multiple) {
        this.multiple = multiple;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAudienceCountInfo showAudienceCountInfo = (ShowAudienceCountInfo) o;
        return Objects.equals(this.showAudienceMode, showAudienceCountInfo.showAudienceMode)
            && Objects.equals(this.baseAudienceCount, showAudienceCountInfo.baseAudienceCount)
            && Objects.equals(this.multiple, showAudienceCountInfo.multiple);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showAudienceMode, baseAudienceCount, multiple);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAudienceCountInfo {\n");
        sb.append("    showAudienceMode: ").append(toIndentedString(showAudienceMode)).append("\n");
        sb.append("    baseAudienceCount: ").append(toIndentedString(baseAudienceCount)).append("\n");
        sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
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
