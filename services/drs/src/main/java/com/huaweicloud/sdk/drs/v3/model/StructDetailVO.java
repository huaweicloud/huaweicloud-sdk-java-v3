package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 灾备初始化对象详情信息体
 */
public class StructDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    @JacksonXmlProperty(localName = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_DB")

    @JacksonXmlProperty(localName = "src_DB")

    private String srcDB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_TB")

    @JacksonXmlProperty(localName = "src_TB")

    private String srcTB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_DB")

    @JacksonXmlProperty(localName = "dst_DB")

    private String dstDB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_TB")

    @JacksonXmlProperty(localName = "dst_TB")

    private String dstTB;

    public StructDetailVO withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public StructDetailVO withSrcDB(String srcDB) {
        this.srcDB = srcDB;
        return this;
    }

    /**
     * 源数据库名称
     * @return srcDB
     */
    public String getSrcDB() {
        return srcDB;
    }

    public void setSrcDB(String srcDB) {
        this.srcDB = srcDB;
    }

    public StructDetailVO withSrcTB(String srcTB) {
        this.srcTB = srcTB;
        return this;
    }

    /**
     * 源对象名称
     * @return srcTB
     */
    public String getSrcTB() {
        return srcTB;
    }

    public void setSrcTB(String srcTB) {
        this.srcTB = srcTB;
    }

    public StructDetailVO withDstDB(String dstDB) {
        this.dstDB = dstDB;
        return this;
    }

    /**
     * 目标数据库名称
     * @return dstDB
     */
    public String getDstDB() {
        return dstDB;
    }

    public void setDstDB(String dstDB) {
        this.dstDB = dstDB;
    }

    public StructDetailVO withDstTB(String dstTB) {
        this.dstTB = dstTB;
        return this;
    }

    /**
     * 目标对象名称
     * @return dstTB
     */
    public String getDstTB() {
        return dstTB;
    }

    public void setDstTB(String dstTB) {
        this.dstTB = dstTB;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructDetailVO structDetailVO = (StructDetailVO) o;
        return Objects.equals(this.progress, structDetailVO.progress)
            && Objects.equals(this.srcDB, structDetailVO.srcDB) && Objects.equals(this.srcTB, structDetailVO.srcTB)
            && Objects.equals(this.dstDB, structDetailVO.dstDB) && Objects.equals(this.dstTB, structDetailVO.dstTB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, srcDB, srcTB, dstDB, dstTB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructDetailVO {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    srcDB: ").append(toIndentedString(srcDB)).append("\n");
        sb.append("    srcTB: ").append(toIndentedString(srcTB)).append("\n");
        sb.append("    dstDB: ").append(toIndentedString(dstDB)).append("\n");
        sb.append("    dstTB: ").append(toIndentedString(dstTB)).append("\n");
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
