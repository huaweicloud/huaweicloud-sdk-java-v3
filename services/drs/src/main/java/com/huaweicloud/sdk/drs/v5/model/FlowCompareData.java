package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对比结果。
 */
public class FlowCompareData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_db")

    private String srcDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_tb")

    private String srcTb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_db")

    private String dstDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_tb")

    private String dstTb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    public FlowCompareData withSrcDb(String srcDb) {
        this.srcDb = srcDb;
        return this;
    }

    /**
     * 源数据库名称。
     * @return srcDb
     */
    public String getSrcDb() {
        return srcDb;
    }

    public void setSrcDb(String srcDb) {
        this.srcDb = srcDb;
    }

    public FlowCompareData withSrcTb(String srcTb) {
        this.srcTb = srcTb;
        return this;
    }

    /**
     * 源对象名称。
     * @return srcTb
     */
    public String getSrcTb() {
        return srcTb;
    }

    public void setSrcTb(String srcTb) {
        this.srcTb = srcTb;
    }

    public FlowCompareData withDstDb(String dstDb) {
        this.dstDb = dstDb;
        return this;
    }

    /**
     * 目标数据库名称。
     * @return dstDb
     */
    public String getDstDb() {
        return dstDb;
    }

    public void setDstDb(String dstDb) {
        this.dstDb = dstDb;
    }

    public FlowCompareData withDstTb(String dstTb) {
        this.dstTb = dstTb;
        return this;
    }

    /**
     * 目标对象名称。
     * @return dstTb
     */
    public String getDstTb() {
        return dstTb;
    }

    public void setDstTb(String dstTb) {
        this.dstTb = dstTb;
    }

    public FlowCompareData withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度，1-100。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowCompareData that = (FlowCompareData) obj;
        return Objects.equals(this.srcDb, that.srcDb) && Objects.equals(this.srcTb, that.srcTb)
            && Objects.equals(this.dstDb, that.dstDb) && Objects.equals(this.dstTb, that.dstTb)
            && Objects.equals(this.progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcDb, srcTb, dstDb, dstTb, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowCompareData {\n");
        sb.append("    srcDb: ").append(toIndentedString(srcDb)).append("\n");
        sb.append("    srcTb: ").append(toIndentedString(srcTb)).append("\n");
        sb.append("    dstDb: ").append(toIndentedString(dstDb)).append("\n");
        sb.append("    dstTb: ").append(toIndentedString(dstTb)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
