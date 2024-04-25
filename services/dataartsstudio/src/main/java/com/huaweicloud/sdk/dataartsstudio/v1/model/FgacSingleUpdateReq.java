package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FgacSingleUpdateReq
 */
public class FgacSingleUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_flag")

    private Boolean fgacFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_type")

    private String fgacType;

    public FgacSingleUpdateReq withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public FgacSingleUpdateReq withFgacFlag(Boolean fgacFlag) {
        this.fgacFlag = fgacFlag;
        return this;
    }

    /**
     * 是否开启细粒度认证,true表示开启细粒度认证,false表示关闭细粒度认证。
     * @return fgacFlag
     */
    public Boolean getFgacFlag() {
        return fgacFlag;
    }

    public void setFgacFlag(Boolean fgacFlag) {
        this.fgacFlag = fgacFlag;
    }

    public FgacSingleUpdateReq withFgacType(String fgacType) {
        this.fgacType = fgacType;
        return this;
    }

    /**
     * 细粒度认证类型，开启细粒度认证时才生效。\"0\"表示开发态细粒度认证，支持数据开发细粒度脚本运行、作业测试运行，\"1\"表示调度态细粒度认证，支持数据开发细粒度脚本运行、作业测试运行、作业执行调度。
     * @return fgacType
     */
    public String getFgacType() {
        return fgacType;
    }

    public void setFgacType(String fgacType) {
        this.fgacType = fgacType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FgacSingleUpdateReq that = (FgacSingleUpdateReq) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.fgacFlag, that.fgacFlag)
            && Objects.equals(this.fgacType, that.fgacType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId, fgacFlag, fgacType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FgacSingleUpdateReq {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    fgacFlag: ").append(toIndentedString(fgacFlag)).append("\n");
        sb.append("    fgacType: ").append(toIndentedString(fgacType)).append("\n");
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
