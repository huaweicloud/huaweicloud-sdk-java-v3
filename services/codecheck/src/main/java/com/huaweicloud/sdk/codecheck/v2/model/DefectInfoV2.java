package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 缺陷信息 */
public class DefectInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_id")

    private String defectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_checker_name")

    private String defectCheckerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_status")

    private String defectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_number")

    private String lineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_content")

    private String defectContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_level")

    private String defectLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fragment")

    private List<DefectFragmentV2> fragment = null;

    public DefectInfoV2 withDefectId(String defectId) {
        this.defectId = defectId;
        return this;
    }

    /** 缺陷的id
     * 
     * @return defectId */
    public String getDefectId() {
        return defectId;
    }

    public void setDefectId(String defectId) {
        this.defectId = defectId;
    }

    public DefectInfoV2 withDefectCheckerName(String defectCheckerName) {
        this.defectCheckerName = defectCheckerName;
        return this;
    }

    /** 缺陷对应检查项的名称
     * 
     * @return defectCheckerName */
    public String getDefectCheckerName() {
        return defectCheckerName;
    }

    public void setDefectCheckerName(String defectCheckerName) {
        this.defectCheckerName = defectCheckerName;
    }

    public DefectInfoV2 withDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
        return this;
    }

    /** 缺陷的状态0为解决 1已解决 2已忽略
     * 
     * @return defectStatus */
    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public DefectInfoV2 withLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /** 缺陷所在文件行号
     * 
     * @return lineNumber */
    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public DefectInfoV2 withDefectContent(String defectContent) {
        this.defectContent = defectContent;
        return this;
    }

    /** 缺陷描述
     * 
     * @return defectContent */
    public String getDefectContent() {
        return defectContent;
    }

    public void setDefectContent(String defectContent) {
        this.defectContent = defectContent;
    }

    public DefectInfoV2 withDefectLevel(String defectLevel) {
        this.defectLevel = defectLevel;
        return this;
    }

    /** 缺陷等级，0致命，1严重，2一般，3提示
     * 
     * @return defectLevel */
    public String getDefectLevel() {
        return defectLevel;
    }

    public void setDefectLevel(String defectLevel) {
        this.defectLevel = defectLevel;
    }

    public DefectInfoV2 withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /** 缺陷文件路径
     * 
     * @return filePath */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DefectInfoV2 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DefectInfoV2 withFragment(List<DefectFragmentV2> fragment) {
        this.fragment = fragment;
        return this;
    }

    public DefectInfoV2 addFragmentItem(DefectFragmentV2 fragmentItem) {
        if (this.fragment == null) {
            this.fragment = new ArrayList<>();
        }
        this.fragment.add(fragmentItem);
        return this;
    }

    public DefectInfoV2 withFragment(Consumer<List<DefectFragmentV2>> fragmentSetter) {
        if (this.fragment == null) {
            this.fragment = new ArrayList<>();
        }
        fragmentSetter.accept(this.fragment);
        return this;
    }

    /** 缺陷代码片段详情
     * 
     * @return fragment */
    public List<DefectFragmentV2> getFragment() {
        return fragment;
    }

    public void setFragment(List<DefectFragmentV2> fragment) {
        this.fragment = fragment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefectInfoV2 defectInfoV2 = (DefectInfoV2) o;
        return Objects.equals(this.defectId, defectInfoV2.defectId)
            && Objects.equals(this.defectCheckerName, defectInfoV2.defectCheckerName)
            && Objects.equals(this.defectStatus, defectInfoV2.defectStatus)
            && Objects.equals(this.lineNumber, defectInfoV2.lineNumber)
            && Objects.equals(this.defectContent, defectInfoV2.defectContent)
            && Objects.equals(this.defectLevel, defectInfoV2.defectLevel)
            && Objects.equals(this.filePath, defectInfoV2.filePath)
            && Objects.equals(this.createdAt, defectInfoV2.createdAt)
            && Objects.equals(this.fragment, defectInfoV2.fragment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defectId,
            defectCheckerName,
            defectStatus,
            lineNumber,
            defectContent,
            defectLevel,
            filePath,
            createdAt,
            fragment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefectInfoV2 {\n");
        sb.append("    defectId: ").append(toIndentedString(defectId)).append("\n");
        sb.append("    defectCheckerName: ").append(toIndentedString(defectCheckerName)).append("\n");
        sb.append("    defectStatus: ").append(toIndentedString(defectStatus)).append("\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    defectContent: ").append(toIndentedString(defectContent)).append("\n");
        sb.append("    defectLevel: ").append(toIndentedString(defectLevel)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
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
