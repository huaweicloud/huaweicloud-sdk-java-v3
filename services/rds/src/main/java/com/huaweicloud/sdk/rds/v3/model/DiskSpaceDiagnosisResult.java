package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 诊断结果
 */
public class DiskSpaceDiagnosisResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect")

    private Integer affect;

    public DiskSpaceDiagnosisResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**：  诊断项编码。  **约束限制**：  不涉及。  **取值范围**：  - 1001（慢查询using filesort产生临时文件） - 1002（慢查询using temporary产生临时文件） - 1003（大事务产生binlog临时文件） - 1004（未使用ROW_FORMAT创建临时表） - 1005（使用ROW_FORMAT创建临时表） - 1006（Online DDL创建临时文件） - 1007（DDL产生临时日志） - 2001（长事务产生undo文件） - 2002（慢日志） - 2003（审计日志） - 2004（binlog） - 2005（relaylog） - 3001（数据文件） - 4001（执行时间长） - 4002（临时表类） - 4003（排序类） - 4004（DDL类）  **默认取值**：  不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DiskSpaceDiagnosisResult withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**：  诊断详情。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public DiskSpaceDiagnosisResult withAffect(Integer affect) {
        this.affect = affect;
        return this;
    }

    /**
     * **参数解释**：  用户查询时间内的磁盘容量是否受该诊断项影响，1代表是，0代表否。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return affect
     */
    public Integer getAffect() {
        return affect;
    }

    public void setAffect(Integer affect) {
        this.affect = affect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskSpaceDiagnosisResult that = (DiskSpaceDiagnosisResult) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.affect, that.affect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, affect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskSpaceDiagnosisResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    affect: ").append(toIndentedString(affect)).append("\n");
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
