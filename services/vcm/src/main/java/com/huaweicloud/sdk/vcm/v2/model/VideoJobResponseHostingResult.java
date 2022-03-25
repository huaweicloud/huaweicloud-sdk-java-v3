package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** hosting_result信息为可选，hosting输出类型的作业详情才会有这个信息，且该信息只出现在查询单个作业API中，不出现在查询作业列表API中 */
public class VideoJobResponseHostingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private Object obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_json_overdue_at")

    private String resultJsonOverdueAt;

    public VideoJobResponseHostingResult withData(String data) {
        this.data = data;
        return this;
    }

    /** 结果文件result.json的具体内容。
     * 
     * @return data */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public VideoJobResponseHostingResult withObs(Object obs) {
        this.obs = obs;
        return this;
    }

    /** 结果文件所在的OBS桶和result.json文件路径
     * 
     * @return obs */
    public Object getObs() {
        return obs;
    }

    public void setObs(Object obs) {
        this.obs = obs;
    }

    public VideoJobResponseHostingResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /** result.json文件的状态： - NOT_GENERATED：文件未生成 - AVAILABLE：文件可获取 - EXCEED_IN_SIZE：文件超过最大规格 - OVERDUE：文件过期 -
     * DELETED_MISTAKENLY：文件误删除
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VideoJobResponseHostingResult withResultJsonOverdueAt(String resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
        return this;
    }

    /** result.json文件的过期日期，文件默认保存48小时。
     * 
     * @return resultJsonOverdueAt */
    public String getResultJsonOverdueAt() {
        return resultJsonOverdueAt;
    }

    public void setResultJsonOverdueAt(String resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoJobResponseHostingResult videoJobResponseHostingResult = (VideoJobResponseHostingResult) o;
        return Objects.equals(this.data, videoJobResponseHostingResult.data)
            && Objects.equals(this.obs, videoJobResponseHostingResult.obs)
            && Objects.equals(this.status, videoJobResponseHostingResult.status)
            && Objects.equals(this.resultJsonOverdueAt, videoJobResponseHostingResult.resultJsonOverdueAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, obs, status, resultJsonOverdueAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoJobResponseHostingResult {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resultJsonOverdueAt: ").append(toIndentedString(resultJsonOverdueAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
