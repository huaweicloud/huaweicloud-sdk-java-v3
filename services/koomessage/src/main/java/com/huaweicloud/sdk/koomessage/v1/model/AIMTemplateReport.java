package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询模板返回体。
 */
public class AIMTemplateReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolving_times")

    private Integer resolvingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expose_uv")

    private Long exposeUv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expose_pv")

    private Long exposePv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "click_uv")

    private Long clickUv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "click_pv")

    private Long clickPv;

    public AIMTemplateReport withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public AIMTemplateReport withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 统计开始时间。样例为：1970-01-01T00:00:00Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AIMTemplateReport withResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
        return this;
    }

    /**
     * 实际已解析数。
     * @return resolvingTimes
     */
    public Integer getResolvingTimes() {
        return resolvingTimes;
    }

    public void setResolvingTimes(Integer resolvingTimes) {
        this.resolvingTimes = resolvingTimes;
    }

    public AIMTemplateReport withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 统计结束时间。样例为：1970-01-01T00:00:00Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AIMTemplateReport withExposeUv(Long exposeUv) {
        this.exposeUv = exposeUv;
        return this;
    }

    /**
     * 消息曝光数。 
     * @return exposeUv
     */
    public Long getExposeUv() {
        return exposeUv;
    }

    public void setExposeUv(Long exposeUv) {
        this.exposeUv = exposeUv;
    }

    public AIMTemplateReport withExposePv(Long exposePv) {
        this.exposePv = exposePv;
        return this;
    }

    /**
     * 消息曝光次数。 
     * @return exposePv
     */
    public Long getExposePv() {
        return exposePv;
    }

    public void setExposePv(Long exposePv) {
        this.exposePv = exposePv;
    }

    public AIMTemplateReport withClickUv(Long clickUv) {
        this.clickUv = clickUv;
        return this;
    }

    /**
     * 消息点击数。 
     * @return clickUv
     */
    public Long getClickUv() {
        return clickUv;
    }

    public void setClickUv(Long clickUv) {
        this.clickUv = clickUv;
    }

    public AIMTemplateReport withClickPv(Long clickPv) {
        this.clickPv = clickPv;
        return this;
    }

    /**
     * 消息点击次数。 
     * @return clickPv
     */
    public Long getClickPv() {
        return clickPv;
    }

    public void setClickPv(Long clickPv) {
        this.clickPv = clickPv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIMTemplateReport that = (AIMTemplateReport) obj;
        return Objects.equals(this.tplId, that.tplId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.resolvingTimes, that.resolvingTimes) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.exposeUv, that.exposeUv) && Objects.equals(this.exposePv, that.exposePv)
            && Objects.equals(this.clickUv, that.clickUv) && Objects.equals(this.clickPv, that.clickPv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, startTime, resolvingTimes, endTime, exposeUv, exposePv, clickUv, clickPv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMTemplateReport {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    resolvingTimes: ").append(toIndentedString(resolvingTimes)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    exposeUv: ").append(toIndentedString(exposeUv)).append("\n");
        sb.append("    exposePv: ").append(toIndentedString(exposePv)).append("\n");
        sb.append("    clickUv: ").append(toIndentedString(clickUv)).append("\n");
        sb.append("    clickPv: ").append(toIndentedString(clickPv)).append("\n");
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
